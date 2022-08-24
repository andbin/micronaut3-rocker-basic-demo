/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.controller;

import dev.andbin.micronaut.demo.model.AppInfo;
import dev.andbin.micronaut.demo.service.AppInfoService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.rocker.RockerWritable;
import jakarta.inject.Inject;
import views.home;   // refers to target/generated-sources/rocker/views/home.java

@Controller("/")
public class HomeController {
    @Inject
    AppInfoService appInfoService;

    @Get
    @Produces(MediaType.TEXT_HTML)
    public HttpResponse<?> getHome() {
        AppInfo appInfo = appInfoService.getAppInfo();
        return HttpResponse.ok(new RockerWritable(home.template(appInfo)));
    }
}

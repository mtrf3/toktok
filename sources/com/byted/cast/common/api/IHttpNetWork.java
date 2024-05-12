package com.byted.cast.common.api;

import java.util.Map;

/* loaded from: classes29.dex */
public interface IHttpNetWork {
    Response doGet(String str, Map<String, String> map);

    Response doPost(String str, String str2, Map<String, String> map);
}

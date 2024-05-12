package com.ss.android.ugc.effectmanager.common.listener;

import java.io.InputStream;

/* loaded from: classes16.dex */
public interface IJsonConverter {
    <T> T convertJsonToObj(InputStream inputStream, Class<T> cls);

    <T> String convertObjToJson(T t);
}

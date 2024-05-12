package com.bytedance.router.autowire;

import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public interface ISerializationService {
    String object2Json(Object obj);

    <T> T parseObject(String str, Type type);
}

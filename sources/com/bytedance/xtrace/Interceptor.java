package com.bytedance.xtrace;

import java.lang.reflect.Member;

/* loaded from: classes14.dex */
public interface Interceptor {
    boolean intercept(Member member, Object obj, Object[] objArr);
}

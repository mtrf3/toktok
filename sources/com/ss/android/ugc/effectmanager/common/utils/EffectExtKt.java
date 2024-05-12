package com.ss.android.ugc.effectmanager.common.utils;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class EffectExtKt {
    public static final String expectedMd5(Effect expectedMd5) {
        o.LJIIJ(expectedMd5, "$this$expectedMd5");
        UrlModel fileUrl = expectedMd5.getFileUrl();
        if (fileUrl != null) {
            return fileUrl.getUri();
        }
        return null;
    }
}

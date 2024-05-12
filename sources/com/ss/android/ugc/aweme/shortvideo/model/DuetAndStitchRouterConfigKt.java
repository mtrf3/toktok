package com.ss.android.ugc.aweme.shortvideo.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetAndStitchRouterConfigKt {
    public static final void mobIsEcommerce(DuetAndStitchRouterConfig duetAndStitchRouterConfig, InterfaceC88472Yns<? super String, C76800UCe> block) {
        String str;
        o.LJIIIZ(block, "block");
        if (duetAndStitchRouterConfig != null) {
            if (duetAndStitchRouterConfig.isEcommerce) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            block.invoke(str);
        }
    }
}

package com.ss.android.ugc.aweme.challenge.ui;

import X.C16880lQ;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes9.dex */
public final class p0 {
    public static void LIZ(String str, a.c cVar, FixedRatioFrameLayout fixedRatioFrameLayout, ViewGroup.LayoutParams layoutParams) {
        String LJ = q8.a.LJ(str);
        if (o.LJ(LJ, "frMode")) {
            String str2 = cVar.LIZ;
            o.LJIIIIZZ(str2, "value.value");
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            fixedRatioFrameLayout.setMode(!o.LJ(lowerCase, "fixed_height") ? 1 : 0);
            return;
        }
        if (o.LJ(LJ, "whRatio")) {
            String str3 = cVar.LIZ;
            o.LJIIIIZZ(str3, "value.value");
            fixedRatioFrameLayout.setWhRatio(CastFloatProtector.parseFloat(str3));
            return;
        }
        q8.a.LJFF(fixedRatioFrameLayout.getContext(), C16880lQ.LJLLJ(p0.class), str);
        throw null;
    }
}

package com.ss.android.ugc.aweme.core;

import X.AV1;
import X.C32151Nz;
import X.C56378MAs;
import X.C7MY;
import X.EnumC86195XsF;
import X.MCJ;
import X.MCK;
import X.MCQ;
import X.O6R;
import X.X1D;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS14S0500000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SmallAppWidgetProvider extends MCJ {
    @Override // X.MCF
    public final int LJFF() {
        return R.layout.hd;
    }

    @Override // X.MCF
    public final int LJI() {
        return R.layout.hh;
    }

    @Override // X.MCF
    public final int LJII() {
        return 0;
    }

    @Override // X.MCF
    public final String LJIIIIZZ() {
        return "now_s";
    }

    @Override // X.MCJ
    public final int[] LJIILIIL() {
        return new int[]{O6R.LJJIIZ(C32151Nz.LJIIZILJ(132)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(132))};
    }

    @Override // X.MCF
    public final MCQ LJ(MCK mck) {
        int i;
        int LIZIZ = C7MY.LIZIZ(30);
        int LIZIZ2 = C7MY.LIZIZ(1);
        if (mck.LJ) {
            i = 3;
        } else {
            i = 4;
        }
        return new MCQ(LIZIZ, LIZIZ2, (Integer) null, i, 0.0f, 0.0f, 0, 0, (Boolean) null, (EnumC86195XsF) null, false, 4084);
    }

    @Override // X.MCF
    public final boolean LJIIIZ(Context context, AppWidgetManager appWidgetManager, int[] iArr, MCK mck) {
        o.LJIIIZ(context, "context");
        if (AV1.LJIILLIIL()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("now_s");
        LIZ.append(" trying to set to trending");
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
        return C56378MAs.LIZLLL(context, 1, Integer.valueOf(R.layout.hi), null, Float.valueOf(0.0f), iArr, "hashtag_s", new int[]{C7MY.LIZIZ(62), C7MY.LIZIZ(62)}, null, new AqS14S0500000_9(this, context, mck, appWidgetManager, iArr, 0), null, 1024);
    }
}

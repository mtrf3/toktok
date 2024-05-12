package X;

import android.content.Context;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import kotlin.jvm.internal.o;

/* renamed from: X.LNv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54171LNv {
    public static void LIZ(Context context) {
        Rect rect;
        o.LJIIIZ(context, "context");
        boolean LIZJ = C26338AVi.LIZJ(context);
        AbsTabScrollProfileStrategy.LJLJI = LIZJ;
        if (LIZJ) {
            rect = new Rect(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(76)), C63081OpJ.LJJJJJL(context));
        } else {
            rect = new Rect(C63081OpJ.LJJJJL(context) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(76)), 0, C63081OpJ.LJJJJL(context), C63081OpJ.LJJJJJL(context));
        }
        AbsTabScrollProfileStrategy.LJLJJI.set(rect);
    }
}

package X;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.6D8, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6D8 {
    public static float LIZ(float f, float f2, float f3, float f4) {
        return ((f * f2) / f3) + f4;
    }

    public static boolean LIZLLL() {
        return AccountService.LJIJ().LJFF().isChildrenMode();
    }

    public static Paint LIZIZ(boolean z) {
        Paint paint = new Paint();
        paint.setAntiAlias(z);
        return paint;
    }

    public static View LIZJ(LayoutInflater layoutInflater, String str, ViewGroup viewGroup, String str2, LayoutInflater layoutInflater2, int i, ViewGroup viewGroup2, boolean z, String str3) {
        o.LJIIIZ(layoutInflater, str);
        o.LJIIIZ(viewGroup, str2);
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater2, i, viewGroup2, z);
        o.LJII(LLLLIILL, str3);
        return LLLLIILL;
    }
}

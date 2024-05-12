package defpackage;

import X.FFL;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import o7a.m;
import p8.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 {
    public static a.c LIZJ(TuxTextView tuxTextView, int i, String str) {
        tuxTextView.setGravity(i);
        new m();
        return new a.c(str);
    }

    public static Boolean LIZIZ(int i, String str, boolean z, boolean z2) {
        FFL.LJIIIZ().getClass();
        return Boolean.valueOf(FFL.LJ(i, str, z, z2));
    }

    public static boolean LIZLLL(String str, String str2, Keva keva, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        return keva.getBoolean(X1D.LIZIZ(LIZ), z);
    }

    public static SmartRoute LIZ(Context context, String str, String str2, String str3, String str4, String str5) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        buildRoute.withParam(str2, str3);
        buildRoute.withParam(str4, str5);
        return buildRoute;
    }
}

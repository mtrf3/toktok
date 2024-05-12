package X;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

/* renamed from: X.Ngf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59997Ngf {
    public static final C59390NSo LIZ = new C59390NSo();

    public static void LIZ(Context context) {
        C59390NSo c59390NSo = LIZ;
        Context LLLLL = C16880lQ.LLLLL(context);
        C38891fp.LJFF(LLLLL, "Application Context cannot be null");
        if (!c59390NSo.LIZ) {
            c59390NSo.LIZ = true;
            C59998Ngg LIZ2 = C59998Ngg.LIZ();
            LIZ2.LIZJ.getClass();
            UCH uch = new UCH();
            C39557Ffl c39557Ffl = LIZ2.LIZIZ;
            Handler handler = new Handler();
            c39557Ffl.getClass();
            LIZ2.LIZLLL = new C60013Ngv(handler, LLLLL, uch, LIZ2);
            C60018Nh0.LJFF.LIZ = C16880lQ.LLLLL(LLLLL);
            C60031NhD.LIZJ = LLLLL.getResources().getDisplayMetrics().density;
            C60031NhD.LIZ = (WindowManager) C16880lQ.LLILL(LLLLL, "window");
            C59999Ngh.LIZIZ.LIZ = C16880lQ.LLLLL(LLLLL);
        }
    }
}

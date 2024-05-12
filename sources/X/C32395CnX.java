package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;

/* renamed from: X.CnX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32395CnX {
    public static C32407Cnj LIZ;
    public static C32401Cnd LIZIZ;
    public static C32398Cna LIZJ;
    public static C32412Cno LIZLLL;
    public static C32400Cnc LJ;
    public static C32343Cmh LJFF;
    public static C32396CnY LJI;
    public static C32398Cna LJII;
    public static C32401Cnd LJIIIIZZ;
    public static C32407Cnj LJIIIZ;
    public static final Handler LJIIJ;

    static {
        if (!HandlerThreadOptSetting.INSTANCE.enable()) {
            HandlerThread handlerThread = new HandlerThread("gift_resource_manager_thread");
            handlerThread.start();
            LJIIJ = new Handler(handlerThread.getLooper());
        }
    }

    public static C32407Cnj LIZ() {
        if (LJFF == null) {
            LJFF = new C32343Cmh();
        }
        C32343Cmh c32343Cmh = LJFF;
        if (LJII == null) {
            LJII = new C32398Cna(c32343Cmh, LJIIJ);
        }
        C32398Cna c32398Cna = LJII;
        if (LJIIIIZZ == null) {
            LJIIIIZZ = new C32401Cnd(c32398Cna);
        }
        C32401Cnd c32401Cnd = LJIIIIZZ;
        if (LJIIIZ == null) {
            LJIIIZ = new C32407Cnj(c32401Cnd, LJIIJ);
        }
        return LJIIIZ;
    }

    public static C32396CnY LIZIZ() {
        if (LIZLLL == null) {
            LIZLLL = new C32412Cno(LJIIJ);
        }
        C32412Cno c32412Cno = LIZLLL;
        if (LJ == null) {
            LJ = new C32400Cnc(c32412Cno);
        }
        C32400Cnc c32400Cnc = LJ;
        if (LIZJ == null) {
            LIZJ = new C32398Cna(c32400Cnc, LJIIJ);
        }
        C32398Cna c32398Cna = LIZJ;
        if (LIZIZ == null) {
            LIZIZ = new C32401Cnd(c32398Cna);
        }
        C32401Cnd c32401Cnd = LIZIZ;
        if (LIZ == null) {
            LIZ = new C32407Cnj(c32401Cnd, LJIIJ);
        }
        C32407Cnj c32407Cnj = LIZ;
        if (LJI == null) {
            LJI = new C32396CnY(c32407Cnj);
        }
        return LJI;
    }
}

package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* renamed from: X.Bxb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30471Bxb implements InterfaceC12690ef {
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJI;
    public static int LJII;
    public static View LJIIIIZZ;
    public static InterfaceC21020s6 LJIIIZ;
    public static final C30471Bxb LIZ = new C30471Bxb();
    public static boolean LJFF = true;

    public static final void LIZ() {
        int i;
        int i2;
        int i3;
        LiveCore liveCore;
        LiveCore.Builder builder;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        View view = LJIIIIZZ;
        int i4 = 0;
        if (view != null) {
            i = view.getWidth();
        } else {
            i = 0;
        }
        LIZLLL = i;
        View view2 = LJIIIIZZ;
        if (view2 != null) {
            i4 = view2.getHeight();
        }
        LJ = i4;
        float f = LIZLLL / i4;
        InterfaceC21020s6 interfaceC21020s6 = LJIIIZ;
        if (interfaceC21020s6 != null && (liveCore2 = interfaceC21020s6.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
            i2 = builder2.getCaptureAdaptedWidth();
        } else {
            i2 = 720;
        }
        InterfaceC21020s6 interfaceC21020s62 = LJIIIZ;
        if (interfaceC21020s62 != null && (liveCore = interfaceC21020s62.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
            i3 = builder.getCaptureAdaptedHeight();
        } else {
            i3 = 1280;
        }
        float f2 = i2 / i3;
        if (f > f2) {
            int i5 = LIZLLL;
            LIZIZ = i5;
            LIZJ = (int) (i5 / f2);
        } else {
            int i6 = LJ;
            LIZJ = i6;
            LIZIZ = (int) (i6 * f2);
        }
        Rect rect = new Rect();
        View view3 = LJIIIIZZ;
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        LJI = rect.left - ((LIZIZ - LIZLLL) / 2);
        LJII = (rect.top - (LIZJ - LJ)) - ((int) ((LJ / C15380j0.LJIIJJI()) * C15380j0.LJIILIIL()));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("surfaceWidth:");
        C15890jp.LIZIZ(LIZ2, LIZLLL, ",videoWidth:", i2, ",realWidth:");
        LIZ2.append(LIZIZ);
        LIZ2.append(",surfaceHeight:");
        C15890jp.LIZIZ(LIZ2, LJ, ",videoHeight:", i3, ",realHeight:");
        C1DD.LJFF(LIZ2, LIZJ, LIZ2, "LiveGoalEffect");
    }
}

package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.6YR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YR {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        if (C41877Gc5.LIZ.LIZIZ()) {
            return "background";
        }
        Activity LIZ2 = C42470Gle.LIZ();
        if (LIZ2 != null) {
            return LIZ2.toString();
        }
        return null;
    }

    public static void LIZIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZJ()) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("AVSecurityMobHelper onOpenMic creationId: ", creationId, " currentPage ");
        LIZIZ.append(LIZ());
        H78.LJI(X1D.LIZIZ(LIZIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", LIZ());
        FMX.LJIIL("tool_mic_open", c145995oB.LIZ);
    }

    public static void LIZLLL(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZJ()) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("AVSecurityMobHelper onOpenMicSuccess creationId: ", creationId, " currentPage ");
        LIZIZ.append(LIZ());
        H78.LJI(X1D.LIZIZ(LIZIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", LIZ());
        FMX.LJIIL("tool_mic_open_success", c145995oB.LIZ);
    }

    public static void LJ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AVSecurityMobHelper onReleaseMic creationId: ");
        LIZ2.append(creationId);
        LIZ2.append(" currentPage ");
        LIZ2.append(LIZ());
        H78.LJI(X1D.LIZIZ(LIZ2));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", LIZ());
        FMX.LJIIL("tool_mic_release", c145995oB.LIZ);
    }

    public static void LIZJ(int i, String creationId, String str) {
        o.LJIIIZ(creationId, "creationId");
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZJ()) {
            return;
        }
        StringBuilder LJ = AnonymousClass028.LJ("AVSecurityMobHelper onOpenMicFailed creationId: ", creationId, " errCode: ", i, " msg: ");
        LJ.append(str);
        LJ.append(" currentPage ");
        LJ.append(LIZ());
        H78.LJI(X1D.LIZIZ(LJ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("msg", str);
        c145995oB.LJI("page", LIZ());
        FMX.LJIIL("tool_mic_open_fail", c145995oB.LIZ);
    }
}

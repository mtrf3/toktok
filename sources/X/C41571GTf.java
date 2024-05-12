package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.b1;
import kotlin.jvm.internal.AqS74S1100000_7;

/* renamed from: X.GTf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41571GTf {
    public static final boolean LIZ = IJM.LIZ();
    public static final long LIZIZ = C00F.LIZ(31744, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "edit_page_pre_publish_start_delay", true);
    public static NLENode LIZJ;
    public static volatile String LIZLLL;
    public static volatile boolean LJ;

    public static final synchronized boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        synchronized (C41571GTf.class) {
            if (!LIZ || videoPublishEditModel == null) {
                return false;
            }
            if (videoPublishEditModel.getEditPagePrePublishId() != null) {
                if (GUH.LJI != null) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final void LJFF(String str) {
        C1JX.LJIIIIZZ("EditPagePrePublishTAG ", str);
    }

    public static void LJI(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TryStart Failed, Reason:");
        LIZ2.append(str);
        LJFF(X1D.LIZIZ(LIZ2));
        LJ = false;
        LJIIIZ("fail", str);
    }

    public static void LJIIJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("publishId from:");
        LIZ2.append(LIZLLL);
        LIZ2.append(" to:");
        LIZ2.append(str);
        LJFF(X1D.LIZIZ(LIZ2));
        LIZLLL = str;
    }

    public static void LIZ(String str, AqS74S1100000_7 aqS74S1100000_7) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" start");
        LJFF(X1D.LIZIZ(LIZ2));
        long currentTimeMillis = System.currentTimeMillis();
        aqS74S1100000_7.invoke();
        StringBuilder LIZJ2 = b1.LIZJ(str, " end dur:");
        LIZJ2.append(System.currentTimeMillis() - currentTimeMillis);
        LJFF(X1D.LIZIZ(LIZJ2));
    }

    public static final synchronized void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        synchronized (C41571GTf.class) {
            if (!LIZ) {
                LJII("fail", "ab close");
                return;
            }
            LJ = false;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cancelEditPagePrePublish_");
            LIZ2.append(str);
            LIZ(X1D.LIZIZ(LIZ2), new AqS74S1100000_7(videoPublishEditModel, str, 20));
            if (str == null) {
                str = "cancelDetail is null";
            }
            LJII("success", str);
        }
    }

    public static String LIZLLL(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel) {
        if (interfaceC153045zY != null) {
            try {
                interfaceC153045zY.LLFII();
                SynthetiseResult synthetiseResult = new SynthetiseResult();
                String str = LIZLLL;
                if (str == null) {
                    str = "";
                }
                int LLJILJILJ = interfaceC153045zY.LLJILJILJ(C44546He2.LIZJ(videoPublishEditModel, synthetiseResult, null, interfaceC153045zY, str));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ve_judge remuxErrorCode:");
                LIZ2.append(LLJILJILJ);
                LJFF(X1D.LIZIZ(LIZ2));
                if (LLJILJILJ != 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("ve_judge_");
                    LIZ3.append(Math.abs(LLJILJILJ));
                    return X1D.LIZIZ(LIZ3);
                }
            } catch (Throwable unused) {
                return "ve_init_failed";
            }
        }
        return null;
    }

    public static void LJII(String str, String str2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZIZ()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "cancel_publish");
        c145995oB.LJI("status", str);
        c145995oB.LJI("msg", str2);
        FMX.LJIIL("tool_performance_edit_pre_publish", c145995oB.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZIZ()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "go_publish_page");
        c145995oB.LJI("status", str);
        c145995oB.LJI("msg", str2);
        FMX.LJIIL("tool_performance_edit_pre_publish", c145995oB.LIZ);
    }

    public static void LJIIIZ(String str, String str2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZIZ()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "start_publish");
        c145995oB.LJI("status", str);
        c145995oB.LJI("msg", str2);
        FMX.LJIIL("tool_performance_edit_pre_publish", c145995oB.LIZ);
    }

    public static void LIZJ(Activity activity, Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        LJFF("TryStart Success");
        LJ = false;
        LJFF("innerStartPrePublish");
        LJIIJ(GUH.LJJIII(bundle));
        videoPublishEditModel.setEditPagePrePublishId(LIZLLL);
    }
}

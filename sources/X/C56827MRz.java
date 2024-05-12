package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.MRz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56827MRz {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        LIZ = 3;
        LIZIZ = 15;
        LIZJ = 60;
        try {
            LIZ = ((Number) GuideOutPushExperiment.LJII.getValue()).intValue();
            LIZIZ = ((Number) GuideOutPushExperiment.LJFF.getValue()).intValue();
            LIZJ = ((Number) GuideOutPushExperiment.LJI.getValue()).intValue();
        } catch (Exception unused) {
            LIZ = 3;
            LIZIZ = 15;
            LIZJ = 60;
        }
    }

    public static long LIZ(Context context) {
        if (GuideOutPushExperiment.LIZJ()) {
            o.LJIIIZ(context, "context");
            return C38776FJs.LJIIL().LIZIZ(context, "key_times_push_notification_guide");
        }
        return C38776FJs.LJIIL().LIZIZ(context, "key_times_guide_out_push_dialog");
    }

    public static void LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        if (GuideOutPushExperiment.LIZJ()) {
            C38776FJs.LJIIL().LJIIIZ(context, "key_cross_push_notification_guide", currentTimeMillis);
        } else {
            C38776FJs.LJIIL().LJIIIZ(context, "key_cross_guide_out_push_dialog", currentTimeMillis);
        }
        long LIZ2 = LIZ(context) + 1;
        if (GuideOutPushExperiment.LIZJ()) {
            C38776FJs.LJIIL().LJIIIZ(context, "key_times_push_notification_guide", LIZ2);
        } else {
            C38776FJs.LJIIL().LJIIIZ(context, "key_times_guide_out_push_dialog", LIZ2);
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        if (curUser.getFriendCount() > 0 && GuideOutPushExperiment.LIZIZ()) {
            SharedPreferences LIZLLL = C38776FJs.LJIIL().LIZLLL(context);
            int i = 0;
            if (LIZLLL != null) {
                i = LIZLLL.getInt("key_feature12_show_count", 0);
            }
            C38776FJs.LJIIL().LJIIIIZZ(context, "key_feature12_show_count", i + 1);
        }
    }

    public static boolean LIZJ(Context context) {
        long LIZIZ2;
        o.LJIIIZ(context, "context");
        if (!((Boolean) GuideOutPushExperiment.LIZLLL.getValue()).booleanValue()) {
            return true;
        }
        if (GuideOutPushExperiment.LIZJ()) {
            LIZIZ2 = C38776FJs.LJIIL().LIZIZ(context, "key_cross_push_notification_guide");
        } else {
            LIZIZ2 = C38776FJs.LJIIL().LIZIZ(context, "key_cross_guide_out_push_dialog");
        }
        if (LIZ(context) < LIZ) {
            if (System.currentTimeMillis() - LIZIZ2 > LIZIZ * 86400000) {
                return true;
            }
            return false;
        }
        if (System.currentTimeMillis() - LIZIZ2 > LIZJ * 86400000) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, X.MPP] */
    public static Class LJFF(Context context, GuideOutPushParam guideOutPushParam, MS3 ms3) {
        boolean z;
        o.LJIIIZ(context, "context");
        C68322mC c68322mC = new C68322mC();
        if (C97843si.LIZ()) {
            if (o.LJ(guideOutPushParam.trigger, "notification")) {
                if (!C97653sP.LIZ() || !LIZJ(context)) {
                    return null;
                }
                c68322mC.element = new MPP();
            }
        } else if (!LIZJ(context)) {
            return null;
        }
        C68322mC c68322mC2 = new C68322mC();
        if (!C40322Fs6.LIZJ(context) || (C97843si.LIZ() && o.LJ(guideOutPushParam.trigger, "dm"))) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "userService().curUser");
            int i = 0;
            if (GuideOutPushExperiment.LIZIZ() && curUser.getFriendCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str = "normal";
            if (z) {
                SharedPreferences LIZLLL = C38776FJs.LJIIL().LIZLLL(context);
                if (LIZLLL != null) {
                    i = LIZLLL.getInt("key_feature12_show_count", 0);
                }
                if (i % 2 != 0) {
                    str = "friends";
                }
                guideOutPushParam.panelType = str;
                c68322mC2.element = LJ(context, new ViewOnClickListenerC57173McD(context, guideOutPushParam), ms3, (MS4) c68322mC.element);
            } else if (((Boolean) GuideOutPushExperiment.LJIIIIZZ.getValue()).booleanValue()) {
                guideOutPushParam.panelType = "normal";
                c68322mC2.element = LJ(context, new ViewOnClickListenerC57173McD(context, guideOutPushParam), ms3, (MS4) c68322mC.element);
            }
        } else if (((Boolean) GuideOutPushExperiment.LJIIJ.getValue()).booleanValue()) {
            PushSettings LJ = C85940Xo8.LIZIZ.LJ();
            if (LJ == null) {
                C10K.LIZJ(MS2.LJLIL).LJ(new MS1(c68322mC2, context, guideOutPushParam, ms3, c68322mC), C10K.LJIIIIZZ, null);
            } else {
                c68322mC2.element = LIZLLL(context, guideOutPushParam, LJ, ms3, (MS4) c68322mC.element);
            }
        }
        return (Class) c68322mC2.element;
    }

    public static Class LJ(Context context, ViewOnClickListenerC57173McD viewOnClickListenerC57173McD, MS3 ms3, MS4 ms4) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (!PopupManager.LJFF() && LJJIFFI != null) {
            PopupManager.LJIIL(new MS0(LJJIFFI, viewOnClickListenerC57173McD, ms3, ms4));
            return MS0.class;
        }
        return null;
    }

    public static Class LIZLLL(Context context, GuideOutPushParam guideOutPushParam, PushSettings pushSettings, MS3 ms3, MS4 ms4) {
        if (pushSettings.diggPush == 0 || pushSettings.commentPush == 0 || pushSettings.followPush == 0 || pushSettings.mentionPush == 0) {
            guideOutPushParam.getClass();
            guideOutPushParam.panelType = "toggle";
            return LJ(context, new ViewOnClickListenerC57173McD(context, guideOutPushParam), ms3, ms4);
        }
        return null;
    }
}

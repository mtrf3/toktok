package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18210nZ {
    public static C29702BlC LIZ(String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C29702BlC LIZJ = C18230nb.LIZJ(str);
        if (throwable instanceof CH1) {
            CH1 ch1 = (CH1) throwable;
            LIZJ.LIZLLL("url", ch1.getUrl());
            LIZJ.LIZ(Integer.valueOf(ch1.getErrorCode()), "error_code");
            LIZJ.LIZLLL("error_msg", ch1.getErrorMsg());
            LIZJ.LIZLLL("error_alert", ch1.getAlert());
            LIZJ.LIZLLL("error_prompt", ch1.getPrompt());
        } else if (throwable instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) throwable;
            LIZJ.LIZ(Integer.valueOf(c29401Dk.getErrorCode()), "error_code");
            LIZJ.LIZLLL("error_msg", c29401Dk.getErrorMsg());
            LIZJ.LIZLLL("error_alert", c29401Dk.getAlert());
            LIZJ.LIZLLL("error_prompt", c29401Dk.getPrompt());
        } else if (throwable instanceof C39681h6) {
            LIZJ.LIZ(1, "error_code");
            LIZJ.LIZLLL("error_msg", throwable.getMessage());
        } else {
            C0NB.LJI("LiveBroadcastBusinessLog", throwable);
            LIZJ.LIZ(1, "error_code");
            LIZJ.LIZLLL("error_msg", throwable.getMessage());
        }
        return LIZJ;
    }

    public static C29702BlC LIZIZ(String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C29702BlC LIZJ = C18230nb.LIZJ(str);
        if (throwable instanceof CH1) {
            CH1 ch1 = (CH1) throwable;
            LIZJ.LIZLLL("url", ch1.getUrl());
            LIZJ.LJFF(Integer.valueOf(ch1.getErrorCode()), "error_code");
            LIZJ.LJII("error_msg", ch1.getErrorMsg());
            LIZJ.LIZLLL("error_alert", ch1.getAlert());
            LIZJ.LIZLLL("error_prompt", ch1.getPrompt());
        } else if (throwable instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) throwable;
            LIZJ.LJFF(Integer.valueOf(c29401Dk.getErrorCode()), "error_code");
            LIZJ.LJII("error_msg", c29401Dk.getErrorMsg());
            LIZJ.LIZLLL("error_alert", c29401Dk.getAlert());
            LIZJ.LIZLLL("error_prompt", c29401Dk.getPrompt());
        } else if (throwable instanceof C39681h6) {
            LIZJ.LJFF(1, "error_code");
            LIZJ.LJII("error_msg", throwable.getMessage());
        } else {
            C0NB.LJI("LiveBroadcastBusinessLog", throwable);
            LIZJ.LJFF(1, "error_code");
            LIZJ.LJII("error_msg", throwable.getMessage());
        }
        return LIZJ;
    }
}

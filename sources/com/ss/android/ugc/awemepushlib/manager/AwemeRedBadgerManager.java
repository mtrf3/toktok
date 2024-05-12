package com.ss.android.ugc.awemepushlib.manager;

import X.C00F;
import X.C141415gn;
import X.C16880lQ;
import X.C1DG;
import X.C38354F3m;
import X.C38816FLg;
import X.C54262LRi;
import X.C54362LVe;
import X.C66873QMj;
import X.C66875QMl;
import X.C67229Qa1;
import X.C67230Qa2;
import X.EF7;
import X.FMX;
import X.FVR;
import X.FXW;
import X.FZL;
import X.QD3;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AwemeRedBadgerManager implements GenericLifecycleObserver {
    public static final AwemeRedBadgerManager LJLJI = new AwemeRedBadgerManager();
    public static String LJLJJI;
    public boolean LJLIL;
    public final FZL LJLILLLLZI = FZL.LIZJ();

    public final void LJI() {
        int i;
        int LJIIJJI = C54362LVe.LJIIJJI();
        int i2 = 0;
        if (LJIIJJI > 0) {
            i = LJIIJJI;
            if (LJIIJJI > 99) {
                i = 99;
            }
        } else {
            i = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeRedBadgerManager");
        LIZ.append(", inboxNum: ");
        LIZ.append(LJIIJJI);
        LIZ.append(", redBadgeCount: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        try {
            this.LJLILLLLZI.LIZIZ(i, EF7.LIZIZ());
            i2 = 1;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AwemeRedBadgerManager");
            LIZ2.append(" applyCountOrThrow error ");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("badge_number", i);
            jSONObject.put("success", i2);
            String str = LJLJJI;
            if (str == null) {
                str = LIZ(EF7.LIZIZ());
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("launcher_package", str);
            jSONObject.put("show_type", "client_update");
            FMX.LJIILJJIL("red_badge_client_update_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static String LIZ(Context context) {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        String str = LJLJJI;
        if (str != null) {
            return str;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            LJLJJI = "";
        } else {
            LJLJJI = activityInfo.packageName;
        }
        return LJLJJI;
    }

    public static void LIZIZ(Context context) {
        try {
            if (!C38354F3m.LJ(AppLog.getClientId()) && !C38354F3m.LJ(FVR.LIZJ())) {
                C66875QMl LIZ = C66875QMl.LIZ(context);
                String sessionKey = AppLog.getSessionKey();
                C66873QMj LIZIZ = LIZ.LIZ.LIZIZ();
                LIZIZ.LIZIZ.put("session_key", sessionKey);
                LIZIZ.LIZ();
                C66875QMl LIZ2 = C66875QMl.LIZ(context);
                String LLIIIILZ = C16880lQ.LLIIIILZ();
                C66873QMj LIZIZ2 = LIZ2.LIZ.LIZIZ();
                LIZIZ2.LIZIZ.put("rom", LLIIIILZ);
                LIZIZ2.LIZ();
            }
        } catch (Throwable unused) {
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.BACKGROUND)
    public void onNoticeCountChangedEvent(C54262LRi c54262LRi) {
        boolean LIZJ = c54262LRi.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeRedBadgerManager");
        LIZ.append(", onNoticeCountChangedEvent hasCountChange: ");
        LIZ.append(LIZJ);
        X1D.LIZIZ(LIZ);
        if (LIZJ) {
            LJI();
        }
    }

    public static boolean LJFF(Context context, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean LIZJ = C66875QMl.LIZ(context).LIZ.LIZJ("is_desktop_red_badge_show", false);
        if (jSONObject != null && jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (C00F.LIZ(31744, 0, "red_badge_local_pull_exp", true) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDesktopBadgeShow: ");
        LIZ.append(z);
        LIZ.append(", redBadgeExpShow: ");
        LIZ.append(z2);
        X1D.LIZIZ(LIZ);
        boolean z3 = z | z2;
        try {
            if (AccountService.LJIJ().LJFF().isChildrenMode()) {
                z3 = false;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setDesktopBadgeShow, isDesktopBadgeShow: ");
        LIZ2.append(z3);
        LIZ2.append(", oldShowEnable: ");
        LIZ2.append(LIZJ);
        X1D.LIZIZ(LIZ2);
        if (z3 == LIZJ) {
            return false;
        }
        C66873QMj LIZIZ = C66875QMl.LIZ(context).LIZ.LIZIZ();
        LIZIZ.LIZIZ.put("is_desktop_red_badge_show", Boolean.valueOf(z3));
        LIZIZ.LIZ();
        return true;
    }

    public final boolean LIZJ(Context context, C67230Qa2 c67230Qa2) {
        C67229Qa1 c67229Qa1;
        boolean z;
        String str;
        int i;
        boolean z2;
        try {
            c67229Qa1 = c67230Qa2.extra;
            z = true;
            str = "";
        } catch (Throwable unused) {
        }
        if (c67229Qa1 != null) {
            if (1 == c67229Qa1.redBadgeOnly && (i = c67229Qa1.badgeCount) >= 0) {
                try {
                    this.LJLILLLLZI.LIZIZ(i, context);
                    z2 = true;
                } catch (FXW e) {
                    C16880lQ.LLLLIIL(e);
                    str = Log.getStackTraceString(e);
                    z2 = false;
                }
                LIZLLL(context, z2, str, c67230Qa2);
                LJ(context, c67230Qa2.extra.badgeCount, z2, str, c67230Qa2);
                return true;
            }
            int i2 = c67229Qa1.badgeCount;
            if (i2 >= 0) {
                try {
                    this.LJLILLLLZI.LIZIZ(i2, context);
                } catch (FXW e2) {
                    C16880lQ.LLLLIIL(e2);
                    str = Log.getStackTraceString(e2);
                    z = false;
                }
                LIZLLL(context, z, str, c67230Qa2);
                LJ(context, c67230Qa2.extra.badgeCount, z, str, c67230Qa2);
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            C38816FLg.LJ(new ARunnableS47S0100000_11(this, 59));
        }
    }

    public static void LIZLLL(Context context, boolean z, String str, C67230Qa2 c67230Qa2) {
        String str2;
        Bundle LIZ = C141415gn.LIZ("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = "";
            }
            LIZ.putString("stack_info", str);
        }
        String LIZ2 = LIZ(context);
        if (LIZ2 != null) {
            str3 = LIZ2;
        }
        LIZ.putString("launcher_package", str3);
        LIZ.putLong("rule_id", c67230Qa2.id);
        C67229Qa1 c67229Qa1 = c67230Qa2.extra;
        if (c67229Qa1 != null) {
            if (1 == c67229Qa1.redBadgeOnly) {
                str2 = "receive";
            } else {
                str2 = "with_artical";
            }
            LIZ.putString("show_type", str2);
        }
        FMX.LJIIJJI("red_badge_receive", LIZ);
    }

    public static void LJ(Context context, int i, boolean z, String str, C67230Qa2 c67230Qa2) {
        String str2;
        Bundle LIZLLL = C1DG.LIZLLL("badge_number", i, "success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = "";
            }
            LIZLLL.putString("stack_info", str);
        }
        String LIZ = LIZ(context);
        if (LIZ != null) {
            str3 = LIZ;
        }
        LIZLLL.putString("launcher_package", str3);
        C67229Qa1 c67229Qa1 = c67230Qa2.extra;
        if (c67229Qa1 != null) {
            if (1 == c67229Qa1.redBadgeOnly) {
                str2 = "receive";
            } else {
                str2 = "with_artical";
            }
            LIZLLL.putString("show_type", str2);
        }
        LIZLLL.putLong("rule_id", c67230Qa2.id);
        FMX.LJIIJJI("red_badge_show", LIZLLL);
    }
}

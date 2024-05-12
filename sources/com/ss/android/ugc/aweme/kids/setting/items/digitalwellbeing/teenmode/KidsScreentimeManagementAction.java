package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode;

import X.C30591Hz;
import X.C84369X9h;
import X.XSH;
import X.XSJ;
import X.XSK;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.ContinuousTimeCalculator;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KidsScreentimeManagementAction implements IRouteAction {
    public static final XSH Companion = new XSH();

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String str2;
        try {
            String LJIILIIL = C30591Hz.LJIILIIL(str, "action");
            if (o.LJ(LJIILIIL, "set")) {
                String LJIILIIL2 = C30591Hz.LJIILIIL(str, "duration");
                o.LJIIIIZZ(LJIILIIL2, "getQueryParameter(url, \"duration\")");
                int parseInt = CastIntegerProtector.parseInt(LJIILIIL2);
                TeenageModeSetting teenageModeSetting = XSJ.LIZIZ;
                if (teenageModeSetting != null) {
                    teenageModeSetting.setTimeLockSelfInMin(parseInt);
                }
                XSJ.LIZ.LIZ(GsonProtectorUtils.toJson(new Gson(), XSJ.LIZIZ));
                if (parseInt > 0) {
                    ContinuousTimeCalculator.Companion.getClass();
                    ContinuousTimeCalculator LIZIZ = C84369X9h.LIZIZ();
                    if (LIZIZ != null) {
                        LIZIZ.resetObserver();
                    }
                    ContinuousTimeCalculator LIZIZ2 = C84369X9h.LIZIZ();
                    if (LIZIZ2 != null) {
                        LIZIZ2.startCounting();
                    }
                } else {
                    ContinuousTimeCalculator.Companion.getClass();
                    ContinuousTimeCalculator LIZIZ3 = C84369X9h.LIZIZ();
                    if (LIZIZ3 != null) {
                        LIZIZ3.resetObserver();
                    }
                }
            } else if (o.LJ(LJIILIIL, "check")) {
                String LJIILIIL3 = C30591Hz.LJIILIIL(str, "succeed");
                o.LJIIIIZZ(LJIILIIL3, "getQueryParameter(url, \"succeed\")");
                int parseInt2 = CastIntegerProtector.parseInt(LJIILIIL3);
                String LJIILIIL4 = C30591Hz.LJIILIIL(str, "biz_scene");
                o.LJIIIIZZ(LJIILIIL4, "getQueryParameter(url, \"biz_scene\")");
                int parseInt3 = CastIntegerProtector.parseInt(LJIILIIL4);
                if (parseInt2 == 1) {
                    if (parseInt3 != 1) {
                        if (parseInt3 != 2) {
                            str2 = "";
                        } else {
                            str2 = "time_lock";
                        }
                    } else {
                        str2 = "logout";
                    }
                    XSK.LIZ(str2);
                }
            }
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}

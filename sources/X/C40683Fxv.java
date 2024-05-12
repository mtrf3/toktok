package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Fxv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40683Fxv {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        String str = C64707PaR.LIZJ;
        o.LJIIIIZZ(str, "getUserRegion()");
        String upperCase = str.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String region = RegionService.LIZ().getRegion();
        if (C1DH.LJJIII()) {
            EUL.LIZ.getClass();
            if (EUL.LIZ(upperCase)) {
                return true;
            }
        }
        EUL.LIZ.getClass();
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            m mVar = EUL.LIZIZ;
            m mVar2 = (m) LIZLLL.LJIIIIZZ("search_suggest_widget_config", m.class, mVar);
            if (mVar2 != null) {
                mVar = mVar2;
            }
            j LJJIJ = mVar.LJJIJ("is_test_offline");
            if (LJJIJ != null) {
                if (LJJIJ.LJIILJJIL() == 1 && !((RBX) HG3.LJIILL()).isLogin() && EUL.LIZ(region)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        try {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            m mVar3 = EUL.LIZIZ;
            m mVar4 = (m) LIZLLL2.LJIIIIZZ("search_suggest_widget_config", m.class, mVar3);
            if (mVar4 != null) {
                mVar3 = mVar4;
            }
            j LJJIJ2 = mVar3.LJJIJ("is_test_offline");
            if (LJJIJ2 != null) {
                if (LJJIJ2.LJIILJJIL() == 1 && (((RBY) HG3.LJIILL()).isChildrenMode() || a.LJIIIZ().LIZJ())) {
                    return true;
                }
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    public static void LIZ(Context context, boolean z) {
        o.LJIIIZ(context, "context");
        try {
            if (z) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) SearchMIUIWidgetProvider.class), 1, 1);
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) SearchMIUIWidgetProvider.class), 2, 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static String LIZIZ(int i, Context context) {
        o.LJIIIZ(context, "context");
        if (i == -1) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", i);
            Bundle call = context.getContentResolver().call(UriProtector.parse("content://com.mi.globalminusscreen.provider"), "getAppFunInfo", (String) null, bundle);
            if (call != null) {
                return call.getString("key_miui_widget_added_to");
            }
            return "Launcher";
        } catch (Throwable unused) {
            return "Launcher";
        }
    }
}

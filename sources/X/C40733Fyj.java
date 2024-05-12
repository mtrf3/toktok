package X;

import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Fyj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40733Fyj implements G1V {
    @Override // X.G1V
    public final String LIZ() {
        return "nuj_push";
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj) {
        if (C40729Fyf.LIZIZ) {
            C221018lt.LIZ("PushPermissionPopup", "nuj push shown, return");
            return;
        }
        C40729Fyf.LIZIZ = true;
        IPushPermissionApi LJII = PushPermissionPopupManager.LJII();
        ITpcConsentService LJIIZILJ = TpcConsentServiceImpl.LJIIZILJ();
        ITermsConsentService LJII2 = TermsConsentServiceImpl.LJII();
        if (!LJIIZILJ.LJIILJJIL()) {
            C221018lt.LIZ("PushPermissionPopup", "no consent,show push");
            LJII.LIZJ(activityC45651qj);
        } else {
            C221018lt.LIZ("PushPermissionPopup", "have consent,show push later");
            LJII2.LIZIZ(new C40734Fyk(LJII, activityC45651qj, LJII2));
        }
    }

    @Override // X.G1V
    public final boolean LIZIZ(G15 flowEngine, EnumC40761FzB componentType) {
        Object obj;
        boolean z;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        o.LJIIIZ(flowEngine, "flowEngine");
        o.LJIIIZ(componentType, "componentType");
        IPushPermissionApi LJII = PushPermissionPopupManager.LJII();
        ActivityC45651qj LIZ = ((InterfaceC40755Fz5) flowEngine.LIZ.context().LJLILLLLZI).LIZ();
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) != null) {
            z = o.LJ(personalizedNUJV2Data.shouldTryPushPopup, Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            C221018lt.LIZ("PushPermissionPopup", "intercept: Timing Personalized NUJ}");
            if ((componentType == EnumC40761FzB.JOURNEY_INTERESTS_ID || componentType == EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_SWIPE_UP_ID) && Build.VERSION.SDK_INT >= 33 && !C40322Fs6.LIZJ(LIZ)) {
                LIZJ(LIZ);
            }
            return false;
        }
        Context LLLLLILLIL = C16880lQ.LLLLLILLIL(((InterfaceC40755Fz5) flowEngine.LIZ.context().LJLILLLLZI).LIZ());
        o.LJIIIIZZ(LLLLLILLIL, "flowEngine.currentScene(…vity().applicationContext");
        int LIZLLL = LJII.LIZLLL(LLLLLILLIL);
        if (LIZLLL != 1) {
            if (LIZLLL != 2) {
                if (LIZLLL != 3) {
                    if (LIZLLL != 4) {
                        C221018lt.LIZ("PushPermissionPopup", "intercept: Timing else");
                    }
                } else {
                    C221018lt.LIZ("PushPermissionPopup", "intercept: Timing 3");
                    if (!C40729Fyf.LIZ) {
                        C40729Fyf.LIZ = true;
                    }
                }
            } else {
                C221018lt.LIZ("PushPermissionPopup", "intercept: Timing 2");
                if (componentType == EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_SWIPE_UP_ID) {
                    LIZJ(LIZ);
                }
            }
            return false;
        }
        C221018lt.LIZ("PushPermissionPopup", "intercept: Timing 1, 4");
        if (componentType == EnumC40761FzB.JOURNEY_INTERESTS_ID || componentType == EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID || componentType == EnumC40761FzB.JOURNEY_SWIPE_UP_ID) {
            LIZJ(LIZ);
        }
        return false;
    }
}

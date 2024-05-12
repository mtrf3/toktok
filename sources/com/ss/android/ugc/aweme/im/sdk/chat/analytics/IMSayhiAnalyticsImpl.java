package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C113554cx;
import X.C221108m2;
import X.C3U6;
import X.C3U7;
import X.C62822Ol8;
import X.C772831o;
import X.C85323Wm;
import X.InterfaceC221688my;
import X.OHQ;
import X.OSZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSayhiAnalyticsImpl implements InterfaceC221688my {
    public static final IMSayhiAnalyticsImpl LIZ = new IMSayhiAnalyticsImpl();
    public static final Map<LifecycleOwner, Set<String>> LIZIZ = new LinkedHashMap();
    public static final IMSayhiAnalyticsImpl$autoRemoveObserver$1 LIZJ = new IMSayhiAnalyticsImpl$autoRemoveObserver$1();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C3U7.LJLIL);

    @Override // X.InterfaceC221688my
    public final void LIZIZ(String str, Map<String, String> map) {
        if (C3U6.LIZ) {
            LIZJ("click", str, map);
        }
    }

    public static void LIZJ(String str, String str2, Map map) {
        String str3;
        Integer M;
        int i = 1;
        if (str2 == null || str2.length() == 0) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LIZIZ(str2);
        }
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null) {
            if (M.intValue() == 1) {
                i = 0;
            } else if (M.intValue() != 4) {
                if (M.intValue() == 2) {
                    i = 2;
                } else if (M.intValue() == 3) {
                    i = 3;
                }
            }
            Map<String, String> LJJLIIIJJI = C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(map, new OSZ("action_type", str)), new OSZ("message_type", ((OSZ) LIZLLL.getValue()).getSecond())), new OSZ("follow_status", str3)), new OSZ(OHQ.LIZ, String.valueOf(i)));
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            onEventV3.LIZIZ("greeting_button", LJJLIIIJJI);
        }
        i = -1;
        Map<String, String> LJJLIIIJJI2 = C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(C113554cx.LJJLIIIJJI(map, new OSZ("action_type", str)), new OSZ("message_type", ((OSZ) LIZLLL.getValue()).getSecond())), new OSZ("follow_status", str3)), new OSZ(OHQ.LIZ, String.valueOf(i)));
        C85323Wm onEventV32 = C772831o.LIZ();
        o.LJIIIZ(onEventV32, "onEventV3");
        onEventV32.LIZIZ("greeting_button", LJJLIIIJJI2);
    }

    @Override // X.InterfaceC221688my
    public final void LIZ(String str, Map<String, String> map, LifecycleOwner lifecycleOwner, boolean z) {
        if (!C3U6.LIZ) {
            return;
        }
        if (lifecycleOwner != null) {
            Map<LifecycleOwner, Set<String>> map2 = LIZIZ;
            Set<String> set = (Set) ((LinkedHashMap) map2).get(lifecycleOwner);
            if (set == null) {
                set = new LinkedHashSet<>();
            }
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            IMSayhiAnalyticsImpl$autoRemoveObserver$1 iMSayhiAnalyticsImpl$autoRemoveObserver$1 = LIZJ;
            lifecycle.removeObserver(iMSayhiAnalyticsImpl$autoRemoveObserver$1);
            lifecycleOwner.getLifecycle().addObserver(iMSayhiAnalyticsImpl$autoRemoveObserver$1);
            map2.put(lifecycleOwner, set);
            if (set.contains(str) && !z) {
                return;
            } else {
                set.add(str);
            }
        } else if (!z) {
            return;
        }
        LIZJ("show", str, map);
    }
}

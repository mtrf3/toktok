package com.ss.android.ugc.aweme.inbox.assem;

import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C212428Vi;
import X.C53081KsP;
import X.C54362LVe;
import X.C55888Lwa;
import X.C56662Kg;
import X.FMX;
import Y.ACallableS111S0100000_8;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxEnterMobEventByPushAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(InboxEnterMobEventByPushAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (intent = LIZ.getIntent()) != null) {
            v3(intent);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public static void v3(Intent intent) {
        String str;
        C53081KsP.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("enable_log_enter_inbox_tab_by_push", true) || !TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"), "NOTIFICATION")) {
            return;
        }
        HashMap hashMap = new HashMap();
        int LJIIJJI = C54362LVe.LJIIJJI();
        int LJIIJ = C54362LVe.LJIIJ();
        if (LJIIJJI > 0) {
            hashMap.put("notice_type", "number_dot");
        } else if (LJIIJ > 0) {
            hashMap.put("notice_type", "yellow_dot");
            LJIIJJI = LJIIJ;
        } else {
            hashMap.put("notice_type", "report_null");
            LJIIJJI = 0;
        }
        hashMap.put("show_cnt", String.valueOf(LJIIJJI));
        hashMap.put("message_cnt", String.valueOf(C54362LVe.LJIILJJIL(99)));
        hashMap.put("tab_name", "all");
        hashMap.put("enter_from", "push");
        hashMap.put("enter_method", "deeplink");
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        if (c55888Lwa.LJIIZILJ()) {
            if (c55888Lwa.LJJI(false)) {
                str = "on";
            } else {
                str = "off";
            }
            hashMap.put("creator_inbox_status", str);
        }
        C10K.LIZIZ(new ACallableS111S0100000_8(hashMap, 3), FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        v3(intent);
    }
}

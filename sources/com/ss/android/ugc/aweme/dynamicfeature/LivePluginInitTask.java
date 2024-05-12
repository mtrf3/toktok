package com.ss.android.ugc.aweme.dynamicfeature;

import X.C0RN;
import X.C16880lQ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC38394F5a;
import X.RunnableC39007FSp;
import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class LivePluginInitTask implements EE1 {
    public volatile SharedPreferences LJLIL;
    public volatile InterfaceC38394F5a LJLILLLLZI;
    public volatile Context LJLJI;
    public final List<String> LJLJJI = Arrays.asList("df_live_byte_link", "df_live_twilio_link", "df_live_zego_link", "df_live_quic", "df_live_cmaf");

    @Override // X.EEY
    public final String key() {
        return "LivePluginInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        this.LJLJI = C16880lQ.LLLLL(context);
        RunnableC39007FSp.LIZIZ(new ARunnableS15S0101000_11(4, this, 8));
    }
}

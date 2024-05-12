package com.ss.android.ugc.aweme.settingsrequest.task;

import X.AbstractC36700Eam;
import X.AbstractC36786EcA;
import X.AbstractC73672Svk;
import X.C0RN;
import X.C16880lQ;
import X.C36788EcC;
import X.C36790EcE;
import X.C36826Eco;
import X.C36922EeM;
import X.C73969T1h;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EU5;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FUM;
import X.InterfaceC38821FLl;
import X.T16;
import Y.IDxS76S0000000_6;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.g;
import com.google.gson.j;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public class SettingsReaderInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SettingsReaderInitTask";
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
        return 16777215;
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        SettingsManager.LIZLLL().LJIIIZ(new C36790EcE());
        C36922EeM.LJ("SettingsReaderInitTask");
        SettingsManagerProxy inst = SettingsManagerProxy.inst();
        if (AbstractC36786EcA.LJLILLLLZI == null) {
            synchronized (AbstractC36786EcA.class) {
                if (AbstractC36786EcA.LJLILLLLZI == null) {
                    AbstractC36786EcA.LJLILLLLZI = new EU5();
                }
            }
        }
        inst.registerSettingsWatcher(AbstractC36786EcA.LJLILLLLZI, false);
        SettingsManagerProxy.inst().registerSettingsWatcher(new InterfaceC38821FLl() { // from class: X.EcI
            @Override // X.InterfaceC38821FLl
            public final void change(IESSettingsProxy iESSettingsProxy) {
                boolean z = false;
                SharedPreferences.Editor edit = EF7.LIZIZ().getSharedPreferences("keva_switch_repo", 0).edit();
                if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
                    z = true;
                }
                SharedPreferences.Editor putStringSet = edit.putBoolean("keva_switch", z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist()));
                ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), (j) i0.LJ(true, "keva_migrate_list", 31744, g.class, null), ArrayList.class);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                putStringSet.putStringSet("keva_migrate", new HashSet(arrayList)).apply();
            }
        }, false);
        if (FCD.LJI(EF7.LIZIZ())) {
            try {
                AbstractC73672Svk.LJIIJ(C36788EcC.LJLIL).LJJL(C73969T1h.LIZIZ()).LJJJ(T16.LIZ()).LIZ(new IDxS76S0000000_6(0));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C36826Eco c36826Eco = AbstractC36700Eam.LJLJJL;
        ((ArrayList) c36826Eco.LJLJJI).add(new FUM());
    }
}

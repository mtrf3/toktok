package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C158056If;
import X.C16880lQ;
import X.C2YJ;
import X.C33798DOg;
import X.C35576Dxk;
import X.C37876Etk;
import X.C38007Evr;
import X.C38056Ewe;
import X.C38057Ewf;
import X.C38060Ewi;
import X.C38061Ewj;
import X.C38062Ewk;
import X.C38065Ewn;
import X.C38113ExZ;
import X.C38987FRv;
import X.DOI;
import X.DOR;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.InterfaceC38069Ewr;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class JsBridge2InitTask implements EE1, InterfaceC36076EDw {
    public final EFK LJLIL;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "JsBridge2InitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (C33798DOg.LIZ()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return this.LJLIL;
    }

    public JsBridge2InitTask(EFK efk) {
        this.LJLIL = efk;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.Dxk] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.Ewn] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.Evr] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.Ewm] */
    public final void LIZLLL(long j) {
        boolean z;
        if (this.LJLIL == EFK.BOOT_FINISH) {
            z = true;
        } else {
            z = false;
        }
        ?? r7 = new InterfaceC38069Ewr(z, j) { // from class: X.Ewm
            public final /* synthetic */ boolean LJLIL;

            @Override // X.InterfaceC38069Ewr
            public final void LIZ() {
                if (!this.LJLIL && !TextUtils.isEmpty("host")) {
                    C38060Ewi c38060Ewi = C38113ExZ.LJI;
                    if (c38060Ewi.LIZ() == null) {
                        return;
                    }
                    c38060Ewi.LIZ().LIZJ("host", null);
                }
            }
        };
        if (DOI.LIZJ()) {
            C38113ExZ.LIZ(z, r7);
        } else {
            JsBridge2PermissionConfigurator jsBridge2PermissionConfigurator = new JsBridge2PermissionConfigurator();
            ?? c35576Dxk = new C35576Dxk();
            ?? c38007Evr = new C38007Evr();
            C38061Ewj c38061Ewj = C38113ExZ.LJIIJ;
            c38061Ewj.LIZJ = c35576Dxk;
            c38061Ewj.LIZ = true;
            C38060Ewi c38060Ewi = C38113ExZ.LJI;
            if (!c38060Ewi.LIZ) {
                synchronized (C38113ExZ.LJIIIIZZ) {
                    if (!c38060Ewi.LIZ) {
                        ?? c38065Ewn = new C38065Ewn(jsBridge2PermissionConfigurator);
                        C38062Ewk c38062Ewk = c38065Ewn.LJIIIIZZ;
                        c38062Ewk.LIZJ = c38007Evr;
                        c38062Ewk.LIZ = true;
                        c38060Ewi.LIZJ = c38065Ewn;
                        c38060Ewi.LIZ = true;
                    }
                }
            }
            C38113ExZ.LIZ(z, r7);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("workType", this.LJLIL.name()).put("fetchPermissionConfig", z).put("isJsBridge2OptSpiConfig", DOI.LIZJ());
        } catch (Exception unused) {
        } catch (Throwable th) {
            C37876Etk.LIZJ("jsb_auth_enablePermissionCheck", jSONObject);
            throw th;
        }
        C37876Etk.LIZJ("jsb_auth_enablePermissionCheck", jSONObject);
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        if (this.LJLIL != EFK.BOOT_FINISH && ((Boolean) DOR.LIZLLL.getValue()).booleanValue() && !C38987FRv.LIZLLL().booleanValue()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            z = C2YJ.LIZIZ.LIZ.getUseBridgeEngineV2().booleanValue();
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            z = false;
        }
        EFK efk = this.LJLIL;
        EFK efk2 = EFK.BOOT_FINISH;
        if (z) {
            LIZLLL(currentTimeMillis);
            HybridTrafficColoringSettings.HybridTrafficColoringModel LIZ = HybridTrafficColoringSettings.LIZ();
            if (!LIZ.enabled || !LIZ.contextPassEnabled) {
                return;
            }
            C38113ExZ.LJII = new C38056Ewe();
            return;
        }
        if (efk != efk2) {
            return;
        }
        SettingsManager.LIZLLL().LJIIIZ(new C38057Ewf(this, currentTimeMillis));
    }
}

package com.ss.android.ugc.aweme.dynamicfeature;

import X.C09900aA;
import X.C0RN;
import X.C34650Dio;
import X.C36089EEj;
import X.C37123Ehb;
import X.EE1;
import X.EFK;
import X.EPA;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AabPluginServiceStartTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AabPluginServiceStartTask";
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
        final C37123Ehb c37123Ehb;
        o.LJIIIZ(context, "context");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            c37123Ehb = LIZLLL.LIZJ();
        } else {
            c37123Ehb = null;
        }
        if (c37123Ehb != null) {
            try {
                Set set = (Set) EPA.LIZIZ.getValue();
                Set<String> LIZ = EPA.LIZ();
                Set<String> LIZIZ = EPA.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (String str : LIZIZ) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    if (set.contains(str)) {
                        sb.append("|0");
                    } else if (LIZ.contains(str)) {
                        sb.append("|1");
                    } else {
                        sb.append("|2");
                    }
                }
                jSONObject.put("name_list", sb.toString());
                FMX.LJIILLIIL("df_installed_modules", jSONObject);
                C09900aA.LJIIJJI("df_installed_modules", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        if ((((Number) C34650Dio.LIZ.getValue()).intValue() & 2) == 2) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceStartTask$run$1
                @Override // X.EEY
                public final String key() {
                    return "ReginPluginInstallTask";
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
                public final /* synthetic */ int targetProcess() {
                    return C0RN.LIZ();
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
                    return EFK.APP_BACKGROUND;
                }

                @Override // X.EEY
                public final void run(Context context2) {
                    if (C37123Ehb.this != null) {
                        C37123Ehb.LJIJ();
                    }
                }
            }, true);
            c36089EEj.LIZJ();
        } else {
            if (c37123Ehb == null) {
                return;
            }
            C37123Ehb.LJIJ();
        }
    }
}

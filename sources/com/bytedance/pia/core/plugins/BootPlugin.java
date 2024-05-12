package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37426EmU;
import X.C37427EmV;
import X.C37449Emr;
import X.C37499Enf;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.setting.Settings;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class BootPlugin extends AbstractC37502Eni {
    public static final Map<String, String> LIZLLL;
    public final g LIZIZ;
    public final List<String> LIZJ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "boot";
    }

    static {
        HashMap hashMap = new HashMap();
        LIZLLL = hashMap;
        hashMap.put("prefetch", "pia.internal.worker.create");
    }

    public BootPlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
        this.LIZIZ = new g();
        this.LIZJ = new ArrayList();
    }

    @Override // X.AbstractC37502Eni
    public final void LJFF(String str, Object... objArr) {
        String str2;
        if (Settings.LIZ().isBootEnabled && "event-on-manifest-ready".equals(str)) {
            Object obj = objArr[0];
            if (!(obj instanceof m)) {
                return;
            }
            for (Map.Entry<String, j> entry : ((m) obj).entrySet()) {
                String key = entry.getKey();
                if ("prefetch".equals(key) && this.LIZ.LIZJ.LIZIZ().contains("prefetch") && (str2 = (String) ((HashMap) LIZLLL).get(key)) != null) {
                    m LJIIZILJ = entry.getValue().LJIIZILJ();
                    m mVar = new m();
                    mVar.LJJIIZ("configKey", key);
                    mVar.LJJIIZ("type", str2);
                    ((ArrayList) this.LIZJ).add(key);
                    this.LIZ.LJIJI.LIZIZ(new C37427EmV(this, mVar, key), new C37426EmU(this, mVar, key), LJIIZILJ, str2);
                }
            }
        }
    }

    public final void LJII(m mVar, String str) {
        this.LIZIZ.LJJII(mVar);
        ((ArrayList) this.LIZJ).remove(str);
        if (((ArrayList) this.LIZJ).isEmpty()) {
            C37449Emr c37449Emr = this.LIZ.LJIJI;
            final g gVar = this.LIZIZ;
            c37449Emr.LIZ(new Object(gVar) { // from class: com.bytedance.pia.core.bridge.methods.BootOnFinish$Result

                @InterfaceC65349Pkn("results")
                public g results;

                {
                    this.results = gVar;
                }
            }, "pia.internal.boot.onFinish");
        }
    }
}

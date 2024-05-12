package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.LaI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54506LaI implements Runnable {
    public final /* synthetic */ C54505LaH LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ EnumC1804076e LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJL;

    public RunnableC54506LaI(C54505LaH c54505LaH, String str, EnumC1804076e enumC1804076e, long j, java.util.Map<String, ? extends Object> map) {
        this.LJLIL = c54505LaH;
        this.LJLILLLLZI = str;
        this.LJLJI = enumC1804076e;
        this.LJLJJI = j;
        this.LJLJJL = map;
    }

    public final void LIZ() {
        C54505LaH c54505LaH = this.LJLIL;
        String str = this.LJLILLLLZI;
        EnumC1804076e enumC1804076e = this.LJLJI;
        long j = this.LJLJJI;
        java.util.Map<String, Object> map = this.LJLJJL;
        c54505LaH.getClass();
        if (!C52231Keh.LIZ() || !C64099PDr.LIZ.getLogTypeSwitch("prf_page_load")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, str);
        jSONObject.put("load_time", j);
        jSONObject.put("load_result", String.valueOf(enumC1804076e.getValue()));
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        FMX.LJIILJJIL("prf_page_load", jSONObject);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

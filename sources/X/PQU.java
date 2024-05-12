package X;

import Y.ARunnableS47S0100000_11;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PQU implements PH7, PH6, InterfaceC64103PDv {
    public static volatile boolean LJLLI;
    public final String LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public double LJLJJL;
    public JSONObject LJLJJLL;
    public final HashMap<String, String> LJLJL;
    public boolean LJLJLJ;
    public final LinkedList<PQW> LJLJLLL;
    public final ARunnableS47S0100000_11 LJLL;

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
        LJLLI = true;
        ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).unregisterConfigListener(this);
        if (this.LJLJJLL != null || (true ^ this.LJLJLLL.isEmpty())) {
            LIZIZ();
        }
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (X.J8Z.LIZIZ.nextFloat() <= 0.05f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PQU.LIZIZ():void");
    }

    public final boolean LJFF() {
        if (C40444Fu4.LIZ(this.LJLIL)) {
            return true;
        }
        String scene = this.LJLIL;
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, "dsp_sub_player_launch") || o.LJ(scene, "dsp_launch") || ((Boolean) C33907DSl.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public PQU(String type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = -1L;
        this.LJLJJL = -1.0d;
        this.LJLJL = new HashMap<>();
        this.LJLJLLL = new LinkedList<>();
        this.LJLL = new ARunnableS47S0100000_11(this, 134);
    }

    @Override // X.PH6
    public final void LIZJ(JSONObject jSONObject) {
        String str;
        this.LJLJJLL = jSONObject;
        if (!LJLLI && !this.LJLJLJ && LJFF()) {
            this.LJLJLJ = true;
            ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).registerConfigListener(this);
        }
        if (LJLLI || !LJFF()) {
            LIZIZ();
            return;
        }
        if (this.LJLILLLLZI > 0 && this.LJLJJL > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && this.LJLJJLL != null) {
            HashMap<String, String> hashMap = this.LJLJL;
            if (C64432PQm.LIZIZ().LIZJ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_battery_saver", str);
            try {
                LinkedList<PQW> linkedList = this.LJLJLLL;
                long j = this.LJLILLLLZI;
                double d = this.LJLJJL;
                JSONObject jSONObject2 = this.LJLJJLL;
                o.LJI(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                Iterator<String> keys = jSONObject2.keys();
                o.LJIIIIZZ(keys, "keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject3.put(next, jSONObject2.get(next));
                }
                HashMap<String, String> hashMap2 = this.LJLJL;
                HashMap hashMap3 = new HashMap(hashMap2.size());
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    hashMap3.put(entry.getKey(), entry.getValue());
                }
                C3C5.m7constructorimpl(Boolean.valueOf(linkedList.add(new PQW(j, d, jSONObject3, hashMap3))));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        this.LJLJL.clear();
        this.LJLILLLLZI = -1L;
        this.LJLJJL = -1.0d;
        this.LJLJJLL = null;
    }

    @Override // X.PH7
    public final void LIZLLL(double d) {
        this.LJLJJL = d;
        C57022Lq.LIZ.LJLIL.removeCallbacks(this.LJLL);
    }
}

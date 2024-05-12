package X;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LR5<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;

    public LR5(int i, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = j4;
        this.LJLJL = j5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        java.util.Map<Integer, Integer> LJIILL;
        int i;
        JSONObject jSONObject = new JSONObject();
        int i2 = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        long j3 = this.LJLJJL;
        long j4 = this.LJLJJLL;
        long j5 = this.LJLJL;
        try {
            jSONObject.put("unread_count", i2);
            if (z) {
                jSONObject.put("latency", j);
            }
            if (LR4.LJII) {
                jSONObject.put("popup_latency", j2);
            }
            if (LR4.LJ) {
                jSONObject.put("notice_latency", j3);
            }
            if (LR4.LJFF) {
                jSONObject.put("dm_latency", j4);
            }
            if (LR4.LJI) {
                jSONObject.put("cache_latency", j5);
            }
            if (ENR.LIZ()) {
                LJIILL = C54362LVe.LJIIIZ().LJ();
            } else {
                LJIILL = C54362LVe.LJIIL().LJIILL();
            }
            jSONObject.put("unread_map", LJIILL.toString());
            boolean containsKey = LJIILL.containsKey(99);
            java.util.Map LJJLIL = C113554cx.LJJLIL(LJIILL);
            LJJLIL.remove(99);
            if (LJJLIL.size() <= 0) {
                i = 0;
            } else {
                i = 1;
            }
            if (containsKey) {
                i |= 2;
            }
            C3C5.m7constructorimpl(jSONObject.put("unread_type", i));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        FMX.LJIILJJIL("inbox_badge_perf", jSONObject);
        return C76800UCe.LIZ;
    }
}

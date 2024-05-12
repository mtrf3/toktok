package X;

import org.json.JSONObject;

/* renamed from: X.0cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11160cC {
    public final /* synthetic */ int[] LIZ;
    public final /* synthetic */ InterfaceC11180cE LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;

    public C11160cC(int[] iArr, InterfaceC11180cE interfaceC11180cE, long j, long j2) {
        this.LIZ = iArr;
        this.LIZIZ = interfaceC11180cE;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }

    public final void LIZ(boolean z, int i, Exception exc, JSONObject jSONObject) {
        JSONObject LJII = C78540Us4.LJII(z, i, exc, jSONObject);
        LJII.toString();
        C78540Us4.LJIJI();
        int[] iArr = this.LIZ;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (!z && i2 < 2) {
            return;
        }
        if (this.LIZIZ != null) {
            try {
                LJII.put("zip_cost", this.LIZJ - this.LIZLLL);
                LJII.put("upload_cost", System.currentTimeMillis() - this.LIZJ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LIZIZ.LIZ(LJII, z);
        }
        if (!z) {
            C09900aA.LJIIJJI("apm_event_stats_alog_fail", i, LJII);
        }
        if (exc != null) {
            C10060aQ.LIZ.LIZIZ(exc, "apm_event_stats_alog_fail");
        }
    }
}

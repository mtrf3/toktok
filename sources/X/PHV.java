package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHV implements Runnable {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ JSONObject LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ PHU LJLJL;

    public final void LIZ() {
        String jSONObject;
        if (this.LJLJL.LIZIZ != null) {
            try {
                JSONObject jSONObject2 = this.LJLIL;
                String str = "";
                if (jSONObject2 == null) {
                    jSONObject = "";
                } else {
                    jSONObject = jSONObject2.toString();
                }
                JSONObject jSONObject3 = this.LJLILLLLZI;
                if (jSONObject3 != null) {
                    str = jSONObject3.toString();
                }
                this.LJLJL.LIZIZ.LLJJLIIIJLLLLLLLZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, jSONObject, str);
                if (C09970aH.LJII()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SubBiz trafficStats(trafficBytes=");
                    LIZ.append(this.LJLJI);
                    LIZ.append(", sourceId=");
                    LIZ.append(this.LJLJJI);
                    LIZ.append(", business=");
                    LIZ.append(this.LJLJJL);
                    LIZ.append(", scene=");
                    LIZ.append(this.LJLJJLL);
                    LIZ.append(", extraStatus=");
                    LIZ.append(jSONObject);
                    LIZ.append(", extraLog=");
                    LIZ.append(str);
                    C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
                }
            } catch (Throwable unused) {
            }
        }
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

    public PHV(PHU phu, JSONObject jSONObject, JSONObject jSONObject2, long j, String str, String str2, String str3) {
        this.LJLJL = phu;
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = jSONObject2;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }
}

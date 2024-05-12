package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.VPs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79700VPs {
    public final WeakReference<VNU> LIZ;
    public final String LIZIZ = "x_audio_error";
    public final int LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        VNL vnl;
        VNU vnu = this.LIZ.get();
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(this.LIZJ, "errorReport");
            c49615Jdb.LIZJ(jSONObject.toString(), "category");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    public C79700VPs(int i, VNU vnu) {
        this.LIZJ = i;
        this.LIZ = new WeakReference<>(vnu);
    }
}

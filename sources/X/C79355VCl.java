package X;

import Y.ARunnableS3S1210000_14;
import Y.ARunnableS5S1110000_14;
import android.os.Handler;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.VCl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79355VCl {
    public final C38891FOd LJFF;
    public long LIZ = 10000;
    public int LIZIZ = 5;
    public final SettingsManager LIZJ = SettingsManager.getInstance();
    public final java.util.Set<VDA> LIZLLL = new HashSet();
    public Handler LJ = new Handler(C16880lQ.LLJJJJ());
    public final long LJI = -1;
    public long LJII = -1;
    public boolean LJIIIIZZ = true;
    public boolean LJIIIZ = false;
    public int LJIIJ = 0;

    public C79355VCl(C38891FOd c38891FOd) {
        this.LJFF = c38891FOd;
    }

    public final void LIZIZ(String str, boolean z) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        if (z) {
            LIZJ(str, z);
            return;
        }
        C38891FOd c38891FOd = this.LJFF;
        c38891FOd.LIZ.execute(new ARunnableS5S1110000_14(this, str, z, 0));
    }

    public final void LIZJ(String str, boolean z) {
        this.LIZ = C79346VCc.LIZLLL().LJJJ;
        this.LIZIZ = C79346VCc.LIZLLL().LJJIZ;
        boolean[] zArr = {false};
        this.LJII = System.currentTimeMillis();
        SettingsManager.ResponseData sendRequest = this.LIZJ.sendRequest(str);
        DnsOptimizer.LJFF().LJJIIZI = sendRequest.statusCode;
        DnsOptimizer.LJFF().LJJIIZ = (int) (System.currentTimeMillis() - this.LJII);
        try {
            zArr[0] = C79346VCc.LIZLLL().LIZJ(new JSONObject(sendRequest.responseJsonStr));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (z) {
            this.LJIIIZ = false;
            LIZ(zArr, str, z);
        } else {
            this.LJ.post(new ARunnableS3S1210000_14(this, zArr, z, str, 1));
        }
    }

    public final void LIZ(boolean[] zArr, String str, boolean z) {
        if (!zArr[0]) {
            int i = this.LJIIJ + 1;
            this.LJIIJ = i;
            if (i > this.LIZIZ) {
                DnsOptimizer.LJFF().LJJIJIIJI = true;
                return;
            }
            long j = this.LIZ;
            this.LJ.removeCallbacksAndMessages(null);
            this.LJ.postDelayed(new ARunnableS5S1110000_14(this, str, z, 1), j);
            return;
        }
        if (this.LJIIIIZZ) {
            DnsOptimizer.LJFF().LJJIIJZLJL = (int) (System.currentTimeMillis() - this.LJI);
            this.LJIIIIZZ = false;
        }
        this.LJIIJ = 0;
        Iterator it = ((HashSet) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((VDA) it.next()).LIZ(str);
        }
    }
}

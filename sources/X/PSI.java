package X;

import Y.ARunnableS47S0100000_11;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PSI implements Runnable {
    public final /* synthetic */ PSL LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;
    public final /* synthetic */ List LJLJJI;
    public final /* synthetic */ PSH LJLJJL;

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LJLJJL.LJ) {
            this.LJLJJL.LIZLLL(this.LJLIL, this.LJLILLLLZI);
        }
        synchronized (this.LJLJJL.LIZLLL) {
            PSH psh = this.LJLJJL;
            psh.LJI--;
        }
        Runnable runnable = this.LJLJI;
        if (runnable != null) {
            runnable.run();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 100) {
            String str = this.LJLJJL.LIZIZ;
            if (this.LJLJJI == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sp_apply_cost_time", currentTimeMillis2);
                jSONObject.put("sp_file_name", str);
                FUA.LIZIZ("sp_apply_cost", "sp_apply_cost", jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
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

    public PSI(PSH psh, PSL psl, boolean z, ARunnableS47S0100000_11 aRunnableS47S0100000_11, List list) {
        this.LJLJJL = psh;
        this.LJLIL = psl;
        this.LJLILLLLZI = z;
        this.LJLJI = aRunnableS47S0100000_11;
        this.LJLJJI = list;
    }
}

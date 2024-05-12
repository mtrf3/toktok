package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import java.util.List;

/* loaded from: classes11.dex */
public final class OD1 implements Runnable {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ OD0 LJLJJI;

    public final void LIZ() {
        try {
            if (this.LJLIL.isEmpty()) {
                return;
            }
            OC6.LIZ("gecko-debug-tag", "sync queue filter unregistered gecko", this.LJLJJI.LIZJ);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(this.LJLILLLLZI);
            C61548ODo LJIIJ = ODN.LJIIJ(this.LJLJJI.LIZIZ, this.LJLIL, optionCheckUpdateParams, new C61523OCp());
            LJIIJ.LIZLLL(Integer.valueOf(this.LJLJI), "req_type");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sync queue execute check update,req type:");
            LIZ.append(this.LJLJI);
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ), this.LJLIL);
            LJIIJ.LJ(null);
        } catch (Exception e) {
            OC6.LIZ("gecko-debug-tag", "sync queue check update failed", e);
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

    public OD1(OD0 od0, List list, int i, int i2) {
        this.LJLJJI = od0;
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import java.util.List;

/* loaded from: classes13.dex */
public final class SHM extends SLJ {
    public List<? extends SLJ> LJLL;

    @Override // X.SLJ
    public final boolean LL() {
        boolean z;
        loop0: while (true) {
            z = false;
            for (SLJ slj : this.LJLL) {
                if (z || slj.LL()) {
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public SHM(Context context, GroupTitleAdapterConfigs groupTitleAdapterConfigs) {
        super(context);
        int i = groupTitleAdapterConfigs.topPending;
        if (i != 0) {
            C71909SKb.LIZ.getClass();
            LJLLLLLL(C71909SKb.LIZLLL().LIZLLL(i));
        }
        int i2 = groupTitleAdapterConfigs.titleRes;
        C71909SKb.LIZ.getClass();
        LJLLLLLL(C71909SKb.LIZLLL().LIZ(i2));
        this.LJLL = C61878OQg.INSTANCE;
    }
}

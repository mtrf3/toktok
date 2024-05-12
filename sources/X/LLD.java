package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* loaded from: classes10.dex */
public final class LLD implements Runnable {
    public final /* synthetic */ TabChangeManager LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ Bundle LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public LLD(TabChangeManager tabChangeManager, String str, boolean z, int i, boolean z2, Bundle bundle, String str2) {
        this.LJLIL = tabChangeManager;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = z2;
        this.LJLJJLL = bundle;
        this.LJLJL = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.kv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}

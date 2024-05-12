package X;

import android.os.Bundle;

/* renamed from: X.QoY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68130QoY implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ Bundle LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ = null;
    public final /* synthetic */ C68082Qnm LJLJLLL;

    public RunnableC68130QoY(C68082Qnm c68082Qnm, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.LJLJLLL = c68082Qnm;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = bundle;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJLLL.LJIILJJIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
        } finally {
            if (LIZ) {
            }
        }
    }
}

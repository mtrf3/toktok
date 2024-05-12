package X;

import android.content.Context;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;

/* renamed from: X.aNz, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93259aNz implements Runnable {
    public final /* synthetic */ C93258aNy LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ SetupInfo LJLJI;
    public final /* synthetic */ PTYSetupCallback LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public RunnableC93259aNz(C93258aNy c93258aNy, Context context, SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback, boolean z, boolean z2) {
        this.LJLIL = c93258aNy;
        this.LJLILLLLZI = context;
        this.LJLJI = setupInfo;
        this.LJLJJI = pTYSetupCallback;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        } finally {
            if (LIZ) {
            }
        }
    }
}

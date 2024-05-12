package X;

import android.content.Context;

/* renamed from: X.CmH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32317CmH implements Runnable {
    public final /* synthetic */ C32313CmD LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC32317CmH(C32313CmD c32313CmD, Context context, boolean z, String str, int i, String str2, String str3) {
        this.LJLIL = c32313CmD;
        this.LJLILLLLZI = context;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJFF(this.LJLILLLLZI, false, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}

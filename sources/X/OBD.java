package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class OBD implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ OBC LJLJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJL.LIZ() != null && !(this.LJLJL.LIZIZ() instanceof OBC)) {
                this.LJLJL.LIZIZ().jumpToMiniApp(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public OBD(OBC obc, Context context, String str, String str2, boolean z, String str3, String str4) {
        this.LJLJL = obc;
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
    }
}

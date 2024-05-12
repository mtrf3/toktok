package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes10.dex */
public final class LDA implements Runnable {
    public final /* synthetic */ UrlModel LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ SIR LJLJL;
    public final /* synthetic */ C57127MbT LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJLJ.LJIIIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public LDA(C57127MbT c57127MbT, UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z, L5W l5w) {
        this.LJLJLJ = c57127MbT;
        this.LJLIL = urlModel;
        this.LJLILLLLZI = iArr;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str;
        this.LJLJJLL = z;
        this.LJLJL = l5w;
    }
}

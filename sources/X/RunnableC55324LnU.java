package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LnU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55324LnU implements Runnable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ DetailFragmentPanel LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJLL.LJLJI(this.LJLJI + 1, this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC55324LnU(DetailFragmentPanel detailFragmentPanel, Aweme aweme, String str, int i, String str2, boolean z) {
        this.LJLJJLL = detailFragmentPanel;
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = z;
    }
}

package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LnV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55325LnV implements Runnable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ DetailFragmentPanel LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LJLJJL(this.LJLJI, this.LJLJJI + 1, this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC55325LnV(DetailFragmentPanel detailFragmentPanel, Aweme aweme, String str, int i, int i2) {
        this.LJLJJL = detailFragmentPanel;
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}

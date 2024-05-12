package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.MEo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC56478MEo implements Runnable {
    public final /* synthetic */ RecyclerView.ViewHolder LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C56473MEj LJLJJLL;

    public final void LIZ() {
        if (this.LJLJJLL.LJLLL.isFinishing()) {
            return;
        }
        MFV mfv = (MFV) this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        int i = this.LJLJI;
        C56473MEj c56473MEj = this.LJLJJLL;
        mfv.X(aweme, i, c56473MEj.LJLJJLL, c56473MEj.LJLL, this.LJLJJI, this.LJLJJL);
        ((AbstractC208618Gr) this.LJLIL).LJLJJI = this.LJLJJLL.LJLJJL;
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

    public RunnableC56478MEo(C56473MEj c56473MEj, RecyclerView.ViewHolder viewHolder, Aweme aweme, int i, int i2, String str, String str2) {
        this.LJLJJLL = c56473MEj;
        this.LJLIL = viewHolder;
        this.LJLILLLLZI = aweme;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str;
    }
}

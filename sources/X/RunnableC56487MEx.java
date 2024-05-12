package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.MEx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC56487MEx implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C56473MEj.LLIIIL(this.LJLJI, this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC56487MEx(int i, boolean z, Aweme aweme) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = aweme;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Mux, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC58335Mux implements Runnable {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            NN1.LJJIII(EF7.LIZIZ(), this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC58335Mux(Aweme aweme, String str) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
    }
}

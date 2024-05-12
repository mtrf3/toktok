package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.N3s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC58744N3s implements Runnable {
    public final Handler LJLIL;
    public final WeakReference<C59316NPs> LJLILLLLZI;

    public final void LIZ() {
        C59316NPs c59316NPs = this.LJLILLLLZI.get();
        if (c59316NPs == null) {
            return;
        }
        Aweme aweme = c59316NPs.LJLJLJ;
        long currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
        if (aweme != null && C58740N3o.LJII(aweme) && currentPosition >= C58740N3o.LIZ(aweme)) {
            C58740N3o c58740N3o = C58740N3o.LIZ;
            if ((C58740N3o.LIZJ(c58740N3o, aweme) & 2) == 0) {
                C58740N3o.LIZLLL(aweme, "play");
                c58740N3o.LJI(aweme);
            }
        }
        this.LJLIL.removeCallbacks(this);
        this.LJLIL.postDelayed(this, 200L);
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

    public RunnableC58744N3s(C59316NPs delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLILLLLZI = new WeakReference<>(delegate);
    }
}

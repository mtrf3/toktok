package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: X.I9e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC46146I9e implements Runnable {
    public final /* synthetic */ I9X LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            long endFrameTimeUS = this.LJLIL.LJJLIIIJILLIZJL().getEndFrameTimeUS() / 1000;
            I9X i9x = this.LJLIL;
            SafeHandler safeHandler = i9x.LJLJJL;
            if (i9x.LLLL(endFrameTimeUS) && safeHandler != null) {
                safeHandler.post(this);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46146I9e(I9X i9x) {
        this.LJLIL = i9x;
    }
}

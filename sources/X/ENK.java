package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;

/* loaded from: classes7.dex */
public final class ENK implements Runnable {
    public static final ENK LJLIL = new ENK();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            PreloadManager.LJFF.set(true);
        } finally {
            if (LIZ) {
            }
        }
    }
}

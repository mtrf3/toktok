package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;

/* renamed from: X.4An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC105094An implements Runnable {
    public long LJLIL;
    public final /* synthetic */ InputView LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL = SystemClock.elapsedRealtime();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC105094An(InputView inputView) {
        this.LJLILLLLZI = inputView;
    }
}

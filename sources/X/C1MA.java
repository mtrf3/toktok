package X;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1MA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MA implements EVL, InterfaceC153055zZ {
    @Override // X.EVL
    public final boolean LIZ(long j) {
        return false;
    }

    @Override // X.EVL
    public final void LIZIZ(EVK evk, Context context) {
    }

    @Override // X.EVL
    public final boolean LIZJ(long j) {
        return false;
    }

    @Override // X.EVL
    public final void release() {
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        return C16880lQ.LLLLZLLLI(new ThreadFactory() { // from class: com.google.android.play.core.assetpacks.k2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new PthreadThread(runnable, "AssetPackBackgroundExecutor");
            }
        });
    }
}

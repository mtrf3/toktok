package X;

import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.HEw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43746HEw implements IVideoConfigService {
    public static int LIZ = 576;
    public static int LIZIZ = 1024;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static final void LIZ() {
        int[] LIZLLL;
        int i;
        int i2;
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            if (atomicBoolean.compareAndSet(false, true) && (LIZLLL = C44739Hh9.LIZLLL()) != null && LIZLLL.length == 2 && (i = LIZLLL[0]) > 0 && (i2 = LIZLLL[1]) > 0) {
                LIZ = i;
                LIZIZ = i2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        LIZJ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        LIZ();
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        LIZ();
        return LIZ;
    }
}

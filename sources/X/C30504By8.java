package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;

/* renamed from: X.By8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30504By8 implements UB9 {
    @Override // X.UB9
    public final ILiveStream getLiveCore() {
        CKO LIZIZ;
        C3Y c3y = C3Y.LIZ;
        synchronized (c3y) {
            LIZIZ = C3Y.LIZIZ();
        }
        if (LIZIZ != null) {
            return c3y.LIZ().LJ;
        }
        C0NB.LJ("BroadcastService", "getLiveCore getLiveStream() is null");
        return null;
    }

    @Override // X.UB9
    public final Client create(InteractConfig interactConfig) {
        CKO LIZIZ;
        C3Y c3y = C3Y.LIZ;
        synchronized (c3y) {
            LIZIZ = C3Y.LIZIZ();
        }
        if (LIZIZ != null) {
            return c3y.LIZ().create(interactConfig);
        }
        C0NB.LJ("BroadcastService", "create VideoClientFactory getLiveStream() is null");
        return null;
    }
}

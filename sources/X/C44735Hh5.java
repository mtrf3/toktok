package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Hh5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44735Hh5 implements IVideoConfigService {
    public int LIZ = 576;
    public int LIZIZ = 1024;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final boolean LIZLLL;

    public final void LIZ() {
        if (this.LIZJ.get()) {
            return;
        }
        synchronized (this.LIZJ) {
            if (this.LIZJ.compareAndSet(false, true)) {
                LIZIZ();
            }
        }
    }

    public final void LIZIZ() {
        int[] LJIIIZ;
        int i;
        int i2;
        int LIZIZ;
        int[] LJIIJ;
        if (this.LIZLLL) {
            LJIIIZ = C44739Hh9.LJIIJ(C44737Hh7.LIZ());
            if (C79234V7u.LJIIIIZZ(true)) {
                LIZIZ = InterfaceC44798Hi6.LJFF.recordVideoEncodeSizeIndex();
            } else {
                LIZIZ = C44742HhC.LIZIZ();
            }
            List<String> LIZ = C44772Hhg.LIZ();
            if (C32151Nz.LJJIIZI(LIZ) && LIZIZ < LIZ.size() && (LJIIJ = C44739Hh9.LJIIJ((String) ListProtector.get(LIZ, LIZIZ))) != null) {
                LJIIIZ = LJIIJ;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RecordResolution ; ");
            LIZ2.append(Arrays.toString(LJIIIZ));
            C5Z5.LIZ(X1D.LIZIZ(LIZ2));
        } else {
            LJIIIZ = C44739Hh9.LJIIIZ(false);
        }
        if (LJIIIZ != null && LJIIIZ.length == 2 && (i = LJIIIZ[0]) > 0 && (i2 = LJIIIZ[1]) > 0) {
            if (!this.LIZLLL) {
                int[] LIZIZ2 = C143205jg.LIZIZ(LJIIIZ);
                this.LIZ = LIZIZ2[0];
                this.LIZIZ = LIZIZ2[1];
            } else {
                this.LIZ = i;
                this.LIZIZ = i2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        this.LIZJ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        LIZ();
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        LIZ();
        return this.LIZ;
    }

    public C44735Hh5(boolean z) {
        this.LIZLLL = z;
    }
}

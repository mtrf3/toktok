package X;

import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.google.gson.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ep0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37582Ep0 implements BQ6<m> {
    public final /* synthetic */ C37595EpD LIZ;
    public final /* synthetic */ AtomicBoolean LIZIZ;
    public final /* synthetic */ C37449Emr LIZJ;

    @Override // X.BQ6
    public final void accept(m mVar) {
        m LIZ = ProtocolMessage.LIZ(new C37428EmW(this.LIZ.LIZ, 1, mVar, null));
        if (LIZ != null && this.LIZIZ.compareAndSet(false, true)) {
            this.LIZJ.LJ.LIZ(LIZ);
        }
    }

    public C37582Ep0(C37449Emr c37449Emr, C37595EpD c37595EpD, AtomicBoolean atomicBoolean) {
        this.LIZJ = c37449Emr;
        this.LIZ = c37595EpD;
        this.LIZIZ = atomicBoolean;
    }
}

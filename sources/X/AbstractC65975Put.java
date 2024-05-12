package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.Signal;
import kotlin.jvm.internal.o;

/* renamed from: X.Put, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65975Put implements InterfaceC65981Puz {
    public final C65964Pui<Signal> LIZ;

    public AbstractC65975Put() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        this.LIZ = new C65964Pui<>(heliosEnvImpl.LJIIJ.signalConfig.maxUploadSize, null, null, 6, null);
    }

    @Override // X.InterfaceC65981Puz
    public final void LIZ(Signal signal) {
        this.LIZ.offer(signal);
    }
}

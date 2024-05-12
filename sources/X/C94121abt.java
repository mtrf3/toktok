package X;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.abt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94121abt implements InterfaceC93523aSF {
    public final /* synthetic */ AtomicReference LIZ;

    public C94121abt(AtomicReference atomicReference) {
        this.LIZ = atomicReference;
    }

    @Override // X.InterfaceC93523aSF
    public final void LIZ(ArCoreApk.Availability availability) {
        this.LIZ.set(availability);
    }
}

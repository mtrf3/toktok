package X;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.k;

/* renamed from: X.abr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94119abr implements InterfaceC93523aSF {
    public final /* synthetic */ k LIZ;

    public C94119abr(k kVar) {
        this.LIZ = kVar;
    }

    @Override // X.InterfaceC93523aSF
    public final void LIZ(ArCoreApk.Availability availability) {
        synchronized (this.LIZ) {
            this.LIZ.g = availability;
            this.LIZ.h = false;
        }
    }
}

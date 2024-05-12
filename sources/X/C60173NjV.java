package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NjV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60173NjV implements InterfaceC60259Nkt<Bundle> {
    public final Bundle LIZ;
    public final /* synthetic */ C60193Njp LIZIZ;

    @Override // X.InterfaceC60259Nkt
    public final /* bridge */ /* synthetic */ Bundle LIZIZ() {
        return this.LIZ;
    }

    public C60173NjV(C60193Njp c60193Njp, Bundle bundle) {
        this.LIZIZ = c60193Njp;
        this.LIZ = bundle;
    }

    @Override // X.InterfaceC60259Nkt
    public final void LIZ(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(param, "param");
        this.LIZIZ.gk(instance, uri, param);
        InterfaceC60172NjU interfaceC60172NjU = this.LIZIZ.LJLILLLLZI;
        if (interfaceC60172NjU != null) {
            interfaceC60172NjU.gk(instance, uri, param);
        }
    }
}

package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.preload.SemiPdpPreload;
import kotlin.jvm.internal.o;

/* renamed from: X.X8o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84350X8o implements InterfaceC84349X8n {
    public final /* synthetic */ Bundle LIZ;

    public C84350X8o(Bundle bundle) {
        this.LIZ = bundle;
    }

    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        trigger.LIZIZ(this.LIZ, SemiPdpPreload.class, new C84351X8p());
    }
}

package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZJ implements InterfaceC113814dN {
    public final /* synthetic */ OZQ LJLIL;

    public OZJ(OZQ ozq) {
        this.LJLIL = ozq;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        OZI ozi = this.LJLIL.LJLIL;
        if (ozi != null) {
            ozi.LIZ(channel);
        }
    }
}

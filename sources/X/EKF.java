package X;

import Y.ACallableS109S0100000_6;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKF implements InterfaceC36167EHj {
    public final /* synthetic */ ServerPortraitCollections LIZ;

    @Override // X.InterfaceC36167EHj
    public final void LIZJ() {
        C10K.LIZJ(new ACallableS109S0100000_6(this.LIZ, 6));
    }

    public EKF(ServerPortraitCollections serverPortraitCollections) {
        this.LIZ = serverPortraitCollections;
    }

    @Override // X.InterfaceC36167EHj
    public final void LIZIZ(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJ();
    }
}

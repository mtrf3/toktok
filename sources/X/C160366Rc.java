package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160366Rc {
    public final InterfaceC88471Ynr<FrameLayout, FrameLayout, C76800UCe> LIZ;
    public final InterfaceC65784Pro<ShortVideoContext> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C160366Rc)) {
            return false;
        }
        C160366Rc c160366Rc = (C160366Rc) obj;
        return o.LJ(this.LIZ, c160366Rc.LIZ) && o.LJ(this.LIZIZ, c160366Rc.LIZIZ);
    }

    public final int hashCode() {
        InterfaceC88471Ynr<FrameLayout, FrameLayout, C76800UCe> interfaceC88471Ynr = this.LIZ;
        return this.LIZIZ.hashCode() + ((interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordInfiniStickerSceneActions(initStickerService=");
        LIZ.append(this.LIZ);
        LIZ.append(", shortVideoContextProvider=");
        return C06540Nm.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C160366Rc(AqS152S0100000_2 aqS152S0100000_2, C6PM c6pm) {
        this.LIZ = c6pm;
        this.LIZIZ = aqS152S0100000_2;
    }
}

package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.64J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64J {
    public final List<C64U> LIZ;
    public final int LIZIZ;
    public final InterfaceC88472Yns<C64N, C76800UCe> LIZJ;
    public final FrameLayout LIZLLL;
    public final ViewStub LJ;

    public C64J() {
        this(null, 0, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64J)) {
            return false;
        }
        C64J c64j = (C64J) obj;
        return o.LJ(this.LIZ, c64j.LIZ) && this.LIZIZ == c64j.LIZIZ && o.LJ(this.LIZJ, c64j.LIZJ) && o.LJ(this.LIZLLL, c64j.LIZLLL) && o.LJ(this.LJ, c64j.LJ);
    }

    public final int hashCode() {
        List<C64U> list = this.LIZ;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ) * 31;
        InterfaceC88472Yns<C64N, C76800UCe> interfaceC88472Yns = this.LIZJ;
        int hashCode2 = (hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        FrameLayout frameLayout = this.LIZLLL;
        int hashCode3 = (hashCode2 + (frameLayout == null ? 0 : frameLayout.hashCode())) * 31;
        ViewStub viewStub = this.LJ;
        return hashCode3 + (viewStub != null ? viewStub.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerContainerConfig(interceptors=");
        LIZ.append(this.LIZ);
        LIZ.append(", topMargin=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", changeIndexToTopListener=");
        LIZ.append(this.LIZJ);
        LIZ.append(", stickerLayer=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", higherViewStub=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C64J(List<? extends C64U> list, int i, InterfaceC88472Yns<? super C64N, C76800UCe> interfaceC88472Yns, FrameLayout frameLayout, ViewStub viewStub) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = frameLayout;
        this.LJ = viewStub;
    }
}

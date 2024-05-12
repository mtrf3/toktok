package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W4A {
    public final LifecycleOwner LIZ;
    public InterfaceC88472Yns<? super Boolean, Boolean> LIZIZ;
    public InterfaceC65784Pro<Boolean> LIZJ;
    public W4C LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public W4A() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W4A)) {
            return false;
        }
        W4A w4a = (W4A) obj;
        return o.LJ(this.LIZ, w4a.LIZ) && o.LJ(this.LIZIZ, w4a.LIZIZ) && o.LJ(this.LIZJ, w4a.LIZJ) && o.LJ(this.LIZLLL, w4a.LIZLLL) && this.LJ == w4a.LJ && this.LJFF == w4a.LJFF && this.LJI == w4a.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        LifecycleOwner lifecycleOwner = this.LIZ;
        int hashCode = (lifecycleOwner != null ? lifecycleOwner.hashCode() : 0) * 31;
        InterfaceC88472Yns<? super Boolean, Boolean> interfaceC88472Yns = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0)) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZJ;
        int hashCode3 = (hashCode2 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0)) * 31;
        W4C w4c = this.LIZLLL;
        int hashCode4 = (hashCode3 + (w4c != null ? w4c.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.LJFF;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(pageLifecycleOwner=");
        LIZ.append(this.LIZ);
        LIZ.append(", onShowHideInterceptor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onBackKeyInterceptor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", stickerPanelSceneFactory=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", ensureSetupOnRecordFirstFrameDone=");
        LIZ.append(this.LJ);
        LIZ.append(", enablePreloadStickerPanel=");
        LIZ.append(this.LJFF);
        LIZ.append(", shootReuseNotDelayPanel=");
        return C19U.LIZ(LIZ, this.LJI, ")", LIZ);
    }

    public W4A(W48 w48) {
        this.LIZ = w48;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = false;
        this.LJFF = true;
        this.LJI = false;
    }
}

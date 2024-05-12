package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.MJh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56601MJh implements InterfaceC84755XOd {
    public final InterfaceC56609MJp LIZ;

    @Override // X.InterfaceC84755XOd
    public final void LIZ() {
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC84755XOd
    public final void LJ() {
    }

    @Override // X.InterfaceC84755XOd
    public final void onCreate() {
    }

    @Override // X.InterfaceC84755XOd
    public final void onDestroy() {
    }

    @Override // X.InterfaceC84755XOd
    public final void onPause() {
    }

    @Override // X.InterfaceC84755XOd
    public final void onResume() {
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZJ() {
        InterfaceC56609MJp interfaceC56609MJp = this.LIZ;
        if (interfaceC56609MJp != null) {
            interfaceC56609MJp.w5(false);
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void LJFF() {
        InterfaceC56609MJp interfaceC56609MJp = this.LIZ;
        if (interfaceC56609MJp != null) {
            interfaceC56609MJp.w5(true);
        }
    }

    public C56601MJh(ActivityC45651qj activityC45651qj, InterfaceC56609MJp interfaceC56609MJp) {
        this.LIZ = interfaceC56609MJp;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56605MJl.LJLIL);
        if (activityC45651qj != null) {
            ((C84754XOc) LIZIZ.getValue()).LIZJ(new WeakReference<>(activityC45651qj));
            C84754XOc c84754XOc = (C84754XOc) LIZIZ.getValue();
            c84754XOc.getClass();
            ((ArrayList) c84754XOc.LIZ).add(this);
        }
    }
}

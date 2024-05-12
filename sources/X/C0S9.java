package X;

import android.os.Build;

/* renamed from: X.0S9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0S9 {
    public static final C31451Lh LIZ = new C0SP() { // from class: X.1Lh
        public boolean LIZ;

        @Override // X.C0SP
        public final boolean LIZ() {
            return false;
        }

        @Override // X.C0SP
        public final void LJ(int i, long j, long j2) {
        }

        @Override // X.C0SP
        public final InterfaceC07790Sh LIZIZ() {
            return InterfaceC07790Sh.LJJJI;
        }

        @Override // X.C0SP
        public final boolean isEnabled() {
            return this.LIZ;
        }

        @Override // X.C0SP
        public final C23560wC LIZJ(long j) {
            return new C23560wC(C23560wC.LIZIZ);
        }

        @Override // X.C0SP
        public final C76800UCe LIZLLL(long j) {
            return C76800UCe.LIZ;
        }

        @Override // X.C0SP
        public final long LJFF(long j) {
            return C10370av.LIZIZ;
        }

        @Override // X.C0SP
        public final void setEnabled(boolean z) {
            this.LIZ = z;
        }
    };
    public static final InterfaceC07790Sh LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Lh] */
    static {
        InterfaceC07790Sh interfaceC07790Sh;
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC07790Sh = C77412UZs.LJJIIJ(C77412UZs.LJJIIJ(InterfaceC07790Sh.LJJJI, C49021wA.LJLIL), C49031wB.LJLIL);
        } else {
            interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
        }
        LIZIZ = interfaceC07790Sh;
    }
}

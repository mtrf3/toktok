package X;

/* renamed from: X.NtH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60779NtH extends OM2 {
    public final /* synthetic */ C60775NtD LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60779NtH(C60775NtD c60775NtD) {
        this.LJLIL = c60775NtD;
    }

    @Override // X.OM2
    public final void LJJIFFI(String str) {
        boolean z;
        C60775NtD c60775NtD = this.LJLIL;
        if (!c60775NtD.LJLJL && !c60775NtD.LJLJLJ) {
            z = true;
        } else {
            z = false;
        }
        c60775NtD.LJLJL = true;
        if (z) {
            try {
                C37735ErT c37735ErT = c60775NtD.LJLLILLLL;
                if (c37735ErT == null) {
                    C37735ErT c37735ErT2 = new C37735ErT(c60775NtD.LJLIL);
                    c60775NtD.LJLLILLLL = c37735ErT2;
                    c37735ErT2.LIZ(0, str);
                } else {
                    c37735ErT.LIZ(1, str);
                }
            } finally {
                this.LJLIL.LJLJL = false;
            }
        }
        super.LJJIFFI(str);
        if (z) {
            this.LJLIL.getClass();
        }
    }

    @Override // X.OM2
    public final void LJJII(String str, java.util.Map<String, String> map) {
        boolean z;
        C60775NtD c60775NtD = this.LJLIL;
        if (!c60775NtD.LJLJL && !c60775NtD.LJLJLJ) {
            z = true;
        } else {
            z = false;
        }
        c60775NtD.LJLJLJ = true;
        if (z) {
            try {
                C37735ErT c37735ErT = c60775NtD.LJLLILLLL;
                if (c37735ErT == null) {
                    C37735ErT c37735ErT2 = new C37735ErT(c60775NtD.LJLIL);
                    c60775NtD.LJLLILLLL = c37735ErT2;
                    c37735ErT2.LIZ(0, str);
                } else {
                    c37735ErT.LIZ(1, str);
                }
            } finally {
                this.LJLIL.LJLJLJ = false;
            }
        }
        super.LJJII(str, map);
        if (z) {
            this.LJLIL.getClass();
        }
    }
}

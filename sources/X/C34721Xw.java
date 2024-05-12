package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;

/* renamed from: X.1Xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34721Xw implements InterfaceC19290pJ {
    public final AbstractC03300Ba LIZ;
    public final C43511nH LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nH] */
    public C34721Xw(final WorkDatabase workDatabase) {
        this.LIZ = workDatabase;
        this.LIZIZ = new C1CG<C19280pI>(workDatabase) { // from class: X.1nH
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19280pI c19280pI) {
                C19280pI c19280pI2 = c19280pI;
                String str = c19280pI2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                Long l = c19280pI2.LIZIZ;
                if (l == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJIIIZ(2, l.longValue());
                }
            }
        };
    }

    public final Long LIZ(String str) {
        Long l;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT long_value FROM Preference where `key`=?");
        LIZJ.LJJII(1, str);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst() && !LIZIZ.isNull(0)) {
                l = Long.valueOf(LIZIZ.getLong(0));
                return l;
            }
            l = null;
            return l;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final void LIZIZ(C19280pI c19280pI) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJFF(c19280pI);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}

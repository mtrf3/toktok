package X;

import Y.IDd0S16S0000000;
import android.database.Cursor;

/* renamed from: X.1Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34731Xx implements InterfaceC19310pL {
    public final AbstractC03300Ba LIZ;
    public final C43521nI LIZIZ;
    public final IDd0S16S0000000 LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nI] */
    public C34731Xx(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C19300pK>(abstractC03300Ba) { // from class: X.1nI
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19300pK c19300pK) {
                String str = c19300pK.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                interfaceC37591dj.LJIIIZ(2, r5.LIZIZ);
            }
        };
        this.LIZJ = new IDd0S16S0000000(abstractC03300Ba, 1);
    }

    public final C19300pK LIZ(String str) {
        C19300pK c19300pK;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "work_spec_id");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "system_id");
            if (LIZIZ.moveToFirst()) {
                c19300pK = new C19300pK(LIZIZ.getString(LIZIZ2), LIZIZ.getInt(LIZIZ3));
            } else {
                c19300pK = null;
            }
            return c19300pK;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final void LIZIZ(C19300pK c19300pK) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJFF(c19300pK);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    public final void LIZJ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }
}

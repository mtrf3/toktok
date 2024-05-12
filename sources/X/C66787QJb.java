package X;

import android.content.SharedPreferences;

/* renamed from: X.QJb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66787QJb extends AbstractC48869JFx {
    public boolean LJII;
    public final QIF LJIIIIZZ;
    public final C48852JFg LJIIIZ;
    public final QJX LJIIJ;

    @Override // X.AbstractC48869JFx
    public final String LIZJ() {
        return "ac";
    }

    @Override // X.AbstractC48869JFx
    public final void LJ() {
    }

    @Override // X.AbstractC48869JFx
    public final void LJFF() {
    }

    @Override // X.AbstractC48869JFx
    public final long LJI() {
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        r10.LJII = true;
     */
    @Override // X.AbstractC48869JFx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66787QJb.LIZIZ():boolean");
    }

    @Override // X.AbstractC48869JFx
    public final void LIZ() {
        C66809QJx LIZ = C66789QJd.LIZIZ().LIZ(this.LJIIIIZZ.LIZ);
        QIF qif = this.LJIIIIZZ;
        SharedPreferences LIZ2 = C48847JFb.LIZ(qif.LIZJ, qif);
        SharedPreferences.Editor edit = LIZ2.edit();
        if (!LIZ2.getBoolean("is_first_activate_for_app", false) && edit != null) {
            edit.putBoolean("is_first_activate_for_app", true);
            edit.apply();
            LIZ.LJLJJI = true;
        }
        QIF qif2 = this.LJIIIIZZ;
        C66789QJd.LIZIZ().LIZ(qif2.LIZ).LLJZ(qif2, "dr_active_result");
    }

    @Override // X.AbstractC48869JFx
    public final long[] LIZLLL() {
        return C66790QJe.LJIILIIL;
    }

    @Override // X.AbstractC48869JFx
    public final void LJII(boolean z) {
        C66789QJd.LIZIZ().LIZ(this.LJIIIIZZ.LIZ).LJLJL = z;
    }

    @Override // X.AbstractC48869JFx
    public final void LJIIIIZZ(int i) {
        C66809QJx LIZ = C66789QJd.LIZIZ().LIZ(this.LIZIZ.LIZ);
        if (LIZ != null) {
            LIZ.LJLJI = i;
        }
    }

    public C66787QJb(QIF qif, C48852JFg c48852JFg) {
        super(qif.LIZJ, qif);
        this.LJII = false;
        this.LJIIIIZZ = qif;
        this.LJIIIZ = c48852JFg;
        C66765QIf c66765QIf = this.LJ;
        if (c66765QIf != null) {
            this.LJIIJ = c66765QIf.LJ;
        }
    }
}

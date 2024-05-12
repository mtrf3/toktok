package X;

import Y.IDcS135S0200000_1;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115404fw implements InterfaceC63352Otg<C63120Opw> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C115394fv LJLJJL;

    @Override // X.InterfaceC63352Otg
    public final C63120Opw LIZIZ() {
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL);
        if (LJIIIZ != null || (LJIIIZ = C63133Oq9.LJIIIZ(this.LJLIL, true)) != null) {
            if (!LJIIIZ.isStranger()) {
                ((CopyOnWriteArraySet) this.LJLJJL.LIZLLL).remove(this.LJLIL);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("StrangerManager find db already transferred, ignore:");
                LIZ.append(this.LJLIL);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                return LJIIIZ;
            }
            C63322OtC.LJFF("StrangerManager find db stranger conversation, do transfer");
            C63133Oq9.LJIJJ(this.LJLIL);
            LJIIIZ.setStranger(false);
            if (C63308Osy.LJI().LIZLLL().LJLJJI) {
                LJIIIZ.setFiltered(false);
            }
            C115284fk.LJIILIIL().LJJII(LJIIIZ);
        }
        this.LJLJJL.LIZJ.remove(this.LJLIL);
        C63356Otk LJIIIZ2 = C63356Otk.LJIIIZ();
        int i = this.LJLILLLLZI;
        String str = this.LJLIL;
        long j = this.LJLJI;
        int i2 = this.LJLJJI;
        IDcS135S0200000_1 iDcS135S0200000_1 = new IDcS135S0200000_1(this, LJIIIZ, 13);
        LJIIIZ2.getClass();
        C63356Otk.LJ(i, str, j, i2, iDcS135S0200000_1);
        return LJIIIZ;
    }

    public C115404fw(C115394fv c115394fv, String str, int i, long j, int i2) {
        this.LJLJJL = c115394fv;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = i2;
    }
}

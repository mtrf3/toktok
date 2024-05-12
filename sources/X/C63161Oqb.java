package X;

import android.util.Pair;

/* renamed from: X.Oqb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63161Oqb implements InterfaceC63352Otg<Pair<Boolean, C63120Opw>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ C63320OtA LJLJJI;

    @Override // X.InterfaceC63352Otg
    public final Pair<Boolean, C63120Opw> LIZIZ() {
        boolean LJI = C63150OqQ.LJI(this.LJLIL);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLILLLLZI);
        this.LJLJI.setDeleted(1);
        if (this.LJLJJI.LIZJ && C63150OqQ.LJIIJ(this.LJLILLLLZI) == null) {
            C63322OtC.LJFF("DeleteMsgHandler, stranger conversation message is empty, delete conversation");
            C63133Oq9.LJFF(this.LJLILLLLZI);
            if (LJIIIZ != null) {
                LJIIIZ.setLastShowMessage(null);
            }
            return new Pair<>(Boolean.valueOf(LJI), LJIIIZ);
        }
        if (LJI && LJIIIZ != null && ((LJIIIZ.getLastShowMessage() != null && this.LJLIL.equals(LJIIIZ.getLastShowMessage().getUuid())) || this.LJLJI.isMention())) {
            if (LJIIIZ.getLastShowMessage() != null && this.LJLIL.equals(LJIIIZ.getLastShowMessage().getUuid())) {
                C63133Oq9.LJJIFFI(C63150OqQ.LJIIJ(this.LJLILLLLZI));
            }
            return new Pair<>(Boolean.TRUE, C63133Oq9.LJIIIZ(this.LJLILLLLZI, true));
        }
        return new Pair<>(Boolean.valueOf(LJI), null);
    }

    public C63161Oqb(C63320OtA c63320OtA, String str, String str2, C109544Rq c109544Rq) {
        this.LJLJJI = c63320OtA;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c109544Rq;
    }
}

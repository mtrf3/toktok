package X;

import java.util.List;

/* renamed from: X.OsV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63279OsV implements InterfaceC63353Oth<List<C63120Opw>> {
    public final /* synthetic */ C63622Oy2 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C63280OsW LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(List<C63120Opw> list) {
        List<C63120Opw> list2 = list;
        C63337OtR.LJII(this.LJLIL, true).LIZ();
        if (list2 != null && !list2.isEmpty()) {
            for (C63120Opw c63120Opw : list2) {
                if (c63120Opw != null && c63120Opw.getConversationId() != null && C115284fk.LJIILIIL().LJIIIZ(c63120Opw.getConversationId()) == null) {
                    C115284fk.LJIILIIL().LJJII(c63120Opw);
                }
            }
        }
        this.LJLJJI.LIZJ(this.LJLILLLLZI, list2, this.LJLJI);
    }

    public C63279OsV(C63280OsW c63280OsW, C63622Oy2 c63622Oy2, long j, boolean z) {
        this.LJLJJI = c63280OsW;
        this.LJLIL = c63622Oy2;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }
}

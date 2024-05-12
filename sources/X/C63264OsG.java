package X;

import Y.ARunnableS29S0200000_10;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63264OsG implements InterfaceC63353Oth<Pair<C63120Opw, List<C63089OpR>>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;
    public final /* synthetic */ C63622Oy2 LJLJI;
    public final /* synthetic */ C63265OsH LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Pair<C63120Opw, List<C63089OpR>> pair) {
        Pair<C63120Opw, List<C63089OpR>> pair2 = pair;
        if (this.LJLJJI.LIZLLL) {
            if (pair2.first != null) {
                C115284fk.LJIILIIL().LJIJI(7, (C63120Opw) pair2.first);
            }
            Object obj = pair2.second;
            if (obj != null && !((List) obj).isEmpty()) {
                C115284fk.LJIILIIL().LJIJ(this.LJLIL, (List) pair2.second);
            }
        }
        ((CopyOnWriteArraySet) C63269OsL.LJI).remove(this.LJLIL);
        this.LJLJJI.LIZLLL(pair2.second);
        this.LJLILLLLZI.run();
        C63337OtR.LJII(this.LJLJI, true).LIZ();
    }

    public C63264OsG(C63265OsH c63265OsH, String str, ARunnableS29S0200000_10 aRunnableS29S0200000_10, C63622Oy2 c63622Oy2) {
        this.LJLJJI = c63265OsH;
        this.LJLIL = str;
        this.LJLILLLLZI = aRunnableS29S0200000_10;
        this.LJLJI = c63622Oy2;
    }
}

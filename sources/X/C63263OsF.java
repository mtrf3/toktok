package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63263OsF implements InterfaceC63353Oth<List<Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>>>> {
    public final /* synthetic */ java.util.Set LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ java.util.Map LJLJJI;
    public final /* synthetic */ C63267OsJ LJLJJL;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(List<Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>>> list) {
        java.util.Map map;
        List<Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>>> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>> pair : list2) {
                arrayList.add(((Pair) pair.first).first);
                if (this.LJLIL.contains(((C63120Opw) ((Pair) pair.first).first).getConversationId())) {
                    new C63265OsH(true).LJIILIIL(((C63120Opw) ((Pair) pair.first).first).getConversationId(), 0L, null);
                } else {
                    C115284fk.LJIILIIL().LJIJ(((C63120Opw) ((Pair) pair.first).first).getConversationId(), (List) pair.second);
                }
            }
            C115284fk.LJIILIIL().LJIJJ(true, 5, (C63120Opw[]) arrayList.toArray(new C63120Opw[arrayList.size()]));
        }
        C63337OtR.LJII(this.LJLILLLLZI, true).LIZ();
        if (!((CopyOnWriteArraySet) C63269OsL.LIZJ).contains(Integer.valueOf(this.LJLJI)) && !C63269OsL.LJFF(this.LJLJI)) {
            C63269OsL.LJIIL(this.LJLJI, 1);
        }
        if (this.LJLJJL.LIZJ && (map = this.LJLJJI) != null) {
            C63269OsL.LJIIIZ(this.LJLJI, map.keySet());
        }
    }

    public C63263OsF(int i, C63267OsJ c63267OsJ, C63622Oy2 c63622Oy2, java.util.Map map, java.util.Set set) {
        this.LJLJJL = c63267OsJ;
        this.LJLIL = set;
        this.LJLILLLLZI = c63622Oy2;
        this.LJLJI = i;
        this.LJLJJI = map;
    }
}

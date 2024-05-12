package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OqB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63135OqB<T> implements InterfaceC63352Otg {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ArrayList<C63120Opw> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ ArrayList<String> LJLJJI;

    public C63135OqB(int i, ArrayList<C63120Opw> arrayList, long j, ArrayList<String> arrayList2) {
        this.LJLIL = i;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = j;
        this.LJLJJI = arrayList2;
    }

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        List LJIILIIL = C63133Oq9.LJIILIIL(-1, -1L, EnumC97443s4.ALL);
        int size = ((ArrayList) LJIILIIL).size() - this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deleteOldConversions number of conversations to delete: ");
        LIZ.append(size);
        C63322OtC.LJI("ConversionListModelHelper ", X1D.LIZIZ(LIZ), null);
        for (C63120Opw c63120Opw : ORZ.LLIILII(LJIILIIL)) {
            if (this.LJLILLLLZI.size() >= size) {
                break;
            }
            if (c63120Opw.getUpdatedTime() <= this.LJLJI) {
                this.LJLILLLLZI.add(c63120Opw);
                this.LJLJJI.add(c63120Opw.getConversationId());
            }
        }
        ArrayList<String> arrayList = this.LJLJJI;
        if (arrayList != null && !arrayList.isEmpty()) {
            C63322OtC.LIZJ("IMConversationDao deleteConversations");
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                sb.append('\"');
                sb.append(next);
                sb.append("\",");
            }
            String sb2 = sb.toString();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete from conversation_list where ");
            LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
            LIZ2.append(" in (");
            LIZ2.append(sb2.substring(0, sb2.length() - 1));
            LIZ2.append(")");
            if (C78847Ux1.LJIL(X1D.LIZIZ(LIZ2))) {
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
            }
        }
        return this.LJLILLLLZI;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.OqV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63155OqV implements InterfaceC63352Otg, InterfaceC79760VSa {
    public final List LJLIL;

    @Override // X.InterfaceC79760VSa
    public int LIZ() {
        return this.LJLIL.size();
    }

    @Override // X.InterfaceC63352Otg
    public Object LIZIZ() {
        List list = this.LJLIL;
        C63322OtC.LIZJ("IMConversationDao getConversationIdWithShortId");
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_ID;
                LIZ.append(enumC63136OqC.key);
                LIZ.append(",");
                EnumC63136OqC enumC63136OqC2 = EnumC63136OqC.COLUMN_SHORT_ID;
                LIZ.append(enumC63136OqC2.key);
                LIZ.append(" from ");
                LIZ.append("conversation_list");
                LIZ.append(" where ");
                LIZ.append(enumC63136OqC.key);
                LIZ.append(" in ('");
                LIZ.append(C63312Ot2.LJII("','", list));
                LIZ.append("') ");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                if (interfaceC63132Oq8 != null) {
                    HashMap hashMap = new HashMap(interfaceC63132Oq8.getCount());
                    int columnIndex = interfaceC63132Oq8.getColumnIndex(enumC63136OqC.key);
                    int columnIndex2 = interfaceC63132Oq8.getColumnIndex(enumC63136OqC2.key);
                    while (interfaceC63132Oq8.moveToNext()) {
                        hashMap.put(interfaceC63132Oq8.getString(columnIndex), Long.valueOf(interfaceC63132Oq8.getLong(columnIndex2)));
                    }
                    return hashMap;
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationDao getConversationIdWithShortId ");
                LIZ2.append(e);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return new HashMap();
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public /* synthetic */ C63155OqV(List list) {
        this.LJLIL = list;
    }

    @Override // X.InterfaceC79760VSa
    public Object getItem(int i) {
        if (i >= 0 && i < this.LJLIL.size()) {
            return ListProtector.get(this.LJLIL, i);
        }
        return "";
    }
}

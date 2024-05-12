package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OqY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63158OqY extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends String>, List<String>> {
    public static final C63158OqY LJLIL = new C63158OqY();

    public C63158OqY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<String> invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        ArrayList LJ = AnonymousClass391.LJ(list2, "convIdList");
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_ID;
                LIZ.append(enumC63136OqC.key);
                LIZ.append(" from ");
                LIZ.append("conversation_list");
                LIZ.append(" where ");
                LIZ.append(enumC63136OqC.key);
                LIZ.append(" in ('");
                LIZ.append(C63312Ot2.LJII("','", list2));
                LIZ.append("') ");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                if (interfaceC63132Oq8 != null) {
                    int columnIndex = interfaceC63132Oq8.getColumnIndex(enumC63136OqC.key);
                    while (interfaceC63132Oq8.moveToNext()) {
                        LJ.add(interfaceC63132Oq8.getString(columnIndex));
                    }
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationDao getConvIdListBy", e);
                C63337OtR.LJFF(e);
            }
            return LJ;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OqW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C63156OqW extends TBS implements InterfaceC88472Yns<List<Long>, List<Long>> {
    public static final C63156OqW LJLIL = new C63156OqW();

    public C63156OqW() {
        super(1, C63150OqQ.class, "getMsgIdListBy", "getMsgIdListBy(Ljava/util/List;)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final List<Long> invoke(List<Long> list) {
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_SERVER_ID;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" from ");
                LIZ.append("msg");
                LIZ.append(" where ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" in ('");
                LIZ.append(C63312Ot2.LJII("','", list2));
                LIZ.append("') ");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                if (interfaceC63132Oq8 != null) {
                    int columnIndex = interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key);
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(Long.valueOf(interfaceC63132Oq8.getLong(columnIndex)));
                    }
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getMsgIdListBy", e);
                C63337OtR.LJFF(e);
            }
            return arrayList;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }
}

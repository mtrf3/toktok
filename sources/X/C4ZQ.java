package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZQ implements C3Q8 {
    public static final C4ZQ LIZIZ = new C4ZQ();

    @Override // X.C3Q8
    public final List<C3QL> LIZ(int i) {
        C4ZS.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SELECT * FROM im_search_content_official WHERE ");
            LIZ.append("business_type");
            LIZ.append("=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(i)});
            while (interfaceC63132Oq8.moveToNext()) {
                int columnIndex = interfaceC63132Oq8.getColumnIndex("business_type");
                int columnIndex2 = interfaceC63132Oq8.getColumnIndex("business_id");
                int columnIndex3 = interfaceC63132Oq8.getColumnIndex("content_type");
                int columnIndex4 = interfaceC63132Oq8.getColumnIndex("search_content");
                int columnIndex5 = interfaceC63132Oq8.getColumnIndex("update_time");
                int i2 = interfaceC63132Oq8.getInt(columnIndex);
                String string = interfaceC63132Oq8.getString(columnIndex2);
                o.LJIIIIZZ(string, "cursor.getString(businessIdIndex)");
                int i3 = interfaceC63132Oq8.getInt(columnIndex3);
                String string2 = interfaceC63132Oq8.getString(columnIndex4);
                o.LJIIIIZZ(string2, "cursor.getString(searchContentIndex)");
                arrayList.add(new C3QL(i2, interfaceC63132Oq8.getLong(columnIndex5), string, i3, string2));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return arrayList;
    }

    @Override // X.C3Q8
    public final int LIZIZ(List<C3QL> searchContentList) {
        Object LIZ;
        o.LJIIIZ(searchContentList, "searchContentList");
        C4ZS.LIZ.getClass();
        int i = 0;
        for (C3QL c3ql : searchContentList) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("business_type");
                LIZ2.append("=? AND ");
                LIZ2.append("business_id");
                LIZ2.append("=? AND ");
                LIZ2.append("content_type");
                LIZ2.append("=?");
                if (C78847Ux1.LJIJJ("im_search_content_official", X1D.LIZIZ(LIZ2), new String[]{String.valueOf(c3ql.LIZ), c3ql.LIZIZ, String.valueOf(c3ql.LIZJ)})) {
                    i++;
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C63322OtC.LJ("IMSearchDao", m10exceptionOrNullimpl);
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
    @Override // X.C3Q8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(java.util.List<X.C3QL> r14) {
        /*
            r13 = this;
            java.lang.String r5 = "IMSearchDao"
            java.lang.String r0 = "searchContentList"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            X.4ZS r0 = X.C4ZS.LIZ
            r0.getClass()
            java.lang.String r6 = "insertSearchContents"
            r12 = 0
            X.C78847Ux1.LJJLIIIJJI(r6)     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r11 = r14.iterator()     // Catch: java.lang.Throwable -> Ld1
            r10 = 0
        L17:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> Lce
            r8 = 1
            if (r0 == 0) goto Lc5
            java.lang.Object r7 = r11.next()     // Catch: java.lang.Throwable -> Lce
            X.3QL r7 = (X.C3QL) r7     // Catch: java.lang.Throwable -> Lce
            X.4ZS r0 = X.C4ZS.LIZ     // Catch: java.lang.Throwable -> Lce
            r0.getClass()     // Catch: java.lang.Throwable -> Lce
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lce
            r4.<init>()     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.LIZ     // Catch: java.lang.Throwable -> Lce
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r9 = "business_type"
            r4.put(r9, r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "business_id"
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lce
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = "content_type"
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r7.LIZLLL     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "search_content"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> Lce
            long r0 = r7.LJ     // Catch: java.lang.Throwable -> Lce
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "update_time"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lce
            r1.append(r9)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "=? AND "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lce
            r1.append(r3)     // Catch: java.lang.Throwable -> Lce
            r1.append(r0)     // Catch: java.lang.Throwable -> Lce
            r1.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "=?"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lce
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.LIZ     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lce
            r2[r12] = r0     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> Lce
            r2[r8] = r0     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lce
            r0 = 2
            r2[r0] = r1     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "im_search_content_official"
            boolean r2 = X.C78847Ux1.LJIJJ(r0, r3, r2)     // Catch: java.lang.Throwable -> Lce
            long r3 = X.C78847Ux1.LJJIL(r0, r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lce
            r1.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = " isDeleteSuccess "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lce
            r1.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = " isInsertSuccess "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lce
            r1.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lce
            X.C63322OtC.LIZIZ(r5, r0)     // Catch: java.lang.Throwable -> Lce
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L17
            int r10 = r10 + 1
            goto L17
        Lc5:
            X.C78847Ux1.LJIJJLI(r6, r8)     // Catch: java.lang.Throwable -> Lce
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lce
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lce
            goto Lda
        Lce:
            r0 = move-exception
            r12 = r10
            goto Ld2
        Ld1:
            r0 = move-exception
        Ld2:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r10 = r12
        Lda:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto Le3
            X.C63322OtC.LJ(r5, r0)
        Le3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4ZQ.LIZJ(java.util.List):int");
    }

    public final C86233Zz LIZLLL(InterfaceC70422pa scope, C86013Zd c86013Zd) {
        o.LJIIIZ(scope, "scope");
        return new C86233Zz(scope, c86013Zd);
    }
}

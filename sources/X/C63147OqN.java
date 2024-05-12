package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OqN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63147OqN {
    public static C63148OqO LIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C63148OqO c63148OqO = new C63148OqO();
        c63148OqO.LJLIL = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63145OqL.COLUMN_CONVERSATION_ID.key));
        c63148OqO.LJLILLLLZI = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63145OqL.COLUMN_USER_ID.key));
        c63148OqO.LIZIZ(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63145OqL.COLUMN_MIN_INDEX.key)));
        c63148OqO.LIZJ(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63145OqL.COLUMN_READ_INDEX.key)));
        c63148OqO.LIZLLL(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63145OqL.COLUMN_READ_ORDER.key)));
        return c63148OqO;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[Catch: all -> 0x01a2, Exception -> 0x01a5, TRY_LEAVE, TryCatch #8 {Exception -> 0x01a5, all -> 0x01a2, blocks: (B:11:0x00a4, B:13:0x00ae), top: B:10:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r15, java.util.Map<java.lang.Long, X.C63148OqO> r16) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63147OqN.LIZIZ(java.lang.String, java.util.Map):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map<java.lang.Long, X.OqO>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map<java.lang.Long, X.OqO>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static java.util.Map<Long, C63148OqO> LIZJ(String str, java.util.Map<Long, C63148OqO> map) {
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from participant_read where ");
                    LIZ.append(EnumC63145OqL.COLUMN_CONVERSATION_ID.key);
                    LIZ.append("=? ");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                    while (interfaceC63132Oq8.moveToNext()) {
                        arrayList.add(LIZ(interfaceC63132Oq8));
                    }
                } catch (Exception e) {
                    C63322OtC.LJ("IMConversationMemberReadDao getMemberList", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                }
            } finally {
                C63143OqJ.LIZ(interfaceC63132Oq8);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            map = map;
            while (i < size) {
                C63148OqO c63148OqO = (C63148OqO) ListProtector.get(arrayList, i);
                if (c63148OqO != null) {
                    long j = c63148OqO.LJLILLLLZI;
                    if (map == 0) {
                        map = new HashMap<>();
                        map.put(Long.valueOf(j), c63148OqO.clone());
                    } else {
                        C63148OqO c63148OqO2 = (C63148OqO) map.get(Long.valueOf(j));
                        if (c63148OqO2 == null) {
                            c63148OqO2 = new C63148OqO();
                        }
                        c63148OqO2.LJLIL = c63148OqO.LJLIL;
                        c63148OqO2.LJLILLLLZI = c63148OqO.LJLILLLLZI;
                        c63148OqO2.LIZIZ(c63148OqO.LJLJI);
                        c63148OqO2.LIZJ(c63148OqO.LJLJJI);
                        c63148OqO2.LIZLLL(c63148OqO.LJLJJL);
                        map.put(Long.valueOf(j), c63148OqO2);
                    }
                }
                i++;
                map = map;
            }
        }
        C63275OsR.LIZIZ().LJI(currentTimeMillis, "loadIndexInfoToMap");
        return map;
    }

    public static void LIZLLL(String str, List list) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(EnumC63145OqL.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? AND ");
                C78847Ux1.LJIJJ("participant_read", JBR.LJFF(LIZ, EnumC63145OqL.COLUMN_USER_ID.key, "=?", LIZ), new String[]{str, String.valueOf(next)});
            }
        }
    }
}

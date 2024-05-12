package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OqA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63134OqA {
    public static String LJ() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS mention(");
        EnumC63138OqE[] values = EnumC63138OqE.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC63138OqE enumC63138OqE = values[i];
            sb.append(enumC63138OqE.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC63138OqE.type, ",", i, 1);
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(");");
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        return C78847Ux1.LJIJJ("mention", JBR.LJFF(LIZ, EnumC63138OqE.COLUMN_UUID.key, "=?", LIZ), new String[]{str});
    }

    public static void LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        C78847Ux1.LJIJJ("mention", JBR.LJFF(LIZ, EnumC63138OqE.COLUMN_CONVERSATION_ID.key, "=?", LIZ), new String[]{str});
    }

    public static void LIZLLL(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append('\"');
            sb.append(str);
            sb.append("\",");
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete from mention where ");
        LIZ.append(EnumC63138OqE.COLUMN_CONVERSATION_ID.key);
        LIZ.append(" in (");
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(")");
        C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
    }

    public static void LJI(C109544Rq c109544Rq) {
        List<Long> mentionIds;
        if (!c109544Rq.isSelf() && (mentionIds = c109544Rq.getMentionIds()) != null && !mentionIds.isEmpty()) {
            if (!mentionIds.contains(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid())) && !mentionIds.contains(0L)) {
                return;
            }
            Boolean bool = Boolean.FALSE;
            InterfaceC63146OqM interfaceC63146OqM = null;
            try {
                try {
                    C63308Osy.LJI().LIZLLL().getClass();
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb.append(" replace into mention(");
                    boolean z = false;
                    for (EnumC63138OqE enumC63138OqE : EnumC63138OqE.values()) {
                        sb.append(enumC63138OqE.key);
                        sb.append(",");
                        sb2.append("?,");
                    }
                    String sb3 = sb.toString();
                    String sb4 = sb2.toString();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(sb3.substring(0, sb3.length() - 1));
                    LIZ.append(") values (");
                    LIZ.append(sb4.substring(0, sb4.length() - 1));
                    LIZ.append(");");
                    interfaceC63146OqM = C78847Ux1.LJIJ(X1D.LIZIZ(LIZ));
                    LIZ(interfaceC63146OqM, c109544Rq, mentionIds);
                    if (interfaceC63146OqM.LJIJJLI() > 0) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                } catch (Exception e) {
                    C63322OtC.LJ("IMMentionDao upsert", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                }
                C63143OqJ.LIZIZ(interfaceC63146OqM);
                bool.booleanValue();
            } catch (Throwable th) {
                C63143OqJ.LIZIZ(interfaceC63146OqM);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(long r7, java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = "select * from mention where "
            r5.append(r0)
            X.OqE r0 = X.EnumC63138OqE.COLUMN_CONVERSATION_ID
            java.lang.String r0 = r0.key
            r5.append(r0)
            java.lang.String r0 = "=? order by "
            r5.append(r0)
            X.OqE r0 = X.EnumC63138OqE.COLUMN_CREATED_TIME
            java.lang.String r1 = r0.key
            java.lang.String r0 = " desc"
            java.lang.String r5 = X.JBR.LJFF(r5, r1, r0, r5)
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            r0 = 0
            r1[r0] = r9     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            X.Oq8 r5 = X.C78847Ux1.LJJJLZIJ(r5, r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
        L3a:
            boolean r0 = r5.moveToNext()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            if (r0 == 0) goto L70
            X.OqE r0 = X.EnumC63138OqE.COLUMN_IDS_STR     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            boolean r0 = X.C63312Ot2.LJI(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            if (r0 == 0) goto L3a
            X.OqE r0 = X.EnumC63138OqE.COLUMN_UUID     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            r4.add(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L88
            goto L3a
        L62:
            r1 = move-exception
            goto L68
        L64:
            r0 = move-exception
            goto L8a
        L66:
            r1 = move-exception
            r5 = r6
        L68:
            java.lang.String r0 = "IMMentionDao getMentionMsg"
            X.C63322OtC.LJ(r0, r1)     // Catch: java.lang.Throwable -> L88
            X.C63337OtR.LJFF(r1)     // Catch: java.lang.Throwable -> L88
        L70:
            X.C63143OqJ.LIZ(r5)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7a
            return r6
        L7a:
            java.util.List r4 = X.C63150OqQ.LJIILLIIL(r7, r4)
            X.OsR r1 = X.C63275OsR.LIZIZ()
            java.lang.String r0 = "getUnreadSelfMentionedMsg"
            r1.LJI(r2, r0)
            return r4
        L88:
            r0 = move-exception
            r6 = r5
        L8a:
            X.C63143OqJ.LIZ(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63134OqA.LJFF(long, java.lang.String):java.util.List");
    }

    public static void LIZ(InterfaceC63146OqM interfaceC63146OqM, C109544Rq c109544Rq, List<Long> list) {
        if (interfaceC63146OqM == null || c109544Rq == null) {
            return;
        }
        int ordinal = EnumC63138OqE.COLUMN_UUID.ordinal() + 1;
        String uuid = c109544Rq.getUuid();
        String str = "";
        if (uuid == null) {
            uuid = "";
        }
        interfaceC63146OqM.LJJII(ordinal, uuid);
        int ordinal2 = EnumC63138OqE.COLUMN_CONVERSATION_ID.ordinal() + 1;
        String conversationId = c109544Rq.getConversationId();
        if (conversationId != null) {
            str = conversationId;
        }
        interfaceC63146OqM.LJJII(ordinal2, str);
        interfaceC63146OqM.LJJII(EnumC63138OqE.COLUMN_IDS_STR.ordinal() + 1, C63312Ot2.LJII(",", list));
        interfaceC63146OqM.LJIIIZ(EnumC63138OqE.COLUMN_SENDER_ID.ordinal() + 1, c109544Rq.getSender());
        interfaceC63146OqM.LJIIIZ(EnumC63138OqE.COLUMN_CREATED_TIME.ordinal() + 1, c109544Rq.getCreatedAt());
    }
}

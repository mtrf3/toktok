package X;

import android.content.Context;
import android.text.TextUtils;
import defpackage.i0;

/* renamed from: X.OqJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63143OqJ {
    public static volatile C63143OqJ LIZJ;
    public String LIZ;
    public InterfaceC63149OqP LIZIZ;

    public final InterfaceC78848Ux2 LJI() {
        InterfaceC63149OqP interfaceC63149OqP;
        synchronized (this) {
            String LJFF = LJFF();
            if (TextUtils.isEmpty(LJFF)) {
                C63322OtC.LIZLLL("IMDBHelper getOpenHelper, db name invalid");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isLogin=");
                LIZ.append(C63308Osy.LJI().LJ);
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isEmptyBridge=");
                LIZ2.append(C63308Osy.LJI().LIZIZ() instanceof C114714ep);
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                C63275OsR LIZIZ3 = C63275OsR.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Invalid DB Name ");
                LIZ3.append(LIZIZ);
                LIZ3.append(" ");
                LIZ3.append(LIZIZ2);
                LIZIZ3.LJII(0, "getOpenHelper", new IllegalArgumentException(X1D.LIZIZ(LIZ3)));
                return null;
            }
            try {
            } catch (Exception e) {
                C63322OtC.LJ("IMDBHelper getOpenHelper", e);
                C63275OsR.LIZIZ().LJII(0, "getOpenHelper", e);
            }
            if (this.LIZIZ == null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("IMDBHelper getOpenHelper, create new:");
                LIZ4.append(LJFF);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
                interfaceC63149OqP = LIZJ(LJFF);
                this.LIZIZ = interfaceC63149OqP;
            } else if (LJFF.equals(this.LIZ)) {
                interfaceC63149OqP = this.LIZIZ;
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("IMDBHelper getOpenHelper, close previous:");
                LIZ5.append(this.LIZ);
                LIZ5.append(", create new:");
                LIZ5.append(LJFF);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ5));
                this.LIZIZ.close();
                this.LIZIZ = LIZJ(LJFF);
                interfaceC63149OqP = this.LIZIZ;
            }
            if (interfaceC63149OqP == null) {
                return null;
            }
            return interfaceC63149OqP.LIZ();
        }
    }

    public static C63143OqJ LJII() {
        if (LIZJ == null) {
            synchronized (C63143OqJ.class) {
                if (LIZJ == null) {
                    LIZJ = new C63143OqJ();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZLLL() {
        C63322OtC.LJFF("IMDBHelper deleteDatabase start");
        InterfaceC63149OqP interfaceC63149OqP = this.LIZIZ;
        if (interfaceC63149OqP != null) {
            interfaceC63149OqP.close();
        }
        C63308Osy.LJI().LIZ.deleteDatabase(this.LIZ);
        Context context = C63308Osy.LJI().LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("encrypted_");
        LIZ.append(this.LIZ);
        context.deleteDatabase(X1D.LIZIZ(LIZ));
        this.LIZIZ = null;
        C63322OtC.LJFF("IMDBHelper deleteDatabase end");
    }

    public static String LJFF() {
        long uid = C63308Osy.LJI().LIZIZ().getUid();
        if (uid <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBHelper getDBName, uid invalid: ");
            LIZ.append(uid);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            return null;
        }
        C63308Osy.LJI().LIZLLL().getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(uid);
        LIZ2.append("_im.db");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (!C63308Osy.LJI().LIZIZ().LIZJ()) {
            return i0.LJFF("sub_", LIZIZ);
        }
        return LIZIZ;
    }

    public static void LIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        if (interfaceC63132Oq8 != null) {
            try {
                interfaceC63132Oq8.close();
            } catch (Exception e) {
                C63322OtC.LJ("close cursor", e);
                C63337OtR.LJFF(e);
            }
        }
    }

    public static void LIZIZ(InterfaceC63146OqM interfaceC63146OqM) {
        if (interfaceC63146OqM != null) {
            try {
                interfaceC63146OqM.close();
            } catch (Exception e) {
                C63322OtC.LJ("close sqLiteStatement", e);
                C63337OtR.LJFF(e);
            }
        }
    }

    public static String LJ(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 <= i3) {
                sb.append("?");
                if (i2 != i3) {
                    sb.append(",");
                }
                i2++;
            } else {
                return sb.toString();
            }
        }
    }

    public static void LJIIIIZZ(InterfaceC78848Ux2 interfaceC78848Ux2) {
        C63322OtC.LJFF("IMDBHelper onCreate");
        StringBuilder sb = new StringBuilder("create table if not exists conversation_list (");
        EnumC63136OqC[] values = EnumC63136OqC.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            EnumC63136OqC enumC63136OqC = values[i2];
            sb.append(enumC63136OqC.key);
            sb.append(" ");
            i2 = C0EH.LIZIZ(sb, enumC63136OqC.type, ",", i2, 1);
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(");");
        String LIZIZ = X1D.LIZIZ(LIZ);
        C63291Osh.LIZ().getClass();
        C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"), true);
        interfaceC78848Ux2.LJJIJIIJI(LIZIZ);
        StringBuilder sb3 = new StringBuilder("CREATE TABLE IF NOT EXISTS msg(");
        EnumC63154OqU[] values2 = EnumC63154OqU.values();
        int length2 = values2.length;
        int i3 = 0;
        while (i3 < length2) {
            EnumC63154OqU enumC63154OqU = values2[i3];
            sb3.append(enumC63154OqU.key);
            sb3.append(" ");
            i3 = C0EH.LIZIZ(sb3, enumC63154OqU.type, ",", i3, 1);
        }
        String sb4 = sb3.toString();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(sb4.substring(0, sb4.length() - 1));
        LIZ2.append(");");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ2));
        StringBuilder sb5 = new StringBuilder("create table if not exists attchment (");
        EnumC117884jw[] values3 = EnumC117884jw.values();
        int length3 = values3.length;
        int i4 = 0;
        while (i4 < length3) {
            EnumC117884jw enumC117884jw = values3[i4];
            sb5.append(enumC117884jw.key);
            sb5.append(" ");
            i4 = C0EH.LIZIZ(sb5, enumC117884jw.type, ",", i4, 1);
        }
        String sb6 = sb5.toString();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(sb6.substring(0, sb6.length() - 1));
        LIZ3.append(");");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ3));
        StringBuilder sb7 = new StringBuilder("CREATE TABLE IF NOT EXISTS participant(");
        EnumC63126Oq2[] values4 = EnumC63126Oq2.values();
        int length4 = values4.length;
        int i5 = 0;
        while (i5 < length4) {
            EnumC63126Oq2 enumC63126Oq2 = values4[i5];
            sb7.append(enumC63126Oq2.key);
            sb7.append(" ");
            i5 = C0EH.LIZIZ(sb7, enumC63126Oq2.type, ",", i5, 1);
        }
        String sb8 = sb7.toString();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(sb8.substring(0, sb8.length() - 1));
        LIZ4.append(");");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ4));
        interfaceC78848Ux2.LJJIJIIJI(C63112Opo.LJ());
        interfaceC78848Ux2.LJJIJIIJI(C63113Opp.LIZLLL());
        C63131Oq7.LIZ(interfaceC78848Ux2);
        interfaceC78848Ux2.LJJIJIIJI(C63134OqA.LJ());
        StringBuilder sb9 = new StringBuilder("CREATE TABLE IF NOT EXISTS participant_read(");
        EnumC63145OqL[] values5 = EnumC63145OqL.values();
        int length5 = values5.length;
        int i6 = 0;
        while (i6 < length5) {
            EnumC63145OqL enumC63145OqL = values5[i6];
            sb9.append(enumC63145OqL.key);
            sb9.append(" ");
            i6 = C0EH.LIZIZ(sb9, enumC63145OqL.type, ",", i6, 1);
        }
        String sb10 = sb9.toString();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(sb10.substring(0, sb10.length() - 1));
        LIZ5.append(");");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ5));
        StringBuilder sb11 = new StringBuilder("CREATE TABLE IF NOT EXISTS msg_property_new(");
        EnumC63157OqX[] values6 = EnumC63157OqX.values();
        int length6 = values6.length;
        int i7 = 0;
        while (i7 < length6) {
            EnumC63157OqX enumC63157OqX = values6[i7];
            sb11.append(enumC63157OqX.key);
            sb11.append(" ");
            i7 = C0EH.LIZIZ(sb11, enumC63157OqX.type, ",", i7, 1);
        }
        sb11.append("PRIMARY KEY(");
        sb11.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
        sb11.append(",");
        sb11.append(EnumC63157OqX.COLUMN_KEY.key);
        sb11.append(",");
        sb11.append(EnumC63157OqX.COLUMN_IDEMPOTENT_ID.key);
        sb11.append("));");
        interfaceC78848Ux2.LJJIJIIJI(sb11.toString());
        interfaceC78848Ux2.LJJIJIIJI(C63171Oql.LIZIZ());
        interfaceC78848Ux2.LJJIJIIJI(C63172Oqm.LIZIZ());
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("CREATE INDEX UID_INDEX ON msg(");
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("CREATE INDEX MSG_UUID_INDEX ON msg(");
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("CREATE INDEX CONVERSATION_INDEX ON msg(");
        LIZ8.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
        LIZ8.append(",");
        String[] strArr = {JBR.LJFF(LIZ6, EnumC63154OqU.COLUMN_SERVER_ID.key, ")", LIZ6), JBR.LJFF(LIZ7, EnumC63154OqU.COLUMN_MSG_ID.key, ")", LIZ7), JBR.LJFF(LIZ8, EnumC63154OqU.COLUMN_INNER_INDEX.key, ")", LIZ8)};
        int i8 = 0;
        do {
            interfaceC78848Ux2.LJJIJIIJI(strArr[i8]);
            i8++;
        } while (i8 < 3);
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("create index MEMBER_CONVERSATION_INDEX on participant(");
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("create index USER_ID_INDEX on participant(");
        String[] strArr2 = {JBR.LJFF(LIZ9, EnumC63126Oq2.COLUMN_CONVERSATION_ID.key, ")", LIZ9), JBR.LJFF(LIZ10, EnumC63126Oq2.COLUMN_USER_ID.key, ")", LIZ10)};
        int i9 = 0;
        do {
            interfaceC78848Ux2.LJJIJIIJI(strArr2[i9]);
            i9++;
        } while (i9 < 2);
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("create index id_index on conversation_kv(");
        LIZ11.append(EnumC63177Oqr.COLUMN_CONV_ID.key);
        LIZ11.append(")");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ11));
        String[] LIZJ2 = C63172Oqm.LIZJ();
        do {
            interfaceC78848Ux2.LJJIJIIJI(LIZJ2[i]);
            i++;
        } while (i < 2);
        StringBuilder LIZ12 = X1D.LIZ();
        LIZ12.append("create index attchment_index on attchment(");
        LIZ12.append(EnumC117884jw.COLUMN_UUID.key);
        LIZ12.append(")");
        interfaceC78848Ux2.LJJIJIIJI(X1D.LIZIZ(LIZ12));
        C47922IrO.LIZ();
        C47922IrO.LIZ();
        C4ZS.LIZ.getClass();
        C4ZS.LIZIZ(interfaceC78848Ux2);
    }

    public final InterfaceC63149OqP LIZJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMDBHelper createOpenHelper, dbName:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C63308Osy.LJI().LIZIZ().LJIILL();
        this.LIZ = str;
        Context context = C63308Osy.LJI().LIZ;
        if (C63308Osy.LJI().LIZLLL().LJII) {
            C63308Osy.LJI().LIZLLL().getClass();
            if (TextUtils.isEmpty(null)) {
                return new X7W(context, this.LIZ);
            }
            throw null;
        }
        return new C78850Ux4(context, this.LIZ);
    }

    public final void LJIIIZ(int i, int i2) {
        StringBuilder LIZJ2 = C06460Ne.LIZJ("IMDBHelper onDowngrade, oldVersion:", i, ",newVersion:", i2, ", mDBName:");
        LIZJ2.append(this.LIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
        if (!C63272OsO.LIZIZ) {
            C63323OtD LIZJ3 = C63144OqK.LIZJ("im_sdk_db_downgrade");
            LIZJ3.LIZ(Integer.valueOf(i), "old_version");
            LIZJ3.LIZ(Integer.valueOf(i2), "new_version");
            LIZJ3.LIZLLL();
        }
        C63272OsO.LIZIZ = true;
        C63308Osy.LJI().LJIIJJI(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        if (r10 < 21) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0345, code lost:
    
        if (r10 < 48) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[Catch: Exception -> 0x0491, TRY_LEAVE, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec A[Catch: Exception -> 0x0491, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x048d A[Catch: Exception -> 0x0491, TRY_LEAVE, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0349 A[Catch: Exception -> 0x0491, TRY_ENTER, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175 A[Catch: Exception -> 0x0491, TRY_ENTER, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115 A[Catch: Exception -> 0x0491, TRY_ENTER, TryCatch #0 {Exception -> 0x0491, blocks: (B:3:0x0001, B:5:0x001e, B:9:0x002b, B:10:0x0030, B:14:0x0059, B:15:0x0067, B:16:0x0071, B:17:0x0074, B:18:0x007b, B:19:0x0080, B:22:0x00ab, B:23:0x00b5, B:24:0x00ba, B:25:0x00bf, B:26:0x00c4, B:27:0x00c9, B:28:0x00ce, B:30:0x00da, B:33:0x00ec, B:45:0x0274, B:46:0x0293, B:47:0x02b0, B:48:0x02ca, B:49:0x0301, B:64:0x0450, B:66:0x048d, B:71:0x0433, B:72:0x0416, B:73:0x03f9, B:74:0x03da, B:75:0x03a0, B:76:0x0383, B:77:0x0349, B:90:0x0244, B:91:0x0250, B:95:0x0175, B:96:0x014e, B:97:0x0115, B:100:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(X.InterfaceC78848Ux2 r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63143OqJ.LJIIJ(X.Ux2, int, int):void");
    }
}

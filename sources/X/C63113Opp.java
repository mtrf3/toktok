package X;

import android.text.TextUtils;

/* renamed from: X.Opp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63113Opp {
    public static String LIZLLL() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_setting (");
        EnumC63115Opr[] values = EnumC63115Opr.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC63115Opr enumC63115Opr = values[i];
            sb.append(enumC63115Opr.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC63115Opr.type, ",", i, 1);
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(");");
        return X1D.LIZIZ(LIZ);
    }

    public static C63090OpS LIZJ(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        r2 = null;
        r2 = null;
        C63090OpS c63090OpS = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select * from conversation_setting where ");
            LIZ.append(EnumC63115Opr.COLUMN_ID.key);
            LIZ.append("=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
            try {
                try {
                    if (interfaceC63132Oq8.moveToFirst()) {
                        c63090OpS = LIZIZ(interfaceC63132Oq8, new C63116Ops(interfaceC63132Oq8));
                    }
                } catch (Exception e) {
                    e = e;
                    C63322OtC.LJ("IMConversationSettingDao get ", e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return c63090OpS;
                }
            } catch (Throwable th) {
                th = th;
                interfaceC63132Oq82 = interfaceC63132Oq8;
                C63143OqJ.LIZ(interfaceC63132Oq82);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            C63143OqJ.LIZ(interfaceC63132Oq82);
            throw th;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return c63090OpS;
    }

    public static boolean LJ(C63090OpS c63090OpS) {
        boolean z = false;
        if (c63090OpS == null || TextUtils.isEmpty(c63090OpS.getConversationId())) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        InterfaceC63146OqM interfaceC63146OqM = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into conversation_setting(");
                for (EnumC63115Opr enumC63115Opr : EnumC63115Opr.values()) {
                    sb.append(enumC63115Opr.key);
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
                LIZ(interfaceC63146OqM, c63090OpS);
                if (interfaceC63146OqM.LJIJJLI() > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationSettingDao insertOrUpdate", e);
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZIZ(interfaceC63146OqM);
            return bool.booleanValue();
        } catch (Throwable th) {
            C63143OqJ.LIZIZ(interfaceC63146OqM);
            throw th;
        }
    }

    public static void LIZ(InterfaceC63146OqM interfaceC63146OqM, C63090OpS c63090OpS) {
        if (interfaceC63146OqM == null || c63090OpS == null) {
            return;
        }
        interfaceC63146OqM.LJJIIZI();
        int ordinal = EnumC63115Opr.COLUMN_ID.ordinal() + 1;
        String conversationId = c63090OpS.getConversationId();
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        interfaceC63146OqM.LJJII(ordinal, conversationId);
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_VERSION.ordinal() + 1, c63090OpS.getVersion());
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_STICK_TOP.ordinal() + 1, c63090OpS.getStickTop());
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_MUTE.ordinal() + 1, c63090OpS.getMute());
        int ordinal2 = EnumC63115Opr.COLUMN_EXT.ordinal() + 1;
        String extStr = c63090OpS.getExtStr();
        if (extStr != null) {
            str = extStr;
        }
        interfaceC63146OqM.LJJII(ordinal2, str);
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_FAVORITE.ordinal() + 1, c63090OpS.getFavor());
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_SET_TOP_TIME.ordinal() + 1, c63090OpS.getSetTopTime());
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_SET_FAVORITE_TIME.ordinal() + 1, c63090OpS.getSetFavoriteTime());
        interfaceC63146OqM.LJIIIZ(EnumC63115Opr.COLUMN_CATEGORY.ordinal() + 1, c63090OpS.getCategory());
    }

    public static C63090OpS LIZIZ(InterfaceC63132Oq8 interfaceC63132Oq8, C63116Ops c63116Ops) {
        if (interfaceC63132Oq8 == null || c63116Ops == null) {
            return null;
        }
        C63090OpS c63090OpS = new C63090OpS();
        c63090OpS.setConversationId(interfaceC63132Oq8.getString(c63116Ops.LIZ));
        c63090OpS.setVersion(interfaceC63132Oq8.getLong(c63116Ops.LIZIZ));
        c63090OpS.setStickTop(interfaceC63132Oq8.getInt(c63116Ops.LIZJ));
        c63090OpS.setMute(interfaceC63132Oq8.getInt(c63116Ops.LIZLLL));
        c63090OpS.setExtStr(interfaceC63132Oq8.getString(c63116Ops.LJ));
        c63090OpS.setFavor(interfaceC63132Oq8.getInt(c63116Ops.LJFF));
        c63090OpS.setSetTopTime(interfaceC63132Oq8.getInt(c63116Ops.LJI));
        c63090OpS.setSetFavoriteTime(interfaceC63132Oq8.getInt(c63116Ops.LJII));
        c63090OpS.setCategory(interfaceC63132Oq8.getInt(c63116Ops.LJIIIIZZ));
        return c63090OpS;
    }
}

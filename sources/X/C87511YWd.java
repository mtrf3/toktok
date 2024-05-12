package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YWd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87511YWd implements YWB {
    public final AbstractC03300Ba LIZ;
    public final YW9 LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;
    public final IDd0S18S0000000_15 LIZLLL;

    @Override // X.YWB
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.YWB
    public final int LIZLLL() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT COUNT(*) FROM SIMPLE_USER");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                i = LIZIZ.getInt(0);
            }
            return i;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWB
    public final List<String> LJFF() {
        String string;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT UID FROM SIMPLE_USER");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWB
    public final int LJIILL() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "\n        SELECT COUNT(*) FROM SIMPLE_USER\n        WHERE FOLLOW_STATUS != -1\n        AND COLUMN_USER_SHARE_STATUS != 2\n    ");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                i = LIZIZ.getInt(0);
            }
            return i;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWB
    public final List<YW6> getAll() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM SIMPLE_USER");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i3 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ37);
                    int i5 = LIZIZ.getInt(LIZIZ38);
                    int i6 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList.add(new YW6(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, str, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C87511YWd(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YW9(abstractC03300Ba);
        new YWH(abstractC03300Ba);
        this.LIZJ = new IDd0S18S0000000_15(abstractC03300Ba, 18);
        this.LIZLLL = new IDd0S18S0000000_15(abstractC03300Ba, 19);
    }

    public static YW6 LJIILLIIL(Cursor cursor) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        int i2;
        long j;
        long j2;
        long j3;
        int i3;
        Integer valueOf7;
        int i4;
        int i5;
        int i6;
        int i7;
        int columnIndex = cursor.getColumnIndex("UID");
        int columnIndex2 = cursor.getColumnIndex("SEC_UID");
        int columnIndex3 = cursor.getColumnIndex("NICK_NAME");
        int columnIndex4 = cursor.getColumnIndex("SIGNATURE");
        int columnIndex5 = cursor.getColumnIndex("AVATAR_THUMB");
        int columnIndex6 = cursor.getColumnIndex("FOLLOW_STATUS");
        int columnIndex7 = cursor.getColumnIndex("UNIQUE_ID");
        int columnIndex8 = cursor.getColumnIndex("WEIBO_VERIFY");
        int columnIndex9 = cursor.getColumnIndex("CUSTOM_VERIFY");
        int columnIndex10 = cursor.getColumnIndex("ENTERPRISE_VERIFY_REASON");
        int columnIndex11 = cursor.getColumnIndex("VERIFICATION_TYPE");
        int columnIndex12 = cursor.getColumnIndex("REMARK_NAME");
        int columnIndex13 = cursor.getColumnIndex("SORT_WEIGHT");
        int columnIndex14 = cursor.getColumnIndex("INITIAL_LETTER");
        int columnIndex15 = cursor.getColumnIndex("SHORT_ID");
        int columnIndex16 = cursor.getColumnIndex("REMARK_PINYIN");
        int columnIndex17 = cursor.getColumnIndex("REMARK_INITIAL");
        int columnIndex18 = cursor.getColumnIndex("NICK_NAME_PINYIN");
        int columnIndex19 = cursor.getColumnIndex("NICK_NAME_INITIAL");
        int columnIndex20 = cursor.getColumnIndex("COMMERCE_USER_LEVEL");
        int columnIndex21 = cursor.getColumnIndex("COLUMN_CONTACT_NAME");
        int columnIndex22 = cursor.getColumnIndex("COLUMN_CONTACT_NAME_PINYIN");
        int columnIndex23 = cursor.getColumnIndex("COLUMN_CONTACT_NAME_INITIAL");
        int columnIndex24 = cursor.getColumnIndex("COLUMN_USER_SHARE_STATUS");
        int columnIndex25 = cursor.getColumnIndex("USER_FRIEND_REC_TYPE");
        int columnIndex26 = cursor.getColumnIndex("USER_FRIEND_REC_TIME");
        int columnIndex27 = cursor.getColumnIndex("USER_FOLLOW_TIME");
        int columnIndex28 = cursor.getColumnIndex("BLOCK_STATUS");
        int columnIndex29 = cursor.getColumnIndex("MENTION_ENABLED");
        int columnIndex30 = cursor.getColumnIndex("COMMENT_MENTION_BLOCK_STATUS");
        int columnIndex31 = cursor.getColumnIndex("VIDEO_MENTION_BLOCK_STATUS");
        int columnIndex32 = cursor.getColumnIndex("VIDEO_TAG_BLOCK_STATUS");
        int columnIndex33 = cursor.getColumnIndex("QA_INVITE_BLOCK_STATUS");
        int columnIndex34 = cursor.getColumnIndex("FOLLOWER_STATUS");
        int columnIndex35 = cursor.getColumnIndex("ACCOUNT_TYPE");
        int columnIndex36 = cursor.getColumnIndex("FOLLOWER_COUNT");
        int columnIndex37 = cursor.getColumnIndex("FOLLOWING_COUNT");
        int columnIndex38 = cursor.getColumnIndex("INTERNAL_SHARE_HOLD_OUT_VERSION");
        int columnIndex39 = cursor.getColumnIndex("AVATAR_MEDIUM");
        int columnIndex40 = cursor.getColumnIndex("WELCOME_MESSAGE_ENABLED");
        String str = null;
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            string = null;
        } else {
            string = cursor.getString(columnIndex);
        }
        if (columnIndex2 == -1 || cursor.isNull(columnIndex2)) {
            string2 = null;
        } else {
            string2 = cursor.getString(columnIndex2);
        }
        if (columnIndex3 == -1 || cursor.isNull(columnIndex3)) {
            string3 = null;
        } else {
            string3 = cursor.getString(columnIndex3);
        }
        if (columnIndex4 == -1 || cursor.isNull(columnIndex4)) {
            string4 = null;
        } else {
            string4 = cursor.getString(columnIndex4);
        }
        if (columnIndex5 == -1 || cursor.isNull(columnIndex5)) {
            string5 = null;
        } else {
            string5 = cursor.getString(columnIndex5);
        }
        if (columnIndex6 == -1) {
            i = 0;
        } else {
            i = cursor.getInt(columnIndex6);
        }
        if (columnIndex7 == -1 || cursor.isNull(columnIndex7)) {
            string6 = null;
        } else {
            string6 = cursor.getString(columnIndex7);
        }
        if (columnIndex8 == -1 || cursor.isNull(columnIndex8)) {
            string7 = null;
        } else {
            string7 = cursor.getString(columnIndex8);
        }
        if (columnIndex9 == -1 || cursor.isNull(columnIndex9)) {
            string8 = null;
        } else {
            string8 = cursor.getString(columnIndex9);
        }
        if (columnIndex10 == -1 || cursor.isNull(columnIndex10)) {
            string9 = null;
        } else {
            string9 = cursor.getString(columnIndex10);
        }
        if (columnIndex11 == -1 || cursor.isNull(columnIndex11)) {
            string10 = null;
        } else {
            string10 = cursor.getString(columnIndex11);
        }
        if (columnIndex12 == -1 || cursor.isNull(columnIndex12)) {
            string11 = null;
        } else {
            string11 = cursor.getString(columnIndex12);
        }
        if (columnIndex13 == -1 || cursor.isNull(columnIndex13)) {
            string12 = null;
        } else {
            string12 = cursor.getString(columnIndex13);
        }
        if (columnIndex14 == -1 || cursor.isNull(columnIndex14)) {
            string13 = null;
        } else {
            string13 = cursor.getString(columnIndex14);
        }
        if (columnIndex15 == -1 || cursor.isNull(columnIndex15)) {
            string14 = null;
        } else {
            string14 = cursor.getString(columnIndex15);
        }
        if (columnIndex16 == -1 || cursor.isNull(columnIndex16)) {
            string15 = null;
        } else {
            string15 = cursor.getString(columnIndex16);
        }
        if (columnIndex17 == -1 || cursor.isNull(columnIndex17)) {
            string16 = null;
        } else {
            string16 = cursor.getString(columnIndex17);
        }
        if (columnIndex18 == -1 || cursor.isNull(columnIndex18)) {
            string17 = null;
        } else {
            string17 = cursor.getString(columnIndex18);
        }
        if (columnIndex19 == -1 || cursor.isNull(columnIndex19)) {
            string18 = null;
        } else {
            string18 = cursor.getString(columnIndex19);
        }
        if (columnIndex20 == -1 || cursor.isNull(columnIndex20)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(columnIndex20));
        }
        if (columnIndex21 == -1 || cursor.isNull(columnIndex21)) {
            string19 = null;
        } else {
            string19 = cursor.getString(columnIndex21);
        }
        if (columnIndex22 == -1 || cursor.isNull(columnIndex22)) {
            string20 = null;
        } else {
            string20 = cursor.getString(columnIndex22);
        }
        if (columnIndex23 == -1 || cursor.isNull(columnIndex23)) {
            string21 = null;
        } else {
            string21 = cursor.getString(columnIndex23);
        }
        if (columnIndex24 == -1 || cursor.isNull(columnIndex24)) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(cursor.getInt(columnIndex24));
        }
        if (columnIndex25 == -1 || cursor.isNull(columnIndex25)) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(cursor.getInt(columnIndex25));
        }
        if (columnIndex26 == -1 || cursor.isNull(columnIndex26)) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(cursor.getLong(columnIndex26));
        }
        if (columnIndex27 == -1 || cursor.isNull(columnIndex27)) {
            valueOf5 = null;
        } else {
            valueOf5 = Long.valueOf(cursor.getLong(columnIndex27));
        }
        if (columnIndex28 == -1 || cursor.isNull(columnIndex28)) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(cursor.getInt(columnIndex28));
        }
        if (columnIndex29 == -1) {
            i2 = 0;
        } else {
            i2 = cursor.getInt(columnIndex29);
        }
        long j4 = 0;
        if (columnIndex30 == -1) {
            j = 0;
        } else {
            j = cursor.getLong(columnIndex30);
        }
        if (columnIndex31 == -1) {
            j2 = 0;
        } else {
            j2 = cursor.getLong(columnIndex31);
        }
        if (columnIndex32 == -1) {
            j3 = 0;
        } else {
            j3 = cursor.getLong(columnIndex32);
        }
        if (columnIndex33 != -1) {
            j4 = cursor.getLong(columnIndex33);
        }
        if (columnIndex34 == -1) {
            i3 = 0;
        } else {
            i3 = cursor.getInt(columnIndex34);
        }
        if (columnIndex35 == -1 || cursor.isNull(columnIndex35)) {
            valueOf7 = null;
        } else {
            valueOf7 = Integer.valueOf(cursor.getInt(columnIndex35));
        }
        if (columnIndex36 == -1) {
            i4 = 0;
        } else {
            i4 = cursor.getInt(columnIndex36);
        }
        if (columnIndex37 == -1) {
            i5 = 0;
        } else {
            i5 = cursor.getInt(columnIndex37);
        }
        if (columnIndex38 == -1) {
            i6 = 0;
        } else {
            i6 = cursor.getInt(columnIndex38);
        }
        if (columnIndex39 != -1 && !cursor.isNull(columnIndex39)) {
            str = cursor.getString(columnIndex39);
        }
        if (columnIndex40 == -1) {
            i7 = 0;
        } else {
            i7 = cursor.getInt(columnIndex40);
        }
        return new YW6(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, str, i7);
    }

    @Override // X.YWB
    public final void LIZ(List<YW6> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.YWB
    public final YW6 LIZJ(String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM SIMPLE_USER WHERE UID = ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                YW6 yw6 = null;
                String string22 = null;
                if (LIZIZ.moveToFirst()) {
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i3 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ37);
                    int i5 = LIZIZ.getInt(LIZIZ38);
                    int i6 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        string22 = LIZIZ.getString(LIZIZ40);
                    }
                    yw6 = new YW6(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, string22, LIZIZ.getInt(LIZIZ41));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return yw6;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final List LJIIIIZZ(C37581di c37581di) {
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, c37581di, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(LJIILLIIL(LIZIZ));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
        }
    }

    @Override // X.YWB
    public final List LJIIJ(C37581di c37581di) {
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, c37581di, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(LJIILLIIL(LIZIZ));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
        }
    }

    @Override // X.YWB
    public final List<YW6> LJIIJJI(int i) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM SIMPLE_USER LIMIT 0,?");
        LIZJ.LJIIIZ(1, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i2 = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i3 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i4 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i5 = LIZIZ.getInt(LIZIZ37);
                    int i6 = LIZIZ.getInt(LIZIZ38);
                    int i7 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList.add(new YW6(string, string2, string3, string4, string5, i2, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i3, j, j2, j3, j4, i4, valueOf7, i5, i6, i7, str, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final void LJIIL(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        LIZ.LJJII(1, str);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.YWB
    public final int LJIILIIL(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT COUNT(*) FROM SIMPLE_USER\n        WHERE UID != ?\n        AND FOLLOW_STATUS = 2\n    ");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        int i = 0;
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                i = LIZIZ.getInt(0);
            }
            return i;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWB
    public final YW6 LJIILJJIL(String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM SIMPLE_USER WHERE SEC_UID = ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                YW6 yw6 = null;
                String string22 = null;
                if (LIZIZ.moveToFirst()) {
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i3 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ37);
                    int i5 = LIZIZ.getInt(LIZIZ38);
                    int i6 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        string22 = LIZIZ.getString(LIZIZ40);
                    }
                    yw6 = new YW6(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, string22, LIZIZ.getInt(LIZIZ41));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return yw6;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final List LJII(int i, String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        C1CD LIZJ = C1CD.LIZJ(2, "\n        SELECT * FROM SIMPLE_USER\n        WHERE UID != ?\n        AND FOLLOW_STATUS = 2\n        AND COLUMN_USER_SHARE_STATUS = 1 \n        ORDER BY UID DESC\n        LIMIT ?\n    ");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        LIZJ.LJIIIZ(2, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str2 = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i2 = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i3 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i4 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i5 = LIZIZ.getInt(LIZIZ37);
                    int i6 = LIZIZ.getInt(LIZIZ38);
                    int i7 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str2 = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList.add(new YW6(string, string2, string3, string4, string5, i2, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i3, j, j2, j3, j4, i4, valueOf7, i5, i6, i7, str2, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final List<YW6> LJIIIZ(int i, List<String> list) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        StringBuilder LIZJ = C278817o.LIZJ("\n        SELECT * FROM SIMPLE_USER\n        WHERE USER_FRIEND_REC_TYPE = ?\n        AND UID NOT IN (");
        int size = list.size();
        C217818gj.LIZ(size, LIZJ);
        LIZJ.append(")\n        ORDER BY UID ASC\n        ");
        C1CD LIZJ2 = C1CD.LIZJ(size + 1, LIZJ.toString());
        LIZJ2.LJIIIZ(1, i);
        int i2 = 2;
        for (String str : list) {
            if (str == null) {
                LIZJ2.LLLLLLJ(i2);
            } else {
                LIZJ2.LJJII(i2, str);
            }
            i2++;
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ2, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str2 = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i3 = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i5 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i6 = LIZIZ.getInt(LIZIZ37);
                    int i7 = LIZIZ.getInt(LIZIZ38);
                    int i8 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str2 = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList.add(new YW6(string, string2, string3, string4, string5, i3, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i4, j, j2, j3, j4, i5, valueOf7, i6, i7, i8, str2, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ2.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ2.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final List LJ(int i, int i2, List list) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        StringBuilder LIZJ = C278817o.LIZJ("\n        SELECT * FROM SIMPLE_USER WHERE UID IN (");
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        C217818gj.LIZ(size, LIZJ);
        LIZJ.append(")\n        LIMIT ?\n        OFFSET ?\n        ");
        int i3 = size + 2;
        C1CD LIZJ2 = C1CD.LIZJ(i3, LIZJ.toString());
        Iterator it = arrayList.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                LIZJ2.LLLLLLJ(i4);
            } else {
                LIZJ2.LJJII(i4, str);
            }
            i4++;
        }
        LIZJ2.LJIIIZ(size + 1, i);
        LIZJ2.LJIIIZ(i3, i2);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ2, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList2 = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str2 = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i5 = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i6 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i7 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i8 = LIZIZ.getInt(LIZIZ37);
                    int i9 = LIZIZ.getInt(LIZIZ38);
                    int i10 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str2 = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList2.add(new YW6(string, string2, string3, string4, string5, i5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i6, j, j2, j3, j4, i7, valueOf7, i8, i9, i10, str2, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ2.LIZLLL();
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ2.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.YWB
    public final List LJI(int i, int i2, List list) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer valueOf;
        String string19;
        String string20;
        String string21;
        Integer valueOf2;
        Integer valueOf3;
        Long valueOf4;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        StringBuilder LIZJ = C278817o.LIZJ("\n        SELECT * FROM SIMPLE_USER WHERE SEC_UID IN (");
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        C217818gj.LIZ(size, LIZJ);
        LIZJ.append(")\n        LIMIT ?\n        OFFSET ?\n        ");
        int i3 = size + 2;
        C1CD LIZJ2 = C1CD.LIZJ(i3, LIZJ.toString());
        Iterator it = arrayList.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                LIZJ2.LLLLLLJ(i4);
            } else {
                LIZJ2.LJJII(i4, str);
            }
            i4++;
        }
        LIZJ2.LJIIIZ(size + 1, i);
        LIZJ2.LJIIIZ(i3, i2);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ2, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "SIGNATURE");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "WEIBO_VERIFY");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "CUSTOM_VERIFY");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "ENTERPRISE_VERIFY_REASON");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "VERIFICATION_TYPE");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "REMARK_NAME");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "SHORT_ID");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "REMARK_PINYIN");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "REMARK_INITIAL");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_PINYIN");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME_INITIAL");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "COMMERCE_USER_LEVEL");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_PINYIN");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "COLUMN_CONTACT_NAME_INITIAL");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TYPE");
                int LIZIZ27 = C25070yd.LIZIZ(LIZIZ, "USER_FRIEND_REC_TIME");
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "WELCOME_MESSAGE_ENABLED");
                ArrayList arrayList2 = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String str2 = null;
                    if (LIZIZ.isNull(LIZIZ2)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(LIZIZ2);
                    }
                    if (LIZIZ.isNull(LIZIZ3)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ3);
                    }
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ6);
                    }
                    int i5 = LIZIZ.getInt(LIZIZ7);
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    if (LIZIZ.isNull(LIZIZ9)) {
                        string7 = null;
                    } else {
                        string7 = LIZIZ.getString(LIZIZ9);
                    }
                    if (LIZIZ.isNull(LIZIZ10)) {
                        string8 = null;
                    } else {
                        string8 = LIZIZ.getString(LIZIZ10);
                    }
                    if (LIZIZ.isNull(LIZIZ11)) {
                        string9 = null;
                    } else {
                        string9 = LIZIZ.getString(LIZIZ11);
                    }
                    if (LIZIZ.isNull(LIZIZ12)) {
                        string10 = null;
                    } else {
                        string10 = LIZIZ.getString(LIZIZ12);
                    }
                    if (LIZIZ.isNull(LIZIZ13)) {
                        string11 = null;
                    } else {
                        string11 = LIZIZ.getString(LIZIZ13);
                    }
                    if (LIZIZ.isNull(LIZIZ14)) {
                        string12 = null;
                    } else {
                        string12 = LIZIZ.getString(LIZIZ14);
                    }
                    if (LIZIZ.isNull(LIZIZ15)) {
                        string13 = null;
                    } else {
                        string13 = LIZIZ.getString(LIZIZ15);
                    }
                    if (LIZIZ.isNull(LIZIZ16)) {
                        string14 = null;
                    } else {
                        string14 = LIZIZ.getString(LIZIZ16);
                    }
                    if (LIZIZ.isNull(LIZIZ17)) {
                        string15 = null;
                    } else {
                        string15 = LIZIZ.getString(LIZIZ17);
                    }
                    if (LIZIZ.isNull(LIZIZ18)) {
                        string16 = null;
                    } else {
                        string16 = LIZIZ.getString(LIZIZ18);
                    }
                    if (LIZIZ.isNull(LIZIZ19)) {
                        string17 = null;
                    } else {
                        string17 = LIZIZ.getString(LIZIZ19);
                    }
                    if (LIZIZ.isNull(LIZIZ20)) {
                        string18 = null;
                    } else {
                        string18 = LIZIZ.getString(LIZIZ20);
                    }
                    if (LIZIZ.isNull(LIZIZ21)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ21));
                    }
                    if (LIZIZ.isNull(LIZIZ22)) {
                        string19 = null;
                    } else {
                        string19 = LIZIZ.getString(LIZIZ22);
                    }
                    if (LIZIZ.isNull(LIZIZ23)) {
                        string20 = null;
                    } else {
                        string20 = LIZIZ.getString(LIZIZ23);
                    }
                    if (LIZIZ.isNull(LIZIZ24)) {
                        string21 = null;
                    } else {
                        string21 = LIZIZ.getString(LIZIZ24);
                    }
                    if (LIZIZ.isNull(LIZIZ25)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ25));
                    }
                    if (LIZIZ.isNull(LIZIZ26)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(LIZIZ.getInt(LIZIZ26));
                    }
                    if (LIZIZ.isNull(LIZIZ27)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(LIZIZ.getLong(LIZIZ27));
                    }
                    if (LIZIZ.isNull(LIZIZ28)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ28));
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ29));
                    }
                    int i6 = LIZIZ.getInt(LIZIZ30);
                    long j = LIZIZ.getLong(LIZIZ31);
                    long j2 = LIZIZ.getLong(LIZIZ32);
                    long j3 = LIZIZ.getLong(LIZIZ33);
                    long j4 = LIZIZ.getLong(LIZIZ34);
                    int i7 = LIZIZ.getInt(LIZIZ35);
                    if (LIZIZ.isNull(LIZIZ36)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ36));
                    }
                    int i8 = LIZIZ.getInt(LIZIZ37);
                    int i9 = LIZIZ.getInt(LIZIZ38);
                    int i10 = LIZIZ.getInt(LIZIZ39);
                    if (!LIZIZ.isNull(LIZIZ40)) {
                        str2 = LIZIZ.getString(LIZIZ40);
                    }
                    arrayList2.add(new YW6(string, string2, string3, string4, string5, i5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i6, j, j2, j3, j4, i7, valueOf7, i8, i9, i10, str2, LIZIZ.getInt(LIZIZ41)));
                }
                LIZIZ.close();
                LIZJ2.LIZLLL();
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ2.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

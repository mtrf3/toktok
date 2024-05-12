package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YWe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87512YWe implements C3FV {
    public final AbstractC03300Ba LIZ;
    public final YW8 LIZIZ;
    public final C3ZU LIZJ;
    public final C3ZZ LIZLLL;
    public final IDd0S18S0000000_15 LJ;
    public final IDd0S18S0000000_15 LJFF;

    @Override // X.C3FV
    public final List<String> LIZLLL() {
        String string;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT UID FROM MAF_USER");
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

    @Override // X.C3FV
    public final List<YW5> LJI() {
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
        String string22;
        String string23;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        String string24;
        String string25;
        String string26;
        String string27;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM MAF_USER WHERE FOLLOW_STATUS != 2");
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
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "RECOMMEND_REASON");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ42 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ43 = C25070yd.LIZIZ(LIZIZ, "MUTUAL_RELATION");
                int LIZIZ44 = C25070yd.LIZIZ(LIZIZ, "FRIEND_TYPE_STR");
                int LIZIZ45 = C25070yd.LIZIZ(LIZIZ, "REQUEST_ID");
                int LIZIZ46 = C25070yd.LIZIZ(LIZIZ, "SOCIAL_INFO");
                int LIZIZ47 = C25070yd.LIZIZ(LIZIZ, "IS_PRIVATE_ACCOUNT");
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
                        string22 = null;
                    } else {
                        string22 = LIZIZ.getString(LIZIZ28);
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        string23 = null;
                    } else {
                        string23 = LIZIZ.getString(LIZIZ29);
                    }
                    if (LIZIZ.isNull(LIZIZ30)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ30));
                    }
                    if (LIZIZ.isNull(LIZIZ31)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ31));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ32);
                    long j = LIZIZ.getLong(LIZIZ33);
                    long j2 = LIZIZ.getLong(LIZIZ34);
                    long j3 = LIZIZ.getLong(LIZIZ35);
                    long j4 = LIZIZ.getLong(LIZIZ36);
                    int i3 = LIZIZ.getInt(LIZIZ37);
                    if (LIZIZ.isNull(LIZIZ38)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ38));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ39);
                    int i5 = LIZIZ.getInt(LIZIZ40);
                    int i6 = LIZIZ.getInt(LIZIZ41);
                    if (LIZIZ.isNull(LIZIZ42)) {
                        string24 = null;
                    } else {
                        string24 = LIZIZ.getString(LIZIZ42);
                    }
                    if (LIZIZ.isNull(LIZIZ43)) {
                        string25 = null;
                    } else {
                        string25 = LIZIZ.getString(LIZIZ43);
                    }
                    if (LIZIZ.isNull(LIZIZ44)) {
                        string26 = null;
                    } else {
                        string26 = LIZIZ.getString(LIZIZ44);
                    }
                    if (LIZIZ.isNull(LIZIZ45)) {
                        string27 = null;
                    } else {
                        string27 = LIZIZ.getString(LIZIZ45);
                    }
                    if (!LIZIZ.isNull(LIZIZ46)) {
                        str = LIZIZ.getString(LIZIZ46);
                    }
                    arrayList.add(new YW5(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, string22, string23, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, string24, string25, string26, string27, str, LIZIZ.getInt(LIZIZ47)));
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

    @Override // X.C3FV
    public final List<YW5> LJII() {
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
        String string22;
        String string23;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        String string24;
        String string25;
        String string26;
        String string27;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM MAF_USER");
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
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "RECOMMEND_REASON");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ42 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ43 = C25070yd.LIZIZ(LIZIZ, "MUTUAL_RELATION");
                int LIZIZ44 = C25070yd.LIZIZ(LIZIZ, "FRIEND_TYPE_STR");
                int LIZIZ45 = C25070yd.LIZIZ(LIZIZ, "REQUEST_ID");
                int LIZIZ46 = C25070yd.LIZIZ(LIZIZ, "SOCIAL_INFO");
                int LIZIZ47 = C25070yd.LIZIZ(LIZIZ, "IS_PRIVATE_ACCOUNT");
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
                        string22 = null;
                    } else {
                        string22 = LIZIZ.getString(LIZIZ28);
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        string23 = null;
                    } else {
                        string23 = LIZIZ.getString(LIZIZ29);
                    }
                    if (LIZIZ.isNull(LIZIZ30)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ30));
                    }
                    if (LIZIZ.isNull(LIZIZ31)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ31));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ32);
                    long j = LIZIZ.getLong(LIZIZ33);
                    long j2 = LIZIZ.getLong(LIZIZ34);
                    long j3 = LIZIZ.getLong(LIZIZ35);
                    long j4 = LIZIZ.getLong(LIZIZ36);
                    int i3 = LIZIZ.getInt(LIZIZ37);
                    if (LIZIZ.isNull(LIZIZ38)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ38));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ39);
                    int i5 = LIZIZ.getInt(LIZIZ40);
                    int i6 = LIZIZ.getInt(LIZIZ41);
                    if (LIZIZ.isNull(LIZIZ42)) {
                        string24 = null;
                    } else {
                        string24 = LIZIZ.getString(LIZIZ42);
                    }
                    if (LIZIZ.isNull(LIZIZ43)) {
                        string25 = null;
                    } else {
                        string25 = LIZIZ.getString(LIZIZ43);
                    }
                    if (LIZIZ.isNull(LIZIZ44)) {
                        string26 = null;
                    } else {
                        string26 = LIZIZ.getString(LIZIZ44);
                    }
                    if (LIZIZ.isNull(LIZIZ45)) {
                        string27 = null;
                    } else {
                        string27 = LIZIZ.getString(LIZIZ45);
                    }
                    if (!LIZIZ.isNull(LIZIZ46)) {
                        str = LIZIZ.getString(LIZIZ46);
                    }
                    arrayList.add(new YW5(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, string22, string23, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, string24, string25, string26, string27, str, LIZIZ.getInt(LIZIZ47)));
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

    @Override // X.C3FV
    public final void clear() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3ZU] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3ZZ] */
    public C87512YWe(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YW8(abstractC03300Ba);
        this.LIZJ = new C1CF<C3FQ>(abstractC03300Ba) { // from class: X.3ZU
            @Override // X.C0BI
            public final String LIZIZ() {
                return "UPDATE OR REPLACE `MAF_USER` SET `UID` = ?,`COLUMN_USER_SHARE_STATUS` = ? WHERE `UID` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C3FQ c3fq) {
                C3FQ c3fq2 = c3fq;
                String str = c3fq2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                if (c3fq2.LIZIZ == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJIIIZ(2, r0.intValue());
                }
                String str2 = c3fq2.LIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str2);
                }
            }
        };
        this.LIZLLL = new C1CF<C3ZY>(abstractC03300Ba) { // from class: X.3ZZ
            @Override // X.C0BI
            public final String LIZIZ() {
                return "UPDATE OR REPLACE `MAF_USER` SET `UID` = ?,`NICK_NAME` = ?,`UNIQUE_ID` = ?,`FOLLOW_STATUS` = ?,`AVATAR_THUMB` = ?,`AVATAR_MEDIUM` = ?,`COLUMN_USER_SHARE_STATUS` = ? WHERE `UID` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C3ZY c3zy) {
                C3ZY c3zy2 = c3zy;
                String str = c3zy2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c3zy2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
                String str3 = c3zy2.LIZJ;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str3);
                }
                interfaceC37591dj.LJIIIZ(4, c3zy2.LIZLLL);
                String str4 = c3zy2.LJ;
                if (str4 == null) {
                    interfaceC37591dj.LLLLLLJ(5);
                } else {
                    interfaceC37591dj.LJJII(5, str4);
                }
                String str5 = c3zy2.LJFF;
                if (str5 == null) {
                    interfaceC37591dj.LLLLLLJ(6);
                } else {
                    interfaceC37591dj.LJJII(6, str5);
                }
                if (c3zy2.LJI == null) {
                    interfaceC37591dj.LLLLLLJ(7);
                } else {
                    interfaceC37591dj.LJIIIZ(7, r0.intValue());
                }
                String str6 = c3zy2.LIZ;
                if (str6 == null) {
                    interfaceC37591dj.LLLLLLJ(8);
                } else {
                    interfaceC37591dj.LJJII(8, str6);
                }
            }
        };
        new IDd0S18S0000000_15(abstractC03300Ba, 20);
        this.LJ = new IDd0S18S0000000_15(abstractC03300Ba, 21);
        this.LJFF = new IDd0S18S0000000_15(abstractC03300Ba, 22);
    }

    @Override // X.C3FV
    public final void LIZ(List<YW5> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3FV
    public final YW5 LIZJ(String str) {
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
        String string22;
        String string23;
        Long valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        String string24;
        String string25;
        String string26;
        String string27;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM MAF_USER WHERE UID = ?");
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
                int LIZIZ28 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
                int LIZIZ29 = C25070yd.LIZIZ(LIZIZ, "RECOMMEND_REASON");
                int LIZIZ30 = C25070yd.LIZIZ(LIZIZ, "USER_FOLLOW_TIME");
                int LIZIZ31 = C25070yd.LIZIZ(LIZIZ, "BLOCK_STATUS");
                int LIZIZ32 = C25070yd.LIZIZ(LIZIZ, "MENTION_ENABLED");
                int LIZIZ33 = C25070yd.LIZIZ(LIZIZ, "COMMENT_MENTION_BLOCK_STATUS");
                int LIZIZ34 = C25070yd.LIZIZ(LIZIZ, "VIDEO_MENTION_BLOCK_STATUS");
                int LIZIZ35 = C25070yd.LIZIZ(LIZIZ, "VIDEO_TAG_BLOCK_STATUS");
                int LIZIZ36 = C25070yd.LIZIZ(LIZIZ, "QA_INVITE_BLOCK_STATUS");
                int LIZIZ37 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_STATUS");
                int LIZIZ38 = C25070yd.LIZIZ(LIZIZ, "ACCOUNT_TYPE");
                int LIZIZ39 = C25070yd.LIZIZ(LIZIZ, "FOLLOWER_COUNT");
                int LIZIZ40 = C25070yd.LIZIZ(LIZIZ, "FOLLOWING_COUNT");
                int LIZIZ41 = C25070yd.LIZIZ(LIZIZ, "INTERNAL_SHARE_HOLD_OUT_VERSION");
                int LIZIZ42 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
                int LIZIZ43 = C25070yd.LIZIZ(LIZIZ, "MUTUAL_RELATION");
                int LIZIZ44 = C25070yd.LIZIZ(LIZIZ, "FRIEND_TYPE_STR");
                int LIZIZ45 = C25070yd.LIZIZ(LIZIZ, "REQUEST_ID");
                int LIZIZ46 = C25070yd.LIZIZ(LIZIZ, "SOCIAL_INFO");
                int LIZIZ47 = C25070yd.LIZIZ(LIZIZ, "IS_PRIVATE_ACCOUNT");
                YW5 yw5 = null;
                String string28 = null;
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
                        string22 = null;
                    } else {
                        string22 = LIZIZ.getString(LIZIZ28);
                    }
                    if (LIZIZ.isNull(LIZIZ29)) {
                        string23 = null;
                    } else {
                        string23 = LIZIZ.getString(LIZIZ29);
                    }
                    if (LIZIZ.isNull(LIZIZ30)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(LIZIZ.getLong(LIZIZ30));
                    }
                    if (LIZIZ.isNull(LIZIZ31)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(LIZIZ.getInt(LIZIZ31));
                    }
                    int i2 = LIZIZ.getInt(LIZIZ32);
                    long j = LIZIZ.getLong(LIZIZ33);
                    long j2 = LIZIZ.getLong(LIZIZ34);
                    long j3 = LIZIZ.getLong(LIZIZ35);
                    long j4 = LIZIZ.getLong(LIZIZ36);
                    int i3 = LIZIZ.getInt(LIZIZ37);
                    if (LIZIZ.isNull(LIZIZ38)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(LIZIZ.getInt(LIZIZ38));
                    }
                    int i4 = LIZIZ.getInt(LIZIZ39);
                    int i5 = LIZIZ.getInt(LIZIZ40);
                    int i6 = LIZIZ.getInt(LIZIZ41);
                    if (LIZIZ.isNull(LIZIZ42)) {
                        string24 = null;
                    } else {
                        string24 = LIZIZ.getString(LIZIZ42);
                    }
                    if (LIZIZ.isNull(LIZIZ43)) {
                        string25 = null;
                    } else {
                        string25 = LIZIZ.getString(LIZIZ43);
                    }
                    if (LIZIZ.isNull(LIZIZ44)) {
                        string26 = null;
                    } else {
                        string26 = LIZIZ.getString(LIZIZ44);
                    }
                    if (LIZIZ.isNull(LIZIZ45)) {
                        string27 = null;
                    } else {
                        string27 = LIZIZ.getString(LIZIZ45);
                    }
                    if (!LIZIZ.isNull(LIZIZ46)) {
                        string28 = LIZIZ.getString(LIZIZ46);
                    }
                    yw5 = new YW5(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, valueOf, string19, string20, string21, valueOf2, valueOf3, valueOf4, string22, string23, valueOf5, valueOf6, i2, j, j2, j3, j4, i3, valueOf7, i4, i5, i6, string24, string25, string26, string27, string28, LIZIZ.getInt(LIZIZ47));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return yw5;
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

    @Override // X.C3FV
    public final void LJ(C3ZY c3zy) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(c3zy);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3FV
    public final void LJFF(List<C3FQ> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJFF(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3FV
    public final void LIZIZ(int i, String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        LIZ.LJIIIZ(1, i);
        if (str == null) {
            LIZ.LLLLLLJ(2);
        } else {
            LIZ.LJJII(2, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }
}

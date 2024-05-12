package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YWi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87516YWi implements C3ZL {
    public final AbstractC03300Ba LIZ;
    public final C3ZO LIZIZ;
    public final C3ZT LIZJ;
    public final IDd0S18S0000000_15 LIZLLL;
    public final IDd0S18S0000000_15 LJ;

    @Override // X.C3ZL
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }

    @Override // X.C3ZL
    public final int LIZLLL() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT COUNT(*) FROM IM_USER_BASE_INFO");
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

    @Override // X.C3ZL
    public final List<Long> LJFF() {
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT UID FROM IM_USER_BASE_INFO");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(Long.valueOf(LIZIZ.getLong(0)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.C3ZL
    public final List<C3ZN> LJIIJ() {
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        String string5;
        String string6;
        String string7;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM IM_USER_BASE_INFO");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "MAF_STATUS");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "UPDATE_TIME");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "EXTRA");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                long j = LIZIZ.getLong(LIZIZ2);
                String str = null;
                if (LIZIZ.isNull(LIZIZ3)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ3);
                }
                if (LIZIZ.isNull(LIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(LIZIZ4);
                }
                if (LIZIZ.isNull(LIZIZ5)) {
                    string3 = null;
                } else {
                    string3 = LIZIZ.getString(LIZIZ5);
                }
                if (LIZIZ.isNull(LIZIZ6)) {
                    string4 = null;
                } else {
                    string4 = LIZIZ.getString(LIZIZ6);
                }
                if (LIZIZ.isNull(LIZIZ7)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ7));
                }
                if (LIZIZ.isNull(LIZIZ8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ8));
                }
                if (LIZIZ.isNull(LIZIZ9)) {
                    string5 = null;
                } else {
                    string5 = LIZIZ.getString(LIZIZ9);
                }
                long j2 = LIZIZ.getLong(LIZIZ10);
                if (LIZIZ.isNull(LIZIZ11)) {
                    string6 = null;
                } else {
                    string6 = LIZIZ.getString(LIZIZ11);
                }
                if (LIZIZ.isNull(LIZIZ12)) {
                    string7 = null;
                } else {
                    string7 = LIZIZ.getString(LIZIZ12);
                }
                if (!LIZIZ.isNull(LIZIZ13)) {
                    str = LIZIZ.getString(LIZIZ13);
                }
                arrayList.add(new C3ZN(j, string, string2, string3, string4, valueOf, valueOf2, string5, j2, string6, string7, str));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3ZO] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.3ZT] */
    public C87516YWi(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C3ZN>(abstractC03300Ba) { // from class: X.3ZO
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `IM_USER_BASE_INFO` (`UID`,`AVATAR_THUMB`,`AVATAR_MEDIUM`,`NICK_NAME`,`UNIQUE_ID`,`FOLLOW_STATUS`,`MAF_STATUS`,`REC_TYPE`,`UPDATE_TIME`,`SORT_WEIGHT`,`INITIAL_LETTER`,`EXTRA`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C3ZN c3zn) {
                C3ZN c3zn2 = c3zn;
                interfaceC37591dj.LJIIIZ(1, c3zn2.LIZ);
                String str = c3zn2.LIZIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str);
                }
                String str2 = c3zn2.LIZJ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str2);
                }
                String str3 = c3zn2.LIZLLL;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJJII(4, str3);
                }
                String str4 = c3zn2.LJ;
                if (str4 == null) {
                    interfaceC37591dj.LLLLLLJ(5);
                } else {
                    interfaceC37591dj.LJJII(5, str4);
                }
                if (c3zn2.LJFF == null) {
                    interfaceC37591dj.LLLLLLJ(6);
                } else {
                    interfaceC37591dj.LJIIIZ(6, r0.intValue());
                }
                if (c3zn2.LJI == null) {
                    interfaceC37591dj.LLLLLLJ(7);
                } else {
                    interfaceC37591dj.LJIIIZ(7, r0.intValue());
                }
                String str5 = c3zn2.LJII;
                if (str5 == null) {
                    interfaceC37591dj.LLLLLLJ(8);
                } else {
                    interfaceC37591dj.LJJII(8, str5);
                }
                interfaceC37591dj.LJIIIZ(9, c3zn2.LJIIIIZZ);
                String str6 = c3zn2.LJIIIZ;
                if (str6 == null) {
                    interfaceC37591dj.LLLLLLJ(10);
                } else {
                    interfaceC37591dj.LJJII(10, str6);
                }
                String str7 = c3zn2.LJIIJ;
                if (str7 == null) {
                    interfaceC37591dj.LLLLLLJ(11);
                } else {
                    interfaceC37591dj.LJJII(11, str7);
                }
                String str8 = c3zn2.LJIIJJI;
                if (str8 == null) {
                    interfaceC37591dj.LLLLLLJ(12);
                } else {
                    interfaceC37591dj.LJJII(12, str8);
                }
            }
        };
        this.LIZJ = new C1CF<C3ZS>(abstractC03300Ba) { // from class: X.3ZT
            @Override // X.C0BI
            public final String LIZIZ() {
                return "UPDATE OR REPLACE `IM_USER_BASE_INFO` SET `UID` = ?,`AVATAR_THUMB` = ?,`AVATAR_MEDIUM` = ?,`NICK_NAME` = ?,`UNIQUE_ID` = ?,`FOLLOW_STATUS` = ?,`MAF_STATUS` = ?,`REC_TYPE` = ?,`UPDATE_TIME` = ? WHERE `UID` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C3ZS c3zs) {
                C3ZS c3zs2 = c3zs;
                interfaceC37591dj.LJIIIZ(1, c3zs2.LIZ);
                String str = c3zs2.LIZIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str);
                }
                String str2 = c3zs2.LIZJ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str2);
                }
                String str3 = c3zs2.LIZLLL;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJJII(4, str3);
                }
                String str4 = c3zs2.LJ;
                if (str4 == null) {
                    interfaceC37591dj.LLLLLLJ(5);
                } else {
                    interfaceC37591dj.LJJII(5, str4);
                }
                if (c3zs2.LJFF == null) {
                    interfaceC37591dj.LLLLLLJ(6);
                } else {
                    interfaceC37591dj.LJIIIZ(6, r0.intValue());
                }
                if (c3zs2.LJI == null) {
                    interfaceC37591dj.LLLLLLJ(7);
                } else {
                    interfaceC37591dj.LJIIIZ(7, r0.intValue());
                }
                String str5 = c3zs2.LJII;
                if (str5 == null) {
                    interfaceC37591dj.LLLLLLJ(8);
                } else {
                    interfaceC37591dj.LJJII(8, str5);
                }
                interfaceC37591dj.LJIIIZ(9, c3zs2.LJIIIIZZ);
                interfaceC37591dj.LJIIIZ(10, c3zs2.LIZ);
            }
        };
        this.LIZLLL = new IDd0S18S0000000_15(abstractC03300Ba, 11);
        new IDd0S18S0000000_15(abstractC03300Ba, 12);
        this.LJ = new IDd0S18S0000000_15(abstractC03300Ba, 13);
    }

    @Override // X.C3ZL
    public final void LIZJ(List<C3ZN> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3ZL
    public final C3ZN LJ(long j) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        String string5;
        String string6;
        String string7;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM IM_USER_BASE_INFO WHERE UID = ? AND MAF_STATUS = 1 AND FOLLOW_STATUS != 2");
        LIZJ.LJIIIZ(1, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "MAF_STATUS");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "UPDATE_TIME");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "EXTRA");
            C3ZN c3zn = null;
            String string8 = null;
            if (LIZIZ.moveToFirst()) {
                long j2 = LIZIZ.getLong(LIZIZ2);
                if (LIZIZ.isNull(LIZIZ3)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ3);
                }
                if (LIZIZ.isNull(LIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(LIZIZ4);
                }
                if (LIZIZ.isNull(LIZIZ5)) {
                    string3 = null;
                } else {
                    string3 = LIZIZ.getString(LIZIZ5);
                }
                if (LIZIZ.isNull(LIZIZ6)) {
                    string4 = null;
                } else {
                    string4 = LIZIZ.getString(LIZIZ6);
                }
                if (LIZIZ.isNull(LIZIZ7)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ7));
                }
                if (LIZIZ.isNull(LIZIZ8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ8));
                }
                if (LIZIZ.isNull(LIZIZ9)) {
                    string5 = null;
                } else {
                    string5 = LIZIZ.getString(LIZIZ9);
                }
                long j3 = LIZIZ.getLong(LIZIZ10);
                if (LIZIZ.isNull(LIZIZ11)) {
                    string6 = null;
                } else {
                    string6 = LIZIZ.getString(LIZIZ11);
                }
                if (LIZIZ.isNull(LIZIZ12)) {
                    string7 = null;
                } else {
                    string7 = LIZIZ.getString(LIZIZ12);
                }
                if (!LIZIZ.isNull(LIZIZ13)) {
                    string8 = LIZIZ.getString(LIZIZ13);
                }
                c3zn = new C3ZN(j2, string, string2, string3, string4, valueOf, valueOf2, string5, j3, string6, string7, string8);
            }
            return c3zn;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.C3ZL
    public final void LJI(C3ZS c3zs) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(c3zs);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3ZL
    public final void LJIIIIZZ(C3ZN c3zn) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJFF(c3zn);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.C3ZL
    public final C3ZN LJIIIZ(long j) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        String string5;
        String string6;
        String string7;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM IM_USER_BASE_INFO WHERE UID = ?");
        LIZJ.LJIIIZ(1, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "AVATAR_THUMB");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "AVATAR_MEDIUM");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "NICK_NAME");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "UNIQUE_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "FOLLOW_STATUS");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "MAF_STATUS");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "REC_TYPE");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "UPDATE_TIME");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "SORT_WEIGHT");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "INITIAL_LETTER");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "EXTRA");
            C3ZN c3zn = null;
            String string8 = null;
            if (LIZIZ.moveToFirst()) {
                long j2 = LIZIZ.getLong(LIZIZ2);
                if (LIZIZ.isNull(LIZIZ3)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ3);
                }
                if (LIZIZ.isNull(LIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(LIZIZ4);
                }
                if (LIZIZ.isNull(LIZIZ5)) {
                    string3 = null;
                } else {
                    string3 = LIZIZ.getString(LIZIZ5);
                }
                if (LIZIZ.isNull(LIZIZ6)) {
                    string4 = null;
                } else {
                    string4 = LIZIZ.getString(LIZIZ6);
                }
                if (LIZIZ.isNull(LIZIZ7)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ7));
                }
                if (LIZIZ.isNull(LIZIZ8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ8));
                }
                if (LIZIZ.isNull(LIZIZ9)) {
                    string5 = null;
                } else {
                    string5 = LIZIZ.getString(LIZIZ9);
                }
                long j3 = LIZIZ.getLong(LIZIZ10);
                if (LIZIZ.isNull(LIZIZ11)) {
                    string6 = null;
                } else {
                    string6 = LIZIZ.getString(LIZIZ11);
                }
                if (LIZIZ.isNull(LIZIZ12)) {
                    string7 = null;
                } else {
                    string7 = LIZIZ.getString(LIZIZ12);
                }
                if (!LIZIZ.isNull(LIZIZ13)) {
                    string8 = LIZIZ.getString(LIZIZ13);
                }
                c3zn = new C3ZN(j2, string, string2, string3, string4, valueOf, valueOf2, string5, j3, string6, string7, string8);
            }
            return c3zn;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.C3ZL
    public final void LJII(int i, long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        LIZ.LJIIIZ(1, i);
        LIZ.LJIIIZ(2, j);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }
}

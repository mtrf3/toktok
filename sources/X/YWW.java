package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.List;

/* loaded from: classes16.dex */
public final class YWW implements YWD {
    public final AbstractC03300Ba LIZ;
    public final YWE LIZIZ;
    public final YWF LIZJ;
    public final IDd0S18S0000000_15 LIZLLL;

    @Override // X.YWD
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

    public YWW(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YWE(abstractC03300Ba);
        this.LIZJ = new YWF(abstractC03300Ba);
        new IDd0S18S0000000_15(abstractC03300Ba, 14);
        this.LIZLLL = new IDd0S18S0000000_15(abstractC03300Ba, 15);
    }

    @Override // X.YWD
    public final void LIZ(YNU ynu) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(ynu);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.YWD
    public final void LIZJ(List<YNU> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.YWD
    public final YWA LIZLLL(long j) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        String string5;
        String string6;
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, NICK_NAME, UNIQUE_ID, FOLLOW_STATUS, MAF_STATUS, \n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     SHARE_PERMISSION.UID = ? AND MAF_STATUS = 1 AND FOLLOW_STATUS != 2");
        LIZJ.LJIIIZ(1, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            YWA ywa = null;
            Integer valueOf3 = null;
            if (LIZIZ.moveToFirst()) {
                long j2 = LIZIZ.getLong(0);
                if (LIZIZ.isNull(1)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(1);
                }
                if (LIZIZ.isNull(2)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(2);
                }
                if (LIZIZ.isNull(3)) {
                    string3 = null;
                } else {
                    string3 = LIZIZ.getString(3);
                }
                if (LIZIZ.isNull(4)) {
                    string4 = null;
                } else {
                    string4 = LIZIZ.getString(4);
                }
                if (LIZIZ.isNull(5)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(5));
                }
                if (LIZIZ.isNull(6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(6));
                }
                long j3 = LIZIZ.getLong(7);
                if (LIZIZ.isNull(8)) {
                    string5 = null;
                } else {
                    string5 = LIZIZ.getString(8);
                }
                if (LIZIZ.isNull(9)) {
                    string6 = null;
                } else {
                    string6 = LIZIZ.getString(9);
                }
                if (!LIZIZ.isNull(10)) {
                    valueOf3 = Integer.valueOf(LIZIZ.getInt(10));
                }
                ywa = new YWA(j2, string, string2, string3, string4, valueOf, valueOf2, j3, string5, string6, valueOf3);
            }
            return ywa;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWD
    public final void LJ(YNU ynu) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZJ.LJ(ynu);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.YWD
    public final YWA LJFF(long j) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        String string5;
        String string6;
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, NICK_NAME, UNIQUE_ID, FOLLOW_STATUS, MAF_STATUS, \n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     SHARE_PERMISSION.UID = ?");
        LIZJ.LJIIIZ(1, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            YWA ywa = null;
            Integer valueOf3 = null;
            if (LIZIZ.moveToFirst()) {
                long j2 = LIZIZ.getLong(0);
                if (LIZIZ.isNull(1)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(1);
                }
                if (LIZIZ.isNull(2)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(2);
                }
                if (LIZIZ.isNull(3)) {
                    string3 = null;
                } else {
                    string3 = LIZIZ.getString(3);
                }
                if (LIZIZ.isNull(4)) {
                    string4 = null;
                } else {
                    string4 = LIZIZ.getString(4);
                }
                if (LIZIZ.isNull(5)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(5));
                }
                if (LIZIZ.isNull(6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(6));
                }
                long j3 = LIZIZ.getLong(7);
                if (LIZIZ.isNull(8)) {
                    string5 = null;
                } else {
                    string5 = LIZIZ.getString(8);
                }
                if (LIZIZ.isNull(9)) {
                    string6 = null;
                } else {
                    string6 = LIZIZ.getString(9);
                }
                if (!LIZIZ.isNull(10)) {
                    valueOf3 = Integer.valueOf(LIZIZ.getInt(10));
                }
                ywa = new YWA(j2, string, string2, string3, string4, valueOf, valueOf2, j3, string5, string6, valueOf3);
            }
            return ywa;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.YWD
    public final YNU LJI(long j) {
        Integer valueOf;
        Integer valueOf2;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM SHARE_PERMISSION WHERE UID = ?");
        LIZJ.LJIIIZ(1, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "COLUMN_USER_SHARE_STATUS");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "TTN_SHARE_STATUS");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "UPDATE_TIME");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "EXTRA");
            YNU ynu = null;
            String string = null;
            if (LIZIZ.moveToFirst()) {
                long j2 = LIZIZ.getLong(LIZIZ2);
                if (LIZIZ.isNull(LIZIZ3)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(LIZIZ.getInt(LIZIZ3));
                }
                if (LIZIZ.isNull(LIZIZ4)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(LIZIZ.getInt(LIZIZ4));
                }
                long j3 = LIZIZ.getLong(LIZIZ5);
                if (!LIZIZ.isNull(LIZIZ6)) {
                    string = LIZIZ.getString(LIZIZ6);
                }
                ynu = new YNU(j2, valueOf, valueOf2, j3, string);
            }
            return ynu;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}

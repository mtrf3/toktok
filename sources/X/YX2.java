package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX2 implements InterfaceC54862Lg2 {
    public final AbstractC03300Ba LIZ;
    public final YXA LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;
    public final IDd0S18S0000000_15 LIZLLL;
    public final IDd0S18S0000000_15 LJ;
    public final IDd0S18S0000000_15 LJFF;

    @Override // X.InterfaceC54862Lg2
    public final List LIZ() {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM AWEME_READ_RECORD WHERE REPORTED = 0 AND SCENE = ? ORDER BY INSERT_TIME ASC");
        LIZJ.LJIIIZ(1, 1);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j, i, z, str, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final List LIZJ() {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM AWEME_READ_RECORD WHERE REPORTED = 0 AND PAGE_TYPE = ? AND SCENE = 2 ORDER BY INSERT_TIME ASC");
        LIZJ.LJIIIZ(1, 31);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j, i, z, str, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final void LJFF() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        LIZ.LJIIIZ(1, 1);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final void LJII() {
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

    public YX2(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YXA(abstractC03300Ba);
        new YXB(abstractC03300Ba);
        this.LIZJ = new IDd0S18S0000000_15(abstractC03300Ba, 27);
        this.LIZLLL = new IDd0S18S0000000_15(abstractC03300Ba, 28);
        this.LJ = new IDd0S18S0000000_15(abstractC03300Ba, 29);
        this.LJFF = new IDd0S18S0000000_15(abstractC03300Ba, 30);
        new IDd0S18S0000000_15(abstractC03300Ba, 31);
    }

    @Override // X.InterfaceC54862Lg2
    public final List LIZLLL(long j) {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(3, "SELECT * FROM AWEME_READ_RECORD WHERE REPORTED = 0 AND PAGE_TYPE = ? AND scene = ? AND READ_TIME > ? ORDER BY INSERT_TIME ASC");
        LIZJ.LJIIIZ(1, 31);
        LIZJ.LJIIIZ(2, 0);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j2 = LIZIZ.getLong(LIZIZ3);
                int i = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j2, i, z, str, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final int LJ(List<String> list) {
        this.LIZ.LIZIZ();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM AWEME_READ_RECORD WHERE AWEME_ID in (");
        C217818gj.LIZ(list.size(), sb);
        sb.append(")");
        InterfaceC37591dj LJ = this.LIZ.LJ(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                LJ.LLLLLLJ(i);
            } else {
                LJ.LJJII(i, str);
            }
            i++;
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LJ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final int LJIIIIZZ(long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        LIZ.LJIIIZ(1, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final void LJIIJJI(List<C54859Lfz> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final int LIZIZ(long j, long j2) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        LIZ.LJIIIZ(1, j2);
        LIZ.LJIIIZ(2, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final List LJI(int i, String str) {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM AWEME_READ_RECORD WHERE PAGE_TYPE != ? AND READ_TIME != 0 AND USER_ID = ? ");
        LIZJ.LJIIIZ(1, i);
        if (str == null) {
            LIZJ.LLLLLLJ(2);
        } else {
            LIZJ.LJJII(2, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i2 = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str2 = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j, i2, z, str2, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final List<C54859Lfz> LJIIIZ(String str, String str2) {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM AWEME_READ_RECORD WHERE USER_ID = ? AND AWEME_ID = ?");
        if (str2 == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str2);
        }
        if (str == null) {
            LIZJ.LLLLLLJ(2);
        } else {
            LIZJ.LJJII(2, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str3 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str3 = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j, i, z, str3, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC54862Lg2
    public final List<C54859Lfz> LJIIJ(int i, String str) {
        String string;
        boolean z;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM AWEME_READ_RECORD WHERE USER_ID = ? AND SCENE = 0 ORDER BY READ_TIME DESC LIMIT ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        LIZJ.LJIIIZ(2, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "AWEME_ID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "READ_TIME");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "PAGE_TYPE");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "REPORTED");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "USER_ID");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "SCENE");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "INSERT_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i2 = LIZIZ.getInt(LIZIZ4);
                if (LIZIZ.getInt(LIZIZ5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZIZ.isNull(LIZIZ6)) {
                    str2 = LIZIZ.getString(LIZIZ6);
                }
                arrayList.add(new C54859Lfz(string, j, i2, z, str2, LIZIZ.getInt(LIZIZ7), LIZIZ.getLong(LIZIZ8)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}

package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX4 implements C3WD {
    public final AbstractC03300Ba LIZIZ;
    public final YXC LIZJ;
    public final YXD LIZLLL;
    public final IDd0S18S0000000_15 LJ;
    public final IDd0S18S0000000_15 LJFF;

    @Override // X.C3WD
    public final int LJ() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT count(*) FROM RECENT_SHARE");
        this.LIZIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZIZ, LIZJ, false);
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

    public YX4(AbstractC03300Ba abstractC03300Ba) {
        this.LIZIZ = abstractC03300Ba;
        this.LIZJ = new YXC(abstractC03300Ba);
        this.LIZLLL = new YXD(abstractC03300Ba);
        new YXE(abstractC03300Ba);
        this.LJ = new IDd0S18S0000000_15(abstractC03300Ba, 23);
        this.LJFF = new IDd0S18S0000000_15(abstractC03300Ba, 24);
    }

    @Override // X.C3WD
    public final void LIZ(List<YXF> list) {
        this.LIZIZ.LIZIZ();
        this.LIZIZ.LIZJ();
        try {
            this.LIZJ.LJ(list);
            this.LIZIZ.LJIILLIIL();
        } finally {
            this.LIZIZ.LJIIJJI();
        }
    }

    @Override // X.C3WD
    public final List<String> LIZJ(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT ID FROM RECENT_SHARE WHERE SHARE_TIME >= 0 AND CURR_UID = ? ORDER BY SHARE_TIME DESC");
        LIZJ.LJJII(1, str);
        this.LIZIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZIZ, LIZJ, false);
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

    @Override // X.C3WD
    public final List LIZLLL(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT ID FROM RECENT_SHARE WHERE SHARE_TIME >= 0 AND CURR_UID = ? AND SHARE_TYPE = ?");
        LIZJ.LJJII(1, str);
        LIZJ.LJJII(2, "recent link share");
        this.LIZIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZIZ, LIZJ, false);
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

    @Override // X.C3WD
    public final void LJFF(String str) {
        this.LIZIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        LIZ.LJJII(1, str);
        long j = 1000;
        LIZ.LJIIIZ(2, j);
        LIZ.LJIIIZ(3, j);
        this.LIZIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZIZ.LJIILLIIL();
        } finally {
            this.LIZIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    @Override // X.C3WD
    public final List<String> LJI(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT ID FROM RECENT_SHARE WHERE SEND_TIME >= 0 AND CURR_UID = ? ORDER BY SEND_TIME DESC");
        LIZJ.LJJII(1, str);
        this.LIZIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZIZ, LIZJ, false);
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

    public final long LJII(YXF yxf) {
        this.LIZIZ.LIZIZ();
        this.LIZIZ.LIZJ();
        try {
            long LJI = this.LIZLLL.LJI(yxf);
            this.LIZIZ.LJIILLIIL();
            return LJI;
        } finally {
            this.LIZIZ.LJIIJJI();
        }
    }

    public final void LJIIIIZZ(long j, String str) {
        this.LIZIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        LIZ.LJIIIZ(1, j);
        LIZ.LJJII(2, str);
        this.LIZIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZIZ.LJIILLIIL();
        } finally {
            this.LIZIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }

    @Override // X.C3WD
    public final void LIZIZ(long j, String str, String str2) {
        this.LIZIZ.LIZJ();
        try {
            if (LJII(new YXF(-1L, j, str2, str, "")) == -1) {
                LJIIIIZZ(j, str2);
            }
            this.LIZIZ.LJIILLIIL();
        } finally {
            this.LIZIZ.LJIIJJI();
        }
    }
}

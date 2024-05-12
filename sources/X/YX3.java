package X;

import Y.ACallableS92S0200000_15;
import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX3 implements InterfaceC62452OfA {
    public final AbstractC03300Ba LIZ;
    public final YX6 LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;

    public YX3(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YX6(abstractC03300Ba);
        this.LIZJ = new IDd0S18S0000000_15(abstractC03300Ba, 0);
    }

    @Override // X.InterfaceC62452OfA
    public final long LIZ(Integer num) {
        long j;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT count(*) FROM record WHERE share_type = ?");
        if (num == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJIIIZ(1, num.intValue());
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                j = LIZIZ.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC62452OfA
    public final void LIZIZ(C62707OjH c62707OjH) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(c62707OjH);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC62452OfA
    public final void LJ(Integer num) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        if (num == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJIIIZ(1, num.intValue());
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC62452OfA
    public final List<C62707OjH> LJFF(Integer num) {
        Long valueOf;
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM record where share_type = ? order by time desc limit 10");
        if (num == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJIIIZ(1, num.intValue());
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "rid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "channel");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "share_type");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                C62707OjH c62707OjH = new C62707OjH();
                c62707OjH.LIZ = LIZIZ.getInt(LIZIZ2);
                Integer num2 = null;
                if (LIZIZ.isNull(LIZIZ3)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(LIZIZ.getLong(LIZIZ3));
                }
                c62707OjH.LIZIZ = valueOf;
                if (LIZIZ.isNull(LIZIZ4)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ4);
                }
                c62707OjH.LIZJ = string;
                if (!LIZIZ.isNull(LIZIZ5)) {
                    num2 = Integer.valueOf(LIZIZ.getInt(LIZIZ5));
                }
                c62707OjH.LIZLLL = num2;
                arrayList.add(c62707OjH);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC62452OfA
    public final List<C62707OjH> LIZJ(Integer num, Integer num2) {
        Long valueOf;
        String string;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM record where share_type = ? order by time desc limit ?");
        if (num == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJIIIZ(1, num.intValue());
        }
        if (num2 == null) {
            LIZJ.LLLLLLJ(2);
        } else {
            LIZJ.LJIIIZ(2, num2.intValue());
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "rid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "channel");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "share_type");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                C62707OjH c62707OjH = new C62707OjH();
                c62707OjH.LIZ = LIZIZ.getInt(LIZIZ2);
                Integer num3 = null;
                if (LIZIZ.isNull(LIZIZ3)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(LIZIZ.getLong(LIZIZ3));
                }
                c62707OjH.LIZIZ = valueOf;
                if (LIZIZ.isNull(LIZIZ4)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ4);
                }
                c62707OjH.LIZJ = string;
                if (!LIZIZ.isNull(LIZIZ5)) {
                    num3 = Integer.valueOf(LIZIZ.getInt(LIZIZ5));
                }
                c62707OjH.LIZLLL = num3;
                arrayList.add(c62707OjH);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC62452OfA
    public final CallableC73655SvT LIZLLL(Integer num, Integer num2) {
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM record where share_type = ? order by time desc limit ?");
        if (num == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJIIIZ(1, num.intValue());
        }
        if (num2 == null) {
            LIZJ.LLLLLLJ(2);
        } else {
            LIZJ.LJIIIZ(2, num2.intValue());
        }
        return new CallableC73655SvT(new ACallableS92S0200000_15(this, LIZJ, 0));
    }
}

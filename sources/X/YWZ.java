package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YWZ implements FWE {
    public final AbstractC03300Ba LIZ;
    public final C87508YWa LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;

    @Override // X.FWE
    public final void LIZLLL() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    public YWZ(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C87508YWa(abstractC03300Ba);
        new C87509YWb(abstractC03300Ba);
        this.LIZJ = new IDd0S18S0000000_15(abstractC03300Ba, 17);
    }

    @Override // X.FWE
    public final void LIZ(FWF fwf) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(fwf);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.FWE
    public final FWF LIZIZ(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM showAd WHERE awemeId = ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "awemeId");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "cid");
            FWF fwf = null;
            String string2 = null;
            if (LIZIZ.moveToFirst()) {
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                if (!LIZIZ.isNull(LIZIZ3)) {
                    string2 = LIZIZ.getString(LIZIZ3);
                }
                fwf = new FWF(string, string2);
            }
            return fwf;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.FWE
    public final List<FWF> LIZJ(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM showAd where awemeId = ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "awemeId");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "cid");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                if (!LIZIZ.isNull(LIZIZ3)) {
                    str2 = LIZIZ.getString(LIZIZ3);
                }
                arrayList.add(new FWF(string, str2));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}

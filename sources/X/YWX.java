package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YWX implements InterfaceC86882Y7y {
    public final AbstractC03300Ba LIZ;
    public final YWI LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;

    @Override // X.InterfaceC86882Y7y
    public final void empty() {
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

    @Override // X.InterfaceC86882Y7y
    public final List<Y83> getAll() {
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM translation");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "key");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "value");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                Y83 y83 = new Y83();
                if (LIZIZ.isNull(LIZIZ2)) {
                    y83.LIZ = null;
                } else {
                    y83.LIZ = LIZIZ.getString(LIZIZ2);
                }
                if (LIZIZ.isNull(LIZIZ3)) {
                    y83.LIZIZ = null;
                } else {
                    y83.LIZIZ = LIZIZ.getString(LIZIZ3);
                }
                arrayList.add(y83);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public YWX(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YWI(abstractC03300Ba);
        this.LIZJ = new IDd0S18S0000000_15(abstractC03300Ba, 1);
    }

    @Override // X.InterfaceC86882Y7y
    public final void LIZ(List<Y83> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}

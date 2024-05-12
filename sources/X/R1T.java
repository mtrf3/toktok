package X;

import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class R1T implements InterfaceC86133Zp {
    public final AbstractC03300Ba LIZ;
    public final C86143Zq LIZIZ;
    public final IDd0S17S0000000_11 LIZJ;

    @Override // X.InterfaceC86133Zp
    public final int LIZ() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT count(*) FROM FRIENDS_RELATION");
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

    @Override // X.InterfaceC86133Zp
    public final List<C86123Zo> LIZIZ() {
        String string;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM FRIENDS_RELATION");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "SEC_UID");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "RELATION_TYPE");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "CREATED_TIME");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                arrayList.add(new C86123Zo(string, LIZIZ.getInt(LIZIZ3), LIZIZ.getLong(LIZIZ4)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC86133Zp
    public final void clear() {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Zq] */
    public R1T(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C86123Zo>(abstractC03300Ba) { // from class: X.3Zq
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `FRIENDS_RELATION` (`SEC_UID`,`RELATION_TYPE`,`CREATED_TIME`) VALUES (?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C86123Zo c86123Zo) {
                C86123Zo c86123Zo2 = c86123Zo;
                String str = c86123Zo2.LJLIL;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                interfaceC37591dj.LJIIIZ(2, c86123Zo2.LJLILLLLZI);
                interfaceC37591dj.LJIIIZ(3, c86123Zo2.LJLJI);
            }
        };
        new IDd0S17S0000000_11(abstractC03300Ba, 16);
        this.LIZJ = new IDd0S17S0000000_11(abstractC03300Ba, 17);
    }

    @Override // X.InterfaceC86133Zp
    public final void LIZJ(List<C86123Zo> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}

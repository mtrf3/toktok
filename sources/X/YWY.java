package X;

import android.database.Cursor;

/* loaded from: classes16.dex */
public final class YWY implements Y82 {
    public final AbstractC03300Ba LIZ;
    public final YWJ LIZIZ;

    public YWY(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new YWJ(abstractC03300Ba);
    }

    @Override // X.Y82
    public final void LIZ(Y84 y84) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(y84);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.Y82
    public final Y84 get(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM information WHERE `key` = ?");
        LIZJ.LJJII(1, str);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "key");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "value");
            Y84 y84 = null;
            if (LIZIZ.moveToFirst()) {
                Y84 y842 = new Y84();
                if (LIZIZ.isNull(LIZIZ2)) {
                    y842.LIZ = null;
                } else {
                    y842.LIZ = LIZIZ.getString(LIZIZ2);
                }
                if (LIZIZ.isNull(LIZIZ3)) {
                    y842.LIZIZ = null;
                } else {
                    y842.LIZIZ = LIZIZ.getString(LIZIZ3);
                }
                y84 = y842;
            }
            return y84;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}

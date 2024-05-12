package X;

import com.tencent.wcdb.database.SQLiteCustomFunction;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.X7t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84329X7t {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public Locale LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final ArrayList<SQLiteCustomFunction> LJIIJJI = new ArrayList<>();

    public C84329X7t(C84329X7t c84329X7t) {
        if (c84329X7t != null) {
            this.LIZ = c84329X7t.LIZ;
            this.LIZIZ = c84329X7t.LIZIZ;
            LIZ(c84329X7t);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public final void LIZ(C84329X7t c84329X7t) {
        if (c84329X7t != null) {
            if (this.LIZ.equals(c84329X7t.LIZ)) {
                this.LIZLLL = c84329X7t.LIZLLL;
                this.LJ = c84329X7t.LJ;
                this.LJFF = c84329X7t.LJFF;
                this.LJI = c84329X7t.LJI;
                this.LJII = c84329X7t.LJII;
                this.LJIIIZ = c84329X7t.LJIIIZ;
                this.LJIIJ = c84329X7t.LJIIJ;
                this.LJIIIIZZ = c84329X7t.LJIIIIZZ;
                this.LIZJ = c84329X7t.LIZJ;
                this.LJIIJJI.clear();
                this.LJIIJJI.addAll(c84329X7t.LJIIJJI);
                return;
            }
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public C84329X7t(String str, int i) {
        String str2;
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = str;
            this.LIZLLL = i;
            this.LJIIIIZZ = 2;
            this.LJ = 25;
            this.LJFF = Locale.getDefault();
            if ((i & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.LIZJ = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}

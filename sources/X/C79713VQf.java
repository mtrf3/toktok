package X;

import android.util.SparseArray;
import com.lynx.react.bridge.ReadableArray;

/* renamed from: X.VQf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79713VQf implements Cloneable {
    public String LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;

    public C79713VQf() {
        this.LJLLILLLL = -1;
        this.LJLLL = -1;
        this.LJLLLLLL = -1;
    }

    public C79713VQf(C79713VQf c79713VQf) {
        this.LJLLILLLL = -1;
        this.LJLLL = -1;
        this.LJLLLLLL = -1;
        this.LJLIL = c79713VQf.LJLIL;
        this.LJLILLLLZI = c79713VQf.LJLILLLLZI;
        this.LJLJI = c79713VQf.LJLJI;
        this.LJLJJI = c79713VQf.LJLJJI;
        this.LJLJJL = c79713VQf.LJLJJL;
        this.LJLJJLL = c79713VQf.LJLJJLL;
        this.LJLJL = c79713VQf.LJLJL;
        this.LJLJLJ = c79713VQf.LJLJLJ;
        this.LJLJLLL = c79713VQf.LJLJLLL;
        this.LJLL = c79713VQf.LJLL;
        this.LJLLI = c79713VQf.LJLLI;
        this.LJLLILLLL = c79713VQf.LJLLILLLL;
        this.LJLLJ = c79713VQf.LJLLJ;
        this.LJLLL = c79713VQf.LJLLL;
        this.LJLLLL = c79713VQf.LJLLLL;
        this.LJLLLLLL = c79713VQf.LJLLLLLL;
    }

    public static C79713VQf LIZLLL(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        readableArray.size();
        C79713VQf c79713VQf = new C79713VQf();
        c79713VQf.LJLIL = readableArray.getString(0);
        c79713VQf.LJLILLLLZI = readableArray.getLong(1);
        int LIZJ = c79713VQf.LIZJ(2, readableArray);
        int i = LIZJ + 1;
        c79713VQf.LJLJI = readableArray.getLong(LIZJ);
        int i2 = i + 1;
        c79713VQf.LJLLI = readableArray.getInt(i) - 1;
        int i3 = i2 + 1;
        c79713VQf.LJLLJ = readableArray.getInt(i2);
        c79713VQf.LJLLILLLL = readableArray.getInt(i3);
        c79713VQf.LJLLL = readableArray.getInt(i3 + 1);
        return c79713VQf;
    }

    public final boolean LIZ(C79713VQf c79713VQf) {
        if (c79713VQf != null && this.LJLIL.equals(c79713VQf.LJLIL) && this.LJLILLLLZI == c79713VQf.LJLILLLLZI && this.LJLJI == c79713VQf.LJLJI && this.LJLJJI == c79713VQf.LJLJJI && this.LJLJJL == c79713VQf.LJLJJL && this.LJLJJLL == c79713VQf.LJLJJLL && this.LJLJL == c79713VQf.LJLJL && this.LJLJLJ == c79713VQf.LJLJLJ && this.LJLJLLL == c79713VQf.LJLJLLL && this.LJLL == c79713VQf.LJLL && this.LJLLI == c79713VQf.LJLLI && this.LJLLILLLL == c79713VQf.LJLLILLLL && this.LJLLJ == c79713VQf.LJLLJ && this.LJLLLL == c79713VQf.LJLLLL) {
            return true;
        }
        return false;
    }

    public final int LIZJ(int i, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() < 6) {
            this.LJLJJL = 0;
            this.LJLL = 0;
            this.LJLJJLL = 0.0f;
            this.LJLJL = 0.0f;
            this.LJLJLJ = 0.0f;
            this.LJLJLLL = 0.0f;
            return i;
        }
        this.LJLJJL = readableArray.getInt(i);
        this.LJLL = readableArray.getInt(i + 1);
        this.LJLJJLL = (float) readableArray.getDouble(i + 2);
        this.LJLJL = (float) readableArray.getDouble(i + 3);
        this.LJLJLJ = (float) readableArray.getDouble(i + 4);
        this.LJLJLLL = (float) readableArray.getDouble(i + 5);
        return i + 6;
    }

    public static void LIZIZ(SparseArray<C79713VQf> sparseArray, int i, int i2) {
        if (sparseArray.indexOfKey(i) >= 0 && sparseArray.indexOfKey(i2) >= 0) {
            if (sparseArray.get(i).LJLLLLLL < sparseArray.get(i2).LJLLLLLL) {
                sparseArray.remove(i);
            } else {
                sparseArray.remove(i2);
            }
        }
    }
}

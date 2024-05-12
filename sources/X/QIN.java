package X;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class QIN {
    public final String LIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public C66770QIk LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public PA0 LJIJ;
    public boolean LJIJI;
    public String LJIL;
    public String LJJ;
    public QKZ LJJI;
    public boolean LJJIFFI;
    public C39245Faj LJJIIJZLJL;
    public boolean LIZIZ = true;
    public boolean LJIJJ = true;
    public boolean LJIJJLI = true;
    public boolean LJJII = true;
    public boolean LJJIII = true;
    public boolean LJJIIJ = true;

    public final String LIZ() {
        if (TextUtils.isEmpty(this.LJIL)) {
            StringBuilder LIZ = X1D.LIZ();
            String str = this.LIZ;
            if (str != null) {
                str.toString();
            } else {
                str = "";
            }
            return C025908h.LIZIZ(LIZ, str, "@", "bd_tea_agent.db", LIZ);
        }
        return this.LJIL;
    }

    public QIN(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                this.LIZ = str;
                this.LIZJ = str2;
                return;
            }
            throw new IllegalStateException("Channel must not be empty!");
        }
        throw new IllegalStateException("App id must not be empty!");
    }
}

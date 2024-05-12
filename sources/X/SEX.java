package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SEX {
    public String LIZ;
    public final List<SEX> LIZIZ;

    public SEX() {
        this(0);
    }

    public final String LIZ() {
        SEX sex;
        String str;
        if (this.LIZ.length() > 0) {
            return this.LIZ;
        }
        Iterator<SEX> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                sex = it.next();
                if (sex.LIZ().length() > 0) {
                    break;
                }
            } else {
                sex = null;
                break;
            }
        }
        SEX sex2 = sex;
        if (sex2 == null || (str = sex2.LIZ) == null) {
            return "";
        }
        return str;
    }

    public SEX(int i) {
        this.LIZ = "";
        this.LIZIZ = new ArrayList();
    }

    public final void LIZIZ(int i) {
        String string = FKM.LIZ().getString(i);
        o.LJIIIIZZ(string, "application.getString(id)");
        this.LIZ = string;
    }

    public final void LIZJ(String str, String... strArr) {
        String LJJ;
        String str2 = (String) ORY.LJJJJI(0, strArr);
        if (str2 == null || str2.length() == 0) {
            LJJ = V1M.LJJ(str, new String[0]);
            o.LJIIIIZZ(LJJ, "{\n            StarlingUt…lString(errMsg)\n        }");
        } else {
            LJJ = V1M.LJJ(str, str2);
            o.LJIIIIZZ(LJJ, "{\n            StarlingUt…ng(errMsg, key)\n        }");
        }
        this.LIZ = LJJ;
    }
}

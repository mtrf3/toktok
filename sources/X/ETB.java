package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.a1;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class ETB {
    public static final Pattern LIZLLL = PatternProtector.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZIZ, this.LIZ});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ETB)) {
            return false;
        }
        ETB etb = (ETB) obj;
        if (!this.LIZ.equals(etb.LIZ) || !this.LIZIZ.equals(etb.LIZIZ)) {
            return false;
        }
        return true;
    }

    public ETB(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && LIZLLL.matcher(str3).matches()) {
            this.LIZ = str3;
            this.LIZIZ = str;
            this.LIZJ = a1.LJ(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }
}

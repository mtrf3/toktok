package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class PZU {
    public static final Pattern LIZLLL = PatternProtector.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern LJ = PatternProtector.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PZU) && ((PZU) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }

    public PZU(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}

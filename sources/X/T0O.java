package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0O implements T0W {
    public final int LIZ = 3;

    @Override // X.T0W
    public final T0Q getType() {
        return T0Q.DISTINCT_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQY] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashSet, java.util.LinkedHashSet] */
    @Override // X.T0W
    public final EnumC72824Si4 LIZ(String password, EnumC72824Si4 previousComplexity) {
        ?? r2;
        o.LJIIIZ(password, "password");
        o.LJIIIZ(previousComplexity, "previousComplexity");
        char[] charArray = password.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        if (length != 0) {
            if (length != 1) {
                int length2 = charArray.length;
                if (length2 > 128) {
                    length2 = 128;
                }
                r2 = new LinkedHashSet(C51029K0z.LJJIIZ(length2));
                for (char c : charArray) {
                    r2.add(Character.valueOf(c));
                }
            } else {
                r2 = C77275UUl.LJII(Character.valueOf(charArray[0]));
            }
        } else {
            r2 = OQY.INSTANCE;
        }
        int size = r2.size();
        if (size < this.LIZ) {
            return EnumC72824Si4.INSTANT_WEAK;
        }
        if (size < (password.length() / 2) + 1) {
            EnumC72824Si4 c2 = EnumC72824Si4.MEDIUM;
            o.LJIIIZ(c2, "c2");
            if (previousComplexity.getScore$account_awemeaccount_release() < c2.getScore$account_awemeaccount_release()) {
                return previousComplexity;
            }
            return c2;
        }
        return previousComplexity;
    }
}

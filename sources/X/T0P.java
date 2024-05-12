package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0P implements T0W {
    @Override // X.T0W
    public final T0Q getType() {
        return T0Q.ADJACENCY;
    }

    @Override // X.T0W
    public final EnumC72824Si4 LIZ(String password, EnumC72824Si4 previousComplexity) {
        o.LJIIIZ(password, "password");
        o.LJIIIZ(previousComplexity, "previousComplexity");
        int length = password.length() - 1;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = password.charAt(i);
            i++;
            char charAt2 = password.charAt(i);
            C62822Ol8 c62822Ol8 = C36965Ef3.LIZ;
            OSZ osz = (OSZ) ((java.util.Map) c62822Ol8.getValue()).get(Character.valueOf(charAt));
            OSZ osz2 = (OSZ) ((java.util.Map) c62822Ol8.getValue()).get(Character.valueOf(charAt2));
            if (osz != null && osz2 != null) {
                if (Math.abs(((Number) osz2.getSecond()).intValue() - ((Number) osz.getSecond()).intValue()) + Math.abs(((Number) osz2.getFirst()).intValue() - ((Number) osz.getFirst()).intValue()) < 6) {
                    i2++;
                }
            }
        }
        if (i2 >= length - 1) {
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

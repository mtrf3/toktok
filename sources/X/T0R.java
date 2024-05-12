package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0R implements T0W {
    public final RBK LIZ = new RBK();

    @Override // X.T0W
    public final T0Q getType() {
        return T0Q.VARIETY;
    }

    @Override // X.T0W
    public final EnumC72824Si4 LIZ(String password, EnumC72824Si4 previousComplexity) {
        o.LJIIIZ(password, "password");
        o.LJIIIZ(previousComplexity, "previousComplexity");
        int length = password.length();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i = 0; i < length; i++) {
            char charAt = password.charAt(i);
            this.LIZ.getClass();
            if (PatternProtector.compile("^[A-Za-z0-9_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$").matcher(String.valueOf(charAt)).matches()) {
                if (Character.isLetter(charAt)) {
                    if (Character.isLowerCase(charAt)) {
                        z = true;
                    } else if (Character.isUpperCase(charAt)) {
                        z2 = true;
                    }
                } else if (Character.isDigit(charAt)) {
                    z3 = true;
                } else {
                    z4 = true;
                }
            }
        }
        int compare = Boolean.compare(z4, false) + Boolean.compare(z3, false) + Boolean.compare(z2, false) + Boolean.compare(z, false);
        if (compare <= 1) {
            return EnumC72824Si4.INSTANT_WEAK;
        }
        if (compare != 4) {
            return previousComplexity;
        }
        return previousComplexity.getIncreasedComplexity();
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0U implements T0W {
    public final int LIZ = 8;

    @Override // X.T0W
    public final T0Q getType() {
        return T0Q.MINIMUM_LENGTH;
    }

    @Override // X.T0W
    public final EnumC72824Si4 LIZ(String password, EnumC72824Si4 previousComplexity) {
        o.LJIIIZ(password, "password");
        o.LJIIIZ(previousComplexity, "previousComplexity");
        if (password.length() < this.LIZ) {
            return EnumC72824Si4.INSTANT_WEAK;
        }
        return previousComplexity;
    }
}

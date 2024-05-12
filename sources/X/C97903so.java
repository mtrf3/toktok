package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97903so extends AbstractC101843zA {
    public final EnumC101483ya LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C97903so) && this.LIZ == ((C97903so) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickSave(selectedPrivacy=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C97903so(EnumC101483ya selectedPrivacy) {
        o.LJIIIZ(selectedPrivacy, "selectedPrivacy");
        this.LIZ = selectedPrivacy;
    }
}

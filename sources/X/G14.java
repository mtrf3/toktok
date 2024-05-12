package X;

import X.C35656Dz2;

/* loaded from: classes7.dex */
public abstract class G14<T extends C35656Dz2> implements G1A<T> {
    @Override // X.G1A
    public void LIZJ() {
    }

    public final int hashCode() {
        return type().hashCode();
    }

    @Override // X.G1A
    public final C61878OQg LIZIZ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.G1A
    public final EnumC48355IyN LIZLLL() {
        return EnumC48355IyN.ALWAYS;
    }

    @Override // X.G1A
    public final C61878OQg LJ() {
        return C61878OQg.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof G1A) && ((G1A) obj).type() == type()) {
            return true;
        }
        return false;
    }
}

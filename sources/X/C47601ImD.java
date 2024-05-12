package X;

/* renamed from: X.ImD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47601ImD implements InterfaceC47596Im8 {
    @Override // X.InterfaceC47595Im7
    public final void LIZ() {
    }

    @Override // X.InterfaceC47595Im7
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC47595Im7
    public final void LIZJ() {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DirectUrlSource{vid='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", urlItems=");
        LIZ.append((Object) null);
        LIZ.append(", codecStrategy=");
        LIZ.append(0);
        LIZ.append(", smartUrlEnabled=");
        LIZ.append(false);
        LIZ.append(", smartUrlVersion=");
        LIZ.append(0);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC47595Im7
    public final EnumC47602ImE type() {
        return EnumC47602ImE.DIRECT_URL_SOURCE;
    }
}

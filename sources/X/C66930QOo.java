package X;

import defpackage.b0;

/* renamed from: X.QOo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66930QOo {
    public final EnumC61982by LIZ;
    public final EnumC66933QOr LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConnectEvent{mType=");
        LIZ.append(this.LIZ);
        LIZ.append(", connectionState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mChannelId=");
        return b0.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }

    public C66930QOo(EnumC66933QOr enumC66933QOr, EnumC61982by enumC61982by, int i) {
        this.LIZIZ = enumC66933QOr;
        this.LIZ = enumC61982by;
        this.LIZJ = i;
    }
}

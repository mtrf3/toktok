package X;

import com.bytedance.common.utility.Logger;

/* renamed from: X.Iiv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47397Iiv implements InterfaceC47122IeU {
    public final /* synthetic */ String LIZ;

    public C47397Iiv(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC47122IeU
    public final void LIZ(C47121IeT c47121IeT) {
        int i = c47121IeT.LIZ;
        if (i == 2 || i != 3) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video preload failed, key = ");
        LIZ.append(this.LIZ);
        LIZ.append(" , error = ");
        LIZ.append(c47121IeT.LIZJ);
        Logger.e("PreloadVideoUtil", X1D.LIZIZ(LIZ));
    }
}

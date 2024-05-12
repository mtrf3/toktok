package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.L5x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53705L5x {
    public static final void LIZ(C29701Eo c29701Eo, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C0GU<C0GY> LJI;
        File file = new File(str);
        if (file.exists() && (LJI = C04650Gf.LJI(new FileInputStream(file), null)) != null) {
            LJI.LIZIZ(new C53706L5y(c29701Eo, interfaceC65784Pro, LJI));
            LJI.LIZ(new C53707L5z(LJI));
        }
    }
}

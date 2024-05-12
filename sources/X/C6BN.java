package X;

import defpackage.i0;
import java.io.File;

/* renamed from: X.6BN, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6BN extends AbstractC1552267i {
    @Override // X.AbstractC1552267i
    public String LIZIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        String str2 = File.separator;
        String str3 = "interact_sticker.png";
        if (!str.endsWith(str2)) {
            str3 = i0.LJFF(str2, "interact_sticker.png");
        }
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }
}

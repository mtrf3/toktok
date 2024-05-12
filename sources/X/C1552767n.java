package X;

import defpackage.i0;
import java.io.File;

/* renamed from: X.67n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552767n extends AbstractC1552267i {
    @Override // X.AbstractC1552267i
    public final String LIZIZ(int i, String str) {
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = i0.LJFF(str, str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("text_sticker_");
        LIZ.append(i);
        LIZ.append(".png");
        return X1D.LIZIZ(LIZ);
    }
}

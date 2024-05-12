package X;

import java.io.File;

/* renamed from: X.25s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528825s extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C528825s INSTANCE = new C528825s();

    public C528825s() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        File LLIIIZ = C16880lQ.LLIIIZ(C15380j0.LIZLLL());
        if (LLIIIZ != null) {
            str = LLIIIZ.getAbsolutePath();
        } else {
            str = null;
        }
        LIZ.append(str);
        return JBR.LJFF(LIZ, File.separator, "encoded_image_dir", LIZ);
    }
}

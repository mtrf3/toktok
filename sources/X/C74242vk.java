package X;

import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.2vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74242vk {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C71402rA.INSTANCE);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C71412rB.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C74252vl.LJLIL);

    public static final void LIZ(String str) {
        if (str == null) {
            return;
        }
        try {
            C62822Ol8 c62822Ol8 = LIZJ;
            FileOutputStream fileOutputStream = (FileOutputStream) c62822Ol8.getValue();
            if (fileOutputStream != null) {
                byte[] bytes = str.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
            }
            FileOutputStream fileOutputStream2 = (FileOutputStream) c62822Ol8.getValue();
            if (fileOutputStream2 != null) {
                byte[] bytes2 = "\r\n".getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
                fileOutputStream2.write(bytes2);
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

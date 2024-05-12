package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.2vX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74112vX {
    public static volatile boolean LIZ;

    public static void LIZJ(String str) {
        if (str == null || str.length() == 0 || LIZ) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C74082vU(str, null), 3);
    }

    public static String LIZIZ(String str, String str2) {
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                Charset defaultCharset = Charset.defaultCharset();
                o.LJIIIIZZ(defaultCharset, "defaultCharset()");
                String str3 = new String(bArr, defaultCharset);
                AnonymousClass636.LJFF(fileInputStream, null);
                return str3;
            } finally {
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LJ("parse preload manifest file failed");
            return null;
        }
    }

    public static Object LIZ(String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C74062vS(str, str2, null), interfaceC67352kd);
    }
}

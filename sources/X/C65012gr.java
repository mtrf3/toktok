package X;

import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65012gr {
    public static final java.util.Map<String, byte[]> LIZ = new LinkedHashMap();

    public static byte[] LIZ(File file, String md5) {
        boolean z;
        o.LJIIIZ(md5, "md5");
        java.util.Map<String, byte[]> map = LIZ;
        byte[] bArr = (byte[]) ((LinkedHashMap) map).get(md5);
        boolean z2 = false;
        if (bArr != null) {
            if (bArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (z2) {
            return bArr;
        }
        try {
            byte[] LLLF = C38485F8n.LLLF(file);
            map.put(md5, LLLF);
            return LLLF;
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "parse gecko failed");
            return null;
        }
    }
}

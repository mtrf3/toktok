package X;

import com.bytedance.keva.Keva;
import com.bytedance.zoin.zstd.ZstdInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ElE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37348ElE {
    public static final C37348ElE LIZ = new C37348ElE();
    public static final Keva LIZIZ = Keva.getRepo("zstd_dict_file_repo");
    public static final java.util.Map<String, byte[]> LIZJ = new LinkedHashMap();
    public static java.util.Map<String, String> LIZLLL;

    public static byte[] LIZIZ(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr, 0, 4096);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            o.LJIIIIZZ(byteArray, "outputStream.toByteArray()");
                            AnonymousClass636.LJFF(byteArrayOutputStream, null);
                            inputStream.close();
                            return byteArray;
                        }
                    } finally {
                    }
                }
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                inputStream.close();
            } else {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    V0N.LJFF(null, e2);
                }
            }
            throw th;
        }
    }

    public static ZstdInputStream LIZ(InputStream inputStream, String str) {
        byte[] bArr;
        ZstdInputStream zstdInputStream = new ZstdInputStream(inputStream);
        if (str != null) {
            synchronized (LIZ) {
                java.util.Map<String, byte[]> map = LIZJ;
                bArr = (byte[]) ((LinkedHashMap) map).get(str);
                if (bArr == null) {
                    File file = new File(LIZIZ.getString(str, ""));
                    if (file.exists()) {
                        bArr = LIZIZ(new FileInputStream(file));
                        map.put(str, bArr);
                    }
                }
            }
            zstdInputStream.setDict(bArr);
        }
        return zstdInputStream;
    }
}

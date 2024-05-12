package X;

import android.util.Pair;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.QJt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66805QJt {
    public static AbstractC66805QJt LIZ = new EYZ();

    public abstract String LIZIZ(String str, java.util.Map<String, String> map, QKY qky);

    public abstract String LIZLLL(String str, List<Pair<String, String>> list, java.util.Map<String, String> map, QKY qky);

    public abstract String LJ(String str, byte[] bArr, java.util.Map<String, String> map, QKY qky);

    public byte[] LJFF(String str, byte[] bArr, java.util.Map map) {
        return null;
    }

    public static byte[] LIZ(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String LIZJ(String str, List<Pair<String, String>> list) {
        return LIZLLL(str, list, null, new QKY());
    }
}

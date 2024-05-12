package X;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

/* renamed from: X.PAo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64018PAo {
    public static MappedByteBuffer LIZ;

    public static synchronized void LIZ(JSONObject jSONObject) {
        synchronized (C64018PAo.class) {
            try {
                synchronized (C64009PAf.class) {
                    String LIZ2 = FCD.LIZ(C63985P9h.LIZ);
                    if (LIZ == null) {
                        File LLIIJLIL = C16880lQ.LLIIJLIL(C63985P9h.LIZ);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("sdk_");
                        LIZ3.append(LIZ2);
                        LIZ3.append("_seq_num.txt");
                        File file = new File(LLIIJLIL, X1D.LIZIZ(LIZ3));
                        boolean exists = file.exists();
                        if (!exists) {
                            file.createNewFile();
                        }
                        MappedByteBuffer map = new RandomAccessFile(file, "rws").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 8L);
                        LIZ = map;
                        if (!exists) {
                            map.putLong(0, 0L);
                        }
                    }
                    long j = LIZ.getLong(0);
                    jSONObject.put("seq_no", j);
                    jSONObject.put("process_name", LIZ2);
                    LIZ.putLong(0, j + 1);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

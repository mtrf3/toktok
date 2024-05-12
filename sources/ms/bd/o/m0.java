package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class m0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        int i3;
        long j2;
        String str2;
        String str3;
        String sb;
        Context context = a.LIZIZ.LIZ;
        synchronized (s2.class) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
                sb2.append((String) k.a(16777217, 0, 0L, "b85061", new byte[]{60}));
                str3 = s2.LIZ;
                sb2.append(str3);
                sb = sb2.toString();
            } catch (Throwable unused) {
                i2 = 16777217;
                i3 = 0;
                j2 = 0;
                str2 = (String) k.a(16777217, 0, 0L, "a304fe", new byte[]{32, 10, 31, 1, 7, 79, 71, 42, 66, 65, 64, 5, 106, 111, 119, 73, 62, 83, 63, 89});
            }
            if (!new File(sb).exists() || (str2 = s2.LIZIZ(sb)) == null || str2.length() <= 0) {
                InputStream open = context.getResources().getAssets().open(str3);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i4 = 4096;
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, i4);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    i4 = 4096;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(sb);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                StringBuilder sb3 = new StringBuilder();
                i2 = 16777217;
                i3 = 0;
                j2 = 0;
                sb3.append((String) k.a(16777217, 0, 0L, "4888b0", new byte[]{38, 50, 70, 67, 89, 103, 96, 78, 62, 40}));
                sb3.append(sb);
                s2.LIZIZ(sb3.toString());
                str2 = s2.LIZIZ(sb);
                if (str2 == null || str2.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(sb, (String) k.a(16777217, 0, 0L, "88ada9", new byte[]{59, 45}));
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    str2 = s2.LIZIZ(sb);
                }
                if (str2 == null || str2.length() == 0) {
                    str2 = (String) k.a(i2, i3, j2, "8e7267", new byte[]{121, 92, 24, 7, 87, 29, 30, 118, 84, 77, 27, 92, 24, 7, 87, 29});
                }
            }
        }
        return str2;
    }
}

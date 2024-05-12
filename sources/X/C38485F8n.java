package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.F8n */
/* loaded from: classes7.dex */
public class C38485F8n extends C63081OpJ {
    public static final byte[] LLLF(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    o.LJIIIIZZ(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        C38486F8o c38486F8o = new C38486F8o();
                        c38486F8o.write(read2);
                        C62848OlY.LIZIZ(fileInputStream, c38486F8o, FileUtils.BUFFER_SIZE);
                        int size = c38486F8o.size() + i;
                        if (size >= 0) {
                            byte[] LIZ = c38486F8o.LIZ();
                            bArr = Arrays.copyOf(bArr, size);
                            o.LJIIIIZZ(bArr, "copyOf(this, newSize)");
                            System.arraycopy(LIZ, 0, bArr, i, c38486F8o.size());
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("File ");
                            LIZ2.append(file);
                            LIZ2.append(" is too big to fit in memory.");
                            throw new OutOfMemoryError(X1D.LIZIZ(LIZ2));
                        }
                    }
                }
                AnonymousClass636.LJFF(fileInputStream, null);
                return bArr;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("File ");
            LIZ3.append(file);
            LIZ3.append(" is too big (");
            LIZ3.append(length);
            LIZ3.append(" bytes) to fit in memory.");
            throw new OutOfMemoryError(X1D.LIZIZ(LIZ3));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass636.LJFF(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static List LLLFF(File file) {
        Charset charset = PVC.LIZ;
        o.LJIIIZ(charset, "charset");
        ArrayList arrayList = new ArrayList();
        C77321UWf.LJIIJ(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), new AqS167S0100000_1(arrayList, (ArrayList<String>) 317));
        return arrayList;
    }

    public static /* synthetic */ String LLLFZ(File file) {
        return LLLFFI(file, PVC.LIZ);
    }

    public static final String LLLFFI(File file, Charset charset) {
        o.LJIIIZ(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String LJIILJJIL = C77321UWf.LJIILJJIL(inputStreamReader);
            AnonymousClass636.LJFF(inputStreamReader, null);
            return LJIILJJIL;
        } finally {
        }
    }

    public static final void LLLI(File file, byte[] bArr) {
        o.LJIIIZ(file, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            AnonymousClass636.LJFF(fileOutputStream, null);
        } finally {
        }
    }

    public static void LLLII(File file, String text) {
        Charset charset = PVC.LIZ;
        o.LJIIIZ(file, "<this>");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        LLLI(file, bytes);
    }
}

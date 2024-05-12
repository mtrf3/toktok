package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: X.Pqj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65717Pqj {
    public static void LIZ(File file, File file2) {
        C76917UGr.LIZIZ(file, file2, "Source %s and destination %s must be different", !file.equals(file2));
        C65716Pqi c65716Pqi = new C65716Pqi(file2, new INJ[0]);
        C65718Pqk c65718Pqk = new C65718Pqk(C65718Pqk.LJLJJI);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ((ArrayDeque) c65718Pqk.LJLILLLLZI).addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, c65716Pqi.LJLILLLLZI.contains(INJ.APPEND));
            ((ArrayDeque) c65718Pqk.LJLILLLLZI).addFirst(fileOutputStream);
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                c65718Pqk.LJLJI = th;
                if (!IOException.class.isInstance(th)) {
                    C36747EbX.LIZJ(th);
                    throw new RuntimeException(th);
                }
                throw ((Throwable) IOException.class.cast(th));
            } finally {
                c65718Pqk.close();
            }
        }
    }
}

package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.F2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38323F2h {
    public static void LIZ(String str, String str2) {
        File file = new File(str2);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        file.createNewFile();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new java.net.URL(str).openStream());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                C62848OlY.LIZIZ(bufferedInputStream, fileOutputStream, FileUtils.BUFFER_SIZE);
                AnonymousClass636.LJFF(fileOutputStream, null);
                AnonymousClass636.LJFF(bufferedInputStream, null);
            } finally {
            }
        } finally {
        }
    }
}

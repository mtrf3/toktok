package X;

import Y.IDuS317S0100000_5;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.CeF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31819CeF {
    public static final C31819CeF LIZ = new C31819CeF();

    public static File LIZIZ(C31823CeJ c31823CeJ) {
        String fullPath;
        String LJJIIJ;
        if (c31823CeJ.LJIIIZ == null) {
            return null;
        }
        try {
            EnumC31874Cf8 enumC31874Cf8 = c31823CeJ.LIZIZ;
            o.LJIIIZ(enumC31874Cf8, "<this>");
            EnumC31874Cf8 enumC31874Cf82 = EnumC31874Cf8.DCIM_DIR;
            if (enumC31874Cf8 != enumC31874Cf82 && (fullPath = enumC31874Cf8.getFullPath()) != null) {
                File file = new File(fullPath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                file.exists();
            }
            if (enumC31874Cf82 != c31823CeJ.LIZIZ && (LJJIIJ = C78983UzD.LJJIIJ(c31823CeJ)) != null) {
                File file2 = new File(LJJIIJ);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file2.exists();
            }
            File file3 = new File(C78983UzD.LJJIIJZLJL(c31823CeJ));
            file3.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            C28721BOz.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("saveBitmapToFileAsyncV2 config = ");
            LIZ2.append(c31823CeJ);
            BP1.LIZ("BitmapFileUtil#saveFileInternal", X1D.LIZIZ(LIZ2));
            try {
                try {
                    Bitmap bitmap = c31823CeJ.LJIIIZ;
                    if (bitmap != null) {
                        bitmap.compress(c31823CeJ.LJIIJJI, c31823CeJ.LJIIL, fileOutputStream);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                if (c31823CeJ.LJIIJ) {
                    Bitmap bitmap2 = c31823CeJ.LJIIIZ;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    c31823CeJ.LJIIIZ = null;
                }
                C31820CeG LIZ3 = C31821CeH.LIZ(c31823CeJ);
                if (LIZ3 != null) {
                    LIZ3.LIZIZ.put("file_status", 0);
                } else {
                    LIZ3 = null;
                }
                if (LIZ3 != null) {
                    C0K2.LJI("ttlive_file_monitor", LIZ3.LIZIZ, LIZ3.LIZJ, LIZ3.LIZLLL);
                }
                return file3;
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            String localizedMessage = th2.getLocalizedMessage();
            C31820CeG LIZ4 = C31821CeH.LIZ(c31823CeJ);
            if (LIZ4 != null) {
                LIZ4.LIZIZ.put("file_status", 1);
            } else {
                LIZ4 = null;
            }
            if (localizedMessage != null && LIZ4 != null) {
                LIZ4.LIZIZ.put("error_code", 0);
                LIZ4.LIZLLL.put("error_msg", localizedMessage);
            }
            if (LIZ4 != null) {
                C0K2.LJI("ttlive_file_monitor", LIZ4.LIZIZ, LIZ4.LIZJ, LIZ4.LIZLLL);
            }
            return null;
        }
    }

    public final C73428Sro LIZ(C31823CeJ c31823CeJ) {
        C28721BOz.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("config = ");
        LIZ2.append(c31823CeJ);
        BP1.LIZ("BitmapFileUtil#saveBitmapToFileAsyncV2", X1D.LIZIZ(LIZ2));
        return AbstractC73672Svk.LJIIJ(new IDuS317S0100000_5(c31823CeJ, 0)).LJJL(T16.LIZ());
    }
}

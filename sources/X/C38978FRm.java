package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.FRm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38978FRm {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String dir, List<String> filePathList) {
        o.LJIIIZ(dir, "dir");
        o.LJIIIZ(filePathList, "filePathList");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ame-extract-frames");
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append(".zip");
        return LJ(dir, X1D.LIZIZ(LIZ2), filePathList);
    }

    public static final void LIZLLL(File file, File destDir) {
        o.LJIIIZ(destDir, "destDir");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = destDir.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "destDir.absolutePath");
            C16880lQ.LJJLL(fileInputStream, absolutePath);
            o.LJIIIIZZ(destDir.getAbsolutePath(), "destDir.absolutePath");
        } catch (Exception e) {
            C16880lQ.LLLZZIL(destDir);
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    public static void LJFF(ZipOutputStream zipSteam, List list) {
        o.LJIIIZ(zipSteam, "zipSteam");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists()) {
                if (file.isDirectory()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(file.getName());
                    LIZ2.append(File.separator);
                    LIZIZ(file, X1D.LIZIZ(LIZ2), zipSteam);
                } else {
                    LIZIZ(file, "", zipSteam);
                }
            }
        }
        zipSteam.flush();
    }

    public static void LIZIZ(File file, String str, ZipOutputStream zipOutputStream) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(file.getName());
                        String str2 = File.separator;
                        LIZ2.append(str2);
                        LIZ2.append(file2.getName());
                        LIZ2.append(str2);
                        LIZIZ(file2, X1D.LIZIZ(LIZ2), zipOutputStream);
                    } else {
                        LIZIZ(file2, str, zipOutputStream);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(file.getName());
            zipOutputStream.putNextEntry(new ZipEntry(X1D.LIZIZ(LIZ3)));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    AnonymousClass636.LJFF(bufferedInputStream, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass636.LJFF(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final void LIZJ(Context context, int i, String destDir) {
        Resources resources;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(destDir, "destDir");
        if (i == 0 || TextUtils.isEmpty(destDir) || (resources = context.getResources()) == null) {
            return;
        }
        InputStream openRawResource = resources.openRawResource(i);
        o.LJIIIIZZ(openRawResource, "this.openRawResource(rawId)");
        C16880lQ.LJJLL(openRawResource, destDir);
    }

    public static final String LJ(String dir, String fileName, List<String> filePathList) {
        o.LJIIIZ(dir, "dir");
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(filePathList, "filePathList");
        if (filePathList.isEmpty()) {
            return null;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(dir);
            LIZ2.append(File.separator);
            LIZ2.append(fileName);
            File file = new File(X1D.LIZIZ(LIZ2));
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                Iterator<String> it = filePathList.iterator();
                while (it.hasNext()) {
                    File file2 = new File(it.next());
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(file2.getName());
                            LIZ3.append(File.separator);
                            LIZIZ(file2, X1D.LIZIZ(LIZ3), zipOutputStream);
                        } else {
                            LIZIZ(file2, "", zipOutputStream);
                        }
                    }
                }
                zipOutputStream.flush();
                String absolutePath = file.getAbsolutePath();
                AnonymousClass636.LJFF(zipOutputStream, null);
                return absolutePath;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}

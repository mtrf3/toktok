package X;

import android.content.ContentUris;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.13p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C268513p {
    public static final C263111n LIZ = C263011m.LIZ;

    public static long LIZJ(Context context) {
        if (Environment.getDataDirectory() == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(C16880lQ.LLIIJLIL(context).getParent());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public static long LJ(Context context) {
        if (Environment.getDataDirectory() == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(C16880lQ.LLIIJLIL(context).getParent());
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public static void LIZ(File file, FileOutputStream fileOutputStream) {
        FileInputStream fileInputStream;
        LIZ.getClass();
        C268313n LIZJ = C263111n.LIZJ(file);
        if (LIZJ.exists()) {
            if (LIZJ.length() != -1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("begin to copy from->");
                LIZ2.append(LIZJ);
                LIZ2.append(" to->");
                LIZ2.append(fileOutputStream.getFD());
                X1D.LIZIZ(LIZ2);
                try {
                    byte[] bArr = new byte[4096];
                    fileInputStream = new FileInputStream(LIZJ);
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read < 0) {
                                fileOutputStream.flush();
                                fileOutputStream.getFD().sync();
                                C00T.LIZ(fileInputStream);
                                C00T.LIZIZ(fileOutputStream);
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            C00T.LIZ(fileInputStream);
                            C00T.LIZIZ(fileOutputStream);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Failed to copy from->");
                LIZ3.append(LIZJ);
                LIZ3.append(" to->");
                LIZ3.append(fileOutputStream.getFD());
                LIZ3.append(" fileLen=-1");
                throw new IOException(X1D.LIZIZ(LIZ3));
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Failed to copy from->");
            LIZ4.append(LIZJ);
            LIZ4.append("to->");
            LIZ4.append(fileOutputStream.getFD());
            LIZ4.append("because of srcFile not exist");
            throw new FileNotFoundException(X1D.LIZIZ(LIZ4));
        }
    }

    public static void LIZIZ(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[4096];
            if (outputStream == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Failed to copy input:");
                LIZ2.append(inputStream);
                LIZ2.append("output:");
                LIZ2.append(outputStream);
                throw new IOException(X1D.LIZIZ(LIZ2));
            }
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            C00T.LIZ(inputStream);
            C00T.LIZIZ(outputStream);
        }
    }

    public static InputStream LIZLLL(Context context, android.net.Uri uri) {
        android.net.Uri uri2;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            return new FileInputStream(uri.getPath());
        }
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str = split[0];
            if (TextUtils.equals("image", str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                if (C00T.LIZLLL()) {
                    uri2 = MediaStore.Images.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals("video", str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                if (C00T.LIZLLL()) {
                    uri2 = MediaStore.Video.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals("audio", str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                if (C00T.LIZLLL()) {
                    uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
                }
            } else {
                uri2 = null;
            }
            if (TextUtils.isEmpty(split[1])) {
                return null;
            }
            return context.getContentResolver().openInputStream(ContentUris.withAppendedId(uri2, CastLongProtector.parseLong(split[1])));
        }
        if ("content".equals(scheme) && "media".equals(uri.getAuthority())) {
            return context.getContentResolver().openInputStream(uri);
        }
        String LIZIZ = C00S.LIZIZ(context, uri);
        if (TextUtils.isEmpty(LIZIZ) || !C1B6.LIZIZ(LIZIZ)) {
            return null;
        }
        return new FileInputStream(new File(LIZIZ));
    }
}

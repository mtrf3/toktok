package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.00S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00S {
    public static final List<String> LIZ = Arrays.asList("com.kuaishou.nebula.fileprovider", "com.kwai.videoeditor.kyfileprovider", "com.lemon.lvoverseas.provider", "com.lwcx.lw121.fileprovider", "com.zivn.cloudbrush3.utilcode.provider", "com.tencent.mtt.fileprovider", "com.campmobile.snowcamera.fileprovider", "com.android.fileexplorer.myprovider", "com.ifeimo.videoeditor.provider", "com.mi.android.globalFileexplorer.myprovider");
    public static final List<String> LIZIZ = Arrays.asList("com.jk.cutout.application", "com.zone2345.fileprovider", "com.mobile.kadian.fileprovider");

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "700724970261787050"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, null);
    }

    public static String LIZIZ(Context context, android.net.Uri uri) {
        android.net.Uri uri2;
        android.net.Uri uri3 = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            return uri.getPath();
        }
        if ("http".equals(scheme)) {
            return uri.toString();
        }
        if ("content".equals(scheme) && "media".equals(uri.getAuthority())) {
            return LIZJ(context, uri, null, null);
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (TextUtils.equals("com.android.externalstorage.documents", uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C16880lQ.LLLLLLLLLL());
                    LIZ2.append("/");
                    LIZ2.append(split[1]);
                    return X1D.LIZIZ(LIZ2);
                }
            } else {
                if (TextUtils.equals("com.android.providers.downloads.documents", uri.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId != null && documentId.startsWith("raw:")) {
                        return documentId.substring(4);
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        uri2 = ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.valueOf(documentId).longValue());
                    } else {
                        uri2 = uri;
                    }
                    String LIZJ = LIZJ(context, uri2, null, null);
                    if (LIZJ == null) {
                        try {
                            String absolutePath = new File(C16880lQ.LLIIIL(context), "uri_tmp").getAbsolutePath();
                            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                            if (openFileDescriptor == null) {
                                return null;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                    return new File(absolutePath).getAbsolutePath();
                                }
                            }
                        } catch (IOException unused) {
                        }
                    }
                    return LIZJ;
                }
                if (TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if (TextUtils.equals("image", str)) {
                        uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (TextUtils.equals("video", str)) {
                        uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (TextUtils.equals("audio", str)) {
                        uri3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return LIZJ(context, uri3, "_id=?", new String[]{split2[1]});
                }
            }
        }
        if ("content".equals(scheme)) {
            context.getContentResolver();
            if ("com.google.android.apps.photos.contentprovider".equals(uri.getAuthority())) {
                try {
                    String path = uri.getPath();
                    if (path.contains("mediakey")) {
                        return LIZLLL(context, uri);
                    }
                    int lastIndexOf = path.lastIndexOf("/ORIGINAL");
                    if (lastIndexOf < 0) {
                        lastIndexOf = path.lastIndexOf("/ACTUAL");
                    }
                    if (lastIndexOf < 0) {
                        return null;
                    }
                    return LIZJ(context, UriProtector.parse(path.substring(path.indexOf("content"), path.lastIndexOf("/ORIGINAL"))), null, null);
                } catch (Exception unused2) {
                    return null;
                }
            }
            if (LIZ.contains(uri.getAuthority())) {
                if (!TextUtils.isEmpty(uri.getPath())) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    ListProtector.remove(arrayList, 0);
                    StringBuilder sb = new StringBuilder(C16880lQ.LLLLLLLLLL().getAbsolutePath());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        sb.append("/");
                        sb.append(str2);
                    }
                    return sb.toString();
                }
            } else if (LIZIZ.contains(uri.getAuthority())) {
                String path2 = uri.getPath();
                if (!TextUtils.isEmpty(path2)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C16880lQ.LLLLLLLLLL().getAbsolutePath());
                    LIZ3.append(path2);
                    return X1D.LIZIZ(LIZ3);
                }
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.startsWith("/storage/emulated/")) {
                return lastPathSegment;
            }
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.contains(":")) {
                lastPathSegment = lastPathSegment.split(":")[1];
            }
            if (TextUtils.isDigitsOnly(lastPathSegment)) {
                return LIZJ(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id= ?", new String[]{lastPathSegment});
            }
        }
        return null;
    }

    public static String LIZLLL(Context context, android.net.Uri uri) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        File file;
        ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
        FileInputStream fileInputStream = null;
        if (openFileDescriptor == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(uri.getPath().substring(uri.getPath().lastIndexOf("/")));
                LIZ2.append(".jpg");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                File file2 = new File(C16880lQ.LLIIIL(context), "uritemp");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, LIZIZ2);
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
            try {
                byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream2.close();
                        bufferedOutputStream.close();
                        return file.getAbsolutePath();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r4, android.net.Uri r5, java.lang.String r6, java.lang.String[] r7) {
        /*
            java.lang.String r3 = "_data"
            java.lang.String[] r1 = new java.lang.String[]{r3}
            r2 = 0
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L30
            android.database.Cursor r1 = LIZ(r0, r5, r1, r6, r7)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L30
            if (r1 == 0) goto L26
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            if (r0 == 0) goto L26
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            r1.close()
            return r0
        L23:
            r0 = move-exception
            r2 = r1
            goto L2a
        L26:
            if (r1 == 0) goto L36
            goto L33
        L29:
            r0 = move-exception
        L2a:
            if (r2 == 0) goto L2f
            r2.close()
        L2f:
            throw r0
        L30:
            r1 = r2
        L31:
            if (r1 == 0) goto L36
        L33:
            r1.close()
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00S.LIZJ(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}

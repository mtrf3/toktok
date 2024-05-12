package com.ss.android.ttve.nativePort;

import X.C03090Af;
import X.C03880Dg;
import X.C0ON;
import X.C16880lQ;
import X.C39519Ff9;
import X.C45879HzX;
import X.C45880HzY;
import X.C65300Pk0;
import X.C65429Pm5;
import X.P4Q;
import X.X1D;
import android.app.Application;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class TEContentProviderUtils {
    public static Application _initApplication;
    public static HashMap<String, String> sPathMap = new HashMap<>();
    public static String sMediaStoreVersion = null;

    public static Cursor com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-7361309055707753136"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
    }

    public static Application getApplicationContext() {
        if (_initApplication == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null);
                declaredField.setAccessible(true);
                _initApplication = (Application) declaredField.get(invoke);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                String LIZJ = C03090Af.LIZJ(LIZ, "[getApplicationContext] err: ", th, LIZ);
                if ((P4Q.LIZIZ & 1) != 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(P4Q.LIZ);
                    LIZ2.append(C16880lQ.LJLLJ(TEContentProviderUtils.class));
                    TELogcat.nativeLog((byte) 1, X1D.LIZIZ(LIZ2), LIZJ);
                }
            }
        }
        return _initApplication;
    }

    public static String getAndroidExternalDir() {
        File externalFilesDir;
        Application applicationContext = getApplicationContext();
        if (applicationContext == null || (externalFilesDir = applicationContext.getExternalFilesDir(null)) == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static ContentResolver getContentResolver() {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext.getContentResolver();
        }
        return null;
    }

    public static boolean checkDownloadsDoc(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean checkExternalStorageDoc(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean checkGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean checkMediaDoc(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String convertUriPathFromNative(String str) {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            if (C65429Pm5.LJFF("ve_enable_uri_convert_android_q_cache", false)) {
                if (sMediaStoreVersion == null) {
                    sMediaStoreVersion = getVersion(applicationContext);
                }
                if (sMediaStoreVersion == null || getVersion(applicationContext) == null || !sMediaStoreVersion.equals(getVersion(applicationContext))) {
                    sMediaStoreVersion = getVersion(applicationContext);
                    sPathMap.clear();
                } else if (sPathMap.containsKey(str)) {
                    String str2 = sPathMap.get(str);
                    String LIZJ = C0ON.LIZJ("[convertUriPathFromNative] from cache. uriPath = ", str, ", cachePath = ", str2);
                    if (Build.VERSION.SDK_INT >= 29) {
                        LIZJ = LIZJ.replace("%n", "%_n");
                    }
                    P4Q.LJFF("TEContentProviderUtils-Q", LIZJ);
                    return str2;
                }
            }
            try {
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Uri parse = UriProtector.parse(str);
                if (parse != null && contentResolver != null) {
                    String convertUriPath = convertUriPath(applicationContext, parse);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[convertUriPathFromNative] from db. uriPath = ");
                    LIZ.append(str);
                    LIZ.append(", convertPath = ");
                    LIZ.append(convertUriPath);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    if (Build.VERSION.SDK_INT >= 29) {
                        LIZIZ = LIZIZ.replace("%n", "%_n");
                    }
                    P4Q.LJFF("TEContentProviderUtils-Q", LIZIZ);
                    sPathMap.put(str, convertUriPath);
                    return convertUriPath;
                }
                return null;
            } catch (Throwable th) {
                P4Q.LIZIZ(TEContentProviderUtils.class, "[getFd] err", th);
                return null;
            }
        }
        return null;
    }

    public static String getExtensionFromUri(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(getFileTypeFromUri(str));
    }

    public static String getFileTypeFromUri(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (C65429Pm5.LJFF("ve_enable_cache_file_info_opt", false)) {
            C45879HzX c45879HzX = C45880HzY.LIZ;
            if (c45879HzX.LIZJ.containsKey(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getFileTypeFromUri cache cost = ");
                LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ.append(", filePath = ");
                LIZ.append(str);
                P4Q.LIZ("TEContentProviderUtils", X1D.LIZIZ(LIZ));
                return c45879HzX.LIZJ.get(str);
            }
        }
        Application applicationContext = getApplicationContext();
        String str2 = null;
        if (applicationContext != null) {
            try {
                Uri parse = UriProtector.parse(str);
                ContentResolver contentResolver = applicationContext.getContentResolver();
                if (parse != null && contentResolver != null) {
                    str2 = contentResolver.getType(parse);
                }
            } catch (Throwable th) {
                P4Q.LIZIZ(TEContentProviderUtils.class, "[getFileTypeFromUri] err", th);
            }
        }
        C45880HzY.LIZ.LIZJ.put(str, str2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getFileTypeFromUri cost = ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ2.append(", filePath = ");
        LIZ2.append(str);
        P4Q.LIZ("TEContentProviderUtils", X1D.LIZIZ(LIZ2));
        return str2;
    }

    public static String getVersion(Context context) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("media");
        if (acquireContentProviderClient != null) {
            acquireContentProviderClient.release();
            return MediaStore.getVersion(context);
        }
        return null;
    }

    public static String convertUriPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (checkExternalStorageDoc(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C16880lQ.LLLLLLLLLL());
                    LIZ.append("/");
                    LIZ.append(split[1]);
                    return X1D.LIZIZ(LIZ);
                }
            } else {
                if (checkDownloadsDoc(uri)) {
                    return getColumnByUri(context, ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
                }
                if (checkMediaDoc(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getColumnByUri(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (checkGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return getColumnByUri(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static int getFd(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        Application applicationContext = getApplicationContext();
        int i = -1;
        if (applicationContext != null) {
            try {
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Uri parse = UriProtector.parse(str);
                if (parse != null && contentResolver != null) {
                    i = contentResolver.openFileDescriptor(parse, str2).detachFd();
                }
            } catch (Throwable th) {
                P4Q.LIZIZ(TEContentProviderUtils.class, "[getFd] err", th);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFd cost = ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ.append(", filePath = ");
        LIZ.append(str);
        P4Q.LIZ("TEContentProviderUtils", X1D.LIZIZ(LIZ));
        return i;
    }

    public static String getColumnByUri(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query = com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query(context.getContentResolver(), uri, new String[]{"_data"}, str, strArr, null);
            if (com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query != null) {
                try {
                    if (com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query.moveToFirst()) {
                        String string = com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query.getString(com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query.getColumnIndexOrThrow("_data"));
                        com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query != null) {
                com_ss_android_ttve_nativePort_TEContentProviderUtils_android_content_ContentResolver_query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

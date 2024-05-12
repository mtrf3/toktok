package com.ttnet.org.chromium.base;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C78939UyV;
import X.O6T;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class ContentUriUtils {
    public static final Object LIZ = new Object();

    public static Cursor LIZ(ContentResolver contentResolver, Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-1228509212600373554"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public static AssetFileDescriptor LIZIZ(String str) {
        ContentResolver contentResolver = O6T.LIZ.getContentResolver();
        Uri parse = UriProtector.parse(str);
        try {
            if (LJ(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor != null && openTypedAssetFileDescriptor.getStartOffset() != 0) {
                        try {
                            openTypedAssetFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                        throw new SecurityException("Cannot open files with non-zero offset type.");
                    }
                    return openTypedAssetFileDescriptor;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (Exception e) {
            Object[] objArr = {str, e};
            C78939UyV.LJIILIIL("Cannot open content uri: %s", C78939UyV.LJJII(objArr), objArr);
        }
        return null;
    }

    public static boolean LIZLLL(Cursor cursor) {
        int columnIndex;
        if (Build.VERSION.SDK_INT < 24 || (columnIndex = cursor.getColumnIndex("flags")) <= -1 || (cursor.getLong(columnIndex) & 512) == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Uri uri) {
        if (uri == null || !DocumentsContract.isDocumentUri(O6T.LIZ, uri)) {
            return false;
        }
        try {
            Cursor LIZ2 = LIZ(O6T.LIZ.getContentResolver(), uri);
            if (LIZ2 != null) {
                try {
                    if (LIZ2.getCount() >= 1) {
                        LIZ2.moveToFirst();
                        boolean LIZLLL = LIZLLL(LIZ2);
                        LIZ2.close();
                        return LIZLLL;
                    }
                    LIZ2.close();
                } finally {
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor LIZIZ = LIZIZ(str);
        if (LIZIZ != null) {
            try {
                LIZIZ.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        }
        return false;
    }

    public static boolean delete(String str) {
        if (O6T.LIZ.getContentResolver().delete(UriProtector.parse(str), null, null) > 0) {
            return true;
        }
        return false;
    }

    public static String getContentUriFromFilePath(String str) {
        try {
            new File(str);
            synchronized (LIZ) {
            }
            return null;
        } catch (IllegalArgumentException e) {
            C78939UyV.LJII("Cannot retrieve content uri from file: %s", str, e);
            return null;
        }
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = O6T.LIZ.getContentResolver();
        Uri parse = UriProtector.parse(str);
        if (LJ(parse)) {
            String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
            if (streamTypes != null && streamTypes.length > 0) {
                return streamTypes[0];
            }
            return null;
        }
        return contentResolver.getType(parse);
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String LIZJ = LIZJ(UriProtector.parse(str), O6T.LIZ);
            if (TextUtils.isEmpty(LIZJ)) {
                return null;
            }
            return LIZJ;
        } catch (Exception e) {
            Object[] objArr = {str, e};
            C78939UyV.LJIILIIL("Cannot open content uri: %s", C78939UyV.LJJII(objArr), objArr);
            return null;
        }
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor LIZIZ = LIZIZ(str);
        if (LIZIZ != null) {
            return LIZIZ.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static String LIZJ(Uri uri, Context context) {
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor LIZ2 = LIZ(contentResolver, uri);
            if (LIZ2 != null) {
                try {
                    if (LIZ2.getCount() >= 1) {
                        LIZ2.moveToFirst();
                        int columnIndex = LIZ2.getColumnIndex("_display_name");
                        if (columnIndex == -1) {
                            LIZ2.close();
                            return "";
                        }
                        String string = LIZ2.getString(columnIndex);
                        if (LIZLLL(LIZ2) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(string);
                            LIZ3.append(".");
                            LIZ3.append(extensionFromMimeType);
                            string = X1D.LIZIZ(LIZ3);
                        }
                        LIZ2.close();
                        return string;
                    }
                } finally {
                }
            }
            if (LIZ2 != null) {
                LIZ2.close();
            }
        } catch (NullPointerException unused) {
        }
        return "";
    }
}

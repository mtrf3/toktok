package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.IOException;

/* renamed from: X.X4e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84236X4e {
    public static final SparseArray<X4I> LIZ;

    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-6543019798228378012"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, null);
    }

    static {
        boolean z;
        try {
            SparseArray<X4I> sparseArray = new SparseArray<>();
            LIZ = sparseArray;
            if (Build.VERSION.SDK_INT < 29) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                sparseArray.put(2, X4I.LIZ(MediaStore.Images.Media.getContentUri("external_primary")));
                sparseArray.put(3, X4I.LIZ(MediaStore.Video.Media.getContentUri("external_primary")));
                sparseArray.put(4, X4I.LIZ(MediaStore.Audio.Media.getContentUri("external_primary")));
                sparseArray.put(5, X4I.LIZ(MediaStore.Downloads.EXTERNAL_CONTENT_URI));
            } else {
                sparseArray.put(2, X4I.LIZ(MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
                sparseArray.put(3, X4I.LIZ(MediaStore.Video.Media.EXTERNAL_CONTENT_URI));
                sparseArray.put(4, X4I.LIZ(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI));
            }
        } catch (Throwable unused) {
        }
    }

    public static long LIZJ(android.net.Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            parcelFileDescriptor = LIZLLL(uri, "r");
            long statSize = parcelFileDescriptor.getStatSize();
            X4Q.LJJIIJ(parcelFileDescriptor);
            return statSize;
        } catch (Throwable unused) {
            X4Q.LJJIIJ(parcelFileDescriptor);
            return -1L;
        }
    }

    public static int LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("content")) {
            int i = 0;
            while (true) {
                SparseArray<X4I> sparseArray = LIZ;
                if (i >= sparseArray.size()) {
                    return -1;
                }
                int keyAt = sparseArray.keyAt(i);
                if (str.startsWith(sparseArray.get(keyAt).LIZIZ)) {
                    return keyAt;
                }
                i++;
            }
        } else {
            return 1;
        }
    }

    public static boolean LJFF(String str) {
        Context appContext;
        if (LJ(str) > 1) {
            return true;
        }
        if (!str.startsWith(C16880lQ.LLLLLLLLLL().getPath()) || (appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext()) == null) {
            return false;
        }
        String parent = C16880lQ.LLIIIZ(appContext).getParent();
        if ((parent != null && str.startsWith(parent)) || str.startsWith(appContext.getObbDir().getAbsolutePath()) || X4H.LJFF.LJIIIIZZ("uncheck_external_public_dir", 0) > 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(android.net.Uri uri, int i) {
        X4I x4i = LIZ.get(i);
        if (x4i != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            String LJFF = JBR.LJFF(LIZ2, x4i.LIZJ, " = ?", LIZ2);
            String[] strArr = {uri.getLastPathSegment()};
            Cursor cursor = null;
            try {
                android.net.Uri uri2 = x4i.LIZ;
                if (Build.VERSION.SDK_INT >= 29) {
                    uri2 = MediaStore.setIncludePending(uri2);
                }
                cursor = LIZIZ(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver(), uri2, null, LJFF, strArr);
                if (cursor != null && cursor.moveToFirst()) {
                    X4Q.LJJIII(cursor);
                    return;
                }
                throw new Throwable("Fail to check Uri with cursor.");
            } catch (Throwable th) {
                X4Q.LJJIII(cursor);
                throw th;
            }
        }
        throw new Throwable(KMP.LJ("Fail to check Uri, type error :", i));
    }

    public static ParcelFileDescriptor LIZLLL(android.net.Uri uri, String str) {
        if (uri != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().openFileDescriptor(uri, str);
                if (openFileDescriptor != null) {
                    return openFileDescriptor;
                }
                throw new IOException("Fail to get ParcelFileDescriptor, fileDescriptor is null");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                throw new IOException("Fail to get ParcelFileDescriptor", e);
            }
        }
        throw new IOException("Fail to get ParcelFileDescriptor, uri is null");
    }
}

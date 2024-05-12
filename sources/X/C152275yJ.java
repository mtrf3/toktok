package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.5yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152275yJ {
    public static final C152275yJ LIZ = new C152275yJ();

    public static boolean LJI(String str) {
        String scheme;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse == null) {
                scheme = null;
            } else {
                scheme = parse.getScheme();
            }
        } catch (Exception unused) {
        }
        if (o.LJ("content", scheme)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(File file) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getAbsolutePath());
        LIZ2.append("_rename_to_tmp_when_");
        LIZ2.append(System.currentTimeMillis());
        File file2 = new File(X1D.LIZIZ(LIZ2));
        if (file.exists() && !file2.exists() && file.renameTo(file2)) {
            return C16880lQ.LLLZZIL(file2);
        }
        return C16880lQ.LLLZZIL(file);
    }

    public static void LIZ(File file, File file2) {
        if ((file2.exists() || file2.mkdirs()) && file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            o.LJIIIIZZ(listFiles, "srcFile.listFiles()");
            int i = 0;
            if (listFiles.length == 0) {
                return;
            }
            File[] listFiles2 = file.listFiles();
            o.LJIIIIZZ(listFiles2, "srcFile.listFiles()");
            int length = listFiles2.length;
            while (i < length) {
                File file3 = listFiles2[i];
                i++;
                File file4 = new File(file2.getAbsolutePath(), file3.getName());
                if (file3.isFile()) {
                    C38485F8n.LLLI(file4, C38485F8n.LLLF(file3));
                } else if (!file4.exists() && !file4.mkdir()) {
                    return;
                } else {
                    LIZ(file3, file4);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.media.ExifInterface] */
    public static ExifInterface LIZJ(Context context, String filepath) {
        o.LJIIIZ(filepath, "filepath");
        if (context == null) {
            return null;
        }
        C68322mC c68322mC = new C68322mC();
        if (Build.VERSION.SDK_INT >= 24) {
            LIZ.getClass();
            if (LJI(filepath)) {
                android.net.Uri parse = UriProtector.parse(filepath);
                o.LJIIIIZZ(parse, "parse(filepath)");
                LIZLLL(context, parse, new C152265yI(c68322mC));
                return (ExifInterface) c68322mC.element;
            }
        }
        c68322mC.element = new ExifInterface(filepath);
        return (ExifInterface) c68322mC.element;
    }

    public static MediaMetadataRetriever LJ(Context context, String filePath) {
        o.LJIIIZ(filePath, "filePath");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (LJI(filePath)) {
                mediaMetadataRetriever.setDataSource(context, UriProtector.parse(filePath));
            } else {
                mediaMetadataRetriever.setDataSource(filePath);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return mediaMetadataRetriever;
    }

    public static boolean LJFF(Context context, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (LJI(str)) {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(filePath)");
            if (context != null) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(parse, "r");
                    if (openAssetFileDescriptor != null) {
                        try {
                            openAssetFileDescriptor.close();
                            return true;
                        } catch (IOException unused) {
                            return true;
                        }
                    }
                } catch (FileNotFoundException unused2) {
                }
            }
            return false;
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && file.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJII(String dir, boolean z) {
        o.LJIIIZ(dir, "dir");
        File file = new File(dir);
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            if (!z || LJIIIIZZ(file)) {
                return false;
            }
        }
        return file.mkdirs();
    }

    public static Bitmap LIZIZ(Context context, BitmapFactory.Options options, String str) {
        boolean z;
        ParcelFileDescriptor parcelFileDescriptor;
        C76800UCe c76800UCe;
        Bitmap decodeFileDescriptor;
        C76800UCe c76800UCe2 = null;
        Bitmap bitmap = null;
        C76800UCe c76800UCe3 = null;
        if (context == null) {
            return null;
        }
        boolean z2 = false;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            return null;
        }
        if (LJI(str)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(android.net.Uri.parse(str), "r");
                } else {
                    parcelFileDescriptor = null;
                }
                if (parcelFileDescriptor != null) {
                    try {
                        decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
                    } catch (Exception unused) {
                        if (parcelFileDescriptor == null) {
                            c76800UCe = null;
                        } else {
                            try {
                                parcelFileDescriptor.close();
                                c76800UCe = C76800UCe.LIZ;
                            } catch (Throwable th) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                return null;
                            }
                        }
                        C3C5.m7constructorimpl(c76800UCe);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                                c76800UCe2 = C76800UCe.LIZ;
                            } catch (Throwable th3) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th3));
                                throw th;
                            }
                        }
                        C3C5.m7constructorimpl(c76800UCe2);
                        throw th;
                    }
                } else {
                    decodeFileDescriptor = null;
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                        c76800UCe3 = C76800UCe.LIZ;
                    } catch (Throwable th4) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th4));
                    }
                }
                C3C5.m7constructorimpl(c76800UCe3);
                return decodeFileDescriptor;
            } catch (Exception unused2) {
                parcelFileDescriptor = null;
            } catch (Throwable th5) {
                th = th5;
                parcelFileDescriptor = null;
            }
        } else {
            try {
                bitmap = BitmapFactory.decodeFile(str, options);
                return bitmap;
            } catch (Exception unused3) {
                return bitmap;
            }
        }
    }

    public static void LIZLLL(Context context, android.net.Uri uri, InterfaceC88472Yns interfaceC88472Yns) {
        ParcelFileDescriptor parcelFileDescriptor;
        FileDescriptor fileDescriptor;
        if (context == null) {
            return;
        }
        try {
            parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptor == null) {
                fileDescriptor = null;
            } else {
                try {
                    try {
                        fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                    } catch (IOException e) {
                        e = e;
                        interfaceC88472Yns.invoke(null);
                        C16880lQ.LLLLIIL(e);
                        if (parcelFileDescriptor == null) {
                            return;
                        }
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                            throw th;
                        } catch (IOException unused) {
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            interfaceC88472Yns.invoke(fileDescriptor);
            if (parcelFileDescriptor == null) {
                return;
            }
        } catch (IOException e2) {
            e = e2;
            parcelFileDescriptor = null;
        } catch (Throwable th2) {
            throw th2;
        }
        try {
            parcelFileDescriptor.close();
        } catch (IOException unused2) {
        }
    }
}

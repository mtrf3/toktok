package X;

import android.app.Application;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQ6 {
    public static final PQ6 LIZ = new PQ6();

    public static final FileInputStream LIZIZ(String str) {
        FileDescriptor fileDescriptor;
        try {
            if (LIZJ(str)) {
                Application application = PTW.LIZ;
                if (application != null) {
                    ParcelFileDescriptor openFileDescriptor = application.getContentResolver().openFileDescriptor(UriProtector.parse(str), "r");
                    if (openFileDescriptor == null) {
                        fileDescriptor = null;
                    } else {
                        fileDescriptor = openFileDescriptor.getFileDescriptor();
                    }
                    return new FileInputStream(fileDescriptor);
                }
                o.LJIJI("application");
                throw null;
            }
            return new FileInputStream(str);
        } catch (Exception e) {
            PQ7 LIZ2 = PTW.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("path:");
            LIZ3.append((Object) str);
            LIZ3.append(' ');
            LIZ3.append(e);
            LIZ2.LIZ(X1D.LIZIZ(LIZ3));
            return null;
        }
    }

    public static final boolean LIZJ(String str) {
        String scheme;
        if (str.length() == 0) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse == null) {
                scheme = null;
            } else {
                scheme = parse.getScheme();
            }
        } catch (Exception e) {
            PTW.LIZ().LIZ(o.LJIILLIIL(e.getMessage(), "isMediaUriPath: "));
        }
        if (o.LJ("content", scheme)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3 = null;
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                fileChannel3 = fileOutputStream.getChannel();
                if (channel != null) {
                    channel.transferTo(0L, channel.size(), fileChannel3);
                }
                try {
                    fileInputStream.close();
                    if (channel != null) {
                        channel.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel3 == null) {
                        return true;
                    }
                    fileChannel3.close();
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            } catch (Exception unused2) {
                fileChannel2 = fileChannel3;
                fileChannel3 = channel;
                try {
                    fileInputStream.close();
                    if (fileChannel3 != null) {
                        fileChannel3.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileChannel = fileChannel3;
                fileChannel3 = channel;
                try {
                    fileInputStream.close();
                    if (fileChannel3 != null) {
                        fileChannel3.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                } catch (Exception unused4) {
                    return false;
                }
            }
        } catch (Exception unused5) {
            fileChannel2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[Catch: Exception -> 0x00da, TRY_ENTER, TryCatch #4 {Exception -> 0x00da, blocks: (B:46:0x00d2, B:51:0x00d6), top: B:50:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PQ6.LIZLLL(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LJ(String rootPath, String str, String str2) {
        o.LJIIIZ(rootPath, "rootPath");
        if (!new File(rootPath).exists()) {
            PQ7 LIZ2 = PTW.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("save draft fail, ");
            LIZ3.append(rootPath);
            LIZ3.append(" not exit");
            LIZ2.LIZ(X1D.LIZIZ(LIZ3));
            return;
        }
        try {
            File file = new File(rootPath, "tempFile");
            C38485F8n.LLLII(file, str);
            File file2 = new File(rootPath, str2);
            if (file2.exists()) {
                C16880lQ.LLLZZIL(file2);
            }
            if (!file.renameTo(file2)) {
                PTW.LIZ().i("nletodraft", "save: renameTo project temp file fail");
                OR7.LLLIIIL(file, file2, true, 4);
                C16880lQ.LLLZZIL(file);
            }
        } catch (Exception e) {
            PTW.LIZ().LIZ(o.LJIILLIIL(e.getMessage(), "save draft fail "));
        }
    }
}

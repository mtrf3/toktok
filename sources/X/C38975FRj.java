package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.b1;
import defpackage.g0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.FRj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38975FRj {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C38975FRj.class);
    }

    public static String LIZJ(File file) {
        String[] split = file.getName().split("\\.");
        if (split.length > 1) {
            return split[split.length - 2];
        }
        return "";
    }

    public static long LIZLLL(File file) {
        long j = -1;
        if (!file.exists()) {
            return -1L;
        }
        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            j = 0;
            for (File file2 : file.listFiles()) {
                j += LIZLLL(file2);
            }
        }
        return j;
    }

    public static void LIZIZ(String str, String... strArr) {
        CheckedOutputStream checkedOutputStream;
        FileOutputStream fileOutputStream;
        ZipOutputStream zipOutputStream;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                try {
                    zipOutputStream = new ZipOutputStream(checkedOutputStream);
                    try {
                        try {
                            for (String str2 : strArr) {
                                File file = new File(str2);
                                if (file.exists()) {
                                    LIZ(file, "", zipOutputStream);
                                } else {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(str2);
                                    LIZ2.append("not exist！");
                                    throw new RuntimeException(X1D.LIZIZ(LIZ2));
                                }
                            }
                            g0.LJJIJL(zipOutputStream);
                            g0.LJJIJL(checkedOutputStream);
                            g0.LJJIJL(fileOutputStream);
                        } catch (Exception e) {
                            e = e;
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        g0.LJJIJL(zipOutputStream);
                        g0.LJJIJL(checkedOutputStream);
                        g0.LJJIJL(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    zipOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = null;
                    g0.LJJIJL(zipOutputStream);
                    g0.LJJIJL(checkedOutputStream);
                    g0.LJJIJL(fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                checkedOutputStream = null;
                zipOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                checkedOutputStream = null;
                zipOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        BufferedInputStream bufferedInputStream;
        File[] listFiles;
        if (file.isDirectory()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(file.getName());
            LIZ2.append(File.separator);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (!file.exists() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                LIZ(file2, LIZIZ, zipOutputStream);
            }
            return;
        }
        PrintStream printStream = System.out;
        StringBuilder LIZJ = b1.LIZJ("compress：", str);
        LIZJ.append(file.getName());
        printStream.println(X1D.LIZIZ(LIZJ));
        if (!file.exists()) {
            return;
        }
        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } catch (Exception e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(X1D.LIZIZ(LIZ3)));
                byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, FileUtils.BUFFER_SIZE);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        g0.LJJIJL(bufferedInputStream);
                        g0.LJJIJL(fileInputStream);
                        return;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream3 = bufferedInputStream;
                fileInputStream2 = fileInputStream3;
                fileInputStream3 = fileInputStream;
                try {
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream3;
                    fileInputStream3 = fileInputStream2;
                    g0.LJJIJL(fileInputStream3);
                    g0.LJJIJL(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream3 = bufferedInputStream;
                g0.LJJIJL(fileInputStream3);
                g0.LJJIJL(fileInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }
}

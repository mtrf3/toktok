package X;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.CfE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31880CfE {
    public static String LIZ() {
        Context LJIJJLI = C38891fp.LJIJJLI();
        if (LJIJJLI == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIIL(LJIJJLI).getPath());
        File file = new File(JBR.LJFF(LIZ, File.separator, "live", LIZ));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static byte[] LIZIZ(File file) {
        if (file != null && file.exists()) {
            try {
                return LIZJ(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static byte[] LIZJ(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            inputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    public static void LJ(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                C16880lQ.LLLZZIL(file);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJ(file2);
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            C16880lQ.LLLZZIL(file);
            return;
        }
        C16880lQ.LLLZZIL(file);
    }

    public static byte[] LIZLLL(Context context, android.net.Uri uri) {
        if (context != null && uri != null) {
            try {
                return LIZJ(context.getContentResolver().openInputStream(uri));
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static void LJFF(String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("..");
        LIZ.append(File.separator);
        String LIZIZ = X1D.LIZIZ(LIZ);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (C38354F3m.LJ(name) || !name.contains(LIZIZ)) {
                    if (nextEntry.isDirectory()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        new File(JBR.LJFF(LIZ2, File.separator, name, LIZ2)).mkdirs();
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str2);
                        File file = new File(JBR.LJFF(LIZ3, File.separator, name, LIZ3));
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        } else {
                            file.getParentFile().mkdirs();
                        }
                        file.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                } else {
                    throw new IOException("Unzip maybe be unsafe.");
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}

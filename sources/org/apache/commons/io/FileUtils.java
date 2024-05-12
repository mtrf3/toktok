package org.apache.commons.io;

import X.C0F0;
import X.X1D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final BigInteger ONE_EB_BI;
    public static final BigInteger ONE_GB_BI;
    public static final BigInteger ONE_KB_BI;
    public static final BigInteger ONE_MB_BI;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        ONE_ZB = multiply5;
        ONE_YB = valueOf.multiply(multiply5);
        EMPTY_FILE_ARRAY = new File[0];
    }

    public static void forceMkdir(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("File ");
            LIZ.append(file);
            LIZ.append(" exists and is not a directory. Unable to create directory.");
            throw new IOException(X1D.LIZIZ(LIZ));
        }
        if (file.mkdirs() || file.isDirectory()) {
        } else {
            throw new IOException(C0F0.LIZJ("Unable to create directory ", file));
        }
    }

    public static FileInputStream openInputStream(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.canRead()) {
                    return new FileInputStream(file);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("File '");
                LIZ.append(file);
                LIZ.append("' cannot be read");
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("File '");
            LIZ2.append(file);
            LIZ2.append("' exists but is a directory");
            throw new IOException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("File '");
        LIZ3.append(file);
        LIZ3.append("' does not exist");
        throw new FileNotFoundException(X1D.LIZIZ(LIZ3));
    }

    public static FileOutputStream openOutputStream(File file, boolean z) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.canWrite()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("File '");
                    LIZ.append(file);
                    LIZ.append("' cannot be written to");
                    throw new IOException(X1D.LIZIZ(LIZ));
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("File '");
                LIZ2.append(file);
                LIZ2.append("' exists but is a directory");
                throw new IOException(X1D.LIZIZ(LIZ2));
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Directory '");
                LIZ3.append(parentFile);
                LIZ3.append("' could not be created");
                throw new IOException(X1D.LIZIZ(LIZ3));
            }
        }
        return new FileOutputStream(file, z);
    }

    public static String readFileToString(File file, Charset charset) {
        FileInputStream openInputStream = openInputStream(file);
        try {
            String iOUtils = IOUtils.toString(openInputStream, Charsets.toCharset(charset));
            if (openInputStream != null) {
                openInputStream.close();
            }
            return iOUtils;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void writeStringToFile(File file, String str, Charset charset) {
        writeStringToFile(file, str, charset, false);
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z) {
        FileOutputStream openOutputStream = openOutputStream(file, z);
        try {
            IOUtils.write(str, openOutputStream, charset);
            if (openOutputStream != null) {
                openOutputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}

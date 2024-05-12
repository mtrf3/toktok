package net.jpountz.util;

import X.C16880lQ;
import X.C25620zW;
import X.V0N;
import X.X1D;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public enum Native {
    ;

    public static boolean loaded;

    public static String arch() {
        return System.getProperty("os.arch");
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            z = loaded;
        }
        return z;
    }

    public static synchronized void load() {
        synchronized (Native.class) {
            if (loaded) {
                return;
            }
            try {
                C16880lQ.LLJJJIL("lz4-java");
                loaded = true;
            } catch (UnsatisfiedLinkError unused) {
                String resourceName = resourceName();
                InputStream resourceAsStream = Native.class.getResourceAsStream(resourceName);
                if (resourceAsStream != null) {
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(".");
                        LIZ.append(os().libExtension);
                        File createTempFile = File.createTempFile("liblz4-java", X1D.LIZIZ(LIZ));
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = resourceAsStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            }
                            try {
                                fileOutputStream.close();
                                fileOutputStream = null;
                            } catch (IOException unused2) {
                            }
                            System.load(createTempFile.getAbsolutePath());
                            loaded = true;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (createTempFile.exists()) {
                                if (!loaded) {
                                    C16880lQ.LLLZZIL(createTempFile);
                                    return;
                                } else {
                                    C16880lQ.LLZ(createTempFile);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (createTempFile != null) {
                                if (createTempFile.exists()) {
                                    if (!loaded) {
                                        C16880lQ.LLLZZIL(createTempFile);
                                        throw th;
                                    }
                                    C16880lQ.LLZ(createTempFile);
                                    throw th;
                                }
                                throw th;
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                        throw new ExceptionInInitializerError("Cannot unpack liblz4-java");
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unsupported OS/arch, cannot find ");
                LIZ2.append(resourceName);
                LIZ2.append(". Please try building from source.");
                throw new UnsupportedOperationException(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static OS os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return OS.LINUX;
        }
        if (property.contains("Mac")) {
            return OS.MAC;
        }
        if (property.contains("Windows")) {
            return OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return OS.SOLARIS;
        }
        throw new UnsupportedOperationException(i0.LJFF("Unsupported operating system: ", property));
    }

    public static String resourceName() {
        OS os = os();
        StringBuilder LIZIZ = C25620zW.LIZIZ("/", Native.class.getPackage().getName().replace('.', '/'), "/");
        LIZIZ.append(os.name);
        LIZIZ.append("/");
        LIZIZ.append(arch());
        LIZIZ.append("/liblz4-java.");
        LIZIZ.append(os.libExtension);
        return X1D.LIZIZ(LIZIZ);
    }

    /* loaded from: classes12.dex */
    public enum OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");

        public final String libExtension;
        public final String name;

        public static OS valueOf(String str) {
            return (OS) V0N.LJJJ(OS.class, str);
        }

        OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    public static Native valueOf(String str) {
        return (Native) V0N.LJJJ(Native.class, str);
    }
}

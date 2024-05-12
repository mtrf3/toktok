package com.uber.h3core;

import X.C16880lQ;
import X.V0N;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes24.dex */
public final class H3CoreLoader {
    public static final Locale H3_CORE_LOCALE = Locale.ENGLISH;
    public static volatile File libraryFile;

    /* loaded from: classes24.dex */
    public enum OperatingSystem {
        ANDROID(".so"),
        DARWIN(".dylib"),
        FREEBSD(".so"),
        WINDOWS(".dll"),
        LINUX(".so");

        public final String suffix;

        public String getDirName() {
            return name().toLowerCase(H3CoreLoader.H3_CORE_LOCALE);
        }

        public String getSuffix() {
            return this.suffix;
        }

        public static OperatingSystem valueOf(String str) {
            return (OperatingSystem) V0N.LJJJ(OperatingSystem.class, str);
        }

        OperatingSystem(String str) {
            this.suffix = str;
        }
    }

    public static NativeMethods loadNatives() {
        return loadNatives(detectOs(System.getProperty("java.vendor"), System.getProperty("os.name")), detectArch(System.getProperty("os.arch")));
    }

    public static NativeMethods loadSystemNatives() {
        C16880lQ.LLJJJIL("h3-java");
        return new NativeMethods();
    }

    public static final String detectArch(String str) {
        if (str.equals("amd64") || str.equals("x86_64")) {
            return "x64";
        }
        if (str.equals("i386") || str.equals("i486") || str.equals("i586") || str.equals("i686") || str.equals("i786") || str.equals("i886")) {
            return "x86";
        }
        if (str.equals("aarch64")) {
            return "arm64";
        }
        return str;
    }

    public static void copyResource(String str, File file) {
        file.setReadable(true);
        file.setWritable(true, true);
        file.setExecutable(true, true);
        InputStream resourceAsStream = H3CoreLoader.class.getResourceAsStream(str);
        try {
            if (resourceAsStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    copyStream(resourceAsStream, fileOutputStream);
                    fileOutputStream.close();
                    resourceAsStream.close();
                } finally {
                }
            } else {
                throw new UnsatisfiedLinkError(C16880lQ.LLLZ("No native resource found at %s", new Object[]{str}));
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static final OperatingSystem detectOs(String str, String str2) {
        Locale locale = H3_CORE_LOCALE;
        if (str.toLowerCase(locale).contains("android")) {
            return OperatingSystem.ANDROID;
        }
        String lowerCase = str2.toLowerCase(locale);
        if (lowerCase.contains("mac")) {
            return OperatingSystem.DARWIN;
        }
        if (lowerCase.contains("win")) {
            return OperatingSystem.WINDOWS;
        }
        if (lowerCase.contains("freebsd")) {
            return OperatingSystem.FREEBSD;
        }
        return OperatingSystem.LINUX;
    }

    public static synchronized NativeMethods loadNatives(OperatingSystem operatingSystem, String str) {
        NativeMethods nativeMethods;
        synchronized (H3CoreLoader.class) {
            if (libraryFile == null) {
                String LLLZ = C16880lQ.LLLZ("%s-%s", new Object[]{operatingSystem.getDirName(), str});
                String LLLZ2 = C16880lQ.LLLZ("libh3-java%s", new Object[]{operatingSystem.getSuffix()});
                File createTempFile = File.createTempFile("libh3-java", operatingSystem.getSuffix());
                C16880lQ.LLZ(createTempFile);
                copyResource(C16880lQ.LLLZ("/%s/%s", new Object[]{LLLZ, LLLZ2}), createTempFile);
                System.load(createTempFile.getCanonicalPath());
                libraryFile = createTempFile;
            }
            nativeMethods = new NativeMethods();
        }
        return nativeMethods;
    }
}

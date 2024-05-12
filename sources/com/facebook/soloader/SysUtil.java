package com.facebook.soloader;

import X.C0F0;
import X.C16880lQ;
import X.C39633Fgz;
import X.EnumC39643Fh9;
import X.X1D;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class SysUtil {

    /* loaded from: classes7.dex */
    public static class Api14Utils {
        public static String LIZ() {
            ClassLoader classLoader = C39633Fgz.class.getClassLoader();
            if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ClassLoader ");
                LIZ.append(classLoader.getClass().getName());
                LIZ.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class LollipopSysdeps {
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(EnumC39643Fh9.AARCH64.toString());
                    treeSet.add(EnumC39643Fh9.X86_64.toString());
                } else {
                    treeSet.add(EnumC39643Fh9.ARM.toString());
                    treeSet.add(EnumC39643Fh9.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException unused) {
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno == OsConstants.EOPNOTSUPP || (i = e.errno) == OsConstants.ENOSYS || i == OsConstants.EINVAL) {
                } else {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class MarshmallowSysdeps {
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (Process.is64Bit()) {
                treeSet.add(EnumC39643Fh9.AARCH64.toString());
                treeSet.add(EnumC39643Fh9.X86_64.toString());
            } else {
                treeSet.add(EnumC39643Fh9.ARM.toString());
                treeSet.add(EnumC39643Fh9.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static void LIZ(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                LIZ(file2);
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite()) {
            parentFile.setWritable(true);
        }
        if (!C16880lQ.LLLZZIL(file) && file.exists()) {
            throw new IOException(C0F0.LIZJ("Could not delete file ", file));
        }
    }

    public static void LIZIZ(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    LIZIZ(file2);
                }
                return;
            }
            throw new IOException(C0F0.LIZJ("cannot list directory ", file));
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r2.getMethod() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r6, android.content.Context r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r5 = 0
            if (r1 < r0) goto L67
            r0 = 2
            if (r6 != r0) goto L59
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            r1.<init>(r0)
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            r4.<init>(r1)
            java.util.Enumeration r3 = r4.entries()     // Catch: java.lang.Throwable -> L4f
        L1e:
            boolean r0 = r3.hasMoreElements()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r3.nextElement()     // Catch: java.lang.Throwable -> L4f
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L1e
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = ".so"
            boolean r0 = r1.endsWith(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L1e
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "/lib"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L1e
            int r0 = r2.getMethod()     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L4b
            r5 = 1
        L4b:
            r4.close()
            goto L67
        L4f:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r0 = move-exception
            r1.addSuppressed(r0)
        L58:
            throw r1
        L59:
            if (r7 == 0) goto L67
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()
            int r1 = r0.flags
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L67
            r5 = 1
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.LIZJ(int, android.content.Context):boolean");
    }
}

package com.ss.ugc.android.davinciresource;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C40517FvF;
import X.C68322mC;
import X.C76732zl;
import X.X1D;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import defpackage.i0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class DefaultUnZipper extends DAVUnZipFunc {
    public static final DefaultUnZipper INSTANCE = new DefaultUnZipper();

    private final boolean deleteFile(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                new C40517FvF(0, list.length - 1);
                for (String str : list) {
                    if (!deleteFile(new File(file, str))) {
                        return false;
                    }
                }
            } else {
                return true;
            }
        }
        return C16880lQ.LLLZZIL(file);
    }

    private final boolean isSafe(ZipEntry zipEntry) {
        String name;
        if (zipEntry == null || (name = zipEntry.getName()) == null || name.length() == 0) {
            return false;
        }
        String name2 = zipEntry.getName();
        o.LJFF(name2, "name");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("..");
        LIZ.append(File.separator);
        if (s.LJJJLZIJ(name2, X1D.LIZIZ(LIZ), false)) {
            return false;
        }
        return true;
    }

    public static final boolean renameFile(String srcPath, String destPath) {
        o.LJIIJ(srcPath, "srcPath");
        o.LJIIJ(destPath, "destPath");
        File file = new File(destPath);
        if (file.exists()) {
            INSTANCE.deleteFile(file);
        }
        File file2 = new File(srcPath);
        File file3 = new File(destPath);
        if (!file2.exists()) {
            return false;
        }
        return file2.renameTo(file3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.zip.ZipEntry] */
    public static final String unzip(File source, File destFile) {
        o.LJIIJ(source, "source");
        o.LJIIJ(destFile, "destFile");
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            String absolutePath = destFile.getAbsolutePath();
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            try {
                C68322mC c68322mC = new C68322mC();
                while (true) {
                    ?? nextEntry = zipInputStream.getNextEntry();
                    c68322mC.element = nextEntry;
                    if (nextEntry != 0) {
                        DefaultUnZipper defaultUnZipper = INSTANCE;
                        if (defaultUnZipper.isSafe(nextEntry)) {
                            ZipEntry zipEntry = (ZipEntry) c68322mC.element;
                            if (zipEntry != null) {
                                if (zipEntry.isDirectory()) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(absolutePath);
                                    LIZ.append(File.separator);
                                    ZipEntry zipEntry2 = (ZipEntry) c68322mC.element;
                                    if (zipEntry2 != null) {
                                        LIZ.append(zipEntry2.getName());
                                        new File(X1D.LIZIZ(LIZ)).mkdirs();
                                    } else {
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                } else {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(absolutePath);
                                    LIZ2.append(File.separator);
                                    ZipEntry zipEntry3 = (ZipEntry) c68322mC.element;
                                    if (zipEntry3 != null) {
                                        LIZ2.append(zipEntry3.getName());
                                        File file = new File(X1D.LIZIZ(LIZ2));
                                        File parentFile = file.getParentFile();
                                        if (parentFile != null && !parentFile.exists()) {
                                            parentFile.mkdirs();
                                        } else if (file.exists()) {
                                            defaultUnZipper.deleteFile(file);
                                        } else {
                                            file.createNewFile();
                                        }
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                                        try {
                                            new C76732zl();
                                            byte[] bArr = new byte[2048];
                                            while (true) {
                                                int read = zipInputStream.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                bufferedOutputStream.write(bArr, 0, read);
                                            }
                                            bufferedOutputStream.flush();
                                            AnonymousClass636.LJFF(bufferedOutputStream, null);
                                        } finally {
                                        }
                                    } else {
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                    } else {
                        AnonymousClass636.LJFF(zipInputStream, null);
                        String absolutePath2 = destFile.getAbsolutePath();
                        o.LJFF(absolutePath2, "destFile.absolutePath");
                        return absolutePath2;
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            INSTANCE.deleteFile(destFile);
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
    public boolean unZip(String str, String str2, boolean z) {
        boolean z2 = false;
        if (str != null && !ujb.o.LJJJJJL(str) && str2 != null && !ujb.o.LJJJJJL(str2)) {
            File file = new File(i0.LJFF(str2, "_temp"));
            if (file.exists()) {
                deleteFile(file);
            }
            try {
                unzip(new File(str), file);
                String absolutePath = file.getAbsolutePath();
                o.LJFF(absolutePath, "unzipTemp.absolutePath");
                z2 = renameFile(absolutePath, str2);
                if (z) {
                    deleteFile(new File(str));
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return z2;
    }
}

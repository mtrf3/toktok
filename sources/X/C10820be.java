package X;

import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10820be {
    public static final String LIZ;

    static {
        String str = File.separator;
        o.LJFF(str, "File.separator");
        LIZ = str;
    }

    public static C32621Pu LIZ(File file) {
        EnumC10840bg enumC10840bg = (EnumC10840bg) new IDqS420S0100000(file, 102).invoke();
        String name = file.getName();
        o.LJFF(name, "file.name");
        return new C32621Pu(name, new C10830bf(file.getAbsolutePath()), new C10830bf(file.getCanonicalPath()), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(file.lastModified()), Long.valueOf(file.length()), enumC10840bg);
    }

    public static void LIZIZ(InterfaceC10860bi interfaceC10860bi) {
        try {
            interfaceC10860bi.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static boolean LJ(String str) {
        if (str != null) {
            return new File(str).getAbsoluteFile().exists();
        }
        return false;
    }

    public static boolean LJFF(C10830bf c10830bf) {
        String str;
        if (c10830bf != null && (str = c10830bf.LIZIZ) != null) {
            return LJ(str);
        }
        return false;
    }

    public static C32621Pu LJI(C10830bf c10830bf) {
        String str;
        if (c10830bf != null && (str = c10830bf.LIZIZ) != null) {
            return LIZ(new File(str));
        }
        return null;
    }

    public static String LJII(String str) {
        if (str != null) {
            return new File(str).getName();
        }
        return null;
    }

    public static List LJIIIIZZ(String str) {
        File absoluteFile;
        Object valueOf;
        if (str == null || (absoluteFile = new File(str).getAbsoluteFile()) == null || !absoluteFile.exists()) {
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = absoluteFile.listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(listFiles.length);
            for (File it : listFiles) {
                o.LJFF(it, "it");
                if (it.isDirectory()) {
                    String name = it.getName();
                    o.LJFF(name, "it.name");
                    if (!s.LJJJLZIJ(name, "__MACOSX", false)) {
                        List LJIIIIZZ = LJIIIIZZ(it.getAbsolutePath());
                        if (LJIIIIZZ != null) {
                            valueOf = Boolean.valueOf(arrayList.addAll(LJIIIIZZ));
                        } else {
                            valueOf = null;
                        }
                    } else {
                        valueOf = C76800UCe.LIZ;
                    }
                } else {
                    String absolutePath = it.getAbsolutePath();
                    o.LJFF(absolutePath, "it.absolutePath");
                    valueOf = Boolean.valueOf(arrayList.add(absolutePath));
                }
                arrayList2.add(valueOf);
            }
        }
        return arrayList;
    }

    public static String LJIIIZ(String str) {
        int LJJLIIJ;
        if (str == null || (LJJLIIJ = s.LJJLIIJ(str, LIZ, 6)) < 0) {
            return null;
        }
        String substring = str.substring(LJJLIIJ + 1, str.length());
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String LJIIJ(C32611Pt c32611Pt) {
        EnumC10800bc contentEncoding = EnumC10800bc.Utf8;
        o.LJIIJ(contentEncoding, "contentEncoding");
        InputStream inputStream = c32611Pt.LIZ;
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, ((Charset) new IDqS420S0100000(contentEncoding, 103).invoke()).name());
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                for (int read = inputStreamReader.read(cArr); read != -1; read = inputStreamReader.read(cArr)) {
                    stringWriter.write(cArr, 0, read);
                }
                String stringWriter2 = stringWriter.toString();
                o.LJFF(stringWriter2, "writer.toString()");
                AnonymousClass636.LJFF(inputStreamReader, null);
                return stringWriter2;
            } finally {
            }
        } else {
            o.LJIJI("inputStream");
            throw null;
        }
    }

    public static void LJIIJJI(String path) {
        o.LJIIJ(path, "path");
        new File(path).getAbsoluteFile().mkdirs();
    }

    public static List LJIILJJIL(String path) {
        o.LJIIJ(path, "path");
        File[] listFiles = new File(path).getAbsoluteFile().listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File it : listFiles) {
                o.LJFF(it, "it");
                arrayList.add(LIZ(it));
            }
            return arrayList;
        }
        return null;
    }

    public static boolean LJIILL(String path) {
        o.LJIIJ(path, "path");
        File file = new File(path);
        if (file.exists()) {
            File absoluteFile = file.getAbsoluteFile();
            o.LJFF(absoluteFile, "file.absoluteFile");
            if (OR7.LLLIIL(absoluteFile)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILLIIL(C10830bf c10830bf) {
        String str;
        if (c10830bf != null && (str = c10830bf.LIZIZ) != null) {
            return LJIILL(str);
        }
        return false;
    }

    public static boolean LIZJ(String str, String str2) {
        try {
            File srcFile = new File(str).getAbsoluteFile();
            File destFile = new File(str2).getAbsoluteFile();
            o.LJFF(srcFile, "srcFile");
            o.LJFF(destFile, "destFile");
            return OR7.LLLIIIIL(srcFile, destFile, true, C41470GPi.LJLIL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static C32631Pv LJIIL(String path, boolean z) {
        o.LJIIJ(path, "path");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(path).getAbsoluteFile(), z);
        C32631Pv c32631Pv = new C32631Pv();
        c32631Pv.LIZ = fileOutputStream;
        return c32631Pv;
    }

    public static C32631Pv LJIILIIL(C10830bf c10830bf, boolean z) {
        String str;
        if (c10830bf != null && (str = c10830bf.LIZIZ) != null) {
            return LJIIL(str, z);
        }
        return null;
    }

    public static boolean LJIIZILJ(C10830bf c10830bf, C10830bf c10830bf2) {
        if (c10830bf == null || c10830bf2 == null) {
            return false;
        }
        if (LJFF(c10830bf2)) {
            LJIILLIIL(c10830bf2);
        }
        File file = new File(c10830bf.LIZIZ);
        File file2 = new File(c10830bf2.LIZIZ);
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    public static boolean LJIJ(String zipFilePath, String unzipFileFolderPath) {
        o.LJIIJ(zipFilePath, "zipFilePath");
        o.LJIIJ(unzipFileFolderPath, "unzipFileFolderPath");
        return LJIJJ(new C20C(zipFilePath, unzipFileFolderPath), zipFilePath, unzipFileFolderPath);
    }

    public static boolean LJIJI(String zipFilePath, String unzipFileFolderPath) {
        o.LJIIJ(zipFilePath, "zipFilePath");
        o.LJIIJ(unzipFileFolderPath, "unzipFileFolderPath");
        try {
            LJIJJLI(zipFilePath, unzipFileFolderPath);
            return true;
        } catch (Exception e) {
            String LJIIIZ = LJIIIZ(zipFilePath);
            if (LJIIIZ != null) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZIZ = C25620zW.LIZIZ("[Unzip][B][File: ", LJIIIZ, "][");
                LIZIZ.append(C78963Uyt.LJIJJLI(e));
                LIZIZ.append(']');
                String LIZIZ2 = X1D.LIZIZ(LIZIZ);
                c12310e3.getClass();
                C12310e3.LIZIZ("JKL", LIZIZ2, null);
            }
            try {
                return LJIJJ(null, zipFilePath, unzipFileFolderPath);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unzip Failed";
                }
                throw new C10870bj(message);
            }
        }
    }

    public static void LJIJJLI(String str, String str2) {
        String LJIIIZ = LJIIIZ(str);
        if (LJIIIZ != null) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[Unzip][B][File: ");
            LIZ2.append(LJIIIZ);
            LIZ2.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ2);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
        }
        ZipFile zipFile = new ZipFile(str);
        File file = new File(str2);
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            o.LJFF(absolutePath, "targetDirectory.absolutePath");
            LJIILL(absolutePath);
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        o.LJFF(entries, "archive.entries()");
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            o.LJFF(nextElement, "e.nextElement()");
            ZipEntry zipEntry = nextElement;
            File file2 = new File(file, zipEntry.getName());
            String name = zipEntry.getName();
            if (name != null && !s.LJJJLZIJ(name, "../", false)) {
                if (zipEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    o.LJFF(inputStream, "archive.getInputStream(entry)");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                    }
                    inputStream.close();
                    bufferedOutputStream.close();
                }
            }
        }
        if (LJIIIZ != null) {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[Unzip][B][End][File: ");
            LIZ3.append(LJIIIZ);
            LIZ3.append("][Suc]");
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            c12310e32.getClass();
            C12310e3.LIZ("JKL", LIZIZ2);
        }
    }

    public static void LJIL(String str, String str2) {
        EnumC10800bc encoding = EnumC10800bc.Utf8;
        o.LJIIJ(encoding, "encoding");
        File absoluteFile = new File(str).getAbsoluteFile();
        if (!absoluteFile.exists()) {
            absoluteFile.createNewFile();
        }
        if (encoding == EnumC10800bc.Base64) {
            byte[] bytes = str2.getBytes(PVC.LIZ);
            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
            str2 = Base64.encodeToString(bytes, 0);
            o.LJFF(str2, "Base64.encodeToString(so…s.UTF_8), Base64.DEFAULT)");
        } else if (C10810bd.LIZ[encoding.ordinal()] == 1) {
            byte[] bytes2 = str2.getBytes(PVC.LIZ);
            o.LJFF(bytes2, "(this as java.lang.String).getBytes(charset)");
            str2 = new String(bytes2, PVC.LIZIZ);
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(absoluteFile, false));
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                AnonymousClass636.LJFF(outputStreamWriter, null);
            } finally {
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static boolean LIZLLL(File file, File file2, C283719l c283719l) {
        boolean mkdirs;
        boolean mkdirs2;
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getPath());
        String str = File.separator;
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(file2.getPath());
        LIZ3.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        if (s.LJJJLZIJ(LIZIZ2, LIZIZ, false) || !file.exists() || !file.isDirectory()) {
            return false;
        }
        if (file2.exists()) {
            mkdirs = file2.isDirectory();
        } else {
            mkdirs = file2.mkdirs();
        }
        if (!mkdirs) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file3 : listFiles) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ2);
                o.LJFF(file3, "file");
                LIZ4.append(file3.getName());
                File file4 = new File(X1D.LIZIZ(LIZ4));
                if (file3.isFile()) {
                    if (!o.LJ(file3, file4) && file3.exists() && file3.isFile()) {
                        if (file4.exists()) {
                            continue;
                        } else {
                            File parentFile = file4.getParentFile();
                            if (parentFile != null) {
                                if (parentFile.exists()) {
                                    mkdirs2 = parentFile.isDirectory();
                                } else {
                                    mkdirs2 = parentFile.mkdirs();
                                }
                                if (mkdirs2) {
                                    try {
                                        String absolutePath = file3.getAbsolutePath();
                                        o.LJFF(absolutePath, "srcFile.absolutePath");
                                        String absolutePath2 = file4.getAbsolutePath();
                                        o.LJFF(absolutePath2, "destFile.absolutePath");
                                        if (LIZJ(absolutePath, absolutePath2)) {
                                        }
                                    } catch (FileNotFoundException e) {
                                        C16880lQ.LLLLIIL(e);
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                if (file3.isDirectory() && !LIZLLL(file3, file4, c283719l)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIJJ(C20C c20c, String str, String str2) {
        ZipInputStream zipInputStream;
        String LJIIIZ = LJIIIZ(str);
        if (LJIIIZ != null) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[Unzip][A][Start][File: ");
            LIZ2.append(LJIIIZ);
            LIZ2.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ2);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
        }
        File file = new File(str2);
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            o.LJFF(absolutePath, "dir.absolutePath");
            LJIILL(absolutePath);
        }
        boolean z = false;
        try {
            try {
                String canonicalDirPath = file.getCanonicalPath();
                zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    while (nextEntry != null) {
                        String szName = nextEntry.getName();
                        o.LJFF(szName, "szName");
                        if (s.LJJJLZIJ(szName, "../", false)) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File file2 = new File(file, szName);
                            String canonicalDestPath = file2.getCanonicalPath();
                            o.LJFF(canonicalDestPath, "canonicalDestPath");
                            o.LJFF(canonicalDirPath, "canonicalDirPath");
                            if (ujb.o.LJJJLIIL(canonicalDestPath, canonicalDirPath, false)) {
                                if (nextEntry.isDirectory()) {
                                    file2.mkdirs();
                                    nextEntry = zipInputStream.getNextEntry();
                                } else {
                                    File parentFile = file2.getParentFile();
                                    if (parentFile != null && !parentFile.exists()) {
                                        parentFile.mkdirs();
                                    } else if (file2.exists()) {
                                        C16880lQ.LLLZZIL(file2);
                                    }
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                                    new C76732zl();
                                    byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    zipInputStream.closeEntry();
                                    nextEntry = zipInputStream.getNextEntry();
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Entry is outside of the target dir: ");
                                LIZ3.append(nextEntry.getName());
                                throw new C10870bj(X1D.LIZIZ(LIZ3));
                            }
                        }
                    }
                    if (LJIIIZ != null) {
                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("[Unzip][A][End][File: ");
                        LIZ4.append(LJIIIZ);
                        LIZ4.append("][Suc]");
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        c12310e32.getClass();
                        C12310e3.LIZ("JKL", LIZIZ2);
                    }
                    try {
                        zipInputStream.close();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    if (c20c != null) {
                        if (LJIIIZ != null) {
                            try {
                                C12310e3 c12310e33 = C12310e3.LIZIZ;
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("[Unzip][B][File: ");
                                LIZ5.append(LJIIIZ);
                                LIZ5.append("][");
                                LIZ5.append(C78963Uyt.LJIJJLI(e));
                                LIZ5.append(']');
                                String LIZIZ3 = X1D.LIZIZ(LIZ5);
                                c12310e33.getClass();
                                C12310e3.LIZIZ("JKL", LIZIZ3, null);
                            } catch (Exception e3) {
                                String message = e3.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                throw new C10870bj(message);
                            }
                        }
                        c20c.invoke();
                        z = true;
                    }
                    if (zipInputStream != null) {
                        try {
                            zipInputStream.close();
                        } catch (Exception e4) {
                            C16880lQ.LLLLIIL(e4);
                        }
                    }
                    return z;
                }
            } catch (Throwable th) {
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                        throw th;
                    } catch (Exception e5) {
                        C16880lQ.LLLLIIL(e5);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            zipInputStream = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

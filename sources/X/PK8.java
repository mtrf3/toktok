package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PK8 {
    public static boolean LIZJ(File file) {
        boolean LIZJ;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return C16880lQ.LLLZZIL(file);
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    if (listFiles[i].canWrite()) {
                        LIZJ = C16880lQ.LLLZZIL(listFiles[i]);
                    } else {
                        z = false;
                    }
                } else {
                    LIZJ = LIZJ(listFiles[i]);
                }
                z &= LIZJ;
            }
        }
        return z & C16880lQ.LLLZZIL(file);
    }

    public static PKA LIZLLL(String str) {
        try {
            String LJFF = LJFF(str);
            if (LJFF == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(LJFF);
            PKA pka = new PKA();
            pka.LIZ = jSONObject.optString("url");
            pka.LIZIZ = jSONObject.optJSONObject("body");
            jSONObject.optString("dump_file");
            jSONObject.optBoolean("encrypt", false);
            return pka;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String LJ(File file) {
        return LJI("\n", file, -1L);
    }

    public static String LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return LJI("\n", new File(str), -1L);
    }

    public static JSONArray LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return LJII(new File(str), -1L);
    }

    public static java.util.Map<String, String> LJIIIZ(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    properties.load(fileInputStream);
                    java.util.Set<String> stringPropertyNames = properties.stringPropertyNames();
                    HashMap hashMap = new HashMap();
                    for (String str : stringPropertyNames) {
                        hashMap.put(str, properties.getProperty(str));
                    }
                    FPX.LIZIZ(fileInputStream);
                    return hashMap;
                } catch (IOException unused) {
                    C78685UuP.LJLIL();
                    FPX.LIZIZ(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                FPX.LIZIZ(fileInputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            FPX.LIZIZ(fileInputStream2);
            throw th;
        }
    }

    public static void LJIIL(File file) {
        try {
            file.createNewFile();
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("err create file ");
            LIZ.append(file.getAbsolutePath());
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLL();
        }
    }

    public static void LIZIZ(File file, File file2) {
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    return;
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            LIZ(Integer.MAX_VALUE, file, file2, false);
            return;
        }
        if (file2.exists()) {
            if (file2.isFile()) {
                C16880lQ.LLLZZIL(file2);
            } else if (!file2.getName().equals(file.getName())) {
                return;
            }
        } else {
            file2.mkdirs();
        }
        for (String str : file.list()) {
            LIZIZ(new File(file, str), new File(file2, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static JSONArray LJII(File file, long j) {
        JSONArray jSONArray = new JSONArray();
        ?? r1 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            r1 = 0;
            if (j > 0) {
                try {
                    bufferedReader.skip(j);
                    bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    r1 = bufferedReader;
                    FPX.LIZIZ(r1);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    FPX.LIZIZ(bufferedReader);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r16 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PKA LJIIJ(java.io.File r16, com.bytedance.crash.CrashType r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PK8.LJIIJ(java.io.File, com.bytedance.crash.CrashType):X.PKA");
    }

    public static int LJIIJJI(PKN pkn, File file) {
        int i = -1;
        for (int i2 = 0; i2 < 6; i2++) {
            String LJ = KMP.LJ(".", i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getName());
            LIZ.append(LJ);
            File file2 = new File(file, X1D.LIZIZ(LIZ));
            if (file2.exists()) {
                try {
                    PKN.LJI(pkn.LIZ, new JSONObject(LJFF(file2.getAbsolutePath())));
                    pkn.LJIIJJI("succ_step", Integer.valueOf(i2));
                    i = i2;
                } catch (Throwable unused) {
                }
            }
        }
        pkn.LJFF("succ_step", String.valueOf(i));
        return i;
    }

    public static void LJIILL(File file, JSONArray jSONArray) {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            try {
                new C64317PMb(bufferedWriter).LIZ(jSONArray);
                bufferedWriter.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
        FPX.LIZIZ(bufferedWriter);
    }

    public static void LJIILLIIL(File file, JSONObject jSONObject) {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            try {
                new C64317PMb(bufferedWriter).LIZJ(jSONObject);
                bufferedWriter.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
        FPX.LIZIZ(bufferedWriter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIZILJ(File file, java.util.Map<String, String> map) {
        OutputStream outputStream;
        Properties properties;
        if (map == null || map.isEmpty()) {
            return;
        }
        OutputStream outputStream2 = null;
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream3 = null;
        try {
            try {
                properties = new Properties();
                outputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                outputStream = outputStream2;
            }
        } catch (IOException unused) {
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                properties.setProperty(key, entry.getValue());
                fileOutputStream = key;
            }
            properties.store(outputStream, "no");
            FPX.LIZIZ(outputStream);
            outputStream2 = fileOutputStream;
        } catch (IOException unused2) {
            outputStream3 = outputStream;
            C78685UuP.LJLIL();
            FPX.LIZIZ(outputStream3);
            outputStream2 = outputStream3;
        } catch (Throwable th2) {
            th = th2;
            FPX.LIZIZ(outputStream);
            throw th;
        }
    }

    public static void LJIJI(OutputStream outputStream, PK7... pk7Arr) {
        ZipOutputStream zipOutputStream;
        File[] fileArr;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
            zipOutputStream = null;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry("/"));
            for (PK7 pk7 : pk7Arr) {
                if (pk7 != null) {
                    File file = pk7.LIZ;
                    if (file == null && (fileArr = pk7.LIZIZ) != null) {
                        for (File file2 : fileArr) {
                            LJIJJ(zipOutputStream, file2, pk7.LIZJ);
                        }
                    } else {
                        LJIJJ(zipOutputStream, file, pk7.LIZJ);
                    }
                }
            }
            FPX.LIZIZ(zipOutputStream);
        } catch (Throwable th2) {
            th = th2;
            FPX.LIZIZ(zipOutputStream);
            throw th;
        }
    }

    public static String LJI(String str, File file, long j) {
        BufferedReader bufferedReader;
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader.skip(j);
                    bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    FPX.LIZIZ(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (sb.length() != 0) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    FPX.LIZIZ(bufferedReader);
                    return sb.toString();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static void LJIILJJIL(File file, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                FPX.LIZIZ(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                FPX.LIZIZ(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LJIJ(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream fileInputStream;
        String LJFF;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(i0.LJFF(str, "/")));
            if (str.length() == 0) {
                LJFF = "";
            } else {
                LJFF = i0.LJFF(str, "/");
            }
            for (File file2 : listFiles) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJFF);
                LIZ.append(file2.getName());
                LJIJ(file2, X1D.LIZIZ(LIZ), zipOutputStream);
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (-1 != read) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        FPX.LIZIZ(fileInputStream);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                FPX.LIZIZ(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void LJIJJ(ZipOutputStream zipOutputStream, File file, boolean z) {
        File[] fileArr;
        if (file == null || !file.exists()) {
            return;
        }
        if (!z && file.isDirectory()) {
            LJIJ(file, file.getName(), zipOutputStream);
            return;
        }
        if (file.isDirectory()) {
            fileArr = file.listFiles();
            if (fileArr == null) {
                return;
            }
        } else {
            fileArr = new File[]{file};
        }
        for (File file2 : fileArr) {
            LJIJ(file2, file2.getName(), zipOutputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(int i, File file, File file2, boolean z) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (file != null && file.exists()) {
            if (file2.exists() && !z) {
                return;
            }
            FileOutputStream fileOutputStream3 = null;
            try {
                file2.getParentFile().mkdirs();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream2 = new FileOutputStream(file2, z);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                    int i2 = 0;
                    do {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                        i2 += read;
                    } while (i2 < i);
                    FPX.LIZIZ(fileInputStream);
                } catch (Exception unused2) {
                    fileOutputStream3 = fileOutputStream2;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream3 = fileInputStream;
                    FPX.LIZIZ(fileOutputStream3);
                    FPX.LIZIZ(fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream2;
                    fileOutputStream = fileOutputStream3;
                    fileOutputStream3 = fileInputStream;
                    FPX.LIZIZ(fileOutputStream3);
                    FPX.LIZIZ(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused3) {
                fileOutputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            FPX.LIZIZ(fileOutputStream2);
        }
    }

    public static String LJIILIIL(File file, String str, String str2, JSONObject jSONObject) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", true);
            LJIILLIIL(file2, jSONObject2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return file2.getAbsolutePath();
    }
}

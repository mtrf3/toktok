package X;

import android.text.TextUtils;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class PKX {
    public static final Pattern LJIIIIZZ = PatternProtector.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    public static final Pattern LJIIIZ = PatternProtector.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    public static final Pattern LJIIJ = PatternProtector.compile("^Abort message: (.*)$");
    public static final Pattern LJIIJJI = PatternProtector.compile("^Crash message: (.*)$");
    public static final Pattern LJIIL = PatternProtector.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public final java.util.Map<String, String> LJI = new HashMap();
    public final java.util.Set<String> LJII = new HashSet();

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        String str = this.LIZJ;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.LIZLLL;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.LJ;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public PKX(File file) {
        LIZLLL(new File(file, "tombstone.txt"));
    }

    public static String[] LIZIZ(String str) {
        int lastIndexOf;
        String[] split = str.split("\\s+");
        String[] strArr = {"", ""};
        if (split.length >= 4) {
            String str2 = null;
            for (String str3 : split) {
                if (str3.startsWith("/") && str3.endsWith(".so")) {
                    str2 = str3;
                }
            }
            if (!TextUtils.isEmpty(str2) && str2.endsWith(".so") && !str2.contains("/system/lib") && (lastIndexOf = str2.lastIndexOf(47)) != -1) {
                int i = lastIndexOf + 1;
                String substring = str2.substring(i);
                if (substring.contains(".apk!")) {
                    substring = substring.substring(substring.indexOf(".apk!") + 5);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2.substring(0, i));
                LIZ.append(substring);
                String LIZIZ = X1D.LIZIZ(LIZ);
                strArr[0] = substring;
                strArr[1] = LIZIZ;
                return strArr;
            }
        }
        return null;
    }

    public final void LIZ(File file) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.LJII).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                String name = new File(str).getName();
                if (!((HashMap) this.LJI).containsKey(name)) {
                    NativeTools.LJIILJJIL().getClass();
                    String LJIILL = NativeTools.LJIILL(str);
                    if (!TextUtils.isEmpty(LJIILL)) {
                        ((HashMap) this.LJI).put(name, LJIILL);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("    ");
                        LIZ.append(str);
                        LIZ.append(" (BuildId: ");
                        LIZ.append(LJIILL);
                        LIZ.append(")");
                        arrayList.add(X1D.LIZIZ(LIZ));
                        StringBuilder LIZ2 = X1D.LIZ();
                        C1DI.LIZIZ(LIZ2, "getBuildId nextStart: ", str, " : ");
                        LIZ2.append((String) ((HashMap) this.LJI).get(name));
                        X1D.LIZIZ(LIZ2);
                        C78685UuP.LJJJLL();
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            String[] strArr = new String[arrayList.size()];
            String absolutePath = file.getAbsolutePath();
            String[] strArr2 = (String[]) arrayList.toArray(strArr);
            try {
                File file2 = new File(absolutePath);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                String parent = file2.getParent();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(file2.getName());
                LIZ3.append(".temp");
                File file3 = new File(parent, X1D.LIZIZ(LIZ3));
                PrintWriter printWriter = new PrintWriter(new FileOutputStream(file3));
                char c = 0;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.equals("build id:") && c <= 0) {
                            c = 1;
                            printWriter.println(readLine);
                            for (String str2 : strArr2) {
                                printWriter.println(str2);
                            }
                        } else {
                            printWriter.println(readLine);
                        }
                    } else {
                        printWriter.flush();
                        printWriter.close();
                        bufferedReader.close();
                        C16880lQ.LLLZZIL(file2);
                        file3.renameTo(file2);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZLLL(File file) {
        BufferedReader bufferedReader;
        if (!file.exists() || file.length() == 0) {
            return;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || i2 >= 64) {
                        break;
                    }
                    if (this.LIZ == null && readLine.startsWith("pid: ")) {
                        Matcher matcher = LJIIIIZZ.matcher(readLine);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.LIZ = matcher.group(1);
                            matcher.group(2);
                            this.LIZIZ = matcher.group(3);
                            matcher.group(4);
                        }
                    } else if (this.LIZJ == null && readLine.startsWith("signal ")) {
                        Matcher matcher2 = LJIIIZ.matcher(readLine);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String replace = matcher2.group(1).replace(" ", "");
                            String replace2 = matcher2.group(2).replace(" ", "");
                            int indexOf = replace2.indexOf("frompid");
                            if (indexOf > 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(replace2.substring(0, indexOf));
                                LIZ.append(")");
                                replace2 = X1D.LIZIZ(LIZ);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Signal ");
                            LIZ2.append(replace);
                            LIZ2.append(", Code ");
                            LIZ2.append(replace2);
                            LIZ2.append("\n");
                            this.LIZJ = X1D.LIZIZ(LIZ2);
                        }
                    } else if (this.LIZLLL == null && readLine.startsWith("Abort ")) {
                        Matcher matcher3 = LJIIJ.matcher(readLine);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("abort message: ");
                            LIZ3.append(matcher3.group(1));
                            LIZ3.append("\n");
                            this.LIZLLL = X1D.LIZIZ(LIZ3);
                        }
                    } else if (this.LIZLLL == null && readLine.startsWith("Crash ")) {
                        Matcher matcher4 = LJIIJJI.matcher(readLine);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("crash message: ");
                            LIZ4.append(matcher4.group(1));
                            LIZ4.append("\n");
                            this.LIZLLL = X1D.LIZIZ(LIZ4);
                        }
                    } else if (this.LJ == null && readLine.startsWith("backtrace:")) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine2 = bufferedReader.readLine();
                            if (readLine2 == null || !readLine2.startsWith("    #")) {
                                break;
                            }
                            String substring = readLine2.substring(4);
                            sb.append(substring);
                            sb.append('\n');
                            String[] LIZIZ = LIZIZ(substring);
                            if (LIZIZ != null) {
                                ((HashSet) this.LJII).add(LIZIZ[1]);
                            }
                        }
                        i2++;
                        this.LJ = sb.toString();
                    } else if (((HashMap) this.LJI).isEmpty() && readLine.startsWith("build id:")) {
                        while (true) {
                            String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null) {
                                break;
                            }
                            if (!readLine3.contains("BuildId:")) {
                                while (true) {
                                    if (readLine3.startsWith("stack:")) {
                                        this.LJFF = true;
                                        break;
                                    }
                                    readLine3 = bufferedReader.readLine();
                                    i++;
                                    if (i >= 10 || readLine3 == null) {
                                        break;
                                    }
                                }
                            } else {
                                Matcher matcher5 = LJIIL.matcher(readLine3);
                                if (matcher5.find()) {
                                    ((HashMap) this.LJI).put(matcher5.group(2), matcher5.group(3));
                                }
                            }
                        }
                        C78685UuP.LJJJLL();
                    }
                    i2++;
                } catch (Throwable th) {
                    th = th;
                    try {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                    } finally {
                        FPX.LIZIZ(bufferedReader);
                    }
                }
            }
            C78685UuP.LJJJLL();
            FPX.LIZIZ(bufferedReader);
            LIZ(file);
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public final void LJ(File file) {
        LIZLLL(new File(file, "tombstone.txt"));
    }
}

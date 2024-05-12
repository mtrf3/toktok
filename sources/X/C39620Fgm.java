package X;

import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Fgm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39620Fgm {
    public static final Pattern LIZLLL;
    public final String LIZ;
    public final long LIZIZ;
    public final java.util.Map<String, String> LIZJ = new HashMap();

    static {
        PatternProtector.compile("(?<===).*?(?===ERROR)");
        PatternProtector.compile("(?<=AddressSanitizer:).*?(?=on)");
        PatternProtector.compile("(?<=asan/).*?(?=/asan_report)");
        PatternProtector.compile("__asan_handle_no_return");
        LIZLLL = PatternProtector.compile("(?<=\\().*?(?=\\+)");
    }

    public C39620Fgm(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            return;
        }
        this.LIZIZ = new Date(file.lastModified()).getTime();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("    #")) {
                        Matcher matcher = LIZLLL.matcher(readLine);
                        if (matcher.find() && matcher.group(0) != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(matcher.group(0));
                            LIZ.append("\n");
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            if (LIZIZ.startsWith("/data/")) {
                                String name = new File(LIZIZ.trim()).getName();
                                NativeTools.LJIILJJIL().getClass();
                                String LJIILL = NativeTools.LJIILL(name);
                                if (LJIILL != null) {
                                    ((HashMap) this.LIZJ).put(name, LJIILL);
                                } else {
                                    NativeTools.LJIILJJIL().getClass();
                                    String LJIILL2 = NativeTools.LJIILL(LIZIZ);
                                    if (LJIILL2 != null) {
                                        ((HashMap) this.LIZJ).put(name, LJIILL2);
                                    }
                                }
                            }
                        }
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(readLine);
                    LIZ2.append("\n");
                    sb.append(X1D.LIZIZ(LIZ2));
                }
                this.LIZ = sb.toString();
            } catch (Throwable th) {
                th = th;
                try {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                } finally {
                    FPX.LIZIZ(bufferedReader);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }
}

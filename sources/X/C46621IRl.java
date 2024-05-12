package X;

import java.io.BufferedReader;
import java.io.File;

/* renamed from: X.IRl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46621IRl extends ARS {
    public static final Character LJ = ')';

    public C46621IRl() {
        super("proc/self/stat");
    }

    public InterfaceC46610IRa LIZJ(File file) {
        C46622IRm c46622IRm;
        String readLine;
        BufferedReader LIZIZ = IU9.LIZIZ(file);
        C46622IRm c46622IRm2 = null;
        try {
        } catch (Throwable unused) {
            c46622IRm2 = c46622IRm;
        }
        if (LIZIZ == null) {
            return null;
        }
        try {
            readLine = LIZIZ.readLine();
        } catch (Exception e) {
            e = e;
            c46622IRm = null;
        } catch (Throwable unused2) {
        }
        if (readLine != null && !readLine.isEmpty()) {
            String trim = readLine.trim();
            Character ch = LJ;
            String trim2 = trim.substring(0, trim.indexOf(ch.charValue())).trim();
            String trim3 = trim.substring(trim.indexOf(ch.charValue()) + 1, trim.length()).trim();
            String[] split = trim2.split("\\(");
            String[] split2 = trim3.split(" ");
            if (split.length > 1 && split2.length > 14) {
                c46622IRm = new C46622IRm();
                try {
                    c46622IRm.LIZIZ = Integer.parseInt(split[0].trim());
                    c46622IRm.LIZ = split[1].trim();
                    c46622IRm.LIZJ = (Integer.parseInt(split2[11]) + Integer.parseInt(split2[12]) + Integer.parseInt(split2[13]) + Integer.parseInt(split2[14])) * 10;
                } catch (Exception e2) {
                    e = e2;
                    android.util.Log.getStackTraceString(e);
                    IU9.LIZ(LIZIZ);
                    return c46622IRm;
                }
                IU9.LIZ(LIZIZ);
                return c46622IRm;
            }
        }
        IU9.LIZ(LIZIZ);
        return c46622IRm2;
    }
}

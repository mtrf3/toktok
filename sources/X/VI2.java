package X;

import J.N;
import android.util.Printer;
import com.ttnet.org.chromium.base.EarlyTraceEvent;
import com.ttnet.org.chromium.base.TraceEvent;

/* loaded from: classes15.dex */
public class VI2 implements Printer {
    public String LJLIL;

    public void LIZ(String str) {
        int indexOf;
        String str2;
        int indexOf2;
        String LJFF;
        boolean LIZIZ = EarlyTraceEvent.LIZIZ();
        if (TraceEvent.LJLILLLLZI || LIZIZ) {
            if (TraceEvent.LJLJJI) {
                LJFF = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Looper.dispatch: ");
                int indexOf3 = str.indexOf(40, 18);
                if (indexOf3 == -1) {
                    indexOf = -1;
                } else {
                    indexOf = str.indexOf(41, indexOf3);
                }
                String str3 = "";
                if (indexOf == -1) {
                    str2 = "";
                } else {
                    str2 = str.substring(indexOf3 + 1, indexOf);
                }
                LIZ.append(str2);
                LIZ.append("(");
                int indexOf4 = str.indexOf(125, 18);
                if (indexOf4 == -1 || (indexOf2 = str.indexOf(58, indexOf4)) == -1) {
                    indexOf2 = str.length();
                }
                if (indexOf4 != -1) {
                    str3 = str.substring(indexOf4 + 2, indexOf2);
                }
                LJFF = JBR.LJFF(LIZ, str3, ")", LIZ);
            }
            this.LJLIL = LJFF;
            if (TraceEvent.LJLILLLLZI) {
                N.MljCyOuh(this.LJLIL);
            } else {
                EarlyTraceEvent.LIZ(this.LJLIL, true);
            }
        }
    }

    public void LIZIZ(String str) {
        boolean LIZIZ = EarlyTraceEvent.LIZIZ();
        if ((TraceEvent.LJLILLLLZI || LIZIZ) && this.LJLIL != null) {
            if (TraceEvent.LJLILLLLZI) {
                N.M6R6NWXS(this.LJLIL);
            } else {
                EarlyTraceEvent.LIZJ(this.LJLIL, true);
            }
        }
        this.LJLIL = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            LIZ(str);
        } else {
            LIZIZ(str);
        }
    }
}

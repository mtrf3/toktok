package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PY0 {
    public String LIZ;
    public String LIZLLL;
    public String LJII;
    public String LJIIIIZZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJ = -1;
    public final C35606DyE LJFF = new C35606DyE();
    public final C22660uk LJI = new C22660uk();

    public final String LIZ() {
        if ("http".equals(this.LIZ)) {
            return "http";
        }
        return "https";
    }

    public final String LIZIZ() {
        String LIZLLL;
        String LIZLLL2;
        StringBuilder sb = new StringBuilder();
        sb.append(LIZ());
        sb.append("://");
        if (!this.LIZIZ.isEmpty() || !this.LIZJ.isEmpty()) {
            if (this.LIZIZ.isEmpty()) {
                LIZLLL = "";
            } else {
                LIZLLL = QCU.LIZLLL(this.LIZIZ, " \"':;<=>@[]^`{}|/\\?#", false, true);
            }
            sb.append(LIZLLL);
            if (this.LIZJ.isEmpty()) {
                LIZLLL2 = "";
            } else {
                LIZLLL2 = QCU.LIZLLL(this.LIZJ, " \"':;<=>@[]^`{}|/\\?#", false, true);
            }
            if (!LIZLLL2.isEmpty()) {
                sb.append(':');
                sb.append(LIZLLL2);
            }
            sb.append('@');
        }
        if (this.LIZLLL.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.LIZLLL);
            sb.append(']');
        } else {
            sb.append(this.LIZLLL);
        }
        int i = this.LJ;
        if (i == -1) {
            i = C64626PXy.LIZLLL(LIZ());
        }
        if (i != C64626PXy.LIZLLL(LIZ())) {
            sb.append(':');
            sb.append(i);
        }
        C35606DyE c35606DyE = this.LJFF;
        c35606DyE.getClass();
        int size = ((ArrayList) c35606DyE.LIZ).size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            String str = (String) ListProtector.get(c35606DyE.LIZ, i2);
            sb.append(QCU.LIZJ(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, true));
        }
        C22660uk c22660uk = this.LJI;
        c22660uk.getClass();
        sb.append('?');
        for (Map.Entry entry : ((java.util.Map) c22660uk.LIZJ).entrySet()) {
            String str2 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            String encodeName = QCU.LIZLLL(str2, (String) c22660uk.LIZIZ, true, true);
            for (String str3 : list) {
                o.LJIIIIZZ(encodeName, "encodeName");
                sb.append(encodeName);
                if (str3 != null) {
                    sb.append('=');
                    sb.append(QCU.LIZLLL(str3, (String) c22660uk.LIZIZ, true, true));
                }
                sb.append('&');
            }
        }
        sb.setLength(sb.length() - 1);
        if (this.LJII != null) {
            sb.append('#');
            sb.append(QCU.LIZLLL(this.LJII, "", false, false));
        }
        return sb.toString();
    }

    public final String toString() {
        return LIZIZ();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0165 A[EDGE_INSN: B:160:0x0165->B:79:0x0165 BREAK  A[LOOP:5: B:112:0x0214->B:144:0x0214], SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x02db -> B:122:0x0212). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0246 -> B:122:0x0212). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PY0 LIZJ(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PY0.LIZJ(java.lang.String):X.PY0");
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            String LIZJ = PVA.LIZJ(QCU.LJI(0, str.length(), str, false));
            if (LIZJ != null) {
                this.LIZLLL = LIZJ;
                return;
            }
            throw new IllegalArgumentException(i0.LJFF("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }
}

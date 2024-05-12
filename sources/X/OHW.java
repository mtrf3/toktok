package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHW {
    public final java.util.Map<String, Object> LIZ;
    public final Cert LIZIZ;
    public final String LIZJ;
    public final String[] LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final int LJI;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CertContext(cert=");
        sb.append(this.LIZIZ);
        sb.append(", entryToken=");
        sb.append(this.LIZJ);
        sb.append(", apiId=");
        sb.append(this.LJI);
        sb.append(", entryDataTypes=");
        String[] strArr = this.LIZLLL;
        if (strArr != null) {
            str = Arrays.toString(strArr);
            o.LJFF(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", entryCategory=");
        sb.append(this.LJ);
        sb.append(", entryExtraInfo=");
        sb.append(this.LIZ);
        sb.append(')');
        return sb.toString();
    }

    public final Object LIZ(String str) {
        return ((LinkedHashMap) this.LIZ).get(str);
    }

    public /* synthetic */ OHW(Cert cert, String str, String[] strArr, Integer num, String str2) {
        this(cert, str, strArr, num, str2, 0);
    }

    public OHW(Cert cert, String str, String[] strArr, Integer num, String domain, int i) {
        o.LJIIJ(domain, "domain");
        this.LIZIZ = cert;
        this.LIZJ = str;
        this.LIZLLL = strArr;
        this.LJ = num;
        this.LJFF = domain;
        this.LJI = i;
        this.LIZ = new LinkedHashMap();
    }
}

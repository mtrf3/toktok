package X;

import com.bytedance.forest.model.Request;
import defpackage.b1;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.O3n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61287O3n {
    public final java.util.Map<String, String> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public Boolean LJFF;
    public final Request LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    public C61287O3n() {
        this(null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61287O3n)) {
            return false;
        }
        C61287O3n c61287O3n = (C61287O3n) obj;
        return o.LJ(this.LJI, c61287O3n.LJI) && o.LJ(this.LJII, c61287O3n.LJII) && o.LJ(this.LJIIIIZZ, c61287O3n.LJIIIIZZ) && o.LJ(this.LJIIIZ, c61287O3n.LJIIIZ) && o.LJ(this.LJIIJ, c61287O3n.LJIIJ) && o.LJ(this.LJIIJJI, c61287O3n.LJIIJJI);
    }

    public final int hashCode() {
        Request request = this.LJI;
        int hashCode = (request != null ? request.hashCode() : 0) * 31;
        String str = this.LJII;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LJIIIIZZ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LJIIIZ;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJIIJ;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.LJIIJJI;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = "";
        if (!ujb.o.LJJJJJL(this.LJIIJJI)) {
            StringBuilder LIZJ = b1.LIZJ("", "pipelineError:");
            str = q.LIZIZ(LIZJ, this.LJIIJJI, ' ', LIZJ);
        }
        if (!ujb.o.LJJJJJL(this.LJII)) {
            StringBuilder LIZJ2 = b1.LIZJ(str, "memoryError:");
            str = q.LIZIZ(LIZJ2, this.LJII, ' ', LIZJ2);
        }
        if (!ujb.o.LJJJJJL(this.LJIIIIZZ)) {
            StringBuilder LIZJ3 = b1.LIZJ(str, "geckoError:");
            str = q.LIZIZ(LIZJ3, this.LJIIIIZZ, ' ', LIZJ3);
        }
        if (!ujb.o.LJJJJJL(this.LJIIIZ)) {
            StringBuilder LIZJ4 = b1.LIZJ(str, "builtinError:");
            str = q.LIZIZ(LIZJ4, this.LJIIIZ, ' ', LIZJ4);
        }
        if (!ujb.o.LJJJJJL(this.LJIIJ)) {
            StringBuilder LIZJ5 = b1.LIZJ(str, "cdnError:");
            str = q.LIZIZ(LIZJ5, this.LJIIJ, ' ', LIZJ5);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append((String) C1FJ.LIZJ(LIZ, (String) entry.getKey(), "Error:", entry));
            str = X1D.LIZIZ(LIZ);
        }
        return str;
    }

    public C61287O3n(Request request, int i) {
        String memoryError;
        String geckoError;
        String builtinError;
        String cdnError;
        request = (i & 1) != 0 ? null : request;
        if ((i & 2) != 0) {
            memoryError = "";
        } else {
            memoryError = null;
        }
        if ((i & 4) != 0) {
            geckoError = "";
        } else {
            geckoError = null;
        }
        if ((i & 8) != 0) {
            builtinError = "";
        } else {
            builtinError = null;
        }
        if ((i & 16) != 0) {
            cdnError = "";
        } else {
            cdnError = null;
        }
        String pipelineError = (i & 32) != 0 ? "" : null;
        o.LJIIJ(memoryError, "memoryError");
        o.LJIIJ(geckoError, "geckoError");
        o.LJIIJ(builtinError, "builtinError");
        o.LJIIJ(cdnError, "cdnError");
        o.LJIIJ(pipelineError, "pipelineError");
        this.LJI = request;
        this.LJII = memoryError;
        this.LJIIIIZZ = geckoError;
        this.LJIIIZ = builtinError;
        this.LJIIJ = cdnError;
        this.LJIIJJI = pipelineError;
        this.LIZ = new LinkedHashMap();
    }

    public final void LIZ(int i, String str) {
        this.LIZIZ = (i * 10000) + this.LIZIZ;
        this.LJIIJ = str;
    }

    public final void LIZIZ(int i, String message) {
        o.LJIIJ(message, "message");
        this.LIZJ = i;
        this.LIZIZ = (i * 100) + this.LIZIZ;
        if (i == 5 || i == 6) {
            Request request = this.LJI;
            if (request != null && request.getGeckoModel() != null) {
                StringBuilder LIZJ = b1.LIZJ(message, ", is expire cleaned:");
                LIZJ.append(this.LJFF);
                this.LJIIIIZZ = X1D.LIZIZ(LIZJ);
                return;
            }
            return;
        }
        this.LJIIIIZZ = message;
    }

    public final void LIZJ(int i, String message) {
        o.LJIIJ(message, "message");
        this.LIZIZ = (i * 10) + this.LIZIZ;
        this.LJII = message;
    }

    public final void LIZLLL(int i, String message) {
        o.LJIIJ(message, "message");
        this.LIZIZ += i;
        this.LJIIJJI = message;
    }
}

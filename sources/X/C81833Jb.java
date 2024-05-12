package X;

import defpackage.b1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Jb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81833Jb {
    public final C81983Jq LIZ;
    public final java.util.Map<String, Long> LIZIZ;

    public C81833Jb(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LIZ = sessionPage;
        this.LIZIZ = new LinkedHashMap();
    }

    public final void LIZ(String tag) {
        Long l;
        o.LJIIIZ(tag, "tag");
        if (C3KQ.LIZ().refactorDataFlowPerfLog && (l = (Long) ((LinkedHashMap) this.LIZIZ).get(tag)) != null) {
            long longValue = l.longValue();
            StringBuilder LIZJ = b1.LIZJ(tag, ": duration: ");
            LIZJ.append(System.currentTimeMillis() - longValue);
            C34B.LIZIZ("SessionRefactor-PERF", X1D.LIZIZ(LIZJ));
        }
    }

    public final void LIZJ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (!C3KQ.LIZ().refactorDataFlowPerfLog) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.put(tag, Long.valueOf(currentTimeMillis));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(tag);
        LIZ.append(": start : ");
        LIZ.append(currentTimeMillis);
        C34B.LIZIZ("SessionRefactor-PERF", X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(EnumC81823Ja enumC81823Ja, C3JU c3ju) {
        long j;
        if (!C3KQ.LIZ().refactorDataFlowPerfLog) {
            return;
        }
        Long l = (Long) ((LinkedHashMap) this.LIZIZ).get(C81843Jc.LIZ(enumC81823Ja, c3ju));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enumC81823Ja.getTag());
        LIZ.append("--");
        LIZ.append(c3ju.getTag());
        LIZ.append("---");
        LIZ.append(this.LIZ);
        LIZ.append(" : end: ");
        LIZ.append(currentTimeMillis);
        LIZ.append("  duration: ");
        LIZ.append(currentTimeMillis - j);
        C34B.LIZIZ("SessionRefactor-PERF", X1D.LIZIZ(LIZ));
        this.LIZIZ.remove(C81843Jc.LIZ(enumC81823Ja, c3ju));
    }

    public final void LIZLLL(EnumC81823Ja enumC81823Ja, C3JU c3ju) {
        if (!C3KQ.LIZ().refactorDataFlowPerfLog) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.put(C81843Jc.LIZ(enumC81823Ja, c3ju), Long.valueOf(currentTimeMillis));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enumC81823Ja.getTag());
        LIZ.append("--");
        LIZ.append(c3ju.getTag());
        LIZ.append("---");
        LIZ.append(this.LIZ);
        LIZ.append(" : start: ");
        LIZ.append(currentTimeMillis);
        C34B.LIZIZ("SessionRefactor-PERF", X1D.LIZIZ(LIZ));
    }
}

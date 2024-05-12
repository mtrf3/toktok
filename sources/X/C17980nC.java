package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17980nC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public C17980nC(C18090nN c18090nN, String c, String d, java.util.Map map) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(d, "d");
        String LIZIZ = c18090nN.LIZIZ();
        StringBuilder sb = new StringBuilder();
        C18080nM.LIZ.getClass();
        sb.append(C18080nM.LIZIZ);
        sb.append('.');
        sb.append(LIZIZ);
        sb.append('.');
        sb.append(c.length() == 0 ? "c0" : c);
        sb.append('.');
        sb.append(d.length() == 0 ? "d0" : d);
        this.LIZ = sb.toString();
        this.LIZIZ = c18090nN.LJ;
        this.LIZJ = c18090nN.LJFF;
        this.LIZLLL = map;
    }
}

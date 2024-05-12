package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class QHT extends QHV {
    public static final List<String> LJI = Collections.singletonList("Configer");

    @Override // X.QHV
    public final String LIZLLL() {
        return "configer";
    }

    @Override // X.QHV
    public final boolean LJFF() {
        return true;
    }

    @Override // X.QHV
    public final long LJI() {
        return this.LIZ.LJLJJI.LJ.getLong("fetch_interval", 21600000L);
    }

    @Override // X.QHV
    public final long[] LJ() {
        return QHV.LJFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QHT(QI4 qi4) {
        super(qi4);
        long j = qi4.LJLJJI.LJ.getLong("app_log_last_config_time", 0L);
        this.LIZLLL = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0152, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ec, code lost:
    
        if (r8 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02fd, code lost:
    
        if (r6.equals(r2) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0302, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02f7, code lost:
    
        if (r6 != null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    @Override // X.QHV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(int r21) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QHT.LIZJ(int):boolean");
    }
}

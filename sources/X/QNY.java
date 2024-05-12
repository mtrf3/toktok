package X;

/* loaded from: classes12.dex */
public final class QNY extends QNH {
    public final QNH LJFF;
    public final int LJI;
    public final String LJII;

    @Override // X.QNH
    public final boolean LIZJ() {
        QNH qnh = this.LJFF;
        if (qnh != null) {
            return qnh.LIZJ();
        }
        return false;
    }

    @Override // X.QNH
    public final String LIZLLL() {
        String LIZLLL;
        QNH qnh = this.LJFF;
        if (qnh != null && (LIZLLL = qnh.LIZLLL()) != null) {
            return LIZLLL;
        }
        return "";
    }

    @Override // X.QNH
    public final int LJ() {
        QNH qnh = this.LJFF;
        if (qnh != null) {
            return qnh.LJ();
        }
        return 0;
    }

    @Override // X.QNH
    public final int LIZIZ() {
        return this.LJI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        if (r3.equals("whirl") != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QNY(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QNY.<init>(java.lang.String):void");
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        QNH qnh = this.LJFF;
        if (qnh != null) {
            qnh.LIZ(sb);
        }
        C78840Uwu.LIZJ(sb, "verify_data", this.LJII);
    }
}

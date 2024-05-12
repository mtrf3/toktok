package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.QHp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66749QHp extends QHV {
    public static final List<String> LJIIJ = Collections.singletonList("Sender");
    public final long[] LJI;
    public final C66734QHa LJII;
    public final QHC LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.QHV
    public final boolean LJFF() {
        return !this.LIZJ;
    }

    @Override // X.QHV
    public final long LJI() {
        QHC qhc = this.LJIIIIZZ;
        if (qhc != null) {
            return qhc.LJ;
        }
        return this.LIZ.LJLJJI.LIZ();
    }

    @Override // X.QHV
    public final String LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.QHV
    public final long[] LJ() {
        return this.LJI;
    }

    public C66749QHp(QI4 qi4) {
        super(qi4);
        this.LJI = new long[]{10000};
        this.LJIIIZ = "Sender";
        this.LJII = new C66734QHa("Sender", qi4.LJLJJI, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026d A[Catch: all -> 0x027a, LOOP:1: B:51:0x0267->B:53:0x026d, LOOP_END, TRY_LEAVE, TryCatch #18 {all -> 0x027a, blocks: (B:50:0x0263, B:51:0x0267, B:53:0x026d), top: B:49:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ab  */
    @Override // X.QHV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(int r43) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66749QHp.LIZJ(int):boolean");
    }

    public C66749QHp(QI4 qi4, QHC qhc) {
        super(qi4);
        long[] jArr = {10000};
        this.LJI = jArr;
        this.LJIIIIZZ = qhc;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Sender_p_");
        LIZ.append(qhc.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LJIIIZ = LIZIZ;
        long j = qhc.LJ;
        if (j < 10000) {
            jArr[0] = j;
        }
        this.LJII = new C66734QHa(LIZIZ, qi4.LJLJJI, qhc);
    }

    public final void LJII(boolean z, java.util.Set set) {
        if (((HashSet) set).isEmpty()) {
            return;
        }
        QI0.LIZIZ("event_upload_eid", new QHW(this, set, z));
    }
}

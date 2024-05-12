package X;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public abstract class QEM extends AbstractC66650QDu {
    public abstract QFU LJJJJI(QF2 qf2, Executor executor, int i, List<String> list, int i2, int i3, int i4);

    public abstract AbstractC66659QEd LJJJJIZL(String str, QER qer, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, long j);

    public abstract QFK LJJJJJ(QFM qfm, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, java.util.Map map, java.util.Map map2, boolean z);

    public abstract QFK LJJJJJL(QFM qfm, Executor executor, List<String> list, java.util.Map<String, String> map, java.util.Map<String, String> map2, boolean z);

    @Override // X.QEK
    public final QFR LIZIZ(QFT qft) {
        return new QFR(qft, this);
    }

    @Override // X.QEK
    public final QFA LIZLLL(QFM qfm, Executor executor) {
        return new QFA(qfm, executor, this);
    }

    @Override // X.AbstractC66650QDu, X.QEK
    public QEH LIZJ(String str, QE8 qe8, PU3 pu3) {
        return new QEN(str, qe8, pu3, this);
    }

    @Override // X.AbstractC66650QDu
    /* renamed from: LJJI */
    public final QEN LIZJ(String str, QE8 qe8, PU3 pu3) {
        return new QEN(str, qe8, pu3, this);
    }
}

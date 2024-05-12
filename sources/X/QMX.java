package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class QMX {
    public final QME LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.QMW] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.QMW] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.QMW] */
    public QMX(Context context) {
        QMZ qmz = new QMZ(context);
        UCH uch = C66864QMa.LIZ;
        QM7 qm7 = new QM7(qmz, uch instanceof QMW ? uch : new QMW(uch));
        QM9 qm9 = new QM9(qm7 instanceof QMW ? qm7 : new QMW(qm7));
        this.LIZ = qm9 instanceof QMW ? qm9 : new QMW(qm9);
    }
}

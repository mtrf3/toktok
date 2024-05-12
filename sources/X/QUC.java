package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QUC implements InterfaceC67030QSk {
    public final Long LIZ;
    public final QUA LIZIZ;

    @Override // X.InterfaceC67030QSk
    public final void remove() {
        QUA qua = this.LIZIZ;
        long longValue = this.LIZ.longValue();
        ((ConcurrentHashMap) qua.LJLILLLLZI).remove(Long.valueOf(longValue));
    }

    public QUC(Long l, QUA qua) {
        this.LIZ = l;
        this.LIZIZ = qua;
    }
}

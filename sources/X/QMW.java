package X;

/* loaded from: classes12.dex */
public final class QMW implements QME {
    public static final Object LJLJI = new Object();
    public volatile QME LJLIL;
    public volatile Object LJLILLLLZI = LJLJI;

    public QMW(QMF qmf) {
        this.LJLIL = qmf;
    }

    @Override // X.QME
    public final Object a() {
        Object obj = this.LJLILLLLZI;
        Object obj2 = LJLJI;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.LJLILLLLZI;
                if (obj == obj2) {
                    obj = this.LJLIL.a();
                    Object obj3 = this.LJLILLLLZI;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.LJLILLLLZI = obj;
                    this.LJLIL = null;
                }
            }
        }
        return obj;
    }
}

package X;

import java.util.List;

/* renamed from: X.1Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34611Xl<Key, Value> extends AbstractC19070ox<Key, Value> {
    public final C19000oq<Value> LIZ;
    public final AbstractC43481nE<Key, Value> LIZIZ;

    public C34611Xl(AbstractC43481nE abstractC43481nE, C34541Xe c34541Xe) {
        this.LIZ = new C19000oq<>(abstractC43481nE, 0, null, c34541Xe);
        this.LIZIZ = abstractC43481nE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19070ox
    public final void LIZ(Object obj, List list) {
        if (!this.LIZ.LIZ()) {
            AbstractC43481nE<Key, Value> abstractC43481nE = this.LIZIZ;
            synchronized (abstractC43481nE.LIZJ) {
                abstractC43481nE.LJ = null;
                abstractC43481nE.LIZLLL = obj;
            }
            this.LIZ.LIZIZ(new C19110p1<>(list, 0, 0));
        }
    }
}

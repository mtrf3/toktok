package X;

import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;

/* renamed from: X.0ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19050ov<Key, Value> {
    public final C19180p8 LIZ;
    public final AbstractC18980oo<Key, Value> LIZIZ;
    public AbstractC19140p4 LIZJ;
    public Executor LIZLLL = C28O.LJLJJI;

    public final LiveData<AbstractC19190p9<Value>> LIZ() {
        final C19180p8 c19180p8 = this.LIZ;
        final AbstractC19140p4 abstractC19140p4 = this.LIZJ;
        final AbstractC18980oo<Key, Value> abstractC18980oo = this.LIZIZ;
        final Executor executor = this.LIZLLL;
        return (LiveData<AbstractC19190p9<Value>>) new ComputableLiveData<AbstractC19190p9<Object>>(executor) { // from class: X.1Xj
            public AbstractC19190p9<Object> LIZ;
            public AbstractC19010or<Object, Object> LIZIZ;
            public final C34581Xi LIZJ;
            public final /* synthetic */ Object LIZLLL;
            public final /* synthetic */ Executor LJI;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.ComputableLiveData
            public final AbstractC19190p9<Object> compute() {
                AbstractC19190p9<Object> LIZ;
                Object obj = this.LIZLLL;
                AbstractC19190p9<Object> abstractC19190p9 = this.LIZ;
                Key key = obj;
                if (abstractC19190p9 != null) {
                    key = abstractC19190p9.LJIILJJIL();
                }
                do {
                    AbstractC19010or<Object, Object> abstractC19010or = this.LIZIZ;
                    if (abstractC19010or != null) {
                        abstractC19010or.LJFF(this.LIZJ);
                    }
                    AbstractC19010or<Object, Object> LIZ2 = abstractC18980oo.LIZ();
                    this.LIZIZ = LIZ2;
                    LIZ2.LIZIZ(this.LIZJ);
                    C19150p5 c19150p5 = new C19150p5(this.LIZIZ, c19180p8);
                    c19150p5.LIZJ = this.LJI;
                    c19150p5.LIZLLL = executor;
                    c19150p5.LJ = abstractC19140p4;
                    c19150p5.LJFF = key;
                    LIZ = c19150p5.LIZ();
                    this.LIZ = LIZ;
                } while (LIZ.LJIIZILJ());
                return this.LIZ;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.1Xi] */
            {
                C13F c13f = C28O.LJLJI;
                this.LIZLLL = null;
                this.LJI = c13f;
                this.LIZJ = new InterfaceC18990op() { // from class: X.1Xi
                    @Override // X.InterfaceC18990op
                    public final void LIZ() {
                        invalidate();
                    }
                };
            }
        }.getLiveData();
    }

    public C19050ov(AbstractC18980oo<Key, Value> abstractC18980oo, C19180p8 c19180p8) {
        if (c19180p8 != null) {
            if (abstractC18980oo != null) {
                this.LIZIZ = abstractC18980oo;
                this.LIZ = c19180p8;
                return;
            }
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
        throw new IllegalArgumentException("PagedList.Config must be provided");
    }
}

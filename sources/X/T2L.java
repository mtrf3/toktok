package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes13.dex */
public final class T2L<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LIZIZ = AtomicIntegerFieldUpdater.newUpdater(T2L.class, "notCompletedCount");
    public final InterfaceC68342mE<T>[] LIZ;
    public volatile /* synthetic */ int notCompletedCount;

    /* loaded from: classes13.dex */
    public final class a extends AbstractC84652XKe {
        public final XJL<List<? extends T>> LJLJJL;
        public T2N LJLJJLL;
        public volatile /* synthetic */ Object _disposer;

        @Override // X.XL0
        public final void LJJII(Throwable th) {
            if (th != null) {
                if (this.LJLJJL.LJJJI(th) != null) {
                    this.LJLJJL.LJJIJIIJIL();
                    T2M t2m = (T2M) this._disposer;
                    if (t2m == null) {
                        return;
                    }
                    t2m.LIZIZ();
                    return;
                }
                return;
            }
            if (T2L.LIZIZ.decrementAndGet(T2L.this) != 0) {
                return;
            }
            XJL<List<? extends T>> xjl = this.LJLJJL;
            InterfaceC68342mE<T>[] interfaceC68342mEArr = T2L.this.LIZ;
            ArrayList arrayList = new ArrayList(interfaceC68342mEArr.length);
            for (InterfaceC68342mE<T> interfaceC68342mE : interfaceC68342mEArr) {
                arrayList.add(interfaceC68342mE.LIZJ());
            }
            C3C5.m7constructorimpl(arrayList);
            xjl.resumeWith(arrayList);
        }

        @Override // X.InterfaceC88472Yns
        public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
            LJJII(th);
            return C76800UCe.LIZ;
        }

        public a(XKS xks) {
            this.LJLJJL = xks;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T2L(InterfaceC68342mE<? extends T>[] interfaceC68342mEArr) {
        this.LIZ = interfaceC68342mEArr;
        this.notCompletedCount = interfaceC68342mEArr.length;
    }

    public final Object LIZ(InterfaceC67352kd<? super List<? extends T>> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        int length = this.LIZ.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            InterfaceC68342mE<T> interfaceC68342mE = this.LIZ[i];
            interfaceC68342mE.LJIILL();
            a aVar = new a(xks);
            aVar.LJLJJLL = interfaceC68342mE.LJJIII(aVar);
            aVarArr[i] = aVar;
        }
        T2M t2m = new T2M(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2]._disposer = t2m;
        }
        if (xks.isCompleted()) {
            t2m.LIZIZ();
        } else {
            xks.LJIILIIL(t2m);
        }
        return xks.LJIIJJI();
    }
}

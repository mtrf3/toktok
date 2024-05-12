package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public abstract class XJV<T> extends XJU {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(XJV.class, Object.class, "_consensus");
    public volatile /* synthetic */ Object _consensus = XJW.LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XJU
    public final XJV<?> LIZ() {
        return this;
    }

    public abstract void LIZLLL(T t, Object obj);

    public long LJFF() {
        return 0L;
    }

    public abstract Object LJI(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XJU
    public final Object LIZJ(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == XJW.LIZ) {
            obj2 = LJ(LJI(obj));
        }
        LIZLLL(obj, obj2);
        return obj2;
    }

    public final Object LJ(Object obj) {
        Object obj2 = this._consensus;
        C3BS c3bs = XJW.LIZ;
        if (obj2 != c3bs) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, obj)) {
            if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                return this._consensus;
            }
        }
        return obj;
    }
}

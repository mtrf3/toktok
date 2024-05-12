package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public abstract class XJN extends C84629XJh implements T2N {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJJL = AtomicReferenceFieldUpdater.newUpdater(XJN.class, Object.class, "isTaken");
    public final Object LJLJJI;
    public volatile /* synthetic */ Object isTaken = Boolean.FALSE;

    public abstract void LJJII();

    public abstract boolean LJJIII();

    @Override // X.T2N
    public final void dispose() {
        LJIL();
    }

    public XJN(Object obj) {
        this.LJLJJI = obj;
    }
}

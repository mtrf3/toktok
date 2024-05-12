package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LVD<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;

    public LVD(boolean z) {
        this.LJLIL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeCountHelper ");
        LIZ.append(this.LJLIL);
        LIZ.append(" log, noticeGroupAttrsHashMap: ");
        LIZ.append(LVB.LIZIZ.size());
        LIZ.append(", noticeFilterGroups: ");
        LIZ.append(LVB.LIZJ.size());
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        return null;
    }
}

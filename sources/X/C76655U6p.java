package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* renamed from: X.U6p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76655U6p<T> implements InterfaceC73518StG {
    public final /* synthetic */ ConcurrentHashSet<String> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ R2P<T> LIZJ;

    public C76655U6p(ConcurrentHashSet<String> concurrentHashSet, String str, R2P<T> r2p) {
        this.LIZ = concurrentHashSet;
        this.LIZIZ = str;
        this.LIZJ = r2p;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        if (this.LIZ.contains(this.LIZIZ)) {
            c73516StE.onSuccess(this.LIZJ);
        } else {
            c73516StE.onComplete();
        }
    }
}

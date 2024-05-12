package X;

import kotlinx.coroutines.JobSupport;

/* renamed from: X.XJs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84640XJs extends AbstractC84630XJi {
    public final /* synthetic */ JobSupport LIZLLL;
    public final /* synthetic */ Object LJ;

    @Override // X.XJV
    public final Object LJI(C84629XJh c84629XJh) {
        if (this.LIZLLL.LJJJLIIL() == this.LJ) {
            return null;
        }
        return C84638XJq.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84640XJs(C84629XJh c84629XJh, JobSupport jobSupport, Object obj) {
        super(c84629XJh);
        this.LIZLLL = jobSupport;
        this.LJ = obj;
    }
}

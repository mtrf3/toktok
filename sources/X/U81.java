package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U81<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C76677U7l LJLJJI;

    public U81(long j, long j2, int i, C76677U7l c76677U7l) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
        this.LJLJJI = c76677U7l;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long t = (Long) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountDown uid=");
        LIZ.append(this.LJLIL);
        LIZ.append(" expireTimeInSeconds=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" joinType=");
        LIZ.append(this.LJLJI);
        LIZ.append(" (expireTimeInSeconds - t)=");
        long j = this.LJLILLLLZI;
        o.LJIIIIZZ(t, "t");
        LIZ.append(j - t.longValue());
        U4R.LIZLLL("InviteOrApplyTimeoutManager", X1D.LIZIZ(LIZ));
        int i = this.LJLJI;
        if (i == 102) {
            this.LJLJJI.LIZ.LLJ(this.LJLIL, this.LJLILLLLZI - t.longValue());
        } else {
            if (i != 100) {
                return;
            }
            this.LJLJJI.LIZ.LLIZ(this.LJLIL, this.LJLILLLLZI - t.longValue());
        }
    }
}

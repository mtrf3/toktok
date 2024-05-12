package X;

/* loaded from: classes14.dex */
public final class U8G implements InterfaceC29937Boz {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C76677U7l LIZJ;

    public U8G(int i, long j, C76677U7l c76677U7l) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = c76677U7l;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uid=");
        LIZ.append(this.LIZ);
        LIZ.append(" got dispose");
        U4R.LIZLLL("InviteOrApplyTimeoutManager", X1D.LIZIZ(LIZ));
        int i = this.LIZIZ;
        if (i == 102) {
            this.LIZJ.LIZ.LLILZIL(this.LIZ);
        } else {
            if (i != 100) {
                return;
            }
            this.LIZJ.LIZ.LJLJI(this.LIZ);
        }
    }
}

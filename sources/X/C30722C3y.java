package X;

import kotlin.jvm.internal.o;

/* renamed from: X.C3y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30722C3y implements InterfaceC83704WtA {
    public final /* synthetic */ C30721C3x LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC83704WtA
    public final void onError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError: ");
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        C0NB.LIZIZ("DirtyLenDetect", msg);
    }

    @Override // X.InterfaceC83704WtA
    public final void onSuccess(String str) {
        ActivityC45651qj context = this.LIZ.LIZ;
        boolean z = this.LIZIZ;
        o.LJIIIZ(context, "context");
        BZG bzg = new BZG(context, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to detect dirty len. model = ");
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        C0NB.LIZIZ("DirtyLenDetect", msg);
        this.LIZ.LIZIZ.LJJIII(this.LIZIZ, str, bzg);
    }

    public C30722C3y(C30721C3x c30721C3x, boolean z) {
        this.LIZ = c30721C3x;
        this.LIZIZ = z;
    }
}

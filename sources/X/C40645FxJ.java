package X;

import android.content.Context;

/* renamed from: X.FxJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40645FxJ implements InterfaceC153055zZ<C40556Fvs> {
    public final InterfaceC153055zZ<Context> LJLIL;

    public C40645FxJ(C40646FxK c40646FxK) {
        this.LJLIL = c40646FxK;
    }

    @Override // X.InterfaceC153055zZ
    public final C40556Fvs a() {
        Context context = ((C40646FxK) this.LJLIL).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new C40556Fvs(context);
    }
}

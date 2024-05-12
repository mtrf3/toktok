package X;

import android.app.Activity;

/* renamed from: X.Qpw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68216Qpw extends AbstractRunnableC68155Qox {
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ BinderC68193QpZ LJLJJLL;
    public final /* synthetic */ C68217Qpx LJLJL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJL.LJLIL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.onActivitySaveInstanceState(new BinderC68153Qov(this.LJLJJL), this.LJLJJLL, this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68216Qpw(C68217Qpx c68217Qpx, Activity activity, BinderC68193QpZ binderC68193QpZ) {
        super(c68217Qpx.LJLIL, true);
        this.LJLJL = c68217Qpx;
        this.LJLJJL = activity;
        this.LJLJJLL = binderC68193QpZ;
    }
}

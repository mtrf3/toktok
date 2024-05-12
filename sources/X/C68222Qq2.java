package X;

import android.app.Activity;

/* renamed from: X.Qq2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68222Qq2 extends AbstractRunnableC68155Qox {
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ C68217Qpx LJLJJLL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJJLL.LJLIL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.onActivityDestroyed(new BinderC68153Qov(this.LJLJJL), this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68222Qq2(C68217Qpx c68217Qpx, Activity activity) {
        super(c68217Qpx.LJLIL, true);
        this.LJLJJLL = c68217Qpx;
        this.LJLJJL = activity;
    }
}

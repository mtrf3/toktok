package X;

import android.app.Activity;

/* renamed from: X.Qoz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68157Qoz extends AbstractRunnableC68155Qox {
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C68074Qne LJLJLJ;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJLJ.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.setCurrentScreen(new BinderC68153Qov(this.LJLJJL), this.LJLJJLL, this.LJLJL, this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68157Qoz(C68074Qne c68074Qne, Activity activity, String str, String str2) {
        super(c68074Qne, true);
        this.LJLJLJ = c68074Qne;
        this.LJLJJL = activity;
        this.LJLJJLL = str;
        this.LJLJL = str2;
    }
}

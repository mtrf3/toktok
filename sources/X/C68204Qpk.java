package X;

import android.os.Bundle;

/* renamed from: X.Qpk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68204Qpk extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Bundle LJLJL;
    public final /* synthetic */ C68074Qne LJLJLJ;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJLJ.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.clearConditionalUserProperty(this.LJLJJL, this.LJLJJLL, this.LJLJL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68204Qpk(C68074Qne c68074Qne, String str, String str2, Bundle bundle) {
        super(c68074Qne, true);
        this.LJLJLJ = c68074Qne;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = bundle;
    }
}

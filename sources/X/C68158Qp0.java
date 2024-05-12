package X;

import android.os.Bundle;

/* renamed from: X.Qp0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68158Qp0 extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Bundle LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ C68074Qne LJLLI;
    public final /* synthetic */ Long LJLJJL = null;
    public final /* synthetic */ boolean LJLL = true;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        long longValue;
        Long l = this.LJLJJL;
        if (l == null) {
            longValue = this.LJLIL;
        } else {
            longValue = l.longValue();
        }
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLLI.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.logEvent(this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, longValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68158Qp0(C68074Qne c68074Qne, String str, String str2, Bundle bundle, boolean z) {
        super(c68074Qne, true);
        this.LJLLI = c68074Qne;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = bundle;
        this.LJLJLLL = z;
    }
}

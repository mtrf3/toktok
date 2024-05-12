package X;

import com.ss.android.ugc.sdk.channel.third.facebook.FacebookShareActivity;

/* renamed from: X.Oil, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62675Oil implements Q82<Q8F> {
    public final /* synthetic */ FacebookShareActivity LJLIL;

    @Override // X.Q82
    public final void onCancel() {
        InterfaceC62573Oh7 interfaceC62573Oh7 = FacebookShareActivity.LJLJJL;
        if (interfaceC62573Oh7 != null) {
            interfaceC62573Oh7.LJIIJ(false);
        }
        this.LJLIL.finish();
    }

    public C62675Oil(FacebookShareActivity facebookShareActivity) {
        this.LJLIL = facebookShareActivity;
    }

    @Override // X.Q82
    public final void MA(Q86 q86) {
        InterfaceC62573Oh7 interfaceC62573Oh7 = FacebookShareActivity.LJLJJL;
        if (interfaceC62573Oh7 != null) {
            interfaceC62573Oh7.LJIIJ(false);
        }
        this.LJLIL.finish();
    }

    @Override // X.Q82
    public final void onSuccess(Q8F q8f) {
        InterfaceC62573Oh7 interfaceC62573Oh7 = FacebookShareActivity.LJLJJL;
        if (interfaceC62573Oh7 != null) {
            interfaceC62573Oh7.LJIIJ(true);
        }
        this.LJLIL.finish();
    }
}

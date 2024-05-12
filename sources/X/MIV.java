package X;

import Y.IDxS308S0100000_9;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;

/* loaded from: classes10.dex */
public final class MIV extends C8BR<C8BS<NewFaceStickerListBean>, MIW> {
    public final IAVEffectService.EffectPlatformLoader LJLJJI;
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public InterfaceC45930I0w LJLJJLL = null;
    public boolean LJLJL = false;
    public String LJLJLJ = "";
    public final StickerPropApi LJLJLLL = (StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(StickerPropApi.class);

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            ((MIW) k).aj((NewFaceStickerListBean) t.getData());
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((MIW) k).XK(exc);
        }
    }

    public MIV(XV2 xv2, boolean z) {
        this.LJLJJI = xv2;
        LJJ(new MIR(this, z));
    }

    public final void LJJIII(final String str, final String str2) {
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5ci
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                interfaceC73573Su9.onNext(C60903NvH.LJIIJJI().getAccountService().LJII(str, str2));
                interfaceC73573Su9.onComplete();
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS308S0100000_9(this, 0));
    }
}

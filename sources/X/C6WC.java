package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.text.DMTEditTextStickerMgr$preDownloadCoverPanelResources$2", f = "DMTEditTextStickerMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6WC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C6WC(InterfaceC67352kd<? super C6WC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6WC(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C69B.LIZIZ.LJI("coverpic", false, new IFetchEffectChannelListener() { // from class: X.6WE
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C69B.LIZJ.LJLIL = 2;
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C69B.LIZJ.LJLIL = 1;
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C6WC(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}

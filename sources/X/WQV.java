package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes15.dex */
public final class WQV<T> implements InterfaceC66992k3<WQO> {
    public final /* synthetic */ WQT LJLIL;
    public final /* synthetic */ EffectChannelResponse LJLILLLLZI;

    public WQV(WQT wqt, EffectChannelResponse effectChannelResponse) {
        this.LJLIL = wqt;
        this.LJLILLLLZI = effectChannelResponse;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<WQO> interfaceC65052gv) {
        WQU wqu = this.LJLIL.LIZ;
        EffectChannelResponse effectChannelResponse = this.LJLILLLLZI;
        wqu.getClass();
        ((C73578SuE) interfaceC65052gv).onSuccess(WQU.LJIIIZ(effectChannelResponse));
    }
}

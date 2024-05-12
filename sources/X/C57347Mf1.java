package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1$1$1", f = "StickerPropDetailHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mf1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57347Mf1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MIW LJLIL;
    public final /* synthetic */ NewFaceStickerBean LJLILLLLZI;
    public final /* synthetic */ XGX<C57352Mf6> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57347Mf1(XGX xgx, MIW miw, NewFaceStickerBean newFaceStickerBean, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = miw;
        this.LJLILLLLZI = newFaceStickerBean;
        this.LJLJI = xgx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57347Mf1(this.LJLJI, this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        MIW miw = this.LJLIL;
        NewFaceStickerBean newFaceStickerBean = this.LJLILLLLZI;
        if (C78977Uz7.LJJJJI(this.LJLJI.LIZJ) != EnumC78982UzC.Net) {
            z = true;
        } else {
            z = false;
        }
        miw.kC(newFaceStickerBean, z);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

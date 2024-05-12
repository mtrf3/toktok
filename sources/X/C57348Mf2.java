package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1$1$2", f = "StickerPropDetailHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mf2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57348Mf2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NewFaceStickerBean LJLIL;
    public final /* synthetic */ MIW LJLILLLLZI;
    public final /* synthetic */ XGX<C57352Mf6> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57348Mf2(XGX xgx, MIW miw, NewFaceStickerBean newFaceStickerBean, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = newFaceStickerBean;
        this.LJLILLLLZI = miw;
        this.LJLJI = xgx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        NewFaceStickerBean newFaceStickerBean = this.LJLIL;
        return new C57348Mf2(this.LJLJI, this.LJLILLLLZI, newFaceStickerBean, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C57353Mf7 c57353Mf7;
        C141335gf.LIZJ(obj);
        NewFaceStickerBean newFaceStickerBean = this.LJLIL;
        newFaceStickerBean.isFavorite = !newFaceStickerBean.isFavorite;
        MIW miw = this.LJLILLLLZI;
        Throwable cause = ((XGV) this.LJLJI).LIZLLL.getCause();
        ExceptionResult exceptionResult = null;
        if ((cause instanceof C57353Mf7) && (c57353Mf7 = (C57353Mf7) cause) != null) {
            exceptionResult = c57353Mf7.getExceptionResult();
        }
        miw.wf(newFaceStickerBean, exceptionResult);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AMEDraftEffectExportLogic$saveZip$2", f = "AMEDraftEffectExportLogic.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ UploadableMobileEffect2 LJLIL;
    public final /* synthetic */ ERV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERT(UploadableMobileEffect2 uploadableMobileEffect2, ERV erv, InterfaceC67352kd<? super ERT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uploadableMobileEffect2;
        this.LJLILLLLZI = erv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ERT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C38977FRl.LJ(this.LJLIL.zipFilePath, V16.LJIILIIL(this.LJLILLLLZI.LIZ.getDraft()));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

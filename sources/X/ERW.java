package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AMEDraftEffectExportLogic$saveIcon$2", f = "AMEDraftEffectExportLogic.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ERV LJLIL;
    public final /* synthetic */ UploadableMobileEffect2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERW(UploadableMobileEffect2 uploadableMobileEffect2, ERV erv, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = erv;
        this.LJLILLLLZI = uploadableMobileEffect2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ERW(this.LJLILLLLZI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        OR7.LLLIIIL(new File(V16.LJIILJJIL(this.LJLIL.LIZ.getDraft())), new File(this.LJLILLLLZI.iconFilePath), false, 6);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

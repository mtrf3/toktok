package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportEffect$1", f = "MobileEffectExportWorkflowImpl.kt", l = {284, 298, 299}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ERE LJLJJI;
    public final /* synthetic */ ERD LJLJJL;
    public final /* synthetic */ UploadableMobileEffect2 LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ ERB LJLJLJ;
    public final /* synthetic */ Effect LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERC(ERE ere, ERD erd, UploadableMobileEffect2 uploadableMobileEffect2, boolean z, ERB erb, Effect effect, InterfaceC67352kd<? super ERC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = ere;
        this.LJLJJL = erd;
        this.LJLJJLL = uploadableMobileEffect2;
        this.LJLJL = z;
        this.LJLJLJ = erb;
        this.LJLJLLL = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        ERC erc = new ERC(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        erc.LJLJI = obj;
        return erc;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
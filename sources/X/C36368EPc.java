package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffectWithError$2$deferredIcon$1", f = "MobileEffectUploader.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.EPc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36368EPc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36370EPe LJLILLLLZI;
    public final /* synthetic */ UploadImageConfig LJLJI;
    public final /* synthetic */ UploadableMobileEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36368EPc(C36370EPe c36370EPe, UploadImageConfig uploadImageConfig, UploadableMobileEffect uploadableMobileEffect, InterfaceC67352kd<? super C36368EPc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36370EPe;
        this.LJLJI = uploadImageConfig;
        this.LJLJJI = uploadableMobileEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36368EPc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C36370EPe c36370EPe = this.LJLILLLLZI;
            UploadImageConfig uploadImageConfig = this.LJLJI;
            UploadableMobileEffect uploadableMobileEffect = this.LJLJJI;
            this.LJLIL = 1;
            c36370EPe.getClass();
            obj = C43368H0i.LIZ(C36370EPe.LIZLLL(uploadableMobileEffect.iconFilePath), uploadImageConfig, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

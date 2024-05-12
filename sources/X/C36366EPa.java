package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffects$2$deferred$1$1", f = "MobileEffectUploader.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.EPa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36366EPa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36370EPe LJLILLLLZI;
    public final /* synthetic */ UploadableMobileEffect LJLJI;
    public final /* synthetic */ UploadImageConfig LJLJJI;
    public final /* synthetic */ UploadImageConfig LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36366EPa(C36370EPe c36370EPe, UploadableMobileEffect uploadableMobileEffect, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super C36366EPa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36370EPe;
        this.LJLJI = uploadableMobileEffect;
        this.LJLJJI = uploadImageConfig;
        this.LJLJJL = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36366EPa(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            UploadableMobileEffect uploadableMobileEffect = this.LJLJI;
            UploadImageConfig uploadImageConfig = this.LJLJJI;
            UploadImageConfig uploadImageConfig2 = this.LJLJJL;
            this.LJLIL = 1;
            obj = c36370EPe.LIZ(uploadableMobileEffect, uploadImageConfig, uploadImageConfig2, "mobile_effect_template", 310, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

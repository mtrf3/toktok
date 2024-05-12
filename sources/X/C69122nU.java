package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$zipUsedDraftEffects$2$zippedDraftEffects$1$zipFileTask$1", f = "EffectDraftSubmissionModule.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.2nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69122nU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super File>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LJLILLLLZI;
    public final /* synthetic */ UploadableDraftEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69122nU(EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, UploadableDraftEffect uploadableDraftEffect, InterfaceC67352kd<? super C69122nU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectDraftSubmissionListViewModel;
        this.LJLJI = uploadableDraftEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69122nU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LJLILLLLZI;
            UploadableDraftEffect uploadableDraftEffect = this.LJLJI;
            String str = uploadableDraftEffect.zipFilePath;
            String str2 = uploadableDraftEffect.unzipFilePath;
            this.LJLIL = 1;
            effectDraftSubmissionListViewModel.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C69112nT(str, str2, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super File> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

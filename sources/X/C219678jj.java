package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel$getAddYoursStickerFromTopic$1$addYoursSticker$1$1", f = "AddYoursHubListViewModel.kt", l = {175}, m = "invokeSuspend")
/* renamed from: X.8jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219678jj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AddYoursStickerStruct>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219678jj(long j, InterfaceC67352kd<? super C219678jj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219678jj(this.LJLILLLLZI, interfaceC67352kd);
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
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c220488l2.LIZ(j, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

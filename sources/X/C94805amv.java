package X;

import com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository$isAvailable$2", f = "TiktokGifRepository.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.amv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94805amv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ TiktokGifRepository LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94805amv(TiktokGifRepository tiktokGifRepository, InterfaceC67352kd<? super C94805amv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tiktokGifRepository;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94805amv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                TiktokGifRepository tiktokGifRepository = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = tiktokGifRepository.fetchGiphyAvailableFromCache(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            z = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        TiktokGifRepository tiktokGifRepository2 = this.LJLILLLLZI;
        XKX.LIZLLL(tiktokGifRepository2.coroutineScope, null, null, new C94804amu(tiktokGifRepository2, null), 3);
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
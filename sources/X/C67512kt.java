package X;

import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.HotWordGiftViewModel$onInputChanged$1", f = "HotWordGiftViewModel.kt", l = {376}, m = "invokeSuspend")
/* renamed from: X.2kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67512kt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ HotWordGiftViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67512kt(HotWordGiftViewModel hotWordGiftViewModel, String str, boolean z, InterfaceC67352kd<? super C67512kt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = hotWordGiftViewModel;
        this.LJLJJI = str;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67512kt c67512kt = new C67512kt(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c67512kt.LJLILLLLZI = obj;
        return c67512kt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
                HotWordGiftViewModel hotWordGiftViewModel = this.LJLJI;
                String str = this.LJLJJI;
                this.LJLIL = 1;
                if (hotWordGiftViewModel.gv0(str, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import Y.IDfS132S0100000_12;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterKeywordsViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet$onStart$1", f = "DmFilterAddKeywordsBottomSheet.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SQJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DmFilterAddKeywordsBottomSheet LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQJ(DmFilterAddKeywordsBottomSheet dmFilterAddKeywordsBottomSheet, InterfaceC67352kd<? super SQJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dmFilterAddKeywordsBottomSheet;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SQJ(this.LJLILLLLZI, interfaceC67352kd);
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
            DmFilterAddKeywordsBottomSheet dmFilterAddKeywordsBottomSheet = this.LJLILLLLZI;
            DmFilterKeywordsViewModel dmFilterKeywordsViewModel = dmFilterAddKeywordsBottomSheet.LJLJI;
            if (dmFilterKeywordsViewModel != null) {
                XLM xlm = dmFilterKeywordsViewModel.LJLILLLLZI;
                IDfS132S0100000_12 iDfS132S0100000_12 = new IDfS132S0100000_12(dmFilterAddKeywordsBottomSheet, 3);
                this.LJLIL = 1;
                if (xlm.collect(iDfS132S0100000_12, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
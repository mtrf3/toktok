package X;

import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportResponse;
import com.bytedance.android.livesdk.hints.LiveGiftApi;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.HotWordGiftViewModel$reportGuideAction$1", f = "HotWordGiftViewModel.kt", l = {449}, m = "invokeSuspend")
/* renamed from: X.UWd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77319UWd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ HotWordGiftViewModel LJLILLLLZI;
    public final /* synthetic */ UXD LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77319UWd(HotWordGiftViewModel hotWordGiftViewModel, UXD uxd, int i, InterfaceC67352kd<? super C77319UWd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hotWordGiftViewModel;
        this.LJLJI = uxd;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77319UWd(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                Object value = this.LJLILLLLZI.LJLJLJ.getValue();
                o.LJIIIIZZ(value, "<get-apiService>(...)");
                AbstractC73672Svk<C28467BFf<GuideKeywordsReportResponse.Data>> reportHotWordGiftAction = ((LiveGiftApi) value).reportHotWordGiftAction(this.LJLJI.LIZ(), this.LJLJI.LIZ.id, this.LJLJJI);
                this.LJLIL = 1;
                if (C77318UWc.LIZIZ(reportHotWordGiftAction, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

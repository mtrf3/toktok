package X;

import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import fjb.a;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.GuideFeedbackReportResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel$handleNewAnchorGuide$3$1", f = "GuidanceViewModel.kt", l = {516}, m = "invokeSuspend")
/* renamed from: X.BeV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29287BeV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ GuidanceViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29287BeV(String str, long j, GuidanceViewModel guidanceViewModel, InterfaceC67352kd<? super C29287BeV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = guidanceViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29287BeV(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            AbstractC73672Svk<GuideFeedbackReportResponse> observable = C28718BOw.LIZ().LIZ().reportGuidanceOrFeedbackShow(1, this.LJLILLLLZI, this.LJLJI, 0);
            GuidanceViewModel guidanceViewModel = this.LJLJJI;
            o.LJIIIIZZ(observable, "observable");
            this.LJLIL = 1;
            guidanceViewModel.getClass();
            if (GuidanceViewModel.gv0(observable, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

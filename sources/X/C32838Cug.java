package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.education.GiftEducationDataManager$reportGiftEducationGuideInfo$1", f = "GiftEducationDataManager.kt", l = {130}, m = "invokeSuspend")
/* renamed from: X.Cug, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32838Cug extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32838Cug(long j, int i, InterfaceC67352kd<? super C32838Cug> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32838Cug(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
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
                C65814PsI LIZ2 = C65814PsI.LIZ();
                long j = this.LJLILLLLZI;
                int i2 = this.LJLJI;
                LIZ2.getClass();
                AbstractC73672Svk<C28467BFf<GuideReportResponse.Data>> reportGiftGuide = ((GiftRetrofitApi) C65814PsI.LIZJ(GiftRetrofitApi.class)).reportGiftGuide(j, "gift_guide_popup_education", i2);
                o.LJIIIIZZ(reportGiftGuide, "getService(GiftRetrofitA…fo,\n                    )");
                this.LJLIL = 1;
                obj = C77318UWc.LIZIZ(reportGiftGuide, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (C28467BFf) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        C3C5.m13isSuccessimpl(LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

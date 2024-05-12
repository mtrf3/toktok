package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSugResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.TakoSugWordRequestService$requestSugWord$1", f = "TakoSugWordRequestService.kt", l = {45, 52}, m = "invokeSuspend")
/* renamed from: X.2r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71312r1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C99033ud LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ Long LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<TakoSugResponse, C76800UCe> LJLL;
    public final /* synthetic */ C109544Rq LJLLI;
    public final /* synthetic */ boolean LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71312r1(int i, C99033ud c99033ud, Long l, String str, Long l2, String str2, String str3, Long l3, InterfaceC88472Yns<? super TakoSugResponse, C76800UCe> interfaceC88472Yns, C109544Rq c109544Rq, boolean z, InterfaceC67352kd<? super C71312r1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = c99033ud;
        this.LJLJJI = l;
        this.LJLJJL = str;
        this.LJLJJLL = l2;
        this.LJLJL = str2;
        this.LJLJLJ = str3;
        this.LJLJLLL = l3;
        this.LJLL = interfaceC88472Yns;
        this.LJLLI = c109544Rq;
        this.LJLLILLLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71312r1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            int i2 = this.LJLILLLLZI;
            C99033ud c99033ud = this.LJLJI;
            Long l = this.LJLJJI;
            String str = this.LJLJJL;
            Long l2 = this.LJLJJLL;
            String str2 = this.LJLJL;
            String str3 = this.LJLJLJ;
            Long l3 = this.LJLJLLL;
            C775132l c775132l = C775132l.LIZ;
            String conversationId = c99033ud.getConversationId();
            this.LJLIL = 1;
            obj2 = c775132l.LIZ(i2, conversationId, l, str, l2, str2, str3, l3, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        LIZ = (TakoSugResponse) obj2;
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            V1B.LJIIZILJ("sug request fail, exception: " + m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C71322r2 c71322r2 = new C71322r2((TakoSugResponse) LIZ, this.LJLL, this.LJLLI, this.LJLLILLLL, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c71322r2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

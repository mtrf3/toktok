package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel$onLoadMoreConversation$1$1", f = "MessageRequestViewModel.kt", l = {205}, m = "invokeSuspend")
/* renamed from: X.4T6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4T6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<C97383ry> LJLILLLLZI;
    public final /* synthetic */ MessageRequestViewModel LJLJI;
    public final /* synthetic */ java.util.Set<String> LJLJJI;
    public final /* synthetic */ List<C63120Opw> LJLJJL;
    public final /* synthetic */ C4TA LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4T6(List<C97383ry> list, MessageRequestViewModel messageRequestViewModel, java.util.Set<String> set, List<? extends C63120Opw> list2, C4TA c4ta, InterfaceC67352kd<? super C4T6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = messageRequestViewModel;
        this.LJLJJI = set;
        this.LJLJJL = list2;
        this.LJLJJLL = c4ta;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4T6(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r3;
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
                List<C97383ry> list = this.LJLILLLLZI;
                MessageRequestViewModel messageRequestViewModel = this.LJLJI;
                java.util.Set<String> set = this.LJLJJI;
                List<C63120Opw> list2 = this.LJLJJL;
                messageRequestViewModel.getClass();
                if (list2 != null) {
                    r3 = new ArrayList();
                    for (C63120Opw c63120Opw : list2) {
                        if (!set.contains(c63120Opw.getConversationId())) {
                            r3.add(c63120Opw);
                        }
                    }
                } else {
                    r3 = C61878OQg.INSTANCE;
                }
                List LIZ = C97373rx.LIZ(list, r3);
                XKW xkw = this.LJLJI.LJLIL;
                C4T9 c4t9 = new C4T9(this.LJLJJLL, LIZ, null);
                this.LJLIL = 1;
                if (XKX.LJI(xkw, c4t9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C34B.LJ("MessageRequestViewModel", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent$ChatRoomMsgCheckObserver$executeActionBarAniCheckJob$1", f = "ChatRoomAlphaVideoComponent.kt", l = {527, 534}, m = "invokeSuspend")
/* renamed from: X.4ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118284ka extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ List<C109544Rq> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C118284ka(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, boolean z, List<? extends C109544Rq> list, InterfaceC67352kd<? super C118284ka> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = chatRoomAlphaVideoComponent;
        this.LJLJI = z;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C118284ka(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(200L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJLJJI);
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        this.LJLIL = 2;
        if (chatRoomAlphaVideoComponent.LIZ(arrayList, this, z) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

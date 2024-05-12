package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.remindusers.ui.ChatRequestFragment;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.remindusers.ui.ChatRequestFragment$updateEntrance$1", f = "ChatRequestFragment.kt", l = {233}, m = "invokeSuspend")
/* renamed from: X.3eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89093eb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ChatRequestFragment LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89093eb(int i, ChatRequestFragment chatRequestFragment, InterfaceC67352kd<? super C89093eb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = i;
        this.LJLJJI = chatRequestFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89093eb(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        SY4 sy4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LJLIL;
                try {
                    C141335gf.LIZJ(obj);
                } catch (Exception e) {
                    e = e;
                    if (i != 0 && (sy4 = (SY4) this.LJLJJI._$_findCachedViewById(R.id.b8u)) != null) {
                        sy4.setLoading(false);
                    }
                    C34B.LJ("ChatRequestFragment", e);
                    return C76800UCe.LIZ;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            int i3 = this.LJLJI;
            if (i3 == 2) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                this.LJLIL = i;
                this.LJLILLLLZI = 1;
                if (((TikTokImApi) C30U.LIZIZ.getValue()).inboxEntranceUpdate(1, i3, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } catch (Exception e2) {
                e = e2;
                if (i != 0) {
                    sy4.setLoading(false);
                }
                C34B.LJ("ChatRequestFragment", e);
                return C76800UCe.LIZ;
            }
        }
        if (i != 0) {
            this.LJLJJI.requireActivity().setResult(12);
            ChatRequestFragment chatRequestFragment = this.LJLJJI;
            chatRequestFragment.LJLJI = false;
            AX6.LIZ(chatRequestFragment);
        } else {
            this.LJLJJI.requireActivity().setResult(11);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

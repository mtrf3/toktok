package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteAcceptResponse;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl$acceptChatInvite$1", f = "ChatInviteViewModelImpl.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.2hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65392hT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public MutableLiveData LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ChatInviteViewModelImpl LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65392hT(ChatInviteViewModelImpl chatInviteViewModelImpl, String str, InterfaceC67352kd<? super C65392hT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = chatInviteViewModelImpl;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65392hT c65392hT = new C65392hT(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c65392hT.LJLJI = obj;
        return c65392hT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        int i;
        LiveData liveData4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        try {
        } catch (Exception unused) {
            num = new Integer(-1);
            liveData = liveData3;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                liveData = this.LJLIL;
                LiveData liveData5 = (LiveData) this.LJLJI;
                C141335gf.LIZJ(obj);
                liveData2 = liveData5;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            MutableLiveData<Integer> mutableLiveData = this.LJLJJI.LJLIL;
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            Long LJJIZ = C38350F3i.LJJIZ(curUserId);
            if (LJJIZ != null) {
                ChatInviteViewModelImpl chatInviteViewModelImpl = this.LJLJJI;
                String str = this.LJLJJL;
                long longValue = LJJIZ.longValue();
                TikTokImApi tikTokImApi = chatInviteViewModelImpl.LJLJJI;
                this.LJLJI = mutableLiveData;
                this.LJLIL = mutableLiveData;
                this.LJLILLLLZI = 1;
                obj = tikTokImApi.acceptChatInvite(str, longValue, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                liveData = mutableLiveData;
                liveData2 = liveData;
            } else {
                liveData = mutableLiveData;
                liveData4 = mutableLiveData;
                i = -1;
                liveData3 = liveData4;
                num = new Integer(i);
                liveData.setValue(num);
                return C76800UCe.LIZ;
            }
        }
        Integer num2 = ((ChatInviteAcceptResponse) obj).acceptStatus;
        liveData4 = liveData2;
        if (num2 != null) {
            i = num2.intValue();
            liveData3 = liveData2;
            num = new Integer(i);
            liveData.setValue(num);
            return C76800UCe.LIZ;
        }
        i = -1;
        liveData3 = liveData4;
        num = new Integer(i);
        liveData.setValue(num);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import Y.IDCListenerS302S0100000_42;
import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.IShare;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$initView$13$1$1", f = "MainFragment.kt", l = {1249}, m = "invokeSuspend")
/* renamed from: X.aov, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94929aov extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IShare LJLILLLLZI;
    public final /* synthetic */ IDCListenerS302S0100000_42 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94929aov(IShare iShare, InterfaceC67352kd interfaceC67352kd, IDCListenerS302S0100000_42 iDCListenerS302S0100000_42) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iShare;
        this.LJLJI = iDCListenerS302S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94929aov(this.LJLILLLLZI, completion, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            XIA xia = C78613UtF.LIZJ;
            C94928aou c94928aou = new C94928aou(this, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c94928aou, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CKEDraftInfo cKEDraftInfo = (CKEDraftInfo) obj;
        if (cKEDraftInfo == null || (str = cKEDraftInfo.draftPath) == null) {
            str = "";
        }
        if (str.length() > 0) {
            IShare iShare = this.LJLILLLLZI;
            ActivityC45651qj requireActivity = ((MainFragment) this.LJLJI.l0).requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            iShare.share(requireActivity, str, "");
        } else {
            ToastService toastService = ToastService.INSTANCE;
            Context requireContext = ((MainFragment) this.LJLJI.l0).requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            toastService.showToast(requireContext, "save draft failed!");
        }
        return C76800UCe.LIZ;
    }
}

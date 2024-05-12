package X;

import Y.IDCListenerS210S0100000_42;
import android.content.Context;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment$initAction$4$1$1", f = "LiquefyFragment.kt", l = {227}, m = "invokeSuspend")
/* renamed from: X.apa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94970apa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDCListenerS210S0100000_42 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94970apa(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDCListenerS210S0100000_42;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94970apa(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            LiquefyViewModel Gl = ((LiquefyFragment) this.LJLILLLLZI.l0).Gl();
            boolean z = this.LJLJI;
            this.LJLIL = 1;
            if (Gl.hv0(z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ((LiquefyFragment) this.LJLILLLLZI.l0).Gl().getClass();
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if ((LJI == null || !LJI.LJII()) && this.LJLJI) {
            LiquefyFragment liquefyFragment = (LiquefyFragment) this.LJLILLLLZI.l0;
            liquefyFragment.getClass();
            IDialog LIZ = C93405aQL.LIZ();
            Context requireContext = liquefyFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            String string = liquefyFragment.requireContext().getString(R.string.fn);
            o.LJIIIIZZ(string, "requireContext().getStri…ackingWarningModal_title)");
            String string2 = liquefyFragment.requireContext().getString(R.string.fl);
            o.LJIIIIZZ(string2, "requireContext().getStri…rackingWarningModal_body)");
            String string3 = liquefyFragment.requireContext().getString(R.string.fo);
            o.LJIIIIZZ(string3, "requireContext().getStri…trackingWarningModal_yes)");
            C93472aRQ.LIZ(LIZ, requireContext, string, string2, string3, liquefyFragment.requireContext().getString(R.string.fm), new C94409agX(liquefyFragment), null, null, null, null, 1984);
        }
        return C76800UCe.LIZ;
    }
}

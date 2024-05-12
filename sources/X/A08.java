package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog$onViewCreated$2", f = "RestrictDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A08 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ RestrictDialog LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A08(RestrictDialog restrictDialog, String str, InterfaceC67352kd<? super A08> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = restrictDialog;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        A08 a08 = new A08(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        a08.LJLIL = view;
        return a08.invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        this.LJLILLLLZI.getClass();
        C76542zS.LIZ("tiktokec_button_click", C113554cx.LJJLIIIIJ(new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("previous_page", "edit_profile"), new OSZ("page_name", "change_restriction"), new OSZ("button_name", "copy_address")));
        Object LLILL = C16880lQ.LLILL(view.getContext(), "clipboard");
        o.LJII(LLILL, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) LLILL;
        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399112, "bpea-C_end_account_shop_binding_and_name_consistency");
        try {
            OHS ohs = C252609vk.LIZ;
            String str = this.LJLJI;
            ClipData newPlainText = ClipData.newPlainText(str, str);
            o.LJIIIIZZ(newPlainText, "newPlainText(link, link)");
            ohs.getClass();
            OHS.LIZIZ(clipboardManager, newPlainText, LJJIIJ);
            ActivityC45651qj requireActivity = this.LJLILLLLZI.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C26045AKb c26045AKb = new C26045AKb(requireActivity);
            c26045AKb.LJIIIIZZ(R.string.fki);
            c26045AKb.LJIIJ();
        } catch (Q0C unused) {
        }
        return C76800UCe.LIZ;
    }
}

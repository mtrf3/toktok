package X;

import Y.IDCSpanS32S0100000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService$checkECommerceToggleResult$1$1", f = "ECommerceVideoService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GnU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42584GnU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Fragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42584GnU(Fragment fragment, InterfaceC67352kd<? super C42584GnU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42584GnU(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String string = this.LJLIL.getResources().getString(R.string.f7d);
        o.LJIIIIZZ(string, "fragment.resources.getSt…om_bc_svpopup_textmiddle)");
        String string2 = this.LJLIL.getResources().getString(R.string.s46);
        o.LJIIIIZZ(string2, "fragment.resources.getSt…ing.tcm_bc_home_eco_note)");
        String string3 = this.LJLIL.getResources().getString(R.string.s46, string);
        o.LJIIIIZZ(string3, "fragment.resources.getSt…eco_note, brandedContent)");
        int LJJLIIJ = s.LJJLIIJ(string2, "%s", 6);
        int length = string.length() + LJJLIIJ;
        SpannableString spannableString = new SpannableString(string3);
        if (LJJLIIJ >= 0) {
            IDCSpanS32S0100000_7 iDCSpanS32S0100000_7 = new IDCSpanS32S0100000_7(this.LJLIL, 4);
            StyleSpan styleSpan = new StyleSpan(1);
            spannableString.setSpan(iDCSpanS32S0100000_7, LJJLIIJ, length, 33);
            spannableString.setSpan(styleSpan, LJJLIIJ, length, 33);
        }
        C34K c34k = new C34K();
        Context requireContext = this.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        C26227ARb c26227ARb = new C26227ARb(requireContext);
        c26227ARb.LJFF(this.LJLIL.getResources().getString(R.string.f7f));
        c26227ARb.LIZIZ(spannableString);
        UC0.LIZJ(c26227ARb, new AqS138S0200000_7(this.LJLIL, c34k, 58));
        c26227ARb.LIZJ(new AqS173S0100000_7(c34k, 233));
        c26227ARb.LJI().LIZLLL();
        C76542zS.LIZJ("tiktokec_popup_show", new AqS33S1000000_10("video_brand_content_toggle", 4));
        LCW.LIZ().storeBoolean("key_ec_video_bc_tip_show", true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

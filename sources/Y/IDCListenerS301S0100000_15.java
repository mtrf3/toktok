package Y;

import X.C35936E8m;
import X.C6DJ;
import X.EnumC85644XjM;
import X.FMX;
import X.InterfaceC82683Wch;
import X.OHT;
import X.Q0C;
import X.WHL;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDCListenerS301S0100000_15 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS301S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS301S0100000_15 iDCListenerS301S0100000_15, View view) {
        Context context;
        InputCodeFragmentV2 inputCodeFragmentV2 = (InputCodeFragmentV2) iDCListenerS301S0100000_15.l0;
        inputCodeFragmentV2.getClass();
        try {
            Context context2 = inputCodeFragmentV2.getContext();
            if (context2 != null) {
                if (OHT.LIZJ(context2, TokenCert.Companion.with("bpea-code_has_text"))) {
                    InputCodeFragmentV2 inputCodeFragmentV22 = (InputCodeFragmentV2) iDCListenerS301S0100000_15.l0;
                    if (inputCodeFragmentV22.LLII == null && (context = inputCodeFragmentV22.getContext()) != null) {
                        C6DJ c6dj = new C6DJ(context);
                        View inputCodeView = inputCodeFragmentV22._$_findCachedViewById(R.id.enw);
                        o.LJIIIIZZ(inputCodeView, "inputCodeView");
                        c6dj.LIZ.LIZIZ = inputCodeView;
                        c6dj.LJI(WHL.TOP);
                        c6dj.LJIIJJI(new AqS181S0100000_15(inputCodeFragmentV22, 4));
                        inputCodeFragmentV22.LLII = c6dj.LIZJ();
                    }
                    InterfaceC82683Wch interfaceC82683Wch = inputCodeFragmentV22.LLII;
                    if (interfaceC82683Wch != null) {
                        interfaceC82683Wch.show();
                    }
                    EnumC85644XjM inputType = inputCodeFragmentV22.Yl();
                    o.LJIIIZ(inputType, "inputType");
                    C35936E8m c35936E8m = new C35936E8m();
                    c35936E8m.LIZ(inputType.ordinal(), "input_type");
                    FMX.LJIIL("paste_tooltip_show", c35936E8m.LIZ);
                    return true;
                }
                return true;
            }
            return true;
        } catch (Q0C unused) {
            return true;
        }
    }

    public static final boolean onLongClick$1(IDCListenerS301S0100000_15 iDCListenerS301S0100000_15, View view) {
        Context context;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) iDCListenerS301S0100000_15.l0;
        inputCodeFragment.getClass();
        try {
            Context context2 = inputCodeFragment.getContext();
            if (context2 != null) {
                if (OHT.LIZJ(context2, TokenCert.Companion.with("bpea-code_has_text_v1_fragment"))) {
                    InputCodeFragment inputCodeFragment2 = (InputCodeFragment) iDCListenerS301S0100000_15.l0;
                    if (inputCodeFragment2.LLILL == null && (context = inputCodeFragment2.getContext()) != null) {
                        C6DJ c6dj = new C6DJ(context);
                        View inputCodeView = inputCodeFragment2._$_findCachedViewById(R.id.enw);
                        o.LJIIIIZZ(inputCodeView, "inputCodeView");
                        c6dj.LIZ.LIZIZ = inputCodeView;
                        c6dj.LJI(WHL.TOP);
                        c6dj.LJIIJJI(new AqS181S0100000_15(inputCodeFragment2, 5));
                        inputCodeFragment2.LLILL = c6dj.LIZJ();
                    }
                    InterfaceC82683Wch interfaceC82683Wch = inputCodeFragment2.LLILL;
                    if (interfaceC82683Wch != null) {
                        interfaceC82683Wch.show();
                    }
                    EnumC85644XjM inputType = inputCodeFragment2.cm();
                    o.LJIIIZ(inputType, "inputType");
                    C35936E8m c35936E8m = new C35936E8m();
                    c35936E8m.LIZ(inputType.ordinal(), "input_type");
                    FMX.LJIIL("paste_tooltip_show", c35936E8m.LIZ);
                    return true;
                }
                return true;
            }
            return true;
        } catch (Q0C unused) {
            return true;
        }
    }
}

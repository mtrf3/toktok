package X;

import Y.ACListenerS23S0100000_3;
import Y.IDCListenerS243S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS37S1300000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.72b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1793372b {
    public static void LIZ(View view, String mEnterFrom, C224748ru c224748ru, InterfaceC1793272a interfaceC1793272a) {
        o.LJIIIZ(mEnterFrom, "mEnterFrom");
        C34K c34k = new C34K();
        if (view == null) {
            return;
        }
        if (((Boolean) C1793672e.LIZ.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = C7MY.LIZIZ(24);
            view.setLayoutParams(layoutParams);
            C26338AVi.LJI(view, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), AnonymousClass391.LIZJ(5), AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(9), false, 16);
            C26338AVi.LJIIIZ(view, AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(0), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), 16);
        }
        C71897SJp c71897SJp = (C71897SJp) view.findViewById(R.id.b_h);
        if (c71897SJp == null) {
            return;
        }
        C7HV c7hv = C7HV.LIZIZ;
        InterfaceC175156u7 LJIL = c7hv.LJIL();
        View findViewById = view.findViewById(R.id.b_g);
        o.LJIIIIZZ(findViewById, "upvoteCheckBoxContainer.…ById(R.id.check_box_text)");
        ((TextView) findViewById).setText(C86V.LJFF(c7hv.LJIIJ(R.string.pv5, R.string.q3v)));
        c71897SJp.setChecked(LJIL.LJFF());
        c71897SJp.setSize(0);
        c71897SJp.setInterceptToggleListener(new AqS37S1300000_3(LJIL, c34k, c71897SJp, mEnterFrom, 0));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(c71897SJp, 5), view);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("repost line start listener ");
        LIZ.append(view);
        C71Y.LIZ("xjcccccccc", X1D.LIZIZ(LIZ));
        view.addOnAttachStateChangeListener(new IDCListenerS243S0100000_3(interfaceC1793272a, view, c224748ru, c34k, 0));
    }

    public static InterfaceC82683Wch LIZIZ(View view, EditText editText, InterfaceC1793272a interfaceC1793272a, boolean z) {
        InterfaceC82683Wch interfaceC82683Wch;
        if (editText == null || !TextUtils.isEmpty(editText.getText())) {
            return C1793572d.LIZ;
        }
        if ((interfaceC1793272a != null && interfaceC1793272a.Gk()) || z) {
            return C1793572d.LIZ;
        }
        final InterfaceC175156u7 LJIL = C7HV.LIZIZ.LJIL();
        if (LJIL.LJIIIIZZ()) {
            return C1793572d.LIZ;
        }
        Context context = editText.getContext();
        if (context == null) {
            return C1793572d.LIZ;
        }
        if (view != null) {
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = view;
            c139825eE.LJI(WHL.TOP);
            c139825eE.LJIIJJI(R.string.q49);
            c139825eE.LIZ.LJJII = new InterfaceC82689Wcn() { // from class: X.71V
                @Override // X.InterfaceC82689Wcn
                public final void onShow() {
                    InterfaceC175156u7.this.LIZ();
                }
            };
            c139825eE.LJIIJ(new View.OnClickListener() { // from class: X.72c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC82683Wch interfaceC82683Wch2;
                    InterfaceC82683Wch interfaceC82683Wch3 = C1793572d.LIZ;
                    if (interfaceC82683Wch3 != null && interfaceC82683Wch3.isShowing() && (interfaceC82683Wch2 = C1793572d.LIZ) != null) {
                        interfaceC82683Wch2.dismiss();
                    }
                }
            }, true);
            c139825eE.LIZ.LJIJJLI = false;
            interfaceC82683Wch = c139825eE.LIZJ();
        } else {
            interfaceC82683Wch = null;
        }
        C1793572d.LIZ = interfaceC82683Wch;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.show();
        }
        return C1793572d.LIZ;
    }
}

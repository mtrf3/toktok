package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC226268uM extends LinearLayout implements View.OnClickListener {
    public InterfaceC226278uN LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC226268uM(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.w8, this, true);
        this.LJLILLLLZI = (TextView) LLLLIILL.findViewById(R.id.g_l);
        this.LJLJI = (TextView) LLLLIILL.findViewById(R.id.h3k);
        this.LJLJJI = (TextView) LLLLIILL.findViewById(R.id.iwt);
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            C16880lQ.LJIJI(textView, this);
        }
        TextView textView2 = this.LJLJI;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, this);
        }
        TextView textView3 = this.LJLJJI;
        if (textView3 != null) {
            C16880lQ.LJIJI(textView3, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        InterfaceC226278uN interfaceC226278uN;
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == R.id.g_l) {
            InterfaceC226278uN interfaceC226278uN2 = this.LJLIL;
            if (interfaceC226278uN2 != null) {
                interfaceC226278uN2.LIZIZ();
                return;
            }
            return;
        }
        if (id == R.id.h3k) {
            InterfaceC226278uN interfaceC226278uN3 = this.LJLIL;
            if (interfaceC226278uN3 == null) {
                return;
            }
            interfaceC226278uN3.LIZ();
            return;
        }
        if (id != R.id.iwt || (interfaceC226278uN = this.LJLIL) == null) {
            return;
        }
        interfaceC226278uN.LJLIIL();
    }

    public final void setInnerClick(InterfaceC226278uN interfaceC226278uN) {
        this.LJLIL = interfaceC226278uN;
    }
}

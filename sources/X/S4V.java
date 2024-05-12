package X;

import Y.IDCListenerS376S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.InputReason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Reason;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S4V extends FrameLayout {
    public final Reason LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public S4V() {
        throw null;
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final InputReason getReason() {
        String str = this.LJLIL.reasonKey;
        if (str == null) {
            str = "";
        }
        return new InputReason(str, String.valueOf(((C19K) LIZ(R.id.ilc)).getText()));
    }

    public final void LIZIZ() {
        boolean z;
        int i;
        ((TextView) LIZ(R.id.ila)).setText(String.valueOf(((TextView) LIZ(R.id.ilc)).length()));
        if (((TextView) LIZ(R.id.ilc)).length() <= this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LJLJJL) {
            this.LJLJJL = z;
            TextView textView = (TextView) LIZ(R.id.ila);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (this.LJLJJL) {
                i = R.attr.gv;
            } else {
                i = R.attr.e7;
            }
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(i, context));
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public final InterfaceC65784Pro<C76800UCe> getLogInputAction() {
        return this.LJLJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getUpdateValidity() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4V(Context context, Reason reason, AqS162S0100000_12 aqS162S0100000_12, AqS159S0200000_12 aqS159S0200000_12) {
        super(context, null, 0);
        this.LJLJJLL = new LinkedHashMap();
        this.LJLIL = reason;
        this.LJLILLLLZI = aqS162S0100000_12;
        this.LJLJI = aqS159S0200000_12;
        this.LJLJJI = 200;
        this.LJLJJL = true;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a1b, this, true);
        TextView textView = (TextView) LIZ(R.id.ild);
        String str = reason.title;
        textView.setText(str == null ? getContext().getResources().getString(R.string.f48) : str);
        Integer num = reason.descriptionLimit;
        if (num != null) {
            this.LJLJJI = num.intValue();
        }
        TextView textView2 = (TextView) LIZ(R.id.ilc);
        String str2 = reason.description;
        textView2.setHint(str2 == null ? getContext().getResources().getString(R.string.f46) : str2);
        LIZIZ();
        ((TextView) LIZ(R.id.ilc)).addTextChangedListener(new S4Y(this));
        LIZ(R.id.ilc).setOnFocusChangeListener(new IDCListenerS376S0100000_12(this, 4));
        TextView textView3 = (TextView) LIZ(R.id.ilb);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('/');
        LIZ.append(this.LJLJJI);
        textView3.setText(X1D.LIZIZ(LIZ));
    }
}

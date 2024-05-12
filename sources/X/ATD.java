package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATD extends LinearLayout {
    public final LinearLayout LJLIL;
    public TuxTextView LJLILLLLZI;
    public ASB LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxIconView LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJL;
        Integer valueOf = Integer.valueOf(R.id.as2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.as2);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public ATD(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.abs, this);
        View findViewById = findViewById(R.id.k_a);
        o.LJIIIIZZ(findViewById, "findViewById<LinearLayou….id.speed_item_container)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.LJLIL = linearLayout;
        View findViewById2 = findViewById(R.id.k_e);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.speed_selected)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.desc)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.icon)");
        this.LJLJJLL = (TuxIconView) findViewById4;
        ((TextView) linearLayout.findViewById(R.id.k9y)).setText("0.5x");
        ((TextView) linearLayout.findViewById(R.id.k9z)).setText("1x");
        ((TextView) linearLayout.findViewById(R.id.k_0)).setText("1.5x");
        ((TextView) linearLayout.findViewById(R.id.k_1)).setText("2x");
    }
}

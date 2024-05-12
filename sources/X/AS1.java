package X;

import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AS1 extends LinearLayout {
    public final TextView LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(R.id.cdy);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cdy);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public AS1(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.abr, this);
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        setPadding(LIZJ, 0, LIZJ, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.a4_);
        this.LJLIL = (TextView) findViewById(R.id.ipa);
    }

    public final void LIZIZ(AS8 vo, ASB asb, boolean z) {
        o.LJIIIZ(vo, "vo");
        TextView textView = this.LJLIL;
        if (textView != null) {
            String str = vo.LIZIZ;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(asb, vo, 77)));
        if (z) {
            LIZ().setVisibility(4);
        } else {
            LIZ().setVisibility(0);
        }
    }
}

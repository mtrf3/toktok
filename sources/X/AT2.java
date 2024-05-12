package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AT2 extends LinearLayout {
    public final ASA LJLIL;
    public ASB LJLILLLLZI;
    public ASB LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJJI;
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

    public AT2(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.abq, this);
        View findViewById = findViewById(R.id.c7s);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.desc_layout)");
        ASA asa = (ASA) findViewById;
        this.LJLIL = asa;
        View findViewById2 = findViewById(R.id.gmn);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.more_layout)");
        o.LJIIIIZZ(findViewById(R.id.mbc), "findViewById(R.id.tv_more)");
        asa.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 246)));
        C16880lQ.LJIIZILJ((LinearLayout) findViewById2, new ACListenerS24S0100000_4(this, 247));
    }

    public final void LIZIZ(C26275ASx item, boolean z) {
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI = item.LIZIZ;
        this.LJLJI = item.LIZJ;
        this.LJLIL.LIZ(item.LIZ);
        if (z) {
            LIZ().setVisibility(4);
        } else {
            LIZ().setVisibility(0);
        }
    }
}

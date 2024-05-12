package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AT3 extends FrameLayout {
    public final ASA LJLIL;
    public ASG LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJI;
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

    public AT3(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.abt, this);
        View findViewById = findViewById(R.id.c7s);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.desc_layout)");
        this.LJLIL = (ASA) findViewById;
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 249)));
    }

    public final void LIZIZ(C26276ASy item, boolean z) {
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI = item.LIZIZ;
        this.LJLIL.LIZ(item.LIZ);
        if (z) {
            LIZ().setVisibility(4);
        } else {
            LIZ().setVisibility(0);
        }
    }
}

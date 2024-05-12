package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AT6 extends FrameLayout {
    public final C2312995x LJLIL;
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

    public AT6(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.abu, this);
        View findViewById = findViewById(R.id.c7s);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.desc_layout)");
        this.LJLIL = (C2312995x) findViewById;
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, LiveCoverMinSizeSetting.DEFAULT)));
    }
}

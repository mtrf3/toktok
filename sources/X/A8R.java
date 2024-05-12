package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import ujb.o;

/* loaded from: classes5.dex */
public final class A8R extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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

    public A8R(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.bz7, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, LIZ(R.id.a21));
    }

    public final void setPricingTitle$anchor_business_release(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C45804HyK.LJJLL(LIZ(R.id.a3k));
        if (Q7K.LIZIZ("paid_content_anchor_transparency_UI_change_is_enabled", 0) == 1) {
            C45804HyK.LJJLL(LIZ(R.id.a4q));
        } else {
            C45804HyK.LJJLL(LIZ(R.id.a3h));
        }
        C45804HyK.LJJLL(LIZ(R.id.a3j));
        ((TextView) LIZ(R.id.a3j)).setText(str);
    }

    public final void setSubtitle$anchor_business_release(String str) {
        if (str != null && !o.LJJJJJL(str)) {
            ((TextView) LIZ(R.id.a46)).setText(str);
            C45804HyK.LJJLL(LIZ(R.id.a46));
        }
    }

    public final void setTitle$anchor_business_release(CharSequence charSequence) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a4n)).setText(charSequence);
        }
    }
}

package X;

import Y.ACListenerS25S0100000_5;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class BEJ extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BEJ(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.de7, this, true);
        findViewById(R.id.g8g);
    }

    public final void LIZIZ(int i) {
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.g8e);
        if (liveIconView != null) {
            liveIconView.setVisibility(0);
            liveIconView.setIcon(i);
        }
    }

    public final void LIZJ(String str) {
        TextView textView = (TextView) findViewById(R.id.g8f);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void LIZLLL(String str) {
        TextView textView = (TextView) findViewById(R.id.g8h);
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void LIZ(String str, InterfaceC65784Pro interfaceC65784Pro) {
        C2A7 c2a7 = (C2A7) findViewById(R.id.g8d);
        C29306Beo.LJJLJLI(c2a7);
        c2a7.setText(str);
        C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(interfaceC65784Pro, 382));
    }
}

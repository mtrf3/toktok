package X;

import Y.IDLListenerS192S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9G0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9G0 extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

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

    public final void setProductSummary(String summary) {
        o.LJIIIZ(summary, "summary");
        ((TextView) LIZ(R.id.lxa)).setText(summary);
    }

    public final void setVideoClicks(String clicks) {
        o.LJIIIZ(clicks, "clicks");
        ((TextView) LIZ(R.id.lvx)).setText(clicks);
    }

    public final void setVideoDuration(String duration) {
        o.LJIIIZ(duration, "duration");
        ((TextView) LIZ(R.id.lwa)).setText(duration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.aqp, this);
        LIZ(R.id.dbp).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS192S0100000_4(this, 6));
        LIZ(R.id.auc).getClass();
    }
}

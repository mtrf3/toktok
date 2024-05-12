package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class S0A extends S0H {
    public String LJLILLLLZI;
    public boolean LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.S0H
    public SmartImageView getBubbleIconView() {
        return (SmartImageView) LIZ(R.id.a1w);
    }

    @Override // X.S0H
    public TuxIconView getIconView() {
        return (TuxIconView) LIZ(R.id.a29);
    }

    public final OSZ<Boolean, Integer> getTitleShowStateInfo$ecommerce_video_release() {
        int ellipsisCount;
        int lineCount = ((TextView) LIZ(R.id.a4n)).getLineCount();
        if (lineCount <= 0) {
            return new OSZ<>(Boolean.FALSE, 0);
        }
        Layout layout = ((TextView) LIZ(R.id.a4n)).getLayout();
        if (layout != null && (ellipsisCount = layout.getEllipsisCount(lineCount - 1)) > 0) {
            return new OSZ<>(Boolean.TRUE, Integer.valueOf(((AppCompatTextView) LIZ(R.id.a4n)).getText().length() - ellipsisCount));
        }
        return new OSZ<>(Boolean.FALSE, Integer.valueOf(((AppCompatTextView) LIZ(R.id.a4n)).getText().length()));
    }

    @Override // X.S0H
    public String getPromotionInfo() {
        return this.LJLILLLLZI;
    }

    public final String getPromotionStyleInfo() {
        return this.LJLILLLLZI;
    }

    public S0A(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.xm, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, findViewById(R.id.a21));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LIZ(R.id.a24).getLocationInWindow(new int[2]);
        boolean z = true;
        float f = Float.MAX_VALUE;
        if (C90193gN.LIZ()) {
            if (motionEvent != null) {
                f = motionEvent.getRawX();
            }
            if (f < r4[0]) {
                z = false;
            }
            this.LJLJI = z;
        } else {
            if (motionEvent != null) {
                f = motionEvent.getRawX();
            }
            if (f > r4[0]) {
                z = false;
            }
            this.LJLJI = z;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.S0H
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a3f)).setText(charSequence);
            post(new ARunnableS48S0100000_12(this, 81));
            C45804HyK.LJJLL(LIZ(R.id.a3f));
            C45804HyK.LJJLL(LIZ(R.id.a4o));
        }
    }

    public final void setPromotionStyleInfo(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.S0H
    public void setSuffix(int i) {
        if (i > 1) {
            ((TextView) LIZ(R.id.a45)).setText(String.valueOf(i));
            C45804HyK.LJJLL(LIZ(R.id.a45));
            C45804HyK.LJJLL(LIZ(R.id.a28));
        }
    }

    public final void LIZIZ(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a4n)).setText(charSequence);
        }
        setPreTitle(charSequence2);
    }
}

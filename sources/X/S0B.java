package X;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class S0B extends S0H {
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public void setSuffix(int i) {
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

    public S0B(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.xl, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, findViewById(R.id.a21));
    }

    @Override // X.S0H
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a3f)).setText(charSequence);
            C45804HyK.LJJLL(LIZ(R.id.a3f));
            C45804HyK.LJJLL(LIZ(R.id.a4o));
        }
    }

    public final void LIZIZ(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a4n)).setText(charSequence);
        }
        setPreTitle(charSequence2);
    }
}

package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aV1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93695aV1 extends FrameLayout {
    public C94624ak0 LJLIL;
    public ImageView LJLILLLLZI;

    public final C94624ak0 getExtraEditText() {
        C94624ak0 c94624ak0 = this.LJLIL;
        if (c94624ak0 != null) {
            return c94624ak0;
        }
        o.LJIJI("extraEditText");
        throw null;
    }

    public final ImageView getExtraImageView() {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("extraImageView");
        throw null;
    }

    public C93695aV1(Context context) {
        super(context, null, 0);
        setBackground(getContext().getDrawable(R.drawable.dfr));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C94624ak0 c94624ak0 = new C94624ak0(context2);
        c94624ak0.setLayoutParams(C93902aYM.LIZIZ(this, -1, -2, 0, 0, null, null, 508));
        new IDqS419S0100000_42(this, 52).invoke(c94624ak0);
        C93902aYM.LIZ(c94624ak0, this);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        C94446ah8 c94446ah8 = new C94446ah8(context3, null, 6, 0);
        c94446ah8.setLayoutParams(C93902aYM.LIZIZ(this, -1, -1, C93742aVm.LIZIZ(4), 0, null, 17, 248));
        new IDqS419S0100000_42(this, 53).invoke(c94446ah8);
        C93902aYM.LIZ(c94446ah8, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C94624ak0 c94624ak0 = this.LJLIL;
        if (c94624ak0 != null) {
            if (c94624ak0.hasFocus()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (motionEvent != null && motionEvent.getActionMasked() == 1 && !isSelected()) {
                performClick();
            }
            return true;
        }
        o.LJIJI("extraEditText");
        throw null;
    }

    public final void setEditStyle(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(C04330Ez.LIZIZ(textView.getContext(), R.color.adn));
        textView.setHintTextColor(C04330Ez.LIZIZ(textView.getContext(), R.color.adr));
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setPadding(C93742aVm.LIZIZ(6), (int) C93742aVm.LIZ(9.5f), C93742aVm.LIZIZ(6), (int) C93742aVm.LIZ(9.5f));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            C94624ak0 c94624ak0 = this.LJLIL;
            if (c94624ak0 != null) {
                C93729aVZ.LJ(c94624ak0, new C94626ak2(this, c94624ak0, 5));
            } else {
                o.LJIJI("extraEditText");
                throw null;
            }
        }
    }
}

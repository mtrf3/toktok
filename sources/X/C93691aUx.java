package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aUx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93691aUx extends FrameLayout {
    public AppCompatTextView LJLIL;

    public C93691aUx(Context context) {
        super(context, null, 0);
        setBackground(context.getDrawable(R.drawable.dfr));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZIZ(this, -1, -2, (int) C93742aVm.LIZ(9.5f), C93742aVm.LIZIZ(6), null, null, 496));
        new IDqS419S0100000_42(this, 49).invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            AppCompatTextView appCompatTextView = this.LJLIL;
            if (appCompatTextView != null) {
                appCompatTextView.setHintTextColor(C04330Ez.LIZIZ(getContext(), R.color.ady));
                return;
            } else {
                o.LJIJI("textView");
                throw null;
            }
        }
        AppCompatTextView appCompatTextView2 = this.LJLIL;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setHintTextColor(C04330Ez.LIZIZ(getContext(), R.color.adr));
        } else {
            o.LJIJI("textView");
            throw null;
        }
    }

    public final void LIZ(String name, String str) {
        o.LJIIIZ(name, "name");
        AppCompatTextView appCompatTextView = this.LJLIL;
        if (appCompatTextView != null) {
            appCompatTextView.setHint(str);
            AppCompatTextView appCompatTextView2 = this.LJLIL;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(name);
                return;
            } else {
                o.LJIJI("textView");
                throw null;
            }
        }
        o.LJIJI("textView");
        throw null;
    }
}

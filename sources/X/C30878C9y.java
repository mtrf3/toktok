package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.C9y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30878C9y implements InterfaceLayoutInflaterFactory2C30767C5r {
    public static final View LIZ(Context context, String str, AttributeSet attributeSet) {
        if (TextUtils.equals(str, "FrameLayout")) {
            return new C1K4(context, attributeSet);
        }
        if (TextUtils.equals(str, "LinearLayout")) {
            return new C1K6(context, attributeSet);
        }
        if (TextUtils.equals(str, "RelativeLayout")) {
            return new C1K8(context, attributeSet);
        }
        if (TextUtils.equals(str, ConstraintLayout.class.getName())) {
            return new C1K3(context, attributeSet);
        }
        if (TextUtils.equals(str, CardView.class.getName())) {
            return new C1K1(context, attributeSet);
        }
        if (TextUtils.equals(str, C31808Ce4.class.getName())) {
            return new CVO(context, attributeSet);
        }
        if (TextUtils.equals(str, CVQ.class.getName())) {
            return new CVP(context, attributeSet);
        }
        if (TextUtils.equals(str, CVM.class.getName())) {
            return new CVN(context, attributeSet);
        }
        if (TextUtils.equals(str, "View")) {
            return new C1KA(context, attributeSet);
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return LIZ(context, str, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return LIZ(context, str, attributeSet);
    }
}

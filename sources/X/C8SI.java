package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.8SI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SI extends LinearLayout implements InterfaceC76931UHf {
    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return false;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8SI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        setGravity(16);
        C47121t6 c47121t6 = new C47121t6(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (CCJ.LIZ(context)) {
            layoutParams.rightMargin = (int) C87277YNd.LJIIJ(12);
        } else {
            layoutParams.leftMargin = (int) C87277YNd.LJIIJ(12);
        }
        c47121t6.setTextSize(14.0f);
        c47121t6.setSingleLine();
        c47121t6.setTypeface(C49616Jdc.LIZIZ().LIZLLL("medium"));
        c47121t6.setTextColor(getResources().getColor(R.color.bc));
        c47121t6.setText(context.getResources().getString(R.string.lj9));
        addView(c47121t6, layoutParams);
    }
}

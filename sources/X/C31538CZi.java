package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.CZi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31538CZi extends FrameLayout {
    public final LinearLayout LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;
    public ObjectAnimator LJLJJL;
    public ObjectAnimator LJLJJLL;
    public ObjectAnimator LJLJL;
    public ObjectAnimator LJLJLJ;
    public ObjectAnimator LJLJLLL;
    public ObjectAnimator LJLL;
    public AnimatorSet LJLLI;
    public AnimatorSet LJLLILLLL;

    public final void setHighGearDuration(long j) {
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append('s');
        c47121t6.setText(X1D.LIZIZ(LIZ));
    }

    public final void setLowGearDuration(long j) {
        C47121t6 c47121t6 = this.LJLJI;
        if (c47121t6 == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append('s');
        c47121t6.setText(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31538CZi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.d0z, this);
        setBackground(C04270Et.LIZIZ(context, R.drawable.clx));
        this.LJLIL = (LinearLayout) getRootView().findViewById(R.id.gab);
        this.LJLJI = (C47121t6) getRootView().findViewById(R.id.fdq);
        this.LJLILLLLZI = (LinearLayout) getRootView().findViewById(R.id.e5c);
        C47121t6 c47121t6 = (C47121t6) getRootView().findViewById(R.id.fdr);
        this.LJLJJI = c47121t6;
        if (c47121t6 != null) {
            c47121t6.setTextColor(ColorProtector.parseColor("#F2EEFF"));
        }
    }

    public final void LIZ(int i, long j) {
        if (i == 20) {
            LinearLayout linearLayout = this.LJLIL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.LJLILLLLZI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            setHighGearDuration(j);
            return;
        }
        LinearLayout linearLayout3 = this.LJLIL;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        LinearLayout linearLayout4 = this.LJLILLLLZI;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
        setLowGearDuration(j);
    }
}

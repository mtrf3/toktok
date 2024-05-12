package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.CpJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32505CpJ extends ConstraintLayout implements InterfaceC76931UHf {
    public boolean LJLIL;
    public final ImageView LJLILLLLZI;
    public final ImageView LJLJI;
    public final C47121t6 LJLJJI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        if (this.LJLIL || this.LJLJI.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        if (this.LJLJI.getVisibility() == 0) {
            return false;
        }
        int[] iArr = new int[2];
        this.LJLJJI.getLocationInWindow(iArr);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldShowDivider# mGiftDescriptionTv loc = ");
        LIZ.append(iArr[0]);
        LIZ.append(", ");
        LIZ.append(this.LJLJJI.getWidth());
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        if (CCJ.LIZ(getContext())) {
            if (iArr[0] <= i) {
                return true;
            }
            return false;
        }
        if (this.LJLJJI.getWidth() + iArr[0] >= i) {
            return true;
        }
        return false;
    }

    public final void setBannerClickListener(InterfaceC65784Pro<C76800UCe> clickListener) {
        o.LJIIIZ(clickListener, "clickListener");
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(clickListener, 157)));
        this.LJLJI.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32505CpJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32505CpJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        ViewGroup.inflate(context, R.layout.dp4, this);
        View findViewById = findViewById(R.id.fow);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.left_icon)");
        this.LJLILLLLZI = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.kqd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.subscription_button)");
        this.LJLJI = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.dsn);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.gift_description)");
        this.LJLJJI = (C47121t6) findViewById3;
    }
}

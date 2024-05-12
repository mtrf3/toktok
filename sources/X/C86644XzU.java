package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XzU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86644XzU extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final C47061t0 getMGiftIcon() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-mGiftIcon>(...)");
        return (C47061t0) value;
    }

    private final ProgressBar getMWishListProgressView() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mWishListProgressView>(...)");
        return (ProgressBar) value;
    }

    private final C47121t6 getMWishesProgressText() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mWishesProgressText>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C86644XzU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86644XzU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dna, this, true);
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 29));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 31));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 30));
        new ArrayList();
    }
}

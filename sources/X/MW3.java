package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW3 extends RelativeLayout {
    public static final int LJLJI = C17N.LJIILL(10.0d);
    public int LJLIL;
    public boolean LJLILLLLZI;

    static {
        C17N.LJIILL(6.0d);
        C17N.LJIILL(14.0d);
    }

    public final boolean getRiVideoRightShowed() {
        return this.LJLILLLLZI;
    }

    public final int getRightCoverTopMargin() {
        return this.LJLIL;
    }

    public final void setRiVideoRightShowed(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setRightCoverTopMargin(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MW3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View findViewById;
        C56915MVj c56915MVj;
        View LJFF;
        boolean z;
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        View findViewById2 = findViewById(R.id.h57);
        if (findViewById2 == null || (findViewById = findViewById(R.id.h5e)) == null || (c56915MVj = (C56915MVj) findViewById(R.id.h5o)) == null) {
            return;
        }
        View findViewById3 = findViewById(R.id.h4h);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.notification_bottom_view)");
        View findViewById4 = findViewById2.findViewById(R.id.h4z);
        o.LJIIIIZZ(findViewById4, "templateLeftView.findVie…notification_head_single)");
        View findViewById5 = findViewById2.findViewById(R.id.h4w);
        o.LJIIIIZZ(findViewById5, "templateLeftView.findVie…notification_head_double)");
        View LJFF2 = c56915MVj.LJFF(R.id.j2s);
        boolean z2 = true;
        if ((LJFF2 != null && LJFF2.getVisibility() == 0) || ((LJFF = c56915MVj.LJFF(R.id.j2t)) != null && LJFF.getVisibility() == 0)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        if (findViewById3.getVisibility() != 0) {
            z2 = false;
        }
        if (this.LJLILLLLZI) {
            int measuredHeight2 = getMeasuredHeight();
            int measuredHeight3 = findViewById.getMeasuredHeight();
            if (findViewById4.getMeasuredHeight() != 0) {
                measuredHeight = findViewById4.getMeasuredHeight();
            } else {
                measuredHeight = findViewById5.getMeasuredHeight();
            }
            int measuredHeight4 = c56915MVj.getMeasuredHeight();
            if (measuredHeight3 > measuredHeight || z2) {
                i3 = LJLJI;
            } else {
                i3 = (measuredHeight2 - measuredHeight4) / 2;
            }
            this.LJLIL = i3;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = findViewById(R.id.h5o);
        if (findViewById != null && this.LJLILLLLZI) {
            findViewById.setTop(this.LJLIL);
            findViewById.setBottom((findViewById.getMeasuredHeight() + r1) - 1);
        }
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.0Iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05340Iw extends FrameLayout {
    public final LinearLayout LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;

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
    public C05340Iw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.d0y, this);
        setBackground(C04270Et.LIZIZ(context, R.drawable.clu));
        this.LJLIL = (LinearLayout) getRootView().findViewById(R.id.gab);
        this.LJLJI = (C47121t6) getRootView().findViewById(R.id.fdq);
        this.LJLILLLLZI = (LinearLayout) getRootView().findViewById(R.id.e5c);
        this.LJLJJI = (C47121t6) getRootView().findViewById(R.id.fdr);
    }
}

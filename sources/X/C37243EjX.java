package X;

import Y.AObserverS74S0100000_6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0100000_6;

/* renamed from: X.EjX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37243EjX extends JEA {
    public DJQ LJLJJLL;
    public final JEV LJLJL;

    public C37243EjX() {
        super(R.id.hqd);
        this.LJLJL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(ControlOverlayViewModel.class));
    }

    @Override // X.JEA
    public final void LJIILJJIL(View view) {
        ((ControlOverlayViewModel) this.LJLJL.getValue()).LJLJLJ.observe(LJIIIIZZ(), new AObserverS74S0100000_6(this, 13));
        ((ControlOverlayViewModel) this.LJLJL.getValue()).LJLJJLL.observe(LJIIIIZZ(), new AObserverS74S0100000_6(this, 14));
    }

    @Override // X.JEA
    public final View LJI(Context context, JEE jee) {
        DJQ djq = new DJQ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(2));
        layoutParams.gravity = 80;
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0);
        djq.setLayoutParams(layoutParams);
        djq.setClickable(false);
        djq.setVisibility(8);
        this.LJLJJLL = djq;
        return djq;
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes9.dex */
public final class JEB extends JEA {
    public final JEV LJLJJLL;
    public final JEV LJLJL;

    public JEB() {
        super(R.id.hqd);
        this.LJLJJLL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipFeedWindowVM.class));
        this.LJLJL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(ControlOverlayViewModel.class));
    }

    @Override // X.JEA
    public final void LJIILJJIL(View view) {
        C16880lQ.LJIIJ(new JEN(this), view);
    }

    @Override // X.JEA
    public final View LJI(Context context, JEE jee) {
        return new FrameLayout(context);
    }
}

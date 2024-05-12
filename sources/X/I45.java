package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I45 extends AbstractC46011I3z {
    @Override // X.AbstractC46011I3z
    public final int getBottomLayoutRes() {
        return R.layout.bla;
    }

    @Override // X.AbstractC46011I3z
    public final void onViewCreated(View view, boolean z) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, z);
        View findViewById = view.findViewById(R.id.ax1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.btn_left)");
        set_flashView((TuxIconView) findViewById);
        View findViewById2 = view.findViewById(R.id.azm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_switch)");
        set_flipView(findViewById2);
    }
}

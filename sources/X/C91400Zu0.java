package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu0, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91400Zu0 extends AbstractC91320Zsi {
    public final C91188Zqa LJLIL;
    public final FrameLayout LJLILLLLZI;

    @Override // X.AbstractC91320Zsi
    public void setPageIndex(int i) {
    }

    @Override // X.AbstractC91320Zsi
    public void setPlayPage(InterfaceC91281Zs5 playPage) {
        o.LJIIIZ(playPage, "playPage");
    }

    @Override // X.AbstractC91320Zsi
    public final boolean LIZ() {
        if (this.LJLILLLLZI.getChildCount() <= 0 || this.LJLILLLLZI.getChildAt(0).getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final C91188Zqa getAudioStyleView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91400Zu0(Context context) {
        super(context);
        new LinkedHashMap();
        C91188Zqa c91188Zqa = new C91188Zqa(context);
        this.LJLIL = c91188Zqa;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LJLILLLLZI = frameLayout;
        frameLayout.setId(R.id.jh);
        LIZIZ(frameLayout);
        c91188Zqa.setVisibility(8);
        LIZIZ(c91188Zqa);
    }

    public final void LIZIZ(View view) {
        if (view.getParent() == null) {
            addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        if (!o.LJ(view.getParent(), this)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MusicDspPageView attach child error: ");
            LIZ.append(view);
            LIZ.append(" already has other parent");
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;

/* renamed from: X.BrK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30082BrK implements InterfaceC81248Vue {
    public final /* synthetic */ FrameLayout LIZ;
    public final /* synthetic */ LiveRecyclableWidget LIZIZ;

    public C30082BrK(FrameLayout frameLayout, LiveRecyclableWidget liveRecyclableWidget) {
        this.LIZ = frameLayout;
        this.LIZIZ = liveRecyclableWidget;
    }

    @Override // X.InterfaceC81248Vue
    public final /* synthetic */ boolean callBackInMainThread() {
        return true;
    }

    @Override // X.InterfaceC81248Vue
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        C16880lQ.LJLLLL(view, this.LIZ);
        this.LIZIZ.setContentView(view);
        LiveWidgetProviderProxy.Companion.getInstance().recycleRecyclableWidget(this.LIZIZ);
    }
}

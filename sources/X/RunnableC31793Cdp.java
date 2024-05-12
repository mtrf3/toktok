package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* renamed from: X.Cdp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC31793Cdp implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((RecyclableWidgetManager) this.LJLILLLLZI).lambda$generateNewWidget$0((LiveRecyclableWidget) this.LJLJI, (C31809Ce5) this.LJLJJI);
                return;
            default:
                ((NQ1) this.LJLILLLLZI).LIZIZ((View) this.LJLJI, (Runnable) this.LJLJJI, false);
                return;
        }
    }

    public /* synthetic */ RunnableC31793Cdp(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}

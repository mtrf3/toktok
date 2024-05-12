package X;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: X.BrD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30075BrD implements InterfaceC29879Bo3 {
    public boolean LIZ;
    public final /* synthetic */ Widget LIZIZ;
    public final /* synthetic */ C30076BrE LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.InterfaceC29879Bo3
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            Widget widget = this.LIZIZ;
            widget.args = new C30079BrH[]{new C30079BrH(obj)};
            this.LIZJ.LIZ.load(this.LIZLLL, widget, false);
        }
    }

    public C30075BrD(LiveWidget liveWidget, C30076BrE c30076BrE, int i) {
        this.LIZIZ = liveWidget;
        this.LIZJ = c30076BrE;
        this.LIZLLL = i;
    }
}

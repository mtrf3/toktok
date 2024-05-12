package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C71 implements InterfaceC30839C8l {
    public final /* synthetic */ PreviewSubscriptionWidget LIZ;

    @Override // X.InterfaceC30839C8l
    public final void LIZIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC30839C8l
    public final void LIZ() {
        if (!this.LIZ.LLIIIJ()) {
            if (this.LIZ.isShowing()) {
                this.LIZ.hide();
                C7N.LJIL().kU();
                return;
            }
            return;
        }
        PreviewSubscriptionWidget previewSubscriptionWidget = this.LIZ;
        C75 c75 = previewSubscriptionWidget.LJLJJI;
        if (c75 != null) {
            c75.LJ(new C73(previewSubscriptionWidget));
        }
    }

    public C71(PreviewSubscriptionWidget previewSubscriptionWidget) {
        this.LIZ = previewSubscriptionWidget;
    }
}

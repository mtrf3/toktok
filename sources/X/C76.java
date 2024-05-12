package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameImproveSubscribeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C76 implements InterfaceC30839C8l {
    public final /* synthetic */ PreviewSubscriptionWidget LIZ;

    @Override // X.InterfaceC30839C8l
    public final void LIZIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC30839C8l
    public final void LIZ() {
        PreviewSubscriptionWidget previewSubscriptionWidget;
        C75 c75;
        if (TtliveGameImproveSubscribeSetting.INSTANCE.shouldImproveSubscribe() && (c75 = (previewSubscriptionWidget = this.LIZ).LJLJJI) != null) {
            c75.LJ(new C77(previewSubscriptionWidget));
        }
        if (this.LIZ.LLIIIJ()) {
            this.LIZ.show();
        }
    }

    public C76(PreviewSubscriptionWidget previewSubscriptionWidget) {
        this.LIZ = previewSubscriptionWidget;
    }
}

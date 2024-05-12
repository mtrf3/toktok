package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;

/* loaded from: classes6.dex */
public final class C72 implements InterfaceC19890qH {
    public final /* synthetic */ PreviewSubscriptionWidget LJLIL;

    public C72(PreviewSubscriptionWidget previewSubscriptionWidget) {
        this.LJLIL = previewSubscriptionWidget;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        this.LJLIL.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_subscription_bubble_show");
        LIZ.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ.LJJIIJZLJL();
        this.LJLIL.LJLL = true;
        InterfaceC30442Bx8.LJLJLLL.LIZJ(Boolean.TRUE);
    }
}

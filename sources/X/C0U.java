package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;

/* loaded from: classes6.dex */
public final class C0U implements InterfaceC30622C0c {
    public final /* synthetic */ PreviewLiveModeWidget LIZ;

    public C0U(PreviewLiveModeWidget previewLiveModeWidget) {
        this.LIZ = previewLiveModeWidget;
    }

    @Override // X.InterfaceC30622C0c
    public final void LIZ(int i) {
        this.LIZ.LLFZ(i, null);
        PreviewLiveModeWidget previewLiveModeWidget = this.LIZ;
        if (previewLiveModeWidget.LJLLILLLL) {
            previewLiveModeWidget.LLII(i, false);
        }
        this.LIZ.LJLLILLLL = true;
    }
}

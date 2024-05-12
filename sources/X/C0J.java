package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;

/* loaded from: classes6.dex */
public final class C0J implements C0Y {
    public final /* synthetic */ PreviewLiveModeWidget LIZ;

    public C0J(PreviewLiveModeWidget previewLiveModeWidget) {
        this.LIZ = previewLiveModeWidget;
    }

    @Override // X.C0Y
    public final void onItemClick(int i) {
        C30620C0a LLFII = this.LIZ.LLFII();
        if (LLFII != null) {
            LLFII.LJLILLLLZI.LLIIIJ = false;
            LLFII.LJLIL.LJLIL(i + 1);
        }
        this.LIZ.LJLJJLL = true;
    }
}

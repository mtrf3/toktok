package X;

import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity;

/* loaded from: classes15.dex */
public final class W1D implements AlphaPlayerAction {
    public final /* synthetic */ EditorProAnchorActivity LIZ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void endAction() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void startAction() {
        this.LIZ.LLIIIILZ();
    }

    public W1D(EditorProAnchorActivity editorProAnchorActivity) {
        this.LIZ = editorProAnchorActivity;
    }
}

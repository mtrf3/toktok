package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverSelectDialog;

/* loaded from: classes6.dex */
public final class BGS extends AbstractC65781Prl implements InterfaceC65784Pro<PreviewCoverSelectDialog> {
    public static final BGS LJLIL = new BGS();

    public BGS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PreviewCoverSelectDialog invoke() {
        PreviewCoverSelectDialog previewCoverSelectDialog = new PreviewCoverSelectDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("autoClose", true);
        previewCoverSelectDialog.setArguments(bundle);
        return previewCoverSelectDialog;
    }
}

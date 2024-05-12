package X;

import android.view.KeyEvent;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;

/* renamed from: X.TGp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74367TGp implements C5HC {
    public final /* synthetic */ C74365TGn LJLIL;

    public C74367TGp(C74365TGn c74365TGn) {
        this.LJLIL = c74365TGn;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return ((RecordStickerPanelViewModel) this.LJLIL.LJLJI.getValue()).Lv0(i);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;

/* renamed from: X.Xug, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86346Xug implements C7CZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ LivePreviewPlayerVM LIZIZ;

    @Override // X.C7CZ
    public final void onFailed() {
    }

    @Override // X.C7CZ
    public final void LIZ(boolean z) {
        if (!z && this.LIZ) {
            return;
        }
        this.LIZIZ.LJLJJI.setValue(new C86350Xuk(z, true));
    }

    public C86346Xug(boolean z, LivePreviewPlayerVM livePreviewPlayerVM) {
        this.LIZ = z;
        this.LIZIZ = livePreviewPlayerVM;
    }
}

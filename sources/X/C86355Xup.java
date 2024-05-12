package X;

import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Xup, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86355Xup implements InterfaceC56552Jv {
    public final /* synthetic */ LivePreviewPlayerWidget LIZ;

    @Override // X.InterfaceC56552Jv
    public final void LIZ() {
        EnumC79996VaS enumC79996VaS;
        this.LIZ.LLFII();
        this.LIZ.LLFFF();
        FeedLiveViewHolderVM LJZ = this.LIZ.LJZ();
        if (LJZ != null) {
            enumC79996VaS = LJZ.LLI;
        } else {
            enumC79996VaS = null;
        }
        if (enumC79996VaS == EnumC79996VaS.PLAYING) {
            if (C53199KuJ.LIZ()) {
                LivePreviewPlayerVM LJZI = this.LIZ.LJZI();
                if (LJZI != null) {
                    LJZI.destroy();
                }
            } else {
                LivePreviewPlayerVM LJZI2 = this.LIZ.LJZI();
                if (LJZI2 != null) {
                    LJZI2.iv0();
                }
            }
            FeedLiveViewHolderVM LJZ2 = this.LIZ.LJZ();
            if (LJZ2 == null) {
                return;
            }
            EnumC79996VaS enumC79996VaS2 = EnumC79996VaS.STOP;
            o.LJIIIZ(enumC79996VaS2, "<set-?>");
            LJZ2.LLI = enumC79996VaS2;
        }
    }

    public C86355Xup(LivePreviewPlayerWidget livePreviewPlayerWidget) {
        this.LIZ = livePreviewPlayerWidget;
    }
}

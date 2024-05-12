package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;

/* renamed from: X.Cam, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31604Cam implements InterfaceC62555Ogp {
    public final /* synthetic */ LongPressWidget LIZ;
    public final /* synthetic */ Room LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C31604Cam(LongPressWidget longPressWidget, Room room, String str) {
        this.LIZ = longPressWidget;
        this.LIZIZ = room;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC62555Ogp
    public final void LIZ(boolean z, boolean z2) {
        LongPressWidget longPressWidget = this.LIZ;
        longPressWidget.LJLJJI = z2;
        longPressWidget.LJLJLJ.onDislikePressed();
        if (!this.LIZ.LJLJJI && C31205CMn.LIZ() != null) {
            C30033BqX.LLF(this.LIZIZ, this.LIZJ, "live_cell", "fyp");
        }
    }
}

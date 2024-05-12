package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes14.dex */
public final class TYG implements C0K7 {
    public final /* synthetic */ int LJLIL = 2;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ C73318Sq2 LJLJI;
    public final /* synthetic */ U4B LJLJJI;

    public TYG(Room room, C73318Sq2 c73318Sq2, U4B u4b) {
        this.LJLILLLLZI = room;
        this.LJLJI = c73318Sq2;
        this.LJLJJI = u4b;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C75078TdK.LIZ(this.LJLIL, false, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }
}

package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;

/* renamed from: X.BbN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29093BbN implements C0K7 {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public C29093BbN(LiveBroadcastFragment liveBroadcastFragment, Integer num, boolean z) {
        this.LJLIL = liveBroadcastFragment;
        this.LJLILLLLZI = z;
        this.LJLJI = num;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        int i;
        LiveBroadcastFragment liveBroadcastFragment = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        Integer num = this.LJLJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        liveBroadcastFragment.km(i, z);
        liveDialog.dismiss();
        Integer num2 = this.LJLJI;
        if (num2 != null && num2.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(0);
        }
        CB0.LIZ();
    }
}

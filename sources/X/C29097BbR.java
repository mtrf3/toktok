package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;

/* renamed from: X.BbR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29097BbR implements C0K7 {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public C29097BbR(VoiceChatBroadcastFragment voiceChatBroadcastFragment, Integer num, boolean z) {
        this.LJLIL = voiceChatBroadcastFragment;
        this.LJLILLLLZI = z;
        this.LJLJI = num;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        int i;
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        Integer num = this.LJLJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        voiceChatBroadcastFragment.cm(i, z);
        liveDialog.dismiss();
        Integer num2 = this.LJLJI;
        if (num2 == null || num2.intValue() != 4) {
            return;
        }
        C7N.LJIIIIZZ().logBoostCardLiveEndClick(0);
    }
}

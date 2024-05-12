package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;

/* renamed from: X.P5h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC63881P5h implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public /* synthetic */ RunnableC63881P5h(int i, BDLocation bDLocation) {
        this.LJLIL = 1;
        this.LJLILLLLZI = i;
        this.LJLJI = bDLocation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((LiveEmojiInputDialogFragment) this.LJLJI).Ml(this.LJLILLLLZI, false, false);
                return;
            case 1:
                BDLocationConfig.lambda$notificationLocationChange$0(this.LJLILLLLZI, (BDLocation) this.LJLJI);
                return;
            default:
                LiveStream.LIZJ((LiveStream) this.LJLJI, this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ RunnableC63881P5h(int i, int i2, Object obj) {
        this.LJLIL = i2;
        this.LJLJI = obj;
        this.LJLILLLLZI = i;
    }
}

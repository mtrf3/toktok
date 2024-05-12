package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerWidget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XuO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86328XuO implements InterfaceC86327XuN {
    public final /* synthetic */ MaskLayerWidget LIZ;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC86327XuN
    public final void LIZ() {
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75574TlK.class)).LIZ = Boolean.FALSE;
        }
        MaskLayerAndWarningVM LJZ = this.LIZ.LJZ();
        if (LJZ != null) {
            LJZ.LJLJJI = 200;
        }
        C86343Xud LJLZ = this.LIZ.LJLZ();
        if (LJLZ != null) {
            LJLZ.LJFF = true;
        }
        C30868C9o.LIZJ(R.string.mxa);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LIZ.LJLJJL.getValue();
        if (feedLiveViewHolderVM != null) {
            feedLiveViewHolderVM.mv0();
        }
        this.LIZ.LJZI("skip");
    }

    @Override // X.InterfaceC86327XuN
    public final void LIZIZ() {
        MaskLayerAndWarningVM LJZ = this.LIZ.LJZ();
        if (LJZ != null) {
            LJZ.LJLJI = true;
        }
        MaskLayerAndWarningVM LJZ2 = this.LIZ.LJZ();
        if (LJZ2 != null) {
            LJZ2.LJLJJI = 300;
        }
        MaskLayerAndWarningVM LJZ3 = this.LIZ.LJZ();
        if (LJZ3 != null) {
            LJZ3.LJLJJLL.setValue(C76800UCe.LIZ);
        }
        this.LIZ.LJZI("watch_live");
    }

    public C86328XuO(MaskLayerWidget maskLayerWidget) {
        this.LIZ = maskLayerWidget;
    }
}

package X;

import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKA extends AbstractC60811Ntn {
    public final DataChannel LJLILLLLZI;

    public BKA(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(SubscribeWebOnShow.class, Boolean.TRUE);
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(SubscribeWebOnShow.class, Boolean.FALSE);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(SubscribeWebOnShow.class, Boolean.FALSE);
        }
    }
}

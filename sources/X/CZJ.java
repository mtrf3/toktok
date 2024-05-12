package X;

import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* loaded from: classes6.dex */
public final class CZJ extends AbstractC32474Coo {
    public final /* synthetic */ CZI LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    public CZJ(CZI czi) {
        this.LIZ = czi;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(UpdateGiftListEvent.class, list);
        }
    }
}

package X;

import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.CjK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32134CjK extends AbstractC32474Coo {
    public final /* synthetic */ C32800Cu4 LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    public C32134CjK(C32800Cu4 c32800Cu4) {
        this.LIZ = c32800Cu4;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        List list2;
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            if (list != null) {
                list2 = ORZ.LLJILJILJ(list);
            } else {
                list2 = null;
            }
            LJI.qv0(UpdateGiftListEvent.class, list2);
        }
    }
}

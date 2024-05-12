package X;

import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.CjJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32133CjJ extends AbstractC32474Coo {
    public final /* synthetic */ C32801Cu5 LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    public C32133CjJ(C32801Cu5 c32801Cu5) {
        this.LIZ = c32801Cu5;
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

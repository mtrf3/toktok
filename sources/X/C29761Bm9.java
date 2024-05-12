package X;

import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.Bm9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29761Bm9 extends AbstractC32474Coo {
    public final /* synthetic */ FansClubViewModel LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    public C29761Bm9(FansClubViewModel fansClubViewModel) {
        this.LIZ = fansClubViewModel;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel != null) {
            dataChannel.qv0(UpdateGiftListEvent.class, list);
        }
    }
}

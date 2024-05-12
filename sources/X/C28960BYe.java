package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BYe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28960BYe implements C15L {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ int LIZIZ;

    public C28960BYe(int i, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = i;
    }

    @Override // X.C15L
    public final void LIZ(DialogInterface dialogInterface) {
        C28959BYd.LIZ(false);
        DataChannel dataChannel = this.LIZ;
        int i = this.LIZIZ;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_close_live_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(1, "has_sub_only_live");
        if (i != 5) {
            if (i == 6) {
                LIZ.LJIJJ("high_subscribers", "sub_only_live_strategy");
            }
        } else {
            LIZ.LJIJJ("high_acu", "sub_only_live_strategy");
        }
        LIZ.LJJIIJZLJL();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (this.LIZ != null) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            DataChannel dataChannel2 = this.LIZ;
            LiveSubOnlyConfig liveSubOnlyConfig = new LiveSubOnlyConfig();
            liveSubOnlyConfig.disabled = false;
            ((ISubscribeService) LIZ2).Pv(dataChannel2, liveSubOnlyConfig);
        }
    }
}

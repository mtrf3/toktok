package com.bytedance.android.livesdk.api.revenue.starcomment;

import X.CZR;
import X.InterfaceC06390Mx;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface IStarCommentService extends InterfaceC06390Mx {
    CZR CT(Fragment fragment, DataChannel dataChannel);

    int Ck0();

    StarCommentExtendWidget Dg0();

    boolean FJ(Object obj);

    boolean LR();

    boolean VR();

    String dz(DataChannel dataChannel);

    boolean eJ();

    void initPublicScreenConfiguration();

    Class<? extends LiveRecyclableWidget> rU();

    StarCommentPaymentDialog sb();
}

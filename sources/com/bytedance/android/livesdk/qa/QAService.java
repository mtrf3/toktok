package com.bytedance.android.livesdk.qa;

import X.BV1;
import X.C15610jN;
import X.C28902BVy;
import X.C28969BYn;
import X.C29315Bex;
import X.CN1;
import android.content.Context;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class QAService implements IQAService {
    public volatile boolean LJLIL;

    @Override // com.bytedance.android.live.qa.IQAService
    public final Class<? extends LiveRecyclableWidget> ck() {
        return QuestionCardWidget.class;
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void initPublicScreenConfiguration() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new C29315Bex());
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void Hk0() {
        C15610jN.LIZ().removeCallbacksAndMessages(C28969BYn.LIZ);
        C15610jN.LIZ().removeCallbacksAndMessages(C28969BYn.LIZIZ);
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        this.LJLIL = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new C29315Bex());
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final int bR() {
        return BV1.LIZ;
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final C28902BVy Kt0(Context context) {
        o.LJIIIZ(context, "context");
        return new C28902BVy(context, null);
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void dO(DataChannel dataChannel) {
        BV1.LIZ++;
        if (dataChannel != null) {
            dataChannel.pv0(RefreshMoreRedDotEvent.class);
        }
    }
}

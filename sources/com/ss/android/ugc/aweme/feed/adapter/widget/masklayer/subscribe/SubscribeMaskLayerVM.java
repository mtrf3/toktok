package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C28467BFf;
import X.C62822Ol8;
import X.C86343Xud;
import X.C86362Xuw;
import Y.AfS30S0110000_15;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.AqS165S0100000_15;
import webcast.api.room.PreviewTimeReportResponse;

/* loaded from: classes16.dex */
public final class SubscribeMaskLayerVM extends LiveWidgetViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 354));
    public final NextLiveData LJLILLLLZI = new NextLiveData();
    public final NextLiveData<C86362Xuw> LJLJI = new NextLiveData<>();
    public long LJLJJI = -1;

    public final void hv0() {
        LiveRoomStruct liveRoomStruct;
        C86343Xud c86343Xud = (C86343Xud) this.LJLIL.getValue();
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            long j = liveRoomStruct.allowPreviewTime;
            if (j > 0) {
                this.LJLJJI = j;
            }
        }
    }

    public final void gv0(boolean z) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud c86343Xud = (C86343Xud) this.LJLIL.getValue();
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            long j = liveRoomStruct.allowPreviewTime;
            long j2 = 0;
            if (j < 0) {
                if (!z) {
                    return;
                }
            } else if (z) {
                return;
            }
            long j3 = liveRoomStruct.id;
            long j4 = this.LJLJJI - j;
            if (j4 <= 0) {
                j4 = 0;
            }
            if (!z) {
                j2 = j4;
            }
            AbstractC73672Svk<C28467BFf<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime = LiveOuterService.LJJJLL().LJJIJIL().reportSubscribePreviewTime(j3, j2);
            if (reportSubscribePreviewTime != null) {
                reportSubscribePreviewTime.LJJJLIIL(new AfS30S0110000_15(this, z, 3), new AfS30S0110000_15(this, z, 4));
            }
        }
    }
}

package com.bytedance.android.livesdk.programmedlive;

import X.C29044Baa;
import Y.AObjectS22S0000000_5;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveMenuWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceCollapseWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceExpandWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceLandscapeWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveTitleWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ProgrammedLiveService implements IProgrammedLiveService {
    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> AG() {
        return ProgrammedLiveFollowCardWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> Eq0() {
        return ProgrammedLiveUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> kA() {
        return ProgrammedLiveMenuWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> ok() {
        return ProgrammedLiveTitleWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean lj() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || room.topFrameSummary == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final LiveRecyclableWidget eq0(boolean z, boolean z2, RecyclableWidgetManager widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            if (z) {
                if (z2) {
                    return widgetManager.getRecyclableWidgetFromCacheOrNew(ProgrammedLiveOnlineAudienceExpandWidget.class, null, new AObjectS22S0000000_5(11));
                }
                return widgetManager.getRecyclableWidgetFromCacheOrNew(ProgrammedLiveOnlineAudienceCollapseWidget.class, null, new AObjectS22S0000000_5(12));
            }
            return widgetManager.getRecyclableWidgetFromCacheOrNew(ProgrammedLiveOnlineAudienceLandscapeWidget.class, null, new AObjectS22S0000000_5(13));
        }
        if (z) {
            if (z2) {
                return new ProgrammedLiveOnlineAudienceExpandWidget();
            }
            return new ProgrammedLiveOnlineAudienceCollapseWidget();
        }
        return new ProgrammedLiveOnlineAudienceLandscapeWidget();
    }
}

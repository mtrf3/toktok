package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public class UserInfoWidgetService implements IUserInfoWidgetService {
    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final Class<? extends LiveRecyclableWidget> QX() {
        return LiveRoomUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final Class<? extends LiveRecyclableWidget> ma0() {
        return ClearScreenUserInfoWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final TryModeUserInfoWidget zm() {
        return new TryModeUserInfoWidget();
    }
}

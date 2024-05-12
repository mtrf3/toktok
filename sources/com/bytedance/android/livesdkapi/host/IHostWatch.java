package com.bytedance.android.livesdkapi.host;

import X.IPR;
import X.InterfaceC06390Mx;
import X.InterfaceC28610BKs;
import X.InterfaceC75370Ti2;
import X.JIT;
import android.content.Context;
import android.view.TextureView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* loaded from: classes6.dex */
public interface IHostWatch extends InterfaceC06390Mx {
    void addScreenShotListener();

    int getAnchorPosition();

    String getFollowWidgetType();

    boolean getIsFollowJumpToLive();

    boolean getIsFollowWidgetExp();

    InterfaceC28610BKs getSearchComponent(String str);

    InterfaceC75370Ti2 getVideoCleanPlayerController(TextureView textureView, String str, int i, JIT jit, String str2, IPR ipr);

    int getWidgetAnchorNum();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void recordExitRoomId(long j);

    void removeScreenShotListener();

    void searchScrollToNextItem();

    void setIsFollowJumpToLive(boolean z);

    void updateRoomLists(String str, boolean z, int i, List<Long> list);

    void updateSearchScrollStatus();

    void watchLive(Context context, EnterRoomConfig enterRoomConfig);

    void watchLive(Context context, EnterRoomConfig enterRoomConfig, long j);

    void watchLive(Context context, EnterRoomConfig enterRoomConfig, String str);

    boolean watchLiveFromSchema(Context context, EnterRoomConfig enterRoomConfig);

    boolean watchLiveFromSchemaNoLogin(Context context, EnterRoomConfig enterRoomConfig, String str);
}

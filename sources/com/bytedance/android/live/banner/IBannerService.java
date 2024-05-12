package com.bytedance.android.live.banner;

import X.C0IZ;
import X.C65776Prg;
import X.InterfaceC06390Mx;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* loaded from: classes.dex */
public interface IBannerService extends InterfaceC06390Mx {
    LiveRecyclableWidget E80(RecyclableWidgetManager recyclableWidgetManager);

    void H50(long j);

    void LLFFF(Room room, DataChannel dataChannel);

    void Vn(long j, C0IZ c0iz);

    Class<? extends LiveRecyclableWidget> YS(boolean z);

    void bE(Room room, DataChannel dataChannel);

    void jj(Uri uri);

    Class<? extends LiveRecyclableWidget> pc();

    C65776Prg sj();

    void wS(LifecycleOwner lifecycleOwner, long j, boolean z);

    boolean yj0(long j);
}

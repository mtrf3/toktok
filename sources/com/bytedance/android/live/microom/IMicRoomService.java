package com.bytedance.android.live.microom;

import X.InterfaceC06390Mx;
import android.content.Context;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IMicRoomService extends InterfaceC06390Mx {
    Class<? extends LiveRecyclableWidget> G90();

    boolean Nl();

    boolean O10(Room room);

    boolean Qo(Room room);

    Class<? extends LiveRecyclableWidget> Rn0();

    int Sf0(Room room);

    void Y30(long j, long j2, boolean z);

    Class<? extends LiveRecyclableWidget> a20();

    String getEnterFromMerge();

    String getEnterMethod();

    Map<String, String> getRoomInfo();

    LiveMicRoomInfoDialog ir0(Context context, boolean z, long j, Room room);

    boolean jT(Room room);

    void oM(long j);

    boolean oT();

    Class<? extends LiveRecyclableWidget> pT();

    boolean qt();

    boolean rk();

    Class<? extends LiveRecyclableWidget> sQ();

    int zd0();
}

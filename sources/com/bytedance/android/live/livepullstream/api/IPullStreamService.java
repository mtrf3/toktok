package com.bytedance.android.live.livepullstream.api;

import X.B35;
import X.B4E;
import X.BMZ;
import X.BQ9;
import X.C28295B8p;
import X.C78579Ush;
import X.InterfaceC06390Mx;
import X.InterfaceC28605BKn;
import X.InterfaceC28738BPq;
import X.InterfaceC28740BPs;
import X.InterfaceC30552Byu;
import X.InterfaceC30713C3p;
import X.InterfaceC31143CKd;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public interface IPullStreamService extends InterfaceC06390Mx {
    void Be();

    RoomPlayer2 Ha(long j, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, InterfaceC28740BPs interfaceC28740BPs, Context context, long j2);

    void Jn0(String str);

    B35 Nf(long j, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, C28295B8p c28295B8p, Context context, String str2, String str3, long j2);

    void PX(String str);

    boolean S4(Context context, String str);

    InterfaceC31143CKd S40();

    InterfaceC30713C3p SN();

    BQ9 Tx();

    B35 Wm0(Context context, EnterRoomConfig enterRoomConfig, long j);

    BMZ Wp();

    String gf(long j, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, String str5, long j2);

    InterfaceC28738BPq h0();

    InterfaceC28605BKn ho();

    B35 ht0(long j, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, InterfaceC28740BPs interfaceC28740BPs, Context context, String str3, long j2);

    RoomPlayer2 om0(long j, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, C28295B8p c28295B8p, Context context, String str2, long j2);

    InterfaceC30552Byu s40();

    B35 t30(Context context, Room room);

    C78579Ush th();

    String v70();
}

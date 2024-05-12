package com.bytedance.android.livesdk.revenue.level.api.service;

import X.C28294B8o;
import X.C29750Bly;
import X.C57562Ns;
import X.InterfaceC06390Mx;
import X.InterfaceC29734Bli;
import X.InterfaceC29736Blk;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public interface IFansClubService extends InterfaceC06390Mx {
    boolean As0(int i, int i2);

    ImageModel Bd(long j);

    int Cs(List<BadgeStruct> list);

    C29750Bly DZ();

    boolean De();

    void ED(Context context, String str);

    void Et0(FansClubViewModel fansClubViewModel);

    void Ij(double d);

    boolean Mg0(String str);

    void Mh();

    boolean NP();

    void Nr(double d);

    void Q1();

    boolean SD();

    void SI(boolean z, String str, String str2, boolean z2, String str3, boolean z3);

    int Sh0(int i);

    boolean Vb0();

    boolean Wg0();

    void Wi0();

    Map Yd(Room room, DataChannel dataChannel, boolean z);

    LiveDialogFragment b70(String str);

    void dn0();

    ArrayList<Double> eT();

    InterfaceC29734Bli ef(boolean z, ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC29736Blk interfaceC29736Blk, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    LiveDialogFragment fM();

    void gK(BadgeStruct badgeStruct, BadgeStruct badgeStruct2);

    boolean ge0();

    C28294B8o hJ(Context context);

    void ld0();

    RoomRecycleWidget mY();

    Class<? extends LiveRecyclableWidget> mk();

    void oV(String str);

    C57562Ns sr0(Context context);

    FansEntranceResConfig sx(int i);

    void tz(FansLevelInfo fansLevelInfo, long j);

    C29750Bly yD(User user);
}

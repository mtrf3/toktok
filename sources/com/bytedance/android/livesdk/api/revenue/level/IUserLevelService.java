package com.bytedance.android.livesdk.api.revenue.level;

import X.C29800Bmm;
import X.C76800UCe;
import X.InterfaceC06390Mx;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.UserGrade;

/* loaded from: classes6.dex */
public interface IUserLevelService extends InterfaceC06390Mx {
    void DK(boolean z, InterfaceC88472Yns<? super List<GradeConfig>, C76800UCe> interfaceC88472Yns, String str, Boolean bool, String str2);

    void I10(int i);

    int LB(long j);

    int MW(int i);

    void Q1();

    void Qm0();

    void Rm(UserGrade userGrade, boolean z, String str, boolean z2);

    void Un(double d);

    int Xy();

    void bG(long j);

    void d90(UserLevelViewModel userLevelViewModel);

    String eK();

    Class<? extends LiveRecyclableWidget> ei();

    void en0(double d);

    boolean fn0();

    C29800Bmm gr();

    CopyOnWriteArraySet<Double> jj0();

    boolean rh(int i);

    int tl0(List<BadgeStruct> list);

    RoomRecycleWidget xa0();
}

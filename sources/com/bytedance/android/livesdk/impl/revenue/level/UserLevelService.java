package com.bytedance.android.livesdk.impl.revenue.level;

import X.C29800Bmm;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.UserGrade;

/* loaded from: classes6.dex */
public class UserLevelService implements IUserLevelService {
    public IUserLevelService LJLIL;

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Q1() {
        this.LJLIL = null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final Class<? extends LiveRecyclableWidget> ei() {
        return UserLevelWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Qm0() {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.Qm0();
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int Xy() {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.Xy();
        }
        return 50;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final String eK() {
        String eK;
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService == null || (eK = iUserLevelService.eK()) == null) {
            return "";
        }
        return eK;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean fn0() {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.fn0();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C29800Bmm gr() {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.gr();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final CopyOnWriteArraySet<Double> jj0() {
        CopyOnWriteArraySet<Double> jj0;
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService == null || (jj0 = iUserLevelService.jj0()) == null) {
            return new CopyOnWriteArraySet<>();
        }
        return jj0;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final RoomRecycleWidget xa0() {
        return new UserLevelWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void I10(int i) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.I10(i);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int LB(long j) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.LB(j);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int MW(int i) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.MW(i);
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Un(double d) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.Un(d);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void bG(long j) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.bG(j);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void d90(UserLevelViewModel userLevelViewModel) {
        this.LJLIL = userLevelViewModel;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void en0(double d) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.en0(d);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean rh(int i) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.rh(i);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int tl0(List<BadgeStruct> list) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            return iUserLevelService.tl0(list);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Rm(UserGrade userGrade, boolean z, String str, boolean z2) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.Rm(userGrade, z, str, z2);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void DK(boolean z, InterfaceC88472Yns<? super List<GradeConfig>, C76800UCe> interfaceC88472Yns, String str, Boolean bool, String str2) {
        IUserLevelService iUserLevelService = this.LJLIL;
        if (iUserLevelService != null) {
            iUserLevelService.DK(z, interfaceC88472Yns, str, bool, str2);
        }
    }
}

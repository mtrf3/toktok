package com.bytedance.android.livesdk.revenue.level.impl.fansclub;

import X.C20880rs;
import X.C20910rv;
import X.C28294B8o;
import X.C29474BhW;
import X.C29750Bly;
import X.C57562Ns;
import X.InterfaceC29734Bli;
import X.InterfaceC29736Blk;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.level.FansClubAnchorEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubAudienceEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinGiftDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public class FansClubService implements IFansClubService {
    public IFansClubService LJLIL;
    public FansClubJoinGiftDialog LJLILLLLZI;
    public FansClubJoinDialog LJLJI;

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Q1() {
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLIL = null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Class<? extends LiveRecyclableWidget> mk() {
        return FansClubWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C29750Bly DZ() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.DZ();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean De() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.De();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Mh() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.Mh();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean NP() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.NP();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean SD() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.SD();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Vb0() {
        return FansClubAudienceEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Wg0() {
        return FansClubAnchorEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Wi0() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.Wi0();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void dn0() {
        C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.d3a, C20880rs.LIZ("ttlive_fans_club_entrance_layout"), null, false, 24);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ArrayList<Double> eT() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.eT();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final LiveDialogFragment fM() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new FansClubJoinGiftDialog();
        }
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean ge0() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.ge0();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void ld0() {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.ld0();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final RoomRecycleWidget mY() {
        return new FansClubWidget();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ImageModel Bd(long j) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.Bd(j);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Cs(List<BadgeStruct> list) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.Cs(list);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Et0(FansClubViewModel fansClubViewModel) {
        this.LJLIL = fansClubViewModel;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Ij(double d) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.Ij(d);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Mg0(String str) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.Mg0(str);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Nr(double d) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.Nr(d);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Sh0(int i) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.Sh0(i);
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final LiveDialogFragment b70(String str) {
        if (this.LJLJI == null) {
            this.LJLJI = new FansClubJoinDialog();
        }
        FansClubJoinDialog fansClubJoinDialog = this.LJLJI;
        if (fansClubJoinDialog != null) {
            fansClubJoinDialog.LJLLILLLL = str;
        }
        return fansClubJoinDialog;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C28294B8o hJ(Context context) {
        if (context == null) {
            return null;
        }
        return new C28294B8o(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void oV(String str) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.oV(str);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C57562Ns sr0(Context context) {
        if (context == null) {
            return null;
        }
        return new C57562Ns(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final FansEntranceResConfig sx(int i) {
        FansEntranceResConfig sx;
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService == null || (sx = iFansClubService.sx(i)) == null) {
            return null;
        }
        return sx;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C29750Bly yD(User user) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.yD(user);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean As0(int i, int i2) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.As0(i, i2);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void ED(Context context, String str) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.ED(context, "entrance");
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void gK(BadgeStruct badgeStruct, BadgeStruct badgeStruct2) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.gK(badgeStruct, badgeStruct2);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void tz(FansLevelInfo fansLevelInfo, long j) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.tz(fansLevelInfo, j);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Map Yd(Room room, DataChannel dataChannel, boolean z) {
        return C29474BhW.LIZIZ(room, dataChannel, z);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void SI(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            iFansClubService.SI(z, str, str2, z2, str3, z3);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final InterfaceC29734Bli ef(boolean z, ViewGroup rootView, ViewGroup viewGroup, InterfaceC29736Blk interfaceC29736Blk, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(rootView, "rootView");
        IFansClubService iFansClubService = this.LJLIL;
        if (iFansClubService != null) {
            return iFansClubService.ef(z, rootView, viewGroup, interfaceC29736Blk, lifecycleOwner, dataChannel);
        }
        return null;
    }
}

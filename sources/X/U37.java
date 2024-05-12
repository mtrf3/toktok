package X;

import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import Y.IDDListenerS152S0100000_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;

/* loaded from: classes14.dex */
public final class U37 implements InterfaceC76536U2a {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.InterfaceC76536U2a
    public final void LJ() {
        long j;
        String str;
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value;
        MutableLiveData<ShowConfig> mutableLiveData2;
        ShowConfig value2;
        ShowConfig showConfig;
        MutableLiveData<ShowConfig> mutableLiveData3;
        LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
        U3D u3d = liveShowAnchorWidget.LJLLLL;
        boolean z = false;
        if (u3d != null && u3d.isShowing()) {
            return;
        }
        if (liveShowAnchorWidget.LJLLLL == null) {
            Context context = liveShowAnchorWidget.context;
            o.LJIIIIZZ(context, "context");
            U3A u3a = liveShowAnchorWidget.LL;
            BaseLiveShowViewModel baseLiveShowViewModel = liveShowAnchorWidget.LJLILLLLZI;
            if (baseLiveShowViewModel != null && (mutableLiveData3 = baseLiveShowViewModel.LJLJJI) != null) {
                showConfig = mutableLiveData3.getValue();
            } else {
                showConfig = null;
            }
            liveShowAnchorWidget.LJLLLL = new U3D(context, u3a, showConfig);
        }
        U3D u3d2 = liveShowAnchorWidget.LJLLLL;
        if (u3d2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/show/anchor/LiveShowSettingsDialog", "show", u3d2, new Object[0], "void", new C65300Pk0(false, "()V", "-5134989465411479383")).LIZ) {
            u3d2.show();
        }
        U3D u3d3 = liveShowAnchorWidget.LJLLLL;
        if (u3d3 != null) {
            u3d3.setOnDismissListener(new IDDListenerS152S0100000_13(liveShowAnchorWidget, 23));
        }
        BaseLiveShowViewModel baseLiveShowViewModel2 = liveShowAnchorWidget.LJLILLLLZI;
        if (baseLiveShowViewModel2 != null && (mutableLiveData2 = baseLiveShowViewModel2.LJLJJI) != null && (value2 = mutableLiveData2.getValue()) != null) {
            j = value2.durationPerGuest;
        } else {
            j = 300;
        }
        BaseLiveShowViewModel baseLiveShowViewModel3 = liveShowAnchorWidget.LJLILLLLZI;
        if (baseLiveShowViewModel3 != null && (mutableLiveData = baseLiveShowViewModel3.LJLJJI) != null && (value = mutableLiveData.getValue()) != null) {
            z = value.allowOpenMicFreely;
        }
        java.util.Map LIZ = C76548U2m.LIZ();
        LIZ.put("default_duration_per_guest", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("is_guest_mic_open", str);
        LIZ.put("is_liveshow_ongoing", C76548U2m.LJFF());
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_setting_show", LIZ);
    }

    @Override // X.InterfaceC76536U2a
    public final void LJI() {
        C47071t1 c47071t1 = new C47071t1(this.LIZ.context);
        c47071t1.LJIILLIIL(R.string.nd0);
        c47071t1.LJFF(R.string.ncz);
        c47071t1.LJIIL(R.string.ncu, new IDcS172S0100000_13(this.LIZ, 5));
        c47071t1.LJIIIZ(R.string.ndt, U3R.LJLIL);
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-5134989465411479383")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // X.InterfaceC76536U2a
    public final void LJII() {
        LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
        DialogC76540U2e dialogC76540U2e = liveShowAnchorWidget.LJLLL;
        if (dialogC76540U2e != null && dialogC76540U2e.isShowing()) {
            return;
        }
        if (liveShowAnchorWidget.LJLLL == null) {
            Context context = liveShowAnchorWidget.context;
            o.LJIIIIZZ(context, "context");
            liveShowAnchorWidget.LJLLL = new DialogC76540U2e(context, liveShowAnchorWidget.LJZL);
        }
        DialogC76540U2e dialogC76540U2e2 = liveShowAnchorWidget.LJLLL;
        if (dialogC76540U2e2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/show/anchor/LiveShowDescriptionDialog", "show", dialogC76540U2e2, new Object[0], "void", new C65300Pk0(false, "()V", "-5134989465411479383")).LIZ) {
            dialogC76540U2e2.show();
        }
        DialogC76540U2e dialogC76540U2e3 = liveShowAnchorWidget.LJLLL;
        if (dialogC76540U2e3 == null) {
            return;
        }
        dialogC76540U2e3.setOnDismissListener(new IDDListenerS152S0100000_13(liveShowAnchorWidget, 22));
    }

    public U37(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }

    @Override // X.InterfaceC76536U2a
    public final void LIZ(long j) {
        AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> finishGuest;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
            finishShowingGuestParams.roomId = liveShowAnchorViewModel.LJLJL;
            finishShowingGuestParams.channelId = liveShowAnchorViewModel.LJJLI();
            finishShowingGuestParams.showId = BaseLiveShowViewModel.ov0();
            finishShowingGuestParams.targetUserId = j;
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (finishGuest = LIZ.finishGuest(finishShowingGuestParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(finishGuest).LJJII(new AfS65S0100000_13(liveShowAnchorViewModel, 220), C75440TjA.LJLIL);
                C73318Sq2 cb = liveShowAnchorViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }

    @Override // X.InterfaceC76536U2a
    public final void LIZJ(long j) {
        AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            ShowAgainGuestParams showAgainGuestParams = new ShowAgainGuestParams();
            showAgainGuestParams.roomId = liveShowAnchorViewModel.LJLJL;
            showAgainGuestParams.channelId = liveShowAnchorViewModel.LJJLI();
            showAgainGuestParams.showId = BaseLiveShowViewModel.ov0();
            showAgainGuestParams.targetUserId = j;
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (showAgainGuest = LIZ.showAgainGuest(showAgainGuestParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(showAgainGuest).LJJII(new AfS8S0100100_13(j, liveShowAnchorViewModel, 25), U3M.LJLIL);
                C73318Sq2 cb = liveShowAnchorViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }

    @Override // X.InterfaceC76536U2a
    public final void LIZLLL(List<CreateShowParams.ListUser> list) {
        String str;
        MutableLiveData<ShowConfig> mutableLiveData;
        long j;
        boolean z;
        Long l;
        Boolean bool;
        AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow;
        LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
        BaseLiveShowViewModel baseLiveShowViewModel = liveShowAnchorWidget.LJLILLLLZI;
        ShowConfig showConfig = null;
        boolean z2 = false;
        long j2 = 300;
        if (baseLiveShowViewModel != null) {
            U3G u3g = new U3G(liveShowAnchorWidget);
            CreateShowParams createShowParams = new CreateShowParams();
            createShowParams.roomId = baseLiveShowViewModel.LJLJL;
            createShowParams.channelId = baseLiveShowViewModel.LJJLI();
            createShowParams.showUsers = list;
            ShowConfig showConfig2 = new ShowConfig();
            ShowConfig value = baseLiveShowViewModel.LJLJJI.getValue();
            if (value != null) {
                j = value.durationPerGuest;
            } else {
                j = 300;
            }
            showConfig2.durationPerGuest = j;
            ShowConfig value2 = baseLiveShowViewModel.LJLJJI.getValue();
            if (value2 != null) {
                z = value2.allowOpenMicFreely;
            } else {
                z = false;
            }
            showConfig2.allowOpenMicFreely = z;
            createShowParams.showConfig = showConfig2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startLiveShow, showConfig: ");
            ShowConfig showConfig3 = createShowParams.showConfig;
            if (showConfig3 != null) {
                l = Long.valueOf(showConfig3.durationPerGuest);
            } else {
                l = null;
            }
            LIZ.append(l);
            LIZ.append(", ");
            ShowConfig showConfig4 = createShowParams.showConfig;
            if (showConfig4 != null) {
                bool = Boolean.valueOf(showConfig4.allowOpenMicFreely);
            } else {
                bool = null;
            }
            LIZ.append(bool);
            C0NB.LIZIZ("LiveShowAnchorViewModel", X1D.LIZIZ(LIZ));
            U35 LIZ2 = TQA.LIZ();
            if (LIZ2 != null && (createShow = LIZ2.createShow(createShowParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(createShow).LJJII(new AfS65S0100000_13(u3g, 222), new AfS65S0100000_13(u3g, 223));
                C73318Sq2 cb = baseLiveShowViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
        BaseLiveShowViewModel baseLiveShowViewModel2 = this.LIZ.LJLILLLLZI;
        if (baseLiveShowViewModel2 != null && (mutableLiveData = baseLiveShowViewModel2.LJLJJI) != null) {
            showConfig = mutableLiveData.getValue();
        }
        if (showConfig != null) {
            j2 = showConfig.durationPerGuest;
            z2 = showConfig.allowOpenMicFreely;
        }
        java.util.Map LIZ3 = C76548U2m.LIZ();
        LIZ3.put("show_duration_per_guest", String.valueOf(j2));
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_guest_mic_open", str);
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_start_click", LIZ3);
    }

    @Override // X.InterfaceC76536U2a
    public final void LJFF(long j, long j2, long j3) {
        AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
            updateShowContentParams.roomId = liveShowAnchorViewModel.LJLJL;
            updateShowContentParams.channelId = liveShowAnchorViewModel.LJJLI();
            updateShowContentParams.showId = BaseLiveShowViewModel.ov0();
            updateShowContentParams.targetUserId = j;
            updateShowContentParams.preUserId = j2;
            updateShowContentParams.nextUserId = j3;
            updateShowContentParams.updateType = 2;
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (updateShowContent = LIZ.updateShowContent(updateShowContentParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(updateShowContent).LJJII(new AfS65S0100000_13(liveShowAnchorViewModel, 224), U3O.LJLIL);
                C73318Sq2 cb = liveShowAnchorViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }
}

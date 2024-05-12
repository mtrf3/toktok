package X;

import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.toolbar.BroadcastToolbarLoadEvent;
import com.bytedance.android.live.toolbar.BroadcastToolbarUnloadEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesSheet;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BYm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28968BYm implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final void LIZ() {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        if (C44384HbQ.LJJIJ()) {
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                SheetOptions sheetOptions = new SheetOptions();
                sheetOptions.LIZIZ(0);
                sheetOptions.draggable = false;
                C32044Chs.LJIIIZ(fragmentManager2, LiveInteractionFeaturesSheet.class, "LiveToolbarInteractionSheet", sheetOptions, null);
                return;
            }
            return;
        }
        InteractionFeaturesDialog interactionFeaturesDialog = new InteractionFeaturesDialog();
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null) {
            return;
        }
        C1XY.LJJIIJZLJL(interactionFeaturesDialog, fragmentManager, "ToolbarInteractionFeatureBehavior");
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Ea(boolean z) {
        if (z) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_interaction_red_dot_show");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String str;
        o.LJIIIZ(v, "v");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLILLLLZI < 500) {
            return;
        }
        this.LJLILLLLZI = uptimeMillis;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_interaction_entrance_click");
        LIZ.LJIILLIIL(this.LJLIL);
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.INTERACTION_FEATURES;
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(enumC30204BtI.isRedDotShowing(this.LJLIL))) ? 1 : 0), "has_red_dot");
        if (this.LJLJI) {
            str = "more";
        } else {
            str = "toolbar";
        }
        LIZ.LJIJJ(str, "position");
        LIZ.LJJIIJZLJL();
        if (C29306Beo.LJJII(this.LJLIL) && C78540Us4.LJJIII()) {
            Boolean LIZJ = InterfaceC30442Bx8.u3.LIZJ();
            o.LJIIIIZZ(LIZJ, "TRY_MODE_INTERACTION_WEBP_SHOW.value");
            if (LIZJ.booleanValue()) {
                FragmentManager LJFF = C29306Beo.LJFF(this.LJLIL);
                if (LJFF == null) {
                    return;
                }
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createTryModeEducationDialogFragment("interact", new ACListenerS25S0100000_5(this, 11)).show(LJFF, "try_mode_interaction_education_sheet");
                return;
            }
        }
        LIZ();
        if (this.LJLJI) {
            return;
        }
        enumC30204BtI.hideRedDot(this.LJLIL);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.qv0(BroadcastToolbarUnloadEvent.class, EnumC30204BtI.INTERACTION_FEATURES);
            dataChannel.pv0(RefreshMoreRedDotEvent.class);
            dataChannel.jv0(this);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        RoomAuthStatus roomAuthStatus;
        String str;
        long j;
        this.LJLIL = dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(ShowInteractionFeatureDialogEvent.class, this, new AqS171S0100000_5(this, 25));
            dataChannel.qv0(BroadcastToolbarLoadEvent.class, EnumC30204BtI.INTERACTION_FEATURES);
        }
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
        boolean z2 = false;
        if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJI = z;
        if (z) {
            LiveIconView liveIconView = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
            if (liveIconView != null) {
                liveIconView.setIcon(R.drawable.d5n);
            }
        } else {
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
            if (LJJIJLIJ != null && (roomAuthStatus = LJJIJLIJ.getRoomAuthStatus()) != null && roomAuthStatus.pictionarybubble == 1) {
                Boolean LIZJ = InterfaceC30442Bx8.LJJJJL.LIZJ();
                o.LJIIIIZZ(LIZJ, "SHOW_DRAW_GUESS_GUIDE_BUBBLE.value");
                if (LIZJ.booleanValue()) {
                    C1YG c1yg = new C1YG(interfaceC30237Btp.LJFF());
                    c1yg.LIZ(R.string.ksn);
                    c1yg.LJIIL = C28972BYq.LJLIL;
                    C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_DRAW_GUESS);
                }
            }
            if (C1DH.LJJIIJ(dataChannel)) {
                View LJFF = interfaceC30237Btp.LJFF();
                o.LJIIIIZZ(LJFF, "view.anchorView");
                C28969BYn.LIZIZ(LJFF, dataChannel, new AqS155S0100000_5(dataChannel, 16));
            }
            Boolean LIZJ2 = InterfaceC30442Bx8.LJJJJJ.LIZJ();
            o.LJIIIIZZ(LIZJ2, "SHOW_POLL_GUIDE_BUBBLE.value");
            if (LIZJ2.booleanValue() && LivePollSetting.INSTANCE.enable(dataChannel)) {
                View LJFF2 = interfaceC30237Btp.LJFF();
                o.LJIIIIZZ(LJFF2, "view.anchorView");
                C09 tooltipType = C09.ANCHOR_POLL;
                final C28967BYl c28967BYl = new C28967BYl(this);
                o.LJIIIZ(tooltipType, "tooltipType");
                C1YG c1yg2 = new C1YG(LJFF2);
                c1yg2.LIZ(R.string.no_);
                c1yg2.LJIIL = new InterfaceC19890qH() { // from class: X.BYt
                    @Override // X.InterfaceC19890qH
                    public final /* synthetic */ void onShow() {
                        c28967BYl.invoke();
                    }
                };
                C30770C5u.LIZLLL(new C1YH(c1yg2), tooltipType);
            }
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.INTERACTION_FEATURES;
        if (BV1.LIZ > 0) {
            z2 = true;
        }
        enumC30204BtI.setRedDotVisible(dataChannel, z2);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_interaction_entrance_show");
        LIZ.LJIILLIIL(this.LJLIL);
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(enumC30204BtI.isRedDotShowing(this.LJLIL))) ? 1 : 0), "has_red_dot");
        if (this.LJLJI) {
            str = "more";
        } else {
            str = "toolbar";
        }
        LIZ.LJIJJ(str, "position");
        LIZ.LJJIIJZLJL();
        if (!this.LJLJJI) {
            if (dataChannel != null) {
                PollApi pollApi = (PollApi) C1A.LIZJ(PollApi.class);
                Long l = (Long) dataChannel.kv0(BCN.class);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                C1EW.LIZ(pollApi.getPollHistory(j)).LJJJLIIL(new AfS57S0100000_5(dataChannel, 308), new InterfaceC64592gB() { // from class: X.9Dc
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
            }
            this.LJLJJI = true;
        }
    }
}

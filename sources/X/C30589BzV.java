package X;

import Y.ARunnableS41S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BzV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30589BzV implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public Room LJLILLLLZI;
    public C29701Eo LJLJI;
    public C29701Eo LJLJJI;
    public DataChannel LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

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
    public final /* synthetic */ boolean ud() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onShow() {
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            C30588BzU.LJFF(this.LJLILLLLZI, dataChannel);
        }
    }

    public C30589BzV(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        String str;
        String str2;
        String str3;
        BriefGameTask briefGameTask;
        PartnershipTask partnershipTask;
        String str4;
        LiveMode liveMode;
        if (view != null && (context = view.getContext()) != null) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).QC();
            OSZ[] oszArr = new OSZ[13];
            if (C28835BTj.LIZLLL(this.LJLJJL)) {
                str = "ad";
            } else {
                str = "normal";
            }
            oszArr[0] = new OSZ("live_traffic_source", str);
            String str5 = CardStruct.IStatusCode.DEFAULT;
            oszArr[1] = new OSZ("is_host", CardStruct.IStatusCode.DEFAULT);
            Room room = this.LJLILLLLZI;
            Long l = null;
            if (room != null) {
                str2 = room.getRequestId();
            } else {
                str2 = null;
            }
            oszArr[2] = new OSZ("request_id", String.valueOf(str2));
            oszArr[3] = new OSZ("action_type", BJM.LIZLLL());
            oszArr[4] = new OSZ("enter_method", BJM.LJIIIIZZ());
            oszArr[5] = new OSZ("enter_from_merge", BJM.LJFF());
            Room room2 = this.LJLILLLLZI;
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            }
            oszArr[6] = new OSZ("content_id", String.valueOf(l));
            oszArr[7] = new OSZ("host_id", String.valueOf(BJM.LJ()));
            oszArr[8] = new OSZ("is_landscape", "1");
            oszArr[9] = new OSZ("page_from", "icon");
            if (this.LJLJJLL) {
                str5 = "1";
            }
            oszArr[10] = new OSZ("is_pin", str5);
            DataChannel dataChannel = this.LJLJJL;
            String str6 = "";
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) == null) {
                str3 = "";
            } else {
                str3 = C28509BGv.LIZ(liveMode);
            }
            oszArr[11] = new OSZ("live_type", str3);
            DataChannel dataChannel2 = this.LJLJJL;
            if (dataChannel2 != null && (briefGameTask = (BriefGameTask) dataChannel2.kv0(C30591BzX.class)) != null && (partnershipTask = briefGameTask.task) != null && (str4 = partnershipTask.idStr) != null) {
                str6 = str4;
            }
            oszArr[12] = new OSZ("task_id", str6);
            C24160xA.LIZ(context, C113554cx.LJJL(oszArr), true);
            DataChannel dataChannel3 = this.LJLJJL;
            if (dataChannel3 != null) {
                C30588BzU.LJ(dataChannel3, true);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C30892CAm Yd0;
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo2 = this.LJLJJI;
        if (c29701Eo2 != null) {
            c29701Eo2.removeAllAnimatorListeners();
        }
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        Room room;
        interfaceC30237Btp.setVisibility(8);
        C30326BvG.LIZLLL(new ARunnableS41S0100000_5(interfaceC30237Btp, 265), dataChannel);
        this.LJLJJL = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLILLLLZI = room;
        this.LJLJI = (C29701Eo) interfaceC30237Btp.LIZ(R.id.cxi);
        this.LJLJJI = (C29701Eo) interfaceC30237Btp.LIZ(R.id.cxh);
        View LIZ = interfaceC30237Btp.LIZ(R.id.ld4);
        if (LIZ != null) {
            LIZ.setVisibility(4);
        }
        C15490jB.LJIIJ(this.LJLJI, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_show_lottie.zip", false);
        C15490jB.LJIIJ(this.LJLJJI, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_hide_lottie.zip", false);
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLIL, GamePartnershipEntranceHide.class, new AqS136S0200000_5(interfaceC30237Btp, dataChannel, 37));
            dataChannel.lv0(this.LJLIL, PartnershipPromoteGameCardShowChannel.class, new AqS171S0100000_5(this, 702));
        }
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            c29701Eo.addAnimatorListener(new IDAListenerS74S0100000_5(this, 22));
        }
        C29701Eo c29701Eo2 = this.LJLJJI;
        if (c29701Eo2 != null) {
            c29701Eo2.addAnimatorListener(new IDAListenerS74S0100000_5(this, 23));
        }
    }
}

package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34971Yv implements InterfaceViewOnClickListenerC30227Btf {
    public Room LJLIL;
    public DataChannel LJLILLLLZI;
    public InterfaceC30237Btp LJLJI;
    public long LJLJJL;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final C34961Yu LJLJJLL = new InterfaceC72822Si2() { // from class: X.1Yu
        @Override // X.InterfaceC72822Si2
        public final void onReceiveJsEvent(C199097rd c199097rd) {
            InterfaceC78280Uns interfaceC78280Uns;
            InterfaceC78505UrV interfaceC78505UrV;
            InterfaceC30237Btp interfaceC30237Btp;
            Context context;
            java.util.Map<String, Object> map;
            if (o.LJ(c199097rd.LJLIL, "gamePartnershipFirstHideTask") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && (interfaceC78505UrV = interfaceC78280Uns.get("isFromApp")) != null && interfaceC78505UrV.asInt() == 0 && (interfaceC30237Btp = C34971Yv.this.LJLJI) != null && (context = interfaceC30237Btp.getContext()) != null) {
                ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    map = interfaceC78280Uns2.LIZIZ();
                } else {
                    map = null;
                }
                C24150x9.LJIIIIZZ(context, map);
            }
        }
    };

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    public final java.util.Map<String, String> LIZ() {
        String str;
        LiveMode liveMode;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("btn_name", "icon");
        oszArr[1] = new OSZ("user_type", "host");
        oszArr[2] = new OSZ("user_id", C0DC.LIZ());
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = "";
        }
        oszArr[3] = new OSZ("live_type", str);
        oszArr[4] = new OSZ("page_name", "live_detail");
        return C113554cx.LJJL(oszArr);
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        String str;
        Long l;
        String str2;
        LiveMode liveMode;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJJL < 500) {
            return;
        }
        this.LJLJJL = uptimeMillis;
        if (view != null && (context = view.getContext()) != null) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
            Context LLLLL = C16880lQ.LLLLL(context);
            o.LJIIIIZZ(LLLLL, "context.applicationContext");
            OSZ[] oszArr = new OSZ[5];
            if (C28835BTj.LIZLLL(this.LJLILLLLZI)) {
                str = "ad";
            } else {
                str = "normal";
            }
            oszArr[0] = new OSZ("live_traffic_source", str);
            oszArr[1] = new OSZ("is_host", "1");
            Room room = this.LJLIL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            oszArr[2] = new OSZ("content_id", String.valueOf(l));
            oszArr[3] = new OSZ("is_landscape", CardStruct.IStatusCode.DEFAULT);
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
                str2 = C28509BGv.LIZ(liveMode);
            } else {
                str2 = "";
            }
            oszArr[4] = new OSZ("live_type", str2);
            C24150x9.LJI(LLLLL, C113554cx.LJJL(oszArr));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJJIFFI(LIZ());
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.jv0(this);
        this.LJLJJI.LIZLLL();
        C72818Shy.LJII("gamePartnershipFirstHideTask", this.LJLJJLL);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLILLLLZI = dataChannel;
        this.LJLIL = (Room) dataChannel.kv0(RoomChannel.class);
        dataChannel.kv0(BCX.class);
        this.LJLJI = interfaceC30237Btp;
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIFFI(LIZ());
        LIZ.LJJIIJZLJL();
        dataChannel.lv0(dataChannel.LJLJJI, GamePartnershipEntranceHide.class, new IDqS172S0200000(interfaceC30237Btp, dataChannel, 74));
        C72818Shy.LIZLLL("gamePartnershipFirstHideTask", this.LJLJJLL);
    }
}

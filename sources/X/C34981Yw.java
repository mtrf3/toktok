package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34981Yw implements InterfaceViewOnClickListenerC30227Btf {
    public static String LJLJLLL = "";
    public Room LJLIL;
    public DataChannel LJLILLLLZI;
    public InterfaceC30237Btp LJLJI;
    public long LJLJJI;
    public C34991Yx LJLJJLL;
    public boolean LJLJLJ;
    public String LJLJJL = "normal";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new IDqS420S0100000(this, 158));

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
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final java.util.Map<String, String> LIZ() {
        String str;
        Long l;
        Object obj;
        String str2;
        LiveMode liveMode;
        OSZ[] oszArr = new OSZ[10];
        if (C28835BTj.LIZLLL(this.LJLILLLLZI)) {
            str = "ad";
        } else {
            str = "normal";
        }
        oszArr[0] = new OSZ("live_traffic_source", str);
        String str3 = "1";
        oszArr[1] = new OSZ("is_host", "1");
        oszArr[2] = new OSZ("icon_type", this.LJLJJL);
        oszArr[3] = new OSZ("entrance_page", "live_room");
        Room room = this.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        oszArr[4] = new OSZ("content_id", String.valueOf(l));
        oszArr[5] = new OSZ("is_landscape", CardStruct.IStatusCode.DEFAULT);
        oszArr[6] = new OSZ("drops_id", LJLJLLL);
        if (EnumC30204BtI.ANCHOR_PARTNERSHIP_DROPS.isRedDotShowing(this.LJLILLLLZI)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[7] = new OSZ("is_red_dot", obj);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = "";
        }
        oszArr[8] = new OSZ("live_type", str2);
        Boolean LIZJ = InterfaceC30442Bx8.LLF.LIZJ();
        o.LJIIIIZZ(LIZJ, "ANCHOR_COMMENTS_ENABLE.value");
        if (!LIZJ.booleanValue()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[9] = new OSZ("allow_comments", str3);
        return C113554cx.LJJL(oszArr);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        OSZ osz;
        String str2;
        String str3;
        OSZ osz2;
        if (LJLJLLL.length() == 0) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel == null || (osz2 = (OSZ) dataChannel.kv0(BD3.class)) == null || (str3 = (String) osz2.getFirst()) == null) {
                str3 = "";
            }
            LJLJLLL = str3;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJJI < 500) {
            return;
        }
        this.LJLJJI = uptimeMillis;
        DataChannel dataChannel2 = this.LJLILLLLZI;
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.ANCHOR_PARTNERSHIP_DROPS;
        if (!enumC30204BtI.isRedDotShowing(dataChannel2)) {
            str = "normal";
        } else {
            str = "red_dot";
        }
        C30588BzU.LIZJ(dataChannel2, "live_room", str);
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
                if (!o.LJ(InterfaceC30442Bx8.LJJLIIIJJI.LIZ(), Boolean.TRUE)) {
                    Context LLLLL = C16880lQ.LLLLL(context);
                    o.LJIIIIZZ(LLLLL, "context.applicationContext");
                    C24150x9.LIZJ(LLLLL, LIZ());
                } else {
                    DataChannel dataChannel3 = this.LJLILLLLZI;
                    if (dataChannel3 != null && (osz = (OSZ) dataChannel3.kv0(BD3.class)) != null && (str2 = (String) osz.getFirst()) != null && str2.length() > 1) {
                        Context LLLLL2 = C16880lQ.LLLLL(context);
                        o.LJIIIIZZ(LLLLL2, "context.applicationContext");
                        C24150x9.LJFF(LLLLL2, LIZ());
                    } else if (((List) this.LJLJL.getValue()).size() > 1) {
                        Context LLLLL3 = C16880lQ.LLLLL(context);
                        o.LJIIIIZZ(LLLLL3, "context.applicationContext");
                        C24150x9.LIZIZ(LLLLL3, LIZ());
                    } else {
                        if (true ^ ((List) this.LJLJL.getValue()).isEmpty()) {
                            LJLJLLL = String.valueOf(((Number) ListProtector.get((List) this.LJLJL.getValue(), 0)).longValue());
                        }
                        Context LLLLL4 = C16880lQ.LLLLL(context);
                        o.LJIIIIZZ(LLLLL4, "context.applicationContext");
                        C24150x9.LJFF(LLLLL4, LIZ());
                    }
                }
            }
            enumC30204BtI.hideRedDot(this.LJLILLLLZI);
            this.LJLJJL = "normal";
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C34991Yx c34991Yx = this.LJLJJLL;
        if (c34991Yx != null) {
            C72818Shy.LJII("signInPartnershipDropsEvent", c34991Yx);
            C72818Shy.LJII("gameAnchorJoinDrops", c34991Yx);
        }
        LJLJLLL = "";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Yx, X.Si2] */
    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLILLLLZI = dataChannel;
        this.LJLIL = (Room) dataChannel.kv0(RoomChannel.class);
        dataChannel.kv0(BCX.class);
        this.LJLJI = interfaceC30237Btp;
        ?? r1 = new InterfaceC72822Si2() { // from class: X.1Yx
            /* JADX WARN: Type inference failed for: r1v4, types: [X.OSZ, O] */
            @Override // X.InterfaceC72822Si2
            public final void onReceiveJsEvent(C199097rd c199097rd) {
                String str;
                String string;
                String str2 = c199097rd.LJLIL;
                if (o.LJ(str2, "signInPartnershipDropsEvent")) {
                    InterfaceC30442Bx8.LJJLIIIJJI.LIZJ(Boolean.TRUE);
                    return;
                }
                if (!o.LJ(str2, "gameAnchorJoinDrops")) {
                    return;
                }
                C34981Yw c34981Yw = C34981Yw.this;
                try {
                    InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                    String str3 = "";
                    if (interfaceC78280Uns == null || (str = interfaceC78280Uns.getString("drops_id")) == null) {
                        str = "";
                    }
                    C34981Yw.LJLJLLL = str;
                    InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                    if (interfaceC78280Uns2 != null && (string = interfaceC78280Uns2.getString("drops_name")) != null) {
                        str3 = string;
                    }
                    DataChannel dataChannel2 = c34981Yw.LJLILLLLZI;
                    if (dataChannel2 != null) {
                        ((C32536Cpo) dataChannel2.gv0(BD3.class)).LIZ = new OSZ(C34981Yw.LJLJLLL, str3);
                    }
                    InterfaceC30237Btp interfaceC30237Btp2 = c34981Yw.LJLJI;
                    if (interfaceC30237Btp2 != null) {
                        interfaceC30237Btp2.LJ(new IDRunnableS85S0100000(c34981Yw, 97));
                    }
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        };
        this.LJLJJLL = r1;
        C72818Shy.LIZLLL("signInPartnershipDropsEvent", r1);
        C72818Shy.LIZLLL("gameAnchorJoinDrops", r1);
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLIIIJJIZ;
        if (!c48459J0d.LIZJ().booleanValue()) {
            this.LJLJJL = "red_dot";
            EnumC30204BtI.ANCHOR_PARTNERSHIP_DROPS.showRedDot(this.LJLILLLLZI);
            c48459J0d.LIZ(Boolean.TRUE);
        } else {
            this.LJLJJL = "normal";
        }
        C30588BzU.LIZLLL(this.LJLILLLLZI, "live_room", this.LJLJJL);
        InterfaceC30237Btp interfaceC30237Btp2 = this.LJLJI;
        if (interfaceC30237Btp2 != null) {
            interfaceC30237Btp2.LJ(new IDRunnableS85S0100000(this, 97));
        }
    }
}

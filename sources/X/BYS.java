package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYS implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLIL;
    public C16 LJLILLLLZI;
    public long LJLJI;
    public InterfaceC30237Btp LJLJJI;
    public C41081jM LJLJJL;
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
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BEF bef;
        EnumC29605Bjd enumC29605Bjd;
        boolean z;
        Context context;
        ActivityC45651qj LIZIZ;
        FragmentManager fragmentManager;
        Context context2;
        DataChannel dataChannel = this.LJLIL;
        String str = null;
        if (dataChannel != null) {
            bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
        } else {
            bef = null;
        }
        if (bef != null && bef.LJLJJI && (C79146V4k.LJJJI(this.LJLIL) || C29306Beo.LJIIJ(this.LJLIL))) {
            if (C29306Beo.LJIIJ(this.LJLIL)) {
                C30868C9o.LIZJ(R.string.o8j);
            }
            if (C79146V4k.LJJJI(this.LJLIL)) {
                C30868C9o.LIZJ(R.string.o8z);
                return;
            }
            return;
        }
        if (C29232Bdc.LJFF(this.LJLIL)) {
            C30868C9o.LIZJ(R.string.ofb);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJI < 500) {
            return;
        }
        this.LJLJI = uptimeMillis;
        C16 c16 = this.LJLILLLLZI;
        if (c16 != null) {
            enumC29605Bjd = c16.LJIIIZ;
        } else {
            enumC29605Bjd = null;
        }
        if (enumC29605Bjd == EnumC29605Bjd.CUSTOM_POLL) {
            z = true;
        } else {
            z = false;
        }
        if (c16 != null) {
            c16.LJIIIIZZ();
        }
        C04130Ef.LJ(this.LJLIL, "toolbar", z, false, false, null, 248);
        Room LJIILL = C1DH.LJIILL(this.LJLIL);
        if (LJIILL != null && LJIILL.cppVersion == 2 && this.LJLJJLL) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null) {
                return;
            }
            IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
            if (view != null && (context2 = view.getContext()) != null) {
                str = context2.getString(R.string.kpw);
            }
            iBroadcastService.showCppUnlockGuideDialogV2(str, "custom_poll", Boolean.TRUE, fragmentManager);
            return;
        }
        if (view == null || (context = view.getContext()) == null || (LIZIZ = C29306Beo.LIZIZ(context)) == null) {
            return;
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IRoomFunctionService.class);
        o.LJIIIIZZ(LIZ, "getService(IRoomFunctionService::class.java)");
        C06040Lo.LIZ((IRoomFunctionService) LIZ, "toolbar", LIZIZ, this.LJLIL, 24);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        B73.LIZJ(this);
        C16 c16 = this.LJLILLLLZI;
        if (c16 != null) {
            c16.LJIIJ();
        }
        this.LJLJJLL = false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        BEF bef;
        Boolean bool;
        boolean z;
        C41081jM c41081jM;
        Room LJIILL;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        this.LJLJJI = interfaceC30237Btp;
        this.LJLIL = dataChannel;
        C16 c16 = new C16(dataChannel, EnumC30212BtQ.SINGLE, interfaceC30237Btp);
        this.LJLILLLLZI = c16;
        c16.LJIIIZ();
        C04130Ef.LJI(dataChannel, "toolbar", false, false, 60);
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, LiveBanCapabilityChannel.class, new AqS136S0200000_5(dataChannel, this, 3));
            dataChannel.lv0(dataChannel.LJLJJI, AdminPermissionUpdateChannel.class, new AqS136S0200000_5(dataChannel, this, 4));
        }
        LiveMode liveMode = null;
        if (dataChannel != null) {
            bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
        } else {
            bef = null;
        }
        if (bef != null && bef.LJLJJI && (C79146V4k.LJJJI(dataChannel) || C29306Beo.LJIIJ(dataChannel))) {
            InterfaceC30237Btp interfaceC30237Btp2 = this.LJLJJI;
            if (interfaceC30237Btp2 != null) {
                interfaceC30237Btp2.setAlpha(0.34f);
            }
        } else {
            InterfaceC30237Btp interfaceC30237Btp3 = this.LJLJJI;
            if (interfaceC30237Btp3 != null) {
                interfaceC30237Btp3.setAlpha(1.0f);
            }
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null) {
            bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            Room LJIILL2 = C1DH.LJIILL(this.LJLIL);
            if (LJIILL2 != null) {
                liveMode = LJIILL2.getStreamType();
            }
            if (liveMode == LiveMode.SCREEN_RECORD) {
                this.LJLJJL = (C41081jM) interfaceC30237Btp.LIZ(R.id.f1b);
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                    C12530eP c12530eP = EnumC12540eQ.Companion;
                    int i = anchorLevelPermission.poll;
                    c12530eP.getClass();
                    if (C12530eP.LIZ(i) != EnumC12540eQ.ON) {
                        z = false;
                        c41081jM = this.LJLJJL;
                        if (c41081jM == null && !z && (LJIILL = C1DH.LJIILL(dataChannel)) != null && LJIILL.cppVersion == 2) {
                            C15490jB.LIZJ(c41081jM, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"));
                            c41081jM.setVisibility(0);
                            this.LJLJJLL = true;
                            return;
                        }
                        return;
                    }
                }
                z = true;
                c41081jM = this.LJLJJL;
                if (c41081jM == null) {
                }
            }
        }
    }
}

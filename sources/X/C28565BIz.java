package X;

import Y.ARunnableS6S1100000_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.room.RefreshUserInRoomEvent;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.LoginDataChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.QueryUserFailEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BIz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28565BIz implements InterfaceC30144BsK {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;
    public final C73318Sq2 LIZJ;
    public final C28563BIx LIZLLL;

    public final boolean LIZIZ() {
        Object kv0 = this.LIZIZ.kv0(UserIsAnchorChannel.class);
        o.LJI(kv0);
        return ((Boolean) kv0).booleanValue();
    }

    @Override // X.InterfaceC30144BsK
    public final void LIZ(String liveTraceTag) {
        o.LJIIIZ(liveTraceTag, "liveTraceTag");
        if (B83.LIZ().LIZIZ().isLogin()) {
            C30326BvG.LIZIZ(new ARunnableS6S1100000_5(this, liveTraceTag, 0));
        }
    }

    public final void LJ(C29401Dk c29401Dk) {
        int errorCode = c29401Dk.getErrorCode();
        if (errorCode != 30003) {
            if (errorCode != 30005) {
                if (errorCode != 30006) {
                    switch (errorCode) {
                        case 50001:
                            this.LIZIZ.qv0(BanTalkEvent.class, new C28854BUc(true, true));
                            return;
                        case 50002:
                            UPJ.LJFF(10, C73943T0h.LIZ());
                            return;
                        default:
                            return;
                    }
                }
                if (LIZIZ()) {
                    return;
                }
                UPJ.LJFF(20, C73943T0h.LIZ());
                return;
            }
            if (!this.LIZ.isViewValid()) {
                return;
            }
            C77437UaH c77437UaH = new C77437UaH(this.LIZ.mo49getActivity());
            c77437UaH.LJI(R.string.sxq);
            c77437UaH.LIZIZ(R.string.ss2);
            c77437UaH.LJ(R.string.stw, BJ1.LJLIL, false);
            c77437UaH.LJIILL = BJ0.LJLIL;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "5806401568616594149")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        C73943T0h.LIZ().LIZIZ(new C28268B7o(7, 10011));
    }

    public final void LJFF(String str) {
        String str2;
        String str3;
        long j;
        Room room = (Room) this.LIZIZ.kv0(RoomChannel.class);
        if (room == null) {
            return;
        }
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("target_uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        if (interfaceC05190Ih != null) {
            str2 = interfaceC05190Ih.getSecUid();
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("sec_target_uid", str2);
        oszArr[2] = new OSZ("packed_level", "2");
        oszArr[3] = new OSZ("request_from", "admin");
        oszArr[4] = new OSZ("current_room_id", String.valueOf(room.getId()));
        User owner = room.getOwner();
        if (owner == null || (str3 = C278817o.LIZIZ(owner)) == null) {
            str3 = "";
        }
        oszArr[5] = new OSZ("anchor_id", str3);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        User owner2 = room.getOwner();
        if (owner2 != null) {
            j = owner2.getId();
        } else {
            j = 0;
        }
        String LIZJ = ((C29374Bfu) LIZIZ).LIZJ(j);
        if (LIZJ != null) {
            str4 = LIZJ;
        }
        oszArr[6] = new OSZ("sec_anchor_id", str4);
        ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIZILJ(str, C113554cx.LJJJLZIJ(oszArr)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(this.LIZLLL);
    }

    public final void onEvent(BJ5 bj5) {
        this.LIZIZ.rv0(LoginDataChannel.class, bj5);
    }

    public final void LIZLLL(String str, boolean z) {
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Qd0(z);
        User user = (User) this.LIZIZ.kv0(RoomUserChannel.class);
        if (user != null) {
            UserAttr userAttr = user.getUserAttr();
            if (userAttr == null) {
                userAttr = new UserAttr();
                user.setUserAttr(userAttr);
            }
            userAttr.isMuted = z;
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(0, "error_code", jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is ban: ");
            LIZ.append(z);
            C05630Jz.LJI(jSONObject, "error_msg", X1D.LIZIZ(LIZ));
            C0K2.LJIIIIZZ("ttlive_audience_ban_talk", 0, jSONObject);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("memberMsg_");
        LIZ2.append(str);
        LJFF(X1D.LIZIZ(LIZ2));
    }

    public C28565BIz(BaseFragment fragment, DataChannel dataChannel, C73318Sq2 compositeSubscription) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(compositeSubscription, "compositeSubscription");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = compositeSubscription;
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BJ5.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(fragment))).LIZIZ(new AfS57S0100000_5(this, 175));
        dataChannel.lv0(fragment, QueryUserFailEvent.class, new C28564BIy(this));
        dataChannel.mv0(MemberMessageChannel.class, fragment, new BJ2(this));
        dataChannel.lv0(fragment, RefreshUserInRoomEvent.class, new AqS171S0100000_5(this, 506));
        dataChannel.mv0(LoginDataChannel.class, fragment, new AqS171S0100000_5(this, 507));
        this.LIZLLL = new C28563BIx(this);
    }

    public final void LIZJ(String str, Boolean bool, java.util.Map map) {
        if (bool != null && !LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            EnumC30204BtI.SHARE.setRedDotVisible(this.LIZIZ, bool.booleanValue());
        }
        UserAttr LIZ = C05200Ii.LIZ();
        if (LIZ != null) {
            LIZ.adminPermissions = map;
        }
        User user = (User) this.LIZIZ.kv0(RoomUserChannel.class);
        if (user != null) {
            if (user.getUserAttr() == null) {
                user.setUserAttr(new UserAttr());
            }
            if (bool != null) {
                user.getUserAttr().isAdmin = bool.booleanValue();
            }
            user.getUserAttr().adminPermissions = map;
            DataChannel dataChannel = this.LIZIZ;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            dataChannel.rv0(AdminPermissionUpdateChannel.class, map);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("memberMsg_");
        LIZ2.append(str);
        LJFF(X1D.LIZIZ(LIZ2));
    }
}

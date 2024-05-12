package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CjX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32147CjX {
    public static final ConcurrentHashSet<Long> LIZ = new ConcurrentHashSet<>();

    public static boolean LIZ(long j) {
        if (!LiveGiftPanelOpenIntentionSettings.INSTANCE.enable() || j == 0 || !((C29374Bfu) B83.LIZ().LIZIZ()).isLogin() || C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(boolean z, Room room) {
        Boolean bool;
        String str;
        double d;
        User owner;
        IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            bool = Boolean.valueOf(owner.isFollowing());
        } else {
            bool = null;
        }
        InterfaceC22790ux LJFF = C0IT.LJFF();
        String businessName = LiveGiftPanelOpenIntentionSettings.INSTANCE.businessName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", room.getId());
        if (z) {
            str = "open_panel";
        } else {
            str = "leave_room";
        }
        jSONObject.put("enter_from", str);
        jSONObject.put("avaliable_diamonds", ((WalletCenter) walletCenter).LIZ());
        if (o.LJ(bool, Boolean.TRUE)) {
            d = 1.0d;
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        jSONObject.put("follow_status", d);
        ((C29921Fk) LJFF).LIZJ(new C22810uz(businessName, new C22820v0(true, jSONObject), new C109434Rf(), (C35201Zs) null, 24));
    }
}

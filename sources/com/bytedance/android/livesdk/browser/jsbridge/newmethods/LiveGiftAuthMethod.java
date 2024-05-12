package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.C05200Ii;
import X.C29044Baa;
import X.C31153CKn;
import X.C38131Exr;
import X.CN1;
import X.EnumC31154CKo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveGiftAuthMethod extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public JSONObject invoke(JSONObject params, C38131Exr context) {
        Long l;
        Long l2;
        boolean z;
        boolean z2;
        User owner;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        User LIZIZ = C05200Ii.LIZIZ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        RoomAuthStatus roomAuthStatus = null;
        if (LIZIZ != null) {
            l = Long.valueOf(LIZIZ.getId());
        } else {
            l = null;
        }
        if (room != null && (owner = room.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        boolean LJ = o.LJ(l, l2);
        if (room != null) {
            roomAuthStatus = room.getRoomAuthStatus();
        }
        boolean z3 = false;
        if (roomAuthStatus != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C31153CKn.LIZIZ(LJ, z2, z) != EnumC31154CKo.SHOW) {
            z3 = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        jSONObject.put("isDisabledGift", z3);
        return jSONObject;
    }
}

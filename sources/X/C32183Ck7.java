package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ck7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32183Ck7 extends AbstractC38123Exj<JSONObject, Object> {
    public final C73318Sq2 LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        this.LJLIL.dispose();
    }

    public C32183Ck7() {
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLIL = c73318Sq2;
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C32184Ck8.class).LJJJJZI(new AfS57S0100000_5(this, 185)));
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        JSONObject jSONObject2 = jSONObject;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invoke msg = ");
        LIZ.append(jSONObject2);
        C0NB.LIZIZ("InviteCohostMethod", X1D.LIZIZ(LIZ));
        String receiveUid = jSONObject2.optString("receiveUid");
        String receiveSecUid = jSONObject2.optString("receiveSecUid");
        String invitedRoomID = jSONObject2.optString("invitedRoomID");
        String inviteeName = jSONObject2.optString("inviteeName");
        int optInt = jSONObject2.optInt("inviteType");
        JSONArray optJSONArray = jSONObject2.optJSONArray("avatarUrlList");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
            }
        }
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        EnumC75614Tly enumC75614Tly = EnumC75614Tly.ACTIVITY;
        LIZIZ.LJIIIZ(enumC75614Tly);
        B5G.LIZIZ().LJIIJ.setType(optInt);
        B5G.LIZIZ().LJJJ = new C75648TmW("rank");
        C73943T0h LIZ2 = C73943T0h.LIZ();
        o.LJIIIZ(receiveUid, "receiveUid");
        o.LJIIIZ(receiveSecUid, "receiveSecUid");
        o.LJIIIZ(invitedRoomID, "invitedRoomID");
        o.LJIIIZ(inviteeName, "inviteeName");
        LIZ2.LIZIZ(new CMB(new C75749To9(receiveUid, receiveSecUid, invitedRoomID, inviteeName, enumC75614Tly, arrayList, null, null, false, 4032)));
    }
}

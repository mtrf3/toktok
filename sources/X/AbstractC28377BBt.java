package X;

import Y.AfS44S0300000_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.adminsetting.SwitchBatchUpdateRequest;
import com.bytedance.android.live.adminsetting.SwitchValue;
import com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.BBt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28377BBt {
    public static final /* synthetic */ int LIZIZ = 0;
    public HashMap<Integer, Boolean> LIZ = new HashMap<>();

    public abstract long LIZIZ();

    public abstract boolean LIZLLL();

    public HashMap<String, String> LIZ() {
        return new HashMap<>();
    }

    public void LIZJ() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        this.LIZ = hashMap;
        Boolean LIZJ = InterfaceC30442Bx8.X0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_L2_FILTER.value");
        hashMap.put(4, LIZJ);
        HashMap<Integer, Boolean> hashMap2 = this.LIZ;
        Boolean LIZJ2 = InterfaceC30442Bx8.Y0.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_COMMENT_FILTER_SWITCH_COMMUNITY_FLAGGED.value");
        hashMap2.put(8, LIZJ2);
        HashMap<Integer, Boolean> hashMap3 = this.LIZ;
        Boolean LIZJ3 = InterfaceC30442Bx8.Z0.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LIVE_COMMENT_FILTER_SWIT…NITY_FLAGGED_REVIEW.value");
        hashMap3.put(9, LIZJ3);
    }

    public static void LJFF(HashMap hashMap) {
        Object obj = hashMap.get(4);
        if (obj != null) {
            InterfaceC30442Bx8.X0.LIZ(obj);
        }
        Object obj2 = hashMap.get(8);
        if (obj2 != null) {
            InterfaceC30442Bx8.Y0.LIZ(obj2);
        }
        Object obj3 = hashMap.get(9);
        if (obj3 != null) {
            InterfaceC30442Bx8.Z0.LIZ(obj3);
        }
        DataChannelGlobal.LJLJJI.rv0(FilterCommentChangeEvent.class);
    }

    public final void LJ(HashMap<Integer, Boolean> hashMap, InterfaceC116954iR<Boolean> interfaceC116954iR) {
        Object obj;
        String str;
        if (!(this instanceof C28376BBs)) {
            String str2 = "anchor";
            if (hashMap.get(4) != null || hashMap.get(8) != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_select_update");
                LIZ.LJIIZILJ();
                if (LIZLLL()) {
                    obj = "anchor";
                } else {
                    obj = "admin";
                }
                LIZ.LJIJJ(obj, "admin_type");
                Boolean bool = hashMap.get(4);
                Boolean bool2 = Boolean.TRUE;
                LIZ.LJIJJ(Integer.valueOf(o.LJ(bool, bool2) ? 1 : 0), "select_unkind");
                LIZ.LJIJJ(Integer.valueOf(o.LJ(hashMap.get(8), bool2) ? 1 : 0), "select_cf");
                LIZ.LJJIFFI(LIZ());
                LIZ.LJJIIJZLJL();
            }
            if (hashMap.get(9) != null) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_comment_filter_review_during_live");
                LIZ2.LJIIZILJ();
                if (!LIZLLL()) {
                    str2 = "admin";
                }
                LIZ2.LJIJJ(str2, "admin_type");
                if (o.LJ(hashMap.get(9), Boolean.TRUE)) {
                    str = "select";
                } else {
                    str = "deselect";
                }
                LIZ2.LJIJJ(str, "action");
                LIZ2.LJJIIJZLJL();
            }
        }
        if (LIZIZ() == 0) {
            LJFF(hashMap);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Boolean> entry : hashMap.entrySet()) {
            arrayList.add(new SwitchValue(entry.getKey().intValue(), entry.getValue().booleanValue()));
        }
        LJFF(hashMap);
        C1EW.LIZ(((RoomSwitchApi) C1A.LIZJ(RoomSwitchApi.class)).batchUpdateSwitch(new SwitchBatchUpdateRequest(LIZIZ(), arrayList))).LJJJLIIL(new AfS44S0300000_5(hashMap, interfaceC116954iR, this, 8), new AfS57S0100000_5(this, 224));
    }
}

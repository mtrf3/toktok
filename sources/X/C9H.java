package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes6.dex */
public final class C9H {
    public final DataChannel LIZ;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZIZ;
    public OSZ<String, Integer> LJ;
    public boolean LJI;
    public int LJII;
    public final ARunnableS41S0100000_5 LJIIIIZZ;
    public final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public final java.util.Map<String, String> LIZLLL = new LinkedHashMap();
    public final LinkedList<OSZ<Integer, Integer>> LJFF = new LinkedList<>();

    public final void LIZJ() {
        Object next;
        java.util.Map<String, Integer> map = this.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = C5UN.LJJLJLI(linkedHashMap).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                OSZ osz = (OSZ) next;
                osz.getFirst();
                int intValue = ((Number) osz.getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    OSZ osz2 = (OSZ) next2;
                    osz2.getFirst();
                    int intValue2 = ((Number) osz2.getSecond()).intValue();
                    if (intValue > intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        OSZ<String, Integer> osz3 = (OSZ) next;
        this.LJ = osz3;
        if (osz3 != null) {
            int intValue3 = osz3.getSecond().intValue();
            C15610jN.LIZ().removeCallbacks(this.LJIIIIZZ);
            C15610jN.LIZJ(this.LJIIIIZZ, (intValue3 * 1000) - C30725C4b.LIZ());
        }
    }

    public final void LIZIZ(String str) {
        String str2;
        String str3;
        Long l;
        User owner;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_center_icon");
        LIZ.LJIILLIIL(this.LIZ);
        Gson gson = C09650Zl.LIZJ;
        LIZ.LJIJJ(GsonProtectorUtils.toJson(gson, ((LinkedHashMap) this.LIZJ).keySet()), "record_id");
        LIZ.LJIJJ(str, "action_type");
        if (this.LIZJ.isEmpty()) {
            str2 = "normal";
        } else {
            str2 = "restriction";
        }
        LIZ.LJIJJ(str2, "restriction_status");
        LIZ.LJIJJ(Integer.valueOf(this.LIZJ.size()), "restriction_number");
        if (this.LIZJ.isEmpty()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        LIZ.LJIJJ(str3, "is_violation");
        java.util.Map<String, String> map = this.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (this.LIZJ.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ.LJIJJ(GsonProtectorUtils.toJson(gson, linkedHashMap.values()), "violation_type");
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.LIZ);
        if (LJJIJLIJ != null && (owner = LJJIJLIJ.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "violation_anchor_id");
        LIZ.LJJIIJZLJL();
    }

    public C9H(DataChannel dataChannel, C98 c98) {
        String idStr;
        this.LIZ = dataChannel;
        this.LIZIZ = c98;
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        LiveCenterApi liveCenterApi = (LiveCenterApi) LIZ.LIZIZ(LiveCenterApi.class);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        C1EW.LIZ(liveCenterApi.getOverview((LJJIJLIJ == null || (idStr = LJJIJLIJ.getIdStr()) == null) ? "" : idStr, 1, 0)).LJJJLIIL(new AfS57S0100000_5(this, 302), new AfS57S0100000_5(this, 303));
        this.LJIIIIZZ = new ARunnableS41S0100000_5(this, 292);
    }

    public final void LIZ(int i, int i2) {
        OSZ<Integer, Integer> poll;
        LIZIZ("show");
        this.LJFF.add(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)));
        if (this.LJI || (poll = this.LJFF.poll()) == null) {
            return;
        }
        this.LJI = true;
        C15610jN.LIZJ(new ARunnableS24S0200000_5(this, poll, 77), 0L);
    }
}

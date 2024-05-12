package X;

import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.TiS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75396TiS {
    public long LIZ;
    public C73411SrX LIZIZ;
    public C73411SrX LIZJ;
    public C73411SrX LIZLLL;
    public volatile int LJ = -1;
    public final String LJFF;
    public final C62822Ol8 LJI;

    public final void LIZIZ() {
        if (((C0M6) this.LJI.getValue()).LJFF() == 0) {
            return;
        }
        java.util.Map LJII = ((C0M6) this.LJI.getValue()).LJII();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) LJII).entrySet()) {
            long currentTimeMillis = System.currentTimeMillis();
            Object key = entry.getKey();
            o.LJIIIIZZ(key, "it.key");
            if (currentTimeMillis - ((Number) key).longValue() <= 60000) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List networkLevels = ORZ.LLJI(linkedHashMap.values());
        ((C0M6) this.LJI.getValue()).LJIIIIZZ(-1);
        o.LJIIIZ(networkLevels, "networkLevels");
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_guest_netspeed_show")) {
            HashMap LIZLLL = C73098SmU.LIZLLL();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                LIZLLL.put("room_id", idStr);
                LIZLLL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZJ, networkLevels);
            o.LJIIIIZZ(json, "getDefault().toJson(networkLevels)");
            LIZLLL.put("net_speed_level_sequence", json);
            C74824TYe.LJLL("livesdk_guest_netspeed_show", LIZLLL);
        }
        StringBuilder LIZ = X1D.LIZ();
        C12400eC.LIZIZ(LIZ, this.LJFF, "_reportNetworkStates", LIZ, "NetworkStateTips");
    }

    public C75396TiS() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkStateTipsHelper_");
        LIZ.append(hashCode());
        this.LJFF = X1D.LIZIZ(LIZ);
        this.LJI = C221108m2.LIZIZ(C75398TiU.LJLIL);
    }

    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJFF);
        LIZ.append("_clear from = ");
        LIZ.append(str);
        C0NB.LIZIZ("NetworkStateTips", X1D.LIZIZ(LIZ));
        LIZIZ();
        C73411SrX c73411SrX = this.LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LIZLLL = null;
        C73411SrX c73411SrX2 = this.LIZJ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        this.LIZJ = null;
        C73411SrX c73411SrX3 = this.LIZIZ;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        this.LIZIZ = null;
    }
}

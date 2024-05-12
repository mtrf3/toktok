package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateEnlargeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BXU implements InterfaceC41312GJg {
    public DataChannel LIZ;

    @Override // X.InterfaceC41312GJg
    public final int LIZ() {
        Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        if (LIZJ.booleanValue()) {
            return R.string.nky;
        }
        return R.string.oq9;
    }

    @Override // X.InterfaceC41312GJg
    public final void LIZJ() {
        int i;
        Object obj;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_translation_click");
        LIZ.LJIILLIIL(this.LIZ);
        LIZ.LJJIFFI(LJ());
        LIZ.LJJIIJZLJL();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.u0;
        c48459J0d.LIZ(Boolean.valueOf(!c48459J0d.LIZJ().booleanValue()));
        InterfaceC30442Bx8.w0.LIZ(Boolean.TRUE);
        InterfaceC30442Bx8.v0.LIZ(Boolean.FALSE);
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        if (LIZJ.booleanValue()) {
            i = R.string.oq8;
        } else {
            i = R.string.oq4;
        }
        C30868C9o.LIZJ(i);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_translation_update");
        LIZ2.LJIILLIIL(this.LIZ);
        java.util.Map LJ = LJ();
        String str = "on";
        if (!c48459J0d.LIZJ().booleanValue()) {
            obj = "on";
        } else {
            obj = "off";
        }
        HashMap hashMap = (HashMap) LJ;
        hashMap.put("from_status", obj);
        Boolean LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        if (!LIZJ2.booleanValue()) {
            str = "off";
        }
        hashMap.put("to_status", str);
        LIZ2.LJJIFFI(LJ);
        LIZ2.LJJIIJZLJL();
        Boolean LIZJ3 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        if (LIZJ3.booleanValue()) {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_translation_open_show");
            LIZ3.LJIILLIIL(this.LIZ);
            java.util.Map LJ2 = LJ();
            HashMap hashMap2 = (HashMap) LJ2;
            hashMap2.remove("from_status");
            hashMap2.put("status", "success");
            LIZ3.LJJIFFI(LJ2);
            LIZ3.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC41312GJg
    public final boolean LIZLLL() {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_translation_show");
        LIZ.LJIILLIIL(this.LIZ);
        LIZ.LJJIFFI(LJ());
        LIZ.LJJIIJZLJL();
        Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        return LIZJ.booleanValue();
    }

    public final java.util.Map LJ() {
        long j;
        long j2;
        String str;
        Room room;
        User owner;
        Room room2;
        HashMap hashMap = new HashMap();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            j2 = owner.getId();
        } else {
            j2 = 0;
        }
        C43881HKb.LIZJ(j2, hashMap, "anchor_id", "type", "global_default_on");
        Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
        if (LIZJ.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("from_status", str);
        hashMap.put("position", "panel");
        return hashMap;
    }

    @Override // X.InterfaceC41312GJg
    public final boolean LIZIZ() {
        if (LiveAutoTranslateEnlargeSetting.getValue() != 0) {
            return true;
        }
        return false;
    }
}

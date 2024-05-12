package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.CaptionLanguageChannel;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTypeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29294Bec implements InterfaceC41329GJx {
    public DataChannel LIZ;
    public final String LIZIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();

    @Override // X.InterfaceC41329GJx
    public final int LIZ() {
        Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (LIZJ.booleanValue()) {
            return R.string.mfn;
        }
        return R.string.mfo;
    }

    @Override // X.InterfaceC41329GJx
    public final boolean LIZIZ() {
        Room LJJIJLIJ;
        CaptionInfo captionInfo;
        User owner;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel)) == null || (captionInfo = LJJIJLIJ.captionInfo) == null || !captionInfo.open) {
            return false;
        }
        Room LJJIJLIJ2 = C29306Beo.LJJIJLIJ(this.LIZ);
        if (LJJIJLIJ2 != null && (owner = LJJIJLIJ2.getOwner()) != null && owner.getSecret() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC41329GJx
    public final boolean LIZJ() {
        return !InterfaceC30442Bx8.j1.LIZJ().booleanValue();
    }

    @Override // X.InterfaceC41329GJx
    public final boolean LIZLLL() {
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.g1;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (LIZJ.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        LJI("show", str);
        Boolean LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        return LIZJ2.booleanValue();
    }

    @Override // X.InterfaceC41329GJx
    public final void LJ() {
        String str;
        DataChannel dataChannel;
        Long l;
        Boolean LIZJ = InterfaceC30442Bx8.j1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SERVER_CLOSE.value");
        if (LIZJ.booleanValue()) {
            C30868C9o.LIZJ(R.string.kay);
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.g1;
        c48459J0d.LIZ(Boolean.valueOf(!c48459J0d.LIZJ().booleanValue()));
        Boolean LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (!LIZJ2.booleanValue()) {
            str = "off";
        } else {
            str = "on";
        }
        LJI("click", str);
        if (!c48459J0d.LIZJ().booleanValue() && (dataChannel = this.LIZ) != null && (l = (Long) dataChannel.kv0(CaptionStartShowEvent.class)) != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_duration");
                LIZ.LJIILLIIL(this.LIZ);
                java.util.Map<String, String> LJFF = LJFF();
                HashMap hashMap = (HashMap) LJFF;
                hashMap.put("reason", "off");
                hashMap.put("duration", String.valueOf((SystemClock.elapsedRealtime() - longValue) / 1000));
                LIZ.LJJIFFI(LJFF);
                LIZ.LJJIIJZLJL();
                dataChannel.rv0(CaptionStartShowEvent.class, 0L);
            }
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            Boolean LIZJ3 = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ3, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
            dataChannel2.rv0(CaptionStateChangeEvent.class, LIZJ3);
        }
        if (!c48459J0d.LIZJ().booleanValue()) {
            C30868C9o.LIZJ(R.string.mff);
        }
        InterfaceC30442Bx8.i1.LIZ(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Map<String, String> LJFF() {
        long j;
        String str;
        Object obj;
        Object kv0;
        Room room;
        Room room2;
        Room room3;
        User owner;
        HashMap hashMap = new HashMap();
        DataChannel dataChannel = this.LIZ;
        long j2 = 0;
        if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room3.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        hashMap.put("anchor_id", String.valueOf(j));
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            j2 = room2.getId();
        }
        hashMap.put("room_id", String.valueOf(j2));
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null && (room = (Room) dataChannel3.kv0(RoomChannel.class)) != null) {
            str = room.getRequestId();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("request_id", str);
        hashMap.put("app_language", this.LIZIZ);
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 == null || (obj = dataChannel4.kv0(CaptionLanguageChannel.class)) == null) {
            obj = "";
        }
        hashMap.put("caption_language", obj);
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null && (kv0 = dataChannel5.kv0(CaptionTypeChannel.class)) != 0) {
            str2 = kv0;
        }
        hashMap.put("caption_type", str2);
        hashMap.put("device_model", Build.MODEL);
        return hashMap;
    }

    public final void LJI(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_icon_show");
        LIZ.LJIILLIIL(this.LIZ);
        java.util.Map<String, String> LJFF = LJFF();
        HashMap hashMap = (HashMap) LJFF;
        hashMap.put("operation_type", str);
        hashMap.put("caption_status", str2);
        LIZ.LJJIFFI(LJFF);
        LIZ.LJJIIJZLJL();
    }
}

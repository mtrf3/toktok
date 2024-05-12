package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bed, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29295Bed {
    public final DataChannel LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final java.util.Map<String, String> LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", this.LIZIZ);
        hashMap.put("room_id", this.LIZJ);
        hashMap.put("app_language", this.LIZLLL);
        hashMap.put("caption_language", this.LJ);
        hashMap.put("caption_type", this.LJFF);
        hashMap.put("device_model", Build.MODEL);
        return hashMap;
    }

    public final void LIZJ(long j) {
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_show_duration");
        LIZ.LJIILLIIL(this.LIZ);
        java.util.Map<String, String> LIZ2 = LIZ();
        ((HashMap) LIZ2).put("duration", String.valueOf(j));
        LIZ.LJJIFFI(LIZ2);
        LIZ.LJJIIJZLJL();
    }

    public final void LIZIZ(String str, long j, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        long j2;
        Long l = (Long) this.LIZ.kv0(CaptionStartShowEvent.class);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if ((!o.LJ(str, "leave") || j == 0) && (j2 == 0 || z)) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_duration");
        LIZ.LJIILLIIL(this.LIZ);
        java.util.Map<String, String> LIZ2 = LIZ();
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("reason", str);
        long j3 = 1000;
        hashMap.put("duration", String.valueOf((SystemClock.elapsedRealtime() - j2) / j3));
        if (o.LJ(str, "leave")) {
            hashMap.put("duration", String.valueOf((SystemClock.elapsedRealtime() - j) / j3));
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("action_type", BJM.LIZLLL());
        }
        LIZ.LJJIFFI(LIZ2);
        LIZ.LJJIIJZLJL();
        this.LIZ.rv0(CaptionStartShowEvent.class, 0L);
        if (!o.LJ(str, "close") && !o.LJ(str, "leave")) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void LIZLLL(long j, long j2, long j3, long j4) {
        int i;
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_show");
        LIZ.LJIILLIIL(this.LIZ);
        java.util.Map<String, String> LIZ2 = LIZ();
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("caption_time", String.valueOf(j));
        if (j2 == 0) {
            j2 = j;
        }
        hashMap.put("caption_arrive_time", String.valueOf(j2));
        if (j3 != 0) {
            j = j3;
        }
        hashMap.put("caption_show_time", String.valueOf(j));
        if (j3 == -1) {
            i = 0;
        } else {
            i = 1;
        }
        hashMap.put("is_show", String.valueOf(i));
        hashMap.put("message_id", String.valueOf(j4));
        LIZ.LJJIFFI(LIZ2);
        LIZ.LJJIIJZLJL();
    }

    public C29295Bed(DataChannel dataChannel, String anchorId, String roomId, String str, String str2, String str3) {
        o.LJIIIZ(anchorId, "anchorId");
        o.LJIIIZ(roomId, "roomId");
        this.LIZ = dataChannel;
        this.LIZIZ = anchorId;
        this.LIZJ = roomId;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}

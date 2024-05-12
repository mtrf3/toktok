package X;

import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TWs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74786TWs {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C58585Myz.LJLIL);

    public static C74787TWt LIZ(String currUserType) {
        o.LJIIIZ(currUserType, "currUserType");
        return new C74787TWt(currUserType);
    }

    public static void LIZIZ(C74787TWt c74787TWt) {
        long j;
        long j2 = c74787TWt.LIZJ;
        String str = c74787TWt.LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j2);
        LIZ2.append('-');
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C62822Ol8 c62822Ol8 = LIZ;
        Long l = (Long) ((java.util.Map) c62822Ol8.getValue()).get(LIZIZ);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 60000) {
            return;
        }
        ((java.util.Map) c62822Ol8.getValue()).put(LIZIZ, Long.valueOf(currentTimeMillis));
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_anchor_audio_guest_voice_wave_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        BZI LIZ3 = C28787BRn.LIZ("anchor_audio_guest_voice_wave_show");
        LIZ3.LJIJJ(Long.valueOf(c74787TWt.LIZJ), "user_id");
        LIZ3.LJIJJ(c74787TWt.LIZLLL, "user_type");
        LIZ3.LJIJJ(Long.valueOf(c74787TWt.LIZIZ), "to_user_id");
        LIZ3.LJIJJ(c74787TWt.LIZ, "to_user_type");
        LIZ3.LJIJJ(c74787TWt.LJ, "show_position");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
            Long l2 = c74787TWt.LJFF;
            if (l2 != null) {
                LIZ3.LJIJJ(l2, "room_id");
            }
            LIZ3.LJIIZILJ();
            LIZ3.LJJIIJZLJL();
            return;
        }
        LIZ3.LJJIJ();
        LIZ3.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        LIZ3.LJJIIZI();
    }
}

package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.AutoSpeedTestCountEveryDaySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.0RJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RJ {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(long j) {
        float f = 1024;
        return ((((float) j) / f) / f) * 8;
    }

    public static long LIZJ(float f) {
        float f2 = 1024;
        return ((f * f2) * f2) / 8;
    }

    public static void LJ(long j) {
        int i;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLZLL;
        Integer LIZJ = c48459J0d.LIZJ();
        C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.LLLZL;
        Long lastAutoSpeedTestTs = c48459J0d2.LIZJ();
        TimeZone timeZone = TimeZone.getDefault();
        o.LJIIIIZZ(lastAutoSpeedTestTs, "lastAutoSpeedTestTs");
        long longValue = lastAutoSpeedTestTs.longValue();
        o.LJIIIIZZ(timeZone, "timeZone");
        if (C79146V4k.LJJJJL(j, longValue, timeZone)) {
            i = C77339UWx.LIZIZ(LIZJ, 1);
        } else {
            i = 1;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateAutoSpeedTestTriggerCount(). gameLiveAutoSpeedTestTriggerCount=");
            LIZ2.append(i);
            C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", X1D.LIZIZ(LIZ2));
        }
        c48459J0d.LIZ(i);
        c48459J0d2.LIZ(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[EDGE_INSN: B:33:0x009f->B:34:0x009f BREAK  A[LOOP:0: B:12:0x0066->B:28:0x0066], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C31091Jx LIZIZ(long r8, com.bytedance.android.live.broadcast.model.RoomCreateInfo r10) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RJ.LIZIZ(long, com.bytedance.android.live.broadcast.model.RoomCreateInfo):X.1Jx");
    }

    public static boolean LIZLLL(RoomCreateInfo roomCreateInfo, LiveMode liveMode, boolean z, boolean z2) {
        boolean z3;
        PushStreamInfo pushStreamInfo;
        java.util.Map<Long, PushStreamInfo> map = roomCreateInfo.pushStreamInfoMap;
        List<PushStreamInfo.Quality> list = null;
        if (map != null && (pushStreamInfo = map.get(4L)) != null) {
            list = pushStreamInfo.qualityList;
        }
        if (list == null || list.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || list.size() <= 1) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: qualities size <= 1.");
            }
            return false;
        }
        if (z2) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: user permission is recall.");
            }
            return false;
        }
        if (z || roomCreateInfo.blockStatus.isBlock) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: broadcast is blocked.");
            }
            return false;
        }
        java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZI.LIZJ();
        if (LIZJ == null || LIZJ.isEmpty()) {
            if (roomCreateInfo.mLastRoomId == 0) {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: broadcast had not start live once.");
                }
                return false;
            }
            if (liveMode != LiveMode.SCREEN_RECORD) {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason:  room mode is not mobile game.");
                }
                return false;
            }
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLZLL;
            Integer gameLiveAutoSpeedTestTriggerCount = c48459J0d.LIZJ();
            Long lastAutoSpeedTestTs = InterfaceC30442Bx8.LLLZL.LIZJ();
            TimeZone timeZone = TimeZone.getDefault();
            long currentTimeMillis = System.currentTimeMillis();
            o.LJIIIIZZ(lastAutoSpeedTestTs, "lastAutoSpeedTestTs");
            long longValue = lastAutoSpeedTestTs.longValue();
            o.LJIIIIZZ(timeZone, "timeZone");
            if (!C79146V4k.LJJJJL(currentTimeMillis, longValue, timeZone)) {
                gameLiveAutoSpeedTestTriggerCount = 0;
            }
            c48459J0d.LIZ(gameLiveAutoSpeedTestTriggerCount);
            int value = AutoSpeedTestCountEveryDaySetting.INSTANCE.getValue();
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("shouldAutoSpeedDetection(). today trigger auto speed count=");
                LIZ2.append(gameLiveAutoSpeedTestTriggerCount);
                LIZ2.append(", triggerCountThreshold=");
                LIZ2.append(value);
                C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", X1D.LIZIZ(LIZ2));
            }
            o.LJIIIIZZ(gameLiveAutoSpeedTestTriggerCount, "gameLiveAutoSpeedTestTriggerCount");
            if (gameLiveAutoSpeedTestTriggerCount.intValue() >= value) {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("cannot start auto speed detection, reason: auto speed detection time is beyond ");
                    LIZ3.append(value);
                    LIZ3.append(" today.");
                    C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", X1D.LIZIZ(LIZ3));
                }
                return false;
            }
            C15380j0.LIZLLL();
            if (C2NU.LIZ.LIZIZ()) {
                return true;
            }
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: network is not available.");
            }
            return false;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("SpeedDetectorBusinessCommonFunction", "cannot start auto speed detection, reason: broadcast had manually selected.");
        }
        return false;
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120864ok {
    public static final long LIZ = C152345yQ.LIZ() * 1000;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        if (LJ.getDuration() <= LIZ) {
            return;
        }
        Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack = (NLETrack) LIZJ.next();
            Iterator<NLETrackSlot> it = nLETrack.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                long endTime = next.getEndTime();
                long j = LIZ;
                if (endTime > j) {
                    next.setExtra("starttime_before_exceed_limit_cut", String.valueOf(next.getStartTime()));
                    next.setExtra("endtime_before_exceed_limit_cut", String.valueOf(next.getEndTime()));
                    if (nLETrack.LJIIZILJ() == EnumC123864ta.STICKER) {
                        if (next.getStartTime() < j) {
                            next.setEndTime(j);
                        } else {
                            next.setEndTime(0L);
                            next.setEnable(false);
                        }
                    } else if (next.getStartTime() < j) {
                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(next.LJI());
                        if (LIZLLL != null) {
                            next.setExtra("clip_endtime_before_exceed_limit_cut", String.valueOf(LIZLLL.LJIIL()));
                            LIZLLL.LJIJJ((LIZLLL.getSpeed() * ((float) (j - next.getStartTime()))) + ((float) LIZLLL.LJIILIIL()));
                            next.setEndTime(j);
                        }
                    } else {
                        next.setEndTime(0L);
                        next.setEnable(false);
                    }
                }
            }
        }
        LJ.setExtra("cut_by_time_limit", "true");
        nleEditor.LIZIZ();
        nleEditor.LIZJ();
    }

    public static void LIZJ(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        if (LJ.getDuration() != LIZ || !LJ.hasExtra("cut_by_time_limit")) {
            return;
        }
        Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack = (NLETrack) LIZJ.next();
            Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot slot = it.next();
                if (nLETrack.LJIIZILJ() != EnumC123864ta.STICKER) {
                    o.LJIIIIZZ(slot, "slot");
                    Long LIZIZ2 = LIZIZ(slot, "clip_endtime_before_exceed_limit_cut");
                    if (LIZIZ2 != null) {
                        NLESegmentAudio.LIZLLL(slot.LJI()).LJIJJ(LIZIZ2.longValue());
                        slot.removeExtraWithKey("clip_endtime_before_exceed_limit_cut");
                    }
                }
                o.LJIIIIZZ(slot, "slot");
                Long LIZIZ3 = LIZIZ(slot, "starttime_before_exceed_limit_cut");
                if (LIZIZ3 != null) {
                    slot.setStartTime(LIZIZ3.longValue());
                    slot.removeExtraWithKey("starttime_before_exceed_limit_cut");
                }
                Long LIZIZ4 = LIZIZ(slot, "endtime_before_exceed_limit_cut");
                if (LIZIZ4 != null) {
                    long longValue = LIZIZ4.longValue();
                    if (slot.getEndTime() == 0) {
                        slot.setEnable(true);
                    }
                    slot.setEndTime(longValue);
                    slot.removeExtraWithKey("endtime_before_exceed_limit_cut");
                }
            }
        }
        LJ.removeExtraWithKey("cut_by_time_limit");
        nleEditor.LIZIZ();
    }

    public static Long LIZIZ(NLETrackSlot nLETrackSlot, String str) {
        if (!nLETrackSlot.hasExtra(str)) {
            return null;
        }
        String extra = nLETrackSlot.getExtra(str);
        o.LJIIIIZZ(extra, "getExtra(key)");
        return Long.valueOf(CastLongProtector.parseLong(extra));
    }
}

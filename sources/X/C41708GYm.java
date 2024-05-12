package X;

import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.GYm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41708GYm {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(OSZ screenSize, OSZ osz) {
        o.LJIIIZ(screenSize, "screenSize");
        if (osz == null) {
            return screenSize;
        }
        float floatValue = ((Number) screenSize.getFirst()).floatValue() / ((Number) screenSize.getSecond()).intValue();
        float floatValue2 = ((Number) osz.getFirst()).floatValue() / ((Number) osz.getSecond()).intValue();
        if (floatValue2 > floatValue) {
            return new OSZ(screenSize.getFirst(), Integer.valueOf((int) (((Number) screenSize.getFirst()).floatValue() / floatValue2)));
        }
        return new OSZ(Integer.valueOf((int) (((Number) screenSize.getSecond()).floatValue() * floatValue2)), screenSize.getSecond());
    }

    public static CanvasExtra LIZIZ(C41702GYg c41702GYg, int i) {
        OSZ osz;
        String str = null;
        if (c41702GYg.LIZIZ.getVideo().getSourceWidth() == 0 || c41702GYg.LIZIZ.getVideo().getSourceHeight() == 0) {
            osz = null;
        } else {
            osz = new OSZ(Integer.valueOf(c41702GYg.LIZIZ.getVideo().getSourceWidth()), Integer.valueOf(c41702GYg.LIZIZ.getVideo().getSourceHeight()));
        }
        OSZ LIZ2 = LIZ(c41702GYg.LJFF, osz);
        int intValue = ((Number) LIZ2.getFirst()).intValue();
        int intValue2 = ((Number) LIZ2.getSecond()).intValue();
        int sourceDuration = c41702GYg.LIZIZ.getVideo().getSourceDuration();
        CanvasGestureConfig canvasGestureConfig = new CanvasGestureConfig(false, false, false, false, 1, true, 7, null);
        String sourceMeta = c41702GYg.LIZIZ.getVideo().getSourceMeta();
        int awemeType = c41702GYg.LIZIZ.getAwemeType();
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            str = LJ.getUid();
        }
        return new CanvasExtra(0, intValue, intValue2, sourceDuration, 0.4f, 0.8f, true, canvasGestureConfig, new ForwardCanvasExtra(i, sourceMeta, awemeType, o.LJ(str, c41702GYg.LIZIZ.getAuthor().getUid()), c41702GYg.LIZJ.getVideoShareInfoStruct(), c41702GYg.LIZIZ.getForwardMusic(), c41702GYg.LIZIZ.getTargetVolumeLoud(), c41702GYg.LIZIZ.getVideo(), c41702GYg.LJII), c41702GYg.LIZLLL.LIZJ, 0.0f, 0L, 0, 7169, null);
    }

    public static CanvasFilterParam LIZJ(C163166am c163166am, float f, float f2, float f3) {
        CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
        canvasFilterParam.setClipIndex(0);
        canvasFilterParam.setBorderColor(-1);
        canvasFilterParam.setBorderWidthPx(0);
        canvasFilterParam.setScaleFactor(f3);
        canvasFilterParam.setTransX(f);
        canvasFilterParam.setTransY(f2);
        if (c163166am != null) {
            canvasFilterParam.setAnimPath(c163166am.LIZIZ);
            canvasFilterParam.setAnimJsonParam(c163166am.LIZJ);
            canvasFilterParam.setEffectId(c163166am.LIZ);
        }
        canvasFilterParam.setAnimStartTime(0);
        canvasFilterParam.setAnimEndTime(Integer.MAX_VALUE);
        canvasFilterParam.setNickNameStyle(C2311395h.LIZ());
        return canvasFilterParam;
    }
}

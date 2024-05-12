package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C188727au;
import X.C221108m2;
import X.C38987FRv;
import X.C38995FSd;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C77275UUl;
import X.EB0;
import X.EB1;
import X.EB2;
import X.EB3;
import X.EnumC36001EAz;
import X.EnumC59921NfR;
import X.FMX;
import X.ORZ;
import X.V0Q;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackExperiment;
import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EarlyFeedbackService implements IEarlyFeedbackService {
    public final C62822Ol8 LIZ;
    public final Map<String, FeedbackUIRecord> LIZIZ;
    public final Set<String> LIZJ;

    public static IEarlyFeedbackService LJI() {
        Object LIZ = C58096Mr6.LIZ(IEarlyFeedbackService.class, false);
        if (LIZ != null) {
            return (IEarlyFeedbackService) LIZ;
        }
        if (C58096Mr6.p5 == null) {
            synchronized (IEarlyFeedbackService.class) {
                if (C58096Mr6.p5 == null) {
                    C58096Mr6.p5 = new EarlyFeedbackService();
                }
            }
        }
        return C58096Mr6.p5;
    }

    public final boolean LJIIJJI() {
        if ((((Number) EB3.LIZ.getValue()).intValue() & 1) == 1) {
            if (LJIIIZ()) {
                EarlyFeedbackExperiment.LIZ.getClass();
                EarlyFeedbackExperiment.EarlyFeedbackButtonData earlyFeedbackButtonData = EarlyFeedbackExperiment.LIZIZ;
                if (earlyFeedbackButtonData.abGroup > 0 && earlyFeedbackButtonData.isEnable && LJIIL()) {
                    return true;
                }
            }
        } else {
            EarlyFeedbackExperiment.LIZ.getClass();
            EarlyFeedbackExperiment.EarlyFeedbackButtonData earlyFeedbackButtonData2 = EarlyFeedbackExperiment.LIZIZ;
            if (earlyFeedbackButtonData2.abGroup > 0 && earlyFeedbackButtonData2.isEnable && LJIIIZ() && LJIIL()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIL() {
        boolean z;
        EarlyFeedbackExperiment.LIZ.getClass();
        int i = EarlyFeedbackExperiment.LIZIZ.vvThreshold;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vv count: ");
        LIZ.append(this.LIZJ.size());
        LIZ.append(", pass: ");
        if (this.LIZJ.size() <= i) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (this.LIZJ.size() <= i) {
            return true;
        }
        return false;
    }

    public EarlyFeedbackService() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(EB2.LJLIL);
        this.LIZ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(EB1.LJLIL);
        Type type = new EB0().getType();
        o.LJIIIIZZ(type, "object : TypeToken<Mutab…dbackUIRecord>>() {}.type");
        Set<String> stringSet = ((Keva) LIZIZ.getValue()).getStringSet("vv_records_set", new LinkedHashSet());
        o.LJIIIIZZ(stringSet, "keva.getStringSet(KEVA_K…ORDS_SET, mutableSetOf())");
        this.LIZJ = stringSet;
        String string = ((Keva) LIZIZ.getValue()).getString("feedback_records_cache", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                Object LJII = ((Gson) LIZIZ2.getValue()).LJII(string, type);
                o.LJIIIIZZ(LJII, "gson.fromJson(cacheStorage, typeOfMap)");
                this.LIZIZ = (Map) LJII;
                return;
            } catch (Exception unused) {
                this.LIZIZ = new LinkedHashMap();
                return;
            }
        }
        this.LIZIZ = new LinkedHashMap();
    }

    public static boolean LJIIIZ() {
        boolean z;
        long LIZ = C38987FRv.LIZ();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start: ");
        long j = 0 + LIZ;
        LIZ2.append(j);
        LIZ2.append(", current: ");
        LIZ2.append(currentTimeMillis);
        LIZ2.append(", end: ");
        long j2 = LIZ + 86400000;
        LIZ2.append(j2);
        LIZ2.append(", pass: ");
        if (j < currentTimeMillis && j2 > currentTimeMillis) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        X1D.LIZIZ(LIZ2);
        if (j >= currentTimeMillis || j2 <= currentTimeMillis) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LJ() {
        LJIIJJI();
    }

    public static boolean LJIIJ(double d) {
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.0d) {
            if (V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d) > d) {
                return false;
            }
            return true;
        }
        throw new InvalidParameterException("ratio must between 0.0 .. 1.0");
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LIZIZ(String str) {
        if (!LJIIJJI() || str == null) {
            return;
        }
        this.LIZJ.add(str);
        C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(this, 57));
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final boolean LIZJ(String str) {
        if (LJIIJJI()) {
            EarlyFeedbackExperiment.LIZ.getClass();
            EarlyFeedbackExperiment.EarlyFeedbackButtonData earlyFeedbackButtonData = EarlyFeedbackExperiment.LIZIZ;
            if (earlyFeedbackButtonData.design == 1) {
                if (str != null) {
                    if (LJII(str)) {
                        return false;
                    }
                    if (LJIIIIZZ(str)) {
                        return true;
                    }
                }
                return LJIIJ(earlyFeedbackButtonData.ratio);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final boolean LIZLLL(String str) {
        if (LJIIJJI()) {
            EarlyFeedbackExperiment.LIZ.getClass();
            EarlyFeedbackExperiment.EarlyFeedbackButtonData earlyFeedbackButtonData = EarlyFeedbackExperiment.LIZIZ;
            if (earlyFeedbackButtonData.design == 2) {
                if (str != null) {
                    if (LJII(str)) {
                        return false;
                    }
                    if (LJIIIIZZ(str)) {
                        return true;
                    }
                }
                return LJIIJ(earlyFeedbackButtonData.ratio);
            }
        }
        return false;
    }

    public final boolean LJII(String str) {
        EnumC36001EAz enumC36001EAz;
        Set LJIIIIZZ = C77275UUl.LJIIIIZZ(EnumC36001EAz.LIKE, EnumC36001EAz.DISLIKE);
        FeedbackUIRecord feedbackUIRecord = this.LIZIZ.get(str);
        if (feedbackUIRecord != null) {
            enumC36001EAz = feedbackUIRecord.action;
        } else {
            enumC36001EAz = null;
        }
        return ORZ.LJLJJI(enumC36001EAz, LJIIIIZZ);
    }

    public final boolean LJIIIIZZ(String str) {
        EnumC36001EAz enumC36001EAz;
        Set LJIIIIZZ = C77275UUl.LJIIIIZZ(EnumC36001EAz.SWIPE, EnumC36001EAz.SHOWN);
        FeedbackUIRecord feedbackUIRecord = this.LIZIZ.get(str);
        if (feedbackUIRecord != null) {
            enumC36001EAz = feedbackUIRecord.action;
        } else {
            enumC36001EAz = null;
        }
        return ORZ.LJLJJI(enumC36001EAz, LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LIZ(String str, String str2, EnumC59921NfR uiType) {
        o.LJIIIZ(uiType, "uiType");
        if (str != null) {
            this.LIZIZ.put(str, new FeedbackUIRecord(EnumC36001EAz.SHOWN));
        }
        C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(this, 56));
        C188727au c188727au = new C188727au();
        c188727au.LJFF(uiType, "ui_type");
        c188727au.LJIIIZ("item_id", str);
        c188727au.LJIIIZ("gid", str2);
        FMX.LJIIL("video_feedback_bar_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LJFF(String str, String str2, EnumC59921NfR uiType, EnumC36001EAz action, long j) {
        o.LJIIIZ(uiType, "uiType");
        o.LJIIIZ(action, "action");
        if (str != null) {
            this.LIZIZ.put(str, new FeedbackUIRecord(action));
        }
        C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(this, 56));
        C188727au c188727au = new C188727au();
        c188727au.LJFF(action, "action");
        c188727au.LJ(j, "duration");
        c188727au.LJFF(uiType, "ui_type");
        c188727au.LJIIIZ("item_id", str);
        c188727au.LJIIIZ("gid", str2);
        FMX.LJIIL("video_feedback_bar_disappear", c188727au.LIZ);
    }
}

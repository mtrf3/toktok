package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;

/* renamed from: X.Mnz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57903Mnz {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        String str;
        Integer num;
        int i;
        int i2;
        boolean LIZIZ;
        Integer num2;
        Context context;
        ActivityC45651qj LJJIFFI;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || !C188587ag.LJ(aweme) || (str = videoItemParams.mEventType) == null) {
            return false;
        }
        if (!C30581Hy.LJIJI(str) && !C30581Hy.LJIL(str)) {
            return false;
        }
        RecMoreExperiment.VideoStrategy videoStrategy = RecMoreExperiment.LJI().videoStrategy;
        if (videoStrategy != null && (num = videoStrategy.enable) != null && num.intValue() == 1) {
            RecMoreExperiment.VideoStrategy videoStrategy2 = RecMoreExperiment.LJI().videoStrategy;
            if (videoStrategy2 != null && (num2 = videoStrategy2.disableDays) != null) {
                int intValue = num2.intValue();
                int LIZ = SU4.LIZ(System.currentTimeMillis());
                Keva keva = RecMoreExperiment.LIZJ;
                int i3 = keva.getInt(RecMoreExperiment.LJ(), -1);
                if (i3 != -1) {
                    if (Math.abs(LIZ - i3) >= intValue) {
                        keva.storeInt(RecMoreExperiment.LJFF(), 0);
                        keva.storeInt(RecMoreExperiment.LJ(), -1);
                        C221018lt.LJFF("RecMore", "reset video rec user!");
                    }
                }
            }
            RecMoreExperiment.LIZ();
            Integer num3 = videoStrategy.low;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = -1;
            }
            Integer num4 = videoStrategy.high;
            if (num4 != null) {
                i2 = num4.intValue();
            } else {
                i2 = -1;
            }
            if (i == -1 || i2 == -1 || i2 < i) {
                LIZIZ = RecMoreExperiment.LIZIZ(EnumC57901Mnx.VIDEO, videoStrategy.maxFollowCount);
            } else {
                int i4 = RecMoreExperiment.LJ;
                if (i <= i4 && i4 <= i2) {
                    LIZIZ = RecMoreExperiment.LIZIZ(EnumC57901Mnx.VIDEO, videoStrategy.maxFollowCount);
                }
            }
            if (LIZIZ) {
                return true;
            }
        }
        Fragment fragment = videoItemParams.fragment;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        C3YA c3ya = (C3YA) ServiceManager.get().getService(C3YA.class);
        if (c3ya != null && c3ya.LIZ() && context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJJIFFI);
            c26045AKb.LJIIIZ("recommend-more on video disable");
            c26045AKb.LJIIJ();
        }
        return false;
    }
}

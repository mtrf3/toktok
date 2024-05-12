package X;

import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.AnimatedBtnStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.7tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200537tx {
    public final Aweme LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Keva LJFF;

    public C200537tx(Aweme aweme) {
        int i;
        int i2;
        int i3;
        Integer continuousShowCount;
        Integer showCountPerInterval;
        Integer silenceDays;
        Integer intervalDays;
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = aweme;
        AnimatedBtnStruct animatedBtnStruct = aweme.animatedBtnStruct;
        int i4 = -1;
        if (animatedBtnStruct != null && (intervalDays = animatedBtnStruct.getIntervalDays()) != null) {
            i = intervalDays.intValue();
        } else {
            i = -1;
        }
        this.LIZIZ = i;
        AnimatedBtnStruct animatedBtnStruct2 = aweme.animatedBtnStruct;
        if (animatedBtnStruct2 != null && (silenceDays = animatedBtnStruct2.getSilenceDays()) != null) {
            i2 = silenceDays.intValue();
        } else {
            i2 = -1;
        }
        this.LIZJ = i2;
        AnimatedBtnStruct animatedBtnStruct3 = aweme.animatedBtnStruct;
        if (animatedBtnStruct3 != null && (showCountPerInterval = animatedBtnStruct3.getShowCountPerInterval()) != null) {
            i3 = showCountPerInterval.intValue();
        } else {
            i3 = -1;
        }
        this.LIZLLL = i3;
        AnimatedBtnStruct animatedBtnStruct4 = aweme.animatedBtnStruct;
        if (animatedBtnStruct4 != null && (continuousShowCount = animatedBtnStruct4.getContinuousShowCount()) != null) {
            i4 = continuousShowCount.intValue();
        }
        this.LJ = i4;
        this.LJFF = Keva.getRepo("guide_like_anim_freq_control");
    }

    public static String LIZ(String str) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return i0.LJFF(curUserId, str);
        }
        return i0.LJFF(serverDeviceId, str);
    }

    public final void LIZIZ(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LIZ.getAid());
        c188727au.LJIIIZ("author_id", this.LIZ.getAuthorUid());
        c188727au.LJ(this.LIZ.getStatistics().getDiggCount(), "liked_cnt");
        if (z) {
            str = "daily_control";
        } else {
            str = "continuous_miss";
        }
        c188727au.LJIIIZ("control_rule", str);
        FMX.LJIIL("like_icon_flash_control", c188727au.LIZ);
    }
}

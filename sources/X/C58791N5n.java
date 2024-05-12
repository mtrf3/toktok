package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.N5n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58791N5n {
    public final InterfaceC58799N5v LIZ;
    public final C58795N5r LIZIZ;
    public final ActivityC45651qj LIZJ;
    public final java.util.Set<EnumC58794N5q> LIZLLL;
    public final SearchAdEventLogger LJ;
    public final long LJFF;
    public IVideoPlayTaskManager LJI;

    public final void LIZ() {
        IVideoPlayTaskManager iVideoPlayTaskManager;
        IVideoPlayTaskManager iVideoPlayTaskManager2;
        IVideoPlayTaskManager WD = this.LIZ.WD();
        this.LJI = WD;
        double d = this.LJFF;
        int i = (int) (0.25d * d);
        int i2 = (int) (0.5d * d);
        int i3 = (int) (d * 0.75d);
        if (WD != null) {
            N68 n68 = new N68("searchVideoAutoPlayTimingTask");
            n68.LIZIZ(this.LJFF);
            n68.LIZJ = 200;
            n68.LIZLLL = new ARunnableS46S0100000_10(this, 83);
            n68.LJ = true;
            WD.LJLJLJ(n68.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager3 = this.LJI;
        if (iVideoPlayTaskManager3 != null) {
            N68 n682 = new N68("searchVideoFirstQuartileTimingTask");
            n682.LIZIZ(this.LJFF);
            n682.LIZJ = i;
            n682.LIZLLL = new ARunnableS46S0100000_10(this, 84);
            n682.LJ = true;
            iVideoPlayTaskManager3.LJLJLJ(n682.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager4 = this.LJI;
        if (iVideoPlayTaskManager4 != null) {
            N68 n683 = new N68("searchVideoMidQuartileTimingTask");
            n683.LIZIZ(this.LJFF);
            n683.LIZJ = i2;
            n683.LIZLLL = new ARunnableS46S0100000_10(this, 85);
            n683.LJ = true;
            iVideoPlayTaskManager4.LJLJLJ(n683.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager5 = this.LJI;
        if (iVideoPlayTaskManager5 != null) {
            N68 n684 = new N68("searchVideoThirdQuartileTimingTask");
            n684.LIZIZ(this.LJFF);
            n684.LIZJ = i3;
            n684.LIZLLL = new ARunnableS46S0100000_10(this, 86);
            n684.LJ = true;
            iVideoPlayTaskManager5.LJLJLJ(n684.LIZ());
        }
        if (this.LJFF >= 2000 && (iVideoPlayTaskManager2 = this.LJI) != null) {
            N68 n685 = new N68("SearchAd2sPlayProgressTrack");
            n685.LIZIZ(this.LJFF);
            n685.LIZJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            n685.LIZLLL = new ARunnableS46S0100000_10(this, 87);
            n685.LJ = true;
            iVideoPlayTaskManager2.LJLJLJ(n685.LIZ());
        }
        if (this.LJFF >= 6000 && (iVideoPlayTaskManager = this.LJI) != null) {
            N68 n686 = new N68("SearchAd6sPlayProgressTrack");
            n686.LIZIZ(this.LJFF);
            n686.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
            n686.LIZLLL = new ARunnableS46S0100000_10(this, 88);
            n686.LJ = true;
            iVideoPlayTaskManager.LJLJLJ(n686.LIZ());
        }
    }

    public final void LIZIZ(EnumC58794N5q enumC58794N5q) {
        C58653N0f c58653N0f;
        Boolean bool;
        switch (C58793N5p.LIZ[enumC58794N5q.ordinal()]) {
            case 1:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJIJJ;
                break;
            case 2:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJI;
                break;
            case 3:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJIFFI;
                break;
            case 4:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJII;
                break;
            case 5:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJIII;
                break;
            case 6:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJIIJ;
                break;
            case 7:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJIIZ;
                break;
            case 8:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJIIJZLJL;
                break;
            case 9:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJIL;
                break;
            case 10:
                C58777N4z.LIZ.getClass();
                c58653N0f = C58777N4z.LJJ;
                break;
            default:
                throw new C162476Zf();
        }
        C58795N5r c58795N5r = this.LIZIZ;
        o.LJIIIZ(c58795N5r, "<this>");
        java.util.Map<EnumC58794N5q, Boolean> map = c58795N5r.LIZIZ;
        if (map != null && (bool = map.get(enumC58794N5q)) != null && !bool.booleanValue()) {
            return;
        }
        switch (C58792N5o.LIZ[enumC58794N5q.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (((HashSet) this.LIZLLL).contains(enumC58794N5q)) {
                    return;
                }
                break;
        }
        this.LJ.LJIILIIL(c58653N0f);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("track event : ");
        LIZ.append(enumC58794N5q.name());
        LIZ.append("  position: ");
        LIZ.append(this.LIZ.getCurrentPosition());
        LIZ.append("  playTimes: ");
        LIZ.append(this.LIZ.d0());
        N8M.LIZ(X1D.LIZIZ(LIZ));
        ((HashSet) this.LIZLLL).add(enumC58794N5q);
    }

    public C58791N5n(C58798N5u c58798N5u, C58795N5r config) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(config, "config");
        this.LIZ = c58798N5u;
        this.LIZIZ = config;
        Context LIZ = c58798N5u.LJLIL.LIZ();
        if (LIZ != null) {
            activityC45651qj = C45804HyK.LJJIFFI(LIZ);
        } else {
            activityC45651qj = null;
        }
        this.LIZJ = activityC45651qj;
        Aweme aweme = c58798N5u.LJLIL.getAweme();
        this.LIZLLL = new HashSet();
        this.LJ = new SearchAdEventLogger(new Object[]{aweme, c58798N5u});
        this.LJFF = c58798N5u.getVideoLength();
    }
}

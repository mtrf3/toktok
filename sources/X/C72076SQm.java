package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SQm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72076SQm {
    public static C72076SQm LIZIZ;
    public final InterfaceC72081SQr<String> LIZ;

    public C72076SQm() {
        InterfaceC72081SQr<String> c72078SQo;
        boolean isUseJediAwemelistFragment = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isUseJediAwemelistFragment();
        boolean isReplaceAwemeCache = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isReplaceAwemeCache();
        if (isUseJediAwemelistFragment) {
            c72078SQo = C72080SQq.LIZIZ;
        } else if (isReplaceAwemeCache) {
            c72078SQo = new C84779XPb();
        } else {
            c72078SQo = new C72078SQo();
        }
        this.LIZ = c72078SQo;
    }

    public static AwemeStatistics LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            AwemeStatistics awemeStatistics = new AwemeStatistics();
            aweme.setStatistics(awemeStatistics);
            return awemeStatistics;
        }
        return statistics;
    }

    public final Aweme LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !o.LJ(CardStruct.IStatusCode.DEFAULT, str)) {
            if (str != null && this.LIZ.containsKey(str)) {
                return this.LIZ.get(str);
            }
            C72075SQl LIZ = C76K.LIZ();
            if (LIZ != null) {
                return LIZ.LIZ(str);
            }
        }
        return null;
    }

    public final Aweme LIZIZ(String str) {
        if (str != null) {
            this.LIZ.containsKey(str);
            if (str != null && this.LIZ.containsKey(str)) {
                return this.LIZ.get(str);
            }
        }
        return null;
    }

    public final Aweme LJ(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (aweme.getUserStory() != null) {
            LJI(aweme, 0, false);
            return aweme;
        }
        if (aweme.isAd() || aweme.getActivityPendant() != null || aweme.getLiveAwesomeSplashInfo() != null) {
            C72075SQl LIZ = C76K.LIZ();
            if (LIZ != null) {
                return LIZ.LIZJ(aweme);
            }
            return null;
        }
        return LJFF(aweme, this.LIZ);
    }

    public static Aweme LJFF(Aweme aweme, InterfaceC72081SQr awemeCache) {
        Aweme aweme2;
        o.LJIIIZ(awemeCache, "awemeCache");
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !aweme.isProhibited() && !aweme.isSelfSee()) {
            if (awemeCache.containsKey(aweme.getAid()) && (aweme2 = awemeCache.get(aweme.getAid())) != null) {
                aweme2.update(aweme);
                aweme = aweme2;
            }
            awemeCache.LIZ(aweme, aweme.getAid());
        }
        return aweme;
    }

    public final Aweme LIZJ(int i, String str) {
        String LIZIZ2 = YE1.LIZIZ(str, "type", i);
        if (this.LIZ.containsKey(LIZIZ2)) {
            return this.LIZ.get(LIZIZ2);
        }
        return null;
    }

    public final Aweme LJII(int i, Aweme aweme) {
        if (TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (aweme.getUserStory() != null) {
            LJI(aweme, i, true);
            return aweme;
        }
        if (aweme.isAd() || aweme.getActivityPendant() != null || aweme.getLiveAwesomeSplashInfo() != null) {
            C72075SQl LIZ = C76K.LIZ();
            if (LIZ != null) {
                return LIZ.LIZJ(aweme);
            }
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(aweme.getAid());
        LIZ2.append("type");
        LIZ2.append(i);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        if (this.LIZ.containsKey(LIZIZ2)) {
            Aweme aweme2 = this.LIZ.get(LIZIZ2);
            if (aweme2 != null) {
                aweme2.update(aweme);
                return aweme2;
            }
            this.LIZ.LIZ(aweme, LIZIZ2);
            return aweme;
        }
        this.LIZ.LIZ(aweme, LIZIZ2);
        return aweme;
    }

    public final void LJIIIIZZ(int i, Aweme aweme) {
        aweme.setUserDigg(i);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i == 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() - 1);
            }
        } else {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_like_video_5", null);
        }
        this.LIZ.LIZ(aweme, aweme.getAid());
    }

    public final void LJI(Aweme aweme, int i, boolean z) {
        Aweme LJFF;
        if (aweme != null && aweme.getUserStory() != null && (LJFF = C54838Lfe.LJFF(aweme)) != null) {
            if (z) {
                UserStory userStory = aweme.getUserStory();
                o.LJI(userStory);
                List<Aweme> stories = userStory.getStories();
                Aweme LJII = LJII(i, LJFF);
                o.LJI(LJII);
                ListProtector.set(stories, 0, LJII);
                return;
            }
            UserStory userStory2 = aweme.getUserStory();
            o.LJI(userStory2);
            List<Aweme> stories2 = userStory2.getStories();
            Aweme LJ = LJ(LJFF);
            o.LJI(LJ);
            ListProtector.set(stories2, 0, LJ);
        }
    }
}

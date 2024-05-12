package com.ss.android.ugc.aweme.journey.feed.notinterested;

import X.C188727au;
import X.C54258LRe;
import X.C57792Op;
import X.FMX;
import X.IDR;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class NotInterestedTutorialService implements INotInterestedTutorialService {
    public C57792Op LIZ;

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZJ() {
        if (this.LIZ != null) {
            C57792Op.LJII = System.currentTimeMillis();
            C57792Op.LJ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZ(WeakReference<IDR> weakReference, WeakReference<C54258LRe> weakReference2) {
        this.LIZ = new C57792Op(weakReference, weakReference2);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZIZ(int i, Aweme aweme) {
        C54258LRe c54258LRe;
        C54258LRe c54258LRe2;
        C57792Op c57792Op = this.LIZ;
        if (c57792Op != null) {
            Keva keva = C57792Op.LIZLLL;
            if (keva.getBoolean("has_not_interested_tutorial_shown", false) || C57792Op.LJII == -1 || C57792Op.LJIIIIZZ > 100) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            double d = currentTimeMillis - C57792Op.LJII;
            C57792Op.LJII = currentTimeMillis;
            HashSet<Integer> hashSet = C57792Op.LJ;
            if (hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            int i2 = C57792Op.LJIIIIZZ + 1;
            C57792Op.LJIIIIZZ = i2;
            keva.storeInt("total_video_count", i2);
            if (d > 2000.0d) {
                hashSet.add(Integer.valueOf(i));
                C57792Op.LJFF = 0;
                return;
            }
            if (!keva.getBoolean("has_not_interested_tutorial_shown", false) && C57792Op.LJFF < C57792Op.LJI && aweme != null && !aweme.isAd()) {
                C57792Op.LJFF++;
            }
            if (C57792Op.LJFF == C57792Op.LJI - 1 && aweme != null && !aweme.isAd()) {
                C57792Op.LJIIIZ = aweme;
            }
            if (C57792Op.LJFF < C57792Op.LJI || (c54258LRe = c57792Op.LIZIZ.get()) == null || c54258LRe.LIZJ() || (c54258LRe2 = c57792Op.LIZIZ.get()) == null || c54258LRe2.LIZLLL() || c54258LRe2.LIZIZ() || c54258LRe2.LIZ("login_panel") || aweme == null || aweme.isAd() || keva.getBoolean("has_not_interested_tutorial_shown", false) || c57792Op.LIZJ == null || C57792Op.LJIIIIZZ >= 100) {
                return;
            }
            IDR idr = c57792Op.LIZ.get();
            String str = null;
            if (idr == null || idr.getContext() == null) {
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LIZLLL(C57792Op.LJIIIIZZ, "vv_cnt");
            c188727au.LIZLLL(C57792Op.LJI, "skip_cnt");
            Aweme aweme2 = C57792Op.LJIIIZ;
            if (aweme2 != null) {
                str = aweme2.getGroupId();
            }
            c188727au.LJIIIZ("group_id", str);
            FMX.LJIIL("show_not_interested_tutorial", c188727au.LIZ);
            IDR idr2 = c57792Op.LIZ.get();
            if (idr2 != null) {
                idr2.showNotInterestedTutorialInternal();
            }
            keva.storeBoolean("has_not_interested_tutorial_shown", true);
        }
    }
}

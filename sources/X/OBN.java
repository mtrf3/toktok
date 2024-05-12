package X;

import Y.ARunnableS0S0010000_1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public class OBN implements C4VQ {
    public final /* synthetic */ BaseListFragmentPanel LIZ;

    public final void LIZ() {
        if (C58122Pw.LIZIZ) {
            if (!this.LIZ.hasSetSharef) {
                C57122Ma.LIZ = true;
                C37179EiV.LJFF.post(new ARunnableS0S0010000_1(true, 0));
                C2MZ.LIZJ();
                this.LIZ.hasSetSharef = true;
                return;
            }
            return;
        }
        C57122Ma.LIZ = true;
        C37179EiV.LJFF.post(new ARunnableS0S0010000_1(true, 0));
        C2MZ.LIZJ();
    }

    public OBN(BaseListFragmentPanel baseListFragmentPanel) {
        this.LIZ = baseListFragmentPanel;
    }

    public final boolean LIZIZ(boolean z) {
        if (this.LIZ.isRecommendFeed() && C63081OpJ.LLIIII(this.LIZ.getCurrentAweme()) && C63081OpJ.LJJJJZI(this.LIZ.getCurrentAweme()).getSwipeUpType() == 5 && (this.LIZ.getContext() instanceof ActivityC45651qj) && LPY.LIZ((ActivityC45651qj) this.LIZ.getContext()).gv0()) {
            if (!z) {
                return true;
            }
            if (LPY.LIZ((ActivityC45651qj) this.LIZ.getContext()).LJLJI.getValue() != null && LPY.LIZ((ActivityC45651qj) this.LIZ.getContext()).LJLJI.getValue().floatValue() >= KL2.LIZJ(this.LIZ.getContext(), 54.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int LIZJ(int i, int i2, int i3) {
        if (this.LIZ.getCurViewHolder() != null && this.LIZ.getCurViewHolder().j3() != null && this.LIZ.getCurViewHolder().j3().C2() != null && this.LIZ.getCurViewHolder().j3().C2().LLLZI(i, i2, i3)) {
            this.LIZ.hideIvPlay();
            return i2;
        }
        return i;
    }

    public final int LIZLLL(int i, int i2, int i3, int i4) {
        Aweme currentAweme = this.LIZ.getCurrentAweme();
        if (currentAweme == null) {
            return i;
        }
        C2MA curViewHolder = this.LIZ.getCurViewHolder();
        C79081V1x.LJIILLIIL(currentAweme);
        if (currentAweme.isLive() && curViewHolder != null) {
            if (OMU.LIZIZ(currentAweme) == OBQ.BACKGROUND.getType() || !C61776OMi.LIZJ(currentAweme, true) || !C61776OMi.LJII(this.LIZ.getContext(), curViewHolder) || !curViewHolder.K7() || curViewHolder.R7()) {
                return i;
            }
            OBM.LIZIZ.LJII(currentAweme, "[tryShowSurvey] when user swipe live card, show single choice survey");
            return i2;
        }
        if (currentAweme.isPhotoMode() && curViewHolder != null) {
            if (!this.LIZ.isRecommendFeed() || OMU.LIZIZ(currentAweme) == OBQ.BACKGROUND.getType() || !C61776OMi.LIZJ(currentAweme, true)) {
                return i;
            }
            if ((OMU.LIZIZ(currentAweme) == OBQ.GREY_CARD.getType() && curViewHolder.S7()) || !C61776OMi.LJII(this.LIZ.getContext(), curViewHolder)) {
                return i;
            }
            OBM.LIZIZ.LJII(currentAweme, "[tryShowSurvey] when user swipe photo card, show single choice survey");
            return i2;
        }
        if (C79081V1x.LJIL(currentAweme) && curViewHolder != null && curViewHolder.S7()) {
            return i;
        }
        long j = 0;
        if (this.LIZ.isRecommendFeed()) {
            this.LIZ.mIsAdCurAweme = C78540Us4.LJIILIIL(currentAweme);
            if (currentAweme.getAwemeType() != 101 && !this.LIZ.mIsAdCurAweme) {
                String aid = currentAweme.getAid();
                if (!((ArrayList) OBO.LIZ()).isEmpty()) {
                    if (aid != null) {
                        HashSet<String> hashSet = OBO.LIZLLL;
                        if (!hashSet.contains(aid)) {
                            hashSet.add(aid);
                        }
                    }
                    if (OBO.LIZJ == 0) {
                        Keva keva = OBO.LIZIZ;
                        long j2 = keva.getLong("key_last_day_time", 0L);
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = currentTimeMillis - j2;
                        if (j3 < 86400000 && j3 > -86400000 && (currentTimeMillis + TimeZone.getDefault().getOffset(currentTimeMillis)) / 86400000 == (j2 + TimeZone.getDefault().getOffset(j2)) / 86400000) {
                            OBO.LIZJ = keva.getInt("key_day_aweme_count", 0);
                        }
                    }
                    int i5 = OBO.LIZJ + 1;
                    OBO.LIZJ = i5;
                    Keva keva2 = OBO.LIZIZ;
                    keva2.storeInt("key_day_aweme_count", i5);
                    keva2.storeLong("key_last_day_time", System.currentTimeMillis());
                }
                HashSet<String> hashSet2 = OBM.LIZ;
                if (-1 > hashSet2.size()) {
                    hashSet2.add(currentAweme.getAid());
                }
            }
            boolean needShowSurvey = this.LIZ.needShowSurvey(true);
            BaseListFragmentPanel baseListFragmentPanel = this.LIZ;
            baseListFragmentPanel.mIsAdLastAweme = baseListFragmentPanel.mIsAdCurAweme;
            if (needShowSurvey) {
                String str = JHI.LIZ().LIZIZ;
                IDP idp = this.LIZ.mPlayerController;
                if (idp != null) {
                    j = idp.LJJJJI(str);
                }
                if (((float) ((System.currentTimeMillis() - j) / 1000)) > 1.0f) {
                    try {
                        if (C79081V1x.LJIJJ(currentAweme) || C79081V1x.LJIJJLI(currentAweme)) {
                            OBM.LIZIZ.LJII(currentAweme, "[tryShowSurvey] when user swipe, show insert/background survey");
                            return i;
                        }
                        if (C79081V1x.LJIL(currentAweme)) {
                            OBM.LIZIZ.LJII(currentAweme, "[tryShowSurvey] when user swipe, show grey card survey");
                            if (curViewHolder != null && !curViewHolder.S7()) {
                                curViewHolder.U8();
                                OBM.LIZ.clear();
                                return i2;
                            }
                        } else {
                            int LIZIZ = OMU.LIZIZ(currentAweme);
                            if (LIZIZ == OBQ.DEFAULT.getType() || LIZIZ == OBQ.ONLINE.getType() || LIZIZ == OBQ.FLOATING.getType()) {
                                Fragment fragment = this.LIZ.getFragment();
                                Context context = this.LIZ.getContext();
                                BaseListFragmentPanel baseListFragmentPanel2 = this.LIZ;
                                if (C61780OMm.LJIIJ(currentAweme, fragment, context, baseListFragmentPanel2.mViewPager, i, i3, i4, baseListFragmentPanel2.mPlayerController.LJJJJI(str))) {
                                    OBM.LIZIZ.LJII(currentAweme, "[tryShowSurvey] when user swipe, show dialog survey");
                                    OBM.LIZ.clear();
                                    return i2;
                                }
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        return i;
    }
}

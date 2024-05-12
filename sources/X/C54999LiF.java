package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LiF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54999LiF extends C1CZ {
    public final /* synthetic */ RecommendFeedFragmentPanel LJLIL;

    public C54999LiF(RecommendFeedFragmentPanel recommendFeedFragmentPanel) {
        this.LJLIL = recommendFeedFragmentPanel;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.LLIIZ = new Date().getTime();
        RecommendFeedFragmentPanel recommendFeedFragmentPanel = this.LJLIL;
        if (i > recommendFeedFragmentPanel.LLIL) {
            long j = recommendFeedFragmentPanel.LLIIZ;
            long j2 = recommendFeedFragmentPanel.LLIILZL;
            List<Aweme> list = recommendFeedFragmentPanel.mAdapter.LJJIL();
            o.LJIIIZ(list, "list");
            boolean z = false;
            if (j - j2 > 7200000) {
                int i2 = i + 1;
                int size = list.size();
                while (true) {
                    if (i2 < size) {
                        if (((Aweme) ListProtector.get(list, i2)).isAd() || ((Aweme) ListProtector.get(list, i2)).isLive()) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        RecommendFeedFragmentPanel recommendFeedFragmentPanel2 = this.LJLIL;
                        FeedRecommendFragment feedRecommendFragment = recommendFeedFragmentPanel2.LLILIL;
                        if (feedRecommendFragment != null) {
                            feedRecommendFragment.LLIIIJ.LJLJLJ = true;
                            C8RO c8ro = feedRecommendFragment.LJLJLLL;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("[sendDeduplicateRequest]");
                            LIZ.append(feedRecommendFragment.LJLJJI);
                            c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
                            C54980Lhw c54980Lhw = feedRecommendFragment.LLIIIJ;
                            Object[] objArr = new Object[5];
                            objArr[0] = 4;
                            objArr[1] = Integer.valueOf(feedRecommendFragment.LJLJJI);
                            objArr[2] = 2;
                            if (C2M9.LIZ() && C47957Irx.LIZJ()) {
                                z = true;
                            }
                            objArr[3] = Boolean.valueOf(z);
                            objArr[4] = Boolean.TRUE;
                            c54980Lhw.LJIILL(objArr);
                        }
                        C8RO c8ro2 = recommendFeedFragmentPanel2.LLILII;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[sendDeduplicateRequest],");
                        LIZ2.append(recommendFeedFragmentPanel2.LLILIL);
                        c8ro2.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
        RecommendFeedFragmentPanel recommendFeedFragmentPanel3 = this.LJLIL;
        recommendFeedFragmentPanel3.LLIL = i;
        recommendFeedFragmentPanel3.LLIILZL = recommendFeedFragmentPanel3.LLIIZ;
    }
}

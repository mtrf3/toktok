package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;

/* renamed from: X.Li1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54985Li1 implements QJ8 {
    public final /* synthetic */ FeedRecommendFragment LJLIL;

    @Override // X.QJ8
    public final void LIZ(boolean z) {
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
    }

    public C54985Li1(FeedRecommendFragment feedRecommendFragment) {
        this.LJLIL = feedRecommendFragment;
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            FeedRecommendFragment feedRecommendFragment = this.LJLIL;
            if (!feedRecommendFragment.LLFZ) {
                feedRecommendFragment.Ql(Boolean.FALSE);
                this.LJLIL.LLFZ = true;
            }
        }
    }
}

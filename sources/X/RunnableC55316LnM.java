package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;

/* renamed from: X.LnM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55316LnM implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ DetailFragmentPanel LJLJI;

    public final void LIZ() {
        if (this.LJLJI.mViewPager != null) {
            if (!TextUtils.equals("from_mix_detail_item", this.LJLIL) && !TextUtils.equals("from_profile_mix_list", this.LJLIL)) {
                this.LJLJI.mSetItem = true;
            }
            int i = this.LJLILLLLZI;
            if (i > 0) {
                DetailFragmentPanel detailFragmentPanel = this.LJLJI;
                detailFragmentPanel.mCurIndex = i;
                detailFragmentPanel.mViewPager.setCurrentItemWithDefaultVelocity(i);
            } else {
                DetailFragmentPanel detailFragmentPanel2 = this.LJLJI;
                detailFragmentPanel2.mCurIndex = 0;
                detailFragmentPanel2.mViewPager.LJJJ(0, false);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC55316LnM(DetailFragmentPanel detailFragmentPanel, String str, int i) {
        this.LJLJI = detailFragmentPanel;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}

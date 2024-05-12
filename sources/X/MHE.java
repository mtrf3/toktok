package X;

import Y.ACListenerS44S0200000_9;
import android.os.Bundle;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHE extends C220538l7 {
    public final MH9 LLFII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHE(View view, String eventLabel, MH9 awemeClickListener) {
        super(view, eventLabel, awemeClickListener);
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        this.LLFII = awemeClickListener;
        C16880lQ.LJJJJI(this.LJLLLL, new ACListenerS44S0200000_9(view, this, 28));
    }

    @Override // X.C220538l7
    public final void a0(Aweme data, int i, boolean z, Bundle bundle) {
        o.LJIIIZ(data, "data");
        super.a0(data, i, z, bundle);
        if (data.getFeatureVideo() == Aweme.VideoType.NO_FEATURE_VIDEO_SELECTED) {
            if (data.getIcon() != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(data.getIcon()));
                LJII.LJJIIJ = this.LJLLLLLL;
                C16880lQ.LLJJJ(LJII);
                W5F LJII2 = W5U.LJII(C78939UyV.LJ(data.getIcon()));
                LJII2.LJJIIJ = this.LJLILLLLZI;
                LJII2.LJIJJ = EnumC72807Shn.CENTER_CROP;
                LJII2.LJIL = new MHO(25);
                C16880lQ.LLJJJ(LJII2);
            }
            this.LJLLLLLL.setVisibility(0);
            this.LJLZ.setVisibility(0);
            this.LJLLL.setVisibility(8);
            this.LJLLLL.setVisibility(8);
        } else {
            this.LJLLLLLL.setVisibility(4);
            this.LJLZ.setVisibility(4);
            this.LJLLL.setText(R.string.pdj);
            this.LJLLL.setVisibility(0);
            this.LJLLLL.setText(R.string.pdi);
            this.LJLLLL.setVisibility(0);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amo);
            this.LJLLL.setTextColorRes(R.attr.dj);
        }
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
            this.LJLILLLLZI.LJ();
        }
        C16880lQ.LJJIJLIJ(this.LJLILLLLZI, new ACListenerS44S0200000_9(data, this, 29));
    }
}

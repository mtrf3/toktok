package X;

import Y.IDiS268S0100000_4;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9D {
    public final VideoViewCell LIZ;

    public final boolean LIZ() {
        if (this.LIZ.getAweme() == null) {
            return false;
        }
        if (!LPR.LIZ(this.LIZ.getAweme())) {
            A9B.LIZ("slide guide ext enable is close");
            return false;
        }
        if (this.LIZ.LJLJJLL() != 2 && this.LIZ.LJLJJLL() != 7) {
            A9B.LIZ("current Feed is not FYP ad or commerce ad");
            return false;
        }
        if (this.LIZ.getAwemeType() != 0) {
            A9B.LIZ("current data is not video data");
            return false;
        }
        VideoViewCell videoViewCell = this.LIZ;
        if (videoViewCell.LLJ == null) {
            A9B.LIZ("view pager is null");
            return false;
        }
        if (videoViewCell.LLJJJIL == null) {
            A9B.LIZ("activity is null");
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        A9E a9e = this.LIZ.LLJ;
        if (a9e != null && (a9e.getAdapter() instanceof A9K)) {
            A9B.LIZ("resetSlideViewPager: clearPagerListener()");
            a9e.LLJJJ.clear();
            PagerAdapter adapter = a9e.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.slide.VideoViewSlideAdapter");
            A9K a9k = (A9K) adapter;
            int size = ((ArrayList) a9k.LJLJLJ).size();
            for (int i = 0; i < size; i++) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("destroyAllItem =");
                LIZ.append(ListProtector.get(a9k.LJLJLJ, i));
                LPR.LIZIZ(X1D.LIZIZ(LIZ));
                a9k.LJIIIZ(i, a9e, ListProtector.get(a9k.LJLJLJ, i));
            }
            ((ArrayList) a9k.LJLJLJ).clear();
        }
    }

    public final void LIZJ() {
        Integer num;
        A9B.LIZ("initSlideViewPager: ");
        if (this.LIZ.LLJJJIL == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mPlayerView.getid = ");
        FrameLayout frameLayout = this.LIZ.LLIZLLLIL;
        if (frameLayout != null) {
            num = Integer.valueOf(frameLayout.getId());
        } else {
            num = null;
        }
        LIZ.append(num);
        A9B.LIZ(X1D.LIZIZ(LIZ));
        FrameLayout frameLayout2 = this.LIZ.LLIZLLLIL;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        this.LIZ.LLIZLLLIL = new FrameLayout(this.LIZ.LLJJJIL);
        VideoViewCell videoViewCell = this.LIZ;
        videoViewCell.LLFF = videoViewCell.LLFFF(videoViewCell.LJLLILLLL);
        A9E a9e = this.LIZ.LLJ;
        if (a9e != null) {
            a9e.setVisibility(0);
        }
        VideoViewCell videoViewCell2 = this.LIZ;
        A9E a9e2 = videoViewCell2.LLJ;
        if (a9e2 != null) {
            Aweme aweme = videoViewCell2.getAweme();
            VideoViewCell videoViewCell3 = this.LIZ;
            a9e2.LLJJJIL = aweme;
            a9e2.LLJJL = videoViewCell3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A9J(0));
        arrayList.add(new A9J(1));
        A9K a9k = new A9K(this.LIZ.getActivity(), arrayList);
        FrameLayout frameLayout3 = this.LIZ.LLIZLLLIL;
        o.LJIIIIZZ(frameLayout3, "currentViewHolder.mPlayerView");
        a9k.LJLJL.put(0, frameLayout3);
        A9E a9e3 = this.LIZ.LLJ;
        if (a9e3 != null) {
            a9e3.LJFF(new IDiS268S0100000_4(this, 1));
        }
        A9E a9e4 = this.LIZ.LLJ;
        if (a9e4 == null) {
            return;
        }
        a9e4.setAdapter(a9k);
    }

    public A9D(VideoViewCell currentViewHolder) {
        o.LJIIIZ(currentViewHolder, "currentViewHolder");
        this.LIZ = currentViewHolder;
    }
}

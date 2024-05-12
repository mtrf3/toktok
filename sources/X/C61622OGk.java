package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.OGk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61622OGk extends AbstractC29229BdZ {
    public final int LJLJJLL;
    public List<Banner> LJLJL;
    public final int LJLJLJ;
    public final long LJLJLLL;
    public final long LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.LJLJL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup viewGroup) {
        C61627OGp c61627OGp;
        View view2 = view;
        if (view2 == null) {
            view2 = C28289B8j.LIZ(viewGroup, R.layout.bcq, viewGroup, false);
            c61627OGp = new C61627OGp(view2, this.LJLJJLL, this.LJLJLJ, this.LJLJLLL, this.LJLL);
            view2.setTag(c61627OGp);
        } else {
            c61627OGp = (C61627OGp) view2.getTag();
        }
        if (getCount() > 0) {
            Banner banner = (Banner) ListProtector.get(this.LJLJL, i);
            if (banner != null) {
                if (banner != c61627OGp.LJLJJL) {
                    c61627OGp.LJLJJL = banner;
                    c61627OGp.LJLJJLL = i + 1;
                    if (banner.getBannerUrl() != null && !C79004UzY.LJJIFFI(c61627OGp.LJLJJL.getBannerUrl().getUrlList())) {
                        W5F LJII = W5U.LJII(C78939UyV.LJ(c61627OGp.LJLJJL.getBannerUrl()));
                        LJII.LJIILIIL(J7H.LIZ(601));
                        LJII.LJIILJJIL(c61627OGp.LJLILLLLZI);
                        LJII.LIZLLL = true;
                        LJII.LIZIZ("MusicBannerViewHolder");
                        LJII.LJJIIJ = c61627OGp.LJLJI;
                        C16880lQ.LLJJJ(LJII);
                    }
                    new C198747r4(C17N.LJIILL(4.0d), c61627OGp.itemView.getContext().getResources().getColor(R.color.sg)).setAlpha(76);
                }
            } else {
                c61627OGp.getClass();
            }
        }
        return view2;
    }

    public C61622OGk(Context context, LayoutInflater layoutInflater, int i, int i2, long j, long j2) {
        super(context, layoutInflater, 1);
        this.LJLJJLL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = j;
        this.LJLL = j2;
    }
}

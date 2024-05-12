package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.OGl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61623OGl extends AbstractC29229BdZ {
    public final int LJLJJLL;
    public List<Banner> LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.LJLJL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public C61623OGl(Context context, LayoutInflater layoutInflater, int i) {
        super(context, layoutInflater, 1);
        this.LJLJJLL = i;
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup viewGroup) {
        C61624OGm c61624OGm;
        if (view == null) {
            view = C28289B8j.LIZ(viewGroup, R.layout.bg9, viewGroup, false);
            c61624OGm = new C61624OGm(view, this.LJLJJLL);
            view.setTag(c61624OGm);
        } else {
            c61624OGm = (C61624OGm) view.getTag();
        }
        if (getCount() > 0) {
            Banner banner = (Banner) ListProtector.get(this.LJLJL, i);
            if (banner != null) {
                if (banner != c61624OGm.LJLJJL) {
                    c61624OGm.LJLJJL = banner;
                    if (banner.getBannerUrl() != null && !C79004UzY.LJJIFFI(c61624OGm.LJLJJL.getBannerUrl().getUrlList())) {
                        W5F LJII = W5U.LJII(C78939UyV.LJ(c61624OGm.LJLJJL.getBannerUrl()));
                        LJII.LJIILIIL(J7H.LIZ(601));
                        LJII.LJIILJJIL(c61624OGm.LJLJI);
                        LJII.LIZLLL = true;
                        LJII.LIZIZ("MusicBannerViewHolder");
                        LJII.LJJIIJ = c61624OGm.LJLJJI;
                        C16880lQ.LLJJJ(LJII);
                    }
                    new C198747r4(C17N.LJIILL(4.0d), C79045V0n.LJI(R.attr.d5, c61624OGm.itemView.getContext()).intValue()).setAlpha(76);
                    c61624OGm.LJLILLLLZI = i + 1;
                }
            } else {
                c61624OGm.getClass();
            }
        }
        return view;
    }
}

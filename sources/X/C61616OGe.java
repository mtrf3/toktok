package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OGe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61616OGe extends AbstractC29229BdZ implements InterfaceC56611MJr {
    public final InterfaceC56611MJr LJLJJLL;
    public List<? extends Banner> LJLJL;

    @Override // X.InterfaceC56611MJr
    public final void ak() {
        this.LJLJJLL.ak();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJL.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61616OGe(InterfaceC56611MJr bannerViewHolderListener, Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater, 1);
        o.LJIIIZ(bannerViewHolderListener, "bannerViewHolderListener");
        this.LJLJJLL = bannerViewHolderListener;
        this.LJLJL = C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup parent) {
        C61617OGf c61617OGf;
        o.LJIIIZ(parent, "parent");
        if (view == null) {
            view = C28289B8j.LIZ(parent, R.layout.an4, parent, false);
            c61617OGf = new C61617OGf(this, view);
            view.setTag(c61617OGf);
        } else {
            Object tag = view.getTag();
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder");
            c61617OGf = (C61617OGf) tag;
        }
        if (getCount() > 0) {
            Banner banner = (Banner) ListProtector.get(this.LJLJL, i);
            if (banner != null && banner != c61617OGf.LJLILLLLZI) {
                c61617OGf.LJLILLLLZI = banner;
                String schema = banner.getSchema();
                if (!TextUtils.isEmpty(schema) && (C56209M4f.LIZ(schema) || !C63081OpJ.LJZ())) {
                    C38499F9b.LIZ.LIZIZ().preloadMiniApp(schema);
                }
                c61617OGf.LJLJI = i;
                Banner banner2 = c61617OGf.LJLILLLLZI;
                o.LJI(banner2);
                if (banner2.getBannerUrl() != null) {
                    Banner banner3 = c61617OGf.LJLILLLLZI;
                    o.LJI(banner3);
                    if (!C79004UzY.LJJIFFI(banner3.getBannerUrl().getUrlList())) {
                        int[] LIZ = J7H.LIZ(600);
                        Banner banner4 = c61617OGf.LJLILLLLZI;
                        o.LJI(banner4);
                        W5F LJII = W5U.LJII(C78939UyV.LJ(banner4.getBannerUrl()));
                        LJII.LJIILIIL(J7H.LIZ(600));
                        LJII.LJIILJJIL(LIZ);
                        LJII.LIZLLL = true;
                        LJII.LIZIZ("BannerViewHolder");
                        LJII.LJJIIJ = c61617OGf.LJLIL;
                        C16880lQ.LLJJJ(LJII);
                    }
                }
                C198747r4 c198747r4 = new C198747r4(C17N.LJIILL(4.0d), c61617OGf.itemView.getContext().getResources().getColor(R.color.br));
                c198747r4.setAlpha(76);
                View findViewById = c61617OGf.itemView.findViewById(R.id.bmq);
                o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.commerce_ad_tag)");
                AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById;
                appCompatTextView.setBackgroundDrawable(c198747r4);
                Banner banner5 = c61617OGf.LJLILLLLZI;
                o.LJI(banner5);
                if (banner5.getAdData() != null) {
                    Banner banner6 = c61617OGf.LJLILLLLZI;
                    o.LJI(banner6);
                    if (banner6.getAdData().getAdLabel() != null) {
                        Banner banner7 = c61617OGf.LJLILLLLZI;
                        o.LJI(banner7);
                        appCompatTextView.setText(banner7.getAdData().getAdLabel().text);
                        appCompatTextView.setVisibility(0);
                    }
                }
                appCompatTextView.setVisibility(8);
            }
            SmartImageView smartImageView = c61617OGf.LJLIL;
            if (smartImageView != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    smartImageView.setForeground(parent.getContext().getDrawable(R.drawable.ani));
                } else {
                    C7FA.LIZIZ(smartImageView);
                }
            }
        }
        return view;
    }
}

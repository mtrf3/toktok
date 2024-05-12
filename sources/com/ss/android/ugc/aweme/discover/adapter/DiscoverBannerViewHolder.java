package com.ss.android.ugc.aweme.discover.adapter;

import X.AV1;
import X.C0C3;
import X.C10K;
import X.C16310kV;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C47261Igj;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C59989NgX;
import X.C60996Nwm;
import X.C61616OGe;
import X.C61620OGi;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73340SqO;
import X.C78866UxK;
import X.C80772Vmy;
import X.C8HX;
import X.C90193gN;
import X.DJR;
import X.EnumC58698N1y;
import X.FMX;
import X.InterfaceC56609MJp;
import X.InterfaceC56611MJr;
import X.LFH;
import X.LFI;
import X.NBY;
import X.O8Z;
import X.ORZ;
import X.OSZ;
import Y.ACallableS8S1101000_10;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.helper.ViewPagerSwitchHelper;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ImpressionSDKSetting;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class DiscoverBannerViewHolder extends JediSimpleViewHolder implements InterfaceC56611MJr, C0C3, InterfaceC56609MJp {
    public static final List<Banner> LJLLJ = C47261Igj.LJJIJIL(new Banner());
    public final TextView LJLIL;
    public final ViewPager LJLILLLLZI;
    public final DJR LJLJI;
    public final View LJLJJI;
    public C61616OGe LJLJJL;
    public final ViewPagerSwitchHelper LJLJJLL;
    public List<? extends Banner> LJLJL;
    public final Context LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final InterfaceC56611MJr LJLLI;
    public int LJLLILLLL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC56611MJr
    public final void ak() {
        this.LJLLI.ak();
    }

    public final void L() {
        EnumC58698N1y enumC58698N1y;
        if (!ImpressionSDKSetting.LIZ().bannerShowImpression.enable) {
            return;
        }
        if (ImpressionSDKSetting.LIZ().bannerShowImpression.useOnePixel) {
            enumC58698N1y = EnumC58698N1y.USE_ONE_PIV;
        } else {
            enumC58698N1y = EnumC58698N1y.USE_HALF;
        }
        C59989NgX c59989NgX = C59989NgX.LIZLLL;
        Context context = this.LJLJLJ;
        o.LJIIIIZZ(context, "context");
        c59989NgX.LIZJ(context, this.itemView, null, new NBY(enumC58698N1y, false, false, 28), new C61620OGi(this));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        N(false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        withState((JediViewModel) this.LJLL.getValue(), new AqS176S0100000_10(this, 42));
    }

    public final void M(int i) {
        if (!this.LJLJL.isEmpty()) {
            List<? extends Banner> list = this.LJLJL;
            Banner banner = (Banner) ListProtector.get(list, i % list.size());
            int size = (i % this.LJLJL.size()) + 1;
            List<? extends Banner> list2 = this.LJLJL;
            C10K.LIZIZ(new ACallableS8S1101000_10(size, banner, C78866UxK.LJJJJLI(((Banner) ListProtector.get(list2, i % list2.size())).getSchema()), 0), FMX.LIZIZ(), null);
            if (banner.isAd()) {
                Context context = this.LJLJLJ;
                int size2 = (i % this.LJLJL.size()) + 1;
                C73340SqO.LJIL().getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("banner_order", Integer.valueOf(size2));
                C59127NIl LIZ = C59128NIm.LIZ();
                LIZ.LIZIZ = "show";
                LIZ.LJII(banner.getLogExtra());
                LIZ.LIZ = "discovery_ad";
                LIZ.LJIIIIZZ("banner");
                LIZ.LIZLLL(Long.valueOf(banner.getCreativeId()));
                LIZ.LIZ(hashMap);
                LIZ.LJIIIZ(context);
                C58655N0h LJ = C58704N2e.LJ("discovery_ad", "show", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), CardStruct.IStatusCode.DEFAULT);
                LJ.LIZJ("banner", "refer");
                LJ.LIZIZ(Integer.valueOf(size2), "banner_order");
                LJ.LJII();
                O8Z.LIZIZ("show", banner.getTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap));
                if (AV1.LJIIJJI()) {
                    C8HX.LIZIZ("ftc_show_banner_ad", "", null);
                }
            }
        }
    }

    public final void N(boolean z) {
        if (z) {
            this.LJLJJLL.startAutoSwitch();
        } else {
            this.LJLJJLL.stopAutoSwitch();
            this.LJLILLLLZI.setOnTouchListener(null);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        DiscoverSectionItem item = (DiscoverSectionItem) obj;
        o.LJIIIZ(item, "item");
        List<Banner> list = ((DiscoverSectionItem.BannerSection) item).bannerList;
        if (o.LJ(list, LJLLJ)) {
            return;
        }
        Context context = this.itemView.getContext();
        OSZ LJJI = LFH.LIZIZ.LIZLLL().LJIIL().LJJI(list.size(), list.size() * 10000);
        int intValue = ((Number) LJJI.getFirst()).intValue();
        int intValue2 = ((Number) LJJI.getSecond()).intValue();
        if (this.LJLJJL == null) {
            this.LJLJJL = new C61616OGe(this, context, C16880lQ.LLZIL(context));
            this.LJLILLLLZI.setAdapter(new C80772Vmy(this.LJLJJL, intValue));
        }
        boolean LIZIZ = C90193gN.LIZIZ(context);
        this.LJLJJLL.setRealCount(list.size());
        C61616OGe c61616OGe = this.LJLJJL;
        o.LJI(c61616OGe);
        if (c61616OGe.LJLJL != list) {
            c61616OGe.LJLJL = list;
            c61616OGe.notifyDataSetChanged();
        }
        this.LJLJI.setUpViewPager(this.LJLILLLLZI);
        DJR djr = this.LJLJI;
        if (list.size() < 2) {
            i = 8;
        } else {
            i = 0;
        }
        djr.setVisibility(i);
        if (LIZIZ) {
            list = ORZ.LLIILII(list);
        }
        this.LJLJL = list;
        if (LIZIZ) {
            intValue2--;
        }
        this.LJLILLLLZI.setCurrentItem(intValue2);
        this.LJLILLLLZI.setCurrentItem(intValue2);
        withState((JediViewModel) this.LJLL.getValue(), new AqS176S0100000_10(this, 178));
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        withState((JediViewModel) this.LJLL.getValue(), new AqS176S0100000_10(this, 41));
    }

    @Override // X.InterfaceC56609MJp
    public final void w5(boolean z) {
        this.LJLJLLL = z;
        if (z && C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.STARTED) >= 0) {
            L();
            M(this.LJLILLLLZI.getCurrentItem());
            N(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverBannerViewHolder(TrendsTabFragment listener, View view) {
        super(view);
        o.LJIIIZ(listener, "listener");
        View findViewById = view.findViewById(R.id.m5k);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_discover)");
        TextView textView = (TextView) findViewById;
        this.LJLIL = textView;
        View findViewById2 = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.viewpager)");
        ViewPager viewPager = (ViewPager) findViewById2;
        this.LJLILLLLZI = viewPager;
        View findViewById3 = view.findViewById(R.id.cf7);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.dot_indicator)");
        DJR djr = (DJR) findViewById3;
        this.LJLJI = djr;
        View findViewById4 = view.findViewById(R.id.kej);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.status_bar)");
        this.LJLJJI = findViewById4;
        this.LJLJL = C61878OQg.INSTANCE;
        Context context = view.getContext();
        this.LJLJLJ = context;
        this.LJLJLLL = true;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendsTabViewModel.class);
        this.LJLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 179));
        this.LJLLI = listener;
        LFI.LIZ(context, textView, viewPager, C60996Nwm.LJIIIIZZ(context));
        this.LJLJJLL = new ViewPagerSwitchHelper(viewPager);
        ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        layoutParams.height = C63081OpJ.LJJJJLI(context2);
        viewPager.addOnPageChangeListener(this);
        C16310kV.LJIIIZ(djr, 0);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        int i = this.LJLLILLLL;
        int i2 = newConfig.screenWidthDp;
        if (i != i2) {
            this.LJLLILLLL = i2;
            LFI.LIZ(this.LJLJLJ, this.LJLIL, this.LJLILLLLZI, C17N.LJIILL(i2));
        }
    }
}

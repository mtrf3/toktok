package X;

import Y.AfS19S0001000_11;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import Y.AfS57S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BdU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29224BdU extends BNR<FeedItem> {
    public static final /* synthetic */ int LJLLJ = 0;
    public final ViewPager LJLJI;
    public final C31500CXw LJLJJI;
    public C29226BdW LJLJJL;
    public final RunnableC29228BdY LJLJJLL;
    public final C29225BdV LJLJL;
    public List<FeedBanner> LJLJLJ;
    public final String LJLJLLL;
    public boolean LJLL;
    public final ViewGroup LJLLI;
    public final String LJLLILLLL;

    @Override // X.BNR
    public final boolean L() {
        return true;
    }

    @Override // X.BNR
    public final void onViewAttachedToWindow() {
        this.LJLIL = true;
        this.LJLL = true;
        C29225BdV c29225BdV = this.LJLJL;
        if (c29225BdV != null) {
            c29225BdV.LJLJJLL = true;
        }
        List<FeedBanner> list = this.LJLJLJ;
        N(list != null && list.size() <= 1);
    }

    @Override // X.BNR
    public final void onViewDetachedFromWindow() {
        this.LJLIL = false;
        this.LJLL = false;
        C29225BdV c29225BdV = this.LJLJL;
        if (c29225BdV != null) {
            c29225BdV.LJLJJLL = false;
        }
        P();
    }

    public final void P() {
        this.LJLJI.removeCallbacks(this.LJLJJLL);
        this.LJLJI.clearOnPageChangeListeners();
        C29225BdV c29225BdV = this.LJLJL;
        if (c29225BdV != null) {
            c29225BdV.LJLJJI = false;
        }
    }

    public final void M(List<FeedBanner> list) {
        int i;
        C29225BdV c29225BdV = this.LJLJL;
        if (c29225BdV != null) {
            i = c29225BdV.LJLJJL;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.LJLL) {
            int size = i % list.size();
            FeedBanner feedBanner = (FeedBanner) ListProtector.get(list, size);
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.LJLJLLL);
            hashMap.put("banner_id", String.valueOf(feedBanner.id));
            hashMap.put("banner_position", String.valueOf(size + 1));
            hashMap.put("banner_page", "more_anchor");
            hashMap.put("tab_type", this.LJLLILLLL);
            hashMap.put("banner_type", "campaign_static");
            hashMap.put("activity_id", C77117UOj.LJIIL(feedBanner));
            hashMap.put("landing_reason", C08680Vs.LJIILJJIL.LJIIJJI);
            BZI LIZ = C28787BRn.LIZ("banner_show");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIIZILJ();
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIIZI();
            }
        }
    }

    public final void N(boolean z) {
        View view;
        ViewPager viewPager;
        if (!this.LJLL || (view = this.itemView) == null || view.getVisibility() != 0) {
            return;
        }
        String str = this.LJLLILLLL;
        String str2 = C08680Vs.LJIILJJIL.LJII;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2)) {
            if (z) {
                M(this.LJLJLJ);
            }
            List<FeedBanner> list = this.LJLJLJ;
            if (list == null || list.size() <= 1 || (viewPager = this.LJLJI) == null || this.LJLJJI == null) {
                return;
            }
            C29225BdV c29225BdV = this.LJLJL;
            if (c29225BdV != null) {
                c29225BdV.LJLJJI = true;
            }
            viewPager.clearOnPageChangeListeners();
            this.LJLJI.addOnPageChangeListener(this.LJLJL);
            this.LJLJJI.setViewPager(this.LJLJI);
            ViewPager viewPager2 = this.LJLJI;
            RunnableC29228BdY runnableC29228BdY = this.LJLJJLL;
            viewPager2.removeCallbacks(runnableC29228BdY);
            viewPager2.postDelayed(runnableC29228BdY, 5000L);
        }
    }

    @Override // X.BNR
    public final void bind(FeedItem feedItem, int i) {
        List<FeedBanner> list;
        List<FeedBanner> list2;
        int i2;
        FeedItem feedItem2 = feedItem;
        if (feedItem2 == null || (list = feedItem2.banners) == null || (list2 = this.LJLJLJ) == list) {
            return;
        }
        if (list2 != null && list2.size() == list.size()) {
            for (int i3 = 0; i3 < list2.size(); i3++) {
                FeedBanner feedBanner = (FeedBanner) ListProtector.get(list2, i3);
                FeedBanner feedBanner2 = (FeedBanner) ListProtector.get(list, i3);
                if ((feedBanner == null || feedBanner.LIZ(feedBanner2)) && (feedBanner2 == null || feedBanner2.LIZ(feedBanner))) {
                }
            }
            return;
        }
        M(list);
        this.LJLJI.removeCallbacks(this.LJLJJLL);
        this.LJLJLJ = list;
        this.LJLJI.setAdapter(null);
        if (!list.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = this.LJLJI.getLayoutParams();
            Iterator<FeedBanner> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    FeedBanner next = it.next();
                    if (next != null && next.width != 0) {
                        i2 = (this.LJLLI.getMeasuredWidth() * next.height) / next.width;
                        break;
                    }
                } else {
                    i2 = 0;
                    break;
                }
            }
            if (i2 != layoutParams.height) {
                layoutParams.height = i2;
                this.LJLJI.setLayoutParams(layoutParams);
            }
            if (this.LJLJJL == null) {
                this.LJLJJL = new C29226BdW(this.itemView.getContext(), C16880lQ.LLZIL(this.itemView.getContext()), this.LJLJLLL);
            }
            C29226BdW c29226BdW = this.LJLJJL;
            List<FeedBanner> list3 = this.LJLJLJ;
            ((ArrayList) c29226BdW.LJLJJLL).clear();
            if (list3 != null) {
                ((ArrayList) c29226BdW.LJLJJLL).addAll(list3);
            }
            c29226BdW.notifyDataSetChanged();
            this.LJLJI.setAdapter(this.LJLJJL);
            if (this.LJLJLJ.size() > 1) {
                ViewPager viewPager = this.LJLJI;
                RunnableC29228BdY runnableC29228BdY = this.LJLJJLL;
                viewPager.removeCallbacks(runnableC29228BdY);
                viewPager.postDelayed(runnableC29228BdY, 5000L);
                this.LJLJI.clearOnPageChangeListeners();
                this.LJLJI.addOnPageChangeListener(this.LJLJL);
                C29225BdV c29225BdV = this.LJLJL;
                if (c29225BdV != null) {
                    c29225BdV.LJLJJI = true;
                }
                this.LJLJJI.setViewPager(this.LJLJI);
                this.LJLJJI.setVisibility(0);
                this.LJLJJI.setCount(list.size());
                this.LJLJI.setCurrentItem((Integer.MAX_VALUE / (this.LJLJLJ.size() * 2)) * this.LJLJLJ.size());
                return;
            }
            this.LJLJJI.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LJLJI.getLayoutParams();
        layoutParams2.height = 0;
        this.LJLJI.setLayoutParams(layoutParams2);
        this.LJLJJL = null;
        this.LJLJJI.setVisibility(8);
    }

    public C29224BdU(View view, FeedDataKey feedDataKey, C73893SzJ<Object> c73893SzJ, C73893SzJ<Object> c73893SzJ2, C73893SzJ<Boolean> c73893SzJ3, ViewGroup viewGroup, String str) {
        super(view);
        this.LJLLILLLL = str;
        this.LJLLI = viewGroup;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.ncx);
        this.LJLJI = viewPager;
        C31500CXw c31500CXw = (C31500CXw) view.findViewById(R.id.el4);
        this.LJLJJI = c31500CXw;
        String str2 = feedDataKey.label;
        this.LJLJLLL = str2;
        RunnableC29228BdY runnableC29228BdY = new RunnableC29228BdY(viewPager);
        this.LJLJJLL = runnableC29228BdY;
        viewPager.removeCallbacks(runnableC29228BdY);
        C29225BdV c29225BdV = new C29225BdV(viewPager, runnableC29228BdY, str2, str);
        this.LJLJL = c29225BdV;
        viewPager.setOnTouchListener(new IDTListenerS115S0100000_5(this, 9));
        c31500CXw.setViewPager(viewPager);
        ViewPager viewPager2 = c31500CXw.LJLLI;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(c29225BdV);
        }
        c73893SzJ3.LJJJLIIL(new AfS36S0101000_5(2, this, 42), new AfS37S0000000_5(4));
        c73893SzJ.LJJJLIIL(new AfS36S0101000_5(2, this, 37), new AfS19S0001000_11(0, 0));
        c73893SzJ2.LJJJLIIL(new AfS57S0100000_5(this, 107), new AfS37S0000000_5(5));
    }
}

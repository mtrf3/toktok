package X;

import Y.IDrS43S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7DC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DC extends PagerAdapter {
    public final Fragment LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final GiftViewModel LJLJJI;
    public final C8ID LJLJJL;
    public final C188487aW LJLJJLL;
    public final boolean LJLJL;
    public final List<GiftPage> LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return view == obj;
    }

    public final C177336xd LJJIII() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this.LJLILLLLZI, null), C177336xd.class, "source_default_key");
        if (LIZLLL == null) {
            return null;
        }
        return (C177336xd) LIZLLL.getSource();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        String pageName = ((GiftPage) ListProtector.get(this.LJLJLJ, i)).getPageName();
        if (pageName != null) {
            return pageName;
        }
        return "";
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        GridLayoutManager gridLayoutManager;
        GiftStruct[] giftStructArr;
        int i2;
        o.LJIIIZ(container, "container");
        int i3 = 0;
        if (C1792271q.LIZ()) {
            gridLayoutManager = new GridLayoutManager(4, 1, false);
        } else {
            gridLayoutManager = new GridLayoutManager(2, 0, false);
        }
        RecyclerView recyclerView = new RecyclerView(this.LJLJI, null);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(gridLayoutManager);
        C76X c76x = new C76X(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, (String) LJIILIIL(i), this.LJLJJLL, this.LJLJL);
        recyclerView.setAdapter(c76x);
        if (!C1792271q.LIZ() || !this.LJLJL) {
            C80097Vc5 c80097Vc5 = new C80097Vc5() { // from class: X.7DF
                @Override // X.C80097Vc5, X.AbstractC80088Vbw
                public final View LIZJ(C0A2 c0a2) {
                    View LIZJ = super.LIZJ(c0a2);
                    if (LIZJ == null) {
                        return null;
                    }
                    return LIZJ;
                }
            };
            if (c80097Vc5.LIZJ > 0) {
                c80097Vc5.LIZJ = 2;
                if (c80097Vc5.LIZLLL > 0) {
                    c80097Vc5.LIZLLL = 4;
                    RecyclerView recyclerView2 = c80097Vc5.LIZ;
                    if (recyclerView2 != recyclerView) {
                        if (recyclerView2 != null) {
                            recyclerView2.LJJLL(c80097Vc5.LIZIZ);
                            c80097Vc5.LIZ.setOnFlingListener(null);
                        }
                        c80097Vc5.LIZ = recyclerView;
                        if (recyclerView.getOnFlingListener() == null) {
                            c80097Vc5.LIZ.LJIIJJI(c80097Vc5.LIZIZ);
                            c80097Vc5.LIZ.setOnFlingListener(c80097Vc5);
                            new Scroller(c80097Vc5.LIZ.getContext(), new DecelerateInterpolator());
                            c80097Vc5.LIZLLL();
                        } else {
                            throw new IllegalStateException("An instance of OnFlingListener already set.");
                        }
                    }
                    recyclerView.LJIIJJI(new IDrS43S0100000_3(this, 14));
                } else {
                    throw new IllegalArgumentException("column must be greater than zero");
                }
            } else {
                throw new IllegalArgumentException("row must be greater than zero");
            }
        }
        c76x.LJLLI = ((GiftPage) ListProtector.get(this.LJLJLJ, i)).getGiftPageType();
        List<GiftStruct> giftList = ((GiftPage) ListProtector.get(this.LJLJLJ, i)).getGiftList();
        if (giftList != null && !giftList.isEmpty()) {
            if (C1792271q.LIZ()) {
                giftStructArr = (GiftStruct[]) giftList.toArray(new GiftStruct[0]);
            } else {
                int size = giftList.size() - 1;
                int i4 = c76x.LJLL;
                int i5 = ((size / i4) + 1) * i4;
                giftStructArr = new GiftStruct[i5];
                for (GiftStruct giftStruct : giftList) {
                    int i6 = i3 + 1;
                    int i7 = c76x.LJLL;
                    int i8 = i3 / i7;
                    int i9 = i3 % i7;
                    int i10 = i7 / 2;
                    if (i9 < i10) {
                        i2 = i9 * 2;
                    } else {
                        i2 = ((i9 - i10) * 2) + 1;
                    }
                    int i11 = (i8 * i7) + i2;
                    if (i11 < i5) {
                        giftStructArr[i11] = giftStruct;
                    }
                    i3 = i6;
                }
            }
            c76x.LJLJL = giftStructArr;
            c76x.notifyDataSetChanged();
        }
        container.addView(recyclerView);
        return recyclerView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        viewPager.removeView(view);
    }

    public C7DC(Fragment fragment, ActivityC45651qj context, GiftViewModel giftViewModel, C8ID loadingIndicator, C188487aW giftRechargeDialogUtil, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(loadingIndicator, "loadingIndicator");
        o.LJIIIZ(giftRechargeDialogUtil, "giftRechargeDialogUtil");
        this.LJLILLLLZI = fragment;
        this.LJLJI = context;
        this.LJLJJI = giftViewModel;
        this.LJLJJL = loadingIndicator;
        this.LJLJJLL = giftRechargeDialogUtil;
        this.LJLJL = z;
        this.LJLJLJ = new ArrayList();
        if (PU1.LJII != null) {
            return;
        }
        C32284Clk c32284Clk = new C32284Clk(C16880lQ.LLLLLILLIL(context));
        c32284Clk.LJ = 2;
        c32284Clk.LIZJ = 2;
        c32284Clk.LIZLLL = 5;
        PU1.LJII = c32284Clk.LIZ();
    }
}

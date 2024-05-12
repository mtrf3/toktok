package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83198Wl0 implements InterfaceC83268Wm8 {
    public final LinearLayout LIZ;
    public final C81227VuJ LIZIZ;
    public final C81227VuJ LIZJ;
    public final TextView LIZLLL;
    public final TextView LJ;
    public final HashMap<C81227VuJ, ComposerBeautyExtraBeautify.ItemsBean> LJFF;
    public final Context LJI;
    public final View LJII;
    public final C83232WlY LJIIIIZZ;
    public final C83195Wkx LJIIIZ;

    public final void LJ() {
        ComposerBeauty LJ;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) this.LJIIIZ.LIZLLL.LIZJ(InterfaceC83247Wln.class);
        if (interfaceC83247Wln != null) {
            if (interfaceC83247Wln.LJI()) {
                LJ = interfaceC83247Wln.LJIIJ();
            } else {
                LJ = interfaceC83247Wln.LJ();
            }
            if (LJ != null && (beautifyExtra = LJ.getBeautifyExtra()) != null && (items = beautifyExtra.getItems()) != null && items.size() == 2) {
                this.LJIIIIZZ.getClass();
            }
        }
    }

    @Override // X.InterfaceC83268Wm8
    public final void LIZIZ(boolean z) {
        if (z) {
            this.LIZ.setVisibility(0);
            LJ();
            C81227VuJ secondPbProgressBar = this.LIZJ;
            o.LJIIIIZZ(secondPbProgressBar, "secondPbProgressBar");
            secondPbProgressBar.setVisibility(8);
            return;
        }
        this.LIZ.setVisibility(8);
    }

    @Override // X.InterfaceC83268Wm8
    public final void LIZJ(int i) {
        this.LIZIZ.setPercent(i);
    }

    public final void LIZLLL(C81227VuJ c81227VuJ) {
        C83264Wm4 c83264Wm4 = this.LJIIIIZZ.LJII;
        int LIZIZ = C06690Ob.LIZIZ(this.LJII.getResources(), c83264Wm4.LIZ, this.LJI.getTheme());
        int LIZIZ2 = C06690Ob.LIZIZ(this.LJII.getResources(), c83264Wm4.LIZIZ, this.LJI.getTheme());
        int LIZIZ3 = C06690Ob.LIZIZ(this.LJII.getResources(), R.color.acm, this.LJI.getTheme());
        c81227VuJ.LJZL = LIZIZ;
        c81227VuJ.LL = LIZIZ2;
        c81227VuJ.LLFII = LIZIZ3;
        c81227VuJ.LJII(false);
        c81227VuJ.setDefaultCircleConfig(R.color.acm);
        c81227VuJ.setSuggestCircleColor(R.color.acm);
        Context context = c81227VuJ.getContext();
        o.LJIIIIZZ(context, "seekBar.context");
        c81227VuJ.setBarHeight(C74275TDb.LIZIZ(context, c83264Wm4.LIZJ));
        Context context2 = c81227VuJ.getContext();
        o.LJIIIIZZ(context2, "seekBar.context");
        float f = c83264Wm4.LIZLLL;
        Resources resources = context2.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        c81227VuJ.setTextSize(TypedValue.applyDimension(2, f, resources.getDisplayMetrics()));
        Context context3 = c81227VuJ.getContext();
        o.LJIIIIZZ(context3, "seekBar.context");
        c81227VuJ.setBarPadding(C74275TDb.LIZIZ(context3, 11.0f));
        c81227VuJ.setOnLevelChangeListener(new C83200Wl2(this, c81227VuJ));
    }

    public C83198Wl0(Context context, View parent, C83232WlY viewConfig, C83195Wkx business) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewConfig, "viewConfig");
        o.LJIIIZ(business, "business");
        this.LJI = context;
        this.LJII = parent;
        this.LJIIIIZZ = viewConfig;
        this.LJIIIZ = business;
        View findViewById = parent.findViewById(R.id.j4g);
        o.LJIIIIZZ(findViewById, "parent.findViewById(R.id…auty_list_seek_container)");
        this.LIZ = (LinearLayout) findViewById;
        this.LIZIZ = (C81227VuJ) parent.findViewById(R.id.hjp);
        this.LIZJ = (C81227VuJ) parent.findViewById(R.id.hjq);
        View findViewById2 = parent.findViewById(R.id.mje);
        o.LJIIIIZZ(findViewById2, "parent.findViewById(R.id.tv_seek_bar_title_first)");
        this.LIZLLL = (TextView) findViewById2;
        View findViewById3 = parent.findViewById(R.id.mjf);
        o.LJIIIIZZ(findViewById3, "parent.findViewById(R.id.tv_seek_bar_title_second)");
        this.LJ = (TextView) findViewById3;
        this.LJFF = new HashMap<>();
    }

    @Override // X.InterfaceC83268Wm8
    public final void LIZ(ComposerBeauty beautyBean, boolean z, boolean z2, boolean z3) {
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        o.LJIIIZ(beautyBean, "beautyBean");
        if (z) {
            if (beautyBean.isBeautyMode()) {
                C83195Wkx c83195Wkx = this.LJIIIZ;
                c83195Wkx.getClass();
                c83195Wkx.LIZ.u7(beautyBean);
            } else {
                C83195Wkx c83195Wkx2 = this.LJIIIZ;
                c83195Wkx2.getClass();
                c83195Wkx2.LIZ.N7(beautyBean, new C83196Wky(c83195Wkx2));
            }
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = beautyBean.getBeautifyExtra().getItems();
            if (items != null && (!items.isEmpty())) {
                boolean doubleDirection = ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getDoubleDirection();
                C83195Wkx c83195Wkx3 = this.LJIIIZ;
                String tag = ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getTag();
                float value = ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getValue();
                c83195Wkx3.getClass();
                C83169WkX LIZIZ = C83168WkW.LIZIZ(new C83169WkX(doubleDirection, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMax(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMin(), c83195Wkx3.LIZ.U7(beautyBean, tag, value), 0, 0.0f, 1932));
                if (((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getDoubleDirection()) {
                    this.LIZIZ.LJFF(50, -50);
                } else {
                    this.LIZIZ.LJFF(100, 0);
                }
                this.LIZIZ.setPercent(LIZIZ.LJFF);
                this.LJIIIIZZ.getClass();
                this.LIZLLL.setVisibility(8);
                this.LJ.setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items2 = beautyBean.getBeautifyExtra().getItems();
                if (items2 != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) ORZ.LJLLJ(items2)) != null) {
                    C81227VuJ pbProgressBar = this.LIZIZ;
                    o.LJIIIIZZ(pbProgressBar, "pbProgressBar");
                    C83169WkX LIZIZ2 = C83168WkW.LIZIZ(new C83169WkX(itemsBean.getDoubleDirection(), itemsBean.getMax(), itemsBean.getMin(), itemsBean.getValue(), 0, 0.0f, 1932));
                    boolean doubleDirection2 = itemsBean.getDoubleDirection();
                    int i = LIZIZ2.LJFF;
                    if (!doubleDirection2 && i == 0) {
                        pbProgressBar.setNeedShowSuggestCircle(false);
                    } else {
                        pbProgressBar.setNeedShowSuggestCircle(true);
                    }
                    pbProgressBar.setSuggestPercent(LIZIZ2.LJFF);
                }
            }
            LJ();
        }
    }
}

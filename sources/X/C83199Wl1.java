package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83199Wl1 {
    public final InterfaceC83142Wk6 LIZ;
    public final C83207Wl9 LIZIZ;

    public final void LIZJ() {
        ComposerBeauty curSelectBeauty;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        C83207Wl9 c83207Wl9 = this.LIZIZ;
        if (c83207Wl9.LLIFFJFJJ) {
            curSelectBeauty = c83207Wl9.getCurSelectAlbumBeauty();
        } else {
            curSelectBeauty = c83207Wl9.getCurSelectBeauty();
        }
        if (curSelectBeauty != null && (beautifyExtra = curSelectBeauty.getBeautifyExtra()) != null && (items = beautifyExtra.getItems()) != null && items.size() == 2) {
            this.LIZIZ.getViewConfig();
        }
    }

    public static List LIZ(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(items, 10));
            Iterator<ComposerBeautyExtraBeautify.ItemsBean> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTag());
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final void LIZIZ(C81227VuJ c81227VuJ) {
        C83264Wm4 c83264Wm4 = this.LIZIZ.getViewConfig().LJII;
        Resources resources = this.LIZIZ.getResources();
        int i = c83264Wm4.LIZ;
        Context context = this.LIZIZ.getContext();
        o.LJIIIIZZ(context, "beautyViewImpl.context");
        int LIZIZ = C06690Ob.LIZIZ(resources, i, context.getTheme());
        Resources resources2 = this.LIZIZ.getResources();
        int i2 = c83264Wm4.LIZIZ;
        Context context2 = this.LIZIZ.getContext();
        o.LJIIIIZZ(context2, "beautyViewImpl.context");
        int LIZIZ2 = C06690Ob.LIZIZ(resources2, i2, context2.getTheme());
        Resources resources3 = this.LIZIZ.getResources();
        Context context3 = this.LIZIZ.getContext();
        o.LJIIIIZZ(context3, "beautyViewImpl.context");
        int LIZIZ3 = C06690Ob.LIZIZ(resources3, R.color.acm, context3.getTheme());
        c81227VuJ.LJZL = LIZIZ;
        c81227VuJ.LL = LIZIZ2;
        c81227VuJ.LLFII = LIZIZ3;
        c81227VuJ.LJII(false);
        c81227VuJ.setDefaultCircleConfig(R.color.acm);
        c81227VuJ.setSuggestCircleColor(R.color.acm);
        Context context4 = c81227VuJ.getContext();
        o.LJIIIIZZ(context4, "seekBar.context");
        c81227VuJ.setBarHeight(C74275TDb.LIZIZ(context4, c83264Wm4.LIZJ));
        Context context5 = c81227VuJ.getContext();
        o.LJIIIIZZ(context5, "seekBar.context");
        float f = c83264Wm4.LIZLLL;
        Resources resources4 = context5.getResources();
        o.LJIIIIZZ(resources4, "context.resources");
        c81227VuJ.setTextSize(TypedValue.applyDimension(2, f, resources4.getDisplayMetrics()));
        Context context6 = c81227VuJ.getContext();
        o.LJIIIIZZ(context6, "seekBar.context");
        c81227VuJ.setBarPadding(C74275TDb.LIZIZ(context6, 11.0f));
        c81227VuJ.setOnLevelChangeListener(new C83201Wl3(this, c81227VuJ));
    }

    public C83199Wl1(InterfaceC83142Wk6 source, C83207Wl9 beautyViewImpl) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(beautyViewImpl, "beautyViewImpl");
        this.LIZ = source;
        this.LIZIZ = beautyViewImpl;
        new HashMap();
    }

    public final void LIZLLL(ComposerBeauty beautyBean, boolean z, boolean z2) {
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        o.LJIIIZ(beautyBean, "beautyBean");
        if (z) {
            this.LIZ.N7(beautyBean, new C83205Wl7(this));
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = beautyBean.getBeautifyExtra().getItems();
            if (items != null && (!items.isEmpty())) {
                C83169WkX LIZIZ = C83168WkW.LIZIZ(new C83169WkX(((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getDoubleDirection(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMax(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMin(), this.LIZ.U7(beautyBean, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getTag(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getValue()), 0, 0.0f, 1932));
                if (((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getDoubleDirection()) {
                    this.LIZIZ.getPbProgressBar().LJFF(50, -50);
                } else {
                    this.LIZIZ.getPbProgressBar().LJFF(100, 0);
                }
                this.LIZIZ.getPbProgressBar().setPercent(LIZIZ.LJFF);
                this.LIZIZ.getViewConfig();
                this.LIZIZ.getTvFirstPbTitle().setVisibility(8);
                this.LIZIZ.getTvSecondPbTitle().setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items2 = beautyBean.getBeautifyExtra().getItems();
                if (items2 != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) ORZ.LJLLJ(items2)) != null) {
                    C81227VuJ pbProgressBar = this.LIZIZ.getPbProgressBar();
                    C83169WkX LIZIZ2 = C83168WkW.LIZIZ(new C83169WkX(itemsBean.getDoubleDirection(), itemsBean.getMax(), itemsBean.getMin(), itemsBean.getValue(), 0, 0.0f, 1932));
                    if (!itemsBean.getDoubleDirection() && LIZIZ2.LJFF == 0) {
                        pbProgressBar.setNeedShowSuggestCircle(false);
                    } else {
                        pbProgressBar.setNeedShowSuggestCircle(true);
                    }
                    pbProgressBar.setSuggestPercent(LIZIZ2.LJFF);
                }
            }
            LIZJ();
        }
    }
}

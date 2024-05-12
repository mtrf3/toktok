package X;

import Y.ACListenerS35S0300000_9;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.LLh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54105LLh extends LLQ {
    public final C54134LMk LIZJ;
    public final Context LIZLLL;
    public final String LJ;
    public final LinkedHashMap<String, AbstractC54111LLn> LJFF;
    public final C8RO LJI;

    @Override // X.LLQ
    public final View LJIIJJI() {
        C54113LLp c54113LLp;
        View LJIIJ = LJIIJ("NOTIFICATION");
        if ((LJIIJ instanceof C54113LLp) && (c54113LLp = (C54113LLp) LJIIJ) != null) {
            return c54113LLp.getTabIcon();
        }
        return LJIIJ;
    }

    @Override // X.LLQ
    public final View LJIIL() {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("PUBLISH");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LJIIIZ();
            return abstractC54111LLn.LIZ.getTabIcon();
        }
        return null;
    }

    @Override // X.LLQ
    public final View LJIILIIL() {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("PUBLISH");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LJIIJJI();
            return abstractC54111LLn.LIZ.getTabTitleView();
        }
        return null;
    }

    @Override // X.LLQ
    public final CharSequence LJIILJJIL() {
        C54113LLp c54113LLp;
        View LJIIJ = LJIIJ("Nearby");
        if (!(LJIIJ instanceof C54113LLp) || (c54113LLp = (C54113LLp) LJIIJ) == null) {
            return null;
        }
        return c54113LLp.getTitleText();
    }

    @Override // X.LLQ
    public final void LJIJI() {
        LH3 lh32 = HomeTabViewModel.LJLJLLL;
        Context context = this.LIZLLL;
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LJJJ(lh32.LIZ((ActivityC45651qj) context).gv0());
        Context context2 = this.LIZLLL;
        o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        String nv0 = C116694i1.LIZ((ActivityC45651qj) context2).nv0();
        if (nv0 == null) {
            nv0 = "HOME";
        }
        for (Map.Entry<String, AbstractC54111LLn> entry : this.LJFF.entrySet()) {
            String key = entry.getKey();
            AbstractC54111LLn value = entry.getValue();
            if (o.LJ(key, nv0)) {
                value.LJIJJLI();
            } else {
                value.LJJIFFI();
            }
        }
        LJJIL(nv0, null);
        LJJJJL(nv0);
    }

    @Override // X.LLQ
    public final void LJIL() {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("PUBLISH");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LJIILLIIL();
        }
    }

    @Override // X.LLQ
    public final void LJJII() {
        C54113LLp c54113LLp;
        ImageView imageView;
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("SHOP_MALL");
        if (abstractC54111LLn == null || (imageView = (c54113LLp = abstractC54111LLn.LIZ).LJLLILLLL) == null) {
            return;
        }
        if (C78996UzQ.LJJIIJZLJL(imageView)) {
            C78996UzQ.LJI();
        }
        c54113LLp.removeView(imageView);
        c54113LLp.LJLLILLLL = null;
        ImageView imageView2 = c54113LLp.LJLJJI;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
        imageView2.setAlpha(1.0f);
        imageView2.setScaleX(1.0f);
        imageView2.setScaleY(1.0f);
    }

    @Override // X.LLQ
    public final void LJJIJIL() {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("PUBLISH");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LJJI();
        }
    }

    public int LJJJIL() {
        return C04330Ez.LIZIZ(this.LIZLLL, R.color.cz);
    }

    public final void LJJJJJL() {
        Collection<AbstractC54111LLn> values = this.LJFF.values();
        o.LJIIIIZZ(values, "iconTabLogicMap.values");
        Iterator<AbstractC54111LLn> it = values.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ();
        }
    }

    public C54105LLh(C54134LMk mainBottomTabView) {
        o.LJIIIZ(mainBottomTabView, "mainBottomTabView");
        this.LIZJ = mainBottomTabView;
        this.LJ = "Daily Mix";
        this.LJFF = new LinkedHashMap<>();
        this.LJI = new C8RO("BottomTab");
        Context context = mainBottomTabView.getContext();
        o.LJIIIIZZ(context, "mainBottomTabView.context");
        this.LIZLLL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.LLQ
    public void LIZJ(ActivityC45651qj activityC45651qj) {
        String str;
        Context context = this.LIZLLL;
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) context;
        TabChangeManager LIZ = C116694i1.LIZ(activityC45651qj2);
        LH3 lh32 = HomeTabViewModel.LJLJLLL;
        Context context2 = this.LIZLLL;
        o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        List<InterfaceC54080LKi> gv0 = lh32.LIZ((ActivityC45651qj) context2).gv0();
        Intent intent = activityC45651qj2.getIntent();
        if (intent == null || (str = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) == null) {
            str = "";
        }
        int size = gv0.size();
        int i = 0;
        while (true) {
            if (i < size) {
                InterfaceC54080LKi interfaceC54080LKi = (InterfaceC54080LKi) ListProtector.get(gv0, i);
                if ((interfaceC54080LKi instanceof AbstractC53895LDf) && o.LJ(str, interfaceC54080LKi.tag())) {
                    AbstractC53895LDf abstractC53895LDf = (AbstractC53895LDf) interfaceC54080LKi;
                    if (abstractC53895LDf.LJIIJ() != null) {
                        LIZ.gv0(abstractC53895LDf.LJIIIZ(), interfaceC54080LKi.tag(), abstractC53895LDf.LJIIJ());
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int size2 = gv0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InterfaceC54080LKi interfaceC54080LKi2 = (InterfaceC54080LKi) ListProtector.get(gv0, i2);
            if ((interfaceC54080LKi2 instanceof AbstractC53895LDf) && i != i2) {
                AbstractC53895LDf abstractC53895LDf2 = (AbstractC53895LDf) interfaceC54080LKi2;
                if (abstractC53895LDf2.LJIIJ() != null) {
                    LIZ.gv0(((AbstractC53895LDf) interfaceC54080LKi2).LJIIIZ(), interfaceC54080LKi2.tag(), abstractC53895LDf2.LJIIJ());
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("tab", "UNLOGIN_NOTIFICATION");
        LIZ.gv0(bundle, "UNLOGIN_NOTIFICATION", UnloginSignUpFragment.class);
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab", "UNLOGIN_PROFILE");
        LIZ.gv0(bundle2, "UNLOGIN_PROFILE", UnloginSignUpFragment.class);
        C56672Kh.LIZ().LIZLLL("mainpage_fragment_update_bottom_view");
        LH3 lh33 = HomeTabViewModel.LJLJLLL;
        Context context3 = this.LIZLLL;
        o.LJII(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LJJJ(lh33.LIZ((ActivityC45651qj) context3).gv0());
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "mainpage_fragment_update_bottom_view");
    }

    @Override // X.LLQ
    public void LIZLLL(boolean z) {
        if (z) {
            this.LIZJ.setBackgroundColor(LJJJIL());
        } else {
            this.LIZJ.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LIZLLL));
        }
        C8RO c8ro = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeBackground, current style is dark? ");
        LIZ.append(z);
        c8ro.LIZLLL(X1D.LIZIZ(LIZ));
    }

    @Override // X.LLQ
    public final void LJI(boolean z) {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("HOME");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LIZLLL(z);
        }
    }

    @Override // X.LLQ
    public final View LJIIIIZZ(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            return abstractC54111LLn.LJIIL();
        }
        return null;
    }

    @Override // X.LLQ
    public final int LJIIIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            return abstractC54111LLn.LJI;
        }
        return 0;
    }

    @Override // X.LLQ
    public final View LJIIJ(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            return abstractC54111LLn.LIZ;
        }
        return null;
    }

    @Override // X.LLQ
    public final void LJIILL(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            if (!abstractC54111LLn.LJIIJ) {
                ImageView LJ = abstractC54111LLn.LJ();
                if (LJ != null) {
                    C54113LLp c54113LLp = abstractC54111LLn.LIZ;
                    c54113LLp.getClass();
                    c54113LLp.LJLJJLL = LJ;
                    c54113LLp.addView(LJ);
                }
                abstractC54111LLn.LJIIJ = true;
            }
            abstractC54111LLn.LIZ.setTabDotVisibility(8);
        }
    }

    @Override // X.LLQ
    public final boolean LJIIZILJ(String tag) {
        ImageView imageView;
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn == null || (imageView = abstractC54111LLn.LIZ.LJLJJLL) == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.LLQ
    public final void LJIJJ(String str) {
        LH3 lh32 = HomeTabViewModel.LJLJLLL;
        Context context = this.LIZLLL;
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        List<InterfaceC54080LKi> gv0 = lh32.LIZ((ActivityC45651qj) context).gv0();
        int size = gv0.size();
        for (int i = 0; i < size; i++) {
            InterfaceC54080LKi interfaceC54080LKi = (InterfaceC54080LKi) ListProtector.get(gv0, i);
            if (o.LJ(interfaceC54080LKi.tag(), str)) {
                Context context2 = this.LIZJ.getContext();
                o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                LJJJJJ(interfaceC54080LKi, C84193Sd.LIZ((ActivityC45651qj) context2), true);
                return;
            }
        }
    }

    @Override // X.LLQ
    public final void LJIJJLI(String tag) {
        PublishTabAbility LJJJJJ;
        o.LJIIIZ(tag, "tag");
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        Activity LIZ = C27740Aue.LIZ(this.LIZLLL);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) LIZ;
        ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(activityC45651qj);
        LIZ2.getClass();
        LIZ2.LJLLJ.setValue(tag);
        ScrollSwitchStateManager LIZ3 = C84193Sd.LIZ(activityC45651qj);
        LIZ3.getClass();
        LIZ3.LJLLILLLL.setValue(new OSZ<>(tag, Boolean.FALSE));
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj);
        if (LJJLIIIJJI != null && (LJJJJJ = C77357UXp.LJJJJJ(LJJLIIIJJI)) != null) {
            LJJJJJ.OR();
        }
    }

    @Override // X.LLQ
    public final void LJJ(String str) {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(str);
        if (abstractC54111LLn == null || abstractC54111LLn.LJFF) {
            return;
        }
        abstractC54111LLn.LJFF = true;
        abstractC54111LLn.LJIJ();
    }

    @Override // X.LLQ
    public final void LJJI(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn == null || !abstractC54111LLn.LJFF) {
            return;
        }
        abstractC54111LLn.LJFF = false;
        abstractC54111LLn.LJIJI();
    }

    @Override // X.LLQ
    public final void LJJIFFI(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LJIIIZ();
            abstractC54111LLn.LIZ.LIZIZ();
        }
    }

    @Override // X.LLQ
    public final void LJJIII(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            C54113LLp c54113LLp = abstractC54111LLn.LIZ;
            ImageView imageView = c54113LLp.LJLLILLLL;
            if (imageView != null) {
                imageView.clearAnimation();
                if (C78996UzQ.LJJIIJZLJL(imageView)) {
                    C78996UzQ.LJI();
                }
                c54113LLp.removeView(imageView);
                c54113LLp.LJLLILLLL = null;
            }
            ImageView imageView2 = c54113LLp.LJLJJI;
            if (imageView2 != null) {
                imageView2.clearAnimation();
                imageView2.setVisibility(0);
            }
        }
    }

    @Override // X.LLQ
    public final void LJJIIJ(String str) {
        L7P l7p;
        for (Map.Entry<String, AbstractC54111LLn> entry : this.LJFF.entrySet()) {
            String key = entry.getKey();
            AbstractC54111LLn value = entry.getValue();
            if (o.LJ(key, str)) {
                value.LJIJJLI();
            } else {
                value.LJJIFFI();
            }
            if (!o.LJ(key, "PUBLISH")) {
                if (LJJJJIZL(str)) {
                    l7p = L7P.DARK;
                } else {
                    l7p = L7P.LIGHT;
                }
                value.LJIL(l7p);
            }
        }
        LJJJJL(str);
    }

    @Override // X.LLQ
    public final void LJJIIJZLJL(float f) {
        TuxTextView tabTitleView;
        Collection<AbstractC54111LLn> values = this.LJFF.values();
        o.LJIIIIZZ(values, "iconTabLogicMap.values");
        Iterator<AbstractC54111LLn> it = values.iterator();
        while (it.hasNext()) {
            C54113LLp c54113LLp = it.next().LIZ;
            if ((c54113LLp instanceof C54113LLp) && c54113LLp != null && (tabTitleView = c54113LLp.getTabTitleView()) != null && tabTitleView.getTextSize() != f) {
                tabTitleView.setTextSize(0, f);
            }
        }
    }

    @Override // X.LLQ
    public final void LJJIIZ(C55949LxZ c55949LxZ) {
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get("SHOP_MALL");
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LIZ.setCustomViewAnimation$homepage_common_release(c55949LxZ);
        }
    }

    @Override // X.LLQ
    public final void LJJIJIIJI(int i) {
        this.LIZJ.setVisibility(i);
    }

    @Override // X.LLQ
    public final void LJJIJIIJIL(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            if (!abstractC54111LLn.LJIIJ) {
                ImageView LJ = abstractC54111LLn.LJ();
                if (LJ != null) {
                    C54113LLp c54113LLp = abstractC54111LLn.LIZ;
                    c54113LLp.getClass();
                    c54113LLp.LJLJJLL = LJ;
                    c54113LLp.addView(LJ);
                }
                abstractC54111LLn.LJIIJ = true;
            }
            abstractC54111LLn.LIZ.setTabDotVisibility(0);
        }
    }

    @Override // X.LLQ
    public final void LJJIJL(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LIZ.getClass();
        }
    }

    @Override // X.LLQ
    public void LJJJ(List<? extends InterfaceC54080LKi> tabList) {
        C54113LLp c54113LLp;
        AbstractC54111LLn c54112LLo;
        o.LJIIIZ(tabList, "tabList");
        int i = C61447O9r.LJIIJJI;
        C54134LMk c54134LMk = this.LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(i));
        layoutParams.gravity = 8388691;
        c54134LMk.setLayoutParams(layoutParams);
        if (C57092Lx.LIZ.LJ.LIZJ == null) {
            this.LIZJ.post(new ARunnableS45S0100000_9(this, 224));
        }
        this.LIZJ.setPadding(0, 0, 0, 0);
        this.LIZJ.setOrientation(0);
        if (this.LIZJ.getChildCount() > 0) {
            this.LIZJ.removeAllViews();
        }
        int LIZIZ = C7MY.LIZIZ(4);
        int LIZIZ2 = C7MY.LIZIZ(6);
        if (i == C61447O9r.LJIIJ) {
            LIZIZ2 = AnonymousClass391.LIZ(1.5d);
            LIZIZ = 0;
        }
        Iterator<? extends InterfaceC54080LKi> it = tabList.iterator();
        int i2 = 0;
        while (true) {
            Drawable drawable = null;
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 + 1;
            InterfaceC54080LKi next = it.next();
            View LJFF = next.LJFF(C54101LLd.LIZ);
            if ((LJFF instanceof C54113LLp) && (c54113LLp = (C54113LLp) LJFF) != null) {
                this.LJI.LIZLLL("updateView, current bottom tab tag:" + next.tag() + ", title:" + next.LIZ());
                if (((Boolean) C35183DrP.LIZLLL.getValue()).booleanValue()) {
                    c54112LLo = c54113LLp.getIconTabLogic();
                    if (c54112LLo == null) {
                        if (o.LJ(next.tag(), "PUBLISH")) {
                            c54112LLo = new C54114LLq(c54113LLp);
                        } else {
                            o.LJ(next.tag(), "HOME");
                            if (o.LJ(next.tag(), "Nearby")) {
                                c54112LLo = new C54116LLs(c54113LLp);
                            } else {
                                c54112LLo = new C54112LLo(c54113LLp);
                            }
                        }
                    }
                } else if (o.LJ(next.tag(), "PUBLISH")) {
                    c54112LLo = new C54114LLq(c54113LLp);
                } else {
                    o.LJ(next.tag(), "HOME");
                    if (o.LJ(next.tag(), "Nearby")) {
                        c54112LLo = new C54116LLs(c54113LLp);
                    } else {
                        c54112LLo = new C54112LLo(c54113LLp);
                    }
                }
                this.LJFF.put(next.tag(), c54112LLo);
                LH3 lh32 = HomeTabViewModel.LJLJLLL;
                Context context = this.LIZLLL;
                o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                HomeTabViewModel LIZ = lh32.LIZ((ActivityC45651qj) context);
                String tabName = next.tag();
                LIZ.getClass();
                o.LJIIIZ(tabName, "tabName");
                LIZ.LJLILLLLZI.put(tabName, next);
                Context context2 = this.LIZLLL;
                o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                c54113LLp.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0300000_9(this, next, C84193Sd.LIZ((ActivityC45651qj) context2), 5)));
                if (!o.LJ(next.tag(), "PUBLISH")) {
                    if (C54103LLf.LIZ < 0) {
                        int LIZ2 = C00F.LIZ(31744, 0, "bottom_tab_animation_optimization", true);
                        C54103LLf.LIZ = LIZ2;
                        if (LIZ2 < 0) {
                            C54103LLf.LIZ = 0;
                        }
                    }
                    int i4 = C54103LLf.LIZ;
                    if (i4 != 1) {
                        if (i4 < 0) {
                            int LIZ3 = C00F.LIZ(31744, 0, "bottom_tab_animation_optimization", true);
                            C54103LLf.LIZ = LIZ3;
                            if (LIZ3 < 0) {
                                C54103LLf.LIZ = 0;
                            }
                        }
                        if (C54103LLf.LIZ != 2) {
                            try {
                                drawable = C04270Et.LIZIZ(this.LIZJ.getContext(), R.drawable.ava);
                            } catch (Throwable unused) {
                            }
                            if (drawable != null) {
                                c54113LLp.setBackground(drawable);
                            }
                        }
                    }
                    c54113LLp.setPadding(0, LIZIZ, 0, LIZIZ2);
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                layoutParams2.weight = 1.0f;
                c54113LLp.setLayoutParams(layoutParams2);
                LJJJJI(c54113LLp, i2, next.tag());
                this.LIZJ.addView(c54113LLp);
            }
            i2 = i3;
        }
        String nv0 = C116694i1.LIZ(C45804HyK.LJJIFFI(this.LIZLLL)).nv0();
        if (nv0 != null && !o.LJ(nv0, "HOME")) {
            AbstractC54111LLn abstractC54111LLn = this.LJFF.get(nv0);
            if (abstractC54111LLn != null) {
                abstractC54111LLn.LJIJJLI();
            }
            AbstractC54111LLn abstractC54111LLn2 = this.LJFF.get("HOME");
            if (abstractC54111LLn2 != null) {
                abstractC54111LLn2.LJJIFFI();
            }
            LJJIL(nv0, null);
            LJJJJL(nv0);
        }
        LFQ.LIZ(LLZ.LJLIL);
    }

    public final boolean LJJJJIZL(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC36571c5 mv0;
        boolean z4;
        InterfaceC54054LJi interfaceC54054LJi;
        if (o.LJ(str, "HOME")) {
            LH3 lh32 = HomeTabViewModel.LJLJLLL;
            Context context = this.LIZLLL;
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (!lh32.LIZIZ((ActivityC45651qj) context)) {
                z = true;
                if (!o.LJ(str, "Following") || o.LJ(str, "FRIENDS_TAB") || (o.LJ(str, "Nearby") && NearbyFeedServiceImpl.LJJI().LJI())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!o.LJ(str, "MUSIC_DSP") && o.LJ(this.LJ, "Daily Mix")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Context context2 = this.LIZLLL;
                o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                mv0 = C116694i1.LIZ((ActivityC45651qj) context2).mv0();
                if (!(mv0 instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) mv0) != null) {
                    z4 = interfaceC54054LJi.Qc(35);
                } else {
                    z4 = false;
                }
                C8RO c8ro = this.LJI;
                StringBuilder LIZLLL = C00F.LIZLLL("isDarkBgStyleTab: home:", z, ", explore:", z4, ", isInSecondTab:");
                LIZLLL.append(z2);
                LIZLLL.append(", isInMusicTab:");
                LIZLLL.append(z3);
                c8ro.LIZLLL(X1D.LIZIZ(LIZLLL));
                if ((z || z4) && !z2 && !z3) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (!o.LJ(str, "Following")) {
        }
        z2 = true;
        if (!o.LJ(str, "MUSIC_DSP")) {
        }
        z3 = false;
        Context context22 = this.LIZLLL;
        o.LJII(context22, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mv0 = C116694i1.LIZ((ActivityC45651qj) context22).mv0();
        if (!(mv0 instanceof InterfaceC54054LJi)) {
        }
        z4 = false;
        C8RO c8ro2 = this.LJI;
        StringBuilder LIZLLL2 = C00F.LIZLLL("isDarkBgStyleTab: home:", z, ", explore:", z4, ", isInSecondTab:");
        LIZLLL2.append(z2);
        LIZLLL2.append(", isInMusicTab:");
        LIZLLL2.append(z3);
        c8ro2.LIZLLL(X1D.LIZIZ(LIZLLL2));
        if (z) {
        }
        return false;
    }

    public final void LJJJJL(String str) {
        AbstractC54111LLn abstractC54111LLn;
        AbstractC54111LLn abstractC54111LLn2;
        if (!LJJJJIZL(str) && C57092Lx.LIZ.LJFF) {
            LIZLLL(false);
            LJJJJJL();
            if (str != null && (abstractC54111LLn2 = this.LJFF.get(str)) != null) {
                abstractC54111LLn2.LIZLLL(false);
                return;
            }
            return;
        }
        LIZLLL(LJJJJIZL(str));
        LJJJJJL();
        if (str != null && (abstractC54111LLn = this.LJFF.get(str)) != null) {
            abstractC54111LLn.LIZLLL(LJJJJIZL(str));
        }
    }

    @Override // X.LLQ
    public final void LIZ(String tag, InterfaceC88472Yns<? super Context, ? extends View> viewCreateLogic) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(viewCreateLogic, "viewCreateLogic");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LIZ(viewCreateLogic);
        }
    }

    @Override // X.LLQ
    public final void LIZIZ(String tag, UrlModel urlModel) {
        ImageView imageView;
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            C54113LLp c54113LLp = abstractC54111LLn.LIZ;
            if (c54113LLp.LJLL != null) {
                c54113LLp.getClass();
                ImageView imageView2 = c54113LLp.LJLL;
                if (imageView2 != null && imageView2.getVisibility() == 8 && (imageView = c54113LLp.LJLL) != null) {
                    C17N.LJJLIIIJJI(imageView);
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LJIILIIL = new ColorDrawable(0);
                LJII.LJJIIJZLJL = c54113LLp.LJLL;
                S3I s3i = new S3I();
                s3i.LIZ = true;
                LJII.LJIJJLI = new S3L(s3i);
                LJII.LIZLLL(c54113LLp.LJLLL);
                return;
            }
            ImageView LJFF = abstractC54111LLn.LJFF();
            if (LJFF == null) {
                return;
            }
            C54113LLp c54113LLp2 = abstractC54111LLn.LIZ;
            c54113LLp2.getClass();
            if (c54113LLp2.LJLL != null) {
                return;
            }
            c54113LLp2.LJLL = LJFF;
            c54113LLp2.addView(LJFF);
            ImageView imageView3 = c54113LLp2.LJLJJLL;
            if (imageView3 != null) {
                imageView3.bringToFront();
            }
            LJFF.setAlpha(0.0f);
            TextView textView = c54113LLp2.LJLJL;
            if (textView != null) {
                textView.setAlpha(0.0f);
            }
            TextView textView2 = c54113LLp2.LJLJL;
            if (textView2 != null) {
                textView2.bringToFront();
            }
            c54113LLp2.LJLLJ = true;
            W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII2.LJIILIIL = new ColorDrawable(0);
            LJII2.LJJIIJZLJL = LJFF;
            S3I s3i2 = new S3I();
            s3i2.LIZ = true;
            LJII2.LJIJJLI = new S3L(s3i2);
            LJII2.LIZLLL(c54113LLp2.LJLLL);
        }
    }

    @Override // X.LLQ
    public final void LJ(int i, String tag) {
        o.LJIIIZ(tag, "tag");
        LJFF(i, tag, false);
    }

    @Override // X.LLQ
    public void LJJIJ(boolean z, boolean z2) {
        float f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2) {
            C54134LMk c54134LMk = this.LIZJ;
            C178596zf.LIZ(c54134LMk.getAlpha(), f, c54134LMk);
        } else {
            this.LIZJ.setAlpha(f);
        }
    }

    @Override // X.LLQ
    public final void LJJIJLIJ(String tag, C57568Mia c57568Mia) {
        ImageView imageView;
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            C54113LLp c54113LLp = abstractC54111LLn.LIZ;
            c54113LLp.getClass();
            ImageView imageView2 = c54113LLp.LJLJJI;
            if (imageView2 != null && (imageView = c54113LLp.LJLLILLLL) != null) {
                c57568Mia.LJ(imageView2, imageView);
            }
        }
    }

    @Override // X.LLQ
    public final void LJJIL(String str, L7P l7p) {
        if (l7p == null) {
            if (LJJJJIZL(str)) {
                l7p = L7P.DARK;
            } else {
                l7p = L7P.LIGHT;
            }
        }
        Collection<AbstractC54111LLn> values = this.LJFF.values();
        o.LJIIIIZZ(values, "iconTabLogicMap.values");
        Iterator<AbstractC54111LLn> it = values.iterator();
        while (it.hasNext()) {
            it.next().LJIL(l7p);
        }
    }

    @Override // X.LLQ
    public final void LJJIZ(String tabTag, String str) {
        C54113LLp c54113LLp;
        o.LJIIIZ(tabTag, "tabTag");
        View LJIIJ = LJIIJ(tabTag);
        if ((LJIIJ instanceof C54113LLp) && (c54113LLp = (C54113LLp) LJIIJ) != null) {
            c54113LLp.setTitleText(str);
        }
    }

    public final void LJJJI(String str, String str2) {
        String str3;
        AbstractC54111LLn abstractC54111LLn;
        if (str2 == null) {
            str3 = "HOME";
        } else {
            str3 = str2;
        }
        C8RO c8ro = this.LJI;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("doChangeTab, curtag:", str, ", fromTag:", str2, ", lastTabTag:");
        LIZLLL.append(str3);
        c8ro.LIZLLL(X1D.LIZIZ(LIZLLL));
        if (o.LJ(str, str3) || o.LJ(str, "PUBLISH")) {
            return;
        }
        if (o.LJ(str, "FRIENDS_TAB")) {
            AbstractC54111LLn abstractC54111LLn2 = this.LJFF.get(str);
            if (abstractC54111LLn2 != null) {
                abstractC54111LLn2.LIZ.getClass();
            }
            AbstractC54111LLn abstractC54111LLn3 = this.LJFF.get(str);
            if (abstractC54111LLn3 != null) {
                abstractC54111LLn3.LJIIIZ();
                abstractC54111LLn3.LIZ.LIZIZ();
            }
        }
        AbstractC54111LLn abstractC54111LLn4 = this.LJFF.get(str);
        if (abstractC54111LLn4 != null) {
            abstractC54111LLn4.LJIJJLI();
        }
        if (C40471FuV.LIZ()) {
            java.util.Set<String> keySet = this.LJFF.keySet();
            o.LJIIIIZZ(keySet, "iconTabLogicMap.keys");
            for (String str4 : keySet) {
                if (!o.LJ(str, str4) && (abstractC54111LLn = this.LJFF.get(str4)) != null) {
                    abstractC54111LLn.LJJIFFI();
                }
            }
        } else {
            AbstractC54111LLn abstractC54111LLn5 = this.LJFF.get(str3);
            if (abstractC54111LLn5 != null) {
                abstractC54111LLn5.LJJIFFI();
            }
        }
        LJJIL(str, null);
        LJJJJL(str);
    }

    public static void LJJJJI(C54113LLp c54113LLp, int i, String tabName) {
        String str;
        CharSequence text;
        o.LJIIIZ(tabName, "tabName");
        if (o.LJ(tabName, "PUBLISH")) {
            c54113LLp.setContentDescription(C86V.LJFF(R.string.dng));
            h0.LJIJI(c54113LLp, new LON(i));
            return;
        }
        TuxTextView tabTitleView = c54113LLp.getTabTitleView();
        if (tabTitleView != null && (text = tabTitleView.getText()) != null) {
            str = text.toString();
        } else {
            str = null;
        }
        c54113LLp.setContentDescription(str);
        h0.LJIJI(c54113LLp, new LOM(C86V.LJFF(R.string.b25), i));
    }

    @Override // X.LLQ
    public final void LJFF(int i, String tag, boolean z) {
        o.LJIIIZ(tag, "tag");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            abstractC54111LLn.LIZJ(i, z);
        }
    }

    @Override // X.LLQ
    public final void LJII(String str, String str2, boolean z) {
        if (((Number) C52631Kl9.LIZ.getValue()).intValue() == 1) {
            LJJJI(str, str2);
        } else {
            C38816FLg.LIZJ(new RunnableC54108LLk(this, str, str2, z));
        }
    }

    public final void LJJJJ(View view, InterfaceC54080LKi tabButton, ScrollSwitchStateManager stateManager) {
        o.LJIIIZ(tabButton, "tabButton");
        o.LJIIIZ(stateManager, "stateManager");
        LJJJJJ(tabButton, stateManager, false);
        if ((C54305LSz.LJ() || C54305LSz.LIZLLL()) && o.LJ(tabButton.tag(), "USER")) {
            C2U8.LIZ(new C54109LLl());
        }
        if (INB.LIZIZ() && o.LJ(tabButton.tag(), "NOTIFICATION")) {
            Boolean LJ = C27740Aue.LJ(view);
            o.LJIIIIZZ(LJ, "isDoubleClick(v)");
            if (LJ.booleanValue()) {
                C2U8.LIZ(new C54110LLm());
            }
        }
    }

    public final void LJJJJJ(InterfaceC54080LKi interfaceC54080LKi, ScrollSwitchStateManager scrollSwitchStateManager, boolean z) {
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        AVExternalServiceImpl.LIZ().shoutOutsService().setInMainTab(o.LJ(interfaceC54080LKi.tag(), "HOME"));
        if (!z) {
            C54030LIk.LIZIZ = LJF.CLICK_BOTTOM_ICON.getValue();
        }
        String bottomTabName = interfaceC54080LKi.tag();
        scrollSwitchStateManager.getClass();
        o.LJIIIZ(bottomTabName, "bottomTabName");
        scrollSwitchStateManager.LJLLJ.setValue(bottomTabName);
        String bottomTabName2 = interfaceC54080LKi.tag();
        o.LJIIIZ(bottomTabName2, "bottomTabName");
        scrollSwitchStateManager.LJLLILLLL.setValue(new OSZ<>(bottomTabName2, Boolean.valueOf(z)));
        C8RO c8ro = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("performTabClick, curtag:");
        LIZ.append(interfaceC54080LKi.tag());
        LIZ.append(", isMocked:");
        LIZ.append(z);
        c8ro.LIZLLL(X1D.LIZIZ(LIZ));
    }

    @Override // X.LLQ
    public final void LJJIIZI(String tag, Drawable drawable, AbstractC55918Lx4 abstractC55918Lx4, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(drawable, "drawable");
        AbstractC54111LLn abstractC54111LLn = this.LJFF.get(tag);
        if (abstractC54111LLn != null) {
            C54113LLp c54113LLp = abstractC54111LLn.LIZ;
            ImageView imageView = c54113LLp.LJLLILLLL;
            if (imageView != null) {
                imageView.clearAnimation();
                if (C78996UzQ.LJJIIJZLJL(imageView)) {
                    C78996UzQ.LJI();
                }
                c54113LLp.removeView(imageView);
                c54113LLp.LJLLILLLL = null;
            }
            ImageView imageView2 = c54113LLp.LJLJJI;
            if (imageView2 != null) {
                imageView2.clearAnimation();
                imageView2.setVisibility(0);
            }
            ImageView customIconView$homepage_common_release = abstractC54111LLn.LIZ.getCustomIconView$homepage_common_release();
            if (customIconView$homepage_common_release != null) {
                if (layoutParams != null) {
                    customIconView$homepage_common_release.setLayoutParams(layoutParams);
                }
            } else {
                customIconView$homepage_common_release = new ImageView(abstractC54111LLn.LIZ.getContext());
                if (scaleType == null) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                customIconView$homepage_common_release.setScaleType(scaleType);
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
                if (C34051DXz.LIZ() && !DY1.LIZ()) {
                    LJJIIZ = C7MY.LIZIZ(26);
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
                    layoutParams.gravity = 49;
                }
                customIconView$homepage_common_release.setLayoutParams(layoutParams);
                customIconView$homepage_common_release.setVisibility(8);
                abstractC54111LLn.LIZ.addView(customIconView$homepage_common_release);
            }
            customIconView$homepage_common_release.setImageDrawable(drawable);
            C54113LLp c54113LLp2 = abstractC54111LLn.LIZ;
            c54113LLp2.getClass();
            c54113LLp2.LJLLILLLL = customIconView$homepage_common_release;
            View view = c54113LLp2.LJLJJI;
            if (view != null) {
                abstractC55918Lx4.LJ(view, customIconView$homepage_common_release);
            }
        }
    }
}

package X;

import X.C79860VVw;
import Y.ACListenerS48S0200000_14;
import Y.IDCListenerS248S0100000_14;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class VZM<T extends C79860VVw> extends LinearLayout {
    public LynxTabBarView LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public final VZM<T>.a LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final List<LynxViewpagerItem> LJLJLLL;
    public final List<LynxViewpagerItem> LJLL;
    public final List<String> LJLLI;
    public C80261Vej LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public VZV LJZL;
    public LHW LL;
    public VTO LLD;
    public int LLF;
    public int LLFF;
    public boolean LLFFF;
    public int LLFII;
    public final HashMap<View, VZS> LLFZ;
    public final HashSet<VZR> LLI;
    public final int[] LLIFFJFJJ;
    public final Rect LLII;
    public final Rect LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public InterfaceC79796VTk LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public T LLIIJLIL;

    /* loaded from: classes11.dex */
    public final class a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return ((ArrayList) VZM.this.LJLJLLL).size();
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int LJIIL(Object object) {
            o.LJIIJ(object, "object");
            int LJZ = ORZ.LJZ(object, VZM.this.LJLJLLL);
            if (LJZ == -1) {
                return -2;
            }
            return LJZ;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence LJIILIIL(int i) {
            if (i <= VZM.this.getMTabLayoutTitles().size() - 1) {
                VZM vzm = VZM.this;
                if (vzm.LJLLJ == 1) {
                    return null;
                }
                return (CharSequence) ListProtector.get(vzm.getMTabLayoutTitles(), i);
            }
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object LJIILLIIL(int i, ViewGroup container) {
            o.LJIIJ(container, "container");
            LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) ListProtector.get(VZM.this.LJLJLLL, i);
            T t = lynxViewpagerItem.mView;
            o.LJFF(t, "viewPagerItem.view");
            ViewGroup viewGroup = (ViewGroup) t.getParent();
            if (viewGroup != null) {
                C16880lQ.LJLLL(lynxViewpagerItem.mView, viewGroup);
            }
            container.addView(lynxViewpagerItem.mView);
            lynxViewpagerItem.LJIJJLI(i, true);
            return lynxViewpagerItem;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean LJIIZILJ(View view, Object obj) {
            o.LJIIJ(view, "view");
            o.LJIIJ(obj, "obj");
            if (!(obj instanceof LynxViewpagerItem) || view != ((LynxUI) obj).mView) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void LJIIIZ(int i, ViewGroup container, Object object) {
            o.LJIIJ(container, "container");
            o.LJIIJ(object, "object");
            if (object instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) object;
                C16880lQ.LJLLL(lynxViewpagerItem.mView, container);
                lynxViewpagerItem.LJIJJLI(i, false);
            }
        }
    }

    public abstract void setTabBarElementAdded(boolean z);

    public final void LIZ() {
        Drawable background;
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej == null || c80261Vej.getBackground() == null) {
            C80261Vej c80261Vej2 = this.LJLLILLLL;
            if (c80261Vej2 != null) {
                c80261Vej2.setBackgroundResource(R.drawable.bqg);
            }
            C80261Vej c80261Vej3 = this.LJLLILLLL;
            if (c80261Vej3 != null && (background = c80261Vej3.getBackground()) != null) {
                background.mutate();
            }
        }
    }

    public final void LIZJ() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (View view : this.LLFZ.keySet()) {
            VZS vzs = this.LLFZ.get(view);
            if (vzs != null) {
                o.LJFF(view, "view");
                if (view.isShown() && vzs.LIZIZ) {
                    this.LLIIII.set(0, 0, view.getWidth(), view.getHeight());
                    view.getLocationOnScreen(this.LLIFFJFJJ);
                    Rect rect = this.LLIIII;
                    int[] iArr = this.LLIFFJFJJ;
                    rect.offset(iArr[0], iArr[1]);
                    if (this.LLIIII.intersect(this.LLII)) {
                        VZR vzr = new VZR(this.LLIIIJ, vzs.LIZ);
                        hashSet.add(vzr);
                        if (!this.LLI.contains(vzr)) {
                            arrayList.add(vzr);
                        }
                    }
                }
            }
        }
        this.LLI.removeAll(hashSet);
        Iterator<VZR> it = this.LLI.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            VZR next = it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("disappear: [sign, position] = [");
            LIZ.append(next.LIZ);
            LIZ.append(", ");
            LIZ.append(next.LIZIZ);
            LLog.LIZLLL(2, "Foldview#BaseViewPagerImpl", X1D.LIZIZ(LIZ));
            InterfaceC79796VTk interfaceC79796VTk = this.LLIIIL;
            if (interfaceC79796VTk != null) {
                int i = next.LIZIZ;
                String str2 = this.LLIIJI;
                if (str2 != null) {
                    str = str2;
                }
                interfaceC79796VTk.LIZ(i, str);
            }
        }
        this.LLI.clear();
        this.LLI.addAll(hashSet);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VZR vzr2 = (VZR) it2.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("appear: [sign, position] = [");
            LIZ2.append(vzr2.LIZ);
            LIZ2.append(", ");
            LIZ2.append(vzr2.LIZIZ);
            LLog.LIZLLL(2, "Foldview#BaseViewPagerImpl", X1D.LIZIZ(LIZ2));
            InterfaceC79796VTk interfaceC79796VTk2 = this.LLIIIL;
            if (interfaceC79796VTk2 != null) {
                int i2 = vzr2.LIZIZ;
                String str3 = this.LLIIIZ;
                if (str3 == null) {
                    str3 = "";
                }
                interfaceC79796VTk2.LIZ(i2, str3);
            }
        }
    }

    public final void LIZLLL() {
        Drawable background;
        if (Build.VERSION.SDK_INT >= 23 || this.LJLJJI <= 0 || this.LJLILLLLZI <= 0 || this.LJLJI <= 0) {
            return;
        }
        Context context = getContext();
        o.LJFF(context, "context");
        int LIZIZ = (VZP.LIZIZ(context) - this.LJLJI) / 2;
        int i = this.LJLJJI - this.LJLILLLLZI;
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (background = c80261Vej.getBackground()) != null) {
            ((LayerDrawable) background).setLayerInset(1, LIZIZ, i, LIZIZ, 0);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void LJI() {
        C78856UxA tabAt;
        Typeface typeface;
        int i;
        Typeface typeface2;
        LynxBaseUI lynxBaseUI;
        Integer num;
        if (this.LJLLJ == 1) {
            LynxTabBarView lynxTabBarView = this.LJLIL;
            if (lynxTabBarView != null) {
                int i2 = this.LLFII;
                List<LynxBaseUI> mChildren = lynxTabBarView.mChildren;
                o.LJFF(mChildren, "mChildren");
                Iterator<LynxBaseUI> it = mChildren.iterator();
                while (true) {
                    if (it.hasNext()) {
                        lynxBaseUI = it.next();
                        LynxBaseUI lynxBaseUI2 = lynxBaseUI;
                        if ((lynxBaseUI2 instanceof LynxTabbarItem) && ((LynxTabbarItem) lynxBaseUI2).LJLJJI) {
                            break;
                        }
                    } else {
                        lynxBaseUI = null;
                        break;
                    }
                }
                LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
                if (lynxTabbarItem != null && (num = lynxTabbarItem.LJLIL) != null) {
                    i2 = num.intValue();
                }
                lynxTabBarView.LJJ(0, i2);
                return;
            }
            return;
        }
        if (this.LJLLILLLL == null) {
            this.LLIIJLIL.setCurrentItem(this.LLFII, false);
        }
        this.LLFZ.clear();
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null) {
            int tabCount = c80261Vej.getTabCount();
            for (int i3 = 0; i3 < tabCount; i3++) {
                C80261Vej c80261Vej2 = this.LJLLILLLL;
                if (c80261Vej2 != null && (tabAt = c80261Vej2.getTabAt(i3)) != null) {
                    if (i3 == this.LLFII) {
                        tabAt.LIZIZ();
                    }
                    if (tabAt.LJFF != null) {
                        continue;
                    } else {
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bis, tabAt.LJIIIIZZ, false);
                        TextView textView = (TextView) LLLLIILL.findViewById(android.R.id.text1);
                        o.LJFF(textView, "textView");
                        textView.setText(tabAt.LIZJ);
                        C80261Vej c80261Vej3 = this.LJLLILLLL;
                        if (c80261Vej3 != null && i3 == c80261Vej3.getSelectedTabPosition()) {
                            textView.setTextSize(1, this.LJLLL);
                            if (this.LJZ) {
                                typeface2 = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface2 = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface2);
                            int i4 = this.LJLLLL;
                            if (i4 != 0) {
                                textView.setTextColor(i4);
                            }
                        } else {
                            textView.setTextSize(1, this.LJLLLLLL);
                            if (this.LJZI) {
                                typeface = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface);
                            int i5 = this.LJLZ;
                            if (i5 != 0) {
                                textView.setTextColor(i5);
                            }
                        }
                        if (this.LLIIIILZ) {
                            LLLLIILL.addOnAttachStateChangeListener(new IDCListenerS248S0100000_14(this, 2));
                            this.LLFZ.put(LLLLIILL, new VZS(tabAt.LJ, 2));
                        }
                        tabAt.LIZLLL(LLLLIILL);
                        C80267Vep c80267Vep = tabAt.LJIIIIZZ;
                        o.LJFF(c80267Vep, "tabView.view");
                        c80267Vep.setBackgroundColor(0);
                        Context context = getContext();
                        o.LJFF(context, "context");
                        int LIZ = VZP.LIZ(context, this.LJLJJL);
                        if (this.LLF == -1109) {
                            this.LLF = LIZ;
                        }
                        if (this.LLFF == -1109) {
                            this.LLFF = LIZ;
                        }
                        if (i3 == 0) {
                            i = this.LLF;
                        } else {
                            i = LIZ;
                        }
                        if (i3 == ((ArrayList) this.LJLLI).size() - 1) {
                            LIZ = this.LLFF;
                        }
                        View view = tabAt.LJFF;
                        if (view != null) {
                            C16310kV.LJIIJ(view, i, view.getPaddingTop(), LIZ, view.getPaddingBottom());
                        }
                        C80267Vep c80267Vep2 = tabAt.LJIIIIZZ;
                        if (c80267Vep2 != null) {
                            C16880lQ.LJIIJ(new ACListenerS48S0200000_14(this, tabAt, 4), c80267Vep2);
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type android.view.View");
                        }
                    }
                }
            }
        }
    }

    public final boolean getMChanged() {
        return this.LJLJLJ;
    }

    public final List<LynxViewpagerItem> getMPendingChildren() {
        return this.LJLL;
    }

    public final LynxTabBarView getMTabBarView() {
        return this.LJLIL;
    }

    public final C80261Vej getMTabLayout() {
        return this.LJLLILLLL;
    }

    public final List<String> getMTabLayoutTitles() {
        return this.LJLLI;
    }

    public final T getMViewPager() {
        return this.LLIIJLIL;
    }

    public final int getTabLayoutCodeMode() {
        return this.LJLLJ;
    }

    public final void LIZIZ(C80261Vej c80261Vej) {
        if (c80261Vej == null) {
            if (this.LJLLILLLL != null) {
                return;
            }
            Context context = getContext();
            o.LJFF(context, "context");
            C77798Ug6 LIZ = C77873UhJ.LIZ(context);
            this.LJLLILLLL = LIZ;
            LHW lhw = this.LL;
            if (lhw != null) {
                LIZ.addOnTabSelectedListener((InterfaceC54357LUz) lhw);
            }
        } else {
            C80261Vej c80261Vej2 = this.LJLLILLLL;
            if (C78996UzQ.LJJIIJZLJL(c80261Vej2)) {
                C78996UzQ.LJI();
            }
            removeView(c80261Vej2);
            C80261Vej c80261Vej3 = this.LJLLILLLL;
            if (c80261Vej3 != null) {
                c80261Vej3.setupWithViewPager(null);
            }
            this.LJLLILLLL = c80261Vej;
            ((ArrayList) this.LJLLI).clear();
            this.LJLLJ = 1;
        }
        C80261Vej c80261Vej4 = this.LJLLILLLL;
        if (c80261Vej4 != null) {
            c80261Vej4.setupWithViewPager(this.LLIIJLIL);
        }
        this.LLIIJLIL.setAdapter(this.LJLJJLL);
        LJFF(this.LJLJL);
        C80261Vej c80261Vej5 = this.LJLLILLLL;
        if (c80261Vej5 == null || c80261Vej5.getParent() == null) {
            addView(this.LJLLILLLL, 0);
        }
        VTO vto = this.LLD;
        if (vto != null) {
            vto.LIZ(this.LJLLILLLL, this.LLFFF);
        }
    }

    public final void LJFF(boolean z) {
        C80773Vmz reversingAdapter = this.LLIIJLIL.getReversingAdapter();
        int currentItem = this.LLIIJLIL.getCurrentItem();
        this.LJLJL = z;
        this.LLIIJLIL.setRTL(z);
        if (reversingAdapter != null) {
            reversingAdapter.LJLILLLLZI = z;
            reversingAdapter.notifyDataSetChanged();
        }
        if (this.LJLLJ == 1) {
            LynxTabBarView lynxTabBarView = this.LJLIL;
            if (lynxTabBarView != null) {
                lynxTabBarView.LJJ(0, currentItem);
            }
        } else {
            LJI();
        }
        this.LLIIJLIL.setCurrentItem(currentItem);
    }

    public final void setAllowHorizontalGesture(boolean z) {
        this.LLIIJLIL.setMAllowHorizontalGesture(z);
    }

    public final void setBorderHeight(float f) {
        Drawable background;
        LIZ();
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (background = c80261Vej.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                Context context = getContext();
                o.LJFF(context, "context");
                gradientDrawable.setSize(intrinsicWidth, VZP.LIZ(context, f));
                Context context2 = getContext();
                o.LJFF(context2, "context");
                this.LJLILLLLZI = VZP.LIZ(context2, f);
                LIZLLL();
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setBorderLineColor(String color) {
        Drawable background;
        o.LJIIJ(color, "color");
        LIZ();
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (background = c80261Vej.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(VZP.LIZLLL(color));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setBorderWidth(float f) {
        Drawable background;
        LIZ();
        Context context = getContext();
        o.LJFF(context, "context");
        int LIZIZ = (int) ((f / 375) * VZP.LIZIZ(context));
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (background = c80261Vej.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                gradientDrawable.setSize(LIZIZ, gradientDrawable.getIntrinsicHeight());
                Context context2 = getContext();
                o.LJFF(context2, "context");
                this.LJLJI = VZP.LIZ(context2, f);
                LIZLLL();
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setCurrentSelectIndex(int i) {
        this.LLIIJLIL.setCurrentItem(i);
    }

    public final void setKeepItemView(boolean z) {
        if (z) {
            this.LLIIJLIL.setOffscreenPageLimit(Integer.MAX_VALUE);
        } else {
            this.LLIIJLIL.setOffscreenPageLimit(1);
        }
    }

    public final void setLynxDirection(int i) {
        boolean z;
        if (i == 2 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LJLJL) {
            LJFF(z);
        }
    }

    public final void setMChanged(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setMTabBarView(LynxTabBarView lynxTabBarView) {
        this.LJLIL = lynxTabBarView;
    }

    public final void setMTabLayout(C80261Vej c80261Vej) {
        this.LJLLILLLL = c80261Vej;
    }

    public final void setMViewPager(T t) {
        o.LJIIJ(t, "<set-?>");
        this.LLIIJLIL = t;
    }

    public final void setRTLMode(boolean z) {
        this.LJLJL = z;
    }

    public final void setSelectedIndex(int i) {
        this.LLFII = i;
    }

    public final void setSelectedTabIndicatorColor(String color) {
        o.LJIIJ(color, "color");
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null) {
            c80261Vej.setSelectedTabIndicatorColor(VZP.LIZLLL(color));
        }
    }

    public final void setSelectedTextColor(String color) {
        Integer valueOf;
        C78856UxA tabAt;
        View view;
        TextView textView;
        o.LJIIJ(color, "color");
        this.LJLLLL = VZP.LIZLLL(color);
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (valueOf = Integer.valueOf(c80261Vej.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            C80261Vej c80261Vej2 = this.LJLLILLLL;
            if (c80261Vej2 != null && (tabAt = c80261Vej2.getTabAt(intValue)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextSize(float f) {
        Integer valueOf;
        C78856UxA tabAt;
        View view;
        TextView textView;
        this.LJLLL = f;
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (valueOf = Integer.valueOf(c80261Vej.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            C80261Vej c80261Vej2 = this.LJLLILLLL;
            if (c80261Vej2 != null && (tabAt = c80261Vej2.getTabAt(intValue)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextStyle(TextView textView) {
        Typeface typeface;
        o.LJIIJ(textView, "textView");
        if (this.LJLLJ != 0) {
            return;
        }
        textView.setTextSize(1, this.LJLLL);
        if (this.LJZ) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setTextColor(this.LJLLLL);
    }

    public final void setTabBarDragEnable(boolean z) {
        this.LLFFF = z;
    }

    public final void setTabClickListenerListener(VZV tabClickListener) {
        o.LJIIJ(tabClickListener, "tabClickListener");
        this.LJZL = tabClickListener;
    }

    public final void setTabIndicatorHeight(float f) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3 = null;
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null) {
            drawable = c80261Vej.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null) {
            drawable2 = layerDrawable.getDrawable(0);
        } else {
            drawable2 = null;
        }
        if (drawable2 instanceof GradientDrawable) {
            drawable3 = drawable2;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable3;
        if (gradientDrawable != null) {
            int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
            Context context = getContext();
            o.LJFF(context, "context");
            gradientDrawable.setSize(intrinsicWidth, VZP.LIZ(context, f));
        }
        C80261Vej c80261Vej2 = this.LJLLILLLL;
        if (c80261Vej2 != null) {
            c80261Vej2.requestLayout();
        }
    }

    public final void setTabIndicatorRadius(float f) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3 = null;
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null) {
            drawable = c80261Vej.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null) {
            drawable2 = layerDrawable.getDrawable(0);
        } else {
            drawable2 = null;
        }
        if (drawable2 instanceof GradientDrawable) {
            drawable3 = drawable2;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable3;
        if (gradientDrawable != null) {
            Context context = getContext();
            o.LJFF(context, "context");
            gradientDrawable.setCornerRadius(VZP.LIZ(context, f));
        }
        C80261Vej c80261Vej2 = this.LJLLILLLL;
        if (c80261Vej2 != null) {
            c80261Vej2.requestLayout();
        }
    }

    public final void setTabIndicatorWidth(float f) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3 = null;
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null) {
            drawable = c80261Vej.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null) {
            drawable2 = layerDrawable.getDrawable(0);
        } else {
            drawable2 = null;
        }
        if (drawable2 instanceof GradientDrawable) {
            drawable3 = drawable2;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable3;
        if (gradientDrawable != null) {
            Context context = getContext();
            o.LJFF(context, "context");
            gradientDrawable.setSize((int) ((f / 375) * VZP.LIZIZ(context)), gradientDrawable.getIntrinsicHeight());
        }
        C80261Vej c80261Vej2 = this.LJLLILLLL;
        if (c80261Vej2 != null) {
            c80261Vej2.requestLayout();
        }
    }

    public final void setTabInterspace(float f) {
        this.LJLJJL = f / 2;
    }

    public final void setTabLayout(LynxTabBarView lynxTabBarView) {
        o.LJIIJ(lynxTabBarView, "lynxTabBarView");
        this.LJLIL = lynxTabBarView;
        C77798Ug6 c77798Ug6 = lynxTabBarView.LJLILLLLZI;
        if (c77798Ug6 != null) {
            LIZIZ(c77798Ug6);
        } else {
            o.LJIJI("mTabLayout");
            throw null;
        }
    }

    public final void setTabLayoutUpdateListener$x_element_fold_view_release(VTO mOnTabLayoutUpdateListener) {
        o.LJIIJ(mOnTabLayoutUpdateListener, "mOnTabLayoutUpdateListener");
        this.LLD = mOnTabLayoutUpdateListener;
    }

    public final void setTabPaddingBottom(int i) {
        Context context = getContext();
        o.LJFF(context, "context");
        VZP.LIZ(context, i);
        LJI();
    }

    public final void setTabPaddingEnd(int i) {
        Context context = getContext();
        o.LJFF(context, "context");
        this.LLFF = VZP.LIZ(context, i);
        LJI();
    }

    public final void setTabPaddingStart(int i) {
        Context context = getContext();
        o.LJFF(context, "context");
        this.LLF = VZP.LIZ(context, i);
        LJI();
    }

    public final void setTabPaddingTop(int i) {
        Context context = getContext();
        o.LJFF(context, "context");
        VZP.LIZ(context, i);
        LJI();
    }

    public final void setTabSelectedListener$x_element_fold_view_release(LHW lhw) {
        this.LL = lhw;
    }

    public final void setTabbarBackground(String color) {
        Drawable background;
        o.LJIIJ(color, "color");
        LIZ();
        C80261Vej c80261Vej = this.LJLLILLLL;
        if (c80261Vej != null && (background = c80261Vej.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(VZP.LIZLLL(color));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setTablayoutGravity(String gravity) {
        C80261Vej c80261Vej;
        Field declaredField;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        o.LJIIJ(gravity, "gravity");
        if (this.LJLLILLLL == null) {
            LIZIZ(null);
        }
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        String lowerCase = gravity.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode != 3317767 || !lowerCase.equals("left")) {
                    return;
                }
                C80261Vej c80261Vej2 = this.LJLLILLLL;
                if (c80261Vej2 != null && (layoutParams3 = c80261Vej2.getLayoutParams()) != null) {
                    layoutParams3.width = -1;
                }
                C80261Vej c80261Vej3 = this.LJLLILLLL;
                if (c80261Vej3 == null) {
                    return;
                }
                c80261Vej3.requestLayout();
                return;
            }
            if (!lowerCase.equals("fill")) {
                return;
            }
            C80261Vej c80261Vej4 = this.LJLLILLLL;
            if (c80261Vej4 != null) {
                c80261Vej4.setTabMode(1);
            }
            C80261Vej c80261Vej5 = this.LJLLILLLL;
            if (c80261Vej5 != null && (layoutParams2 = c80261Vej5.getLayoutParams()) != null) {
                layoutParams2.width = -1;
            }
            C80261Vej c80261Vej6 = this.LJLLILLLL;
            if (c80261Vej6 != null) {
                c80261Vej6.setTabGravity(0);
            }
            C80261Vej c80261Vej7 = this.LJLLILLLL;
            if (c80261Vej7 == null) {
                return;
            }
            c80261Vej7.requestLayout();
            return;
        }
        if (!lowerCase.equals("center")) {
            return;
        }
        C80261Vej c80261Vej8 = this.LJLLILLLL;
        if (c80261Vej8 != null) {
            c80261Vej8.setTabGravity(1);
        }
        C80261Vej c80261Vej9 = this.LJLLILLLL;
        if (c80261Vej9 != null && (layoutParams = c80261Vej9.getLayoutParams()) != null) {
            layoutParams.width = -1;
        }
        try {
            c80261Vej = this.LJLLILLLL;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (c80261Vej != null && (declaredField = c80261Vej.getClass().getDeclaredField("slidingTabIndicator")) != null) {
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.LJLLILLLL);
            if (obj != null) {
                LinearLayout linearLayout = (LinearLayout) obj;
                linearLayout.setGravity(17);
                linearLayout.getLayoutParams().width = -2;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
                C80261Vej c80261Vej10 = this.LJLLILLLL;
                if (c80261Vej10 == null) {
                    return;
                }
                c80261Vej10.requestLayout();
                return;
            }
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final void setTextBold(String boldMode) {
        o.LJIIJ(boldMode, "boldMode");
        int hashCode = boldMode.hashCode();
        if (hashCode != -1577166796) {
            if (hashCode != 1191572123 || !boldMode.equals("selected")) {
                return;
            }
            this.LJZ = true;
            this.LJZI = false;
            return;
        }
        if (!boldMode.equals("unselected")) {
            return;
        }
        this.LJZ = false;
        this.LJZI = true;
    }

    public final void setUnSelectedTextColor(String color) {
        Integer num;
        C80261Vej c80261Vej;
        C78856UxA tabAt;
        View view;
        TextView textView;
        o.LJIIJ(color, "color");
        C80261Vej c80261Vej2 = this.LJLLILLLL;
        if (c80261Vej2 != null) {
            num = Integer.valueOf(c80261Vej2.getSelectedTabPosition());
        } else {
            num = null;
        }
        this.LJLZ = VZP.LIZLLL(color);
        C80261Vej c80261Vej3 = this.LJLLILLLL;
        if (c80261Vej3 != null) {
            int tabCount = c80261Vej3.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if ((num == null || num.intValue() != i) && (c80261Vej = this.LJLLILLLL) != null && (tabAt = c80261Vej.getTabAt(i)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                    setUnSelectedTextStyle(textView);
                }
            }
        }
    }

    public final void setUnSelectedTextSize(float f) {
        Integer num;
        C80261Vej c80261Vej;
        C78856UxA tabAt;
        View view;
        TextView textView;
        this.LJLLLLLL = f;
        C80261Vej c80261Vej2 = this.LJLLILLLL;
        if (c80261Vej2 != null) {
            num = Integer.valueOf(c80261Vej2.getSelectedTabPosition());
        } else {
            num = null;
        }
        C80261Vej c80261Vej3 = this.LJLLILLLL;
        if (c80261Vej3 != null) {
            int tabCount = c80261Vej3.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if ((num == null || num.intValue() != i) && (c80261Vej = this.LJLLILLLL) != null && (tabAt = c80261Vej.getTabAt(i)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                    setUnSelectedTextStyle(textView);
                }
            }
        }
    }

    public final void setUnSelectedTextStyle(TextView textView) {
        Typeface typeface;
        o.LJIIJ(textView, "textView");
        if (this.LJLLJ != 0) {
            return;
        }
        textView.setTextSize(1, this.LJLLLLLL);
        if (this.LJZI) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setTextColor(this.LJLZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VZM(T t, Context context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LLIIJLIL = t;
        this.LJLJJL = 9.0f;
        VZM<T>.a aVar = new a();
        this.LJLJJLL = aVar;
        this.LJLJLJ = true;
        this.LJLJLLL = new ArrayList();
        this.LJLL = new ArrayList();
        this.LJLLI = new ArrayList();
        this.LJLLL = 16.0f;
        this.LJLLLLLL = 16.0f;
        this.LLF = -1109;
        this.LLFF = -1109;
        this.LLFFF = true;
        this.LLFZ = new HashMap<>();
        this.LLI = new HashSet<>();
        this.LLIFFJFJJ = new int[2];
        this.LLII = new Rect();
        this.LLIIII = new Rect();
        setOrientation(1);
        this.LLIIJLIL.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.LLIIJLIL.setAdapter(aVar);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.LLIIJLIL, 0);
    }

    public final void LJ(float f, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        if (z) {
            C80261Vej c80261Vej = this.LJLLILLLL;
            if (c80261Vej != null && (layoutParams3 = c80261Vej.getLayoutParams()) != null) {
                Context context = getContext();
                o.LJFF(context, "context");
                layoutParams3.height = VZP.LIZJ(context, f);
            }
        } else {
            C80261Vej c80261Vej2 = this.LJLLILLLL;
            if (c80261Vej2 != null && (layoutParams = c80261Vej2.getLayoutParams()) != null) {
                Context context2 = getContext();
                o.LJFF(context2, "context");
                layoutParams.height = VZP.LIZ(context2, f);
            }
        }
        C80261Vej c80261Vej3 = this.LJLLILLLL;
        if (c80261Vej3 != null && (layoutParams2 = c80261Vej3.getLayoutParams()) != null) {
            i = layoutParams2.height;
        } else {
            i = 0;
        }
        this.LJLJJI = i;
        LIZLLL();
        C80261Vej c80261Vej4 = this.LJLLILLLL;
        if (c80261Vej4 != null) {
            c80261Vej4.requestLayout();
        }
    }
}

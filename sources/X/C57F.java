package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.57F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57F extends FrameLayout {
    public static final /* synthetic */ int LJLLI = 0;
    public C57H LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public C57I LJLJI;
    public final ArrayList<Fragment> LJLJJI;
    public InterfaceC1287853q LJLJJL;
    public final ArrayList<C1288653y> LJLJJLL;
    public InterfaceC88471Ynr<? super Boolean, ? super Boolean, C76800UCe> LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final C57D getResourceProvider() {
        return (C57D) this.LJLILLLLZI.getValue();
    }

    public final void LIZJ() {
        C57I c57i = this.LJLJI;
        if (c57i != null && !c57i.LJIILJJIL) {
            LIZ(R.id.g7w).setVisibility(8);
            ((ImageView) LIZ(R.id.g_u)).setVisibility(8);
            LIZ(R.id.cy4).setVisibility(8);
            LIZ(R.id.n9z).setVisibility(0);
            C57H c57h = this.LJLIL;
            if (c57h != null) {
                c57h.setVisibility(0);
            } else {
                o.LJIJI("resourceMultiTab");
                throw null;
            }
        }
    }

    public final C80261Vej getMultiTabLayout() {
        C57H c57h = this.LJLIL;
        if (c57h != null) {
            return c57h.getTabLayout();
        }
        o.LJIJI("resourceMultiTab");
        throw null;
    }

    public final ViewPager getViewPager() {
        return (ViewPager) LIZ(R.id.iyx);
    }

    public final ArrayList<C1288653y> getCategoryList() {
        return this.LJLJJLL;
    }

    public final ArrayList<Fragment> getFragments() {
        return this.LJLJJI;
    }

    public final InterfaceC1287853q getMultiPageAdapter() {
        return this.LJLJJL;
    }

    public final InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> getOnInitFinishListener() {
        return this.LJLJL;
    }

    public final InterfaceC88472Yns<Integer, C76800UCe> getOnPageSelected() {
        return this.LJLJLLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnStartFetchCategory() {
        return this.LJLJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.57E] */
    public final void LIZIZ(final boolean z) {
        C57D resourceProvider;
        final C57I c57i = this.LJLJI;
        if (c57i != null && (resourceProvider = getResourceProvider()) != 0) {
            String str = c57i.LIZ;
            if (!ujb.o.LJJJJJL(str)) {
                if (o.LJ(str, "text")) {
                    ArrayList LJII = resourceProvider.LJII();
                    LIZJ();
                    LIZLLL(LJII);
                } else {
                    resourceProvider.LJIIIIZZ(new InterfaceC84517XEz<C1288653y>() { // from class: X.57E
                        @Override // X.InterfaceC84517XEz
                        public final void onStart() {
                            final C57F c57f = C57F.this;
                            C57I c57i2 = c57f.LJLJI;
                            if (c57i2 != null && !c57i2.LJIILJJIL) {
                                c57f.LIZ(R.id.g7w).setVisibility(0);
                                c57f.LIZ(R.id.cy4).setVisibility(8);
                                c57f.LIZ(R.id.n9z).setVisibility(8);
                                C57H c57h = c57f.LJLIL;
                                if (c57h != null) {
                                    c57h.setVisibility(8);
                                    ((ImageView) c57f.LIZ(R.id.g_u)).setVisibility(0);
                                    C04650Gf.LIZJ(c57f.getContext(), C1291054w.LIZJ().LIZIZ).LIZIZ(new InterfaceC04760Gq() { // from class: X.57O
                                        @Override // X.InterfaceC04760Gq
                                        public final void onResult(Object obj) {
                                            C0GY c0gy = (C0GY) obj;
                                            C29701Eo c29701Eo = (C29701Eo) C57F.this.LIZ(R.id.g_u);
                                            if (c29701Eo != null) {
                                                c29701Eo.setComposition(c0gy);
                                            }
                                            C29701Eo c29701Eo2 = (C29701Eo) C57F.this.LIZ(R.id.g_u);
                                            if (c29701Eo2 != null) {
                                                c29701Eo2.playAnimation();
                                            }
                                        }
                                    });
                                } else {
                                    o.LJIJI("resourceMultiTab");
                                    throw null;
                                }
                            }
                            InterfaceC65784Pro<C76800UCe> onStartFetchCategory = C57F.this.getOnStartFetchCategory();
                            if (onStartFetchCategory != null) {
                                onStartFetchCategory.invoke();
                            }
                        }

                        @Override // X.InterfaceC84517XEz
                        public final void LIZ(C57M c57m) {
                            C57F.this.LIZJ();
                            C57F c57f = C57F.this;
                            C57I c57i2 = c57f.LJLJI;
                            if (c57i2 != null && !c57i2.LJIILJJIL) {
                                c57f.LIZ(R.id.g7w).setVisibility(8);
                                c57f.LIZ(R.id.cy4).setVisibility(0);
                                C16880lQ.LJIIZILJ((LinearLayout) c57f.LIZ(R.id.cy4), new ACListenerS22S0100000_2(c57f, 129));
                                c57f.LIZ(R.id.n9z).setVisibility(8);
                                C57H c57h = c57f.LJLIL;
                                if (c57h != null) {
                                    c57h.setVisibility(8);
                                } else {
                                    o.LJIJI("resourceMultiTab");
                                    throw null;
                                }
                            }
                            InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> onInitFinishListener = C57F.this.getOnInitFinishListener();
                            if (onInitFinishListener != null) {
                                onInitFinishListener.invoke(Boolean.FALSE, Boolean.valueOf(z));
                            }
                        }

                        @Override // X.InterfaceC84517XEz
                        public final void onSuccess(List<? extends C1288653y> dataList) {
                            o.LJIIIZ(dataList, "dataList");
                            C57F.this.LIZJ();
                            C57F.this.getCategoryList().clear();
                            if (dataList.isEmpty() && c57i.LJIILIIL) {
                                ArrayList LJII2 = C47261Igj.LJII(new C1288653y(null, null, null));
                                C57F.this.getCategoryList().addAll(LJII2);
                                InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> onInitFinishListener = C57F.this.getOnInitFinishListener();
                                if (onInitFinishListener != null) {
                                    onInitFinishListener.invoke(Boolean.TRUE, Boolean.valueOf(z));
                                }
                                C57F.this.LIZLLL(LJII2);
                                return;
                            }
                            C57F.this.getCategoryList().addAll(dataList);
                            InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> onInitFinishListener2 = C57F.this.getOnInitFinishListener();
                            if (onInitFinishListener2 != null) {
                                onInitFinishListener2.invoke(Boolean.TRUE, Boolean.valueOf(z));
                            }
                            C57F.this.LIZLLL(dataList);
                        }
                    });
                    resourceProvider.LJFF(str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void LIZLLL(final List<C1288653y> list) {
        InterfaceC1287853q interfaceC1287853q;
        View view;
        boolean z;
        final C57I c57i = this.LJLJI;
        if (c57i != null && (interfaceC1287853q = this.LJLJJL) != null) {
            Iterator<C1288653y> it = list.iterator();
            while (it.hasNext()) {
                this.LJLJJI.add(interfaceC1287853q.LIZ(it.next()));
            }
            FragmentManager fragmentManager = interfaceC1287853q.getFragmentManager();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C57Z c57z = new C57Z(fragmentManager, context, this.LJLJJI, list);
            C57H c57h = this.LJLIL;
            if (c57h != null) {
                int i = 8;
                ?? r5 = 0;
                if (!c57h.LJLIL) {
                    C16880lQ.LLLLIILL(C16880lQ.LLZIL(c57h.getContext()), R.layout.as0, c57h, true);
                    C80261Vej c80261Vej = (C80261Vej) c57h.findViewById(R.id.gpn);
                    c57h.LJLILLLLZI = c80261Vej;
                    if (c57i.LJIIJJI && c80261Vej != null) {
                        c80261Vej.setSelectedTabIndicator((Drawable) null);
                    }
                    if (!c57i.LIZIZ) {
                        c57h.LIZ(R.id.kyv).setVisibility(8);
                    }
                    ((C80261Vej) c57h.LIZ(R.id.gpn)).setSelectedTabIndicatorColor(C04330Ez.LIZIZ(c57h.getContext(), c57i.LIZJ));
                    if (c57i.LJIIIIZZ) {
                        c57h.LIZ(R.id.d2a).setVisibility(0);
                        ((ViewGroup) c57h.LIZ(R.id.d2a)).addView(c57i.LJIIIZ);
                        C16880lQ.LJIIZILJ((LinearLayout) c57h.LIZ(R.id.d2a), new ACListenerS22S0100000_2(c57i, 130));
                    }
                    c57h.LJLIL = true;
                }
                C57H c57h2 = this.LJLIL;
                if (c57h2 != null) {
                    C80261Vej c80261Vej2 = (C80261Vej) c57h2.LIZ(R.id.gpn);
                    C57H c57h3 = this.LJLIL;
                    if (c57h3 != null) {
                        C16880lQ.LJIIZILJ((LinearLayout) c57h3.LIZ(R.id.kyv), new ACListenerS22S0100000_2(c57i, 75));
                        ViewPager viewPager = (ViewPager) LIZ(R.id.iyx);
                        viewPager.setAdapter(c57z);
                        c80261Vej2.setupWithViewPager(viewPager);
                        Iterator<C1288653y> it2 = list.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            it2.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                C78856UxA tabAt = c80261Vej2.getTabAt(i2);
                                if (tabAt != null) {
                                    int i4 = c57i.LIZLLL;
                                    if (i2 < c57z.LJLL.size()) {
                                        view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c57z.LJLJLJ), R.layout.arz, c80261Vej2, r5);
                                        C1288653y c1288653y = (C1288653y) ListProtector.get(c57z.LJLL, i2);
                                        String str = c1288653y.LIZ;
                                        if (str == null || ujb.o.LJJJJJL(str)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            String str2 = c1288653y.LIZJ;
                                            if (str2 == null || ujb.o.LJJJJJL(str2)) {
                                                view.findViewById(R.id.kyz).setVisibility(i);
                                                ((ImageView) view.findViewById(R.id.kyk)).setVisibility(i);
                                            } else {
                                                view.findViewById(R.id.kyz).setVisibility(i);
                                                ((ImageView) view.findViewById(R.id.kyk)).setVisibility(0);
                                                C5CH c5ch = C1280550v.LIZ().LIZ().LIZJ;
                                                if (c5ch != null) {
                                                    Context context2 = c57z.LJLJLJ;
                                                    String str3 = c1288653y.LIZJ;
                                                    o.LJI(str3);
                                                    ImageView imageView = (ImageView) view.findViewById(R.id.kyk);
                                                    o.LJIIIIZZ(imageView, "customTabView.tab_icon");
                                                    c5ch.LIZ(context2, str3, imageView, new C5CW(new C5CV()));
                                                }
                                            }
                                        } else {
                                            String str4 = c1288653y.LIZJ;
                                            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                                                ((ImageView) view.findViewById(R.id.kyk)).setVisibility(i);
                                                view.findViewById(R.id.kyz).setVisibility(0);
                                                ((TextView) view.findViewById(R.id.kyz)).setText(c1288653y.LIZ);
                                                ((TextView) view.findViewById(R.id.kyz)).setTextColor(C04330Ez.LIZIZ(c57z.LJLJLJ, i4));
                                            } else {
                                                view.findViewById(R.id.kyz).setVisibility(0);
                                                ((ImageView) view.findViewById(R.id.kyk)).setVisibility(0);
                                                ((TextView) view.findViewById(R.id.kyz)).setText(c1288653y.LIZ);
                                                ((TextView) view.findViewById(R.id.kyz)).setTextColor(C04330Ez.LIZIZ(c57z.LJLJLJ, i4));
                                                C5CH c5ch2 = C1280550v.LIZ().LIZ().LIZJ;
                                                if (c5ch2 != null) {
                                                    Context context3 = c57z.LJLJLJ;
                                                    String str5 = c1288653y.LIZJ;
                                                    o.LJI(str5);
                                                    ImageView imageView2 = (ImageView) view.findViewById(R.id.kyk);
                                                    o.LJIIIIZZ(imageView2, "customTabView.tab_icon");
                                                    c5ch2.LIZ(context3, str5, imageView2, new C5CW(new C5CV()));
                                                }
                                                ((TextView) view.findViewById(R.id.kyz)).setText(c1288653y.LIZ);
                                            }
                                        }
                                    } else {
                                        view = null;
                                    }
                                    tabAt.LIZLLL(view);
                                }
                                i2 = i3;
                                i = 8;
                                r5 = 0;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        c80261Vej2.addOnTabSelectedListener(new LHW() { // from class: X.57G
                            @Override // X.InterfaceC54357LUz
                            public final void LIZ(C78856UxA c78856UxA) {
                                TextView textView;
                                if (c78856UxA != null) {
                                    List<C1288653y> list2 = list;
                                    C57F c57f = this;
                                    C57I c57i2 = c57i;
                                    String str6 = ((C1288653y) ListProtector.get(list2, c78856UxA.LJ)).LIZ;
                                    if (str6 == null || ujb.o.LJJJJJL(str6)) {
                                        return;
                                    }
                                    View view2 = c78856UxA.LJFF;
                                    if (view2 != null) {
                                        textView = (TextView) view2.findViewById(R.id.kyz);
                                    } else {
                                        textView = null;
                                    }
                                    int LIZIZ = C04330Ez.LIZIZ(c57f.getContext(), c57i2.LIZLLL);
                                    if (textView == null) {
                                        return;
                                    }
                                    textView.setTextColor(LIZIZ);
                                }
                            }

                            @Override // X.InterfaceC54357LUz
                            public final void LIZIZ(C78856UxA c78856UxA) {
                                String str6;
                                TextView textView;
                                if (c78856UxA != null) {
                                    List<C1288653y> list2 = list;
                                    C57F c57f = this;
                                    C57I c57i2 = c57i;
                                    int size = list2.size();
                                    int i5 = c78856UxA.LJ;
                                    if (i5 < 0 || i5 >= size || (str6 = ((C1288653y) ListProtector.get(list2, i5)).LIZ) == null || ujb.o.LJJJJJL(str6)) {
                                        return;
                                    }
                                    View view2 = c78856UxA.LJFF;
                                    if (view2 != null) {
                                        textView = (TextView) view2.findViewById(R.id.kyz);
                                    } else {
                                        textView = null;
                                    }
                                    int LIZIZ = C04330Ez.LIZIZ(c57f.getContext(), c57i2.LJ);
                                    if (textView != null) {
                                        textView.setTextColor(LIZIZ);
                                    }
                                    InterfaceC88472Yns<Integer, C76800UCe> onPageSelected = c57f.getOnPageSelected();
                                    if (onPageSelected == null) {
                                        return;
                                    }
                                    onPageSelected.invoke(Integer.valueOf(c78856UxA.LJ));
                                }
                            }

                            @Override // X.InterfaceC54357LUz
                            public final void LIZJ(C78856UxA c78856UxA) {
                                TextView textView;
                                if (c78856UxA != null) {
                                    List<C1288653y> list2 = list;
                                    C57F c57f = this;
                                    C57I c57i2 = c57i;
                                    String str6 = ((C1288653y) ListProtector.get(list2, c78856UxA.LJ)).LIZ;
                                    if (str6 != null && !ujb.o.LJJJJJL(str6)) {
                                        View view2 = c78856UxA.LJFF;
                                        if (view2 != null) {
                                            textView = (TextView) view2.findViewById(R.id.kyz);
                                        } else {
                                            textView = null;
                                        }
                                        int LIZIZ = C04330Ez.LIZIZ(c57f.getContext(), c57i2.LJ);
                                        if (textView != null) {
                                            textView.setTextColor(LIZIZ);
                                        }
                                    }
                                    ((ViewPager) c57f.LIZ(R.id.iyx)).setCurrentItem(c78856UxA.LJ);
                                }
                            }
                        });
                        C78856UxA tabAt2 = c80261Vej2.getTabAt(r5);
                        if (tabAt2 != null) {
                            tabAt2.LIZIZ();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("resourceMultiTab");
                    throw null;
                }
                o.LJIJI("resourceMultiTab");
                throw null;
            }
            o.LJIJI("resourceMultiTab");
            throw null;
        }
    }

    public final void setMultiPageAdapter(InterfaceC1287853q interfaceC1287853q) {
        this.LJLJJL = interfaceC1287853q;
    }

    public final void setOnInitFinishListener(InterfaceC88471Ynr<? super Boolean, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        this.LJLJL = interfaceC88471Ynr;
    }

    public final void setOnPageSelected(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLJLLL = interfaceC88472Yns;
    }

    public final void setOnStartFetchCategory(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJLJ = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLL = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = C221108m2.LIZIZ(C1292955p.LJLIL);
        this.LJLJJI = new ArrayList<>();
        this.LJLJJLL = new ArrayList<>();
    }
}

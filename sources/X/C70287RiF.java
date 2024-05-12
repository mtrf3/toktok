package X;

import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RiF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70287RiF extends ConstraintLayout implements InterfaceC70273Ri1 {
    public final ISpecUiStyle LJLIL;
    public InterfaceC70291RiJ LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public List<C70216Rh6> LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public C70647Ro3 LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final int getDataSize() {
        List<C70216Rh6> list = this.LJLJJL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LJJLL() {
        C0A2 layoutManager = ((RecyclerView) _$_findCachedViewById(R.id.k9c)).getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (getDataSize() > Math.abs(LLILL - LLILLJJLI) && ((ViewGroup) _$_findCachedViewById(R.id.k9c)).getChildCount() > 0) {
            int i = -1;
            if (this.LJLJI == -1) {
                return;
            }
            int i2 = (LLILL + LLILLJJLI) / 2;
            int width = ((ViewGroup) _$_findCachedViewById(R.id.k9c)).getChildAt(0).getWidth();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (!C26338AVi.LIZJ(context)) {
                i = 1;
            }
            int i3 = this.LJLJI;
            if (i3 == i2) {
                return;
            }
            if (i3 > i2 && !_$_findCachedViewById(R.id.k9c).canScrollHorizontally(i)) {
                return;
            }
            if (this.LJLJI < i2 && !_$_findCachedViewById(R.id.k9c).canScrollHorizontally(-i)) {
                return;
            }
            int abs = (int) ((Math.abs(this.LJLJI - i2) + 0.5d) * width);
            if (this.LJLJI <= i2) {
                i = -i;
            }
            ((RecyclerView) _$_findCachedViewById(R.id.k9c)).LJLIIIL(abs * i, 0);
        }
    }

    public final C70647Ro3 getAdapter() {
        return this.LJLLI;
    }

    public final ISpecUiStyle getStyle() {
        return this.LJLIL;
    }

    public final void LJJZ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.k9c).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        _$_findCachedViewById(R.id.k9c).setLayoutParams(marginLayoutParams);
    }

    public final void setAdapter(C70647Ro3 c70647Ro3) {
        o.LJIIIZ(c70647Ro3, "<set-?>");
        this.LJLLI = c70647Ro3;
    }

    public final void setClickListener(InterfaceC70291RiJ listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setLayoutManager(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        ((RecyclerView) _$_findCachedViewById(R.id.k9c)).setLayoutManager(layoutManager);
    }

    public final void setTextLayoutMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.k9g).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i);
            }
        } else {
            marginLayoutParams = null;
        }
        _$_findCachedViewById(R.id.k9g).setLayoutParams(marginLayoutParams);
    }

    @Override // X.InterfaceC70273Ri1
    public final void LJJIJLIJ(int i, Object obj) {
        C70216Rh6 c70216Rh6;
        InterfaceC70291RiJ interfaceC70291RiJ = this.LJLILLLLZI;
        if (interfaceC70291RiJ != null) {
            int i2 = this.LJLJJLL;
            List<C70216Rh6> list = this.LJLJJL;
            if (list != null) {
                c70216Rh6 = (C70216Rh6) ORZ.LJLLLLLL(i, list);
            } else {
                c70216Rh6 = null;
            }
            interfaceC70291RiJ.onSpecChecked(i2, i, c70216Rh6);
        }
    }

    @Override // X.InterfaceC70273Ri1
    public final void LJJLIIIJL(int i, RecyclerView.ViewHolder holder) {
        C70216Rh6 c70216Rh6;
        o.LJIIIZ(holder, "holder");
        InterfaceC70291RiJ interfaceC70291RiJ = this.LJLILLLLZI;
        if (interfaceC70291RiJ != null) {
            View view = holder.itemView;
            int i2 = this.LJLJJLL;
            List<C70216Rh6> list = this.LJLJJL;
            if (list != null) {
                c70216Rh6 = (C70216Rh6) ORZ.LJLLLLLL(i, list);
            } else {
                c70216Rh6 = null;
            }
            interfaceC70291RiJ.onSpecItemBind(view, i2, i, c70216Rh6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70287RiF(Context context, Fragment fragment, ISpecUiStyle iSpecUiStyle) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragment, "fragment");
        this.LJLLILLLL = new LinkedHashMap();
        this.LJLIL = iSpecUiStyle;
        this.LJLJI = -1;
        this.LJLJJI = -2;
        this.LJLJJLL = -1;
        this.LJLJL = "";
        this.LJLL = "";
        C70647Ro3 c70647Ro3 = new C70647Ro3(fragment, iSpecUiStyle == null ? new GlobalSpecUiStyle() : iSpecUiStyle);
        c70647Ro3.setShowFooter(false);
        this.LJLLI = c70647Ro3;
        C27533ArJ.LIZ(R.layout.a7w, context, this, true);
        ((RecyclerView) _$_findCachedViewById(R.id.k9c)).setAdapter(this.LJLLI);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.k9c);
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(scrollTopLinearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.k9c)).LJIIJJI(new IDrS50S0100000_12(this, 17));
        int i = (int) (C27162AlK.LIZ * 0.5d);
        if (i > 0) {
            ((TextView) _$_findCachedViewById(R.id.k9f)).setMaxWidth(i);
        }
    }

    public final void LJJLJLI(String str, List list, int i, SizeGuide sizeGuide, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        InterfaceC70245RhZ c70288RiG;
        this.LJLJJL = list;
        this.LJLJJLL = i;
        this.LJLJI = -1;
        String string = getContext().getString(R.string.sly);
        o.LJIIIIZZ(string, "context.getString(R.stri…_us_option_please_select)");
        this.LJLL = "sku";
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C70216Rh6 c70216Rh6 = (C70216Rh6) obj;
                    if (c70216Rh6.LJFF) {
                        this.LJLJI = i2;
                        string = c70216Rh6.LIZIZ;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        ((TextView) _$_findCachedViewById(R.id.k9f)).setText(str);
        ((TextView) _$_findCachedViewById(R.id.k9h)).setText(string);
        View view = (View) interfaceC65784Pro.invoke();
        if (view != null && sizeGuide != null) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.dgo));
            if (((ViewGroup) _$_findCachedViewById(R.id.dgo)).getChildCount() > 0) {
                ((ViewGroup) _$_findCachedViewById(R.id.dgo)).removeAllViews();
            }
            ((ViewGroup) _$_findCachedViewById(R.id.dgo)).addView(view);
            InterfaceC70291RiJ interfaceC70291RiJ = this.LJLILLLLZI;
            if (interfaceC70291RiJ != null) {
                interfaceC70291RiJ.onSizeGuideShow(_$_findCachedViewById(R.id.dgo), sizeGuide);
            }
            View fl_size_guide_container = _$_findCachedViewById(R.id.dgo);
            o.LJIIIIZZ(fl_size_guide_container, "fl_size_guide_container");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, sizeGuide, 57, 42), fl_size_guide_container);
        } else {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.dgo));
        }
        int i4 = this.LJLJI;
        List<C70216Rh6> list2 = this.LJLJJL;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            int i5 = 0;
            for (C70216Rh6 c70216Rh62 : list2) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    C70216Rh6 c70216Rh63 = c70216Rh62;
                    Image image = c70216Rh63.LIZJ;
                    boolean z2 = true;
                    if (image != null) {
                        String str2 = c70216Rh63.LIZIZ;
                        boolean z3 = c70216Rh63.LJ;
                        if (i5 != i4) {
                            z2 = false;
                        }
                        c70288RiG = new C70289RiH(image, str2, z3, z2);
                    } else {
                        String str3 = c70216Rh63.LIZIZ;
                        boolean z4 = c70216Rh63.LJ;
                        if (i5 != i4) {
                            z2 = false;
                        }
                        c70288RiG = new C70288RiG(str3, z4, z2);
                    }
                    arrayList.add(c70288RiG);
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            C70647Ro3 c70647Ro3 = this.LJLLI;
            C70290RiI c70290RiI = new C70290RiI(this, i4, z);
            c70647Ro3.getClass();
            C73227SoZ.LIZIZ(c70647Ro3, arrayList, c70290RiI);
        }
        this.LJLLI.LJLJL = this;
    }
}

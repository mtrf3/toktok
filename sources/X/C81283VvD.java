package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.VvD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81283VvD extends C80890Vos {
    public final C73124Smu LJLJJLL;
    public final C73124Smu LJLJL;
    public List<? extends OSZ<EffectCategoryModel, ? extends List<C81286VvG>>> LJLJLJ;
    public InterfaceC81285VvF LJLJLLL;
    public final Drawable LJLL;
    public final Drawable LJLLI;
    public C81281VvB LJLLILLLL;

    public final C81281VvB getFilterBoxViewConfigure() {
        return this.LJLLILLLL;
    }

    @Override // X.C80890Vos
    public final View LIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new Space(context);
    }

    @Override // X.C80890Vos
    public final View LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new Space(context);
    }

    @Override // X.C80890Vos
    public final void LIZLLL(int i) {
        int i2;
        int i3;
        int i4;
        View view = this.LJLIL;
        int i5 = 0;
        if (view != null) {
            if (i == 0) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        View mLoadingView = this.LJLILLLLZI;
        o.LJIIIIZZ(mLoadingView, "mLoadingView");
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        mLoadingView.setVisibility(i2);
        View mErrorView = this.LJLJJI;
        o.LJIIIIZZ(mErrorView, "mErrorView");
        if (i == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        mErrorView.setVisibility(i3);
        View mEmptyView = this.LJLJI;
        o.LJIIIIZZ(mEmptyView, "mEmptyView");
        if (i != 3) {
            i5 = 8;
        }
        mEmptyView.setVisibility(i5);
    }

    public final EffectCategoryModel LJ(C81287VvH filter) {
        OSZ<EffectCategoryModel, ? extends List<C81286VvG>> osz;
        EffectCategoryModel first;
        o.LJIIIZ(filter, "filter");
        List<? extends OSZ<EffectCategoryModel, ? extends List<C81286VvG>>> list = this.LJLJLJ;
        if (list != null) {
            Iterator<? extends OSZ<EffectCategoryModel, ? extends List<C81286VvG>>> it = list.iterator();
            while (true) {
                osz = null;
                if (!it.hasNext()) {
                    break;
                }
                osz = it.next();
                Iterator<T> it2 = osz.getSecond().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (o.LJ(((C81286VvG) next).LIZ.LJLIL.LIZLLL, filter.LJLIL.LIZLLL)) {
                            if (next != null) {
                                break;
                            }
                        }
                    }
                }
            }
            OSZ<EffectCategoryModel, ? extends List<C81286VvG>> osz2 = osz;
            if (osz2 != null && (first = osz2.getFirst()) != null) {
                return first;
            }
        }
        throw new NoSuchElementException();
    }

    public final void LJFF(EffectCategoryModel effectCategoryModel) {
        Object obj;
        AbstractC029409q adapter = this.LJLJL.getAdapter();
        if (adapter != null) {
            AbstractC45801HyH abstractC45801HyH = (AbstractC45801HyH) adapter;
            if (effectCategoryModel == null) {
                abstractC45801HyH.LJLZ(C61878OQg.INSTANCE);
                abstractC45801HyH.notifyDataSetChanged();
                return;
            }
            List<? extends OSZ<EffectCategoryModel, ? extends List<C81286VvG>>> list = this.LJLJLJ;
            List list2 = null;
            if (list != null) {
                AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6(effectCategoryModel, 68);
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Boolean) aqS172S0100000_6.invoke(((OSZ) obj).getFirst())).booleanValue()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                OSZ osz = (OSZ) obj;
                if (osz != null) {
                    list2 = (List) osz.getSecond();
                }
            }
            o.LJI(list2);
            abstractC45801HyH.LJLZ(list2);
            abstractC45801HyH.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.DetailAdapter");
    }

    public final void setCallback(InterfaceC81285VvF interfaceC81285VvF) {
        this.LJLJLLL = interfaceC81285VvF;
    }

    public final void setCategoryMap(List<? extends OSZ<EffectCategoryModel, ? extends List<C81287VvH>>> categoryMap) {
        o.LJIIIZ(categoryMap, "categoryMap");
        setState(0);
        ArrayList arrayList = new ArrayList(C32I.LJJL(categoryMap, 10));
        for (OSZ<EffectCategoryModel, ? extends List<C81287VvH>> osz : categoryMap) {
            EffectCategoryModel first = osz.getFirst();
            List<C81287VvH> second = osz.getSecond();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(second, 10));
            Iterator<T> it = second.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C81286VvG((C81287VvH) it.next()));
            }
            arrayList.add(new OSZ(first, arrayList2));
        }
        this.LJLJLJ = arrayList;
        C74270TCw c74270TCw = new C74270TCw(this);
        this.LJLJJLL.setAdapter(c74270TCw);
        c74270TCw.submitList(C82238WPi.LIZJ(categoryMap));
        LJFF((EffectCategoryModel) ORZ.LJLLLL(C82238WPi.LIZJ(categoryMap)));
    }

    public final void setFilterBoxViewConfigure(C81281VvB value) {
        o.LJIIIZ(value, "value");
        this.LJLLILLLL = value;
        AbstractC029409q adapter = this.LJLJJLL.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        AbstractC029409q adapter2 = this.LJLJL.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81283VvD(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LJLLILLLL = new C81281VvB();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C73124Smu c73124Smu = new C73124Smu(context2, null, 6);
        c73124Smu.getContext();
        c73124Smu.setLayoutManager(new LinearLayoutManager(1, false));
        c73124Smu.setAdapter(new C74270TCw(this));
        Context context3 = c73124Smu.getContext();
        o.LJIIIIZZ(context3, "context");
        c73124Smu.LJII(new S4T((int) C74275TDb.LIZIZ(context3, 8.0f)), -1);
        this.LJLJJLL = c73124Smu;
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        int color = context4.getResources().getColor(R.color.xy);
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        int dimensionPixelSize = context5.getResources().getDimensionPixelSize(R.dimen.ex);
        TDY tdy = new TDY();
        tdy.LIZIZ(color);
        tdy.LJ(color, 0);
        float f = dimensionPixelSize;
        tdy.LJFF = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        c73124Smu.setBackground(tdy.LIZ());
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        C73124Smu c73124Smu2 = new C73124Smu(context6, null, 6);
        c73124Smu2.getContext();
        c73124Smu2.setLayoutManager(new LinearLayoutManager(1, false));
        c73124Smu2.setAdapter(new C81280VvA(this));
        Context context7 = c73124Smu2.getContext();
        o.LJIIIIZZ(context7, "context");
        c73124Smu2.LJII(new S4T((int) C74275TDb.LIZIZ(context7, 8.0f)), -1);
        this.LJLJL = c73124Smu2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(c73124Smu, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(c73124Smu2, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        Context context8 = getContext();
        o.LJIIIIZZ(context8, "context");
        Drawable drawable = context8.getResources().getDrawable(R.drawable.ay5);
        Context context9 = getContext();
        o.LJIIIIZZ(context9, "context");
        this.LJLL = C78880UxY.LJLIL(drawable, context9.getResources().getColor(R.color.y1));
        Context context10 = getContext();
        o.LJIIIIZZ(context10, "context");
        this.LJLLI = context10.getResources().getDrawable(R.drawable.axw);
    }

    @Override // X.C80890Vos
    public final View LIZJ(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        return new C157976Hx(context, attributeSet, 0);
    }
}

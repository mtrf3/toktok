package X;

import Y.IDCListenerS149S0200000_42;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.adi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94234adi extends AbstractC93422aQc<C94218adS, C94233adh> {
    @Override // X.AbstractC93422aQc
    public final C94233adh LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "context");
        C93696aV2 c93696aV2 = new C93696aV2(context);
        c93696aV2.setLayoutParams(C93902aYM.LJ(parent, -2, C93742aVm.LIZIZ(4), 0, Integer.valueOf(C93742aVm.LIZIZ(24)), null, 232));
        return new C94233adh(c93696aV2);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        Double d;
        C94218adS data = (C94218adS) obj;
        C94233adh viewHolder2 = (C94233adh) viewHolder;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder2, "viewHolder");
        C93696aV2 c93696aV2 = viewHolder2.LJLIL;
        List<C94217adR> list = data.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C94217adR> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        String actionName = data.LJLILLLLZI;
        boolean z = data.LJLJJL;
        if (data.LJLJI == EnumC93988aZk.FPS) {
            d = data.LJLJJI;
        } else {
            d = null;
        }
        boolean z2 = data.LJLJJLL;
        c93696aV2.getClass();
        o.LJIIIZ(actionName, "actionName");
        if (arrayList.size() > 3) {
            LinearLayout linearLayout = c93696aV2.LJLJJLL;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setLayoutParams(C93902aYM.LIZJ(linearLayout, -1, -2, 0, 0, null, null, null, null, null, null, 1020));
                new IDqS419S0100000_42(c93696aV2, 57).invoke(linearLayout2);
                C93902aYM.LIZ(linearLayout2, linearLayout);
                Context context = linearLayout.getContext();
                o.LJIIIIZZ(context, "context");
                C93691aUx c93691aUx = new C93691aUx(context);
                c93691aUx.setLayoutParams(C93902aYM.LIZJ(linearLayout, -1, -2, 0, 0, null, null, Integer.valueOf(C93742aVm.LIZIZ(8)), null, null, null, 956));
                new IDqS419S0100000_42(c93696aV2, 58).invoke(c93691aUx);
                C93902aYM.LIZ(c93691aUx, linearLayout);
                if (d != null) {
                    c93696aV2.LIZIZ(linearLayout, 0.5d, 30.0d, d.doubleValue());
                }
            } else {
                o.LJIJI("contentContainer");
                throw null;
            }
        } else {
            LinearLayout linearLayout3 = c93696aV2.LJLJJLL;
            if (linearLayout3 != null) {
                c93696aV2.LIZ(linearLayout3, d, 0.5d, 30.0d);
            } else {
                o.LJIJI("contentContainer");
                throw null;
            }
        }
        if (z2) {
            LinearLayout linearLayout4 = c93696aV2.LJLJJLL;
            if (linearLayout4 != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C93742aVm.LIZIZ(50));
                    View view = c93696aV2.LJLJL;
                    if (view != null) {
                        C93729aVZ.LJI(view);
                    } else {
                        o.LJIJI("deleteIcon");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                o.LJIJI("contentContainer");
                throw null;
            }
        } else {
            LinearLayout linearLayout5 = c93696aV2.LJLJJLL;
            if (linearLayout5 != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout5.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C93742aVm.LIZIZ(24));
                    View view2 = c93696aV2.LJLJL;
                    if (view2 != null) {
                        C93729aVZ.LIZJ(view2);
                    } else {
                        o.LJIJI("deleteIcon");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                o.LJIJI("contentContainer");
                throw null;
            }
        }
        C94210adK c94210adK = c93696aV2.LJLILLLLZI;
        if (c94210adK != null) {
            String string = c93696aV2.getContext().getString(R.string.hg);
            o.LJIIIIZZ(string, "context.getString(Langua…ect_tool_object_helptext)");
            c94210adK.LJJLJLI(string, arrayList);
            C93691aUx c93691aUx2 = c93696aV2.LJLJI;
            if (c93691aUx2 != null) {
                String string2 = c93696aV2.getContext().getString(R.string.gy);
                o.LJIIIIZZ(string2, "context.getString(Langua…ect_tool_action_helptext)");
                c93691aUx2.LIZ(actionName, string2);
                if (z) {
                    AppCompatTextView appCompatTextView = c93696aV2.LJLIL;
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(c93696aV2.getContext().getString(R.string.hh));
                    } else {
                        o.LJIJI("actionTips");
                        throw null;
                    }
                } else {
                    AppCompatTextView appCompatTextView2 = c93696aV2.LJLIL;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(c93696aV2.getContext().getString(R.string.h0));
                    } else {
                        o.LJIJI("actionTips");
                        throw null;
                    }
                }
                C93690aUw scrollIconContainer = viewHolder2.LJLIL.getObjectContainer().getScrollIconContainer();
                ((ArrayList) scrollIconContainer.LJLIL).clear();
                ((ArrayList) scrollIconContainer.LJLIL).add(new C94235adj(data));
                ((ArrayList) scrollIconContainer.LJLILLLLZI).clear();
                ((ArrayList) scrollIconContainer.LJLILLLLZI).add(new IDCListenerS149S0200000_42(scrollIconContainer, data, 3));
                return;
            }
            o.LJIJI("actionContainer");
            throw null;
        }
        o.LJIJI("objectContainer");
        throw null;
    }
}

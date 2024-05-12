package Y;

import X.C023107f;
import X.C32151Nz;
import X.C47135Ieh;
import X.C54587Lbb;
import X.C54849Lfp;
import X.C71899SJr;
import X.C79045V0n;
import X.EnumC71803SFz;
import X.EnumC71900SJs;
import X.KL2;
import X.M8V;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment;
import com.ss.android.ugc.aweme.roaming.UserCurrentRegionCell;
import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDLListenerS196S0100000_9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        WrapGridLayoutManager wrapGridLayoutManager = ((AdFakeUserProfileAwemeListFragment) iDLListenerS196S0100000_9.l0).LJLJI;
        if (wrapGridLayoutManager != null) {
            if (wrapGridLayoutManager.LLILL() == -1) {
                return;
            }
            ((AdFakeUserProfileAwemeListFragment) iDLListenerS196S0100000_9.l0).vl(true);
            RecyclerView recyclerView = ((AdFakeUserProfileAwemeListFragment) iDLListenerS196S0100000_9.l0).LJLIL;
            if (recyclerView != null) {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
                return;
            } else {
                o.LJIJI("mListView");
                throw null;
            }
        }
        o.LJIJI("mLayoutManager");
        throw null;
    }

    public static final void onGlobalLayout$1(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        if (((UserCurrentRegionCell) iDLListenerS196S0100000_9.l0).itemView.getMeasuredWidth() > 0) {
            UserCurrentRegionCell userCurrentRegionCell = (UserCurrentRegionCell) iDLListenerS196S0100000_9.l0;
            LinearLayout linearLayout = userCurrentRegionCell.LJLJI;
            if (linearLayout != null) {
                linearLayout.setMinimumWidth((userCurrentRegionCell.itemView.getMeasuredWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))) / 2);
                ((UserCurrentRegionCell) iDLListenerS196S0100000_9.l0).itemView.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
            } else {
                o.LJIJI("llCurrentRegion");
                throw null;
            }
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        Integer num;
        Integer num2;
        View view;
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view2 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJLZ;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJLZ;
            Integer num3 = null;
            if (view3 != null && (layoutParams2 = view3.getLayoutParams()) != null) {
                num = Integer.valueOf(layoutParams2.height);
            } else {
                num = null;
            }
            View view4 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJZ;
            if (view4 != null) {
                num2 = Integer.valueOf(view4.getHeight());
            } else {
                num2 = null;
            }
            if (!o.LJ(num, num2)) {
                View view5 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJLZ;
                if (view5 != null && (layoutParams = view5.getLayoutParams()) != null) {
                    View view6 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJZ;
                    if (view6 != null) {
                        num3 = Integer.valueOf(view6.getHeight());
                    }
                    layoutParams.height = num3.intValue();
                }
                View view7 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJLZ;
                if (view7 != null) {
                    view7.requestLayout();
                }
                View view8 = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJZ;
                if ((view8 != null && view8.getHeight() == 0) || (view = ((NearbySkylightBaseAssem) iDLListenerS196S0100000_9.l0).LJZ) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
            }
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        int i;
        ViewTreeObserver viewTreeObserver;
        C54587Lbb c54587Lbb = (C54587Lbb) iDLListenerS196S0100000_9.l0;
        View view = c54587Lbb.LIZLLL;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        c54587Lbb.LJIIIZ = i;
        View view2 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LIZLLL;
        if (view2 == null || view2.getVisibility() != 8) {
            View view3 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LIZLLL;
            if (view3 != null && view3.getVisibility() == 8) {
                return;
            }
            View view4 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LIZLLL;
            if (view4 != null && view4.getHeight() == 0) {
                return;
            }
        }
        View view5 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LIZLLL;
        if (view5 != null && (viewTreeObserver = view5.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        Integer num;
        Integer num2;
        View view;
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view2 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJII;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJII;
            Integer num3 = null;
            if (view3 != null && (layoutParams2 = view3.getLayoutParams()) != null) {
                num = Integer.valueOf(layoutParams2.height);
            } else {
                num = null;
            }
            View view4 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJIIIIZZ;
            if (view4 != null) {
                num2 = Integer.valueOf(view4.getHeight());
            } else {
                num2 = null;
            }
            if (!o.LJ(num, num2)) {
                View view5 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJII;
                if (view5 != null && (layoutParams = view5.getLayoutParams()) != null) {
                    View view6 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJIIIIZZ;
                    if (view6 != null) {
                        num3 = Integer.valueOf(view6.getHeight());
                    }
                    layoutParams.height = num3.intValue();
                }
                View view7 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJII;
                if (view7 != null) {
                    view7.requestLayout();
                }
                View view8 = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJIIIIZZ;
                if ((view8 != null && view8.getHeight() == 0) || (view = ((C54587Lbb) iDLListenerS196S0100000_9.l0).LJIIIIZZ) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
            }
        }
    }

    public static final void onGlobalLayout$5(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int height = ((C54849Lfp) iDLListenerS196S0100000_9.l0).getHeight();
        Integer num = ((C54849Lfp) iDLListenerS196S0100000_9.l0).LJLLILLLL;
        if (num == null || height != num.intValue()) {
            int LIZ = C47135Ieh.LIZ(36, ((C54849Lfp) iDLListenerS196S0100000_9.l0).getHeight());
            ViewGroup.LayoutParams layoutParams = ((C54849Lfp) iDLListenerS196S0100000_9.l0).LJLJJLL.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams3.topMargin = (int) (LIZ * 0.18f);
            }
            ViewGroup.LayoutParams layoutParams2 = ((C54849Lfp) iDLListenerS196S0100000_9.l0).LJLJLJ.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.height = (int) (LIZ * 0.315f);
            }
            ViewGroup.LayoutParams layoutParams3 = ((C54849Lfp) iDLListenerS196S0100000_9.l0).LJLJLLL.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.height = (int) (LIZ * 0.185f);
            }
            C54849Lfp c54849Lfp = (C54849Lfp) iDLListenerS196S0100000_9.l0;
            View view = c54849Lfp.LJLJLLL;
            C71899SJr c71899SJr = new C71899SJr();
            Context context = c54849Lfp.LJLJL.getContext();
            o.LJIIIIZZ(context, "ivCardBg.context");
            c71899SJr.LIZJ = C79045V0n.LJ(R.attr.d4, context);
            c71899SJr.LJ = Float.valueOf(0.0f);
            c71899SJr.LJFF = Float.valueOf(1.0f);
            c71899SJr.LJI = EnumC71803SFz.VERTICAL;
            c71899SJr.LJII = EnumC71900SJs.LINEAR;
            Context context2 = ((C54849Lfp) iDLListenerS196S0100000_9.l0).LJLJL.getContext();
            o.LJIIIIZZ(context2, "ivCardBg.context");
            view.setBackground(c71899SJr.LIZ(context2));
            ((C54849Lfp) iDLListenerS196S0100000_9.l0).requestLayout();
        }
        C54849Lfp c54849Lfp2 = (C54849Lfp) iDLListenerS196S0100000_9.l0;
        c54849Lfp2.LJLLILLLL = Integer.valueOf(c54849Lfp2.getHeight());
    }

    public static final void onGlobalLayout$6(IDLListenerS196S0100000_9 iDLListenerS196S0100000_9) {
        ViewTreeObserver viewTreeObserver = ((M8V) iDLListenerS196S0100000_9.l0).LIZLLL.getViewTreeObserver();
        o.LJIIIIZZ(viewTreeObserver, "contentTV.viewTreeObserver");
        viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS196S0100000_9);
        if (((M8V) iDLListenerS196S0100000_9.l0).LIZLLL.getLineCount() > 3) {
            ViewGroup.LayoutParams layoutParams = ((M8V) iDLListenerS196S0100000_9.l0).LIZJ.getLayoutParams();
            layoutParams.height = (int) KL2.LIZJ(((M8V) iDLListenerS196S0100000_9.l0).LIZ, 84.0f);
            ((M8V) iDLListenerS196S0100000_9.l0).LIZJ.setLayoutParams(layoutParams);
            ((M8V) iDLListenerS196S0100000_9.l0).LIZLLL.getLayoutParams().height = (int) KL2.LIZJ(((M8V) iDLListenerS196S0100000_9.l0).LIZ, 68.0f);
            C023107f.LIZIZ(((M8V) iDLListenerS196S0100000_9.l0).LIZLLL, 2, 13, 1, 2);
            ((M8V) iDLListenerS196S0100000_9.l0).getContentView().measure(0, 0);
            M8V m8v = (M8V) iDLListenerS196S0100000_9.l0;
            m8v.LJ = 0;
            m8v.getClass();
            try {
                m8v.dismiss();
            } catch (Exception unused) {
            }
            ((M8V) iDLListenerS196S0100000_9.l0).LIZIZ();
        }
    }

    public IDLListenerS196S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

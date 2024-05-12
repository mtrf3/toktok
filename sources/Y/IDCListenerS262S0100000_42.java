package Y;

import X.ActivityC45651qj;
import X.C0A2;
import X.C93690aUw;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93916aYa;
import X.C93932aYq;
import X.C94194ad4;
import X.C94338afO;
import X.C94530aiU;
import X.C94613ajp;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.ugc.effectcreator.main.MainImpl;
import com.bytedance.ugc.effectcreator.main.MainLiveData;
import com.ugc.effectcreator.canvas.CanvasFragment;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS262S0100000_42 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS262S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WindowManager windowManager;
        Display defaultDisplay;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout;
        C94613ajp c94613ajp;
        C94613ajp c94613ajp2;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS262S0100000_42);
        ActivityC45651qj mo49getActivity = ((CanvasFragment) iDCListenerS262S0100000_42.l0).mo49getActivity();
        if (mo49getActivity != null && (windowManager = mo49getActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i9 = displayMetrics.heightPixels;
            C94338afO c94338afO = ((CanvasFragment) iDCListenerS262S0100000_42.l0).LJLILLLLZI;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (c94338afO != null && (c94613ajp2 = c94338afO.LJLJI) != null) {
                layoutParams = c94613ajp2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams2 = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            C94338afO c94338afO2 = ((CanvasFragment) iDCListenerS262S0100000_42.l0).LJLILLLLZI;
            if (c94338afO2 != null && (frameLayout = c94338afO2.LJLIL) != null && marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C93742aVm.LIZJ(163.0f) - (i9 - frameLayout.getMeasuredHeight());
                C94338afO c94338afO3 = ((CanvasFragment) iDCListenerS262S0100000_42.l0).LJLILLLLZI;
                if (c94338afO3 != null && (c94613ajp = c94338afO3.LJLJI) != null) {
                    c94613ajp.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public static final void onLayoutChange$1(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Iterator<View.OnLayoutChangeListener> it = ((C93690aUw) iDCListenerS262S0100000_42.l0).LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    public static final void onLayoutChange$2(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((BehaviourEditFragment) iDCListenerS262S0100000_42.l0).Ml();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLayoutChange$3(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerView;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS262S0100000_42);
        C94194ad4 c94194ad4 = (C94194ad4) ((C94530aiU) ((IDqS175S0200000_42) iDCListenerS262S0100000_42.l0).l0).LJLIL.Al();
        if (c94194ad4 != null && (recyclerView = c94194ad4.LJLJI) != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView.ViewHolder LJJIJIL = recyclerView.LJJIJIL((View) ((IDqS175S0200000_42) iDCListenerS262S0100000_42.l0).l1);
                int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
                if (LJJIJIL != null && LLILLJJLI == LJJIJIL.getAdapterPosition()) {
                    View view2 = LJJIJIL.itemView;
                    o.LJIIIIZZ(view2, "vh.itemView");
                    int i9 = C93729aVZ.LIZ(view2).bottom - C93729aVZ.LIZ(recyclerView).bottom;
                    if (i9 > 0) {
                        recyclerView.LJLIIIL(0, i9);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    public static final void onLayoutChange$4(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MainLiveData<Rect> topToolPanelLocation;
        ConstraintLayout constraintLayout = MainFragment.vl((MainFragment) iDCListenerS262S0100000_42.l0).LLIIIZ;
        o.LJIIIIZZ(constraintLayout, "binding.llTopToolPanel");
        Rect LIZ = C93729aVZ.LIZ(constraintLayout);
        MainImpl LIZ2 = C93932aYq.LIZ();
        if (LIZ2 != null && (topToolPanelLocation = LIZ2.getTopToolPanelLocation()) != null) {
            topToolPanelLocation.setValue(new Rect(LIZ.left, LIZ.top, LIZ.right, LIZ.bottom));
        }
    }

    public static final void onLayoutChange$5(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS262S0100000_42);
        LiquefyFragment liquefyFragment = (LiquefyFragment) iDCListenerS262S0100000_42.l0;
        if (liquefyFragment.LJLJJL != null) {
            return;
        }
        liquefyFragment.LJLJJL = new C93916aYa().LIZ(view, new IDqS423S0100000_42(iDCListenerS262S0100000_42, 156));
    }
}

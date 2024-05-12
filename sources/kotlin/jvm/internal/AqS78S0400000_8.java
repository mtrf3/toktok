package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass636;
import X.C07290Qj;
import X.C110614Vt;
import X.C141335gf;
import X.C34K;
import X.C3C5;
import X.C47959Irz;
import X.C50197Jmz;
import X.C50202Jn4;
import X.C50214JnG;
import X.C50248Jno;
import X.C50322Jp0;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.InterfaceC88471Ynr;
import X.JVD;
import X.KNV;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubPictureComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class AqS78S0400000_8 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS78S0400000_8 aqS78S0400000_8, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue == 0) {
            ((FrameLayout) aqS78S0400000_8.l0).setVisibility(0);
            if (!((C34K) aqS78S0400000_8.l1).element) {
                SearchHubHeaderVM searchHubHeaderVM = (SearchHubHeaderVM) ((SearchHubPictureComponent) aqS78S0400000_8.l2).LJLJLLL.getValue();
                C50214JnG picture = (C50214JnG) aqS78S0400000_8.l3;
                o.LJIIIZ(picture, "picture");
                searchHubHeaderVM.withState(new AqS139S0200000_8(searchHubHeaderVM, picture, 28));
                ((C34K) aqS78S0400000_8.l1).element = true;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS78S0400000_8 aqS78S0400000_8, Object selectSubscribe, Object obj) {
        Object LIZ;
        int[] iArr;
        Integer num;
        Integer LJI;
        int i;
        int i2;
        C50202Jn4 searchHubTabs = (C50202Jn4) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(searchHubTabs, "searchHubTabs");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C50248Jno c50248Jno = (C50248Jno) aqS78S0400000_8.l0;
        String str = searchHubTabs.LIZIZ;
        c50248Jno.getClass();
        try {
            LIZ = Integer.valueOf(Color.parseColor(str));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num2 = (Integer) LIZ;
        int i3 = 0;
        int[][] iArr2 = {new int[]{R.attr.state_selected}, new int[0]};
        if (num2 != null) {
            iArr = new int[2];
            Context context = c50248Jno.LJLLI.x3().getContext();
            o.LJIIIIZZ(context, "contentView.context");
            Integer LJI2 = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.dj, context);
            if (LJI2 != null) {
                iArr[0] = LJI2.intValue();
                int intValue = num2.intValue();
                Context context2 = c50248Jno.LJLLI.x3().getContext();
                o.LJIIIIZZ(context2, "contentView.context");
                if (AnonymousClass636.LJIILJJIL(context2)) {
                    i2 = 219;
                } else {
                    i2 = 204;
                }
                iArr[1] = C07290Qj.LJIIL(intValue, i2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            iArr = new int[2];
            Context context3 = c50248Jno.LJLLI.x3().getContext();
            o.LJIIIIZZ(context3, "contentView.context");
            Integer LJI3 = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.cl, context3);
            if (LJI3 != null) {
                iArr[0] = LJI3.intValue();
                Context context4 = c50248Jno.LJLLI.x3().getContext();
                o.LJIIIIZZ(context4, "contentView.context");
                Integer LJI4 = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.gx, context4);
                if (LJI4 != null) {
                    iArr[1] = LJI4.intValue();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        c50248Jno.LJLILLLLZI = new ColorStateList(iArr2, iArr);
        StateListDrawable stateListDrawable = new StateListDrawable();
        SearchHubTabsComponent searchHubTabsComponent = c50248Jno.LJLLI;
        int[] iArr3 = {R.attr.state_selected};
        C110614Vt c110614Vt = new C110614Vt();
        if (num2 == null) {
            Context context5 = searchHubTabsComponent.x3().getContext();
            o.LJIIIIZZ(context5, "contentView.context");
            num = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.gu, context5);
            if (num == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            num = num2;
        }
        c110614Vt.LIZ = num;
        c110614Vt.LIZJ = Float.valueOf(c50248Jno.LJLIL);
        Context context6 = searchHubTabsComponent.x3().getContext();
        o.LJIIIIZZ(context6, "contentView.context");
        stateListDrawable.addState(iArr3, c110614Vt.LIZ(context6));
        int[] iArr4 = new int[0];
        C110614Vt c110614Vt2 = new C110614Vt();
        if (num2 != null) {
            int intValue2 = num2.intValue();
            Context context7 = searchHubTabsComponent.x3().getContext();
            o.LJIIIIZZ(context7, "contentView.context");
            if (AnonymousClass636.LJIILJJIL(context7)) {
                i = 40;
            } else {
                i = 25;
            }
            LJI = Integer.valueOf(C07290Qj.LJIIL(intValue2, i));
        } else {
            Context context8 = searchHubTabsComponent.x3().getContext();
            o.LJIIIIZZ(context8, "contentView.context");
            LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.cg, context8);
            if (LJI == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        c110614Vt2.LIZ = LJI;
        c110614Vt2.LIZJ = Float.valueOf(c50248Jno.LJLIL);
        Context context9 = searchHubTabsComponent.x3().getContext();
        o.LJIIIIZZ(context9, "contentView.context");
        stateListDrawable.addState(iArr4, c110614Vt2.LIZ(context9));
        c50248Jno.LJLJI = stateListDrawable;
        C50248Jno c50248Jno2 = (C50248Jno) aqS78S0400000_8.l0;
        c50248Jno2.getClass();
        if (!searchHubTabs.LIZ.isEmpty()) {
            Iterator<SearchLabel> it = searchHubTabs.LIZ.iterator();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            while (it.hasNext()) {
                d += c50248Jno2.LJLJL.measureText(it.next().labelText);
            }
            int LIZJ = C47959Irz.LIZJ(24, ((searchHubTabs.LIZ.size() - 1) * C7MY.LIZIZ(8)) + (searchHubTabs.LIZ.size() * C7MY.LIZIZ(24)) + ((int) d));
            int i4 = c50248Jno2.LJLJLJ;
            if (LIZJ < i4) {
                i3 = (i4 - LIZJ) / searchHubTabs.LIZ.size();
            }
        }
        c50248Jno2.LJLJLLL = i3;
        ((C50248Jno) aqS78S0400000_8.l0).LJLJJLL.clear();
        ((C50248Jno) aqS78S0400000_8.l0).LJLJJLL.addAll(searchHubTabs.LIZ);
        ((RecyclerView) aqS78S0400000_8.l1).setAdapter((C50248Jno) aqS78S0400000_8.l2);
        RecyclerView recyclerView = (RecyclerView) aqS78S0400000_8.l1;
        JVD.LIZ(recyclerView, new C50197Jmz(elapsedRealtime, (SearchHubTabsComponent) aqS78S0400000_8.l3, recyclerView));
        ((C50248Jno) aqS78S0400000_8.l0).LJLL = ((C50322Jp0) KNV.LIZ()).LJLJI;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S0400000_8(C50248Jno c50248Jno, RecyclerView recyclerView, C50248Jno c50248Jno2, SearchHubTabsComponent searchHubTabsComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = c50248Jno;
        this.l1 = recyclerView;
        this.l2 = c50248Jno2;
        this.l3 = searchHubTabsComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S0400000_8(FrameLayout frameLayout, C34K c34k, SearchHubPictureComponent searchHubPictureComponent, C50214JnG c50214JnG, int i) {
        super(2);
        this.$t = i;
        this.l0 = frameLayout;
        this.l1 = c34k;
        this.l2 = searchHubPictureComponent;
        this.l3 = c50214JnG;
    }
}

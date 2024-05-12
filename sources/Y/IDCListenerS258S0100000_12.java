package Y;

import X.C0A2;
import X.C119234m7;
import X.C70216Rh6;
import X.C70387Rjr;
import X.DialogC71377Rzp;
import X.InterfaceC70389Rjt;
import X.InterfaceC71443S2d;
import X.InterfaceC88472Yns;
import X.LBV;
import X.S2X;
import X.SIZ;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDCListenerS258S0100000_12 implements View.OnLayoutChangeListener {
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
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS258S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        if (((Boolean) ((InterfaceC88472Yns) iDCListenerS258S0100000_12.l0).invoke(view)).booleanValue()) {
            view.removeOnLayoutChangeListener(iDCListenerS258S0100000_12);
        }
    }

    public static final void onLayoutChange$1(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((LBV) ((ProductReviewFragment) iDCListenerS258S0100000_12.l0)._$_findCachedViewById(R.id.k79)).LIZIZ() > i3 - i) {
            ((ProductReviewFragment) iDCListenerS258S0100000_12.l0)._$_findCachedViewById(R.id.k71).setVisibility(8);
            ((ProductReviewFragment) iDCListenerS258S0100000_12.l0)._$_findCachedViewById(R.id.k72).setVisibility(0);
        } else {
            ((ProductReviewFragment) iDCListenerS258S0100000_12.l0)._$_findCachedViewById(R.id.k71).setVisibility(0);
            ((ProductReviewFragment) iDCListenerS258S0100000_12.l0)._$_findCachedViewById(R.id.k72).setVisibility(8);
        }
        ProductReviewFragment productReviewFragment = (ProductReviewFragment) iDCListenerS258S0100000_12.l0;
        productReviewFragment._$_findCachedViewById(R.id.k71).removeOnLayoutChangeListener(productReviewFragment.LLIIII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r2.intValue() != r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$2(Y.IDCListenerS258S0100000_12 r6, android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel r1 = r0.wl()
            int r5 = r7.getMeasuredHeight()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r1.LJLJLJ
            r4 = 1062836634(0x3f59999a, float:0.85)
            r3 = 0
            if (r0 != 0) goto L27
        L19:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r0.LJLLILLLL
            if (r1 != 0) goto L22
        L21:
            return
        L22:
            r0 = 3
            r1.setState(r0)
            goto L21
        L27:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLJJLL
            if (r0 == 0) goto L37
            java.lang.Integer r2 = r0.getSkuType()
            X.Rfe r0 = X.EnumC70126Rfe.SKU
            int r1 = r0.getValue()
            if (r2 != 0) goto L6a
        L37:
            int r0 = X.C27162AlK.LIZIZ
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            if (r0 > r5) goto L19
            int r0 = X.C27162AlK.LIZIZ
            float r0 = (float) r0
            float r0 = r0 * r4
            int r2 = (int) r0
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment) r0
            android.app.Dialog r1 = r0.getDialog()
            if (r1 == 0) goto L5a
            r0 = 2131363373(0x7f0a062d, float:1.8346553E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L5a
            int r3 = r0.getHeight()
        L5a:
            int r2 = r2 - r3
            r0 = 2131371268(0x7f0a2504, float:1.8362566E38)
            android.view.View r0 = r7.findViewById(r0)
            X.4e3 r0 = (X.C114234e3) r0
            if (r0 == 0) goto L19
            r0.setMaxHeight(r2)
            goto L19
        L6a:
            int r0 = r2.intValue()
            if (r0 != r1) goto L37
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS258S0100000_12.onLayoutChange$2(Y.IDCListenerS258S0100000_12, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$3(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS258S0100000_12);
        C0A2 layoutManager = ((RecyclerView) iDCListenerS258S0100000_12.l0).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            SIZ.LIZ = Math.min(linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLIL(), 3);
        }
    }

    public static final void onLayoutChange$4(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        DialogC71377Rzp dialogC71377Rzp = (DialogC71377Rzp) iDCListenerS258S0100000_12.l0;
        int measuredHeight = v.getMeasuredHeight();
        dialogC71377Rzp.getClass();
        try {
            Object parent = ((C119234m7) dialogC71377Rzp.findViewById(R.id.a40)).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            if (from != null) {
                from.setPeekHeight(measuredHeight);
            }
        } catch (Exception unused) {
        }
        v.removeOnLayoutChangeListener(iDCListenerS258S0100000_12);
    }

    public static final void onLayoutChange$5(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        List<C70216Rh6> list;
        ((C70387Rjr) iDCListenerS258S0100000_12.l0).removeOnLayoutChangeListener(iDCListenerS258S0100000_12);
        C70387Rjr c70387Rjr = (C70387Rjr) iDCListenerS258S0100000_12.l0;
        if (c70387Rjr.LJZI && (list = c70387Rjr.LJLJL) != null && list.size() == 1) {
            List<C70216Rh6> list2 = ((C70387Rjr) iDCListenerS258S0100000_12.l0).LJLJL;
            if (list2 != null) {
                C70216Rh6 c70216Rh6 = (C70216Rh6) ListProtector.get(list2, 0);
                if (c70216Rh6 != null) {
                    if (!c70216Rh6.LJ) {
                        ((C70387Rjr) iDCListenerS258S0100000_12.l0).LJLZ.LJIIIIZZ();
                    }
                    C70387Rjr c70387Rjr2 = (C70387Rjr) iDCListenerS258S0100000_12.l0;
                    c70387Rjr2.LJLJLJ = c70216Rh6;
                    c70387Rjr2.LIZJ();
                    C70387Rjr c70387Rjr3 = (C70387Rjr) iDCListenerS258S0100000_12.l0;
                    InterfaceC70389Rjt interfaceC70389Rjt = c70387Rjr3.LJLLI;
                    if (interfaceC70389Rjt != null) {
                        interfaceC70389Rjt.LIZ(c70387Rjr3.LJLL, c70387Rjr3.LJLJLJ);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("itemViewInfoList");
            throw null;
        }
    }

    public static final void onLayoutChange$6(IDCListenerS258S0100000_12 iDCListenerS258S0100000_12, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            InterfaceC71443S2d LJFF = ((S2X) iDCListenerS258S0100000_12.l0).LJFF();
            S2X s2x = (S2X) iDCListenerS258S0100000_12.l0;
            if (LJFF.LJIILJJIL(s2x.LJII, s2x.LJIIIIZZ)) {
                ((S2X) iDCListenerS258S0100000_12.l0).LIZ.requestLayout();
                return;
            }
        }
        InterfaceC71443S2d LJFF2 = ((S2X) iDCListenerS258S0100000_12.l0).LJFF();
        S2X s2x2 = (S2X) iDCListenerS258S0100000_12.l0;
        if (LJFF2.LJIIL(s2x2.LJII, s2x2.LJIIIIZZ)) {
            ((S2X) iDCListenerS258S0100000_12.l0).LIZ.requestLayout();
        }
    }
}

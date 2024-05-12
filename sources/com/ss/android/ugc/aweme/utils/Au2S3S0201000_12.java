package com.ss.android.ugc.aweme.utils;

import X.C0A2;
import X.C26338AVi;
import X.C47261Igj;
import X.C70261Rhp;
import X.C70265Rht;
import X.C70676RoW;
import X.C70834Rr4;
import X.C71335Rz9;
import X.InterfaceC70263Rhr;
import X.InterfaceC70269Rhx;
import X.InterfaceC70680Roa;
import X.ORZ;
import X.SF7;
import X.TAT;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S3S0201000_12 extends TAT {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        C71335Rz9 c71335Rz9 = (C71335Rz9) au2S3S0201000_12.l0;
        c71335Rz9.L(c71335Rz9.LJLIL, au2S3S0201000_12.i2, (ShopWindowAnchorModel) au2S3S0201000_12.l1, "other");
    }

    public static final void LIZ$1(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        C71335Rz9 c71335Rz9 = (C71335Rz9) au2S3S0201000_12.l0;
        c71335Rz9.L(c71335Rz9.LJLIL, au2S3S0201000_12.i2, (ShopWindowAnchorModel) au2S3S0201000_12.l1, "pic");
    }

    public static final void LIZ$2(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        C71335Rz9 c71335Rz9 = (C71335Rz9) au2S3S0201000_12.l0;
        c71335Rz9.L(c71335Rz9.LJLIL, au2S3S0201000_12.i2, (ShopWindowAnchorModel) au2S3S0201000_12.l1, "info");
    }

    public static final void LIZ$3(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        C71335Rz9 c71335Rz9 = (C71335Rz9) au2S3S0201000_12.l0;
        c71335Rz9.L(c71335Rz9.LJLIL, au2S3S0201000_12.i2, (ShopWindowAnchorModel) au2S3S0201000_12.l1, "info");
    }

    public static final void LIZ$4(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        C71335Rz9 c71335Rz9 = (C71335Rz9) au2S3S0201000_12.l0;
        c71335Rz9.L(c71335Rz9.LJLIL, au2S3S0201000_12.i2, (ShopWindowAnchorModel) au2S3S0201000_12.l1, "info");
    }

    public static final void LIZ$5(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        AqS194S0100000_12 aqS194S0100000_12;
        if (view != null && (aqS194S0100000_12 = ((SF7) au2S3S0201000_12.l0).LJLJI) != null) {
            aqS194S0100000_12.invoke(Integer.valueOf(au2S3S0201000_12.i2), (CpfElem) au2S3S0201000_12.l1);
        }
    }

    public static final void LIZ$6(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        if (view != null) {
            OptionV1 optionV1 = (OptionV1) au2S3S0201000_12.l0;
            if (optionV1.isEnabled) {
                C70834Rr4 c70834Rr4 = (C70834Rr4) au2S3S0201000_12.l1;
                c70834Rr4.LJLILLLLZI = optionV1.filter.filterId;
                IDqS436S0100000_12 iDqS436S0100000_12 = c70834Rr4.LJLJJI;
                if (iDqS436S0100000_12 != null) {
                    iDqS436S0100000_12.invoke(view, optionV1, Integer.valueOf(au2S3S0201000_12.i2));
                }
                ((C70834Rr4) au2S3S0201000_12.l1).notifyItemChanged(au2S3S0201000_12.i2);
                return;
            }
            AqS178S0100000_12 aqS178S0100000_12 = ((C70834Rr4) au2S3S0201000_12.l1).LJLJJL;
            if (aqS178S0100000_12 == null) {
                return;
            }
            aqS178S0100000_12.invoke(optionV1);
        }
    }

    public static final void LIZ$7(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        LinearLayoutManager linearLayoutManager;
        if (view == null || !((InterfaceC70269Rhx) au2S3S0201000_12.l0).isEnable()) {
            return;
        }
        int i = -1;
        if (!((InterfaceC70269Rhx) au2S3S0201000_12.l0).LIZ()) {
            C70261Rhp c70261Rhp = (C70261Rhp) au2S3S0201000_12.l1;
            String id = ((InterfaceC70269Rhx) au2S3S0201000_12.l0).getId();
            c70261Rhp.getClass();
            o.LJIIIZ(id, "id");
            List<? extends InterfaceC70269Rhx> LLJILJILJ = ORZ.LLJILJILJ(c70261Rhp.LJLJI);
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC70269Rhx interfaceC70269Rhx = (InterfaceC70269Rhx) next;
                    if (interfaceC70269Rhx.isEnable()) {
                        if (o.LJ(interfaceC70269Rhx.getId(), id)) {
                            c70261Rhp.LJLJJLL = i2;
                            ListProtector.set(LLJILJILJ, i2, ((InterfaceC70269Rhx) ListProtector.get(LLJILJILJ, i2)).LIZIZ(true));
                        } else {
                            ListProtector.set(LLJILJILJ, i2, ((InterfaceC70269Rhx) ListProtector.get(LLJILJILJ, i2)).LIZIZ(false));
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c70261Rhp.LJLJI = LLJILJILJ;
            C70265Rht c70265Rht = c70261Rhp.LJLJLJ;
            if (c70265Rht != null) {
                c70265Rht.submitList(LLJILJILJ);
            }
            C0A2 layoutManager = c70261Rhp.LJLJL.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int LLILL = linearLayoutManager.LLILL();
                int LLILLJJLI = linearLayoutManager.LLILLJJLI();
                if (c70261Rhp.LJLJI.size() > Math.abs(LLILL - LLILLJJLI) && c70261Rhp.LJLJL.getChildCount() > 0 && c70261Rhp.LJLJJLL != -1) {
                    int i4 = (LLILL + LLILLJJLI) / 2;
                    int width = c70261Rhp.LJLJL.getChildAt(0).getWidth();
                    Context context = c70261Rhp.getContext();
                    o.LJIIIIZZ(context, "context");
                    if (!C26338AVi.LIZJ(context)) {
                        i = 1;
                    }
                    if ((c70261Rhp.LJLJJLL <= i4 || c70261Rhp.LJLJL.canScrollHorizontally(i)) && (c70261Rhp.LJLJJLL >= i4 || c70261Rhp.LJLJL.canScrollHorizontally(-i))) {
                        int abs = (int) ((Math.abs(c70261Rhp.LJLJJLL - i4) + 0.5d) * width);
                        if (c70261Rhp.LJLJJLL <= i4) {
                            i = -i;
                        }
                        c70261Rhp.LJLJL.LJLIIIL(abs * i, 0);
                    }
                }
            }
            InterfaceC70263Rhr<InterfaceC70269Rhx> interfaceC70263Rhr = ((C70261Rhp) au2S3S0201000_12.l1).LJLJJL;
            if (interfaceC70263Rhr == null) {
                return;
            }
            interfaceC70263Rhr.LIZIZ((InterfaceC70269Rhx) au2S3S0201000_12.l0, true, au2S3S0201000_12.i2);
            return;
        }
        C70261Rhp c70261Rhp2 = (C70261Rhp) au2S3S0201000_12.l1;
        if (!c70261Rhp2.LJLJJI) {
            return;
        }
        String id2 = ((InterfaceC70269Rhx) au2S3S0201000_12.l0).getId();
        c70261Rhp2.getClass();
        o.LJIIIZ(id2, "id");
        if (c70261Rhp2.LJLJJI) {
            List<? extends InterfaceC70269Rhx> LLJILJILJ2 = ORZ.LLJILJILJ(c70261Rhp2.LJLJI);
            Iterator it2 = ((ArrayList) LLJILJILJ2).iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    InterfaceC70269Rhx interfaceC70269Rhx2 = (InterfaceC70269Rhx) next2;
                    if (interfaceC70269Rhx2.isEnable() && o.LJ(interfaceC70269Rhx2.getId(), id2)) {
                        c70261Rhp2.LJLJJLL = -1;
                        ListProtector.set(LLJILJILJ2, i5, ((InterfaceC70269Rhx) ListProtector.get(LLJILJILJ2, i5)).LIZIZ(false));
                    }
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c70261Rhp2.LJLJI = LLJILJILJ2;
            C70265Rht c70265Rht2 = c70261Rhp2.LJLJLJ;
            if (c70265Rht2 != null) {
                c70265Rht2.submitList(LLJILJILJ2);
            }
        }
        InterfaceC70263Rhr<InterfaceC70269Rhx> interfaceC70263Rhr2 = ((C70261Rhp) au2S3S0201000_12.l1).LJLJJL;
        if (interfaceC70263Rhr2 == null) {
            return;
        }
        interfaceC70263Rhr2.LIZIZ((InterfaceC70269Rhx) au2S3S0201000_12.l0, false, au2S3S0201000_12.i2);
    }

    public static final void LIZ$8(Au2S3S0201000_12 au2S3S0201000_12, View view) {
        if (view != null) {
            ReviewMedia reviewMedia = (ReviewMedia) au2S3S0201000_12.l0;
            InterfaceC70680Roa listener = ((C70676RoW) au2S3S0201000_12.l1).getListener();
            if (listener != null) {
                listener.LIZ(au2S3S0201000_12.i2, reviewMedia);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S3S0201000_12(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }

    public Au2S3S0201000_12(C71335Rz9 c71335Rz9, int i, ShopWindowAnchorModel shopWindowAnchorModel, int i2) {
        this.$t = i2;
        this.l0 = c71335Rz9;
        this.i2 = i;
        this.l1 = shopWindowAnchorModel;
    }
}

package Y;

import X.C1E5;
import X.C35794E3a;
import X.C74477TKv;
import X.C76800UCe;
import X.C78596Usy;
import X.C81392Vwy;
import X.C82247WPr;
import X.C82268WQm;
import X.C9B4;
import X.EnumC74492TLk;
import X.EnumC82260WQe;
import X.InterfaceC45734HxC;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.THY;
import X.TK2;
import X.VWQ;
import X.W1T;
import X.W3Z;
import X.W5C;
import X.W8A;
import X.WAK;
import X.WFA;
import X.WPF;
import X.WPJ;
import X.WRN;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AfS63S0200000_14 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        FilterBean filterBean;
        List filterInfoEvent = (List) obj;
        o.LJIIIZ(filterInfoEvent, "filterInfoEvent");
        WRN wrn = (WRN) afS63S0200000_14.l0;
        for (Object obj2 : filterInfoEvent) {
            C82268WQm c82268WQm = ((C74477TKv) obj2).LJLILLLLZI;
            if (c82268WQm.LJLILLLLZI == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS && (filterBean = wrn.LJLJI) != null && filterBean.getId() == c82268WQm.LJLIL) {
                if (obj2 != null) {
                    ((InterfaceC65784Pro) afS63S0200000_14.l1).invoke();
                    return;
                }
                return;
            }
        }
    }

    public static final void accept$1(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        ((W3Z) afS63S0200000_14.l1).LIZJ.LJLLL.LIZ((Effect) afS63S0200000_14.l0);
    }

    public static final void accept$2(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        ((W3Z) afS63S0200000_14.l1).LIZJ.LJLLL.LIZ((Effect) afS63S0200000_14.l0);
    }

    public static final void accept$3(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        FilterBean filterBean = (FilterBean) ((C35794E3a) obj).LIZ();
        FilterBean filterBean2 = ((WPF) afS63S0200000_14.l0).LJLL;
        if (filterBean2 == null) {
            if (filterBean == null) {
                return;
            }
        } else if (filterBean != null && filterBean2.getId() == filterBean.getId()) {
            return;
        }
        WPJ wpj = (WPJ) ((WPF) afS63S0200000_14.l0).LJLJL.getValue();
        wpj.LIZJ = filterBean;
        wpj.LJIIIZ.SX(true, filterBean, true, true);
        ((WPF) afS63S0200000_14.l0).LLJILJIL().SZ(filterBean, false, false, ((WPF) afS63S0200000_14.l0).mActivity);
        ((WPF) afS63S0200000_14.l0).LJLL = filterBean;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.Pro, X.Prl] */
    public static final void accept$4(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        boolean z;
        ?? r0;
        W1T w1t = (W1T) obj;
        if (((Boolean) w1t.LJLJJI).booleanValue() && (r0 = ((WPF) afS63S0200000_14.l0).LJLIL.LJI) != 0) {
            r0.invoke();
        }
        EditFilterViewModel LLJILJIL = ((WPF) afS63S0200000_14.l0).LLJILJIL();
        FilterBean filterBean = (FilterBean) w1t.LJLJI;
        int intValue = ((Number) w1t.LJLILLLLZI).intValue();
        if (w1t.LJLIL == C9B4.CHANGE_END) {
            z = true;
        } else {
            z = false;
        }
        LLJILJIL.aq(filterBean, intValue, false, z);
    }

    public static final void accept$5(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        String str;
        THY thy = (THY) obj;
        int i = TK2.LIZ[thy.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    ((WPF) afS63S0200000_14.l0).LLJILJIL().x8();
                    return;
                }
                ((WPF) afS63S0200000_14.l0).LLJILJIL().N6(false);
                return;
            }
            EditFilterViewModel LLJILJIL = ((WPF) afS63S0200000_14.l0).LLJILJIL();
            EffectCategoryResponse effectCategoryResponse = thy.LJLILLLLZI;
            if (effectCategoryResponse == null || (str = effectCategoryResponse.getName()) == null) {
                str = "";
            }
            LLJILJIL.pg(str);
            return;
        }
        ((WPF) afS63S0200000_14.l0).LLJJ();
    }

    public static final void accept$6(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        if (((C74477TKv) obj).LJLILLLLZI.LJLILLLLZI == EnumC82260WQe.FILTER_STATE_DOWNLOAD_FAILED) {
            C78596Usy.LJJJLIIL(((WPF) afS63S0200000_14.l0).requireApplicationContext(), true);
        }
    }

    public static final void accept$7(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        C78596Usy.LJJJLIIL(((WPF) afS63S0200000_14.l0).requireApplicationContext(), true);
    }

    public static final void accept$8(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        VWQ vwq;
        WFA wfa = (WFA) afS63S0200000_14.l0;
        InterfaceC45734HxC interfaceC45734HxC = (InterfaceC45734HxC) afS63S0200000_14.l1;
        wfa.getClass();
        Bitmap bitmap = (Bitmap) ((OSZ) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (wfa.LJLILLLLZI) {
                vwq = C1E5.LJFF();
            } else {
                WAK.LJLILLLLZI.getClass();
                vwq = (WAK) WAK.LJLIL.getValue();
            }
            interfaceC45734HxC.LIZ(C81392Vwy.LJIIL(new W5C(bitmap, (VWQ<Bitmap>) vwq, W8A.LIZLLL, 0)));
        }
    }

    public static final void accept$9(AfS63S0200000_14 afS63S0200000_14, Object obj) {
        if (obj == EnumC74492TLk.PRE_HIDE) {
            ((RecyclerView) afS63S0200000_14.l1).setItemAnimator(null);
        } else {
            if (obj != EnumC74492TLk.SHOWN) {
                return;
            }
            ((RecyclerView) afS63S0200000_14.l1).setItemAnimator(((C82247WPr) afS63S0200000_14.l0).LJIILL.LJFF.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS63S0200000_14(Object obj, WRN wrn, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = wrn;
    }
}

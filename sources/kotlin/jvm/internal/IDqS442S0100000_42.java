package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C93747aVr;
import X.C93815aWx;
import X.C94062aaw;
import X.C94229add;
import X.C94231adf;
import X.C94233adh;
import X.C94236adk;
import X.C94266aeE;
import X.C94526aiQ;
import X.C94624ak0;
import X.EnumC93441aQv;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;

/* loaded from: classes34.dex */
public class IDqS442S0100000_42 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS442S0100000_42(C94526aiQ c94526aiQ, int i) {
        super(3);
        this.$t = i;
        this.l0 = c94526aiQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS442S0100000_42(BehaviourPreviewFragment behaviourPreviewFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = behaviourPreviewFragment;
    }

    public static final Object invoke$0(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C94229add vh = (C94229add) obj3;
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        o.LJIIIZ(vh, "vh");
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(-1, -1, vh.LJLIL, EnumC93441aQv.VIEW_TYPE_NEW_ACTION);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C94231adf vh = (C94231adf) obj3;
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        o.LJIIIZ(vh, "vh");
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(-1, -1, vh.LJLIL, EnumC93441aQv.VIEW_TYPE_MORE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object data, Object obj2) {
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu;
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super C94062aaw, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu2;
        ((Number) obj).intValue();
        C94233adh vh = (C94233adh) obj2;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(vh, "vh");
        int LJLJJLL = ((C94526aiQ) iDqS442S0100000_42.l0).LJLJJLL(data);
        int LJLJJLL2 = ((C94526aiQ) iDqS442S0100000_42.l0).LJLJJLL(data) + 1;
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu3 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu3 != null) {
            interfaceC88474Ynu3.invoke(Integer.valueOf(LJLJJLL), Integer.valueOf(LJLJJLL2 * 4), vh.LJLIL.getObjectContainer(), EnumC93441aQv.VIEW_TYPE_OBJECT);
        }
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu4 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu4 != null) {
            interfaceC88474Ynu4.invoke(Integer.valueOf(LJLJJLL), Integer.valueOf((LJLJJLL2 * 4) + 1), vh.LJLIL.getActionContainer(), EnumC93441aQv.VIEW_TYPE_ACTION);
        }
        C94062aaw extraSeekBar = vh.LJLIL.getExtraSeekBar();
        if (extraSeekBar != null && (interfaceC88474Ynu2 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLIIII) != null) {
            interfaceC88474Ynu2.invoke(Integer.valueOf(LJLJJLL), Integer.valueOf((LJLJJLL2 * 4) + 2), extraSeekBar, EnumC93441aQv.VIEW_TYPE_ACTION_EXTRA);
        }
        LinearLayout extraContainer = vh.LJLIL.getExtraContainer();
        if (extraContainer != null && (interfaceC88474Ynu = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI) != null) {
            interfaceC88474Ynu.invoke(Integer.valueOf(LJLJJLL), Integer.valueOf((LJLJJLL2 * 4) + 2), extraContainer, EnumC93441aQv.VIEW_TYPE_ACTION_EXTRA);
        }
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu5 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu5 != null) {
            interfaceC88474Ynu5.invoke(Integer.valueOf(LJLJJLL), Integer.valueOf((LJLJJLL2 * 4) + 3), vh.LJLIL.getDeleteIcon(), EnumC93441aQv.VIEW_TYPE_ACTION_DELETE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C94236adk vh = (C94236adk) obj3;
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        o.LJIIIZ(vh, "vh");
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(-1, 0, vh.LJLIL.getExtraContainer(), EnumC93441aQv.VIEW_TYPE_TRIGGER_EXTRA);
        }
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super C94624ak0, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu2 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLII;
        if (interfaceC88474Ynu2 != null) {
            interfaceC88474Ynu2.invoke(-1, 0, vh.LJLIL.getExtraStringEditText(), EnumC93441aQv.VIEW_TYPE_TRIGGER_EXTRA);
        }
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super View, ? super EnumC93441aQv, C76800UCe> interfaceC88474Ynu3 = ((C94526aiQ) iDqS442S0100000_42.l0).LLLI;
        if (interfaceC88474Ynu3 != null) {
            interfaceC88474Ynu3.invoke(-1, 1, vh.LJLIL.getElementContainer(), EnumC93441aQv.VIEW_TYPE_TRIGGER);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        o.LJIIIZ(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        C93747aVr.LIZIZ(view, ((BehaviourPreviewFragment) iDqS442S0100000_42.l0).LJLJJI, new IDqS419S0100000_42(iDqS442S0100000_42, 77));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS442S0100000_42 iDqS442S0100000_42, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C93815aWx data = (C93815aWx) obj2;
        C94266aeE viewHolder = (C94266aeE) obj3;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder, "viewHolder");
        ((BehaviourPreviewFragment) iDqS442S0100000_42.l0).Il(data, viewHolder.LJLIL, true);
        return C76800UCe.LIZ;
    }
}

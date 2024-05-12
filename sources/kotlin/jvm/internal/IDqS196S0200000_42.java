package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC94370afu;
import X.C76800UCe;
import X.C93729aVZ;
import X.C93747aVr;
import X.C94527aiR;
import X.EnumC93441aQv;
import X.InterfaceC88474Ynu;
import X.ViewOnFocusChangeListenerC93765aW9;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;

/* loaded from: classes34.dex */
public class IDqS196S0200000_42 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS196S0200000_42(BehaviourEditFragment behaviourEditFragment, AbstractC94370afu abstractC94370afu, int i) {
        super(4);
        this.$t = i;
        this.l0 = behaviourEditFragment;
        this.l1 = abstractC94370afu;
    }

    public static final Object invoke$0(IDqS196S0200000_42 iDqS196S0200000_42, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        EditText view = (EditText) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj4, "<anonymous parameter 3>");
        BehaviourEditFragment behaviourEditFragment = (BehaviourEditFragment) iDqS196S0200000_42.l0;
        AbstractC94370afu abstractC94370afu = (AbstractC94370afu) iDqS196S0200000_42.l1;
        behaviourEditFragment.getClass();
        view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC93765aW9(behaviourEditFragment, view, abstractC94370afu));
        C93729aVZ.LJ(view, new IDqS179S0200000_42(behaviourEditFragment, view, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS196S0200000_42 iDqS196S0200000_42, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Integer value;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        View view = (View) obj3;
        EnumC93441aQv elementType = (EnumC93441aQv) obj4;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(elementType, "elementType");
        if (((BehaviourEditFragment) iDqS196S0200000_42.l0).Ll().LJLJI.LIZ.getValue() != elementType || (value = ((BehaviourEditFragment) iDqS196S0200000_42.l0).Ll().LJLJJI.LIZ.getValue()) == null || value.intValue() != intValue) {
            if (((BehaviourEditFragment) iDqS196S0200000_42.l0).Ll().LJLJI.LIZ.getValue() == null) {
                Bundle arguments = ((BehaviourEditFragment) iDqS196S0200000_42.l0).getArguments();
                if (arguments != null) {
                    i = arguments.getInt("cke_behaviour_command_position_key");
                } else {
                    i = -1;
                }
                if (i == intValue2) {
                    ((BehaviourEditFragment) iDqS196S0200000_42.l0).Pl(view, elementType, intValue);
                    ((BehaviourEditFragment) iDqS196S0200000_42.l0).Ll().lv0(intValue, elementType, false);
                    C93729aVZ.LJ(view, new IDqS423S0100000_42(iDqS196S0200000_42, 12));
                }
            }
            view.setSelected(false);
        } else {
            ((BehaviourEditFragment) iDqS196S0200000_42.l0).Pl(view, elementType, intValue);
            Bundle arguments2 = ((BehaviourEditFragment) iDqS196S0200000_42.l0).getArguments();
            if (arguments2 != null) {
                arguments2.putInt("cke_behaviour_command_position_key", intValue2);
            }
            C93729aVZ.LJ(view, new IDqS423S0100000_42(iDqS196S0200000_42, 11));
        }
        if (elementType != EnumC93441aQv.VIEW_TYPE_ACTION_EXTRA) {
            C93747aVr.LIZIZ(view, ((BehaviourEditFragment) iDqS196S0200000_42.l0).LJLJJL, new C94527aiR(iDqS196S0200000_42, intValue2, intValue, elementType));
        }
        return C76800UCe.LIZ;
    }
}

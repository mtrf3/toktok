package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.AbstractC94512aiC;
import X.AbstractC94513aiD;
import X.C47261Igj;
import X.C61878OQg;
import X.C76800UCe;
import X.C93624aTs;
import X.C94069ab3;
import X.C94071ab5;
import X.C94259ae7;
import X.C94262aeA;
import X.C94383ag7;
import X.C94388agC;
import X.InterfaceC88472Yns;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.FeatureViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes34.dex */
public class IDqS15S0101000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS15S0101000_42 iDqS15S0101000_42, Object obj) {
        List<AbstractC94372afw> LJI;
        double doubleValue = ((Number) obj).doubleValue();
        EditViewModel Ll = ((BehaviourEditFragment) ((IDqS457S0100000_42) iDqS15S0101000_42.l0).l0).Ll();
        int i = iDqS15S0101000_42.i1;
        AbstractC94370afu value = Ll.LJLILLLLZI.LIZ.getValue();
        if (value != null && (LJI = value.LJI()) != null && i >= 0 && i < LJI.size()) {
            ((AbstractC94372afw) ListProtector.get(LJI, i)).LIZLLL().LJIIIIZZ(doubleValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS15S0101000_42 iDqS15S0101000_42, Object obj) {
        int i;
        int i2;
        if (((Boolean) obj).booleanValue()) {
            FeatureViewModel Hl = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Hl();
            AbstractC94512aiC ob = (AbstractC94512aiC) ListProtector.get(((C94069ab3) iDqS15S0101000_42.l0).LJLIL, iDqS15S0101000_42.i1);
            boolean Il = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Il();
            Hl.getClass();
            o.LJIIIZ(ob, "ob");
            if (Il) {
                AbstractC94513aiD abstractC94513aiD = Hl.LJLJJL;
                if (abstractC94513aiD != null) {
                    abstractC94513aiD.LJ(ob);
                }
                StateViewModel.hv0(Hl.LJLJI, C47261Igj.LJJIJIL(ob));
            } else {
                C93624aTs<List<AbstractC94512aiC>> c93624aTs = Hl.LJLJI;
                ArrayList arrayList = new ArrayList();
                List<AbstractC94512aiC> value = Hl.LJLJI.LIZ.getValue();
                if (value != null) {
                    arrayList.addAll(value);
                }
                arrayList.add(ob);
                StateViewModel.hv0(c93624aTs, arrayList);
                List<AbstractC94512aiC> value2 = Hl.LJLJI.LIZ.getValue();
                if (value2 != null) {
                    AbstractC94372afw abstractC94372afw = Hl.LJLJJI;
                    if (abstractC94372afw != null) {
                        abstractC94372afw.LJII(value2);
                    }
                    AbstractC94372afw abstractC94372afw2 = Hl.LJLJJI;
                    if (abstractC94372afw2 != null) {
                        abstractC94372afw2.LIZJ();
                    }
                }
            }
        } else {
            List<AbstractC94512aiC> value3 = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Hl().LJLJI.LIZ.getValue();
            if (value3 != null) {
                i = value3.indexOf(ListProtector.get(((C94069ab3) iDqS15S0101000_42.l0).LJLIL, iDqS15S0101000_42.i1));
            } else {
                i = -1;
            }
            FeatureViewModel Hl2 = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Hl();
            Object ob2 = ListProtector.get(((C94069ab3) iDqS15S0101000_42.l0).LJLIL, iDqS15S0101000_42.i1);
            boolean Il2 = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Il();
            Hl2.getClass();
            o.LJIIIZ(ob2, "ob");
            if (Il2) {
                AbstractC94513aiD abstractC94513aiD2 = Hl2.LJLJJL;
                if (abstractC94513aiD2 != null) {
                    abstractC94513aiD2.LJ(null);
                }
                StateViewModel.hv0(Hl2.LJLJI, C61878OQg.INSTANCE);
            } else {
                C93624aTs<List<AbstractC94512aiC>> c93624aTs2 = Hl2.LJLJI;
                ArrayList arrayList2 = new ArrayList();
                List<AbstractC94512aiC> value4 = Hl2.LJLJI.LIZ.getValue();
                if (value4 != null) {
                    arrayList2.addAll(value4);
                }
                arrayList2.remove(ob2);
                StateViewModel.hv0(c93624aTs2, arrayList2);
                List<AbstractC94512aiC> value5 = Hl2.LJLJI.LIZ.getValue();
                if (value5 != null) {
                    AbstractC94372afw abstractC94372afw3 = Hl2.LJLJJI;
                    if (abstractC94372afw3 != null) {
                        abstractC94372afw3.LJII(value5);
                    }
                    AbstractC94372afw abstractC94372afw4 = Hl2.LJLJJI;
                    if (abstractC94372afw4 != null) {
                        abstractC94372afw4.LIZJ();
                    }
                }
            }
            if (i >= 0) {
                FeatureFragment featureFragment = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI;
                C94071ab5 c94071ab5 = featureFragment.LJLJJLL;
                List<AbstractC94512aiC> value6 = featureFragment.Hl().LJLJI.LIZ.getValue();
                if (value6 != null) {
                    i2 = value6.size();
                } else {
                    i2 = i;
                }
                c94071ab5.notifyItemRangeChanged(i, i2 - i);
            }
        }
        if (((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Il()) {
            EditViewModel Gl = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Gl();
            if (Gl != null) {
                Gl.jv0();
            }
        } else {
            EditViewModel Gl2 = ((C94069ab3) iDqS15S0101000_42.l0).LJLILLLLZI.Gl();
            if (Gl2 != null) {
                Gl2.kv0();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS15S0101000_42 iDqS15S0101000_42, Object obj) {
        ((AbstractC94372afw) ListProtector.get(((AbstractC94370afu) ((IDqS457S0100000_42) iDqS15S0101000_42.l0).l0).LJI(), iDqS15S0101000_42.i1)).LIZLLL().LJIIIIZZ(((Number) obj).doubleValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS15S0101000_42 iDqS15S0101000_42, Object it) {
        o.LJIIIZ(it, "it");
        C94259ae7 c94259ae7 = (C94259ae7) iDqS15S0101000_42.l0;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = c94259ae7.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(((C94383ag7) ListProtector.get(c94259ae7.LJLIL, iDqS15S0101000_42.i1)).LJLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS15S0101000_42 iDqS15S0101000_42, Object it) {
        o.LJIIIZ(it, "it");
        C94262aeA c94262aeA = (C94262aeA) iDqS15S0101000_42.l0;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = c94262aeA.LJLJJI.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(((C94383ag7) ListProtector.get(c94262aeA.LJLIL, iDqS15S0101000_42.i1)).LJLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS15S0101000_42 iDqS15S0101000_42, Object it) {
        o.LJIIIZ(it, "it");
        ((C94388agC) iDqS15S0101000_42.l0).LJLILLLLZI.invoke(Integer.valueOf(iDqS15S0101000_42.i1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S0101000_42(C94069ab3 c94069ab3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94069ab3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S0101000_42(C94259ae7 c94259ae7, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94259ae7;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S0101000_42(C94262aeA c94262aeA, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94262aeA;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S0101000_42(C94388agC c94388agC, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94388agC;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S0101000_42(IDqS457S0100000_42 iDqS457S0100000_42, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = iDqS457S0100000_42;
        this.i1 = i;
    }
}

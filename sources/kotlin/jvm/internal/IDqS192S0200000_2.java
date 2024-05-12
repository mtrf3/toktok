package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C121914qR;
import X.C123764tQ;
import X.C130635At;
import X.C150145us;
import X.C166636gN;
import X.C167536hp;
import X.C5BF;
import X.C76800UCe;
import X.InterfaceC88474Ynu;
import X.OUP;
import android.graphics.Canvas;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class IDqS192S0200000_2 extends AbstractC65781Prl implements InterfaceC88474Ynu {
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
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS192S0200000_2(C121914qR c121914qR, C123764tQ c123764tQ, int i) {
        super(4);
        this.$t = i;
        this.l0 = c121914qR;
        this.l1 = c123764tQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS192S0200000_2(C130635At c130635At, Canvas canvas, int i) {
        super(4);
        this.$t = i;
        this.l0 = c130635At;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS192S0200000_2(C5BF c5bf, Canvas canvas, int i) {
        super(4);
        this.$t = i;
        this.l0 = c5bf;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS192S0200000_2(C167536hp c167536hp, C150145us c150145us, int i) {
        super(4);
        this.$t = i;
        this.l0 = c167536hp;
        this.l1 = c150145us;
    }

    public static final Object invoke$0(IDqS192S0200000_2 iDqS192S0200000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        long longValue3 = ((Number) obj3).longValue();
        long longValue4 = ((Number) obj4).longValue();
        C121914qR c121914qR = (C121914qR) iDqS192S0200000_2.l0;
        c121914qR.LJ = longValue;
        c121914qR.LJFF = longValue2;
        c121914qR.LIZJ = longValue3;
        c121914qR.LIZLLL = longValue4;
        C123764tQ c123764tQ = (C123764tQ) iDqS192S0200000_2.l1;
        int i = (int) longValue;
        c123764tQ.LJLILLLLZI = i;
        c123764tQ.LJLJI = (int) longValue4;
        c123764tQ.LJLJJI = i;
        c123764tQ.LJLJJL = (int) longValue2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS192S0200000_2 iDqS192S0200000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        List<Effect> list = (List) obj;
        if (!((Boolean) obj2).booleanValue()) {
            ((C167536hp) iDqS192S0200000_2.l0).LJLJJI = true;
        }
        if (list != null) {
            C167536hp c167536hp = (C167536hp) iDqS192S0200000_2.l0;
            C150145us c150145us = (C150145us) iDqS192S0200000_2.l1;
            ArrayList arrayList = new ArrayList();
            for (Effect effect : list) {
                c167536hp.getClass();
                if (!CommerceToolsMusicService.LIZIZ(false).U40() || !OUP.LJJI(effect)) {
                    if (!OUP.LJJIIZ(effect) || C166636gN.LIZIZ()) {
                        if (c150145us == null || !c150145us.LIZLLL || !OUP.LJJIIZ(effect)) {
                            arrayList.add(effect);
                        }
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final Object invoke$2(IDqS192S0200000_2 iDqS192S0200000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        float floatValue4 = ((Number) obj4).floatValue();
        ((C130635At) iDqS192S0200000_2.l0).LIZJ.reset();
        ((C130635At) iDqS192S0200000_2.l0).LIZJ.moveTo(floatValue, floatValue2);
        ((C130635At) iDqS192S0200000_2.l0).LIZJ.lineTo(floatValue3 + floatValue, floatValue2);
        ((C130635At) iDqS192S0200000_2.l0).LIZJ.quadTo(floatValue, floatValue2, floatValue, floatValue4 + floatValue2);
        ((C130635At) iDqS192S0200000_2.l0).LIZJ.close();
        Canvas canvas = (Canvas) iDqS192S0200000_2.l1;
        C130635At c130635At = (C130635At) iDqS192S0200000_2.l0;
        canvas.drawPath(c130635At.LIZJ, c130635At.LJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS192S0200000_2 iDqS192S0200000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        float floatValue4 = ((Number) obj4).floatValue();
        ((C5BF) iDqS192S0200000_2.l0).LIZJ.reset();
        ((C5BF) iDqS192S0200000_2.l0).LIZJ.moveTo(floatValue, floatValue2);
        ((C5BF) iDqS192S0200000_2.l0).LIZJ.lineTo(floatValue3 + floatValue, floatValue2);
        ((C5BF) iDqS192S0200000_2.l0).LIZJ.quadTo(floatValue, floatValue2, floatValue, floatValue4 + floatValue2);
        ((C5BF) iDqS192S0200000_2.l0).LIZJ.close();
        Canvas canvas = (Canvas) iDqS192S0200000_2.l1;
        C5BF c5bf = (C5BF) iDqS192S0200000_2.l0;
        canvas.drawPath(c5bf.LIZJ, c5bf.LIZIZ);
        return C76800UCe.LIZ;
    }
}

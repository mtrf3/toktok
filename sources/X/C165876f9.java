package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165876f9 extends AbstractC166316fr<C165906fC> {
    public C165906fC LIZIZ;

    @Override // X.InterfaceC166366fw
    public final void LIZ() {
        LIZJ(new AbstractC166306fq<C165906fC>() { // from class: X.6fD
            @Override // X.AbstractC166306fq
            public final int LIZIZ() {
                return 10;
            }

            @Override // X.AbstractC166306fq
            public final Object LIZLLL(C166286fo c166286fo, C166336ft c166336ft) {
                C165906fC c165906fC = (C165906fC) c166286fo;
                List<C166116fX> list = c165906fC.LIZJ;
                c165906fC.LIZLLL = list;
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C166116fX c166116fX : list) {
                        if (hashMap.get(c166116fX.LIZJ.getEffectId()) == null) {
                            String effectId = c166116fX.LIZJ.getEffectId();
                            C166026fO c166026fO = new C166026fO();
                            c166026fO.LIZIZ = c166116fX.LIZJ;
                            C169416kr LIZ = C166696gT.LIZ();
                            Effect effect = c166026fO.LIZIZ;
                            LIZ.getClass();
                            boolean LIZ2 = C169416kr.LIZ(effect);
                            c166026fO.LIZ = LIZ2;
                            if (!LIZ2) {
                                arrayList2.add(c166116fX.LIZJ);
                            }
                            hashMap.put(effectId, c166026fO);
                            arrayList.add(c166116fX.LIZJ);
                        }
                    }
                    c165906fC.LJ = arrayList2;
                    return Boolean.TRUE;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        LIZJ(new AbstractC166306fq<C165906fC>() { // from class: X.6fB
            @Override // X.AbstractC166306fq
            public final int LIZIZ() {
                return 20;
            }

            @Override // X.AbstractC166306fq
            public final Object LIZLLL(C166286fo c166286fo, C166336ft c166336ft) {
                return C48841JEv.LJI(new C165926fE((C165906fC) c166286fo, null), c166336ft);
            }
        });
    }

    public final C166286fo LIZLLL() {
        C165906fC c165906fC = this.LIZIZ;
        if (c165906fC != null) {
            return c165906fC;
        }
        o.LJIJI("dataContext");
        throw null;
    }
}

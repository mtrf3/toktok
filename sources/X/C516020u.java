package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.20u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C516020u extends AbstractC65781Prl implements InterfaceC88472Yns<C13000fA<? extends InterfaceC13030fD>, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ HashMap<Object, Integer> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516020u(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = hashMap;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C13000fA<? extends InterfaceC13030fD> c13000fA) {
        C13000fA<? extends InterfaceC13030fD> it = c13000fA;
        o.LJIIIZ(it, "it");
        if (((InterfaceC13030fD) it.LIZJ).getKey() != null) {
            InterfaceC88472Yns<Integer, Object> key = ((InterfaceC13030fD) it.LIZJ).getKey();
            if (key != null) {
                int max = Math.max(this.LJLIL, it.LIZ);
                int min = Math.min(this.LJLILLLLZI, (it.LIZ + it.LIZIZ) - 1);
                if (max <= min) {
                    while (true) {
                        this.LJLJI.put(key.invoke(Integer.valueOf(max - it.LIZ)), Integer.valueOf(max));
                        if (max == min) {
                            break;
                        }
                        max++;
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }
}

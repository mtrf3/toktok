package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1D extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ H16 LJLIL;
    public final /* synthetic */ H15 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1D(H16 h16, H15 h15, String str, int i) {
        super(1);
        this.LJLIL = h16;
        this.LJLILLLLZI = h15;
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LIZJ.LJ) {
            if (this.LJLILLLLZI.LIZLLL.size() >= 10) {
                LinkedHashMap<String, String> linkedHashMap = this.LJLILLLLZI.LIZLLL;
                java.util.Set<String> keySet = linkedHashMap.keySet();
                o.LJIIIIZZ(keySet, "cacheFramePool.keys");
                linkedHashMap.remove(ORZ.LJLLILLLL(keySet));
            }
            LinkedHashMap<String, String> linkedHashMap2 = this.LJLILLLLZI.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append(this.LJLJJI);
            linkedHashMap2.put(String.valueOf(X1D.LIZIZ(LIZ).hashCode()), it);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Pfb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65027Pfb {
    public final C65030Pfe LIZ;
    public InterfaceC48134Iuo LIZIZ;
    public C64626PXy LIZJ;
    public final List<AbstractC65015PfP> LIZLLL;
    public final List<AbstractC65025PfZ> LJ;

    public C65027Pfb() {
        C65030Pfe c65030Pfe = C65030Pfe.LIZ;
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LIZ = c65030Pfe;
    }

    public final C65018PfS LIZJ() {
        if (this.LIZJ != null) {
            InterfaceC48134Iuo interfaceC48134Iuo = this.LIZIZ;
            if (interfaceC48134Iuo == null) {
                interfaceC48134Iuo = new C64600PWy();
            }
            Executor LIZIZ = this.LIZ.LIZIZ();
            ArrayList arrayList = new ArrayList(this.LJ);
            arrayList.addAll(this.LIZ.LIZ(LIZIZ));
            ArrayList arrayList2 = new ArrayList(this.LIZ.LIZLLL() + ((ArrayList) this.LIZLLL).size() + 1);
            arrayList2.add(new C64957PeT());
            arrayList2.addAll(this.LIZLLL);
            arrayList2.addAll(this.LIZ.LIZJ());
            return new C65018PfS(interfaceC48134Iuo, this.LIZJ, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), LIZIZ);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public final void LIZ(AbstractC65015PfP abstractC65015PfP) {
        ((ArrayList) this.LIZLLL).add(abstractC65015PfP);
    }

    public final void LIZIZ(String str) {
        C65138PhO.LIZ(str, "baseUrl == null");
        C64626PXy LJIIIZ = C64626PXy.LJIIIZ(str);
        if ("".equals(ListProtector.get(LJIIIZ.LJFF, r1.size() - 1))) {
            this.LIZJ = LJIIIZ;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("baseUrl must end in /: ");
        LIZ.append(LJIIIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}

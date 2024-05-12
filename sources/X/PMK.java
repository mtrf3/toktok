package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class PMK implements WB6 {
    public final CopyOnWriteArraySet<PML> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.WB6
    public final void LIZ(PML pml) {
        if (pml != null) {
            this.LIZ.add(pml);
        }
    }

    public final void LIZIZ(EnumC81745W6j enumC81745W6j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trimType=");
        LIZ.append(enumC81745W6j);
        LIZ.append(", memoryTrimmableSet.size=");
        LIZ.append(this.LIZ.size());
        C79083V1z.LIZ(0, "FrescoMemoryTrimmableRegistry", "trimMemory", X1D.LIZIZ(LIZ));
        try {
            Iterator<PML> it = this.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(enumC81745W6j);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

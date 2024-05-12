package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class SI3 implements C79O {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ PowerAdapter LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.C79O
    public final void LIZ(List<? extends InterfaceC57784Mm4> list) {
        if (!this.LIZ) {
            ((LinkedHashMap) this.LIZIZ.LLF).clear();
            Iterator it = ((ArrayList) this.LIZIZ.LLIIJI()).iterator();
            int i = 0;
            while (it.hasNext()) {
                PowerStub powerStub = (PowerStub) it.next();
                int size = ((ArrayList) powerStub.LJZ).size() + i;
                this.LIZIZ.LLF.put(new C71855SHz(i, size), powerStub);
                i = size;
            }
            PowerAdapter powerAdapter = this.LIZIZ;
            powerAdapter.LJZ.LIZJ(this.LIZJ, powerAdapter.LLFFF, powerAdapter.LLFF, list);
        }
    }

    public SI3(boolean z, PowerAdapter powerAdapter, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = powerAdapter;
        this.LIZJ = z2;
    }
}

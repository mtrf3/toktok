package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class SI2 implements C79O {
    public final /* synthetic */ PowerAdapter LIZ;

    public SI2(PowerAdapter powerAdapter) {
        this.LIZ = powerAdapter;
    }

    @Override // X.C79O
    public final void LIZ(List<? extends InterfaceC57784Mm4> list) {
        ((LinkedHashMap) this.LIZ.LLF).clear();
        Iterator it = ((ArrayList) this.LIZ.LLIIJI()).iterator();
        int i = 0;
        while (it.hasNext()) {
            PowerStub powerStub = (PowerStub) it.next();
            int size = ((ArrayList) powerStub.LJZ).size() + i;
            this.LIZ.LLF.put(new C71855SHz(i, size), powerStub);
            i = size;
        }
        this.LIZ.notifyDataSetChanged();
    }
}

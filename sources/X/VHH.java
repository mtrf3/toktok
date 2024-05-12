package X;

import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VHH implements InterfaceC46992IcO {
    public final VH1 LIZ = new VH1();
    public final VHJ LIZIZ = new VHJ();

    @Override // X.InterfaceC46992IcO
    public final <T> List<T> LIZ(final VHN vhn, final Type type) {
        return (List) C79415VEt.LIZ("match total time cost", new InterfaceC79416VEu() { // from class: X.VHI
            @Override // X.InterfaceC79416VEu
            public final Object execute() {
                VHH vhh = VHH.this;
                VHN vhn2 = vhn;
                Type type2 = type;
                synchronized (vhh) {
                    vhh.LIZ.LIZJ(vhn2);
                    VHJ vhj = vhh.LIZIZ;
                    vhj.LIZ = vhn2;
                    if (vhj.LIZJ == null) {
                        vhj.LIZ();
                    }
                    ArrayList arrayList = (ArrayList) vhh.LIZ.LIZIZ(vhj.LIZJ);
                    if (arrayList.size() == 0) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C36901Ee1.LIZ(((ConditionConfig) it.next()).configContent, type2));
                    }
                    return arrayList2;
                }
            }
        });
    }
}

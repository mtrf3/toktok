package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UbP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77507UbP implements InterfaceC77510UbS {
    public final HashMap<String, List<InterfaceC77512UbU>> LIZ = new HashMap<>();

    @Override // X.InterfaceC77510UbS
    public final void LIZIZ(String str, List<? extends InterfaceC77512UbU> list) {
        this.LIZ.put(str, list);
    }

    @Override // X.InterfaceC77510UbS
    public final InterfaceC77501UbJ LIZ(Context context, String str, InterfaceC77503UbL interfaceC77503UbL) {
        C77505UbN.LIZ.getClass();
        if (!C77505UbN.LIZIZ) {
            synchronized (C65352Pkq.LIZ(C77505UbN.class)) {
                if (!C77505UbN.LIZIZ) {
                    C77505UbN.LIZ(this);
                    C77505UbN.LIZIZ = true;
                }
            }
        }
        List<InterfaceC77512UbU> list = this.LIZ.get(str);
        if (list != null) {
            Iterator<InterfaceC77512UbU> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC77501UbJ LIZ = it.next().LIZ(context, interfaceC77503UbL);
                if (LIZ.LIZ()) {
                    return LIZ;
                }
            }
        }
        return UIG.LIZ();
    }
}

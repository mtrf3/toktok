package X;

import android.os.RemoteException;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public final class X3V extends AbstractBinderC84191X2l {
    public final /* synthetic */ X3W LJLILLLLZI;

    public X3V(X3W x3w) {
        this.LJLILLLLZI = x3w;
    }

    @Override // X.InterfaceC84190X2k
    public final void LLFF(java.util.Map map, java.util.Map map2, java.util.Map map3) {
        SparseArray sparseArray = this.LJLILLLLZI.LJLIL;
        if (map != null && sparseArray != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
                }
            }
        }
        HashMap hashMap = this.LJLILLLLZI.LJLILLLLZI;
        if (map2 != null && hashMap != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                if (entry2.getKey() != null) {
                    hashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        List list = this.LJLILLLLZI.LJLJI;
        if (map3 != null && list != null) {
            for (Map.Entry entry3 : map3.entrySet()) {
                if (entry3.getKey() != null) {
                    list.add(entry3.getValue());
                }
            }
        }
        ((C84225X3t) this.LJLILLLLZI.LJLJJI).LIZ();
        ServiceConnectionC84229X3x serviceConnectionC84229X3x = this.LJLILLLLZI.LJLJJL;
        synchronized (serviceConnectionC84229X3x) {
            InterfaceC84230X3y interfaceC84230X3y = serviceConnectionC84229X3x.LJLIL;
            if (interfaceC84230X3y != null) {
                try {
                    interfaceC84230X3y.q0(null);
                } catch (RemoteException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else {
                serviceConnectionC84229X3x.LJLJI = null;
            }
        }
    }
}

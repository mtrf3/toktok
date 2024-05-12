package com.ss.android.ugc.aweme.anchor.service;

import X.C58096Mr6;
import X.C65777Prh;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.OSZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class AnchorOperationServiceImpl implements AnchorLock$IAnchorOperationService {
    public static final List<OSZ<Integer, InterfaceC65784Pro<C76800UCe>>> LIZ = new ArrayList();

    public static AnchorLock$IAnchorOperationService LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(AnchorLock$IAnchorOperationService.class, false);
        if (LIZ2 != null) {
            return (AnchorLock$IAnchorOperationService) LIZ2;
        }
        if (C58096Mr6.LLII == null) {
            synchronized (AnchorLock$IAnchorOperationService.class) {
                if (C58096Mr6.LLII == null) {
                    C58096Mr6.LLII = new AnchorOperationServiceImpl();
                }
            }
        }
        return C58096Mr6.LLII;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService
    public final void LIZ(List<Integer> list) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            if (list.contains(osz.getFirst())) {
                ((InterfaceC65784Pro) osz.getSecond()).invoke();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService
    public final void LIZIZ(int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Object obj;
        Iterator it = ((ArrayList) LIZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((Number) ((OSZ) it.next()).getFirst()).intValue() == i) {
                ArrayList arrayList = (ArrayList) LIZ;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((Number) ((OSZ) obj).getFirst()).intValue() == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C65777Prh.LIZ(arrayList).remove(obj);
            }
        }
        ((ArrayList) LIZ).add(new OSZ(Integer.valueOf(i), interfaceC65784Pro));
    }
}

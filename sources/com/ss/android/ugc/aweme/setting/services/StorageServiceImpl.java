package com.ss.android.ugc.aweme.setting.services;

import X.C23880wi;
import X.C38404F5k;
import X.C58096Mr6;
import X.InterfaceC37286EkE;
import X.InterfaceC38412F5s;
import X.P8H;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StorageServiceImpl implements IStorageService {
    public static IStorageService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IStorageService.class, false);
        if (LIZ != null) {
            return (IStorageService) LIZ;
        }
        if (C58096Mr6.B6 == null) {
            synchronized (IStorageService.class) {
                if (C58096Mr6.B6 == null) {
                    C58096Mr6.B6 = new StorageServiceImpl();
                }
            }
        }
        return C58096Mr6.B6;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final long LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("CACHE");
        arrayList.add("RESOURCE");
        arrayList.add("DRAFT");
        if (C23880wi.LIZ) {
            arrayList.add("GECKO");
        }
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        ArrayList LIZIZ = s1.LIZIZ(LJIIJ, "getStorageList()");
        for (InterfaceC37286EkE interfaceC37286EkE : LJIIJ) {
            if (arrayList.contains(interfaceC37286EkE.LJ())) {
                LIZIZ.add(interfaceC37286EkE);
            }
        }
        Iterator it = LIZIZ.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((InterfaceC37286EkE) it.next()).LIZIZ();
        }
        if (j < 31457280) {
            return 0L;
        }
        return j;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final void LIZIZ(InterfaceC38412F5s listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) DiskManagerPage.LJLL).remove(listener);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final void LIZJ(C38404F5k c38404F5k) {
        ((ArrayList) DiskManagerPage.LJLL).add(c38404F5k);
    }
}

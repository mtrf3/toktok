package com.ss.android.ugc.aweme.placediscovery2.map.premisson;

import X.C32I;
import X.C76800UCe;
import X.EF7;
import X.InterfaceC65784Pro;
import X.OHI;
import X.ORZ;
import X.OSZ;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PermissionChangeObserver implements LifecycleEventObserver {
    public final List<String> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public List<Boolean> LJLJI;
    public List<Boolean> LJLJJI;

    public PermissionChangeObserver(List permissionList, AqS159S0100000_9 aqS159S0100000_9) {
        o.LJIIIZ(permissionList, "permissionList");
        this.LJLIL = permissionList;
        this.LJLILLLLZI = aqS159S0100000_9;
        ArrayList arrayList = new ArrayList(C32I.LJJL(permissionList, 10));
        Iterator it = permissionList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            OHI ohi = OHI.LIZ;
            Context LIZIZ = EF7.LIZIZ();
            ohi.getClass();
            arrayList.add(Boolean.valueOf(OHI.LJ(LIZIZ, str)));
        }
        this.LJLJI = arrayList;
        this.LJLJJI = arrayList;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            List<String> list = this.LJLIL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (String str : list) {
                OHI ohi = OHI.LIZ;
                Context LIZIZ = EF7.LIZIZ();
                ohi.getClass();
                arrayList.add(Boolean.valueOf(OHI.LJ(LIZIZ, str)));
            }
            this.LJLJJI = arrayList;
            List<Boolean> list2 = this.LJLJI;
            if (list2 != null) {
                ArrayList arrayList2 = (ArrayList) ORZ.LLJJIII(arrayList, list2);
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        OSZ osz = (OSZ) it.next();
                        if (((Boolean) osz.getFirst()).booleanValue() != ((Boolean) osz.getSecond()).booleanValue()) {
                            this.LJLILLLLZI.invoke();
                            break;
                        }
                    }
                }
            } else {
                o.LJIJI("lastLocationPermissionsStatus");
                throw null;
            }
        }
        if (event == Lifecycle.Event.ON_STOP) {
            List<String> list3 = this.LJLIL;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list3, 10));
            for (String str2 : list3) {
                OHI ohi2 = OHI.LIZ;
                Context LIZIZ2 = EF7.LIZIZ();
                ohi2.getClass();
                arrayList3.add(Boolean.valueOf(OHI.LJ(LIZIZ2, str2)));
            }
            this.LJLJI = arrayList3;
        }
    }
}

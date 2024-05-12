package com.bytedance.provider.vm;

import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScopeViewModel extends ViewModel {
    public final CopyOnWriteArrayList<InterfaceC55235Lm3> LJLIL = new CopyOnWriteArrayList<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL.clear();
    }

    public final InterfaceC55235Lm3 gv0(String str) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        Iterator<InterfaceC55235Lm3> it = this.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC55235Lm3 = it.next();
                if (o.LJ(interfaceC55235Lm3.getKey(), str)) {
                    break;
                }
            } else {
                interfaceC55235Lm3 = null;
                break;
            }
        }
        return interfaceC55235Lm3;
    }

    public final InterfaceC55235Lm3 hv0(String str, InterfaceC88472Yns<? super String, ? extends InterfaceC55235Lm3> interfaceC88472Yns) {
        if (str == null) {
            str = "scope_default_key";
        }
        InterfaceC55235Lm3 gv0 = gv0(str);
        if (gv0 == null) {
            InterfaceC55235Lm3 invoke = interfaceC88472Yns.invoke(str);
            this.LJLIL.add(invoke);
            return invoke;
        }
        return gv0;
    }
}

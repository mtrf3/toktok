package com.ss.android.ugc.feed.platform.container.core;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C7EG;
import X.C8P8;
import X.C8P9;
import X.C8W0;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.assem.arch.core.AssemSupervisor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ContainerTree extends ViewModel {
    public static final /* synthetic */ int LJLJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C8P9.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C8P8.LJLIL);

    public final LinkedHashMap<BaseContainer<? extends VContainerProtocol, ? extends C3C8>, LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C3C8>>> hv0() {
        return (LinkedHashMap) this.LJLIL.getValue();
    }

    public final LinkedHashMap<BaseContainer<? extends VContainerProtocol, ? extends C3C8>, LinkedHashSet<VContainerProtocol>> iv0() {
        return (LinkedHashMap) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        hv0().clear();
        iv0().clear();
    }

    public final <VC extends BaseContainer<? extends VContainerProtocol, ? extends C3C8>> void gv0(VC vc) {
        ActivityC45651qj LIZ;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        View findViewById;
        o.LJIIIZ(vc, "<this>");
        if (vc.getContext() instanceof ActivityC45651qj) {
            Context context = vc.getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LIZ = (ActivityC45651qj) context;
        } else {
            LIZ = C212428Vi.LIZ(vc);
            if (LIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        AssemSupervisor lv0 = C7EG.LIZ(LIZ).lv0(vc);
        if (lv0 != null && (copyOnWriteArrayList = lv0.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC55235Lm3 interfaceC55235Lm3 = (C8W0) it.next();
                if (interfaceC55235Lm3 instanceof BaseContainer) {
                    if (!hv0().containsKey(vc)) {
                        hv0().put(vc, new LinkedList<>());
                    }
                    LinkedList linkedList = hv0().get(vc);
                    if (linkedList != null) {
                        linkedList.add(interfaceC55235Lm3);
                    }
                    BaseContainer baseContainer = (BaseContainer) interfaceC55235Lm3;
                    baseContainer.LLF = vc;
                    baseContainer.LLD = vc.rp0();
                    if (vc.LL != null) {
                        findViewById = vc.getContainerView().findViewById(baseContainer.LJLZ);
                        o.LJIIIIZZ(findViewById, "{\n                    co…youtId)\n                }");
                    } else {
                        View view = vc.getSupervisor().LJLLL;
                        if (view == null || (findViewById = view.findViewById(baseContainer.LJLZ)) == null) {
                            throw new IllegalStateException("supervisor.containerView==null");
                        }
                    }
                    baseContainer.LL = findViewById;
                    if (interfaceC55235Lm3 instanceof VContainerProtocol) {
                        vc.m4((VContainerProtocol) interfaceC55235Lm3);
                    }
                    baseContainer.e4();
                } else if (interfaceC55235Lm3 instanceof VContainerProtocol) {
                    if (!iv0().containsKey(vc)) {
                        hv0().put(vc, new LinkedList<>());
                    }
                    LinkedHashSet<VContainerProtocol> linkedHashSet = iv0().get(vc);
                    if (linkedHashSet != null) {
                        linkedHashSet.add(interfaceC55235Lm3);
                    }
                    vc.m4((VContainerProtocol) interfaceC55235Lm3);
                    vc.e4();
                }
            }
        }
    }
}

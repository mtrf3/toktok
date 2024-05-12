package com.bytedance.ies.foundation.base;

import X.C221108m2;
import X.C5H3;
import X.C61878OQg;
import X.C85970Xoc;
import X.C85971Xod;
import X.C85972Xoe;
import X.C85973Xof;
import X.G48;
import X.InterfaceC28616BKy;
import X.InterfaceC40403FtP;
import X.InterfaceC65784Pro;
import X.ORZ;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class BaseViewModel extends ViewModel {
    public volatile boolean initialized;
    public final C5H3 subscribeStore$delegate = C221108m2.LIZIZ(C85971Xod.LJLIL);
    public final C5H3 configuration$delegate = C221108m2.LIZIZ(C85970Xoc.LJLIL);

    public final C85973Xof getConfiguration() {
        return (C85973Xof) this.configuration$delegate.getValue();
    }

    public final C85972Xoe getSubscribeStore() {
        return (C85972Xoe) this.subscribeStore$delegate.getValue();
    }

    public void init() {
        if (!this.initialized) {
            List<G48> initProcessors = initProcessors();
            ((List) getConfiguration().LIZ.getValue()).addAll(initProcessors);
            for (G48 g48 : initProcessors) {
                C85973Xof configuration = getConfiguration();
                g48.getClass();
                o.LJIIIZ(configuration, "<set-?>");
                g48.LIZ = configuration;
            }
            this.initialized = true;
        }
    }

    public final List<G48> getProcessors() {
        return (List) getConfiguration().LIZ.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C85973Xof configuration = getConfiguration();
        configuration.LIZ().clear();
        ((List) configuration.LIZ.getValue()).clear();
    }

    public List<G48> initProcessors() {
        return C61878OQg.INSTANCE;
    }

    public final void config(InterfaceC65784Pro<? extends InterfaceC28616BKy> builder) {
        o.LJIIIZ(builder, "builder");
        C85973Xof configuration = getConfiguration();
        InterfaceC28616BKy next = builder.invoke();
        configuration.getClass();
        o.LJIIIZ(next, "next");
        if (next instanceof InterfaceC40403FtP) {
            configuration.LIZ().add(next);
            return;
        }
        List<InterfaceC28616BKy> LIZ = configuration.LIZ();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC28616BKy interfaceC28616BKy : LIZ) {
            if (o.LJ(interfaceC28616BKy.getClass(), next.getClass())) {
                arrayList.add(interfaceC28616BKy);
            }
        }
        if (!arrayList.isEmpty()) {
            configuration.LIZ().removeAll(ORZ.LLJI(arrayList));
        }
        configuration.LIZ().add(next);
    }
}

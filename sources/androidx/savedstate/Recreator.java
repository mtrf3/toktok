package androidx.savedstate;

import X.AnonymousClass104;
import X.C16880lQ;
import X.InterfaceC36571c5;
import X.X1D;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a1;
import defpackage.i0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class Recreator implements LifecycleEventObserver {
    public final InterfaceC36571c5 LJLIL;

    public Recreator(InterfaceC36571c5 owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLIL = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            Bundle LIZ = this.LJLIL.getSavedStateRegistry().LIZ("androidx.savedstate.Restarter");
            if (LIZ == null) {
                return;
            }
            ArrayList<String> stringArrayList = LIZ.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(AnonymousClass104.class);
                        o.LJIIIIZZ(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                o.LJIIIIZZ(newInstance, "{\n                constr…wInstance()\n            }");
                                ((AnonymousClass104) newInstance).onRecreated(this.LJLIL);
                            } catch (Exception e) {
                                throw new RuntimeException(i0.LJFF("Failed to instantiate ", next), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Class ");
                            LIZ2.append(C16880lQ.LJLLJ(asSubclass));
                            LIZ2.append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(X1D.LIZIZ(LIZ2), e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(a1.LJ("Class ", next, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LDn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53903LDn {
    public static void LIZ(InterfaceC53902LDm interfaceC53902LDm, LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIJ(source, "source");
        o.LJIIJ(event, "event");
        List<InterfaceC53905LDp> Nk = interfaceC53902LDm.Nk();
        if (Nk != null) {
            for (InterfaceC53905LDp interfaceC53905LDp : Nk) {
                switch (C116494hh.LIZ[event.ordinal()]) {
                    case 1:
                        interfaceC53905LDp.onCreate();
                        break;
                    case 2:
                        interfaceC53905LDp.onStart();
                        break;
                    case 3:
                        interfaceC53905LDp.onResume();
                        break;
                    case 4:
                        interfaceC53905LDp.onPause();
                        break;
                    case 5:
                        interfaceC53905LDp.onStop();
                        break;
                    case 6:
                        interfaceC53905LDp.onDestroy();
                        break;
                }
            }
        }
    }
}

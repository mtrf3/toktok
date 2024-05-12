package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06350Mt {
    public final HashMap<EnumC06330Mr, Long> LIZ;
    public long LIZIZ;
    public final AbstractC29891Fh<?> LIZJ;

    public C06350Mt(AbstractC29891Fh<?> component) {
        o.LJIIIZ(component, "component");
        this.LIZJ = component;
        this.LIZ = new HashMap<>();
    }

    public final void LIZ(AbstractC29891Fh<?> component, EnumC06330Mr lifecycle, long j) {
        if (this.LIZ.get(lifecycle) == null) {
            this.LIZ.put(lifecycle, Long.valueOf(j));
        }
        o.LJIIIZ(component, "component");
        o.LJIIIZ(lifecycle, "lifecycle");
        InterfaceC88473Ynt<? super AbstractC29891Fh<?>, ? super EnumC06330Mr, ? super Long, C76800UCe> interfaceC88473Ynt = C06340Ms.LIZ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(component, lifecycle, Long.valueOf(j));
        }
    }
}

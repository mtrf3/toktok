package X;

import java.util.concurrent.ConcurrentHashMap;
import k81.j;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wur, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83809Wur implements InterfaceC83810Wus {
    public final ConcurrentHashMap<Class<?>, InterfaceC83812Wuu<?>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, InterfaceC88472Yns<InterfaceC83796Wue, InterfaceC83812Wuu<?>>> LIZIZ = new ConcurrentHashMap<>();
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final InterfaceC65784Pro<InterfaceC83796Wue> LIZLLL;

    @Override // X.InterfaceC83810Wus
    public final <API extends InterfaceC83719WtP> API m0(Class<API> cls) {
        ConcurrentHashMap<Class<?>, InterfaceC83812Wuu<?>> concurrentHashMap = this.LIZ;
        InterfaceC83812Wuu<?> interfaceC83812Wuu = concurrentHashMap.get(cls);
        InterfaceC83812Wuu<?> interfaceC83812Wuu2 = null;
        if (interfaceC83812Wuu == null) {
            InterfaceC88472Yns<InterfaceC83796Wue, InterfaceC83812Wuu<?>> interfaceC88472Yns = this.LIZIZ.get(cls);
            if (interfaceC88472Yns == null || (interfaceC83812Wuu = interfaceC88472Yns.invoke(this.LIZLLL.invoke())) == null) {
                return null;
            }
            interfaceC83812Wuu.init();
            InterfaceC83812Wuu<?> putIfAbsent = concurrentHashMap.putIfAbsent(cls, interfaceC83812Wuu);
            if (putIfAbsent != null) {
                interfaceC83812Wuu = putIfAbsent;
            }
        }
        if (interfaceC83812Wuu instanceof InterfaceC83719WtP) {
            interfaceC83812Wuu2 = interfaceC83812Wuu;
        }
        return (API) interfaceC83812Wuu2;
    }

    public C83809Wur(AqS164S0100000_14 aqS164S0100000_14, AqS164S0100000_14 aqS164S0100000_142) {
        this.LIZJ = aqS164S0100000_14;
        this.LIZLLL = aqS164S0100000_142;
    }

    @Override // X.InterfaceC83810Wus
    public final <API extends InterfaceC83719WtP, IMPL extends j<API>> void LIZ(boolean z, Class<API> cls, InterfaceC88472Yns<? super InterfaceC83796Wue, ? extends IMPL> instanceProvider) {
        o.LJIIIZ(instanceProvider, "instanceProvider");
        if (this.LIZJ.invoke().booleanValue()) {
            if (z) {
                this.LIZIZ.put(cls, instanceProvider);
                return;
            }
            InterfaceC83812Wuu<?> invoke = instanceProvider.invoke(this.LIZLLL.invoke());
            this.LIZ.put(cls, invoke);
            invoke.init();
            return;
        }
        "CKCameraView is not init.".toString();
        throw new IllegalArgumentException("CKCameraView is not init.");
    }
}

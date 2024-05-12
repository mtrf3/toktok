package X;

import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.N0r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58665N0r implements HBV {
    public final java.util.Map LIZ;
    public final InterfaceC88472Yns LIZIZ;
    public volatile InterfaceC58666N0s LIZJ;

    public C58665N0r(InterfaceC88472Yns<? super Class<?>, Boolean> isTypeSupported) {
        o.LJIIIZ(isTypeSupported, "isTypeSupported");
        this.LIZIZ = isTypeSupported;
        this.LIZ = new LinkedHashMap();
    }

    @Override // X.HBV
    public final Class<?> get(String name) {
        o.LJIIIZ(name, "name");
        if (this.LIZJ != null) {
            synchronized (this) {
                if (this.LIZJ != null) {
                    InterfaceC58666N0s interfaceC58666N0s = this.LIZJ;
                    o.LJI(interfaceC58666N0s);
                    interfaceC58666N0s.LIZ(this);
                }
                this.LIZJ = null;
            }
        }
        Object obj = ((LinkedHashMap) this.LIZ).get(name);
        if (obj != null) {
            return (Class) obj;
        }
        String LJFF = i0.LJFF("unregistered key:", name);
        LJFF.toString();
        throw new IllegalArgumentException(LJFF);
    }

    @Override // X.HBV
    public final void LIZ(Class clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        if (((Boolean) this.LIZIZ.invoke(clazz)).booleanValue()) {
            this.LIZ.put(str, clazz);
        } else {
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
    }
}

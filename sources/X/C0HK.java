package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0HK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HK {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C0HK(C0HE c0he, List list) {
        this.LIZ = list;
        this.LIZIZ = c0he;
    }

    public /* synthetic */ C0HK(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        this.LIZ = publicScreenContext;
        this.LIZIZ = new HashMap();
    }

    public /* synthetic */ C0HK(String str, EnumC67133QWj enumC67133QWj) {
        this.LIZ = str;
        this.LIZIZ = enumC67133QWj;
    }

    public final void LIZ(Class cls, InterfaceC31329CRh interfaceC31329CRh) {
        ((java.util.Map) this.LIZIZ).put(cls, interfaceC31329CRh);
    }
}

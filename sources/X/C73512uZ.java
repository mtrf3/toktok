package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73512uZ extends AbstractC65781Prl implements InterfaceC88473Ynt<java.util.Map<?, ?>, String, String, java.util.Map<Object, Object>> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73512uZ(String str) {
        super(3);
        this.LJLIL = str;
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ java.util.Map<Object, Object> invoke(java.util.Map<?, ?> map, String str, String str2) {
        java.util.Map<?, ?> map2 = map;
        invoke(map2, str, str2);
        return map2;
    }

    public final java.util.Map<Object, Object> invoke(java.util.Map<?, ?> builder, String str, String str2) {
        o.LJIIJ(builder, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        java.util.Map<Object, Object> LIZJ = C65777Prh.LIZJ(builder);
        if (str2 != null) {
            LIZJ.put(this.LJLIL, str2);
        }
        return LIZJ;
    }
}

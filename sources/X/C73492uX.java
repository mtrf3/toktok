package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73492uX extends AbstractC65781Prl implements InterfaceC88473Ynt<java.util.Map<?, ?>, String, List<? extends String>, java.util.Map<Object, Object>> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73492uX(String str) {
        super(3);
        this.LJLIL = str;
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ java.util.Map<Object, Object> invoke(java.util.Map<?, ?> map, String str, List<? extends String> list) {
        java.util.Map<?, ?> map2 = map;
        invoke(map2, str, list);
        return map2;
    }

    public final java.util.Map<Object, Object> invoke(java.util.Map<?, ?> builder, String str, List<? extends String> list) {
        o.LJIIJ(builder, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        java.util.Map<Object, Object> LIZJ = C65777Prh.LIZJ(builder);
        String str2 = File.separator;
        o.LJFF(str2, "File.separator");
        LIZJ.put(this.LJLIL, ORZ.LLD(list, str2, null, null, null, 62));
        return LIZJ;
    }
}

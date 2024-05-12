package X;

import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.PkS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65328PkS extends TBS implements InterfaceC88472Yns<Type, String> {
    public static final C65328PkS LJLIL = new C65328PkS();

    public C65328PkS() {
        super(1, C65330PkU.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Type type) {
        Type p0 = type;
        o.LJIIIZ(p0, "p0");
        return C65330PkU.LJ(p0);
    }
}

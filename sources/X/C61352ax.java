package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61352ax extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61352ax LJLIL = new C61352ax();

    public C61352ax() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        o.LJIIIZ(param, "param");
        return Boolean.valueOf(o.LJ(param, EnumC61742ba.ENTRANCE_ISOLATE.getStrategy()));
    }
}

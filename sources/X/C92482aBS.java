package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aBS, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92482aBS extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC21450sn, Boolean> {
    public static final C92482aBS LJLIL = new C92482aBS();

    public C92482aBS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(EnumC21450sn value) {
        boolean z;
        o.LJIIIZ(value, "value");
        if (value != EnumC21450sn.Expanded) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

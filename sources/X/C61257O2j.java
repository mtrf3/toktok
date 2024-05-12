package X;

import kotlin.jvm.internal.o;

/* renamed from: X.O2j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61257O2j extends AbstractC65781Prl implements InterfaceC88472Yns<O26, Boolean> {
    public static final C61257O2j LJLIL = new C61257O2j();

    public C61257O2j() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(O26 o26) {
        boolean z;
        O26 it = o26;
        o.LJIIIZ(it, "it");
        if ((it instanceof O2Z) && o.LJ(((O2Z) it).LJIJJ, "template")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

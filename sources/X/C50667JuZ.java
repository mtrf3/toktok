package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JuZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50667JuZ extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50667JuZ LJLIL = new C50667JuZ();

    public C50667JuZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        boolean z;
        o.LJIIIZ(it, "it");
        if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

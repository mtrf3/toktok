package X;

import defpackage.e1;

/* renamed from: X.KgZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52347KgZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52347KgZ LJLIL = new C52347KgZ();

    public C52347KgZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "enable_fix_status_bar_error", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

package X;

import defpackage.e1;

/* renamed from: X.Kun, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53229Kun extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53229Kun LJLIL = new C53229Kun();

    public C53229Kun() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (e1.LIZ(31744, "profile_post_load_more_op", true, false) != C53230Kuo.LIZIZ) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

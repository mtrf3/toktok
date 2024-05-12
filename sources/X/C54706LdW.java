package X;

/* renamed from: X.LdW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54706LdW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C54706LdW LJLIL = new C54706LdW();

    public C54706LdW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        Integer num = (Integer) C78895Uxn.LIZ().LJIIIZ(0, "live_avatar_animation_optimize_v3");
        if (num != null && num.intValue() == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

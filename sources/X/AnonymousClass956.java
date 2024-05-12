package X;

/* renamed from: X.956, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass956 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AnonymousClass956 LJLIL = new AnonymousClass956();

    public AnonymousClass956() {
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

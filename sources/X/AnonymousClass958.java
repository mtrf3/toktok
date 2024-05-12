package X;

/* renamed from: X.958, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass958 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AnonymousClass958 LJLIL = new AnonymousClass958();

    public AnonymousClass958() {
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

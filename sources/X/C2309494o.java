package X;

/* renamed from: X.94o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2309494o extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2309494o LJLIL = new C2309494o();

    public C2309494o() {
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

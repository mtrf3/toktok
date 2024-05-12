package X;

import com.ss.android.ugc.aweme.profile.presenter.UserResponse;

/* renamed from: X.9Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237069Sc extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC214228aw<InterfaceC237099Sf>> {
    public static final C237069Sc LJLIL = new C237069Sc();

    public C237069Sc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC214228aw<InterfaceC237099Sf> invoke() {
        return new InterfaceC214228aw<InterfaceC237099Sf>() { // from class: X.9Sd
            public final C237269Sw LIZ = new InterfaceC237099Sf() { // from class: X.9Sw
                @Override // X.InterfaceC237099Sf
                public final UserResponse LJLLL(int i) {
                    boolean z;
                    C9T8.LIZ.getClass();
                    if (((Number) C9T8.LIZIZ.getValue()).intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C9TA.LIZ.getClass();
                        if (((Number) C9TA.LIZIZ.getValue()).intValue() != 1) {
                            C251839uV.LIZ().getClass();
                            return C251839uV.LIZIZ(i, null);
                        }
                    }
                    C252699vt c252699vt = new C252699vt(null);
                    C76H c76h = new C76H(0);
                    c76h.LIZLLL = "profile_api";
                    c76h.LIZIZ = 1000;
                    c76h.LIZ = 1;
                    c252699vt.LJIJ.put(C76H.class, c76h);
                    C251839uV.LIZ().getClass();
                    return C251839uV.LIZIZ(i, c252699vt);
                }
            };

            @Override // X.InterfaceC214228aw
            public final void release() {
            }

            @Override // X.InterfaceC214228aw
            public final /* bridge */ /* synthetic */ InterfaceC237099Sf getOperator() {
                return this.LIZ;
            }
        };
    }
}

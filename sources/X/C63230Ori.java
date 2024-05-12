package X;

import Y.ARunnableS29S0200000_10;

/* renamed from: X.Ori, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63230Ori extends AbstractC63515OwJ<Boolean> {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        return true;
    }

    public C63230Ori() {
        super(EnumC63625Oy5.MARK_STRANGER_CONVERSATION_READ.getValue(), null);
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ()) {
            LIZLLL(Boolean.TRUE);
            C63337OtR.LJII(c63622Oy2, true).LIZ();
        } else {
            LIZIZ(c63622Oy2);
            C63337OtR.LJII(c63622Oy2, false).LIZ();
        }
    }
}

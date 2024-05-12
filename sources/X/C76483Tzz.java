package X;

/* renamed from: X.Tzz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76483Tzz implements InterfaceC15710jX {
    public final /* synthetic */ C76732zl LJLIL;

    public C76483Tzz(C76732zl c76732zl) {
        this.LJLIL = c76732zl;
    }

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        C76271TwZ.LIZ.LJJJ(this.LJLIL.element, true);
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }
}

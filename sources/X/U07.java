package X;

/* loaded from: classes14.dex */
public final class U07 implements InterfaceC15710jX {
    public final /* synthetic */ C76471Tzn LJLIL;

    public U07(C76471Tzn c76471Tzn) {
        this.LJLIL = c76471Tzn;
    }

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
            this.LJLIL.LJJJ().setAlpha(1.0f);
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }
}

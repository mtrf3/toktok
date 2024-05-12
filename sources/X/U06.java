package X;

/* loaded from: classes14.dex */
public final class U06 implements InterfaceC15710jX {
    public final /* synthetic */ C76470Tzm LJLIL;

    public U06(C76470Tzm c76470Tzm) {
        this.LJLIL = c76470Tzm;
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

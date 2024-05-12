package X;

/* renamed from: X.LoB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55367LoB extends C1CZ {
    public final /* synthetic */ C55366LoA LJLIL;

    public C55367LoB(C55366LoA c55366LoA) {
        this.LJLIL = c55366LoA;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.LJLIL.setVisibility(0);
        } else {
            this.LJLIL.setVisibility(8);
        }
    }
}

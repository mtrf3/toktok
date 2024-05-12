package X;

/* loaded from: classes14.dex */
public final class U47 extends UF5 {
    public final /* synthetic */ U46 LIZ;

    public U47(U46 u46) {
        this.LIZ = u46;
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        this.LIZ.LLFII = true;
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", "preload gecko image success");
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        this.LIZ.LLFII = false;
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", "preload gecko image fail");
    }
}

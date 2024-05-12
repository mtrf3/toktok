package X;

/* renamed from: X.TVb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74743TVb implements F6T {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C74744TVc LIZJ;

    @Override // X.F6T
    public final void onSuccess() {
        TVU.LJIJI(true, 0, this.LIZ, System.currentTimeMillis() - this.LIZIZ, "voice_chat_widget", "", "");
    }

    @Override // X.F6T
    public final void onFailed() {
        this.LIZJ.getClass();
        String LIZ = C74744TVc.LIZ(164);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Link mic bundle load failed");
        LIZ2.append(this);
        C32014ChO.LIZJ(LIZ, X1D.LIZIZ(LIZ2), null);
    }

    public C74743TVb(boolean z, long j, C74744TVc c74744TVc) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = c74744TVc;
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPluginInstallError: reason = ");
        LIZ.append(i);
        TVY.LIZIZ(X1D.LIZIZ(LIZ));
        TVU.LJIJI(true, 1, this.LIZ, System.currentTimeMillis() - this.LIZIZ, "voice_chat_widget", String.valueOf(i), "");
    }
}

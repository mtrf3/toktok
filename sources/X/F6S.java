package X;

/* loaded from: classes7.dex */
public final class F6S implements InterfaceC37126Ehe {
    public final /* synthetic */ F6T LJLIL;

    public F6S(F6T f6t) {
        this.LJLIL = f6t;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        FP1.LJFF("onSuccess: ", str, "FindCrashLog#LiveAppBundleUtils#install");
        this.LJLIL.onSuccess();
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailed: ");
        LIZ.append(str);
        LIZ.append(" reason: ");
        LIZ.append(i);
        C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils#install", X1D.LIZIZ(LIZ));
        this.LJLIL.LIZ(i, str, z);
        this.LJLIL.onFailed();
    }
}

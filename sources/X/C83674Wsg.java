package X;

/* renamed from: X.Wsg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83674Wsg implements InterfaceC142275iB {
    public final /* synthetic */ InterfaceC83704WtA LIZ;

    public C83674Wsg(InterfaceC83704WtA interfaceC83704WtA) {
        this.LIZ = interfaceC83704WtA;
    }

    @Override // X.InterfaceC142275iB
    public final void LIZ(String str) {
        this.LIZ.onError(str);
        C82891Wg3.LIZIZ();
    }

    @Override // X.InterfaceC142275iB
    public final void onSuccess(String str) {
        this.LIZ.onSuccess(str);
        C82891Wg3.LIZIZ();
    }
}

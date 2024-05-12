package X;

/* renamed from: X.Gp7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42685Gp7 implements InterfaceC42386GkI {
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C42685Gp7(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC42386GkI
    public final void onAppStateChanged(int i) {
        if (i == 2) {
            this.LIZ.invoke(Boolean.FALSE, null);
        }
    }
}

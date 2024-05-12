package X;

/* renamed from: X.4N6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4N6 implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ InterfaceC86963bA LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ = false;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteConversationHandler delete, getConversation failed, error:");
        LIZ.append(c63623Oy3);
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        String str;
        boolean z;
        C63120Opw c63120Opw2 = c63120Opw;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteConversationHandler delete, getConversation result:");
        if (c63120Opw2 != null) {
            str = c63120Opw2.getConversationId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63120Opw2 != null && c63120Opw2.isStranger()) {
            z = true;
        } else {
            z = false;
        }
        new C63435Ov1(this.LIZ, z).LJIILIIL(this.LIZIZ, this.LIZJ);
    }

    public C4N6(InterfaceC86963bA interfaceC86963bA, String str) {
        this.LIZ = interfaceC86963bA;
        this.LIZIZ = str;
    }
}

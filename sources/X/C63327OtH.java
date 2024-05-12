package X;

import com.bytedance.im.core.model.DeleteConversationRequest;

/* renamed from: X.OtH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63327OtH implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ DeleteConversationRequest LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        new C63435Ov1().LJIILL(this.LIZ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        if (c63120Opw == null) {
            new C63435Ov1().LJIILL(this.LIZ);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaitDelCon trigger, cid:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" conversation ever created after deleted");
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    public C63327OtH(DeleteConversationRequest deleteConversationRequest, String str) {
        this.LIZ = deleteConversationRequest;
        this.LIZIZ = str;
    }
}

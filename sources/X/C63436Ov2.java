package X;

import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;

/* renamed from: X.Ov2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63436Ov2 implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C63435Ov1 LIZIZ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        RequestBody requestBody;
        C63435Ov1 c63435Ov1 = this.LIZIZ;
        if (c63435Ov1.LIZJ && (requestBody = c63435Ov1.LJII) != null) {
            int i = c63435Ov1.LJI;
            String str = this.LIZ;
            DeleteConversationRequestBody deleteConversationRequestBody = requestBody.delete_conversation_body;
            InterfaceC63330OtK interfaceC63330OtK = C63324OtE.LIZJ;
            if (interfaceC63330OtK != null) {
                interfaceC63330OtK.LIZ(i, str, deleteConversationRequestBody);
            }
        } else {
            c63435Ov1.LIZIZ(C63622Oy2.LIZJ(-9999));
        }
        String str2 = this.LIZ;
        C63435Ov1 c63435Ov12 = this.LIZIZ;
        C63272OsO.LJI(str2, c63435Ov12.LIZJ, c63435Ov12.LIZLLL, c63435Ov12.LJFF, c63435Ov12.LJ, false, c63623Oy3);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63435Ov1 c63435Ov1 = this.LIZIZ;
        c63435Ov1.LIZLLL = true;
        c63435Ov1.LJIIIIZZ = true;
        this.LIZIZ.LJIILIIL(this.LIZ, false);
    }

    public C63436Ov2(C63435Ov1 c63435Ov1, String str) {
        this.LIZIZ = c63435Ov1;
        this.LIZ = str;
    }
}

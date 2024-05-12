package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.RequestBody;

/* renamed from: X.OtA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63320OtA extends AbstractC63515OwJ<C109544Rq> {
    public boolean LIZJ;
    public C109544Rq LIZLLL;
    public boolean LJ;
    public long LJFF;
    public int LJI;
    public RequestBody LJII;

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63320OtA(X.InterfaceC86963bA r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto Le
            X.Oy5 r0 = X.EnumC63625Oy5.DELETE_STRANGER_MESSAGE
        L4:
            int r0 = r0.getValue()
            r1.<init>(r0, r2)
            r1.LIZJ = r3
            return
        Le:
            X.Oy5 r0 = X.EnumC63625Oy5.DELETE_MESSAGE
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63320OtA.<init>(X.3bA, boolean):void");
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        RequestBody requestBody;
        DeleteMessageRequestBody deleteMessageRequestBody;
        RequestBody requestBody2;
        DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody;
        if (c63622Oy2.LJIIJ()) {
            LIZLLL(this.LIZLLL);
            return;
        }
        if (this.LIZJ) {
            if (!this.LJ && (requestBody2 = this.LJII) != null && (deleteStrangerMessageRequestBody = requestBody2.delete_stranger_message_body) != null) {
                Long l = deleteStrangerMessageRequestBody.server_message_id;
                InterfaceC63328OtI interfaceC63328OtI = C63321OtB.LIZJ;
                if (interfaceC63328OtI != null) {
                    interfaceC63328OtI.LIZIZ(l, deleteStrangerMessageRequestBody);
                }
            }
        } else if (!this.LJ && (requestBody = this.LJII) != null && (deleteMessageRequestBody = requestBody.delete_message_body) != null) {
            Long l2 = deleteMessageRequestBody.message_id;
            InterfaceC63328OtI interfaceC63328OtI2 = C63321OtB.LIZJ;
            if (interfaceC63328OtI2 != null) {
                interfaceC63328OtI2.LIZ(l2, deleteMessageRequestBody);
            }
        }
        LIZIZ(c63622Oy2);
    }
}

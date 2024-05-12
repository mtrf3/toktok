package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.OyY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63654OyY extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final int LJI() {
        return 0;
    }

    public C63654OyY() {
        super(EnumC63625Oy5.SEND_INPUT_STATUS.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.send_input_status_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        if (LJIIIZ(c63622Oy2)) {
            EnumC69908Rc8 enumC69908Rc8 = c63622Oy2.LJLJL.body.send_input_status_body.status;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("send typing event success:");
            if (enumC69908Rc8 == EnumC69908Rc8.Success) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append("status: ");
            LIZ.append(enumC69908Rc8.toString());
            C63322OtC.LJI("SendTypingEventHandler", X1D.LIZIZ(LIZ), null);
            return;
        }
        C63322OtC.LJI("SendTypingEventHandler", "fail", null);
    }
}

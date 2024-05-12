package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* loaded from: classes6.dex */
public final class B7Z<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;

    public B7Z(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Collecting unread room result, extra: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", statusCode: ");
        LIZ.append(((BaseResponse) obj).statusCode);
        LIZ.append('.');
        C0NB.LIZIZ("DrawRoomListProvider", X1D.LIZIZ(LIZ));
    }
}

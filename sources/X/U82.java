package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* loaded from: classes14.dex */
public final class U82<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ U7F LJLIL;

    public U82(U7F u7f) {
        this.LJLIL = u7f;
    }

    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        UBW ubw = (UBW) obj;
        if (ubw != null) {
            Object obj3 = ubw.LIZ;
            if (obj3 instanceof C28467BFf) {
                if (obj3 != null) {
                    BaseResponse baseResponse = (BaseResponse) obj3;
                    if (baseResponse != null && baseResponse.statusCode == 0) {
                        U4R.LIZLLL("CoLinker", "multiCancel success");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.MultiCancelResponse>");
                }
            }
            if (obj2 != null) {
                String LJJIJ = U7F.LJJIJ(1225);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("multiCancel failed:");
                LIZ.append(obj2);
                C32014ChO.LIZJ(LJJIJ, X1D.LIZIZ(LIZ), null);
            }
        }
    }
}

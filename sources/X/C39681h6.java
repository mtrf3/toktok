package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* renamed from: X.1h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39681h6 extends C278017g {
    public final BaseResponse LJLILLLLZI;

    public C39681h6() {
        super(-2);
    }

    @Override // X.C278017g, X.C276516r, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" TYPE = ResponseNoDataException ");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public BaseResponse getResponse() {
        return this.LJLILLLLZI;
    }

    public C39681h6(BaseResponse baseResponse) {
        super(-2);
        this.LJLILLLLZI = baseResponse;
    }
}

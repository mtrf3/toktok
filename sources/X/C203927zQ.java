package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.7zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203927zQ extends AbstractC65781Prl implements InterfaceC88472Yns<C57355Mf9<C203917zP>, C57355Mf9<C203917zP>> {
    public static final C203927zQ LJLIL = new C203927zQ();

    public C203927zQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C57355Mf9<C203917zP> invoke(C57355Mf9<C203917zP> c57355Mf9) {
        C57355Mf9<C203917zP> data = c57355Mf9;
        o.LJIIIZ(data, "data");
        if (C3C5.m13isSuccessimpl(data.LIZ)) {
            Object obj = data.LIZ;
            BaseResponse baseResponse = null;
            if (C3C5.m12isFailureimpl(obj)) {
                obj = null;
            }
            C203917zP c203917zP = (C203917zP) obj;
            if (c203917zP != null) {
                baseResponse = c203917zP.LIZ;
            }
            M8L.LIZJ("/aweme/v1/aweme/collect/", "net", baseResponse);
        } else {
            M8L.LIZIZ("/aweme/v1/aweme/collect/", C3C5.m10exceptionOrNullimpl(data.LIZ));
        }
        return data;
    }
}

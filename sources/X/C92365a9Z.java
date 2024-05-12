package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a9Z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92365a9Z implements InterfaceC64900PdY {
    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        BaseResponse baseResponse;
        T t = c64901PdZ.LJI;
        if ((t instanceof BaseResponse) && (baseResponse = (BaseResponse) t) != null && o.LJ(baseResponse.errorCode, "LOGIN_STATUS_EXPIRED")) {
            new Handler(C16880lQ.LLJJJJ()).post(RunnableC91853a1J.LJLIL);
        }
    }
}

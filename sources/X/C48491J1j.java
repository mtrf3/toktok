package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.J1j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48491J1j extends C48489J1h {
    @Override // X.C48489J1h
    public final <T> T LIZ(Class<T> cls) {
        if (o.LJ(cls, InterfaceC48485J1d.class)) {
            return (T) C48492J1k.LIZIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C48489J1h
    public final void LIZIZ(C64797Pbt c64797Pbt, String str, Object value) {
        BaseResponse baseResponse;
        java.util.Map<String, Object> localExtra;
        o.LJIIIZ(value, "value");
        T t = c64797Pbt.LIZIZ;
        if (!(t instanceof BaseResponse) || (baseResponse = (BaseResponse) t) == null || (localExtra = baseResponse.getLocalExtra()) == null) {
            return;
        }
        localExtra.put(str, value);
    }
}

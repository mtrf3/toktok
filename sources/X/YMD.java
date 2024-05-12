package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YMD implements YMF {
    public final /* synthetic */ T1U<Object> LIZ;

    public YMD(C73914Sze c73914Sze) {
        this.LIZ = c73914Sze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.YMF
    public final void LIZ(XM9<YME, ? extends Exception> result) {
        o.LJIIIZ(result, "result");
        T1U<Object> t1u = this.LIZ;
        if (result instanceof XMB) {
            YME yme = (YME) ((XMB) result).LIZIZ;
            Object obj = yme.LJ;
            if (obj instanceof BaseResponse) {
                ((BaseResponse) obj).LIZLLL = yme.LJFF;
            }
            t1u.onSuccess(obj);
            return;
        }
        if (result instanceof XM8) {
            t1u.LIZ(((XM8) result).LIZIZ);
            return;
        }
        throw new C162476Zf();
    }
}

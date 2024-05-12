package X;

import X.InterfaceC57357MfB;
import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XGx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84567XGx<D extends InterfaceC57357MfB> implements XHD {
    public static final C84558XGo LIZJ = new C84558XGo();
    public final InterfaceC88471Ynr<D, Boolean, List<IMotaCache>> LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public C84567XGx(XGB xgb) {
        this.LIZIZ = xgb;
    }

    @Override // X.XHD, X.XH8
    public final <E extends XHD> E LIZ(XHG<E> xhg) {
        return (E) XHA.LIZ(this, xhg);
    }

    @Override // X.XH8
    public final XH8 LIZJ(XHD xhd) {
        return XHE.LIZ(this, xhd);
    }

    @Override // X.XH8
    public final XH8 LIZLLL(XHG<?> xhg) {
        return XHA.LIZIZ(this, xhg);
    }

    @Override // X.XH8
    public final Object LIZIZ(Object obj, XHB operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}

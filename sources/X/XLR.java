package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public final class XLR extends XLT<XLM<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(XLR.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    @Override // X.XLT
    public final boolean LIZ(XLN xln) {
        if (this._state != null) {
            return false;
        }
        this._state = V8H.LIZ;
        return true;
    }

    @Override // X.XLT
    public final InterfaceC67352kd[] LIZIZ(XLN xln) {
        this._state = null;
        return ND2.LJLIL;
    }
}

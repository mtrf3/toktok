package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64945PeH<T> extends AbstractC64937Pe9<T> {
    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        if (t instanceof InterfaceC64949PeL) {
            requestBuilder.LJFF = ((InterfaceC64949PeL) t).LIZ();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("wrong type:");
        LIZ.append(t.getClass());
        LIZ.append(",not implement QueryParamObject");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }
}

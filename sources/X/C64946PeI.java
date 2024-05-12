package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64946PeI<T> extends AbstractC64937Pe9<T> {
    public final Class<T> LIZ;

    public C64946PeI(Class<T> cls) {
        this.LIZ = cls;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        Class<T> cls = this.LIZ;
        requestBuilder.LJIL.put(cls, cls.cast(t));
    }
}

package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64941PeD extends AbstractC64937Pe9<Object> {
    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        if (obj != null) {
            requestBuilder.LIZLLL = obj.toString();
            return;
        }
        throw new NullPointerException("@Url parameter is null.");
    }
}

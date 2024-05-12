package X;

import com.bytedance.retrofit2.RequestBuilder;
import java.lang.reflect.Array;

/* renamed from: X.PeK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64948PeK extends AbstractC64937Pe9<Object> {
    public final /* synthetic */ AbstractC64937Pe9 LIZ;

    public C64948PeK(AbstractC64937Pe9 abstractC64937Pe9) {
        this.LIZ = abstractC64937Pe9;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZ.LIZ(requestBuilder, Array.get(obj, i));
        }
    }
}

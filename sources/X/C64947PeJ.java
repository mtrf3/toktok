package X;

import com.bytedance.retrofit2.RequestBuilder;
import java.util.Iterator;

/* renamed from: X.PeJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64947PeJ extends AbstractC64937Pe9<Iterable<Object>> {
    public final /* synthetic */ AbstractC64937Pe9 LIZ;

    public C64947PeJ(AbstractC64937Pe9 abstractC64937Pe9) {
        this.LIZ = abstractC64937Pe9;
    }

    @Override // X.AbstractC64937Pe9
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void LIZ(RequestBuilder requestBuilder, Iterable<Object> iterable) {
        if (iterable == null) {
            return;
        }
        Iterator<Object> it = iterable.iterator();
        while (it.hasNext()) {
            this.LIZ.LIZ(requestBuilder, it.next());
        }
    }
}

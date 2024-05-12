package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.5si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148805si {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(FilterBean filterBean, boolean z, String singleImageDataId) {
        String valueOf;
        o.LJIIIZ(singleImageDataId, "singleImageDataId");
        if (filterBean == null) {
            return null;
        }
        if (z) {
            valueOf = filterBean.getResId();
            o.LJIIIIZZ(valueOf, "{\n            filterBean.resId\n        }");
        } else {
            valueOf = String.valueOf(filterBean.getId());
        }
        return i0.LJFF(valueOf, singleImageDataId);
    }
}

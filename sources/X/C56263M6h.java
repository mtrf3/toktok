package X;

import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.M6h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56263M6h implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        try {
            return JsonParseUtils.LIZJ(CouponMessage.class, new String(c56265M6j.LIZ()));
        } catch (Throwable unused) {
            return null;
        }
    }
}

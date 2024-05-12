package X;

import android.content.Context;
import android.media.MediaRouter;

/* renamed from: X.Zo2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C91030Zo2 extends C90982ZnG {
    public C91030Zo2(Context context, ZYH zyh) {
        super(context, zyh);
    }

    @Override // X.C90982ZnG, X.C90915ZmB, X.C90868ZlQ
    public final void LJJ(ZYF zyf, C90088ZXg c90088ZXg) {
        super.LJJ(zyf, c90088ZXg);
        c90088ZXg.LIZ.putInt("deviceType", ((MediaRouter.RouteInfo) zyf.LIZ).getDeviceType());
    }
}

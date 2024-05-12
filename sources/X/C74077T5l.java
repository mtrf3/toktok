package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.o;

/* renamed from: X.T5l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74077T5l {
    public static boolean LIZ(NewFaceStickerBean newFaceStickerBean) {
        String str;
        InterfaceC74078T5m LIZ;
        if (newFaceStickerBean != null) {
            str = newFaceStickerBean.id;
        } else {
            str = null;
        }
        if (str == null || newFaceStickerBean.extra == null) {
            return false;
        }
        InterfaceC74078T5m LIZ2 = C59854NeM.LIZ();
        if (LIZ2 != null) {
            String str2 = newFaceStickerBean.id;
            o.LJIIIIZZ(str2, "newFaceStickerBean.id");
            if (LIZ2.LIZLLL(str2)) {
                return false;
            }
        }
        if (newFaceStickerBean.commerceSticker == null || (LIZ = C59854NeM.LIZ()) == null) {
            return false;
        }
        String str3 = newFaceStickerBean.extra;
        o.LJIIIIZZ(str3, "newFaceStickerBean.extra");
        if (!LIZ.isScanUnLockType(str3)) {
            return false;
        }
        return true;
    }
}

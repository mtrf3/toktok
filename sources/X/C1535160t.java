package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.o;

/* renamed from: X.60t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1535160t {
    public static final C1535260u LIZ = new C1535260u(0);
    public static final int[] LIZIZ = {7, 8, 9, 18, 19, 24, 26};

    public static final boolean LIZ(StickerItemModel isCanvasEmbeddedSticker) {
        o.LJIIIZ(isCanvasEmbeddedSticker, "$this$isCanvasEmbeddedSticker");
        if (isCanvasEmbeddedSticker.type == 1000) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(StickerItemModel stickerItemModel) {
        int i;
        int i2;
        InterfaceC88472Yns<? super StickerItemModel, Boolean> predicate = LIZ.LJLIL;
        o.LJIIIZ(predicate, "predicate");
        if (!predicate.invoke(stickerItemModel).booleanValue() || (i = stickerItemModel.type) == 2 || i == 13 || LIZ(stickerItemModel)) {
            return false;
        }
        if (ORY.LJJIJ(stickerItemModel.type, LIZIZ) || (i2 = stickerItemModel.type) == 4 || i2 == 22 || i2 == 21) {
            return false;
        }
        return true;
    }
}

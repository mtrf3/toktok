package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.jvm.internal.o;

/* renamed from: X.5Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136895Yv {
    public static StickerItemModel LIZ(String nickName) {
        o.LJIIIZ(nickName, "nickName");
        TextStickerData textStickerData = new TextStickerData(QZZ.LIZIZ('@', nickName), 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -2, -1, 1048575, null);
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = 1000;
        stickerItemModel.layerWeight = 1000000;
        stickerItemModel.currentOffsetX = 0.5f;
        stickerItemModel.currentOffsetY = 0.5f;
        stickerItemModel.startTime = 0;
        stickerItemModel.endTime = -2;
        stickerItemModel.path = "";
        stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
        return stickerItemModel;
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HGU {
    public static final HGT LIZ(VideoPublishEditModel model) {
        List<StickerItemModel> list;
        o.LJIIIZ(model, "model");
        HGW hgw = new HGW();
        if (model.isMvThemeVideoType()) {
            hgw.LIZ(HGV.MV_THEME);
        }
        if (!TextUtils.isEmpty(model.mStickerID)) {
            hgw.LIZ(HGV.RECORD_PROP);
        }
        if (model.getEffectList() != null && (!r0.isEmpty())) {
            hgw.LIZ(HGV.EDIT_EFFECT);
        }
        InfoStickerModel infoStickerModel = model.infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && (!list.isEmpty())) {
            hgw.LIZ(HGV.EDIT_STICKER);
        }
        if (model.mOrigin == 2) {
            hgw.LIZ(HGV.RECORD_UPLOAD_VIDEO_SOUND);
        }
        return new HGT(hgw.LIZ);
    }
}

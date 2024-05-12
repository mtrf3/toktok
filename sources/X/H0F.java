package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public class H0F extends H0E {
    @Override // X.H0E
    public boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.getCoverPublishModel().getEffectTextModel().isCoverTextValid();
    }

    @Override // X.H0E
    public String LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        StickerItemModel textSticker = videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker();
        if (textSticker == null || (str = textSticker.path) == null) {
            return "";
        }
        return str;
    }
}

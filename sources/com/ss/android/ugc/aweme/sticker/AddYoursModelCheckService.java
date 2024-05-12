package com.ss.android.ugc.aweme.sticker;

import X.C58096Mr6;
import X.C6FR;
import X.C6H4;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* loaded from: classes8.dex */
public final class AddYoursModelCheckService implements AddYoursModelCheckServiceApi {
    public static AddYoursModelCheckServiceApi LIZJ() {
        Object LIZ = C58096Mr6.LIZ(AddYoursModelCheckServiceApi.class, false);
        if (LIZ != null) {
            return (AddYoursModelCheckServiceApi) LIZ;
        }
        if (C58096Mr6.j7 == null) {
            synchronized (AddYoursModelCheckServiceApi.class) {
                if (C58096Mr6.j7 == null) {
                    C58096Mr6.j7 = new AddYoursModelCheckService();
                }
            }
        }
        return C58096Mr6.j7;
    }

    @Override // com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi
    public final boolean LIZIZ() {
        return C6FR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi
    public final boolean LIZ(PublishModel publishModel) {
        Parcelable parcelable;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel != null) {
            parcelable = publishModel.editModel;
        } else {
            parcelable = null;
        }
        if (parcelable instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) parcelable;
        }
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (stickerNewEngineModel = creativeModel.stickerModel) == null || !C6H4.LJFF(stickerNewEngineModel)) {
            return false;
        }
        return true;
    }
}

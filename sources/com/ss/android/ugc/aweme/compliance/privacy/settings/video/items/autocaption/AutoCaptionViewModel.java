package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.autocaption;

import X.AbstractC73672Svk;
import X.C77119UOl;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.VideoPrivacySettingApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import java.util.List;

/* loaded from: classes13.dex */
public final class AutoCaptionViewModel extends BaseVideoPrivacySettingViewModel {
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        CaptionModel captionModel;
        Video video = nv0().getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && captionModel.getEnableAutoCaption() > 0) {
            return 1;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        boolean z;
        String aid = nv0().getAid();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        return C77119UOl.LJIJ(((VideoPrivacySettingApi) SPF.LIZ.getValue()).toggleAutoCaptionSetting(aid, z), "/tiktok/v1/caption/cla/");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        CaptionModel captionModel;
        int i2;
        CaptionLanguage captionLanguage;
        List<CaptionItemModel> list;
        boolean z;
        Video video = nv0().getVideo();
        Long l = null;
        if (video != null) {
            captionModel = video.getCaptionModel();
        } else {
            captionModel = null;
        }
        if (captionModel != null) {
            i2 = captionModel.getHasOriginalAudio();
            captionLanguage = captionModel.getOriginalCaptionLanguage();
            list = captionModel.getCaptionList();
            l = captionModel.getCreatorEditedCaptionId();
        } else {
            i2 = 0;
            captionLanguage = null;
            list = null;
        }
        CaptionModel captionModel2 = new CaptionModel(i2, i, captionLanguage, list, l, null, null, null, null, null, 992, null);
        Video video2 = nv0().getVideo();
        if (video2 != null) {
            video2.setCaptionModel(captionModel2);
        }
        ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
        String aid = nv0().getAid();
        if (aid == null) {
            aid = "";
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        LJJJJI.LIZLLL(aid, z);
    }
}

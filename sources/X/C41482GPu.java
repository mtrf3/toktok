package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GPu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41482GPu implements IEvent {
    public String LJLIL;
    public List<AVTextExtraStruct> LJLILLLLZI;
    public String LJLJI;
    public List<AVTextExtraStruct> LJLJJI;
    public String LJLJJL;
    public final String LJLJJLL;
    public final boolean LJLJL;
    public final int LJLJLJ;
    public final List<AVChallenge> LJLJLLL;
    public int LJLL;
    public final C41483GPv LJLLI;
    public final CompileProbeResult LJLLILLLL;
    public String LJLLJ;
    public int LJLLL;
    public final List<String> LJLLLL;
    public List<User> LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public String LJZI;
    public CommerceToolsTcmModel LJZL;
    public boolean LL;
    public String LLD;
    public String LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public int LLFZ = -1;
    public String LLI = "";
    public int LLIFFJFJJ;
    public List<InteractionTagUserInfo> LLII;
    public ImageAlbumData LLIIII;
    public int LLIIIILZ;
    public final C43659HBn LLIIIJ;
    public String LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public HashMap<Integer, PreCheckResultModel> LLIIJLIL;
    public boolean LLIIL;
    public EditDescMobModel LLIILII;
    public int LLIILZL;
    public boolean LLIIZ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        MvCreateVideoData mvCreateVideoData;
        if (!videoPublishEditModel.getCreationId().equals(this.LLIIIL)) {
            return;
        }
        videoPublishEditModel.setTitle(this.LJLIL);
        videoPublishEditModel.setStructList(this.LJLILLLLZI);
        C60903NvH.LJIIJJI().getPublishService().LJIIJ();
        if (G8X.LIZ(videoPublishEditModel)) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            captionModel.markupText = this.LJLJI;
            List<AVTextExtraStruct> list = this.LJLJJI;
            if (list != null) {
                captionModel.markupExtra = list;
            }
        } else {
            PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
            postPageModel.markupCaption = this.LJLJI;
            List<AVTextExtraStruct> list2 = this.LJLJJI;
            if (list2 != null) {
                postPageModel.markupExtra = list2;
            }
        }
        CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
        commonMobParamModel.hasClickRecommendHashtag = this.LLIIIZ;
        EditDescMobModel editDescMobModel = this.LLIILII;
        if (editDescMobModel != null) {
            commonMobParamModel.editDescMobModel = editDescMobModel;
        }
        videoPublishEditModel.heading = this.LJLJJL;
        videoPublishEditModel.isPrivate = this.LJLJLJ;
        videoPublishEditModel.challenges = this.LJLJLLL;
        videoPublishEditModel.commentSetting = this.LJLL;
        videoPublishEditModel.setCompileProbeResult(this.LJLLILLLL);
        videoPublishEditModel.commerceData = this.LJLLJ;
        videoPublishEditModel.allowAutoCaptionSetting = this.LJZ;
        videoPublishEditModel.autoCaptionLang = this.LJZI;
        videoPublishEditModel.allowDownloadSetting = this.LJLLL;
        videoPublishEditModel.microAppId = null;
        videoPublishEditModel.microAppModel = null;
        videoPublishEditModel.setChain(this.LJLJJLL);
        videoPublishEditModel.setDisableDeleteChain(this.LJLJL);
        videoPublishEditModel.geofencingSetting = this.LJLLLL;
        videoPublishEditModel.excludeUserList = this.LJLLLLLL;
        videoPublishEditModel.allowRecommend = this.LJLZ;
        videoPublishEditModel.setDraftMusicIllegal(this.LL);
        videoPublishEditModel.playlist_id = this.LLF;
        videoPublishEditModel.playlist_name = this.LLD;
        List<InteractionTagUserInfo> list3 = this.LLII;
        if (list3 != null && !list3.isEmpty()) {
            videoPublishEditModel.tagUserList = new ArrayList<>(this.LLII);
        } else {
            videoPublishEditModel.tagUserList = null;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        creativeModel.postPageModel.isEnterFromEPDirectly = false;
        creativeModel.audioCopyrightDetectModel.setChangeMusicImmediately(this.LLFF);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setEditorProImmediately(this.LLFFF);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setHasShopAnchor(this.LLFII);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setDetectResults(this.LLIIJLIL);
        int i = this.LLFZ;
        if (i > -1) {
            videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setOperation(i);
        }
        if (!this.LLI.isEmpty()) {
            videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setChangeMusicFrom(this.LLI);
        }
        C41483GPv c41483GPv = this.LJLLI;
        c41483GPv.getClass();
        if (H7R.LJJJJL(videoPublishEditModel)) {
            videoPublishEditModel.setCoverPublishModel(c41483GPv.LIZJ);
        } else if (videoPublishEditModel.isMvThemeVideoType() && (mvCreateVideoData = videoPublishEditModel.mvCreateVideoData) != null) {
            mvCreateVideoData.videoCoverStartTime = c41483GPv.LIZ;
            mvCreateVideoData.videoCoverImgPath = c41483GPv.LIZIZ;
            videoPublishEditModel.setCoverPublishModel(c41483GPv.LIZJ);
        } else {
            videoPublishEditModel.mVideoCoverStartTm = c41483GPv.LIZ / 1000;
            videoPublishEditModel.setCoverPublishModel(c41483GPv.LIZJ);
        }
        int i2 = this.LLIFFJFJJ;
        if (i2 != 0) {
            videoPublishEditModel.creativeModel.commerceModel.setMusicUsageConfirmation(i2);
        }
        CommerceToolsTcmModel commerceToolsTcmModel = this.LJZL;
        if (commerceToolsTcmModel != null) {
            videoPublishEditModel.creativeModel.commerceModel.setTcmModel(commerceToolsTcmModel);
        }
        videoPublishEditModel.creativeFlowData.getPublishConfig().setMatureTheme(this.LLIIIILZ);
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        PrivacySettingModel privacySettingModel = creativeModel2.privacySettingModel;
        privacySettingModel.isSubscribeOnly = this.LLIIJI;
        creativeModel2.pugcTemplateData.canPostTemplate = this.LLIIL;
        AIGCInfo aIGCInfo = privacySettingModel.aigcInfo;
        aIGCInfo.AIGCLabelType = this.LLIILZL;
        aIGCInfo.manualChangeSwitch = this.LLIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIGCManager -> VideoPublishBackEvent -> manualChangeSwitch = ");
        C13860gY.LIZIZ(LIZ, this.LLIIZ, LIZ);
        CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
        C43659HBn resumeModel = this.LLIIIJ;
        o.LJIIIZ(creativeModel3, "creativeModel");
        o.LJIIIZ(resumeModel, "resumeModel");
        Iterator it = ((ArrayList) C41389GMf.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC41390GMg) it.next()).LIZIZ(creativeModel3, resumeModel);
        }
    }

    public C41482GPu(String str, String str2, boolean z, List list, int i, List list2, C41483GPv c41483GPv, CompileProbeResult compileProbeResult, List list3, C43659HBn c43659HBn) {
        this.LJLIL = str;
        this.LJLJJLL = str2;
        this.LJLJL = z;
        this.LJLILLLLZI = list;
        this.LJLJLJ = i;
        this.LJLJLLL = list2;
        this.LJLLI = c41483GPv;
        this.LJLLILLLL = compileProbeResult;
        this.LJLLLL = list3;
        this.LLIIIJ = c43659HBn;
    }
}

package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.HCM;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ArticlePostModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeInitialModel implements Parcelable {
    public static final Parcelable.Creator<CreativeInitialModel> CREATOR = new HCM();

    @InterfaceC65349Pkn("article_post_model")
    public ArticlePostModel articlePostModel;

    @InterfaceC65349Pkn("cap_cut_reuse_model")
    public final EditCapCutReuseModel capCutReuseModel;

    @GPV
    @InterfaceC65349Pkn("cap_cut_template_music")
    public final CapCutTemplateMusic capCutTemplateMusic;

    @InterfaceC65349Pkn("ec_creative_video_params")
    public final ECommerceCreativeVideoParams creativeVideoParams;

    @InterfaceC65349Pkn("default_post_content_model")
    public DefaultPostContentModel defaultPostContentModel;

    @InterfaceC65349Pkn("dm_camera_model")
    public DMCameraModel dmCameraModel;

    @InterfaceC65349Pkn("duet_and_stitch_router_config")
    public DuetAndStitchRouterConfig duetAndStitchRouterConfig;

    @InterfaceC65349Pkn("high_light_video_parameters_model")
    public final HighLightVideoParametersModel highLightVideoParametersModel;

    @InterfaceC65349Pkn("mob_params")
    public final InitialMobParams mobParams;

    @InterfaceC65349Pkn("profile_paramters_model")
    public ProfileParametersModel profileParametersModel;

    @GPV
    public RecordPageOptionalConfig recordPageOptionalConfig;

    @InterfaceC65349Pkn("social_parameters_model")
    public final SocialParametersModel socialParametersModel;

    @GPV
    @InterfaceC65349Pkn("vq_evaluation_config")
    public VQEvaluationConfig vqEvaluationConfig;

    @GPV
    public WWAModel wwaModel;

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInitialModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.profileParametersModel.writeToParcel(out, i);
        this.dmCameraModel.writeToParcel(out, i);
        InitialMobParams initialMobParams = this.mobParams;
        if (initialMobParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            initialMobParams.writeToParcel(out, i);
        }
        EditCapCutReuseModel editCapCutReuseModel = this.capCutReuseModel;
        if (editCapCutReuseModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            editCapCutReuseModel.writeToParcel(out, i);
        }
        out.writeParcelable(this.vqEvaluationConfig, i);
        ECommerceCreativeVideoParams eCommerceCreativeVideoParams = this.creativeVideoParams;
        if (eCommerceCreativeVideoParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eCommerceCreativeVideoParams.writeToParcel(out, i);
        }
        out.writeParcelable(this.duetAndStitchRouterConfig, i);
        CapCutTemplateMusic capCutTemplateMusic = this.capCutTemplateMusic;
        if (capCutTemplateMusic == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            capCutTemplateMusic.writeToParcel(out, i);
        }
        this.socialParametersModel.writeToParcel(out, i);
        this.highLightVideoParametersModel.writeToParcel(out, i);
        RecordPageOptionalConfig recordPageOptionalConfig = this.recordPageOptionalConfig;
        if (recordPageOptionalConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            recordPageOptionalConfig.writeToParcel(out, i);
        }
        DefaultPostContentModel defaultPostContentModel = this.defaultPostContentModel;
        if (defaultPostContentModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            defaultPostContentModel.writeToParcel(out, i);
        }
        out.writeParcelable(this.articlePostModel, i);
        WWAModel wWAModel = this.wwaModel;
        if (wWAModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wWAModel.writeToParcel(out, i);
        }
    }

    public CreativeInitialModel(ProfileParametersModel profileParametersModel, DMCameraModel dmCameraModel, InitialMobParams initialMobParams, EditCapCutReuseModel editCapCutReuseModel, VQEvaluationConfig vQEvaluationConfig, ECommerceCreativeVideoParams eCommerceCreativeVideoParams, DuetAndStitchRouterConfig duetAndStitchRouterConfig, CapCutTemplateMusic capCutTemplateMusic, SocialParametersModel socialParametersModel, HighLightVideoParametersModel highLightVideoParametersModel, RecordPageOptionalConfig recordPageOptionalConfig, DefaultPostContentModel defaultPostContentModel, ArticlePostModel articlePostModel, WWAModel wWAModel) {
        o.LJIIIZ(profileParametersModel, "profileParametersModel");
        o.LJIIIZ(dmCameraModel, "dmCameraModel");
        o.LJIIIZ(socialParametersModel, "socialParametersModel");
        o.LJIIIZ(highLightVideoParametersModel, "highLightVideoParametersModel");
        this.profileParametersModel = profileParametersModel;
        this.dmCameraModel = dmCameraModel;
        this.mobParams = initialMobParams;
        this.capCutReuseModel = editCapCutReuseModel;
        this.vqEvaluationConfig = vQEvaluationConfig;
        this.creativeVideoParams = eCommerceCreativeVideoParams;
        this.duetAndStitchRouterConfig = duetAndStitchRouterConfig;
        this.capCutTemplateMusic = capCutTemplateMusic;
        this.socialParametersModel = socialParametersModel;
        this.highLightVideoParametersModel = highLightVideoParametersModel;
        this.recordPageOptionalConfig = recordPageOptionalConfig;
        this.defaultPostContentModel = defaultPostContentModel;
        this.articlePostModel = articlePostModel;
        this.wwaModel = wWAModel;
    }

    public /* synthetic */ CreativeInitialModel(ProfileParametersModel profileParametersModel, DMCameraModel dMCameraModel, InitialMobParams initialMobParams, EditCapCutReuseModel editCapCutReuseModel, VQEvaluationConfig vQEvaluationConfig, ECommerceCreativeVideoParams eCommerceCreativeVideoParams, DuetAndStitchRouterConfig duetAndStitchRouterConfig, CapCutTemplateMusic capCutTemplateMusic, SocialParametersModel socialParametersModel, HighLightVideoParametersModel highLightVideoParametersModel, RecordPageOptionalConfig recordPageOptionalConfig, DefaultPostContentModel defaultPostContentModel, ArticlePostModel articlePostModel, WWAModel wWAModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ProfileParametersModel(null, 1, null) : profileParametersModel, (i & 2) != 0 ? new DMCameraModel(false, null, false, null, null, 0, false, 0, null, 0, 1023, null) : dMCameraModel, (i & 4) != 0 ? null : initialMobParams, (i & 8) != 0 ? null : editCapCutReuseModel, (i & 16) != 0 ? null : vQEvaluationConfig, (i & 32) != 0 ? null : eCommerceCreativeVideoParams, (i & 64) != 0 ? null : duetAndStitchRouterConfig, (i & 128) != 0 ? null : capCutTemplateMusic, (i & 256) != 0 ? new SocialParametersModel(null, null, 3, null) : socialParametersModel, (i & 512) != 0 ? new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, 255, null) : highLightVideoParametersModel, (i & 1024) != 0 ? null : recordPageOptionalConfig, (i & 2048) != 0 ? null : defaultPostContentModel, (i & 4096) != 0 ? null : articlePostModel, (i & FileUtils.BUFFER_SIZE) == 0 ? wWAModel : null);
    }
}

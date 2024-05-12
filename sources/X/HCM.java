package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.SocialParametersModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ArticlePostModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCM implements Parcelable.Creator<CreativeInitialModel> {
    @Override // android.os.Parcelable.Creator
    public final CreativeInitialModel createFromParcel(Parcel parcel) {
        InitialMobParams createFromParcel;
        EditCapCutReuseModel createFromParcel2;
        ECommerceCreativeVideoParams createFromParcel3;
        CapCutTemplateMusic createFromParcel4;
        RecordPageOptionalConfig createFromParcel5;
        DefaultPostContentModel createFromParcel6;
        o.LJIIIZ(parcel, "parcel");
        ProfileParametersModel createFromParcel7 = ProfileParametersModel.CREATOR.createFromParcel(parcel);
        DMCameraModel createFromParcel8 = DMCameraModel.CREATOR.createFromParcel(parcel);
        WWAModel wWAModel = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = InitialMobParams.CREATOR.createFromParcel(parcel);
        }
        InitialMobParams initialMobParams = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = EditCapCutReuseModel.CREATOR.createFromParcel(parcel);
        }
        EditCapCutReuseModel editCapCutReuseModel = createFromParcel2;
        VQEvaluationConfig vQEvaluationConfig = (VQEvaluationConfig) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ECommerceCreativeVideoParams.CREATOR.createFromParcel(parcel);
        }
        ECommerceCreativeVideoParams eCommerceCreativeVideoParams = createFromParcel3;
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = CapCutTemplateMusic.CREATOR.createFromParcel(parcel);
        }
        CapCutTemplateMusic capCutTemplateMusic = createFromParcel4;
        SocialParametersModel createFromParcel9 = SocialParametersModel.CREATOR.createFromParcel(parcel);
        HighLightVideoParametersModel createFromParcel10 = HighLightVideoParametersModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = RecordPageOptionalConfig.CREATOR.createFromParcel(parcel);
        }
        RecordPageOptionalConfig recordPageOptionalConfig = createFromParcel5;
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = DefaultPostContentModel.CREATOR.createFromParcel(parcel);
        }
        DefaultPostContentModel defaultPostContentModel = createFromParcel6;
        ArticlePostModel articlePostModel = (ArticlePostModel) parcel.readParcelable(CreativeInitialModel.class.getClassLoader());
        if (parcel.readInt() != 0) {
            wWAModel = WWAModel.CREATOR.createFromParcel(parcel);
        }
        return new CreativeInitialModel(createFromParcel7, createFromParcel8, initialMobParams, editCapCutReuseModel, vQEvaluationConfig, eCommerceCreativeVideoParams, duetAndStitchRouterConfig, capCutTemplateMusic, createFromParcel9, createFromParcel10, recordPageOptionalConfig, defaultPostContentModel, articlePostModel, wWAModel);
    }

    @Override // android.os.Parcelable.Creator
    public final CreativeInitialModel[] newArray(int i) {
        return new CreativeInitialModel[i];
    }
}

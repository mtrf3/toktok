package X;

import Y.IDLCallbackS106S0200000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.QaStructConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPW {
    public static final void LIZ(Context activity, CommentVideoModel commentVideoModel) {
        o.LJIIIZ(activity, "activity");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        String shootWay = commentVideoModel.getShootWay();
        String str = "";
        if (shootWay == null) {
            shootWay = "";
        }
        builder.shootWay(shootWay);
        CommentVideoConfig commentVideoConfig = new CommentVideoConfig();
        commentVideoConfig.setCommentVideoModel(commentVideoModel);
        builder.CommentVideoConfig(commentVideoConfig);
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        String shootWay2 = commentVideoModel.getShootWay();
        if (shootWay2 != null) {
            str = shootWay2;
        }
        LIZ.asyncService(activity, str, new IDLCallbackS106S0200000_7(activity, builder, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Context activity, QaStruct qaStruct, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9 = str3;
        String str10 = str2;
        String str11 = str4;
        String str12 = str5;
        String str13 = str7;
        String shootEnterFrom = "";
        if ((i & 8) != 0) {
            str10 = "";
        }
        if ((i & 16) != 0) {
            str9 = "";
        }
        String str14 = null;
        if ((i & 32) != 0) {
            str11 = null;
        }
        if ((i & 64) != 0) {
            str12 = null;
        }
        if ((i & 128) == 0) {
            shootEnterFrom = str6;
        }
        if ((i & 256) != 0) {
            str13 = null;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shootEnterFrom, "shootEnterFrom");
        if (o.LJ(str11, "others_homepage")) {
            str11 = "qa_profile_others";
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        Effect effect = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        builder.shootExtraData(new ShootExtraData(shootEnterFrom, null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        builder.shootWay(str9);
        builder.enterFrom(str);
        builder.enterMethod(str10);
        builder.qaOrigin(str11);
        QaStructConfig qaStructConfig = new QaStructConfig();
        qaStructConfig.setQaStruct(qaStruct);
        builder.qaVideoConfig(qaStructConfig);
        if (qaStruct != null) {
            str8 = qaStruct.getQuestionContent();
        } else {
            str8 = null;
        }
        EoyHighlightConfig eoyHighlightConfig = C44016HPg.LIZ;
        if (eoyHighlightConfig != null) {
            str14 = eoyHighlightConfig.getEffectId();
        }
        if (C44011HPb.LIZ(str8) && str14 != null) {
            builder.autoUseSticker(str14);
            builder.showPreloadingDialog(true);
            builder.showCancelAfterPinProp(true);
            builder.recordPresetResource(new RecordPresetResource(str14, effect, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 14, objArr == true ? 1 : 0));
        }
        builder.qaOriginGroupId(str12);
        builder.questionCategory(str13);
        if (qaStruct != null) {
            builder.extraEventParams(qaStruct.getExtraEventParams());
        }
        AVExternalServiceImpl.LIZ().asyncService(activity, str9, new IDLCallbackS106S0200000_7(activity, builder, 17));
    }
}

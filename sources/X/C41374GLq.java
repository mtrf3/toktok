package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GLq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41374GLq implements ICreativeNowDataConverter {
    public static final C41374GLq LIZ = new C41374GLq();

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter
    public final CreativeNowDraft convert2NowDraft(PublishModel publishModel) {
        long currentTimeMillis;
        VideoPublishEditModel videoPublishEditModel;
        if (publishModel == null || publishModel.nowsShootData == null) {
            return null;
        }
        String str = publishModel.creationId;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            currentTimeMillis = videoPublishEditModel.draftSaveTime;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        return new CreativeNowDraft(str, currentTimeMillis, publishModel.editModel, publishModel.nowsShootData, null, 16, null);
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter
    public final Bitmap getNowCover(CreativeNowDraft creativeNowDraft) {
        NowsShootModel nowsShootData;
        List list;
        if (creativeNowDraft == null || (nowsShootData = creativeNowDraft.getNowsShootData()) == null) {
            return null;
        }
        C142655in c142655in = new C142655in(1);
        Bitmap outerBitmap = nowsShootData.backBitmap;
        if (outerBitmap == null) {
            String str = nowsShootData.backImagePath;
            if (str != null) {
                outerBitmap = BitmapFactory.decodeFile(str);
            } else {
                list = C61878OQg.INSTANCE;
                return (Bitmap) ORZ.LJLLLL(list);
            }
        }
        Bitmap innerBitmap = nowsShootData.frontBitmap;
        if (innerBitmap == null) {
            String str2 = nowsShootData.frontImagePath;
            if (str2 != null) {
                innerBitmap = BitmapFactory.decodeFile(str2);
            } else {
                list = C61878OQg.INSTANCE;
                return (Bitmap) ORZ.LJLLLL(list);
            }
        }
        if (e1.LIZ(31744, "now_make_selfie_taking_easier_optimize_downloading_and_editpage_enable_dragged", true, false) && nowsShootData.frontImageInLargeWindow) {
            o.LJIIIIZZ(innerBitmap, "innerBitmap");
            o.LJIIIIZZ(outerBitmap, "outerBitmap");
            list = C142645im.LIZ(innerBitmap, outerBitmap, c142655in);
        } else {
            o.LJIIIIZZ(outerBitmap, "outerBitmap");
            o.LJIIIIZZ(innerBitmap, "innerBitmap");
            list = C142645im.LIZ(outerBitmap, innerBitmap, c142655in);
        }
        return (Bitmap) ORZ.LJLLLL(list);
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter
    public final CreativeNowDraft convert2NowDraft(AwemeDraft awemeDraft) {
        if (awemeDraft == null) {
            return null;
        }
        new C43542H7a("now_converter");
        VideoPublishEditModel LIZJ = C43542H7a.LIZJ(awemeDraft);
        String creationId = LIZJ.getCreationId();
        o.LJIIIIZZ(creationId, "editModel.creationId");
        return new CreativeNowDraft(creationId, awemeDraft.saveTime, LIZJ, LIZJ.creativeModel.nowsShootModel, awemeDraft);
    }
}

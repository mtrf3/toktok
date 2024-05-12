package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditVideoSegmentDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.ImportVideoInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;

/* loaded from: classes7.dex */
public final class EJE extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final EJE LJLIL = new EJE();

    public EJE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZIZ(new MultiEditVideoSegmentRecordDataDeserializer(), MultiEditVideoSegmentRecordData.class);
        eVar.LIZIZ(new EditVideoSegmentDeserializer(), EditVideoSegment.class);
        eVar.LIZIZ(new ImportVideoInfoDeserializer(), ImportVideoInfo.class);
        eVar.LIZIZ(new MultiEditVideoRecordDataDeserializer(), MultiEditVideoRecordData.class);
        eVar.LIZIZ(new MvCreateVideoDataDeserializer(), MvCreateVideoData.class);
        eVar.LIZIZ(new EditPreviewInfoDeserializer(), EditPreviewInfo.class);
        eVar.LIZIZ(new AVUploadSaveModelDeserializer(), AVUploadSaveModel.class);
        eVar.LIZIZ(new MvSourceItemInfoDeserializer(), MvSourceItemInfo.class);
        eVar.LIZIZ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
        eVar.LIZIZ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        eVar.LIZIZ(new TextStickerTextPairDeserializer(), TextStickerTextPair.class);
        return eVar.LIZ();
    }
}

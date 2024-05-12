package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C146045oG;
import X.C157166Eu;
import X.C45131HnT;
import X.C47261Igj;
import X.C60903NvH;
import X.C63D;
import X.C68322mC;
import X.C73165SnZ;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.KMP;
import X.TBW;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.cut_ui.CutSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class AqS11S0500000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS11S0500000_2 aqS11S0500000_2, Object obj) {
        aqS11S0500000_2.invoke$0(obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C157166Eu c157166Eu) {
        C157166Eu c157166Eu2 = c157166Eu;
        ((InterfaceC88473Ynt) this.l4).invoke(c157166Eu2.LJLIL, c157166Eu2.LJLILLLLZI, c157166Eu2.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS11S0500000_2 aqS11S0500000_2, Object textStickerTextWrap) {
        C63D c63d;
        InlineCaptionModel inlineCaptionModel;
        ArrayList<StickerItemModel> arrayList;
        o.LJIIIZ(textStickerTextWrap, "textStickerTextWrap");
        ((TextStickerData) aqS11S0500000_2.l0).setTextWrapList(C47261Igj.LJII(textStickerTextWrap));
        int id = ((TextStickerModel) aqS11S0500000_2.l1).getId();
        TextStickerData data = (TextStickerData) aqS11S0500000_2.l0;
        o.LJIIIZ(data, "data");
        StickerItemModel stickerItemModel = new StickerItemModel(KMP.LJ("text_sticker_", id), "", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), data), id, false, data.getStartTime(), data.getEndTime(), 2);
        stickerItemModel.isImageStickerLayer = true;
        stickerItemModel.adjustTextParagraph = data.getAdjustTextParagraph();
        stickerItemModel.adjustTextStyleInEditorPro = data.getAdjustTextStyleInEditorPro();
        stickerItemModel.adjustTextColorInEditorPro = data.getAdjustTextColorInEditorPro();
        stickerItemModel.adjustTextFontInEditorPro = data.getAdjustTextFontInEditorPro();
        stickerItemModel.adjustTextPositionInEditorPro = data.getAdjustTextPositionInEditorPro();
        stickerItemModel.isEditorProTrimLength = data.isEditorProTrimLength();
        stickerItemModel.isEditorProText = data.isEditorProText();
        stickerItemModel.isEditorProCopyText = data.isEditorProCopyText();
        stickerItemModel.isEditorProTTS = data.isEditorProTTS();
        stickerItemModel.editorProTTSID = data.getEditorProTTSID();
        stickerItemModel.isEditorProCaption = data.isEditorProCaption();
        ((VideoPublishEditModel) aqS11S0500000_2.l2).infoStickerModel.stickers.add(stickerItemModel);
        if (u.LJIJ((TextStickerModel) aqS11S0500000_2.l1) && (inlineCaptionModel = ((VideoPublishEditModel) aqS11S0500000_2.l2).creativeModel.inlineCaptionModel) != null && (arrayList = inlineCaptionModel.utterances) != null) {
            arrayList.add(stickerItemModel);
        }
        C76732zl c76732zl = (C76732zl) aqS11S0500000_2.l3;
        int i = c76732zl.element - 1;
        c76732zl.element = i;
        if (i == 0 && (c63d = (C63D) aqS11S0500000_2.l4) != null) {
            c63d.b1(null);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bytedance.ies.smartmovie.jni.VecMeta, java.util.List, T] */
    public static final Object invoke$2(AqS11S0500000_2 aqS11S0500000_2, Object obj) {
        ?? r5 = (VecMeta) obj;
        ((C45131HnT) aqS11S0500000_2.l0).onCompressDone(r5);
        ((C68322mC) aqS11S0500000_2.l1).element = r5;
        C146045oG.LIZ.LIZLLL((CutSource) aqS11S0500000_2.l2, (NLETemplateModel) ((C68322mC) aqS11S0500000_2.l3).element, (Context) aqS11S0500000_2.l4, r5, (C45131HnT) aqS11S0500000_2.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS11S0500000_2(C45131HnT c45131HnT, C45131HnT c45131HnT2, C68322mC<List<Meta>> c68322mC, CutSource cutSource, C68322mC<NLETemplateModel> c68322mC2, Context context) {
        super(1);
        this.$t = context;
        this.l0 = c45131HnT;
        this.l1 = c45131HnT2;
        this.l2 = c68322mC;
        this.l3 = cutSource;
        this.l4 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S0500000_2(TextStickerData textStickerData, TextStickerModel textStickerModel, VideoPublishEditModel videoPublishEditModel, C76732zl c76732zl, C63D c63d, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.l1 = textStickerModel;
        this.l2 = videoPublishEditModel;
        this.l3 = c76732zl;
        this.l4 = c63d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S0500000_2(C73165SnZ c73165SnZ, JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = tbw;
        this.l2 = tbw2;
        this.l3 = tbw3;
        this.l4 = interfaceC88473Ynt;
    }
}

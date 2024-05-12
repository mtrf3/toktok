package X;

import androidx.lifecycle.LifecycleOwner;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139275dL {
    public final LifecycleOwner LIZ;
    public final InterfaceC65784Pro<C63C> LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC139535dl LIZLLL;
    public final InterfaceC143855kj LJ;
    public final InterfaceC139045cy LJFF;

    public final void LIZ() {
        for (TextStickerModel textStickerModel : LIZJ()) {
            BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
            TextFontModel L = TextFontModel.L(textStickerModel.getFontModel(), null, null, null, 0, null, null, false, false, 511);
            Integer value = this.LJ.J9().getValue();
            if (value == null) {
                value = Integer.valueOf(textStickerModel.getMode());
            }
            Integer value2 = this.LJ.z1().getValue();
            if (value2 == null) {
                value2 = Integer.valueOf(textStickerModel.getAlign());
            }
            Integer value3 = this.LJ.E0().getValue();
            if (value3 == null) {
                value3 = Integer.valueOf(textStickerModel.getColor());
            }
            o.LJIIIIZZ(value, "editSubtitleApi.textBgModeState.value ?: it.mode");
            int intValue = value.intValue();
            o.LJIIIIZZ(value3, "editSubtitleApi.textColorState.value ?: it.color");
            int intValue2 = value3.intValue();
            o.LJIIIIZZ(value2, "editSubtitleApi.textAlignState.value ?: it.align");
            TextStickerModel copy$default = TextStickerModel.copy$default(textStickerModel, baseStickerModel, null, null, intValue, intValue2, value2.intValue(), 0.0f, L, false, false, false, null, null, null, null, null, null, false, 261958, null);
            InterfaceC139535dl interfaceC139535dl = this.LIZLLL;
            if (interfaceC139535dl != null) {
                interfaceC139535dl.N8(copy$default);
            }
        }
    }

    public final List<TextStickerModel> LIZJ() {
        List<StickerModel> sk0;
        InterfaceC139535dl interfaceC139535dl = this.LIZLLL;
        if (interfaceC139535dl != null && (sk0 = interfaceC139535dl.sk0(EnumC157656Gr.TEXT)) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerModel stickerModel : sk0) {
                StickerModel stickerModel2 = stickerModel;
                if ((stickerModel2 instanceof TextStickerModel) && u.LJIJ((TextStickerModel) stickerModel2)) {
                    arrayList.add(stickerModel);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StickerModel stickerModel3 = (StickerModel) it.next();
                o.LJII(stickerModel3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
                arrayList2.add(stickerModel3);
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    public final ArrayList<TextStickerData> LIZIZ() {
        List<TextStickerModel> LIZJ = LIZJ();
        ArrayList<TextStickerData> arrayList = new ArrayList<>(C32I.LJJL(LIZJ, 10));
        Iterator<TextStickerModel> it = LIZJ.iterator();
        while (it.hasNext()) {
            arrayList.add(C137045Zk.LIZIZ(it.next()));
        }
        return arrayList;
    }

    public final void LIZLLL() {
        Iterator<TextStickerModel> it = LIZJ().iterator();
        while (it.hasNext()) {
            this.LJFF.PF(it.next().getId());
        }
    }

    public final void LJ(TextStickerModel sampleModel) {
        o.LJIIIZ(sampleModel, "sampleModel");
        List<TextStickerModel> LIZJ = LIZJ();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : LIZJ) {
            if (textStickerModel.getId() != sampleModel.getId()) {
                arrayList.add(textStickerModel);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TextStickerModel textStickerModel2 = (TextStickerModel) it.next();
            TextStickerModel copy$default = TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, sampleModel.getBaseStickerModel().getTranslateX(), sampleModel.getBaseStickerModel().getTranslateY(), sampleModel.getBaseStickerModel().getScale(), sampleModel.getBaseStickerModel().getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -31457281, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
            InterfaceC139535dl interfaceC139535dl = this.LIZLLL;
            if (interfaceC139535dl != null) {
                interfaceC139535dl.N8(copy$default);
            }
            InterfaceC139535dl interfaceC139535dl2 = this.LIZLLL;
            if (interfaceC139535dl2 != null) {
                interfaceC139535dl2.xQ(copy$default);
            }
        }
    }

    public final void LJFF(boolean z) {
        InlineCaptionModel inlineCaptionModel = this.LIZJ.creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null) {
            inlineCaptionModel.utterances = null;
        }
        if (LIZJ().isEmpty()) {
            if (z) {
                this.LJ.sa0(null);
            }
            VideoPublishEditModel videoPublishEditModel = this.LIZJ;
            videoPublishEditModel.captionStruct = null;
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            creativeModel.inlineCaptionModel = null;
            C6H4.LJII(C139285dM.LJLIL, creativeModel.stickerModel.textStickerModels);
        } else {
            this.LJ.sa0(LIZIZ());
        }
        H78.LIZ("EditStickerScene -> update caption details in publishEditModel");
    }

    public C139275dL(C139305dO lifecycleOwner, InterfaceC65784Pro stickerSceneGetter, VideoPublishEditModel editModel, InterfaceC139535dl interfaceC139535dl, InterfaceC143855kj interfaceC143855kj, InterfaceC139045cy textStickerNewApi) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerSceneGetter, "stickerSceneGetter");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(textStickerNewApi, "textStickerNewApi");
        this.LIZ = lifecycleOwner;
        this.LIZIZ = stickerSceneGetter;
        this.LIZJ = editModel;
        this.LIZLLL = interfaceC139535dl;
        this.LJ = interfaceC143855kj;
        this.LJFF = textStickerNewApi;
    }
}

package X;

import Y.ARunnableS2S1300000_2;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137045Zk {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TTSModel LIZ(TextStickerData textStickerData) {
        o.LJIIIZ(textStickerData, "<this>");
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        TTSModel tTSModel = new TTSModel(false, objArr, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 33554431, 0 == true ? 1 : 0);
        tTSModel.hasReadTextAudio = textStickerData.getHasReadTextAudio();
        tTSModel.audioTrackIndex = textStickerData.getAudioTrackIndex();
        String nleUuid = textStickerData.getNleUuid();
        o.LJIIIZ(nleUuid, "<set-?>");
        tTSModel.nleUuid = nleUuid;
        tTSModel.audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        tTSModel.speakerID = textStickerData.getSpeakerID();
        tTSModel.speakerName = textStickerData.getSpeakerName();
        tTSModel.audioTrackDuration = textStickerData.getAudioTrackDuration();
        tTSModel.audioText = textStickerData.getAudioText();
        List<String> audioPathList = textStickerData.getAudioPathList();
        o.LJIIIZ(audioPathList, "<set-?>");
        tTSModel.audioPathList = audioPathList;
        tTSModel.ttsVoiceModel = textStickerData.getTtsVoiceModel();
        tTSModel.autoAddTtsFlag = textStickerData.getAutoAddTtsFlag();
        tTSModel.voiceEffectId = textStickerData.getVoiceEffectId();
        tTSModel.voiceEffectResourceId = textStickerData.getVoiceEffectResourceId();
        tTSModel.voiceAnchorName = textStickerData.getVoiceAnchorName();
        tTSModel.voiceEffectIconUrl = textStickerData.getVoiceEffectIconUrl();
        String voiceCreatorUserId = textStickerData.getVoiceCreatorUserId();
        o.LJIIIZ(voiceCreatorUserId, "<set-?>");
        tTSModel.voiceCreatorUserId = voiceCreatorUserId;
        String voiceCreatorUserName = textStickerData.getVoiceCreatorUserName();
        o.LJIIIZ(voiceCreatorUserName, "<set-?>");
        tTSModel.voiceCreatorUserName = voiceCreatorUserName;
        tTSModel.isCreatorVoice = textStickerData.isCreatorVoice();
        tTSModel.ttsAnchorReleaseDate = textStickerData.getTtsAnchorReleaseDate();
        tTSModel.ttsReleaseDate = textStickerData.getTtsReleaseDate();
        List<String> ttsHashTagIds = textStickerData.getTtsHashTagIds();
        o.LJIIIZ(ttsHashTagIds, "<set-?>");
        tTSModel.ttsHashTagIds = ttsHashTagIds;
        TTSAudioBean ttsAudioBean = textStickerData.getTtsAudioBean();
        o.LJIIIZ(ttsAudioBean, "<set-?>");
        tTSModel.ttsAudioBean = ttsAudioBean;
        tTSModel.isEditorProTTS = o.LJ(textStickerData.isEditorProTTS(), "1");
        String editorProTTSID = textStickerData.getEditorProTTSID();
        o.LJIIIZ(editorProTTSID, "<set-?>");
        tTSModel.editorProTTSID = editorProTTSID;
        tTSModel.ttsExtraMap.clear();
        tTSModel.ttsExtraMap.putAll(textStickerData.getTtsExtraMap());
        return tTSModel;
    }

    public static final TextStickerData LIZIZ(TextStickerModel textStickerModel) {
        String str;
        String str2;
        boolean z;
        String str3;
        o.LJIIIZ(textStickerModel, "<this>");
        TextStickerData textStickerData = new TextStickerData(textStickerModel.getTextStr(), textStickerModel.getMode(), textStickerModel.getColor(), textStickerModel.getAlign(), null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -16, -1, 1048575, null);
        textStickerData.setIdInNewEngine(C32151Nz.LJJIIJ(textStickerModel));
        textStickerData.setPlaceholderSlotId(textStickerModel.getUuid());
        if (u.LJIJ(textStickerModel)) {
            str = "type_inline_caption";
        } else if (u.LJIILLIIL(textStickerModel)) {
            str = "type_ai_caption";
        } else {
            str = "type_text_sticker";
        }
        textStickerData.setType(str);
        textStickerData.setTextWrapList(C68W.LIZLLL(textStickerData.getTextStr()));
        textStickerData.setRotation(textStickerModel.getBaseStickerModel().getRotation());
        textStickerData.setScale(textStickerModel.getBaseStickerModel().getScale());
        textStickerData.setFontType(textStickerModel.getFontModel().fileName);
        textStickerData.setFontSize(textStickerModel.getFontModel().fontSize);
        textStickerData.setLineSpacingExtra(textStickerModel.getLineSpacingExtra());
        textStickerData.setX(textStickerModel.getBaseStickerModel().getTranslateX() + textStickerModel.getBaseStickerModel().getCenterX());
        textStickerData.setY(textStickerModel.getBaseStickerModel().getTranslateY() + textStickerModel.getBaseStickerModel().getCenterY());
        textStickerData.setLayoutWidth(textStickerModel.getBaseStickerModel().getContainerWidth());
        textStickerData.setLayoutHeight(textStickerModel.getBaseStickerModel().getContainerHeight());
        textStickerData.setStartTime((int) textStickerModel.getBaseStickerModel().getStartTime());
        textStickerData.setEndTime((int) textStickerModel.getBaseStickerModel().getEndTime());
        textStickerData.setUiStartTime((int) textStickerModel.getBaseStickerModel().getUiStartTime());
        textStickerData.setUiEndTime((int) textStickerModel.getBaseStickerModel().getUiEndTime());
        TTSModel ttsModel = textStickerModel.getTtsModel();
        String str4 = "1";
        if (ttsModel != null) {
            textStickerData.setHasReadTextAudio(ttsModel.hasReadTextAudio);
            textStickerData.setAudioTrackIndex(ttsModel.audioTrackIndex);
            textStickerData.setNleUuid(ttsModel.nleUuid);
            textStickerData.setAudioTrackFilePath(ttsModel.audioTrackFilePath);
            textStickerData.setSpeakerID(ttsModel.speakerID);
            textStickerData.setSpeakerName(ttsModel.speakerName);
            textStickerData.setAudioTrackDuration(ttsModel.audioTrackDuration);
            textStickerData.setAudioText(ttsModel.audioText);
            textStickerData.setAudioPathList(ttsModel.audioPathList);
            textStickerData.setTtsVoiceModel(ttsModel.ttsVoiceModel);
            textStickerData.setAutoAddTtsFlag(ttsModel.autoAddTtsFlag);
            textStickerData.setVoiceEffectId(ttsModel.voiceEffectId);
            textStickerData.setVoiceEffectResourceId(ttsModel.voiceEffectResourceId);
            textStickerData.setVoiceAnchorName(ttsModel.voiceAnchorName);
            textStickerData.setVoiceEffectIconUrl(ttsModel.voiceEffectIconUrl);
            textStickerData.setVoiceCreatorUserId(ttsModel.voiceCreatorUserId);
            textStickerData.setVoiceCreatorUserName(ttsModel.voiceCreatorUserName);
            textStickerData.setCreatorVoice(ttsModel.isCreatorVoice);
            textStickerData.setTtsAnchorReleaseDate(ttsModel.ttsAnchorReleaseDate);
            textStickerData.setTtsReleaseDate(ttsModel.ttsReleaseDate);
            textStickerData.setTtsHashTagIds(ttsModel.ttsHashTagIds);
            textStickerData.setTtsAudioBean(ttsModel.ttsAudioBean);
            if (ttsModel.isEditorProTTS) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            textStickerData.setEditorProTTS(str3);
            textStickerData.setEditorProTTSID(ttsModel.editorProTTSID);
            textStickerData.getTtsExtraMap().clear();
            textStickerData.getTtsExtraMap().putAll(ttsModel.ttsExtraMap);
        }
        textStickerData.setAdjustTextParagraph(textStickerModel.getMobModel().adjustTextParagraph);
        textStickerData.setAdjustTextStyleInEditorPro(textStickerModel.getMobModel().adjustTextStyleInEditorPro);
        textStickerData.setAdjustTextColorInEditorPro(textStickerModel.getMobModel().adjustTextColorInEditorPro);
        textStickerData.setAdjustTextFontInEditorPro(textStickerModel.getMobModel().adjustTextFontInEditorPro);
        textStickerData.setAdjustTextPositionInEditorPro(textStickerModel.getMobModel().adjustTextPositionInEditorPro);
        textStickerData.setEditorProTrimLength(textStickerModel.getMobModel().isEditorProTrimLength);
        if (textStickerModel.getSourceType() == C5V7.EDITOR_PRO) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProText(str2);
        if (textStickerModel.getSourceType() == C5V7.ACTION_AI) {
            z = true;
        } else {
            z = false;
        }
        textStickerData.setActionAIText(z);
        textStickerData.setEditorProCopyText(textStickerModel.getMobModel().isEditorProCopyText);
        CaptionModel captionModel = textStickerModel.getCaptionModel();
        if (captionModel == null || !captionModel.isEditorProCaption) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProCaption(str4);
        return textStickerData;
    }

    public static final List<TextStickerData> LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C42000Ge4.LJIILIIL(videoPublishEditModel)) {
            List<TextStickerModel> LJII = C42000Ge4.LJII(videoPublishEditModel);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJII, 10));
            Iterator<TextStickerModel> it = LJII.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZIZ(it.next()));
            }
            return arrayList;
        }
        try {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel.isNormalTextSticker()) {
                        arrayList2.add(stickerItemModel);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), ((StickerItemModel) it2.next()).extra, TextStickerData.class));
                }
                return arrayList3;
            }
            return C61878OQg.INSTANCE;
        } catch (s unused) {
            return C61878OQg.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel LIZJ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r54, boolean r55, X.OSZ<java.lang.Integer, java.lang.Integer> r56) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137045Zk.LIZJ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, boolean, X.OSZ):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    public static final void LJ(Context context, InterfaceC143655kP editPreviewApi, String str, TextStickerData data, InterfaceC88472Yns<? super TextStickerTextWrap, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(data, "data");
        C1551767d c1551767d = new C1551767d(context, null);
        c1551767d.setVisibility(4);
        int LIZ = (int) C170576mj.LIZ(context, 32.0f);
        int LIZ2 = (int) C170576mj.LIZ(context, 12.0f);
        c1551767d.setPadding(LIZ, LIZ2, LIZ, LIZ2);
        c1551767d.setTextSize(1, data.getFontSize());
        c1551767d.setFontType(C68M.LJIIJ().LJIIL(data.getFontType()));
        c1551767d.setAligin(data.getAlign());
        c1551767d.setText(data.getTextStr());
        editPreviewApi.Iy().addView(c1551767d, new ViewGroup.LayoutParams(-1, -2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append(" -> addToProcessSplitTextTask fontType=");
        LIZ3.append(data.getFontType());
        LIZ3.append(" text=");
        LIZ3.append(data.getTextStr());
        H7B.LJ(X1D.LIZIZ(LIZ3));
        c1551767d.post(new ARunnableS2S1300000_2(editPreviewApi, c1551767d, interfaceC88472Yns, str, 2));
    }
}

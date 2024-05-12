package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHDRFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.ugctemplate.bizmodel.TTSModel;
import com.ss.android.ugc.gamora.ugctemplate.bizmodel.TextStickerBizModel;
import com.ss.android.vesdk.VEUtils;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132435Hr {
    public static final /* synthetic */ int LIZ = 0;

    public static final NLEModel LIZ(VideoPublishEditModel model) {
        ArrayList arrayList;
        String str;
        NLESegmentFilter LIZIZ;
        NLEResourceNode LJ;
        String LIZLLL;
        NLESegment nLESegment;
        String str2;
        SoundEffect soundEffect;
        NLETrack nLETrack;
        float f;
        NLESegment LJI;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack2;
        NLESegment LJI2;
        NLEResourceNode LIZIZ2;
        int i;
        int i2;
        StickerItemModel stickerItemModel;
        List<StickerItemModel> list;
        NLESegment nLESegment2;
        o.LJIIIZ(model, "model");
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(model.nleData);
        C132445Hs c132445Hs = new C132445Hs(model);
        NLEModel LJ2 = nLEEditor.LJ();
        o.LJIIIIZZ(LJ2, "editor.model");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("begin produceUgcTemplateNLEModel ");
        LIZ2.append(LJ2.toJsonString());
        C5GW.LIZ(X1D.LIZIZ(LIZ2));
        NLEModel templateNLEModel = NLEModel.dynamicCast(LJ2.deepClone());
        o.LJIIIIZZ(templateNLEModel, "templateNLEModel");
        Iterator LIZJ = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack3 = (NLETrack) LIZJ.next();
            NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack3.LJIILL());
            if (nLETrackSlot != null) {
                nLESegment2 = nLETrackSlot.LJI();
            } else {
                nLESegment2 = null;
            }
            if (NLESegmentTextSticker.LJFF(nLESegment2) != null) {
                templateNLEModel.removeTrack(nLETrack3);
            }
        }
        InfoStickerModel infoStickerModel = c132445Hs.LIZ.infoStickerModel;
        int i3 = 2;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel2 : list) {
                if (stickerItemModel2.type == 2) {
                    arrayList.add(stickerItemModel2);
                }
            }
        } else {
            arrayList = null;
        }
        VideoPublishEditModel videoPublishEditModel = c132445Hs.LIZ;
        List<TextStickerModel> list2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        Iterator<TextStickerData> it = C137045Zk.LIZLLL(videoPublishEditModel).iterator();
        int i4 = 0;
        while (true) {
            String str3 = "";
            if (it.hasNext()) {
                TextStickerData next = it.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    TextStickerData textStickerData = next;
                    if (!o.LJ(textStickerData.getType(), "type_inline_caption")) {
                        NLETrack nLETrack4 = new NLETrack();
                        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                        nLETrackSlot2.setStartTime(textStickerData.getStartTime() * 1000);
                        if (textStickerData.getEndTime() != 0) {
                            i = textStickerData.getEndTime();
                        } else {
                            long j = c132445Hs.LIZIZ;
                            if (j <= 0) {
                                j = LIZJ(templateNLEModel);
                                c132445Hs.LIZIZ = j;
                            }
                            i = (int) j;
                        }
                        nLETrackSlot2.setEndTime(i * 1000);
                        float f2 = i3;
                        nLETrackSlot2.setTransformX(((textStickerData.getX() / textStickerData.getVideoWidth()) - 0.5f) * f2);
                        nLETrackSlot2.setTransformY((0.5f - (textStickerData.getY() / textStickerData.getVideoHeight())) * f2);
                        nLETrackSlot2.setScale(textStickerData.getScale());
                        nLETrackSlot2.setRotation(-textStickerData.getRotation());
                        if (C42000Ge4.LJIILIIL(c132445Hs.LIZ)) {
                            i2 = ((TextStickerModel) ListProtector.get(list2, i4)).getBaseStickerModel().getZIndex();
                        } else if (arrayList != null && (stickerItemModel = (StickerItemModel) ListProtector.get(arrayList, i4)) != null) {
                            i2 = stickerItemModel.layerWeight;
                        } else {
                            i2 = 0;
                        }
                        nLETrackSlot2.setLayer(i2);
                        if (C78685UuP.LJJJZ(textStickerData.getNleUuid())) {
                            try {
                                str3 = C134305Ow.LIZ(textStickerData.getVoiceEffectResourceId(), C139905eM.LIZ("text_read"));
                            } catch (Throwable unused) {
                            }
                            nLETrackSlot2.setExtra("biz_data", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), new TextStickerBizModel(new TTSModel(textStickerData.getNleUuid(), str3))));
                        }
                        nLETrack4.LIZIZ(nLETrackSlot2);
                        NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                        nLESegmentTextSticker.LJIIIIZZ(textStickerData.getTextStr());
                        nLESegmentTextSticker.LJIIIZ(new NLEStyText());
                        NLEStyText style = nLESegmentTextSticker.LJII();
                        o.LJIIIIZZ(style, "style");
                        C61491OBj.LJJZZI(style, textStickerData);
                        nLETrackSlot2.LJIIL(nLESegmentTextSticker);
                        templateNLEModel.addTrack(nLETrack4);
                    }
                    i3 = 2;
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                if (c132445Hs.LIZ.creativeModel.voiceConversionModel.hasDubVoiceConversion && (tracks = templateNLEModel.getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            nLETrack2 = it2.next();
                            if (o.LJ(nLETrack2.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                                break;
                            }
                        } else {
                            nLETrack2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack5 = nLETrack2;
                    if (nLETrack5 != null) {
                        Iterator<NLETrackSlot> it3 = nLETrack5.LJIILL().iterator();
                        while (it3.hasNext()) {
                            NLETrackSlot next2 = it3.next();
                            if (next2.hasExtra("extra_origin_voice_file_path") && (LJI2 = next2.LJI()) != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                                LIZIZ2.LJIIIZ(next2.getExtra("extra_origin_voice_file_path"));
                            }
                        }
                    }
                }
                VecNLETrackSPtr tracks2 = templateNLEModel.getTracks();
                if (tracks2 != null) {
                    Iterator<NLETrack> it4 = tracks2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            nLETrack = it4.next();
                            if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                                break;
                            }
                        } else {
                            nLETrack = null;
                            break;
                        }
                    }
                    NLETrack nLETrack6 = nLETrack;
                    if (nLETrack6 != null) {
                        NLETrackSlot nLETrackSlot3 = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack6.LJIILL());
                        if (nLETrackSlot3 != null && (LJI = nLETrackSlot3.LJI()) != null) {
                            f = C124574uj.LJJIIZI(LJI);
                        } else {
                            f = 1.0f;
                        }
                        NLETrack mainTrack = templateNLEModel.getMainTrack();
                        if (mainTrack != null) {
                            Iterator<NLETrackSlot> it5 = mainTrack.LJIILL().iterator();
                            while (it5.hasNext()) {
                                NLESegment LJI3 = it5.next().LJI();
                                o.LJIIIIZZ(LJI3, "slot.mainSegment");
                                C124574uj.LJJLIIIJJI(LJI3, f);
                            }
                        }
                    }
                }
                Iterator LIZJ2 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ2.hasNext()) {
                    NLETrack nLETrack7 = (NLETrack) LIZJ2.next();
                    String extra = nLETrack7.getExtra("AudioTrackType");
                    if (o.LJ(extra, EnumC122254qz.TEXT_SPEAK.name())) {
                        nLETrack7.setExtra("biz_extra_type", "text_read");
                    } else if (o.LJ(extra, EnumC122254qz.BGM.name())) {
                        nLETrack7.setExtra("biz_extra_type", "bgm");
                    } else if (o.LJ(extra, EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                        nLETrack7.setExtra("biz_extra_type", "dub_voice_conversion");
                    } else if (o.LJ(extra, EnumC122254qz.DUB.name())) {
                        nLETrack7.setExtra("biz_extra_type", "dub");
                    } else if (o.LJ(extra, EnumC122254qz.AUDIO_RECORD.name())) {
                        nLETrack7.setExtra("biz_extra_type", "audio_record");
                    } else if (o.LJ(extra, EnumC122254qz.SOUND_EFFECT.name())) {
                        nLETrack7.setExtra("biz_extra_type", "sound_effect");
                        Iterator<NLETrackSlot> it6 = nLETrack7.LJIILL().iterator();
                        while (it6.hasNext()) {
                            NLEResourceNode LIZIZ3 = it6.next().LJI().LIZIZ();
                            LIZIZ3.LJIIJ(C134305Ow.LIZIZ(nLETrack7.LJIILL().get(0).getExtra("slot_extra_music_id")));
                            LIZIZ3.setExtra("biz_res_id", LIZIZ3.LIZLLL());
                        }
                    } else if (o.LJ(extra, EnumC122254qz.ORIGIN.name())) {
                        nLETrack7.setExtra("biz_extra_type", "origin");
                    }
                    String extra2 = nLETrack7.getExtra("EffectTrackType");
                    if (o.LJ(extra2, "NORMAL")) {
                        nLETrack7.setExtra("biz_extra_type", "normal_effect");
                    } else if (o.LJ(extra2, "TIME")) {
                        nLETrack7.setExtra("biz_extra_type", "time_effect");
                    }
                    if (nLETrack7.hasExtra("RewindTrackType")) {
                        nLETrack7.setExtra("biz_extra_type", "reverse_effect");
                    }
                    NLETrackSlot nLETrackSlot4 = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack7.LJIILL());
                    if (nLETrackSlot4 != null) {
                        nLESegment = nLETrackSlot4.LJI();
                    } else {
                        nLESegment = null;
                    }
                    NLESegmentHDRFilter LJIIIIZZ = NLESegmentHDRFilter.LJIIIIZZ(nLESegment);
                    if (LJIIIIZZ != null) {
                        str2 = LJIIIIZZ.LJFF();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, NLEEditorJniJNI.NLEFilterName_getVIDEO_LENS_HDR())) {
                        nLETrack7.setExtra("biz_extra_type", "one_key_hdr");
                    } else if (o.LJ(str2, NLEEditorJniJNI.NLEFilterName_getLENS_HDR())) {
                        nLETrack7.setExtra("biz_extra_type", "lens_hdr");
                    }
                    Iterator<NLETrackSlot> it7 = nLETrack7.LJIILL().iterator();
                    while (it7.hasNext()) {
                        NLETrackSlot slot = it7.next();
                        o.LJIIIIZZ(slot, "slot");
                        if (o.LJ(nLETrack7.getExtra("biz_extra_type"), "sound_effect")) {
                            Iterator<SoundEffect> it8 = c132445Hs.LIZ.creativeModel.soundEffectInfoModel.soundEffectList.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    soundEffect = it8.next();
                                    if (o.LJ(soundEffect.fileLocalPath, slot.LJI().LIZIZ().LIZJ())) {
                                        break;
                                    }
                                } else {
                                    soundEffect = null;
                                    break;
                                }
                            }
                            SoundEffect soundEffect2 = soundEffect;
                            if (soundEffect2 != null) {
                                NLEResourceNode LIZIZ4 = slot.LJI().LIZIZ();
                                LIZIZ4.LJIIIZ("");
                                LIZIZ4.LJIIJ(C134305Ow.LIZIZ(String.valueOf(soundEffect2.id)));
                                LIZIZ4.setExtra("biz_res_id", LIZIZ4.LIZLLL());
                            }
                        }
                    }
                }
                VecNLEResourceNodeSPtr allResources = templateNLEModel.getAllResources();
                o.LJIIIIZZ(allResources, "templateNLEModel.allResources");
                Iterator<NLEResourceNode> it9 = allResources.iterator();
                while (it9.hasNext()) {
                    NLEResourceNode next3 = it9.next();
                    String extra3 = next3.getExtra("biz_res_id");
                    if (C78685UuP.LJJJZ(extra3)) {
                        next3.LJIIJ(extra3);
                    }
                }
                Iterator LIZJ3 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ3.hasNext()) {
                    NLETrack nLETrack8 = (NLETrack) LIZJ3.next();
                    if (nLETrack8.getChildren().size() == 0) {
                        templateNLEModel.removeTrack(nLETrack8);
                    }
                }
                Iterator LIZJ4 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ4.hasNext()) {
                    NLETrack nLETrack9 = (NLETrack) LIZJ4.next();
                    if (!c132445Hs.LIZJ.contains(nLETrack9.LJIIZILJ()) && !c132445Hs.LIZJ.contains(nLETrack9.LJII())) {
                        templateNLEModel.removeTrack(nLETrack9);
                    }
                }
                Iterator LIZJ5 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ5.hasNext()) {
                    NLETrack nLETrack10 = (NLETrack) LIZJ5.next();
                    if (nLETrack10.hasExtra("biz_extra_type") && !c132445Hs.LIZLLL.contains(nLETrack10.getExtra("biz_extra_type"))) {
                        templateNLEModel.removeTrack(nLETrack10);
                    }
                }
                Iterator LIZJ6 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ6.hasNext()) {
                    NLETrack nLETrack11 = (NLETrack) LIZJ6.next();
                    NLEFilter LJIIIIZZ2 = nLETrack11.LJIIIIZZ(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
                    if (LJIIIIZZ2 == null || (LIZIZ = LJIIIIZZ2.LIZIZ()) == null || (LJ = LIZIZ.LJ()) == null || (LIZLLL = LJ.LIZLLL()) == null || LIZLLL.length() == 0) {
                        nLETrack11.LJIJI(LJIIIIZZ2);
                    }
                }
                Iterator LIZJ7 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ7.hasNext()) {
                    NLETrack nLETrack12 = (NLETrack) LIZJ7.next();
                    if (nLETrack12.LJIIZILJ() == EnumC123864ta.STICKER) {
                        Iterator<NLETrackSlot> it10 = nLETrack12.LJIILL().iterator();
                        while (it10.hasNext()) {
                            NLETrackSlot next4 = it10.next();
                            if (NLESegmentInfoSticker.LJFF(next4.LJI()) != null && C78685UuP.LJJJZ(next4.LJI().LIZIZ().getExtra("biz_res_id"))) {
                                next4.LJIILIIL(null);
                            } else if (NLESegmentTextSticker.LJFF(next4.LJI()) == null) {
                                nLETrack12.LJIJJLI(next4);
                            }
                        }
                        if (nLETrack12.LJIILL().isEmpty()) {
                            templateNLEModel.removeTrack(nLETrack12);
                        }
                    }
                }
                Iterator LIZJ8 = t1.LIZJ(templateNLEModel, "templateNLEModel.tracks");
                while (LIZJ8.hasNext()) {
                    NLETrack nLETrack13 = (NLETrack) LIZJ8.next();
                    Iterator<NLEFilter> it11 = nLETrack13.LJIIIZ().iterator();
                    while (it11.hasNext()) {
                        NLEFilter next5 = it11.next();
                        List<String> list3 = c132445Hs.LJ;
                        NLESegmentFilter LIZIZ5 = next5.LIZIZ();
                        if (LIZIZ5 != null) {
                            str = LIZIZ5.LJFF();
                        } else {
                            str = null;
                        }
                        if (!ORZ.LJLJJI(str, list3)) {
                            nLETrack13.LJIJJ(next5.getName());
                        }
                    }
                }
                templateNLEModel.clearUnnecessaryExtraRecursively(c132445Hs.LJFF);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("end produceUgcTemplateNLEModel ");
                LIZ3.append(templateNLEModel.toJsonString());
                C5GW.LIZ(X1D.LIZIZ(LIZ3));
                return templateNLEModel;
            }
        }
    }

    public static final long LIZJ(NLEModel nLEModel) {
        return nLEModel.getMaxTargetEnd(new VecNLETrackType(new EnumC123864ta[]{EnumC123864ta.AUDIO, EnumC123864ta.STICKER, EnumC123864ta.FILTER})) / 1000;
    }

    public static final void LIZLLL(NLEResourceNode nLEResourceNode, CreativeInfo creativeInfo) {
        if (!C39579Fg7.LIZIZ(nLEResourceNode.LIZJ())) {
            return;
        }
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        EnumC43649HBd enumC43649HBd = EnumC43649HBd.AUDIO_RECORD;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append(".wav");
        String LIZLLL = C43073GvN.LIZLLL(LJ, creativeInfo, enumC43649HBd, X1D.LIZIZ(LIZ2), false, 8);
        int transCodeAudio = VEUtils.transCodeAudio(nLEResourceNode.LIZJ(), LIZLLL, -1, -1, -1, "pcm_s16le");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("UgcTemplateHelper replaceDubFileWithTranscodeAudio ret ");
        LIZ3.append(transCodeAudio);
        H78.LJI(X1D.LIZIZ(LIZ3));
        if (transCodeAudio == 0) {
            C39579Fg7.LJIL(nLEResourceNode.LIZJ());
            nLEResourceNode.LJIIIZ(LIZLLL);
        }
    }

    public static final String LIZIZ(NLEModel nLEModel, VideoPublishEditModel model, List<String> list, boolean z) {
        o.LJIIIZ(model, "model");
        String str = model.creativeModel.ugcTemplateData.ugcTemplateId;
        if (str == null) {
            str = "";
        }
        return C132475Hv.LIZ(str, EnumC43650HBe.UGC_TEMPLATE_ZIP, nLEModel, model, list, z);
    }
}

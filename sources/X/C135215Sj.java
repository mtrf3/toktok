package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import defpackage.g0;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135215Sj {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C5K0.LIZ(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C133765Mu LIZIZ(VideoPublishEditModel mModel, boolean z) {
        int i;
        int i2;
        VEPreviewParams vEPreviewParams;
        Object obj;
        Object obj2;
        Integer LJJIL;
        String str;
        boolean z2;
        char c;
        String[] reverseVideoArray;
        String str2;
        C5MG c5mg;
        String[] strArr;
        int i3;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<? extends VideoSegment> LJIILIIL;
        EditPostModel editPostModel;
        int i4;
        o.LJIIIZ(mModel, "mModel");
        if (mModel.isUploadVideo()) {
            i = C1XY.LJIILLIIL(mModel.videoFps(false));
        } else {
            i = 30;
        }
        int i5 = -1;
        if (H7R.LJJIL(mModel)) {
            i2 = C78929UyL.LJIIJ(mModel.canvasVideoData);
        } else {
            i2 = -1;
        }
        VEPreviewParams LJJJJLL = C78926UyI.LJJJJLL(mModel, 2, i, i2);
        if (mModel.nleData == null && (editPostModel = mModel.creativeModel.editPostModel) != null) {
            Integer valueOf = Integer.valueOf(editPostModel.getVideoCanvasWidth());
            if (valueOf != null) {
                if (valueOf.intValue() != -1) {
                    EditPostModel editPostModel2 = mModel.creativeModel.editPostModel;
                    if (editPostModel2 != null) {
                        i4 = editPostModel2.getVideoCanvasWidth();
                    } else {
                        i4 = -1;
                    }
                    LJJJJLL.mCanvasWidth = i4;
                    EditPostModel editPostModel3 = mModel.creativeModel.editPostModel;
                    if (editPostModel3 != null) {
                        i5 = editPostModel3.getVideoCanvasHeight();
                    }
                    LJJJJLL.mCanvasHeight = i5;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        final C135225Sk c135225Sk = new C135225Sk();
        C135235Sl c135235Sl = new C135235Sl();
        C135265So c135265So = C135265So.LJLIL;
        o.LJIIIZ(c135265So, "<set-?>");
        c135235Sl.LIZ = c135265So;
        c135235Sl.LJIIIIZZ = z;
        c135235Sl.LIZ(C135275Sp.LJLIL);
        c135235Sl.LJFF = C126234xP.LIZ();
        C5MG LIZ2 = C5K2.LIZ(mModel.getVideoEditorType(), c135235Sl);
        mModel.getVideoEditorType();
        String FILTER_INTENSITY_STORE_TAG = VideoEditContainerScene.LLJILJIL;
        o.LJIIIIZZ(FILTER_INTENSITY_STORE_TAG, "FILTER_INTENSITY_STORE_TAG");
        LIZ2.LJIILJJIL = WRY.LIZ(FILTER_INTENSITY_STORE_TAG);
        NLEEditor LJII = LIZ2.LJII(LJJJJLL);
        LJII.LIZIZ();
        LJII.LIZJ();
        String LJIIIIZZ = LJII.LJIIIIZZ();
        String str3 = null;
        LIZ2.LJJII(null, LJJJJLL, null, null);
        LIZ2.LJJIFFI(LJIIIIZZ, true);
        if ((LIZ2 instanceof C55C) && LJJJJLL.isMusicSyncMode && LJJJJLL.isVideoImageMixFastImport && (((i3 = LJJJJLL.mPageType) == 3 || i3 == 2) && (multiEditVideoStatusRecordData = LJJJJLL.recordData) != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (LJIILIIL = C46104I7o.LJIILIIL(multiEditVideoRecordData)) != null)) {
            C5KL c5kl = new C5KL();
            c5kl.LIZ = LIZ2.LJIJ();
            c5kl.LIZIZ = true;
            c5kl.LIZIZ(LJIILIIL);
        }
        c135225Sk.LJ = mModel;
        c135225Sk.LIZLLL = LIZ2;
        C133765Mu c133765Mu = (C133765Mu) LIZ2.LJJ();
        C122034qd editorPro = c133765Mu.LJI();
        C5MG c5mg2 = c135225Sk.LIZLLL;
        if (c5mg2 != null) {
            c5mg2.LJIIZILJ = 5;
        }
        int i6 = mModel.mVideoCanvasWidth;
        int i7 = mModel.mVideoCanvasHeight;
        if (mModel.notUseCanvasSize() && mModel.creativeModel.editPostModel == null) {
            LJJJJLL.mCanvasWidth = i6;
            LJJJJLL.mCanvasHeight = i7;
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        g0.LJJIL(mutableLiveData, LJJJJLL);
        c135225Sk.LIZ = mutableLiveData;
        ArrayList<EffectPointModel> arrayList = new ArrayList<>();
        C5MG c5mg3 = c135225Sk.LIZLLL;
        o.LJI(c5mg3);
        c5mg3.LJ = arrayList;
        MutableLiveData<IAudioEffectParam> mutableLiveData2 = new MutableLiveData<>();
        C5MG c5mg4 = c135225Sk.LIZLLL;
        if (c5mg4 != null) {
            c5mg4.LIZLLL = mutableLiveData2;
        }
        o.LJIIIZ(editorPro, "editorPro");
        MutableLiveData mutableLiveData3 = c135225Sk.LIZ;
        if (mutableLiveData3 != null) {
            vEPreviewParams = (VEPreviewParams) mutableLiveData3.getValue();
        } else {
            vEPreviewParams = null;
        }
        G8G.LIZ.step("av_video_edit", "VEEditor init start");
        C5RM.LIZ(vEPreviewParams);
        C5MG c5mg5 = c135225Sk.LIZLLL;
        o.LJI(c5mg5);
        c5mg5.LJJ = new C5MX() { // from class: X.5Sm
            @Override // X.C5MX
            public final void LIZ() {
                C135225Sk c135225Sk2 = C135225Sk.this;
                if (!c135225Sk2.LIZIZ) {
                    c135225Sk2.LIZIZ = true;
                    C170666ms.LIZIZ("receive prepare done event");
                    C135225Sk.this.LIZJ.postValue(null);
                }
            }
        };
        if (c135225Sk.LIZ().isMusic() == 1) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.isFastImport = c135225Sk.LIZ().isFastImport;
            vEPreviewMusicParams.pageType = 2;
            vEPreviewMusicParams.mPath = c135225Sk.LIZ().getMMusicPath();
            vEPreviewMusicParams.mInPoint = c135225Sk.LIZ().getMMusicStart();
            vEPreviewMusicParams.mDuration = HOH.LIZ(c135225Sk.LIZ().getCurMusicServerLength(), c135225Sk.LIZ().getMMusicPath());
            vEPreviewMusicParams.bgmDelay = c135225Sk.LIZ().recordBgmDelay;
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(c135225Sk.LIZ().creativeModel.musicBuzModel);
            if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0 && Math.abs(vEPreviewMusicParams.mDuration - extractAVMusic.getShootDuration()) >= 1000) {
                vEPreviewMusicParams.mShootDuration = extractAVMusic.getShootDuration();
            } else {
                vEPreviewMusicParams.mShootDuration = vEPreviewMusicParams.mDuration;
            }
            vEPreviewMusicParams.mVolume = c135225Sk.LIZ().musicVolume;
            vEPreviewMusicParams.musicId = c135225Sk.LIZ().getMusicId();
            if (extractAVMusic != null) {
                str3 = extractAVMusic.musicName;
            }
            vEPreviewMusicParams.musicName = str3;
            Float previewStartTime = c135225Sk.LIZ().getPreviewStartTime();
            o.LJIIIIZZ(previewStartTime, "mModel.previewStartTime");
            vEPreviewMusicParams.previewStartTime = previewStartTime.floatValue();
            Boolean isSoundLoop = c135225Sk.LIZ().getIsSoundLoop();
            o.LJIIIIZZ(isSoundLoop, "mModel.isSoundLoop");
            vEPreviewMusicParams.isSoundLoop = isSoundLoop.booleanValue();
            C5MG c5mg6 = c135225Sk.LIZLLL;
            o.LJI(c5mg6);
            c5mg6.LJIIJJI(vEPreviewMusicParams);
        }
        if (vEPreviewParams != null && ((c135225Sk.LIZLLL instanceof C132555Id) || (((strArr = vEPreviewParams.mAudioPaths) != null && strArr.length == 1) || vEPreviewParams.isFastImport || vEPreviewParams.isCutSameType))) {
            editorPro.LJFF().LIZJ(new C121744qA(vEPreviewParams.mVolume));
        }
        AudioRecorderParam audioRecorderParam = c135225Sk.LIZ().veAudioRecorderParam;
        if (audioRecorderParam != null && (c5mg = c135225Sk.LIZLLL) != null) {
            C166696gT.LIZ().getClass();
            c5mg.LIZ(audioRecorderParam, (C43523H6h) C169416kr.LJ.getValue());
        }
        C122144qo LJIILL = C78555UsJ.LJIILL(c135225Sk.LIZ(), false, 2);
        C5MG c5mg7 = c135225Sk.LIZLLL;
        if (c5mg7 != null) {
            c5mg7.LJ(LJIILL);
        }
        InfoStickerModel infoStickerModel = c135225Sk.LIZ().infoStickerModel;
        long j = 0;
        if (infoStickerModel != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            for (StickerItemModel model : infoStickerModel.stickers) {
                o.LJIIIIZZ(model, "model");
                if (!C1535160t.LIZIZ(model)) {
                    if (model.isTextSticker()) {
                        Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), model.extra, (Class<Object>) TextStickerData.class);
                        o.LJIIIIZZ(fromJson, "getAPI().getGson().fromJ…tStickerData::class.java)");
                        TextStickerData textStickerData = (TextStickerData) fromJson;
                        if (textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getAudioTrackFilePath())) {
                            C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                            c122004qa.LIZ = textStickerData.getAudioTrackFilePath();
                            c122004qa.LIZJ = j;
                            c122004qa.LIZLLL = textStickerData.getAudioTrackDuration();
                            c122004qa.LJ = textStickerData.getStartTime();
                            c122004qa.LJFF = -2L;
                            c122004qa.LJI = C138585cE.LIZ * 1.0f;
                            editorPro.LJFF().LJJ(c122004qa, true);
                            String str4 = c122004qa.LIZIZ;
                            if (str4 == null) {
                                str4 = "";
                            }
                            textStickerData.setNleUuid(str4);
                            model.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
                        }
                    } else if (C1535160t.LIZ(model)) {
                        C121594pv c121594pv = new C121594pv(0);
                        c121594pv.LJIIL = model.path;
                        c121594pv.LJ = model.currentOffsetX;
                        c121594pv.LJFF = model.currentOffsetY;
                        c121594pv.LJIILIIL = model.normalizedWidth;
                        c121594pv.LJIILJJIL = model.normalizedHeight;
                        c121594pv.LJIIIIZZ = model.scale;
                        c121594pv.LIZJ = model.startTime;
                        c121594pv.LIZLLL = model.endTime;
                        c121594pv.LIZIZ = model.layerWeight;
                        model.uuid = editorPro.LJIIIIZZ().LJJJJIZL(c121594pv);
                    }
                } else if (model.isImageSticker()) {
                    C121594pv c121594pv2 = new C121594pv(0);
                    c121594pv2.LJIIL = model.path;
                    c121594pv2.LJ = model.x;
                    c121594pv2.LJFF = model.y;
                    c121594pv2.LJIILIIL = model.w;
                    c121594pv2.LJIILJJIL = model.h;
                    if (model.isPin() && C44687HgJ.LIZIZ(model.pinAlgorithmFile)) {
                        c121594pv2.LJIIJJI = model.pinAlgorithmFile;
                    } else {
                        c121594pv2.LJI = -model.rotateAngle;
                        c121594pv2.LJIIIIZZ = model.scale;
                        c121594pv2.LJ = model.currentOffsetX;
                        c121594pv2.LJFF = model.currentOffsetY;
                    }
                    c121594pv2.LIZJ = model.startTime;
                    c121594pv2.LIZLLL = model.endTime;
                    c121594pv2.LIZIZ = model.layerWeight;
                    model.uuid = editorPro.LJIIIIZZ().LJJJJIZL(c121594pv2);
                } else {
                    String str5 = model.path;
                    o.LJIIIIZZ(str5, "model.path");
                    if (!C44687HgJ.LIZIZ(str5)) {
                        C82891Wg3.LIZLLL().LIZIZ(new Exception("infoSticker not exist in edit"));
                    } else {
                        C121514pn c121514pn = new C121514pn(0);
                        c121514pn.LJIIJJI = str5;
                        String[] strArr2 = new String[1];
                        if (TextUtils.isEmpty(model.extra)) {
                            str2 = "";
                        } else {
                            str2 = model.extra;
                        }
                        o.LJIIIIZZ(str2, "if (TextUtils.isEmpty(mo…tra)) \"\" else model.extra");
                        strArr2[0] = str2;
                        c121514pn.LJIIL = strArr2;
                        String LJIJI = editorPro.LJIIIIZZ().LJIJI(c121514pn);
                        model.uuid = LJIJI;
                        if (TextUtils.isEmpty(LJIJI)) {
                            C5NP LIZLLL = C82891Wg3.LIZLLL();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("restore infoSticker failed: ");
                            LIZ3.append(model.uuid);
                            LIZLLL.d(X1D.LIZIZ(LIZ3));
                        } else {
                            C5WG LJIIIIZZ2 = editorPro.LJIIIIZZ();
                            String str6 = model.uuid;
                            o.LJIIIIZZ(str6, "model.uuid");
                            C122024qc LJJJJLI = LJIIIIZZ2.LJJJJLI(str6);
                            if (model.isPin() && C44687HgJ.LIZIZ(model.pinAlgorithmFile)) {
                                if (LJJJJLI instanceof C121514pn) {
                                    ((C121514pn) LJJJJLI).LJIJ = model.pinAlgorithmFile;
                                } else if (LJJJJLI instanceof C121594pv) {
                                    ((C121594pv) LJJJJLI).LJIIJJI = model.pinAlgorithmFile;
                                }
                                if (LJJJJLI == null) {
                                }
                                LJJJJLI.LIZJ = model.startTime;
                                LJJJJLI.LIZLLL = model.endTime;
                                LJJJJLI.LIZIZ = model.layerWeight;
                                editorPro.LJIIIIZZ().LJIIJ(LJJJJLI);
                            } else if (LJJJJLI != null) {
                                LJJJJLI.LJI = -model.rotateAngle;
                                LJJJJLI.LJIIIIZZ = model.scale;
                                LJJJJLI.LJ = model.currentOffsetX;
                                LJJJJLI.LJFF = model.currentOffsetY;
                                LJJJJLI.LIZJ = model.startTime;
                                LJJJJLI.LIZLLL = model.endTime;
                                LJJJJLI.LIZIZ = model.layerWeight;
                                editorPro.LJIIIIZZ().LJIIJ(LJJJJLI);
                            }
                        }
                    }
                }
                j = 0;
            }
        }
        Iterator<TextStickerModel> it = c135225Sk.LIZ().creativeModel.stickerModel.textStickerModels.iterator();
        while (it.hasNext()) {
            TTSModel ttsModel = it.next().getTtsModel();
            if (ttsModel != null && ttsModel.hasReadTextAudio && !TextUtils.isEmpty(ttsModel.audioTrackFilePath)) {
                C122004qa c122004qa2 = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                c122004qa2.LIZ = ttsModel.audioTrackFilePath;
                c122004qa2.LIZJ = 0L;
                c122004qa2.LIZLLL = ttsModel.audioTrackDuration;
                c122004qa2.LJ = r11.getBaseStickerModel().getStartTime();
                c122004qa2.LJFF = -2L;
                c122004qa2.LJI = C138585cE.LIZ * 1.0f;
                editorPro.LJFF().LJJ(c122004qa2, true);
                String str7 = c122004qa2.LIZIZ;
                if (str7 == null) {
                    str7 = "";
                }
                ttsModel.nleUuid = str7;
            }
        }
        AudioEffectParam audioEffectParam = c135225Sk.LIZ().veAudioEffectParam;
        if (audioEffectParam != null) {
            C5PF LIZ4 = C135285Sq.LIZ(false, audioEffectParam);
            C5MG c5mg8 = c135225Sk.LIZLLL;
            if (c5mg8 != null) {
                c5mg8.LJIIIIZZ(LIZ4);
            }
        }
        EffectPointModel timeEffect = mModel.getTimeEffect();
        if (timeEffect != null) {
            if (o.LJ(timeEffect.getKey(), "1")) {
                editorPro.LIZ();
                String[] reverseAudioArray = mModel.getPreviewInfo().getReverseAudioArray();
                if (reverseAudioArray != null) {
                    z2 = true;
                    if (reverseAudioArray.length == 1) {
                        c = 0;
                        editorPro.LIZLLL().LJIJJLI(reverseAudioArray[0]);
                        reverseVideoArray = mModel.getPreviewInfo().getReverseVideoArray();
                        if (reverseVideoArray != null && reverseVideoArray.length == z2) {
                            editorPro.LIZLLL().LJJII(reverseVideoArray[c]);
                        }
                        editorPro.LIZIZ();
                        editorPro.LIZLLL().LJIILJJIL(z2);
                        if (!mModel.isFastImport || mModel.isCutSameVideoType() || H7R.LJIL(mModel)) {
                            editorPro.LJFF().LIZJ(new C121744qA(LJJJJLL.mVolume));
                        }
                    }
                } else {
                    z2 = true;
                }
                c = 0;
                reverseVideoArray = mModel.getPreviewInfo().getReverseVideoArray();
                if (reverseVideoArray != null) {
                    editorPro.LIZLLL().LJJII(reverseVideoArray[c]);
                }
                editorPro.LIZIZ();
                editorPro.LIZLLL().LJIILJJIL(z2);
                if (!mModel.isFastImport) {
                }
                editorPro.LJFF().LIZJ(new C121744qA(LJJJJLL.mVolume));
            } else {
                C5MG c5mg9 = c135225Sk.LIZLLL;
                o.LJI(c5mg9);
                C5RV LJFF = C169816lV.LJFF(c5mg9.LJIJJ(), mModel);
                if (LJFF != null) {
                    LIZ2.LJIILJJIL(null, LJFF, editorPro.LIZLLL());
                }
            }
        }
        EffectPointModel effectPointModel = (EffectPointModel) ORZ.LJLLLL(C42000Ge4.LJIIIIZZ(mModel));
        ArrayList<EffectPointModel> effectList = mModel.getEffectList();
        o.LJIIIIZZ(effectList, "mModel.effectList");
        ArrayList arrayList2 = new ArrayList();
        Iterator<EffectPointModel> it2 = effectList.iterator();
        while (it2.hasNext()) {
            EffectPointModel next = it2.next();
            String key = next.getKey();
            if (effectPointModel != null) {
                str = effectPointModel.getKey();
            } else {
                str = null;
            }
            if (!o.LJ(key, str)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            obj = null;
            C63081OpJ.LLIZ(arrayList2, null, new C133725Mq(LIZ2, editorPro), Boolean.valueOf(mModel.isReverse()), true);
        } else {
            obj = null;
        }
        InterfaceC82236WPg LJI = C60903NvH.LJIIJJI().LJIILL().LJI();
        WPX getAvailableFilterByIdOrResId = LJI.LJJJJIZL();
        boolean z3 = false;
        C82232WPc.LIZ(LJI, false, 2);
        String str8 = mModel.mSelectedFilterId;
        String str9 = mModel.mSelectedFilterResId;
        o.LJIIIZ(getAvailableFilterByIdOrResId, "$this$getAvailableFilterByIdOrResId");
        List list = (List) getAvailableFilterByIdOrResId.LIZJ().getValue();
        if (list != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    FilterBean filterBean = (FilterBean) obj2;
                    if (o.LJ(filterBean.getResId(), str9)) {
                        break;
                    }
                    int id = filterBean.getId();
                    if (str8 != null && (LJJIL = C38350F3i.LJJIL(str8)) != null && id == LJJIL.intValue()) {
                        break;
                    }
                } else {
                    obj2 = obj;
                    break;
                }
            }
            FilterBean filterBean2 = (FilterBean) obj2;
            if (filterBean2 != null) {
                if (mModel.mSelectedFilterIntensity == -1.0f) {
                    z3 = true;
                }
                float f = 0.8f;
                if (!z3) {
                    C5MG c5mg10 = c135225Sk.LIZLLL;
                    o.LJI(c5mg10);
                    float f2 = mModel.mSelectedFilterIntensity;
                    if (f2 != -1.0f) {
                        f = f2;
                    }
                    c5mg10.LJJIIZ(f, filterBean2, true);
                } else {
                    C5MG c5mg11 = c135225Sk.LIZLLL;
                    o.LJI(c5mg11);
                    float LIZJ = TML.LIZJ(filterBean2, c5mg11.LJIIZILJ(), c5mg11.LJIILL);
                    if (LIZJ != -1.0f) {
                        f = LIZJ;
                    }
                    c5mg11.LJJIIZ(f, filterBean2, true);
                }
            }
        }
        editorPro.LJIIJ.LIZIZ();
        return c133765Mu;
    }

    public static void LIZ(String str, C122034qd c122034qd, VEAudioSamiFilterParam vEAudioSamiFilterParam) {
        C121634pz c121634pz = new C121634pz(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
        c121634pz.LIZ = str;
        c121634pz.LJIILIIL = vEAudioSamiFilterParam.samiModelPath;
        c121634pz.LJIILJJIL = vEAudioSamiFilterParam.samiParam;
        c121634pz.LJIIL = Integer.valueOf(vEAudioSamiFilterParam.samiType);
        c122034qd.LJFF().LJJJ(str, c121634pz);
    }
}

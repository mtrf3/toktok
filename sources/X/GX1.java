package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.a1;
import defpackage.b1;
import defpackage.e1;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GX1 implements InterfaceC41417GNh {
    @Override // X.InterfaceC41417GNh
    public final C43068GvI LIZLLL() {
        C43068GvI c43068GvI = new C43068GvI(C60332Yj.LJLIL);
        List<AwemeDraft> queryDraftList = queryDraftList(new GPJ(false, false, GPH.ALL, null, 23));
        ArrayList arrayList = new ArrayList(C32I.LJJL(queryDraftList, 10));
        Iterator it = ((ArrayList) queryDraftList).iterator();
        while (it.hasNext()) {
            arrayList.add(C62850Ola.LJ().LJFF(((AwemeDraft) it.next()).LIZIZ()));
        }
        c43068GvI.addAll(arrayList);
        c43068GvI.add(C60903NvH.LJIIJJI().LJJIJL().getPathService().LJFF(HB7.LIZ));
        return c43068GvI;
    }

    @Override // X.InterfaceC41417GNh
    public final boolean LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        C34K c34k = new C34K();
        StringBuilder LIZIZ = C25620zW.LIZIZ("SELECT count(video_path) FROM local_draft WHERE published_aweme_id = ", aid, " and ");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is_published = 1 and published_time > ");
        LIZ.append(System.currentTimeMillis() - 259200000);
        LIZIZ.append(X1D.LIZIZ(LIZ));
        GPD.LJFF(X1D.LIZIZ(LIZIZ), new AqS173S0100000_7(c34k, 397));
        return c34k.element;
    }

    @Override // X.InterfaceC41417GNh
    public final C43068GvI LIZIZ(AwemeDraft draft) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        ArrayList<TimeSpeedModelExtension> LJIIJJI;
        List<String> list;
        String stickerId;
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str;
        List<InnerEffectTextConfig> textConfigs;
        String second;
        EffectTextModel effectTextModel2;
        StickerItemModel textSticker2;
        String str2;
        String str3;
        List<StickerItemModel> list2;
        ArrayList<MvNetFileBean> arrayList2;
        String str4;
        String str5;
        ArrayList<String> arrayList3;
        String str6;
        IFilterService filterService;
        FilterBean filter;
        String filterFolder;
        IFilterService filterService2;
        FilterBean filter2;
        String filterFolder2;
        String str7;
        List<StickerItemModel> list3;
        o.LJIIIZ(draft, "draft");
        C43068GvI c43068GvI = new C43068GvI(C60282Ye.LJLIL);
        HashSet hashSet = new HashSet();
        C43068GvI c43068GvI2 = new C43068GvI(C60262Yc.LJLIL);
        c43068GvI2.addAll(C78999UzT.LJIJJLI(draft.LJJJJI, AVDraftExtras.class, InterfaceC43620HAa.class));
        c43068GvI2.addAll(C78999UzT.LJIJJLI(draft.LIZ, CreativeModel.class, InterfaceC43620HAa.class));
        InfoStickerModel LJI = draft.LJI();
        if (LJI != null && (list3 = LJI.stickers) != null) {
            for (StickerItemModel stickerItemModel : list3) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class);
                    if (textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getAudioTrackFilePath())) {
                        String audioTrackFilePath = textStickerData.getAudioTrackFilePath();
                        o.LJI(audioTrackFilePath);
                        c43068GvI2.add(audioTrackFilePath);
                    }
                }
            }
        }
        Iterator<TextStickerModel> it = draft.LIZ.stickerModel.textStickerModels.iterator();
        while (it.hasNext()) {
            TTSModel ttsModel = it.next().getTtsModel();
            if (ttsModel != null && ttsModel.hasReadTextAudio && (str7 = ttsModel.audioTrackFilePath) != null) {
                c43068GvI2.add(str7);
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = draft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null) {
            c43068GvI2.addAll(C78999UzT.LJIJI(multiEditVideoStatusRecordData));
        }
        hashSet.addAll(c43068GvI2);
        C43068GvI c43068GvI3 = new C43068GvI(C60322Yi.LJLIL);
        c43068GvI3.addAll(C78999UzT.LJIJJLI(draft.LJJJJI, AVDraftExtras.class, InterfaceC36436ERs.class));
        c43068GvI3.addAll(C78999UzT.LJIJJLI(draft.LIZ, CreativeModel.class, InterfaceC36436ERs.class));
        if (draft.LJIIL != 0 && (filterService2 = AVServiceImpl.LIZ().getFilterService()) != null && (filter2 = filterService2.getFilter(draft.LJIIL)) != null && (filterFolder2 = filter2.getFilterFolder()) != null) {
            c43068GvI3.add(filterFolder2);
        }
        String str8 = draft.LJI;
        if (str8 != null && str8.length() > 0) {
            c43068GvI3.add(str8);
        }
        hashSet.addAll(c43068GvI3);
        C43068GvI c43068GvI4 = new C43068GvI(C60312Yh.LJLIL);
        c43068GvI4.addAll(C78999UzT.LJIJJLI(draft.LJJJJI, AVDraftExtras.class, GX2.class));
        c43068GvI4.addAll(C78999UzT.LJIJJLI(draft.LIZ, CreativeModel.class, GX2.class));
        hashSet.addAll(c43068GvI4);
        c43068GvI.addAll(hashSet);
        C43068GvI c43068GvI5 = new C43068GvI(C60292Yf.LJLIL);
        c43068GvI5.add(GXW.LIZ(draft));
        String str9 = draft.LJJJJI.draftVideoPath;
        if (str9 != null) {
            c43068GvI5.add(str9);
        }
        if (draft.LJIIL != 0 && (filterService = AVServiceImpl.LIZ().getFilterService()) != null && (filter = filterService.getFilter(draft.LJIIL)) != null && (filterFolder = filter.getFilterFolder()) != null) {
            c43068GvI5.add(filterFolder);
        }
        String str10 = draft.LJJJJI.filterLocalPath;
        if (str10 != null) {
            c43068GvI5.add(str10);
        }
        DraftVEAudioEffectParam LIZLLL = draft.LIZLLL();
        if (LIZLLL != null && (str6 = LIZLLL.effectPath) != null) {
            c43068GvI5.add(str6);
        }
        String str11 = draft.LJI;
        if (str11 != null && str11.length() > 0) {
            c43068GvI5.add(str11);
        }
        List<EffectPointModel> LJ = draft.LJ();
        if (LJ != null) {
            Iterator it2 = ((ArrayList) ORZ.LJLL(LJ)).iterator();
            while (it2.hasNext()) {
                String resDir = ((EffectPointModel) it2.next()).getResDir();
                if (resDir != null) {
                    c43068GvI5.add(resDir);
                }
            }
        }
        String str12 = draft.LJJJJI.videoCoverPath;
        if (str12 != null) {
            c43068GvI5.add(str12);
        }
        MvCreateVideoData mvCreateVideoData = draft.LJJJJI.mvCreateVideoData;
        if (mvCreateVideoData != null && (arrayList3 = mvCreateVideoData.selectMediaList) != null) {
            Iterator it3 = ((ArrayList) ORZ.LJLL(arrayList3)).iterator();
            while (it3.hasNext()) {
                c43068GvI5.add(it3.next());
            }
        }
        MvCreateVideoData mvCreateVideoData2 = draft.LJJJJI.mvCreateVideoData;
        if (mvCreateVideoData2 != null && (str5 = mvCreateVideoData2.videoCoverImgPath) != null) {
            c43068GvI5.add(str5);
        }
        MvCreateVideoData mvCreateVideoData3 = draft.LJJJJI.mvCreateVideoData;
        if (mvCreateVideoData3 != null && (str4 = mvCreateVideoData3.mvResUnzipPath) != null && str4.length() != 0) {
            String absolutePath = new File(mvCreateVideoData3.mvResUnzipPath).getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "File(it.mvResUnzipPath).absolutePath");
            c43068GvI5.add(absolutePath);
        }
        MvCreateVideoData mvCreateVideoData4 = draft.LJJJJI.mvCreateVideoData;
        if (mvCreateVideoData4 != null && (arrayList2 = mvCreateVideoData4.newMaskFileData) != null) {
            Iterator<MvNetFileBean> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                c43068GvI5.add(it4.next().getFilePath());
            }
        }
        HashSet hashSet2 = new HashSet();
        EditPreviewInfo LIZLLL2 = C41802Gas.LIZLLL(draft, false);
        if (LIZLLL2 != null) {
            String draftDir = LIZLLL2.getDraftDir();
            if (draftDir.length() > 0) {
                hashSet2.add(draftDir);
            }
            for (EditVideoSegment editVideoSegment : LIZLLL2.getVideoList()) {
                String videoPath = editVideoSegment.getVideoPath();
                if (C44687HgJ.LIZIZ(videoPath) && videoPath != null) {
                    hashSet2.add(videoPath);
                    String LIZJ = C38352F3k.LIZJ(videoPath);
                    if (LIZJ != null && LIZJ.length() == 0) {
                        hashSet2.add(LIZJ);
                    }
                }
                String audioPath = editVideoSegment.getAudioPath();
                if (audioPath != null && audioPath.length() != 0) {
                    hashSet2.add(audioPath);
                }
            }
            String[] reverseVideoArray = LIZLLL2.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str13 : reverseVideoArray) {
                    if (str13.length() > 0) {
                        hashSet2.add(str13);
                    }
                }
            }
            String[] reverseAudioArray = LIZLLL2.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str14 : reverseAudioArray) {
                    if (str14.length() > 0) {
                        hashSet2.add(str14);
                    }
                }
            }
            String[] tempVideoArray = LIZLLL2.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str15 : tempVideoArray) {
                    if (str15.length() > 0) {
                        hashSet2.add(str15);
                    }
                }
            }
        }
        c43068GvI5.addAll(hashSet2);
        InfoStickerModel LJI2 = draft.LJI();
        if (LJI2 != null && (list2 = LJI2.stickers) != null) {
            for (StickerItemModel stickerItemModel2 : list2) {
                if (stickerItemModel2 != null) {
                    String str16 = stickerItemModel2.path;
                    if (str16 != null && str16.length() > 0) {
                        c43068GvI5.add(str16);
                    }
                    if (stickerItemModel2.isTextSticker()) {
                        SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel2.extra, SimpleTextStickerData.class);
                        if (simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getAudioTrackFilePath())) {
                            String audioTrackFilePath2 = simpleTextStickerData.getAudioTrackFilePath();
                            o.LJI(audioTrackFilePath2);
                            c43068GvI5.add(audioTrackFilePath2);
                        }
                    }
                }
            }
        }
        Iterator<TextStickerModel> it5 = draft.LIZ.stickerModel.textStickerModels.iterator();
        while (it5.hasNext()) {
            TTSModel ttsModel2 = it5.next().getTtsModel();
            if (ttsModel2 != null && ttsModel2.hasReadTextAudio && (str3 = ttsModel2.audioTrackFilePath) != null) {
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str3.charAt(i);
                    if (!c43068GvI5.isEmpty()) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "filterTo(StringBuilder(), predicate).toString()");
                c43068GvI5.add(sb2);
            }
        }
        CoverPublishModel coverPublishModel2 = draft.LJJJJI.coverPublishModel;
        if (coverPublishModel2 != null && (effectTextModel2 = coverPublishModel2.getEffectTextModel()) != null && (textSticker2 = effectTextModel2.getTextSticker()) != null && (str2 = textSticker2.path) != null && str2.length() > 0) {
            c43068GvI5.add(str2);
        }
        if (e1.LIZ(31744, "studio_fix_recover_publish_cover_effect", true, false) && (coverPublishModel = draft.LJJJJI.coverPublishModel) != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && (str = textSticker.extra) != null) {
            try {
                InnerEffectTextLayoutConfig effectTextLayoutConfig = ((TextStickerData) C60903NvH.LJIIJJI().LIZ().LJI(str, TextStickerData.class)).getEffectTextLayoutConfig();
                if (effectTextLayoutConfig != null && (textConfigs = effectTextLayoutConfig.getTextConfigs()) != null) {
                    for (InnerEffectTextConfig innerEffectTextConfig : textConfigs) {
                        List<InnerEffectTextBgConfig> bgConfigs = innerEffectTextConfig.getBgConfigs();
                        ArrayList arrayList4 = new ArrayList();
                        for (InnerEffectTextBgConfig innerEffectTextBgConfig : bgConfigs) {
                            if (innerEffectTextBgConfig.getBgName().length() > 0) {
                                arrayList4.add(innerEffectTextBgConfig);
                            }
                        }
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            c43068GvI5.add(((InnerEffectTextBgConfig) it6.next()).getBgName());
                        }
                        OSZ<String, String> typefacePath = innerEffectTextConfig.getTypefacePath();
                        if (typefacePath != null && (second = typefacePath.getSecond()) != null && second.length() != 0) {
                            c43068GvI5.add(second);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = draft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData2 != null) {
            arrayList = multiEditVideoStatusRecordData2.editCutSegments;
        } else {
            arrayList = null;
        }
        if (C32151Nz.LJJIIZI(arrayList)) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = draft.LJJJJI.multiEditVideoData;
            if (multiEditVideoStatusRecordData3 != null) {
                LJIIJJI = multiEditVideoStatusRecordData3.editCutSegments;
            }
            c43068GvI.addAll(c43068GvI5);
            return c43068GvI;
        }
        LJIIJJI = CameraComponentModel.LJIIJJI(draft.LJJIIJZLJL);
        if (LJIIJJI != null) {
            Iterator<TimeSpeedModelExtension> it7 = LJIIJJI.iterator();
            while (it7.hasNext()) {
                TimeSpeedModelExtension next = it7.next();
                SavePhotoStickerInfo savePhotoStickerInfo = next.getSavePhotoStickerInfo();
                if (savePhotoStickerInfo != null) {
                    list = savePhotoStickerInfo.getCapturedPhotoPaths();
                } else {
                    list = null;
                }
                if (!C77413UZt.LJIILL(list) && (stickerId = next.getStickerId()) != null) {
                    String LIZJ2 = C173786ru.LIZJ(stickerId);
                    if (!TextUtils.isEmpty(LIZJ2)) {
                        c43068GvI5.add(LIZJ2);
                    }
                }
            }
        }
        c43068GvI.addAll(c43068GvI5);
        return c43068GvI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC41417GNh
    public final AwemeDraft LIZJ(String aid) {
        o.LJIIIZ(aid, "aid");
        C68322mC c68322mC = new C68322mC();
        GPD.LJFF(i0.LJFF("SELECT * FROM local_draft WHERE published_aweme_id = ", aid), new AqS173S0100000_7(c68322mC, (C68322mC<AwemeDraft>) 398));
        return (AwemeDraft) c68322mC.element;
    }

    @Override // X.InterfaceC41417GNh
    public final AwemeDraft LJ(C41363GLf c41363GLf) {
        return GPD.LIZJ(new GPE(c41363GLf.LJLIL, c41363GLf.LJLILLLLZI));
    }

    @Override // X.InterfaceC41417GNh
    public final boolean LJFF(C41363GLf c41363GLf) {
        GPE gpe = new GPE(c41363GLf.LJLIL, c41363GLf.LJLILLLLZI);
        C76732zl c76732zl = new C76732zl();
        GPE gpe2 = new GPE(gpe.LJLIL, gpe.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" where video_path = '");
        LIZ.append(gpe2.LJLIL.getCreationId());
        LIZ.append('\'');
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (gpe2.LJLILLLLZI) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, " and user_id = '");
            LIZJ.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            LIZJ.append('\'');
            LIZIZ = X1D.LIZIZ(LIZJ);
        }
        GPD.LJFF(a1.LJ("select exists(select 1 from local_draft", LIZIZ, " )"), new AqS173S0100000_7(c76732zl, 393));
        if (c76732zl.element > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC41417GNh
    public final List<String> LJI(GPK params) {
        o.LJIIIZ(params, "params");
        GPG gpg = new GPG(null, null, null, params.LJLIL, params.LJLJI, null, 39);
        ArrayList arrayList = new ArrayList();
        List<String> LIZJ = GPF.LIZJ(gpg);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select draft_extras from local_draft");
        LIZ.append(GPF.LIZLLL(gpg, LIZJ));
        GPD.LJFF(X1D.LIZIZ(LIZ), new AqS173S0100000_7(arrayList, (List<AutoCutThemeData>) 401));
        return arrayList;
    }

    @Override // X.InterfaceC41417GNh
    public final List<AwemeDraft> queryDraftList(GPJ params) {
        List list;
        o.LJIIIZ(params, "params");
        boolean z = params.LIZ;
        if (params.LIZIZ) {
            list = GPF.LJ();
        } else {
            list = C61878OQg.INSTANCE;
        }
        return GPD.LJ(new GPG(null, null, list, z, params.LIZJ, params.LIZLLL, 3), params.LJ);
    }

    @Override // X.InterfaceC41417GNh
    public final C26336AVg queryDraftsInfo(GPK params) {
        EnumC41422GNm enumC41422GNm;
        o.LJIIIZ(params, "params");
        AwemeDraft awemeDraft = null;
        int LIZLLL = GPD.LIZLLL(new GPG(null, null, null, params.LJLIL, params.LJLJI, null, 39));
        if (!params.LJLILLLLZI) {
            if (GNP.LIZ()) {
                enumC41422GNm = EnumC41422GNm.FIRST_SAVE_TIME;
            } else {
                enumC41422GNm = EnumC41422GNm.LAST_SAVE_TIME;
            }
            awemeDraft = (AwemeDraft) ORZ.LJLLLL(GPD.LJ(new GPG(enumC41422GNm, new C41421GNl(0, 1), null, params.LJLIL, params.LJLJI, null, 36), null));
        }
        return new C26336AVg(LIZLLL, awemeDraft);
    }
}

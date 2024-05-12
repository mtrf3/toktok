package X;

import Y.IDComparatorS30S0000000_2;
import Y.IDComparatorS35S0000000_7;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.question.ForumInfo;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H7D {
    public final List<CreateAnchorInfo> LIZ = new ArrayList();
    public final java.util.Set<String> LIZIZ = new HashSet();
    public final Keva LIZJ = Keva.getRepo("allow_show_keva_repo");

    public static String LJIIIZ() {
        ArrayList LIZIZ = C05040Hs.LIZIZ("default");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(LJII(LIZIZ));
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(207:1|(1:3)|4|(1:9)|10|(1:14)|15|(4:17|(2:20|18)|21|22)|23|(2:636|(2:638|(1:642))(2:643|(2:645|(1:649))(2:650|(2:652|(1:656))(4:657|(1:659)|660|(1:662)))))(1:27)|28|(4:30|(1:32)(2:621|(3:631|(1:634)|633)(3:627|(1:630)|629))|33|(2:37|(1:42)(1:41)))(1:635)|43|(1:49)|50|(1:52)|53|(1:55)|56|(1:58)(1:620)|59|(1:61)(1:619)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(4:82|(1:84)|85|(1:87))(2:616|(1:618))|88|(3:90|(1:92)|93)|94|(3:96|(3:99|(2:101|102)(1:613)|97)|614)|615|103|(1:105)|106|(1:108)|109|(1:612)|115|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)(1:611)|135|(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147|(8:151|(1:153)|154|(1:156)|157|(1:159)|160|(1:162))|163|(1:165)|166|(1:168)|169|(1:173)|174|(1:176)|177|(13:582|583|584|(4:603|604|606|607)|586|587|(1:589)|590|591|592|(1:594)|595|(1:597))|179|(1:181)|182|(1:184)|185|(1:187)|188|(1:190)|191|(4:193|(6:196|197|198|200|201|194)|205|206)|207|(1:209)|210|(1:212)|213|(1:215)|216|(1:218)(1:581)|219|(1:580)|221|(1:225)|226|(10:552|(1:554)|555|(4:558|(2:560|(2:562|563)(1:565))(1:566)|564|556)|567|568|(2:570|(1:572))|573|(1:575)(1:577)|576)(2:230|(2:232|(1:234)))|235|(1:237)|238|(1:240)|241|(2:243|(1:245))|246|(4:248|(1:252)|253|(1:255))|256|(1:258)|259|(3:261|(1:263)|264)|265|(1:551)(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)(2:548|(1:550))|285|(2:287|(1:289)(1:290))|291|(1:293)|294|(1:296)(1:547)|297|(1:299)|300|(1:302)|303|(1:305)(1:546)|306|(1:308)|309|(1:311)|312|(2:542|(1:544)(1:545))|316|(3:318|(1:320)|321)|322|(5:528|529|(1:535)|536|(1:538))|324|(2:523|524)|326|(3:517|(1:521)|522)(1:334)|335|(2:337|(53:339|(1:515)|343|(1:514)|347|348|(1:350)(1:513)|351|(1:512)|353|(1:511)|355|(1:357)(1:510)|358|(1:360)(1:509)|361|(1:363)|364|(1:366)|367|(1:369)|370|(1:372)(1:508)|373|(1:507)(1:377)|378|(1:380)|381|(1:383)(1:506)|384|(1:386)(1:505)|387|(1:389)(1:504)|390|(2:495|(1:503))(1:402)|403|(2:405|(2:406|(1:422)(2:408|(1:419)(2:416|417))))(0)|423|(1:425)(1:494)|426|(1:430)|431|(1:433)(1:493)|434|(9:436|437|438|(1:440)(1:451)|441|(1:443)|444|(1:446)(1:(1:450))|447)|454|(5:456|(4:459|(3:464|465|466)|467|457)|470|471|(1:473))|474|(1:476)(1:492)|477|478|479|(6:481|482|483|(1:488)|485|486)(5:489|483|(0)|485|486)))|516|348|(0)(0)|351|(0)|353|(0)|355|(0)(0)|358|(0)(0)|361|(0)|364|(0)|367|(0)|370|(0)(0)|373|(1:375)|507|378|(0)|381|(0)(0)|384|(0)(0)|387|(0)(0)|390|(1:392)|495|(4:497|499|501|503)|403|(0)(0)|423|(0)(0)|426|(2:428|430)|431|(0)(0)|434|(0)|454|(0)|474|(0)(0)|477|478|479|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0dfa  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0e08  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0e23  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0e53  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0e88  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0eb4  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0fb7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x102c  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x104f  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x102d A[Catch: Exception -> 0x1032, TRY_LEAVE, TryCatch #6 {Exception -> 0x1032, blocks: (B:479:0x101e, B:489:0x102d), top: B:478:0x101e }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x101b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0eef  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0f0f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0f1d  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0f33  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0f3b  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0f42  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0c81 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0c39 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0919  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r20, java.util.LinkedHashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 4178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7D.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    public static String LJII(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            }
        }
        return sb.toString();
    }

    public static boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || "single_song".equals(videoPublishEditModel.mShootWay) || "prop_page".equals(videoPublishEditModel.mShootWay) || "mv_page".equals(videoPublishEditModel.mShootWay) || "click_internal_entrance".equals(videoPublishEditModel.mShootWay) || "prop_reuse".equals(videoPublishEditModel.mShootWay) || "mv_reuse".equals(videoPublishEditModel.mShootWay)) {
            return true;
        }
        return false;
    }

    public static String LJIIJ(CreativeModel creativeModel) {
        ECommerceCreativeVideoParams eCommerceCreativeVideoParams;
        if (creativeModel == null || (eCommerceCreativeVideoParams = creativeModel.initialModel.creativeVideoParams) == null) {
            return null;
        }
        return eCommerceCreativeVideoParams.musicId;
    }

    public static String LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = videoPublishEditModel.uploadMiscInfoStruct;
        if (aVUploadMiscInfoStruct == null) {
            return "";
        }
        return aVUploadMiscInfoStruct.mvThemeId;
    }

    public static String LJIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getTextStickerDataList() == null || videoPublishEditModel.getTextStickerDataList().isEmpty()) {
            return "";
        }
        C48283IxD c48283IxD = new C48283IxD();
        for (SimpleTextStickerData simpleTextStickerData : videoPublishEditModel.getTextStickerDataList()) {
            if (simpleTextStickerData.isCreatorVoice()) {
                c48283IxD.add(simpleTextStickerData.getVoiceCreatorUserId());
            }
        }
        String LJII = LJII(new ArrayList(c48283IxD));
        if (LJII.isEmpty()) {
            return LJII;
        }
        return a1.LJ("[", LJII, "]");
    }

    public static String LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        String LJII = LJII(videoPublishEditModel.creativeModel.voiceConversionModel.vcCreatorIDs);
        if (LJII.isEmpty()) {
            return LJII;
        }
        return a1.LJ("[", LJII, "]");
    }

    public static String LJIILJJIL(ArrayList arrayList) {
        if (arrayList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            }
        }
        return sb.toString();
    }

    public static void LJIILL(List list) {
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptionStruct captionStruct = ((InteractStickerStruct) it.next()).getCaptionStruct();
            if (captionStruct != null) {
                captionStruct.setVideoWidth(null);
                captionStruct.setMarginStart(null);
                captionStruct.setMarginTop(null);
                captionStruct.setMarginBottom(null);
            }
        }
    }

    public static void LJIJI(Collection collection) {
        if (C79004UzY.LJJIFFI(collection)) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 10 && interactStickerStruct.getCountDownStickerStruct() != null && interactStickerStruct.getCountDownStickerStruct().getExpiredTime() != null) {
                interactStickerStruct.getCountDownStickerStruct().setExpiredTime(Long.valueOf(interactStickerStruct.getCountDownStickerStruct().getExpiredTime().longValue() / 1000));
            }
        }
    }

    public static void LJIJJ(List list) {
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 22) {
                interactStickerStruct.getPoiStickerStruct().setPoiData(null);
                return;
            }
        }
    }

    public static void LJIJJLI(Collection collection) {
        if (C79004UzY.LJJIFFI(collection)) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 8 && interactStickerStruct.getMentionInfo() != null && !TextUtils.isEmpty(interactStickerStruct.getMentionInfo().getUserId())) {
                interactStickerStruct.getMentionInfo().setUserId("");
            }
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        float f;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            f = videoPublishEditModel.mvCreateVideoData.videoCoverStartTime / 1000.0f;
        } else {
            f = videoPublishEditModel.mVideoCoverStartTm;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(f);
        LIZ.append("");
        linkedHashMap.put("cover_tsp", X1D.LIZIZ(LIZ));
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        String str;
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        VideoShareInfoStruct videoShareInfoStruct;
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null && (forwardCanvasExtra = extra.getForwardCanvasExtra()) != null && (videoShareInfoStruct = forwardCanvasExtra.getVideoShareInfoStruct()) != null) {
            str = videoShareInfoStruct.getAwemeId();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("shared_video_original_item_id", str);
        }
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
            linkedHashMap.put("image_content_type", String.valueOf(2));
        } else {
            if (!H7R.LJJJJL(videoPublishEditModel)) {
                return;
            }
            linkedHashMap.put("image_content_type", String.valueOf(4));
        }
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
        if (tTStoryUploadModel == null) {
            linkedHashMap.put("is_tiktok_story", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(tTStoryUploadModel.getContentType());
        LIZ.append("");
        linkedHashMap.put("data_source", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(tTStoryUploadModel.getIndex());
        LIZ2.append("");
        linkedHashMap.put("bulk_index", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(tTStoryUploadModel.getTotalCount());
        LIZ3.append("");
        linkedHashMap.put("bulk_total", X1D.LIZIZ(LIZ3));
        linkedHashMap.put("story_type", H7R.LJIJJLI(videoPublishEditModel));
        linkedHashMap.put("is_tiktok_story", "1");
        if (C00F.LIZ(31744, 0, "tt_story_opt_create_experiment", true) != 1) {
            linkedHashMap.put("aweme_type", "40");
            linkedHashMap.put("video_type", "40");
        }
        if (C79004UzY.LJJIJL(videoPublishEditModel.canvasVideoData)) {
            linkedHashMap.put("share_story_post_type", "1");
        }
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        if (!H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            return;
        }
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            linkedHashMap.put("story_type", "2");
        } else {
            linkedHashMap.put("aweme_type", "160");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StickerItemModel firstTextSticker = videoPublishEditModel.getFirstTextSticker();
            if (firstTextSticker != null) {
                jSONObject.put("text_content", ((TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), firstTextSticker.extra, TextStickerData.class)).getTextStr());
                videoPublishEditModel.infoStickerModel.stickers.remove(firstTextSticker);
            }
            linkedHashMap.put("text_post_content", jSONObject.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, Collection collection) {
        List<NormalTrackTimeStamp> list;
        if (videoPublishEditModel == null || C79004UzY.LJJIFFI(collection)) {
            return;
        }
        if (videoPublishEditModel.mVideoCanvasWidth != videoPublishEditModel.mOutVideoWidth || videoPublishEditModel.mVideoCanvasHeight != videoPublishEditModel.mOutVideoHeight) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
                try {
                    list = (List) C44172HVg.LJIJI.getRetrofitFactoryGson().LJII(interactStickerStruct.getTrackList(), new H7H().getType());
                } catch (Exception unused) {
                    list = null;
                }
                if (C32151Nz.LJJIIZI(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] LJJJLIIL = C78926UyI.LJJJLIIL(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                            normalTrackTimeStamp.setX(C6BL.LJIILJJIL(LJJJLIIL[0]));
                            normalTrackTimeStamp.setY(C6BL.LJIILJJIL(LJJJLIIL[1]));
                        }
                    }
                    try {
                        interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C44172HVg.LIZIZ, list));
                    } catch (k unused2) {
                    }
                }
            }
        }
    }

    public static void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, List list) {
        H78.LIZ("ShortVideoFutureDelegate -> processInlineCaption");
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 20 && interactStickerStruct.getCaptionStruct() != null) {
                H78.LIZ("ShortVideoFutureDelegate -> processInlineCaption -> captionStruct is not null");
                CaptionStruct captionStruct = interactStickerStruct.getCaptionStruct();
                captionStruct.setAudioUri(videoPublishEditModel.creativeModel.inlineCaptionModel.audioUri);
                captionStruct.setSrcLanguage(videoPublishEditModel.creativeModel.inlineCaptionModel.selectLanguageCode);
                captionStruct.setTaskId(videoPublishEditModel.creativeModel.inlineCaptionModel.taskId);
                interactStickerStruct.setCaptionStruct(captionStruct);
                return;
            }
        }
    }

    public static void LJIJ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        String str;
        Integer num;
        Integer num2;
        UrlModel urlModel;
        Long l;
        Long l2;
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        JSONArray jSONArray = new JSONArray();
        Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (C76917UGr.LJJJJ(next) && C76917UGr.LJJI(next) != null && !C76917UGr.LJJI(next).isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", C76917UGr.LJJI(next));
                    LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    Long l3 = null;
                    if (libraryMaterialInfoSv != null) {
                        str = libraryMaterialInfoSv.getMaterialName();
                    } else {
                        str = null;
                    }
                    jSONObject.put("name", str);
                    LibraryMaterialInfoSv libraryMaterialInfoSv2 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv2 != null) {
                        num = libraryMaterialInfoSv2.getMaterialProvider();
                    } else {
                        num = null;
                    }
                    jSONObject.put("material_provider", num);
                    LibraryMaterialInfoSv libraryMaterialInfoSv3 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv3 != null) {
                        num2 = libraryMaterialInfoSv3.getMaterialType();
                    } else {
                        num2 = null;
                    }
                    jSONObject.put("material_type", num2);
                    LibraryMaterialInfoSv libraryMaterialInfoSv4 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv4 != null) {
                        urlModel = libraryMaterialInfoSv4.getCover();
                    } else {
                        urlModel = null;
                    }
                    jSONObject.put("cover", urlModel);
                    LibraryMaterialInfoSv libraryMaterialInfoSv5 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv5 != null) {
                        l = libraryMaterialInfoSv5.getUsedCount();
                    } else {
                        l = null;
                    }
                    jSONObject.put("used_count", l);
                    LibraryMaterialInfoSv libraryMaterialInfoSv6 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv6 != null) {
                        l2 = libraryMaterialInfoSv6.getStartTime();
                    } else {
                        l2 = null;
                    }
                    jSONObject.put("start_time", l2);
                    LibraryMaterialInfoSv libraryMaterialInfoSv7 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv7 != null) {
                        l3 = libraryMaterialInfoSv7.getEndTime();
                    }
                    jSONObject.put("end_time", l3);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        linkedHashMap.put("library_materials", jSONArray.toString());
    }

    public static void LJJ(VideoPublishEditModel videoPublishEditModel, List list) {
        if (C79004UzY.LJJIFFI(list) || !H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InteractStickerStruct) it.next()).getType() == 18) {
                it.remove();
            }
        }
    }

    public static void LJJI(VideoPublishEditModel videoPublishEditModel, Collection collection) {
        boolean z;
        float[] fArr;
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 18 && interactStickerStruct.getTextInfo() != null) {
                TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                float srcWidth = textInfo.getSrcWidth();
                float srcHeight = textInfo.getSrcHeight();
                int i = videoPublishEditModel.mVideoCanvasWidth;
                int i2 = videoPublishEditModel.mVideoCanvasHeight;
                float f = videoPublishEditModel.mOutVideoWidth;
                float f2 = i;
                float f3 = (f * 1.0f) / f2;
                float f4 = videoPublishEditModel.mOutVideoHeight;
                float f5 = i2;
                float f6 = (1.0f * f4) / f5;
                if (f3 == f6) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fArr = new float[]{srcWidth, srcHeight};
                } else {
                    float max = Math.max(f3, f6);
                    if (max == f3) {
                        srcHeight = ((srcHeight * f5) * max) / f4;
                    } else {
                        srcWidth = ((srcWidth * f2) * max) / f;
                    }
                    fArr = new float[]{srcWidth, srcHeight};
                }
                interactStickerStruct.setTextInfo(new TextStickerInfo(textInfo.getBgColor(), textInfo.getTextColor(), textInfo.getSrcLanguage(), C6BL.LJIILJJIL(fArr[0]), C6BL.LJIILJJIL(fArr[1]), textInfo.getTextSize(), textInfo.getAlignment()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void LJIL(LinkedHashMap linkedHashMap, List list) {
        EnumC161776Wn enumC161776Wn;
        int i;
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct.getType() == 17) {
                QaStruct qaStruct = interactStickerStruct.getQaStruct();
                long questionId = qaStruct.getQuestionId();
                int i2 = this.LIZJ.getInt(C173376rF.LJI(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID()), EnumC161766Wm.FORUM_UNKNOWN.ordinal());
                if (questionId == 0) {
                    enumC161776Wn = EnumC161776Wn.FORUM_QUESTION;
                } else {
                    enumC161776Wn = EnumC161776Wn.FORUM_ANSWER;
                }
                int ordinal = enumC161776Wn.ordinal();
                List<Long> inviteUserList = qaStruct.getInviteUserList();
                String mobValue = qaStruct.getSource().getMobValue();
                mobValue.getClass();
                switch (mobValue.hashCode()) {
                    case -1689534184:
                        if (mobValue.equals("text_to_question")) {
                            i = 6;
                            break;
                        }
                        i = 0;
                        break;
                    case 151464047:
                        if (mobValue.equals("reply_panel")) {
                            i = 13;
                            break;
                        }
                        i = 0;
                        break;
                    case 1459278978:
                        if (mobValue.equals("sticker_panel")) {
                            i = 7;
                            break;
                        }
                        i = 0;
                        break;
                    default:
                        i = 0;
                        break;
                }
                linkedHashMap.put("forum_info", GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), new ForumInfo(ordinal, i2, inviteUserList, i, Arrays.asList(qaStruct.getUserSelectedCategory()))));
                return;
            }
        }
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        JSONArray jSONArray;
        String str;
        boolean z;
        String str2;
        List<InteractStickerStruct> list;
        int i;
        Gson gson = C44172HVg.LIZIZ;
        if (!TextUtils.isEmpty(videoPublishEditModel.city)) {
            linkedHashMap.put("city", videoPublishEditModel.city);
        }
        linkedHashMap.put("is_private", String.valueOf(videoPublishEditModel.isPrivate));
        if (C78983UzD.LJJJJJL(videoPublishEditModel)) {
            linkedHashMap.put("is_private", CardStruct.IStatusCode.DEFAULT);
        }
        linkedHashMap.put("is_hash_tag", "1");
        if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay)) {
            linkedHashMap.put("shoot_way", videoPublishEditModel.mShootWay);
        }
        linkedHashMap.put("is_hard_code", String.valueOf(synthetiseResult.getReportHardEncode()));
        if (!TextUtils.isEmpty(synthetiseResult.cpuName)) {
            linkedHashMap.put("cpu_info", synthetiseResult.cpuName);
        }
        if (!TextUtils.isEmpty(synthetiseResult.gpuName)) {
            linkedHashMap.put("gpu_info", synthetiseResult.gpuName);
        }
        linkedHashMap.put("file_fps", String.valueOf(synthetiseResult.getFps()));
        linkedHashMap.put("item_comment", String.valueOf(videoPublishEditModel.commentSetting));
        linkedHashMap.put("open_platform_auto_sync", GsonProtectorUtils.toJson(gson, videoPublishEditModel.openPlatformAutoSync));
        linkedHashMap.put("item_react", String.valueOf(videoPublishEditModel.reactDuetSetting));
        linkedHashMap.put("item_duet", String.valueOf(videoPublishEditModel.reactDuetSetting));
        linkedHashMap.put("item_stitch", String.valueOf(videoPublishEditModel.stitchSetting));
        String json = GsonProtectorUtils.toJson(new Gson(), videoPublishEditModel.geofencingSetting);
        o.LJIIIIZZ(json, "gson.toJson(args.geofencingSetting)");
        linkedHashMap.put("geofencing_regions", json);
        Iterator it = ((ArrayList) C78605Ut7.LJIIZILJ()).iterator();
        while (it.hasNext()) {
            ((GTK) it.next()).LIZ(videoPublishEditModel, linkedHashMap, this.LIZ);
        }
        if (C211898Th.LIZ() && C53258KvG.LIZIZ()) {
            linkedHashMap.put("anchor_show_style", String.valueOf(1));
        }
        if (!C211898Th.LIZ()) {
            List<CreateAnchorInfo> anchors = this.LIZ;
            o.LJIIIZ(anchors, "anchors");
            ORS.LJJLIL(G8Y.LJLIL, anchors);
        }
        List<CreateAnchorInfo> list2 = this.LIZ;
        o.LJIIIZ(list2, "list");
        Collections.reverse(list2);
        if (((ArrayList) list2).size() > 1) {
            C40675Fxn.LJJLIIIJ(list2, new IDComparatorS35S0000000_7(12));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchors: ");
        LIZ.append(this.LIZ);
        H78.LJI(X1D.LIZIZ(LIZ));
        List<CreateAnchorInfo> anchors2 = this.LIZ;
        o.LJIIIZ(anchors2, "anchors");
        String LIZJ = C75792yF.LIZJ(anchors2);
        o.LJIIIIZZ(LIZJ, "toJson(anchors)");
        linkedHashMap.put("anchors", LIZJ);
        List<CreateAnchorInfo> anchors3 = this.LIZ;
        o.LJIIIZ(anchors3, "anchors");
        ArrayList<CreateAnchorInfo> arrayList = H5Q.LIZ;
        synchronized (arrayList) {
            arrayList.clear();
            arrayList.addAll(anchors3);
        }
        if (!C38891fp.LJJI(videoPublishEditModel.arTextList)) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = videoPublishEditModel.arTextList.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            String jSONArray3 = jSONArray2.toString();
            if (!TextUtils.isEmpty(jSONArray3)) {
                linkedHashMap.put("ar_text", jSONArray3);
            }
        }
        JSONArray jSONArray4 = new JSONArray();
        if (!C38891fp.LJJI(videoPublishEditModel.messageBubbleTexts)) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator<String> it3 = videoPublishEditModel.messageBubbleTexts.iterator();
            while (it3.hasNext()) {
                jSONArray5.put(it3.next());
            }
            try {
                jSONArray4.put(new JSONObject().put("type", 1).put("data", jSONArray5));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        int i2 = 0;
        if (C42000Ge4.LJIILIIL(videoPublishEditModel)) {
            jSONArray = new JSONArray();
            List<TextStickerModel> list3 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
            Collections.sort(list3, new IDComparatorS30S0000000_2(11));
            for (TextStickerModel textStickerModel : list3) {
                if (textStickerModel.getCaptionModel() == null) {
                    jSONArray.put(textStickerModel.getTextStr());
                }
            }
        } else {
            jSONArray = new JSONArray();
            ArrayList arrayList2 = new ArrayList();
            if (videoPublishEditModel.hasInfoStickers()) {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (stickerItemModel.type != 2 || o.LJ(((TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class)).getType(), "type_inline_caption")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (Boolean.valueOf(z).booleanValue()) {
                        arrayList2.add(stickerItemModel);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new C0DI(1));
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    try {
                        str = C68W.LJII(((TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), ((StickerItemModel) ListProtector.get(arrayList2, i3)).extra, TextStickerData.class)).getTextWrapList());
                    } catch (s unused) {
                        str = "";
                    }
                    jSONArray.put(str);
                }
            }
        }
        if (jSONArray.length() > 0) {
            try {
                jSONArray4.put(new JSONObject().put("type", 4).put("data", jSONArray));
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        try {
            JSONArray LIZ2 = C149105tC.LIZ(videoPublishEditModel);
            if (LIZ2.length() > 0) {
                jSONArray4.put(new JSONObject().put("type", 13).put("data", LIZ2));
            }
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
        if (videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getHasCoverText() && videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker() != null) {
            try {
                JSONArray jSONArray6 = new JSONArray();
                Iterator it4 = ((ArrayList) C149105tC.LIZIZ(videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker())).iterator();
                while (it4.hasNext()) {
                    jSONArray6.put(it4.next());
                }
                jSONArray4.put(new JSONObject().put("type", 9).put("data", jSONArray6));
            } catch (JSONException e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
        CutSameEditData cutSameEditData = videoPublishEditModel.cutSameEditData;
        if (cutSameEditData != null && !C38891fp.LJJI(cutSameEditData.LIZLLL())) {
            JSONArray jSONArray7 = new JSONArray();
            Iterator<String> it5 = videoPublishEditModel.cutSameEditData.LIZLLL().iterator();
            while (it5.hasNext()) {
                jSONArray7.put(it5.next());
            }
            try {
                jSONArray4.put(new JSONObject().put("type", 5).put("data", jSONArray7));
            } catch (JSONException e5) {
                C16880lQ.LLLLIIL(e5);
            }
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getMainBusinessData())) {
            EnumC164816dR[] enumC164816dRArr = {EnumC164816dR.TRACK_PAGE_EDIT};
            InteractStickerTracksContext LJII = C164826dS.LJII(videoPublishEditModel.getMainBusinessContext());
            if (LJII == null || LJII.isEmpty(enumC164816dRArr)) {
                list = null;
            } else {
                list = LJII.getStickerStructsByPage(enumC164816dRArr);
                for (InteractStickerStruct interactStickerStruct : list) {
                    if (interactStickerStruct.getPollStruct() != null) {
                        PollStruct pollStruct = interactStickerStruct.getPollStruct();
                        if (!C79004UzY.LJJIFFI(pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                            if (C38354F3m.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption())) {
                                ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).setPostOption(C60903NvH.LJ.getString(R.string.tt_));
                            }
                            if (C38354F3m.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption())) {
                                ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).setPostOption(C60903NvH.LJ.getString(R.string.tta));
                            }
                        }
                    }
                }
            }
            if (!C79004UzY.LJJIFFI(list)) {
                List<InteractStickerStruct> LJFF = C164826dS.LJFF(videoPublishEditModel, 1, EnumC164816dR.TRACK_PAGE_EDIT);
                if (LJFF != null && !LJFF.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJFF, 0)).getPollStruct() != null) {
                    try {
                        jSONArray4.put(new JSONObject().put("type", 3).put("data", new JSONObject(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), C164826dS.LIZ(((InteractStickerStruct) ListProtector.get(LJFF, 0)).getPollStruct())))));
                    } catch (JSONException e6) {
                        C16880lQ.LLLLIIL(e6);
                    }
                }
                List<InteractStickerStruct> LJFF2 = C164826dS.LJFF(videoPublishEditModel, 10, EnumC164816dR.TRACK_PAGE_EDIT);
                if (LJFF2 != null && !LJFF2.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJFF2, 0)).getCountDownStickerStruct() != null) {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(((InteractStickerStruct) ListProtector.get(LJFF2, 0)).getCountDownStickerStruct().getTitle());
                        jSONArray4.put(new JSONObject().put("type", 12).put("data", new JSONArray(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), arrayList3))));
                    } catch (JSONException e7) {
                        C16880lQ.LLLLIIL(e7);
                    }
                }
                if (!C77413UZt.LJIILL(videoPublishEditModel.mentionTextList)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 16);
                        JSONArray jSONArray8 = new JSONArray();
                        for (String str3 : videoPublishEditModel.mentionTextList) {
                            if (!TextUtils.isEmpty(str3)) {
                                jSONArray8.put(str3);
                            }
                        }
                        jSONObject.put("data", jSONArray8);
                    } catch (JSONException e8) {
                        C16880lQ.LLLLIIL(e8);
                    }
                    jSONArray4.put(jSONObject);
                }
                if (!C77413UZt.LJIILL(videoPublishEditModel.hashTagTextList)) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("type", 17);
                        JSONArray jSONArray9 = new JSONArray();
                        for (String str4 : videoPublishEditModel.hashTagTextList) {
                            if (!TextUtils.isEmpty(str4)) {
                                jSONArray9.put(str4);
                            }
                        }
                        jSONObject2.put("data", jSONArray9);
                    } catch (JSONException e9) {
                        C16880lQ.LLLLIIL(e9);
                    }
                    jSONArray4.put(jSONObject2);
                }
                List<InteractStickerStruct> LJFF3 = C164826dS.LJFF(videoPublishEditModel, 11, EnumC164816dR.TRACK_PAGE_EDIT);
                if (LJFF3 != null && !LJFF3.isEmpty()) {
                    try {
                        CaptionStruct captionStruct = ((InteractStickerStruct) ListProtector.get(LJFF3, 0)).getCaptionStruct();
                        if (captionStruct != null && captionStruct.getUtterances() != null) {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator<Utterance> it6 = captionStruct.getUtterances().iterator();
                            while (it6.hasNext()) {
                                arrayList4.add(it6.next().getText());
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            if (videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
                                i = 20;
                            } else {
                                i = 15;
                            }
                            jSONArray4.put(jSONObject3.put("type", i).put("data", new JSONArray((Collection) arrayList4)));
                        }
                    } catch (JSONException e10) {
                        C16880lQ.LLLLIIL(e10);
                    }
                }
                List<InteractStickerStruct> LJFF4 = C164826dS.LJFF(videoPublishEditModel, 12, EnumC164816dR.TRACK_PAGE_EDIT);
                if (LJFF4 != null && !LJFF4.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJFF4, 0)).getQaStruct() != null) {
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(((InteractStickerStruct) ListProtector.get(LJFF4, 0)).getQaStruct().getQuestionContent());
                        jSONArray4.put(new JSONObject().put("type", 19).put("data", new JSONArray(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), arrayList5))));
                    } catch (JSONException e11) {
                        C16880lQ.LLLLIIL(e11);
                    }
                }
                EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_EDIT;
                List<InteractStickerStruct> LJFF5 = C164826dS.LJFF(videoPublishEditModel, 2, enumC164816dR);
                List<InteractStickerStruct> LJFF6 = C164826dS.LJFF(videoPublishEditModel, 5, enumC164816dR);
                if ((LJFF5 != null && LJFF5.size() > 0) || (LJFF6 != null && LJFF6.size() > 0)) {
                    JSONArray jSONArray10 = new JSONArray();
                    if (videoPublishEditModel.isCommentReply()) {
                        jSONArray10.put(videoPublishEditModel.commentVideoModel.getCommentMsg());
                    }
                    if (jSONArray10.length() > 0) {
                        try {
                            JSONObject put = new JSONObject().put("data", jSONArray10);
                            if (!videoPublishEditModel.commentVideoModel.isQuestion()) {
                                put.put("type", 8);
                            } else {
                                put.put("type", 14);
                            }
                            jSONArray4.put(put);
                        } catch (JSONException e12) {
                            C16880lQ.LLLLIIL(e12);
                        }
                    }
                }
            }
        }
        List<AddYoursStickerModel> list4 = videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels;
        if (!list4.isEmpty()) {
            try {
                for (AddYoursStickerModel addYoursStickerModel : list4) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(addYoursStickerModel.getTopicText());
                    jSONArray4.put(new JSONObject().put("type", 19).put("data", new JSONArray(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), arrayList6))));
                }
            } catch (JSONException e13) {
                C16880lQ.LLLLIIL(e13);
            }
        }
        if (jSONArray4.length() != 0) {
            linkedHashMap.put("sticker_text", jSONArray4.toString());
        }
        if (jSONArray4.length() <= 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        linkedHashMap.put("text_added", str2);
        if (jSONArray4.length() > 0) {
            ((HashSet) this.LIZIZ).add("text");
        }
        if (HFA.LIZJ(videoPublishEditModel)) {
            linkedHashMap.put("has_original_vframe", "1");
        } else {
            linkedHashMap.put("has_original_vframe", "2");
        }
        String LIZIZ = HFA.LIZIZ(videoPublishEditModel);
        if (!TextUtils.isEmpty(LIZIZ)) {
            linkedHashMap.put("frame_check", LIZIZ);
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list5 = infoStickerModel.stickers;
            if (C32151Nz.LJJIIZI(list5)) {
                for (StickerItemModel stickerItemModel2 : list5) {
                    if ("1".equals(stickerItemModel2.isEditorProText)) {
                        ((HashSet) this.LIZIZ).add("text");
                    }
                    if ("1".equals(stickerItemModel2.isEditorProTTS)) {
                        ((HashSet) this.LIZIZ).add("text_reading");
                    }
                    if ("1".equals(stickerItemModel2.isEditorProCaption)) {
                        ((HashSet) this.LIZIZ).add("subtitle");
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getMusicOrigin())) {
            ((HashSet) this.LIZIZ).add("select_music");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            ((HashSet) this.LIZIZ).add("prop");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getInfoStickerList())) {
            ((HashSet) this.LIZIZ).add("info_sticker");
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            ((HashSet) this.LIZIZ).add("voice_effect");
        }
        if (videoPublishEditModel.hasReadTextAudio()) {
            ((HashSet) this.LIZIZ).add("text_reading");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mRecordFilterIds) || !TextUtils.isEmpty(videoPublishEditModel.mSelectedFilterId)) {
            ((HashSet) this.LIZIZ).add("filter");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getEditEffectListStr())) {
            ((HashSet) this.LIZIZ).add("effect");
        }
        if (videoPublishEditModel.creativeModel.inlineCaptionModel != null || (videoPublishEditModel.allowAutoCaptionSetting != 1 && videoPublishEditModel.hasSubtitle())) {
            ((HashSet) this.LIZIZ).add("subtitle");
        }
        if (videoPublishEditModel.isAutoEnhanceEnable() && videoPublishEditModel.autoEnhanceOn) {
            ((HashSet) this.LIZIZ).add("quality_improve");
        }
        if (Boolean.TRUE.equals(videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor)) {
            ((HashSet) this.LIZIZ).add("ugc_post");
        }
        if (C44384HbQ.LLD(videoPublishEditModel)) {
            ((HashSet) this.LIZIZ).add("speed_change");
        }
        if (C78685UuP.LJJIFFI(videoPublishEditModel.audioEnhanceParam)) {
            ((HashSet) this.LIZIZ).add("noise_reducer");
        }
        if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0) == 1) {
            ((HashSet) this.LIZIZ).add("high_quality_upload");
        }
        C1292755n.LIZ.getClass();
        if (!TextUtils.isEmpty(C1292755n.LIZIZ(videoPublishEditModel))) {
            ((HashSet) this.LIZIZ).add("editor_pro");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it7 = ((HashSet) this.LIZIZ).iterator();
        while (it7.hasNext()) {
            String str5 = (String) it7.next();
            if (i2 == ((HashSet) this.LIZIZ).size() - 1) {
                sb.append(str5);
            } else {
                sb.append(str5);
                sb.append(",");
            }
            i2++;
        }
        linkedHashMap.put("all_creation_used_functions", sb.toString());
    }
}

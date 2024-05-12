package X;

import Y.ACallableS105S0100000_2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashTagAPi$RecommendHashTagApi;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162496Zh {
    public static boolean LIZ;
    public static int LIZIZ;
    public static C73411SrX LIZJ;
    public static C73411SrX LIZLLL;
    public static RecommendHashtagResponse LJFF;
    public static int LJII;
    public static boolean LJIIIIZZ;
    public static C73849Syb<RecommendHashtagResponse> LJIIIZ;
    public static EditInfo LJ = new EditInfo(null, null, null, null, null, null, 63, null);
    public static final List<RecommendHashtag> LJI = new ArrayList();

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C63C c63c) {
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        String str3;
        InterfaceC147435qV interfaceC147435qV;
        ArrayList<StickerItemModel> arrayList3;
        ArrayList arrayList4;
        List<Utterance> utterances;
        ArrayList<StickerItemModel> arrayList5;
        TextStickerData textStickerData;
        C63K c63k;
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        String questionContent;
        String commentMsg;
        AbstractC156286Bk abstractC156286Bk;
        List<String> LJJIL;
        List LJLJJL;
        C63D c63d;
        ArrayList arrayList6 = new ArrayList();
        if (C78685UuP.LJJJZ(videoPublishEditModel.mStickerID)) {
            String mStickerID = videoPublishEditModel.mStickerID;
            o.LJIIIIZZ(mStickerID, "mStickerID");
            List LJLJJL2 = s.LJLJJL(mStickerID, new String[]{","}, 0, 6);
            ArrayList arrayList7 = new ArrayList(C32I.LJJL(LJLJJL2, 10));
            Iterator it = LJLJJL2.iterator();
            while (it.hasNext()) {
                arrayList7.add(it.next());
            }
            arrayList6.addAll(arrayList7);
        }
        ArrayList<EffectPointModel> arrayList8 = videoPublishEditModel.creativeModel.editEffectModel.effectList;
        ArrayList arrayList9 = new ArrayList();
        Iterator<EffectPointModel> it2 = arrayList8.iterator();
        while (it2.hasNext()) {
            EffectPointModel next = it2.next();
            if (C78685UuP.LJJJZ(next.getKey())) {
                arrayList9.add(next);
            }
        }
        ArrayList arrayList10 = new ArrayList(C32I.LJJL(arrayList9, 10));
        Iterator it3 = arrayList9.iterator();
        while (it3.hasNext()) {
            arrayList10.add(((EffectPointModel) it3.next()).getKey());
        }
        arrayList6.addAll(arrayList10);
        ArrayList arrayList11 = null;
        if (arrayList6.isEmpty()) {
            arrayList6 = null;
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            str = MusicBeanUtilKt.getMusicId(musicObject);
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            arrayList = new ArrayList();
            str.toString();
            arrayList.add(str);
        } else {
            arrayList = null;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            str2 = infoStickerModel.getInfoStickerIds();
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2) && str2 != null) {
            List LJLJJL3 = s.LJLJJL(str2, new String[]{","}, 0, 6);
            arrayList2 = new ArrayList(C32I.LJJL(LJLJJL3, 10));
            Iterator it4 = LJLJJL3.iterator();
            while (it4.hasNext()) {
                arrayList2.add(it4.next());
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList12 = new ArrayList();
        if (c63c != null && (c63d = c63c.LLJI) != null) {
            str3 = c63d.getTextContent();
        } else {
            str3 = null;
        }
        if (C78685UuP.LJJJZ(str3) && str3 != null && (LJLJJL = s.LJLJJL(str3, new String[]{","}, 0, 6)) != null) {
            arrayList12.addAll(LJLJJL);
        }
        if (c63c != null) {
            interfaceC147435qV = c63c.LLJJIJIL().LIZ();
        } else {
            interfaceC147435qV = null;
        }
        if ((interfaceC147435qV instanceof C156346Bq) && (abstractC156286Bk = (AbstractC156286Bk) interfaceC147435qV) != null && (LJJIL = abstractC156286Bk.LJJIL()) != null) {
            arrayList12.addAll(LJJIL);
        }
        CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
        if (commentVideoModel != null && C78685UuP.LJJJZ(commentVideoModel.getCommentMsg()) && (commentMsg = videoPublishEditModel.commentVideoModel.getCommentMsg()) != null) {
            arrayList12.add(commentMsg);
        }
        if (c63c != null && (c63k = (C63K) C44384HbQ.LJJJ(c63c).LJ(C63K.class)) != null && (interactStickerStruct = c63k.getInteractStickerStruct()) != null && (qaStruct = interactStickerStruct.getQaStruct()) != null && (questionContent = qaStruct.getQuestionContent()) != null) {
            arrayList12.add(questionContent);
        }
        if (arrayList12.isEmpty()) {
            arrayList12 = null;
        }
        if (C42000Ge4.LJIILIIL(videoPublishEditModel)) {
            List LJIIL = C78841Uwv.LJIIL(videoPublishEditModel);
            arrayList4 = new ArrayList(C32I.LJJL(LJIIL, 10));
            Iterator it5 = ((ArrayList) LJIIL).iterator();
            while (it5.hasNext()) {
                arrayList4.add(((TextStickerModel) it5.next()).getTextStr());
            }
        } else {
            InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel != null) {
                arrayList3 = inlineCaptionModel.utterances;
            } else {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                if (inlineCaptionModel != null && (arrayList5 = inlineCaptionModel.utterances) != null) {
                    ArrayList arrayList13 = new ArrayList(C32I.LJJL(arrayList5, 10));
                    Iterator<StickerItemModel> it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        String str4 = it6.next().extra;
                        o.LJIIIIZZ(str4, "it.extra");
                        try {
                            textStickerData = (TextStickerData) new Gson().LJII(str4, new TypeToken<TextStickerData>() { // from class: X.6Zk
                            }.getType());
                        } catch (Exception unused) {
                        }
                        if (textStickerData != null && (r0 = textStickerData.getTextStr()) != null) {
                            arrayList13.add(r0);
                        }
                        String str5 = "";
                        arrayList13.add(str5);
                    }
                    arrayList4 = new ArrayList();
                    Iterator it7 = arrayList13.iterator();
                    while (it7.hasNext()) {
                        Object next2 = it7.next();
                        if (C78685UuP.LJJJZ((String) next2)) {
                            arrayList4.add(next2);
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                CaptionStruct captionStruct = videoPublishEditModel.captionStruct;
                if (captionStruct == null || (utterances = captionStruct.getUtterances()) == null || utterances.isEmpty()) {
                    arrayList4 = null;
                } else {
                    List<Utterance> utterances2 = videoPublishEditModel.captionStruct.getUtterances();
                    if (utterances2 != null) {
                        ArrayList arrayList14 = new ArrayList();
                        for (Utterance utterance : utterances2) {
                            if (C78685UuP.LJJJZ(utterance.getText())) {
                                arrayList14.add(utterance);
                            }
                        }
                        arrayList4 = new ArrayList(C32I.LJJL(arrayList14, 10));
                        Iterator it8 = arrayList14.iterator();
                        while (it8.hasNext()) {
                            arrayList4.add(((Utterance) it8.next()).getText());
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        if (H7R.LJJJJL(videoPublishEditModel)) {
            List<SingleImageData> imageList = videoPublishEditModel.getImageAlbumData().getImageList();
            ArrayList arrayList15 = new ArrayList();
            for (SingleImageData singleImageData : imageList) {
                if (C78685UuP.LJJJZ(singleImageData.getFilterInfo().getFilterId())) {
                    arrayList15.add(singleImageData);
                }
            }
            arrayList11 = new ArrayList(C32I.LJJL(arrayList15, 10));
            Iterator it9 = arrayList15.iterator();
            while (it9.hasNext()) {
                arrayList11.add(((SingleImageData) it9.next()).getFilterInfo().getFilterId());
            }
        } else if (C78685UuP.LJJJZ(videoPublishEditModel.mSelectedFilterId)) {
            arrayList11 = new ArrayList();
            arrayList11.add(videoPublishEditModel.mSelectedFilterId);
        } else if (C78685UuP.LJJJZ(videoPublishEditModel.mCurFilterIds)) {
            arrayList11 = C47261Igj.LJII(videoPublishEditModel.mCurFilterIds);
        }
        EditInfo editInfo = new EditInfo(arrayList6, arrayList, arrayList2, arrayList12, arrayList4, arrayList11);
        LJIIIZ = new C73849Syb<>();
        C10K.LIZJ(new ACallableS105S0100000_2(editInfo, 24));
    }

    public static void LIZ(String str, int i, EditInfo editInfo) {
        String str2;
        o.LJIIIZ(editInfo, "editInfo");
        LIZ = false;
        LJ = editInfo;
        ((ArrayList) LJI).clear();
        LJII = 0;
        if (!editInfo.hasInfo()) {
            str2 = "";
        } else {
            str2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), editInfo);
            o.LJIIIIZZ(str2, "{\n            CameraClie…oJson(editInfo)\n        }");
        }
        if (str == null && str2.length() == 0) {
            C73849Syb<RecommendHashtagResponse> c73849Syb = LJIIIZ;
            if (c73849Syb != null) {
                c73849Syb.onError(new C162556Zn(1003L, "upload result and editInfo are all null"));
                return;
            }
            return;
        }
        RecommendHashTagAPi$RecommendHashTagApi recommendHashTagAPi$RecommendHashTagApi = (RecommendHashTagAPi$RecommendHashTagApi) C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(RecommendHashTagAPi$RecommendHashTagApi.class);
        if (str == null) {
            str = "";
        }
        LIZLLL = (C73411SrX) recommendHashTagAPi$RecommendHashTagApi.getRecommendChallenges(str, "publish_page", i, str2).LJJLIIIJJIZ(5L, TimeUnit.SECONDS, new InterfaceC115714gR() { // from class: X.6Zl
            @Override // X.InterfaceC115714gR
            public final void LIZ(InterfaceC116954iR<? super RecommendHashtagResponse> it) {
                o.LJIIIZ(it, "it");
                it.onError(new RuntimeException("time out"));
            }
        }).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.6Zj
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C73849Syb<RecommendHashtagResponse> c73849Syb2 = C162496Zh.LJIIIZ;
                if (c73849Syb2 != null) {
                    c73849Syb2.onNext(obj);
                }
                C73411SrX c73411SrX = C162496Zh.LIZLLL;
                if (c73411SrX != null && (!c73411SrX.isDisposed())) {
                    c73411SrX.dispose();
                }
            }
        }, new InterfaceC64592gB() { // from class: X.6Zi
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C73849Syb<RecommendHashtagResponse> c73849Syb2 = C162496Zh.LJIIIZ;
                if (c73849Syb2 != null) {
                    c73849Syb2.onError(th);
                }
                C73411SrX c73411SrX = C162496Zh.LIZLLL;
                if (c73411SrX != null && (!c73411SrX.isDisposed())) {
                    c73411SrX.dispose();
                }
            }
        });
    }
}

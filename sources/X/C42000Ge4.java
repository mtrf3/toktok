package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ge4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42000Ge4 {
    public static final OSZ<Integer, Integer> LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        int i2 = 0;
        if (arrayList != null) {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                String description = it.next().getDescription();
                if (description != null) {
                    try {
                        if (o.LJ(new JSONObject(description).optString("source_type"), "vicut")) {
                            i++;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } else {
            i = 0;
        }
        ArrayList<ImportVideoInfo> arrayList2 = videoPublishEditModel.importInfoList;
        if (arrayList2 != null) {
            i2 = arrayList2.size() - i;
        }
        return new OSZ<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        Iterator<StickerItemModel> it;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (LJIILIIL(videoPublishEditModel)) {
            videoPublishEditModel.creativeModel.stickerModel.textStickerModels.clear();
            return;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || (it = list.iterator()) == null) {
            return;
        }
        while (it.hasNext()) {
            if (it.next().type == 2) {
                it.remove();
            }
        }
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isMV: ");
        LIZ.append(videoPublishEditModel.isMvThemeVideoType());
        LIZ.append(", isDraft: ");
        LIZ.append(videoPublishEditModel.mIsFromDraft);
        LIZ.append(", draftId: ");
        LIZ.append(videoPublishEditModel.draftId);
        LIZ.append(", newDraftId: ");
        LIZ.append(videoPublishEditModel.newDraftId);
        return X1D.LIZIZ(LIZ);
    }

    public static final int LJFF(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        int i = 0;
        if (arrayList != null) {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            long j = 0;
            loop0: while (true) {
                i = 0;
                while (it.hasNext()) {
                    ImportVideoInfo next = it.next();
                    if (next.getImportfileDuration() > j) {
                        j = next.getImportfileDuration();
                        String description = next.getDescription();
                        if (description != null) {
                            try {
                                if (o.LJ(new JSONObject(description).optString("source_type"), "vicut")) {
                                    Object opt = new JSONObject(description).opt("data");
                                    o.LJII(opt, "null cannot be cast to non-null type org.json.JSONObject");
                                    String optString = ((JSONObject) opt).optString("stickerId");
                                    o.LJIIIIZZ(optString, "JSONObject(it).opt(\"data…t).optString(\"stickerId\")");
                                    if (optString.length() > 0) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                }
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                }
                break loop0;
            }
        }
        videoPublishEditModel.creativeModel.postPageModel.isFromCC = i;
        return i;
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C41012G7s.LIZ() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            if (G9D.LIZ() == 4) {
                return G9D.LIZJ();
            }
            return G9D.LIZ();
        }
        return G9D.LIZIZ();
    }

    public static final List<TextStickerModel> LJII(VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        List<TextStickerModel> list;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel == null || (stickerNewEngineModel = creativeModel.stickerModel) == null || (list = stickerNewEngineModel.textStickerModels) == null) {
            return new ArrayList();
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = r5.getEffectList()
            java.lang.String r0 = "effectList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r5 = r1.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r4
            java.lang.String r0 = r4.getExtra()
            if (r0 == 0) goto L2f
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L74
        L2f:
            r0 = 1
        L30:
            if (r0 == 0) goto L33
            goto L17
        L33:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = r4.getExtra()     // Catch: org.json.JSONException -> L17
            r2.<init>(r0)     // Catch: org.json.JSONException -> L17
            java.lang.String r1 = "game_play_type"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.optString(r1, r0)     // Catch: org.json.JSONException -> L17
            X.5Mn r0 = X.EnumC133695Mn.EDIT_EFFECT_SERVER     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = r0.getType()     // Catch: org.json.JSONException -> L17
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: org.json.JSONException -> L17
            if (r0 == 0) goto L54
            r3.add(r4)     // Catch: org.json.JSONException -> L17
            goto L17
        L54:
            X.5Mn r0 = X.EnumC133695Mn.EDIT_EFFECT_COMBINED     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = r0.getType()     // Catch: org.json.JSONException -> L17
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: org.json.JSONException -> L17
            if (r0 == 0) goto L64
            r3.add(r4)     // Catch: org.json.JSONException -> L17
            goto L17
        L64:
            X.5Mn r0 = X.EnumC133695Mn.EDIT_EFFECT_CLIENT     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = r0.getType()     // Catch: org.json.JSONException -> L17
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: org.json.JSONException -> L17
            if (r0 == 0) goto L17
            r3.add(r4)     // Catch: org.json.JSONException -> L17
            goto L17
        L74:
            r0 = 0
            goto L30
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42000Ge4.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static final long LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        return new File(videoPublishEditModel.mParallelUploadOutputFile).length();
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList != null) {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                String description = it.next().getDescription();
                if (description != null) {
                    try {
                        if (o.LJ(new JSONObject(description).optString("source_type"), "vicut")) {
                            return true;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList != null) {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                String description = it.next().getDescription();
                if (description != null) {
                    try {
                        if (o.LJ(new JSONObject(description).optString("source_type"), "vicut")) {
                            return true;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        return TextUtils.equals(videoPublishEditModel.mShootWay, "l8_import_music_edit");
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        StickerNewEngineModel stickerNewEngineModel2;
        StickerNewEngineModel stickerNewEngineModel3;
        Boolean bool;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (stickerNewEngineModel3 = creativeModel.stickerModel) != null && (bool = stickerNewEngineModel3.textUseNewEngine) != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        try {
            if (H7R.LJJIJIIJIL(videoPublishEditModel)) {
                return true;
            }
            if (!H7R.LJJLIIIJJIZ(videoPublishEditModel) && !H7R.LJJJJI(videoPublishEditModel) && !H7R.LJJJJL(videoPublishEditModel) && !H7R.LJJIZ(videoPublishEditModel)) {
                CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
                if (!creativeModel2.changeAvatarModel.isFromAiVatar && !creativeModel2.onThisDayData.isFromOnThisDay()) {
                    boolean booleanValue = ((Boolean) C42003Ge7.LIZ.getValue()).booleanValue();
                    videoPublishEditModel.creativeModel.stickerModel.textUseNewEngine = Boolean.valueOf(booleanValue);
                    return booleanValue;
                }
            }
            videoPublishEditModel.creativeModel.stickerModel.textUseNewEngine = Boolean.FALSE;
            return false;
        } catch (NullPointerException unused) {
            StringBuilder LJI = JBR.LJI("viki text, textUseNewEngine -> catch NPE -> VideoPublishEditModel is null =", false, ", textStickerModels is null=");
            CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
            if (creativeModel3 != null && (stickerNewEngineModel2 = creativeModel3.stickerModel) != null && stickerNewEngineModel2.textStickerModels != null) {
                z = false;
            }
            LJI.append(z);
            H7B.LIZJ(X1D.LIZIZ(LJI));
            CreativeModel creativeModel4 = videoPublishEditModel.creativeModel;
            if (creativeModel4 != null && (stickerNewEngineModel = creativeModel4.stickerModel) != null) {
                stickerNewEngineModel.textUseNewEngine = Boolean.FALSE;
            }
            return false;
        }
    }

    public static final PublishOutput LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        Object LIZ;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        Object obj = null;
        try {
            List<InteractStickerStruct> LJFF = C164826dS.LJFF(videoPublishEditModel, 13, EnumC164816dR.TRACK_PAGE_EDIT);
            if (LJFF != null && (!LJFF.isEmpty())) {
                LIZ = ((InteractStickerStruct) ListProtector.get(LJFF, 0)).getPoiStickerStruct().getPoiData();
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return new PublishOutput(videoPublishEditModel.getCreationId(), videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.getMusicId(), videoPublishEditModel.isCommerceMusic(), videoPublishEditModel.isOriginalSound(), (PoiData) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, com.ss.android.ugc.aweme.common.PublishSettings r5) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            r3 = 1
            r0.publishSettingApplied = r3
            X.Ge6 r0 = r5.getPrivacySetting()
            int[] r1 = X.C42001Ge5.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 3
            if (r2 == r3) goto L1e
            r0 = 2
            if (r2 == r0) goto L92
            if (r2 == r1) goto L1f
        L1e:
            r0 = 1
        L1f:
            r4.isPrivate = r0
            boolean r0 = r5.getAllowComment()
            if (r0 != r3) goto L28
            r1 = 0
        L28:
            r4.commentSetting = r1
            boolean r0 = r5.getAllowDuet()
            if (r0 != r3) goto L90
            r0 = 0
        L31:
            r4.reactDuetSetting = r0
            boolean r0 = r5.getAllowStitch()
            if (r0 != r3) goto L3a
            r3 = 0
        L3a:
            r4.stitchSetting = r3
            java.lang.String r0 = r5.getCaption()
            java.lang.String r2 = ""
            if (r0 != 0) goto L45
            r0 = r2
        L45:
            r4.title = r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            com.ss.android.ugc.aweme.creative.model.publish.CaptionModel r1 = r0.captionModel
            java.lang.String r0 = r5.getCaption()
            if (r0 != 0) goto L54
            r0 = r2
        L54:
            r1.markupText = r0
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r1 = r0.getPublishService()
            java.lang.String r0 = r4.title
            if (r0 != 0) goto L8e
        L62:
            java.util.List r0 = r1.LJJIIZ(r2)
            r4.setStructList(r0)
            java.lang.Double r0 = r5.getCoverImageTimeStamp()
            if (r0 == 0) goto L8c
            double r1 = r0.doubleValue()
            float r0 = (float) r1
        L74:
            r4.mVideoCoverStartTm = r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r1 = r0.postPageModel
            boolean r0 = r5.isDirectPost()
            r1.isDirectPublishByCC = r0
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJII(r4)
            return
        L8c:
            r0 = 0
            goto L74
        L8e:
            r2 = r0
            goto L62
        L90:
            r0 = 1
            goto L31
        L92:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42000Ge4.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.common.PublishSettings):void");
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String str3 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        videoPublishEditModel.title = str2;
        CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
        if (str == null) {
            str = "";
        }
        captionModel.markupText = str;
        InterfaceC163006aW publishService = C60903NvH.LJIIJJI().getPublishService();
        String str4 = videoPublishEditModel.title;
        if (str4 != null) {
            str3 = str4;
        }
        videoPublishEditModel.setStructList(publishService.LJJIIZ(str3));
        C60903NvH.LJIIJJI().getPublishService().LJII(videoPublishEditModel);
    }
}

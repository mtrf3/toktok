package X;

import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H5T {
    public static final void LIZ(List<CreateAnchorInfo> anchors) {
        o.LJIIIZ(anchors, "anchors");
        anchors.add(new CreateAnchorInfo(70, "Create AI vatars", "aweme://aivatar", "", "", null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, false, 8096, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x016e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e A[Catch: Exception -> 0x01b8, TryCatch #0 {Exception -> 0x01b8, blocks: (B:23:0x0052, B:25:0x006d, B:26:0x0072, B:28:0x008a, B:30:0x0095, B:35:0x00ab, B:37:0x00ba, B:39:0x00ea, B:40:0x00c6, B:42:0x00d2, B:45:0x00d6, B:49:0x011c, B:51:0x0122, B:54:0x012a, B:62:0x0131, B:64:0x0138, B:65:0x013c, B:67:0x0142, B:69:0x0153, B:71:0x0157, B:75:0x0163, B:79:0x0178, B:81:0x0184, B:82:0x0186, B:84:0x018e, B:86:0x0194, B:73:0x0168, B:87:0x0198, B:89:0x019e, B:91:0x01aa, B:93:0x01b2, B:101:0x0170, B:104:0x00ff, B:105:0x0103, B:107:0x0109, B:114:0x008e), top: B:22:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2 A[Catch: Exception -> 0x01b8, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b8, blocks: (B:23:0x0052, B:25:0x006d, B:26:0x0072, B:28:0x008a, B:30:0x0095, B:35:0x00ab, B:37:0x00ba, B:39:0x00ea, B:40:0x00c6, B:42:0x00d2, B:45:0x00d6, B:49:0x011c, B:51:0x0122, B:54:0x012a, B:62:0x0131, B:64:0x0138, B:65:0x013c, B:67:0x0142, B:69:0x0153, B:71:0x0157, B:75:0x0163, B:79:0x0178, B:81:0x0184, B:82:0x0186, B:84:0x018e, B:86:0x0194, B:73:0x0168, B:87:0x0198, B:89:0x019e, B:91:0x01aa, B:93:0x01b2, B:101:0x0170, B:104:0x00ff, B:105:0x0103, B:107:0x0109, B:114:0x008e), top: B:22:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5T.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List):void");
    }

    public static final void LIZJ(VideoPublishEditModel mModel, List anchors) {
        NLEModel LIZIZ;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        if (!HRX.LIZIZ() || !mModel.isCurrentAutoCutMode() || mModel.shouldReuseAutoCutAnchor() || (LIZIZ = C136155Vz.LIZIZ(mModel)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) C45087Hml.LJIILIIL(LIZIZ);
        if (arrayList.size() > 35) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(Float.valueOf(((Number) it.next()).floatValue()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sound_sync_clip_durations", jSONArray);
        String LJFF = C86V.LJFF(R.string.taz);
        o.LJIIIIZZ(LJFF, "getString(R.string.ugctemplate_entry_title)");
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "contentJson.toString()");
        ((ArrayList) anchors).add(new CreateAnchorInfo(66, LJFF, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", Long.valueOf(SystemClock.elapsedRealtime()), "", null, null, null, null, false, 7936, null));
    }

    public static final void LIZLLL(VideoPublishEditModel mModel, List anchors) {
        String keyword;
        EnumC42894GsU enumC42894GsU;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        C78934UyQ.LJLIL.LIZLLL();
        if (!MEX.LIZLLL()) {
            C78934UyQ.LJLIL.LIZLLL().getClass();
            if (!CommonFeedApiService.LIZ().LJJ()) {
                return;
            }
        }
        ArrayList<LibraryMaterialInfoSv> list = mModel.libraryMaterialList;
        if (list == null || list.isEmpty()) {
            return;
        }
        o.LJIIIIZZ(list, "list");
        Iterator<LibraryMaterialInfoSv> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            LibraryMaterialInfoSv next = it.next();
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                LibraryMaterialInfoSv libraryMaterialInfoSv = next;
                Integer materialProvider = ((LibraryMaterialInfoSv) ListProtector.get(list, i)).getMaterialProvider();
                if (materialProvider == null || materialProvider.intValue() != 2) {
                    Integer materialType = ((LibraryMaterialInfoSv) ListProtector.get(list, i)).getMaterialType();
                    if (materialType == null || (materialType.intValue() != 1 && materialType.intValue() != 2)) {
                        keyword = "";
                    } else {
                        keyword = C86V.LJFF(R.string.hrp);
                    }
                    if (C78685UuP.LJJJZ(keyword) && C78685UuP.LJJJZ(libraryMaterialInfoSv.getId())) {
                        String json = GsonProtectorUtils.toJson(new Gson(), ListProtector.get(list, i));
                        o.LJIIIIZZ(json, "Gson().toJson(libraryMaterialList[index])");
                        o.LJIIIIZZ(keyword, "keyword");
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        Integer materialType2 = libraryMaterialInfoSv.getMaterialType();
                        if (materialType2 != null) {
                            int intValue = materialType2.intValue();
                            EnumC42894GsU.Companion.getClass();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    enumC42894GsU = EnumC42894GsU.UNKNOWN;
                                } else {
                                    enumC42894GsU = EnumC42894GsU.GIF;
                                }
                            } else {
                                enumC42894GsU = EnumC42894GsU.VIDEO_CLIP;
                            }
                            str = enumC42894GsU.getType();
                        }
                        ((ArrayList) anchors).add(new CreateAnchorInfo(49, keyword, "", "", "", "https://p16.tiktokcdn.com/obj/tiktok-obj/library_anchor_icon.png", valueOf, json, null, null, str, null, false, 6912, null));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static void LJ(List list, AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
        String str;
        String str2;
        UrlModel iconUrl;
        List<String> urlList;
        UrlModel iconUrl2;
        List<String> urlList2;
        MvModel mvModel = aVUploadMiscInfoStruct.mvInfo;
        String str3 = null;
        if (mvModel != null) {
            str = mvModel.getName();
            if (str != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("add_from", 1);
                    jSONObject.put("third_id", aVUploadMiscInfoStruct.mvThemeId);
                    MvModel mvModel2 = aVUploadMiscInfoStruct.mvInfo;
                    if (mvModel2 != null && (iconUrl = mvModel2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        MvModel mvModel3 = aVUploadMiscInfoStruct.mvInfo;
                        if (mvModel3 != null && (iconUrl2 = mvModel3.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                            str3 = (String) ListProtector.get(urlList2, 0);
                        }
                        jSONObject.put("icon_url", str3);
                    }
                    jSONObject.put("mv_template_type", aVUploadMiscInfoStruct.mvType);
                } catch (Exception unused) {
                }
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                if (aVUploadMiscInfoStruct.mvType == EnumC43998HOo.CUT_SAME.getValue()) {
                    str2 = "capcut";
                } else {
                    str2 = "";
                }
                ((ArrayList) list).add(new CreateAnchorInfo(29, str, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", -1L, null, null, null, str2, null, false, 7040, null));
                return;
            }
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[addMiscInfoAnchors] : keyword = ");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void LJFF(VideoPublishEditModel mModel, List anchors) {
        String LIZJ;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        if (mModel.isPhotoMvMode || (LIZJ = C75792yF.LIZJ(mModel.uploadMiscInfoStruct)) == null || LIZJ.length() == 0) {
            return;
        }
        try {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = mModel.uploadMiscInfoStruct;
            o.LJIIIIZZ(aVUploadMiscInfoStruct, "mModel.uploadMiscInfoStruct");
            LJ(anchors, aVUploadMiscInfoStruct);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJI(VideoPublishEditModel mModel, List anchors) {
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        if (!HRX.LIZIZ() || !mModel.shouldReuseAutoCutAnchor()) {
            return;
        }
        AutoCutAnchorModel autoCutAnchorModel = mModel.creativeModel.autoCutAnchorModel;
        String LJFF = C86V.LJFF(R.string.taz);
        o.LJIIIIZZ(LJFF, "getString(R.string.ugctemplate_entry_title)");
        String str = autoCutAnchorModel.url;
        if (str == null) {
            str = "";
        }
        String str2 = autoCutAnchorModel.language;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = autoCutAnchorModel.content;
        if (str3 == null) {
            str3 = "";
        }
        ((ArrayList) anchors).add(new CreateAnchorInfo(66, LJFF, str, str2, str3, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", Long.valueOf(SystemClock.elapsedRealtime()), null, null, null, null, null, false, 8064, null));
    }

    public static final void LJII(VideoPublishEditModel mModel, List list) {
        List<String> urlList;
        UrlModel thumbnail;
        List<String> urlList2;
        int i;
        o.LJIIIZ(mModel, "mModel");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            return;
        }
        if (!e1.LIZ(31744, "studio_creation_enable_ugc_template_anchor", true, false) && !e1.LIZ(31744, "enable_pugc_template_anchor", true, false)) {
            return;
        }
        if (mModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor == null) {
            Boolean LIZLLL = C141365gi.LIZLLL(mModel);
            if (LIZLLL != null) {
                mModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor = Boolean.valueOf(LIZLLL.booleanValue());
            } else {
                return;
            }
        }
        if (!o.LJ(mModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor, Boolean.TRUE)) {
            return;
        }
        AnchorCommonStruct anchorCommonStruct = mModel.creativeModel.ugcTemplateData.ugcTemplateOriginAnchor;
        JSONObject jSONObject = new JSONObject();
        String str = "";
        String str2 = null;
        if (anchorCommonStruct != null) {
            try {
                UrlModel thumbnail2 = anchorCommonStruct.getThumbnail();
                if (thumbnail2 != null && (urlList = thumbnail2.getUrlList()) != null && !urlList.isEmpty()) {
                    if (anchorCommonStruct != null && (thumbnail = anchorCommonStruct.getThumbnail()) != null && (urlList2 = thumbnail.getUrlList()) != null) {
                        str2 = (String) ListProtector.get(urlList2, 0);
                    }
                    jSONObject.put("icon_url", str2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        String str3 = mModel.creativeModel.ugcTemplateData.ugcTemplateId;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("third_id", str3);
        if (anchorCommonStruct != null) {
            if (mModel.creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor) {
                i = 78;
            } else {
                i = 65;
            }
            String LJFF = C86V.LJFF(R.string.taz);
            o.LJIIIIZZ(LJFF, "getString(R.string.ugctemplate_entry_title)");
            String url = anchorCommonStruct.getUrl();
            if (url != null) {
                str = url;
            }
            String language = anchorCommonStruct.getLanguage();
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
            ((ArrayList) list).add(new CreateAnchorInfo(i, LJFF, str, language, jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", Long.valueOf(SystemClock.elapsedRealtime()), anchorCommonStruct.getExtra(), null, null, null, null, false, 7936, null));
        }
    }

    public static final void LJIIIIZZ(VideoPublishEditModel mModel, List anchors) {
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && C00F.LIZ(31744, 0, "studio_creation_enable_sound_sync_anchor", true) == 1 && mModel.editMusicSyncMode) {
            ArrayList<Float> curMultiEditVideoDurations = mModel.getCurMultiEditVideoDurations();
            o.LJIIIIZZ(curMultiEditVideoDurations, "mModel.curMultiEditVideoDurations");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<Float> it = curMultiEditVideoDurations.iterator();
            while (it.hasNext()) {
                jSONArray.put(Float.valueOf(it.next().floatValue()));
            }
            jSONObject.put("sound_sync_clip_durations", jSONArray);
            String musicCover = mModel.getMusicCover();
            if (musicCover == null) {
                musicCover = "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png";
            }
            jSONObject.put("icon_url", musicCover);
            String LJFF = C86V.LJFF(R.string.rh4);
            o.LJIIIIZZ(LJFF, "getString(R.string.soundsync_anchor)");
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "content.toString()");
            ((ArrayList) anchors).add(new CreateAnchorInfo(60, LJFF, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", null, null, null, null, null, null, false, 8128, null));
        }
    }
}

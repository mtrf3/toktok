package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterialKt;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H7P {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (r0 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r27) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7P.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static void LIZ(VideoPublishEditModel args, LinkedHashMap linkedHashMap) {
        boolean z;
        Integer num;
        o.LJIIIZ(args, "args");
        CommentVideoModel commentVideoModel = args.commentVideoModel;
        if (commentVideoModel != null) {
            String replyToReplyId = commentVideoModel.getReplyToReplyId();
            if (replyToReplyId == null || replyToReplyId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if ((!C45940I1g.LIZIZ() || I1S.LIZ()) && !z2) {
                linkedHashMap.put("reply_id", args.commentVideoModel.getCommentId());
            } else {
                linkedHashMap.put("reply_id", args.commentVideoModel.getReplyId());
            }
            linkedHashMap.put("reply_to_reply_id", args.commentVideoModel.getReplyToReplyId());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(args.commentVideoModel.getChannelId());
            LIZ.append("");
            linkedHashMap.put("channel_id", X1D.LIZIZ(LIZ));
            linkedHashMap.put("reply_aweme_id", args.commentVideoModel.getAwemeId());
            linkedHashMap.put("reply_user_id", args.commentVideoModel.getUserId());
            CommentVideoModel.Type type = args.commentVideoModel.getType();
            if (type != null) {
                num = Integer.valueOf(type.getCode());
            } else {
                num = null;
            }
            linkedHashMap.put("video_reply_type", String.valueOf(num));
        }
    }

    public static void LIZIZ(VideoPublishEditModel mModel, List anchors) {
        ArrayList<TimeSpeedModelExtension> finalVideoList;
        boolean z;
        SimpleEffect effectInfo;
        String name;
        String str;
        long currentTimeMillis;
        StickerInfo stickerInfo;
        UrlModel iconUrl;
        List<String> urlList;
        Object obj;
        UrlModel iconUrl2;
        List<String> urlList2;
        SimpleEffect effectInfo2;
        String extra;
        boolean z2;
        int optInt;
        int optInt2;
        long currentTimeMillis2;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        JSONObject jSONObject = new JSONObject();
        if (H7R.LJJJLL(mModel)) {
            String str2 = mModel.mStickerID;
            RecordEffectModel recordEffectModel = mModel.creativeModel.recordEffectModel;
            finalVideoList = C47261Igj.LJII(new TimeSpeedModelExtension(1000, 1.0d, str2, null, null, null, null, null, null, recordEffectModel.stickerInfo, recordEffectModel.effectInfo, null, null, null, null, null, 0, false, 0, false, null, null, null, null, null, new BeautyMetadata(), null, null, null, false, 0, null, false, null));
        } else {
            finalVideoList = mModel.deepCopyFinalVideoList();
        }
        o.LJIIIIZZ(finalVideoList, "finalVideoList");
        if (finalVideoList.size() > 1) {
            C40675Fxn.LJJLIIIJ(finalVideoList, new IDComparatorS30S0000000_2(10));
        }
        Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            String stickerId = next.getStickerId();
            if (stickerId == null || stickerId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (effectInfo2 = next.getEffectInfo()) != null && (extra = effectInfo2.getExtra()) != null && extra.length() != 0) {
                try {
                    String extra2 = next.getEffectInfo().getExtra();
                    o.LJI(extra2);
                    JSONObject optJSONObject = new JSONObject(extra2).optJSONObject("linked_anchor");
                    if (optJSONObject != null) {
                        int optInt3 = optJSONObject.optInt("type", -1);
                        String linkedAnchorKeyword = optJSONObject.optString("keyword");
                        String linkedAnchorUrl = optJSONObject.optString("url");
                        String stickerId2 = next.getStickerId();
                        o.LJIIIIZZ(stickerId2, "it.stickerId");
                        long parseLong = CastLongProtector.parseLong(stickerId2);
                        String optString = optJSONObject.optString("content");
                        if (optString == null || optString.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            optInt2 = 0;
                            optInt = 1;
                        } else {
                            JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("content"));
                            optInt = jSONObject2.optInt("add_from");
                            optInt2 = jSONObject2.optInt("ngo_id");
                            parseLong = jSONObject2.optLong("linked_effect_id");
                        }
                        String segmentBeginTime = next.getSegmentBeginTime();
                        if (segmentBeginTime == null || segmentBeginTime.length() == 0) {
                            currentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            String segmentBeginTime2 = next.getSegmentBeginTime();
                            o.LJIIIIZZ(segmentBeginTime2, "it.segmentBeginTime");
                            currentTimeMillis2 = CastLongProtector.parseLong(segmentBeginTime2);
                        }
                        if (linkedAnchorKeyword != null && linkedAnchorKeyword.length() != 0 && optInt3 != -1) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("add_from", optInt);
                            jSONObject3.put("ngo_id", optInt2);
                            jSONObject3.put("linked_effect_id", parseLong);
                            String jSONObject4 = jSONObject3.toString();
                            String LJ = LJ(next, mModel);
                            o.LJIIIIZZ(linkedAnchorKeyword, "linkedAnchorKeyword");
                            o.LJIIIIZZ(linkedAnchorUrl, "linkedAnchorUrl");
                            o.LJIIIIZZ(jSONObject4, "toString()");
                            ((ArrayList) anchors).add(new CreateAnchorInfo(optInt3, linkedAnchorKeyword, linkedAnchorUrl, "", jSONObject4, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(currentTimeMillis2), LJ, null, null, null, null, false, 7936, null));
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            String stickerId3 = next.getStickerId();
            if (stickerId3 != null && stickerId3.length() != 0 && (effectInfo = next.getEffectInfo()) != null && (name = effectInfo.getName()) != null && name.length() != 0) {
                jSONObject.put("add_from", 1);
                jSONObject.put("third_id", next.getStickerId());
                SimpleEffect effectInfo3 = next.getEffectInfo();
                if (effectInfo3 != null && (iconUrl = effectInfo3.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                    SimpleEffect effectInfo4 = next.getEffectInfo();
                    if (effectInfo4 != null && (iconUrl2 = effectInfo4.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                        obj = ListProtector.get(urlList2, 0);
                    } else {
                        obj = null;
                    }
                    jSONObject.put("icon_url", obj);
                }
                SimpleEffect effectInfo5 = next.getEffectInfo();
                if (effectInfo5 != null) {
                    str = effectInfo5.getName();
                } else {
                    str = null;
                }
                String segmentBeginTime3 = next.getSegmentBeginTime();
                if (segmentBeginTime3 == null || segmentBeginTime3.length() == 0) {
                    currentTimeMillis = System.currentTimeMillis();
                } else {
                    String segmentBeginTime4 = next.getSegmentBeginTime();
                    o.LJIIIIZZ(segmentBeginTime4, "it.segmentBeginTime");
                    currentTimeMillis = CastLongProtector.parseLong(segmentBeginTime4);
                }
                if (C78685UuP.LJJJZ(str) && (stickerInfo = next.getStickerInfo()) != null && stickerInfo.isEffectPassedModeration()) {
                    if (str == null) {
                        str = "";
                    }
                    String jSONObject5 = jSONObject.toString();
                    o.LJIIIIZZ(jSONObject5, "json.toString()");
                    ((ArrayList) anchors).add(new CreateAnchorInfo(28, str, "", "", jSONObject5, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_effect3x.png", Long.valueOf(currentTimeMillis), LJ(next, mModel), null, null, null, null, false, 7936, null));
                }
            }
        }
    }

    public static void LIZJ(VideoPublishEditModel mModel, List anchors) {
        boolean z;
        long j;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LJI() == 3) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SimpleTextStickerData> textStickerDataList = mModel.getTextStickerDataList();
        o.LJIIIIZZ(textStickerDataList, "mModel.textStickerDataList");
        for (SimpleTextStickerData simpleTextStickerData : textStickerDataList) {
            if (simpleTextStickerData.getHasReadTextAudio() && C78685UuP.LJJJZ(simpleTextStickerData.getVoiceEffectId()) && C78685UuP.LJJJZ(simpleTextStickerData.getVoiceAnchorName()) && !ORZ.LJLJJI(simpleTextStickerData.getVoiceAnchorName(), linkedHashSet)) {
                String voiceAnchorName = simpleTextStickerData.getVoiceAnchorName();
                o.LJI(voiceAnchorName);
                linkedHashSet.add(voiceAnchorName);
                String voiceAnchorName2 = simpleTextStickerData.getVoiceAnchorName();
                if (voiceAnchorName2 == null) {
                    voiceAnchorName2 = "";
                }
                String json = GsonProtectorUtils.toJson(C44172HVg.LIZIZ, new TTSVoiceStruct(simpleTextStickerData.getVoiceEffectId(), simpleTextStickerData.getVoiceEffectIconUrl(), simpleTextStickerData.getVoiceEffectResourceId()));
                o.LJIIIIZZ(json, "GSON.toJson(\n           …                        )");
                long j2 = 0;
                if (simpleTextStickerData.getTtsAnchorReleaseDate() > 0) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (currentTimeMillis >= simpleTextStickerData.getTtsAnchorReleaseDate()) {
                        FFL.LJIIIZ().getClass();
                        String LJIILJJIL = FFL.LJIILJJIL(31744, "tts_voice_anchor_release_duration", "", true);
                        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…hTTSABSwitch::class.java)");
                        if (LJIILJJIL.length() == 0) {
                            z = true;
                        } else {
                            long ttsAnchorReleaseDate = simpleTextStickerData.getTtsAnchorReleaseDate();
                            try {
                                FFL.LJIIIZ().getClass();
                                String LJIILJJIL2 = FFL.LJIILJJIL(31744, "tts_voice_anchor_release_duration", "", true);
                                o.LJIIIIZZ(LJIILJJIL2, "getInstance().getStringV…hTTSABSwitch::class.java)");
                                String lowerCase = LJIILJJIL2.toLowerCase(Locale.ROOT);
                                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                Pattern compile = PatternProtector.compile("[0-9]+h");
                                Pattern compile2 = PatternProtector.compile("[0-9]+m(?!s)");
                                Pattern compile3 = PatternProtector.compile("[0-9]+s");
                                Pattern compile4 = PatternProtector.compile("[0-9]+ms");
                                Matcher matcher = compile.matcher(lowerCase);
                                if (matcher.find()) {
                                    String group = matcher.group();
                                    o.LJIIIIZZ(group, "matcherH.group()");
                                    j = ERY.LIZ(group) + 0;
                                } else {
                                    j = 0;
                                }
                                Matcher matcher2 = compile2.matcher(lowerCase);
                                if (matcher2.find()) {
                                    String group2 = matcher2.group();
                                    o.LJIIIIZZ(group2, "matcherM.group()");
                                    j += ERY.LIZ(group2);
                                }
                                Matcher matcher3 = compile3.matcher(lowerCase);
                                if (matcher3.find()) {
                                    String group3 = matcher3.group();
                                    o.LJIIIIZZ(group3, "matcherS.group()");
                                    j += ERY.LIZ(group3);
                                }
                                Matcher matcher4 = compile4.matcher(lowerCase);
                                if (matcher4.find()) {
                                    String group4 = matcher4.group();
                                    o.LJIIIIZZ(group4, "matcherMS.group()");
                                    j += ERY.LIZ(group4);
                                }
                                j2 = j;
                            } catch (Exception unused) {
                            }
                            if (currentTimeMillis <= ttsAnchorReleaseDate + j2) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        ((ArrayList) anchors).add(new CreateAnchorInfo(50, voiceAnchorName2, "", "", json, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/tts_voice_anchor_icon.png", null, null, null, null, null, null, z, 4032, null));
                    }
                }
                z = false;
                ((ArrayList) anchors).add(new CreateAnchorInfo(50, voiceAnchorName2, "", "", json, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/tts_voice_anchor_icon.png", null, null, null, null, null, null, z, 4032, null));
            }
        }
    }

    public static void LIZLLL(VideoPublishEditModel mModel, List anchors) {
        boolean z;
        String str;
        VecNLETrackSPtr tracks;
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(mModel, "mModel");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LJI() == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZJ = C1B8.LIZJ();
        boolean LJIIIIZZ = C1DG.LJIIIIZZ();
        if (z || !LIZJ || LJIIIIZZ || (str = mModel.nleData) == null || str.length() == 0) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(mModel.nleData);
        NLEModel LJ = nLEEditor.LJ();
        if (LJ == null || (tracks = LJ.getTracks()) == null || tracks.isEmpty()) {
            return;
        }
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next != null && next.hasExtra("extra_voice_chang_effect_id")) {
                    String extra = next.getExtra("extra_voice_chang_effect_id");
                    o.LJIIIIZZ(extra, "nleTrackSlot.getExtra(EXTRA_VC_EFFECT_ID)");
                    if (extra.length() > 0 && !linkedHashSet.contains(next.getExtra("extra_voice_chang_effect_id"))) {
                        String voiceId = next.getExtra("extra_voice_chang_effect_id");
                        String extra2 = next.getExtra("extra_voice_chang_effect_anchor_name");
                        String extra3 = next.getExtra("extra_voice_chang_effect_icon_url");
                        String extra4 = next.getExtra("extra_voice_chang_effect_resource_id");
                        o.LJIIIIZZ(voiceId, "voiceId");
                        linkedHashSet.add(voiceId);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("effect_id", voiceId);
                            jSONObject.put("icon_url", extra3);
                            jSONObject.put("resource_id", extra4);
                            if (extra2 == null) {
                                extra2 = "";
                            }
                            String jSONObject2 = jSONObject.toString();
                            long currentTimeMillis = System.currentTimeMillis();
                            o.LJIIIIZZ(jSONObject2, "toString()");
                            ((ArrayList) anchors).add(new CreateAnchorInfo(72, extra2, "", "", jSONObject2, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/vc_filter_anchor_icon.png", Long.valueOf(currentTimeMillis), null, null, null, null, null, true, 3968, null));
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                }
            }
        }
    }

    public static String LJ(TimeSpeedModelExtension timeSpeedModelExtension, VideoPublishEditModel videoPublishEditModel) {
        try {
            JSONObject jSONObject = new JSONObject();
            Integer type = GreenScreenMaterialKt.getType(timeSpeedModelExtension);
            if (type != null) {
                jSONObject.put("green_screen_materials_type", type.intValue());
            }
            boolean z = false;
            if (C69162nY.LIZ()) {
                List<UploadableMobileEffect2> list = videoPublishEditModel.creativeModel.mobileEffectsModel2.exportedEffects;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<UploadableMobileEffect2> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (o.LJ(it.next().effectId, timeSpeedModelExtension.getStickerId())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    jSONObject.put("mobile_effect_type", true);
                }
            } else {
                List<UploadableMobileEffect> list2 = videoPublishEditModel.creativeModel.mobileEffectsModel.exportedEffects;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<UploadableMobileEffect> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (o.LJ(it2.next().effectId, timeSpeedModelExtension.getStickerId())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    jSONObject.put("mobile_effect_type", true);
                }
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            return jSONObject2;
        } catch (JSONException unused) {
            String jSONObject3 = new JSONObject().toString();
            o.LJIIIIZZ(jSONObject3, "JSONObject().toString()");
            return jSONObject3;
        }
    }

    public static boolean LJI(VideoPublishEditModel mModel, List anchors) {
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(anchors, "anchors");
        if ((!mModel.getEditEffectModel().effectList.isEmpty()) && C164446cq.LIZ) {
            Iterator it = ((ArrayList) anchors).iterator();
            while (it.hasNext()) {
                CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) it.next();
                if (createAnchorInfo.getType() != 65 && createAnchorInfo.getType() != 66 && createAnchorInfo.getType() != 78) {
                }
            }
            return true;
        }
        return false;
    }
}

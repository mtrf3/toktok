package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.editpost.PoiEditInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.api.EditPostApi$Api;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GaX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41781GaX extends AbstractC43455H3r {
    public C43403H1r LJFF;
    public C67996QmO LJI;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.EDIT_POST;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C41819Gb9 r3) {
        /*
            r2 = this;
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L13
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            java.lang.Throwable r1 = r3.getCause()
            r0 = 5555(0x15b3, float:7.784E-42)
            int r1 = X.C42991Gu3.LJI(r0, r1)
            goto L14
        L13:
            r1 = -2
        L14:
            X.QmO r0 = r2.LJI
            if (r0 == 0) goto L1c
            r0.LIZLLL(r1, r3)
            return
        L1c:
            java.lang.String r0 = "nodeCallback"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41781GaX.LJIIJJI(X.Gb9):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        EditPostCheckResult editPostCheckResult;
        String str;
        PoiData poiData;
        String poiId;
        String str2;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel displayImageNoWatermark;
        String uri;
        boolean z;
        o.LJIIIZ(args, "args");
        this.LJI = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJFF = (C43403H1r) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof ERL) {
                            if (next2 != null) {
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43397H1l) {
                                        if (next3 != null) {
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj = it4.next();
                                                    if (obj instanceof C41785Gab) {
                                                        break;
                                                    }
                                                } else {
                                                    obj = null;
                                                    break;
                                                }
                                            }
                                            if (!(obj instanceof C41785Gab)) {
                                                obj = null;
                                            }
                                            C41785Gab c41785Gab = (C41785Gab) obj;
                                            C43403H1r c43403H1r = this.LJFF;
                                            if (c43403H1r != null) {
                                                VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
                                                EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
                                                if (editPostModel == null || (editPostCheckResult = editPostModel.getEditPostCheckResult()) == null) {
                                                    LJIIJJI(new C41819Gb9(null, new C2R2("edit post fields is null", null, 2, null), 1, null));
                                                    return;
                                                }
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                GVN gvn = G9Z.LIZ;
                                                if (gvn != null && (str = gvn.LIZ) != null) {
                                                    linkedHashMap.put("aweme_id", str);
                                                    linkedHashMap.put("creation_id", videoPublishEditModel.creativeInfo.getCreationId());
                                                    String str3 = "";
                                                    if (editPostCheckResult.isTitleChanged() || editPostCheckResult.isHashtagEdited() || editPostCheckResult.isAtFriendEdited() || editPostCheckResult.isMentionVideoEdited()) {
                                                        linkedHashMap.put("is_text_changed", "1");
                                                        String str4 = videoPublishEditModel.creativeModel.postPageModel.markupCaption;
                                                        if (str4 == null) {
                                                            str4 = "";
                                                        }
                                                        linkedHashMap.put("markup_text", str4);
                                                        List<AVTextExtraStruct> list = videoPublishEditModel.creativeModel.postPageModel.markupExtra;
                                                        if (!list.isEmpty()) {
                                                            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), list);
                                                            o.LJIIIIZZ(json, "getAPI().getGson().toJson(markupMetadata)");
                                                            linkedHashMap.put("text_extra", json);
                                                        }
                                                    }
                                                    if (editPostCheckResult.isHeadingChanged()) {
                                                        linkedHashMap.put("is_title_changed", "1");
                                                        String str5 = videoPublishEditModel.heading;
                                                        if (str5 == null) {
                                                            str5 = "";
                                                        }
                                                        linkedHashMap.put("title", str5);
                                                    }
                                                    if (editPostCheckResult.isCoverEdited()) {
                                                        linkedHashMap.put("is_cover_changed", "1");
                                                        if (!H7R.LJJJJL(videoPublishEditModel)) {
                                                            linkedHashMap.put("cover_tsp", String.valueOf(videoPublishEditModel.mVideoCoverStartTm));
                                                        } else {
                                                            int[] LIZJ = C42299Git.LIZJ(C44729Hgz.LJIJI(videoPublishEditModel));
                                                            linkedHashMap.put("image_cover_width", String.valueOf(LIZJ[0]));
                                                            linkedHashMap.put("image_cover_height", String.valueOf(LIZJ[1]));
                                                        }
                                                        if (c41785Gab != null) {
                                                            str2 = c41785Gab.LJLIL;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (C78685UuP.LJJJZ(str2)) {
                                                            if (H7R.LJJJJL(videoPublishEditModel)) {
                                                                linkedHashMap.put("image_cover_uri", str2);
                                                            } else {
                                                                linkedHashMap.put("cover_text_uri", str2);
                                                            }
                                                            CreateAwemeCoverInfo createAwemeCoverInfo = videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getCreateAwemeCoverInfo();
                                                            if (createAwemeCoverInfo != null) {
                                                                linkedHashMap.put("is_cover_text", String.valueOf(createAwemeCoverInfo.isCoverText()));
                                                                linkedHashMap.put("is_cover_positioned", String.valueOf(createAwemeCoverInfo.isCoverPositioned()));
                                                                try {
                                                                    JSONObject jSONObject = new JSONObject();
                                                                    CreateAwemeCoverTextAttr coverTextAttr = createAwemeCoverInfo.getCoverTextAttr();
                                                                    String coverTextId = coverTextAttr.getCoverTextId();
                                                                    String coverTextFont = coverTextAttr.getCoverTextFont();
                                                                    String covertTextColor = coverTextAttr.getCovertTextColor();
                                                                    if (!TextUtils.isEmpty(coverTextId)) {
                                                                        jSONObject.put("cover_text_id", coverTextId);
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    if (!TextUtils.isEmpty(coverTextFont)) {
                                                                        jSONObject.put("cover_text_font", coverTextFont);
                                                                        z = true;
                                                                    }
                                                                    if (!TextUtils.isEmpty(covertTextColor)) {
                                                                        jSONObject.put("cover_text_color", covertTextColor);
                                                                    } else if (z) {
                                                                    }
                                                                    String jSONObject2 = jSONObject.toString();
                                                                    o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                                                                    linkedHashMap.put("cover_text_attr", jSONObject2);
                                                                } catch (Exception e) {
                                                                    H78.LJ(e);
                                                                }
                                                            }
                                                        } else if (H7R.LJJJJL(videoPublishEditModel)) {
                                                            int imageCurrentIndex = videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex();
                                                            EditPostModel editPostModel2 = videoPublishEditModel.creativeModel.editPostModel;
                                                            if (editPostModel2 != null && (imageList = editPostModel2.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(imageCurrentIndex, imageList)) != null && (displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark()) != null && (uri = displayImageNoWatermark.getUri()) != null && uri.length() != 0) {
                                                                linkedHashMap.put("image_cover_uri", uri);
                                                            }
                                                        }
                                                        C43403H1r c43403H1r2 = this.LJFF;
                                                        if (c43403H1r2 != null) {
                                                            if (c43403H1r2.LIZ.getCoverPublishModel().getEffectTextModel().getHasCoverText()) {
                                                                C43403H1r c43403H1r3 = this.LJFF;
                                                                if (c43403H1r3 != null) {
                                                                    if (c43403H1r3.LIZ.getCoverPublishModel().getEffectTextModel().getTextSticker() != null) {
                                                                        try {
                                                                            C43403H1r c43403H1r4 = this.LJFF;
                                                                            if (c43403H1r4 != null) {
                                                                                List<String> LIZIZ = C149105tC.LIZIZ(c43403H1r4.LIZ.getCoverPublishModel().getEffectTextModel().getTextSticker());
                                                                                ArrayList arrayList = (ArrayList) LIZIZ;
                                                                                if (arrayList.size() == 1) {
                                                                                    linkedHashMap.put("cover_text", ListProtector.get(LIZIZ, 0));
                                                                                } else if (arrayList.size() > 1) {
                                                                                    String json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LIZIZ);
                                                                                    o.LJIIIIZZ(json2, "getAPI().getGson().toJson(coverTexts)");
                                                                                    linkedHashMap.put("cover_text", json2);
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("editModelContainer");
                                                                                throw null;
                                                                            }
                                                                        } catch (JSONException e2) {
                                                                            C16880lQ.LLLLIIL(e2);
                                                                        }
                                                                    }
                                                                } else {
                                                                    o.LJIJI("editModelContainer");
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            o.LJIJI("editModelContainer");
                                                            throw null;
                                                        }
                                                    }
                                                    EditPostModel editPostModel3 = videoPublishEditModel.creativeModel.editPostModel;
                                                    if (editPostModel3 != null && editPostCheckResult.getPoiChangedType().getValue() < EditPostPoiChangeType.values().length && editPostCheckResult.getPoiChangedType().getValue() > EditPostPoiChangeType.UNKNOWN.getValue()) {
                                                        int i = C41784Gaa.LIZ[editPostCheckResult.getPoiChangedType().ordinal()];
                                                        if (i != 1 && i != 2) {
                                                            if (i == 3) {
                                                                poiData = editPostModel3.getOriginPoiData();
                                                            }
                                                        } else {
                                                            poiData = editPostModel3.getPoiData();
                                                        }
                                                        C51556KLg.LIZ.getClass();
                                                        CreateAnchorInfo LJJJJJ = C51556KLg.LIZ().LJJJJJ(poiData);
                                                        int value = editPostCheckResult.getPoiChangedType().getValue();
                                                        if (poiData != null && (poiId = poiData.getPoiId()) != null) {
                                                            str3 = poiId;
                                                        }
                                                        String json3 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), new PoiEditInfo(value, str3, LJJJJJ));
                                                        o.LJIIIIZZ(json3, "getAPI().getGson().toJson(poiEditInfo)");
                                                        linkedHashMap.put("poi_info", json3);
                                                    }
                                                    try {
                                                        LJII().LIZIZ();
                                                        EditPostResponse editPostResponse = ((EditPostApi$Api) V0N.LJIILIIL(EditPostApi$Api.class)).createEditPost(linkedHashMap).execute().LIZIZ;
                                                        o.LJIIIIZZ(editPostResponse, "externalDependency.getNe…(fields).execute().body()");
                                                        EditPostResponse editPostResponse2 = editPostResponse;
                                                        C67996QmO c67996QmO2 = this.LJI;
                                                        if (c67996QmO2 != null) {
                                                            c67996QmO2.LJ(editPostResponse2, false);
                                                            return;
                                                        } else {
                                                            o.LJIJI("nodeCallback");
                                                            throw null;
                                                        }
                                                    } catch (Exception e3) {
                                                        LJIIJJI(new C41819Gb9(null, e3, 1, null));
                                                        return;
                                                    }
                                                }
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            o.LJIJI("editModelContainer");
                                            throw null;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}

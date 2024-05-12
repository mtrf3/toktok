package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.C10K;
import X.C16880lQ;
import X.C176676wZ;
import X.C252699vt;
import X.C46104I7o;
import X.C65087PgZ;
import X.C76F;
import X.C76H;
import X.C76K;
import X.C76L;
import X.C778133p;
import X.C78939UyV;
import X.C7HV;
import X.C84339X8d;
import X.C84340X8e;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.EJ6;
import X.InterfaceC195737mD;
import X.InterfaceC195767mG;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC789838c;
import X.InterfaceC84349X8n;
import X.J7H;
import X.V0N;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.commentlist.api.interceptor.TabletCommonParamsInterceptor;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentGifPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentApi {
    public static final InterfaceC789838c LIZ;

    /* loaded from: classes4.dex */
    public interface RealApi {
        @E4Q("/aweme/v1/comment/delete/")
        C76L<BaseCommentResponse> deleteComment(@InterfaceC64989Pez("cid") String str, @InterfaceC64989Pez("channel_id") int i, @InterfaceC64989Pez("scenario") int i2);

        @E4Q("/aweme/v1/comment/delete/")
        C76L<BaseCommentResponse> deleteComment(@InterfaceC64989Pez("cid") String str, @InterfaceC64989Pez("channel_id") int i, @InterfaceC64989Pez("action") int i2, @InterfaceC64989Pez("scenario") int i3);

        @E4Q("/aweme/v1/comment/digg/")
        C76L<BaseCommentResponse> diggComment(@InterfaceC64989Pez("cid") String str, @InterfaceC64989Pez("aweme_id") String str2, @InterfaceC64989Pez("digg_type") String str3, @InterfaceC64989Pez("channel_id") int i);

        @E4T("/aweme/v2/comment/upload/auth/")
        AbstractC73672Svk<CommentImageUploadAuth> fetchCommentImageUploadAuth();

        @E4Q("/aweme/v1/comment/list/")
        C76L<CommentItemList> fetchCommentList(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("comment_style") int i2, @InterfaceC64989Pez("digged_cid") String str2, @InterfaceC64989Pez("insert_cids") String str3, @InterfaceC64989Pez("user_avatar_shrink") String str4);

        @E4Q("/aweme/v2/comment/list/")
        C10K<CommentItemList> fetchCommentListV2(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("insert_ids") String str2, @InterfaceC64989Pez("forward_page_type") int i2, @InterfaceC64989Pez("ad_creative_id") Long l, @InterfaceC64989Pez("channel_id") int i3, @InterfaceC64989Pez("user_avatar_shrink") String str3, @InterfaceC64989Pez("ad_pricing_type") int i4, @InterfaceC64989Pez("load_type") int i5, @InterfaceC64989Pez("comment_character_count_limit") int i6, @InterfaceC64989Pez("offline_pin_comment") int i7, @InterfaceC64989Pez("author_relation_type") int i8, @InterfaceC195737mD Object obj, @InterfaceC195767mG List<EJ6> list, @InterfaceC64989Pez("scenario") int i9, @InterfaceC64989Pez("enter_from") String str4, @InterfaceC64989Pez("comment_entity_words") String str5, @InterfaceC64989Pez("repost_insert_ids") String str6, @InterfaceC64989Pez("is_non_personalized") boolean z, @InterfaceC64989Pez("suggest_words") String str7);

        @E4Q("/aweme/v1/comment/story/replylist/")
        C76L<CommentItemList> fetchStoryReplyCommentList(@InterfaceC64989Pez("comment_id") String str, @InterfaceC64989Pez("user_avatar_shrink") String str2);

        @E4Q("/aweme/v1/comment/digg/")
        AbstractC73672Svk<BaseCommentResponse> likeComment(@InterfaceC64989Pez("cid") String str, @InterfaceC64989Pez("aweme_id") String str2, @InterfaceC64989Pez("digg_type") String str3, @InterfaceC64989Pez("channel_id") int i);

        @E4Q("/aweme/v1/comment/list/reply/")
        C10K<CommentItemList> loadMoreCommentList(@InterfaceC64989Pez("comment_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("top_ids") String str2, @InterfaceC64989Pez("item_id") String str3, @InterfaceC64989Pez("insert_ids") String str4, @InterfaceC64989Pez("channel_id") int i2, @InterfaceC64989Pez("user_avatar_shrink") String str5, @InterfaceC64989Pez("need_translation") boolean z, @InterfaceC64989Pez("comment_character_count_limit") int i3, @InterfaceC64989Pez("trg_lang") String str6, @InterfaceC64989Pez("author_relation_type") int i4, @InterfaceC64989Pez("enter_from") String str7, @InterfaceC64989Pez("comment_entity_words") String str8, @InterfaceC64989Pez("is_non_personalized") boolean z2);

        @E4Q("/aweme/v2/comment/list/")
        C76L<CommentItemList> preloadCommentList(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("insert_ids") String str2, @InterfaceC64989Pez("forward_page_type") int i2, @InterfaceC64989Pez("ad_creative_id") Long l, @InterfaceC64989Pez("channel_id") int i3, @InterfaceC64989Pez("user_avatar_shrink") String str3, @InterfaceC64989Pez("ad_pricing_type") int i4, @InterfaceC64989Pez("comment_character_count_limit") int i5, @InterfaceC64989Pez("offline_pin_comment") int i6, @InterfaceC64989Pez("author_relation_type") int i7, @InterfaceC64989Pez("load_type") int i8, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("scenario") int i9, @InterfaceC64989Pez("enter_from") String str4, @InterfaceC64989Pez("is_non_personalized") boolean z, @InterfaceC64989Pez("suggest_words") String str5);

        @InterfaceC195787mI
        @E4T("/aweme/v1/comment/publish/")
        C76L<CommentResponse> publishComment(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("text") String str2, @InterfaceC64987Pex("reply_id") String str3, @InterfaceC64987Pex("text_extra") String str4, @InterfaceC64987Pex("image_extra") String str5, @InterfaceC64987Pex("is_self_see") int i, @InterfaceC64987Pex("reply_to_reply_id") String str6, @InterfaceC64987Pex("channel_id") int i2, @InterfaceC64987Pex("action_type") int i3, @InterfaceC64987Pex("ad_info") String str7, @InterfaceC64987Pex("publish_scenario") int i4);

        @InterfaceC195787mI
        @E4T("/aweme/v1/comment/publish/")
        C76L<CommentResponse> publishCommentCheck(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("text") String str2, @InterfaceC64987Pex("reply_id") String str3, @InterfaceC64987Pex("text_extra") String str4, @InterfaceC64987Pex("image_extra") String str5, @InterfaceC64987Pex("is_self_see") int i, @InterfaceC64987Pex("reply_to_reply_id") String str6, @InterfaceC64987Pex("channel_id") int i2, @InterfaceC64987Pex("action_type") int i3, @InterfaceC64987Pex("ad_info") String str7, @InterfaceC64987Pex("publish_scenario") int i4, @InterfaceC64987Pex("skip_rethink") int i5);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/gift/send/")
        C76L<CommentResponse> publishGiftComment(@InterfaceC64987Pex("gift_id") String str, @InterfaceC64987Pex("aweme_id") String str2, @InterfaceC64987Pex("comment_publish_request") String str3, @InterfaceC64987Pex("is_from_gift_bag") boolean z);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/gift/send/")
        C76L<CommentResponse> publishGiftOnlyComment(@InterfaceC64987Pex("gift_id") String str, @InterfaceC64987Pex("aweme_id") String str2, @InterfaceC64987Pex("is_from_gift_bag") boolean z);
    }

    static {
        C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL(EFJ.LIZJ);
        c65087PgZ.LIZIZ(new TabletCommonParamsInterceptor());
        LIZ = c65087PgZ.LJFF();
    }

    public static String LJII() {
        int[] LIZ2 = J7H.LIZ(100);
        if (LIZ2 == null) {
            return "";
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZ2[0]);
        LIZ3.append("_");
        LIZ3.append(LIZ2[1]);
        return X1D.LIZIZ(LIZ3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommentGifPublishRequestModel LIZ(C176676wZ c176676wZ) {
        String str;
        CommentGifPublishRequestModel commentGifPublishRequestModel = new CommentGifPublishRequestModel();
        commentGifPublishRequestModel.setAid(c176676wZ.LIZ);
        commentGifPublishRequestModel.setText(c176676wZ.LIZIZ);
        commentGifPublishRequestModel.setReplyId(c176676wZ.LIZJ);
        commentGifPublishRequestModel.setStructList(c176676wZ.LIZLLL);
        Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
        List<CommentImageModel> list = c176676wZ.LJIJ;
        if (list != null) {
            str = GsonProtectorUtils.toJson(LIZ2, list);
        } else {
            str = "[]";
        }
        commentGifPublishRequestModel.setImageList(str);
        commentGifPublishRequestModel.setIsSelfSee(0);
        commentGifPublishRequestModel.setReplyToReplyId(c176676wZ.LJ);
        commentGifPublishRequestModel.setChannelId(c176676wZ.LJFF);
        commentGifPublishRequestModel.setActionType(0);
        commentGifPublishRequestModel.setAdInfo(LJFF(c176676wZ.LIZ));
        commentGifPublishRequestModel.setSendCommentType(c176676wZ.LJIILL);
        return commentGifPublishRequestModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommentPublishRequestModel LIZIZ(C176676wZ c176676wZ) {
        CommentPublishRequestModel commentPublishRequestModel = new CommentPublishRequestModel();
        commentPublishRequestModel.setAid(c176676wZ.LIZ);
        commentPublishRequestModel.setText(c176676wZ.LIZIZ);
        commentPublishRequestModel.setReplyId(c176676wZ.LIZJ);
        commentPublishRequestModel.setStructList(c176676wZ.LIZLLL);
        commentPublishRequestModel.setImageList(c176676wZ.LJIJ);
        commentPublishRequestModel.setIsSelfSee(0);
        commentPublishRequestModel.setReplyToReplyId(c176676wZ.LJ);
        commentPublishRequestModel.setChannelId(c176676wZ.LJFF);
        commentPublishRequestModel.setActionType(0);
        commentPublishRequestModel.setAdInfo(LJFF(c176676wZ.LIZ));
        commentPublishRequestModel.setSendCommentType(c176676wZ.LJIILL);
        return commentPublishRequestModel;
    }

    public static String LJFF(String str) {
        Aweme LIZ2;
        if (TextUtils.isEmpty(str) || CardStruct.IStatusCode.DEFAULT.equals(str) || (LIZ2 = C76K.LIZ().LIZ(str)) == null || !LIZ2.isAd() || LIZ2.getAwemeRawAd().getAdId() == null) {
            return null;
        }
        Long adId = LIZ2.getAwemeRawAd().getAdId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_id", adId);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public static CommentResponse LJIIIIZZ(C176676wZ c176676wZ) {
        List<CommentImageModel> list;
        try {
            CommentGifPublishRequestModel LIZ2 = LIZ(c176676wZ);
            if (V0N.LJJII(c176676wZ.LIZIZ) && (((list = c176676wZ.LJIJ) == null || list.isEmpty()) && c176676wZ.LJIILL == 0)) {
                return ((RealApi) LIZ.create(RealApi.class)).publishGiftOnlyComment(String.valueOf(c176676wZ.LJIIIIZZ), c176676wZ.LIZ, c176676wZ.LJIIIZ).get();
            }
            CommentResponse commentResponse = ((RealApi) LIZ.create(RealApi.class)).publishGiftComment(String.valueOf(c176676wZ.LJIIIIZZ), c176676wZ.LIZ, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZ2), c176676wZ.LJIIIZ).get();
            Comment comment = commentResponse.comment;
            if (comment != null) {
                comment.setLabelInfo(commentResponse.starFakeLabel);
                commentResponse.comment.setFakeId(c176676wZ.LJI);
                commentResponse.comment.setImageList(C78939UyV.LJFF(c176676wZ.LJIJ));
            } else {
                UpvoteStruct upvoteStruct = commentResponse.upvote;
                if (upvoteStruct != null) {
                    upvoteStruct.setImageList(C78939UyV.LJFF(c176676wZ.LJIJ));
                }
            }
            return commentResponse;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseCommentResponse LIZJ(int i, String str, String str2, String str3) {
        try {
            return ((RealApi) LIZ.create(RealApi.class)).diggComment(str, str2, str3, i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static void LJ(final int i, final int i2, final int i3, final int i4, final int i5, final C76F c76f, final Aweme aweme, final String str, final String str2, final String str3, final String str4) {
        if (!((Boolean) C778133p.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        InterfaceC84349X8n interfaceC84349X8n = new InterfaceC84349X8n() { // from class: X.76M
            public final /* synthetic */ long LJFF = 0;

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
            
                if (r7 == null) goto L8;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
            @Override // X.InterfaceC84349X8n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.X8W r25) {
                /*
                    r24 = this;
                    r0 = r24
                    java.lang.String r4 = r10
                    int r3 = r3
                    com.ss.android.ugc.aweme.feed.model.Aweme r7 = r9
                    java.lang.String r2 = r11
                    java.lang.String r14 = r12
                    long r11 = r0.LJFF
                    int r13 = r4
                    int r9 = r5
                    int r6 = r6
                    X.76F r5 = r8
                    java.lang.String r1 = r13
                    int r0 = r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.lang.String r10 = "aweme_id"
                    r8.add(r10)
                    java.lang.String r10 = "cursor"
                    r8.add(r10)
                    java.lang.String r10 = "load_type"
                    r8.add(r10)
                    java.lang.String r10 = "insert_ids"
                    r8.add(r10)
                    com.ss.android.ugc.aweme.preload.PreloadExtraInfo r18 = new com.ss.android.ugc.aweme.preload.PreloadExtraInfo
                    java.lang.String r20 = "comment"
                    java.lang.String r22 = "/aweme/v2/comment/list/"
                    r18 = r18
                    r19 = r3
                    r21 = r4
                    r23 = r8
                    r18.<init>(r19, r20, r21, r22, r23)
                    boolean r8 = X.V16.LJJJJL(r2, r7, r14)
                    if (r8 == 0) goto La9
                    if (r7 == 0) goto La9
                    java.lang.String r8 = r7.getAid()
                    int r17 = X.V16.LJJIII(r8, r2, r14)
                L54:
                    java.lang.String r8 = r7.getAid()
                    if (r8 != 0) goto La4
                L5a:
                    java.lang.String r10 = ""
                L5c:
                    r15 = 0
                    int r16 = X.C55688LtM.LIZ(r2)
                    r23 = r1
                    r20 = r6
                    r21 = r5
                    r22 = r2
                    r19 = r9
                    com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest r5 = com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi.LJI(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    java.lang.String r1 = "comment_preload_request"
                    r2.putExtra(r1, r5)
                    r1 = -1
                    if (r0 == r1) goto L81
                    java.lang.String r1 = "comment_ttl"
                    r2.putExtra(r1, r0)
                L81:
                    java.lang.String r0 = "enterFrom"
                    X.7au r1 = X.KNV.LIZLLL(r4, r0)
                    java.lang.String r0 = "enter_from"
                    r1.LJIIIZ(r0, r4)
                    java.lang.String r0 = "strategy_id"
                    r1.LIZLLL(r3, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
                    java.lang.String r0 = "comment_preload"
                    X.FMX.LJIIL(r0, r1)
                    android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r2)
                    java.lang.Class<com.ss.android.ugc.aweme.comment.preload.CommentPreload> r0 = com.ss.android.ugc.aweme.comment.preload.CommentPreload.class
                    r2 = r25
                    r2.LIZ(r1, r0)
                    return
                La4:
                    java.lang.String r10 = r7.getAid()
                    goto L5c
                La9:
                    r17 = 0
                    if (r7 != 0) goto L54
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C76M.LIZ(X.X8W):void");
            }
        };
        C84339X8d.LIZJ.getClass();
        C84340X8e.LIZIZ(interfaceC84349X8n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0019, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest LJI(java.lang.String r3, long r4, int r6, java.lang.String r7, java.lang.Long r8, int r9, int r10, java.lang.Object r11, int r12, int r13, X.C76F r14, java.lang.String r15, java.lang.String r16) {
        /*
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.o6(r3)
            if (r8 != 0) goto L19
            if (r1 == 0) goto L18
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            if (r0 == 0) goto L18
            boolean r0 = X.C63081OpJ.LJLIL(r1)
            if (r0 == 0) goto L5f
        L18:
            r8 = 0
        L19:
            if (r1 == 0) goto L5d
        L1b:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            int r2 = r0.getChargeType()
        L29:
            X.76G r1 = new X.76G
            r1.<init>(r3)
            r1.LIZIZ = r4
            r1.LIZJ = r6
            r1.LIZLLL = r7
            r0 = 1
            r1.LJ = r0
            r1.LJFF = r8
            r1.LJI = r9
            java.lang.String r0 = LJII()
            r1.LJII = r0
            r1.LJIIIIZZ = r2
            r1.LJIIIZ = r10
            r1.LJIIJ = r11
            r1.LJIIJJI = r12
            r1.LJIIL = r13
            int r0 = r14.getValue()
            r1.LJIILIIL = r0
            r1.LJIILJJIL = r15
            r0 = r16
            r1.LJIILL = r0
            com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest r0 = new com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest
            r0.<init>(r1)
            return r0
        L5d:
            r2 = 0
            goto L29
        L5f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            java.lang.Long r8 = r0.getCreativeId()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi.LJI(java.lang.String, long, int, java.lang.String, java.lang.Long, int, int, java.lang.Object, int, int, X.76F, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest");
    }

    public static C10K<CommentItemList> LJIIIZ(String str, long j, int i, String str2, String str3, String str4, int i2, boolean z, int i3, String str5, C76F c76f, String str6, String str7) {
        return ((RealApi) LIZ.create(RealApi.class)).loadMoreCommentList(str, j, i, str2, str3, str4, i2, LJII(), z, i3, str5, c76f.getValue(), str6, str7, Boolean.TRUE.equals(a.LJFF().LJFF().getValue()));
    }

    public static C10K<CommentItemList> LIZLLL(String str, long j, int i, String str2, Long l, int i2, int i3, int i4, int i5, C76F c76f, int i6, String str3, String str4, String str5) {
        C252699vt c252699vt;
        String str6;
        Long LJIJJLI;
        Aweme i62 = AwemeService.LIZ().i6(str);
        if (i62 != null && i62.getPreload() != null && i62.getPreload().commentPreload >= 0) {
            c252699vt = new C252699vt();
            C76H c76h = new C76H();
            c76h.LIZLLL = "cache_comment";
            c76h.LIZIZ = ImagePreloadExperiment.PRIORITY_DEFAULT;
            c76h.LIZ = 1;
            c252699vt.LJIJ.put(C76H.class, c76h);
        } else {
            c252699vt = null;
        }
        CommentPreloadRequest LJI = LJI(str, j, i, str2, l, i2, i3, c252699vt, i4, i5, c76f, str3, str5);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EJ6("check_preload", "true"));
        if (UpvoteServiceImpl.LJJIFFI().LJIJI().LIZ(i62) && (LJIJJLI = C7HV.LIZIZ.LJIJJLI(str)) != null) {
            str6 = LJIJJLI.toString();
        } else {
            str6 = "";
        }
        return ((RealApi) LIZ.create(RealApi.class)).fetchCommentListV2(LJI.aid, LJI.cursor, LJI.count, LJI.insertCids, LJI.forwardPageType, LJI.adCreativeId, LJI.channelId, LJI.userAvatarShrink, LJI.adPricingType, LJI.loadType, LJI.limitCount, LJI.offlinePin, LJI.authorRelationType, LJI.policy, arrayList, i6, str3, str4, str6, Boolean.TRUE.equals(a.LJFF().LJFF().getValue()), LJI.searchParams);
    }
}

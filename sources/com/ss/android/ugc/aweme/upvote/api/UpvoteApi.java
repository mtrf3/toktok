package com.ss.android.ugc.aweme.upvote.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.upvote.model.RepostListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteApi implements IUpvoteApi {
    public static final UpvoteApi LIZIZ = new UpvoteApi();
    public final /* synthetic */ IUpvoteApi LIZ;

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8M("tiktok/v1/upvote/delete")
    @InterfaceC195757mF
    public AbstractC73638SvC<BaseResponse> deleteUpvote(@InterfaceC64985Pev("item_id") String itemId) {
        o.LJIIIZ(itemId, "itemId");
        return this.LIZ.deleteUpvote(itemId);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8L("aweme/v1/comment/digg/")
    public AbstractC73672Svk<BaseResponse> digg(@InterfaceC64986Pew("cid") String cid, @InterfaceC64986Pew("aweme_id") String aid, @InterfaceC64986Pew("digg_type") int i) {
        o.LJIIIZ(cid, "cid");
        o.LJIIIZ(aid, "aid");
        return this.LIZ.digg(cid, aid, i);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8L("tiktok/v1/upvote/item/list")
    public AbstractC73672Svk<RepostListResponse> getRepostVideoList(@InterfaceC64986Pew("user_id") String userId, @InterfaceC64986Pew("offset") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("scene") Integer num) {
        o.LJIIIZ(userId, "userId");
        return this.LIZ.getRepostVideoList(userId, j, i, num);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8L("tiktok/v1/upvote/batch_list")
    public AbstractC73672Svk<UpvoteBatchListResponse> getUpvoteBatchList(@InterfaceC64986Pew("item_ids") String itemIds, @InterfaceC64986Pew("upvote_reasons") String upvoteReasons, @InterfaceC64986Pew("upvote_scene") Integer num, @InterfaceC64986Pew("insert_map") String str, @InterfaceC64986Pew("insert_map_uid") String str2, @InterfaceC64986Pew("is_non_personalized") boolean z) {
        o.LJIIIZ(itemIds, "itemIds");
        o.LJIIIZ(upvoteReasons, "upvoteReasons");
        return this.LIZ.getUpvoteBatchList(itemIds, upvoteReasons, num, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8L("tiktok/v1/upvote/list")
    public AbstractC73672Svk<UpvoteListResponse> getUpvoteList(@InterfaceC64986Pew("item_id") String itemId, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("insert_ids") String insertIds, @InterfaceC64986Pew("upvote_reason") String str, @InterfaceC64986Pew("scene") Integer num) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(insertIds, "insertIds");
        return this.LIZ.getUpvoteList(itemId, j, i, insertIds, str, num);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8M("tiktok/v1/upvote/publish")
    @InterfaceC195757mF
    public AbstractC73638SvC<UpvotePublishResponse> publishUpvote(@InterfaceC64985Pev("item_id") String itemId, @InterfaceC64985Pev("text") String str, @InterfaceC64985Pev("skip_rethink") Boolean bool, @InterfaceC64985Pev("text_extra") String str2, @InterfaceC64985Pev("image_extra") String str3) {
        o.LJIIIZ(itemId, "itemId");
        return this.LIZ.publishUpvote(itemId, str, bool, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8M("tiktok/v1/upvote/batch_publish")
    @InterfaceC195757mF
    public AbstractC73638SvC<UpvoteBatchPublishResponse> publishUpvoteBatch(@InterfaceC64985Pev("item_ids") String itemIds) {
        o.LJIIIZ(itemIds, "itemIds");
        return this.LIZ.publishUpvoteBatch(itemIds);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @E8M("/aweme/v1/contents/translation/")
    @InterfaceC195757mF
    public AbstractC73672Svk<MultiTranslationResult> translate(@InterfaceC64985Pev("trg_lang") String tarLang, @InterfaceC64985Pev("translation_info") String translationInfo, @InterfaceC64986Pew("scene") int i) {
        o.LJIIIZ(tarLang, "tarLang");
        o.LJIIIZ(translationInfo, "translationInfo");
        return this.LIZ.translate(tarLang, translationInfo, i);
    }

    public UpvoteApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IUpvoteApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IUpvoteApi.class);
    }
}

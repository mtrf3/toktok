package com.bytedance.android.live.broadcast.api.blockword;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordAddResponse;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import webcast.api.room.RecommendSensitiveWordResp;

/* loaded from: classes.dex */
public interface BlockWordApi {
    @E8L("/webcast/room/add_sensitive_word/")
    AbstractC73672Svk<C28467BFf<BlockWordAddResponse>> addBlockWord(@InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("word_list") String str2);

    @E8L("/webcast/room/add_sensitive_word/")
    AbstractC73672Svk<C28467BFf<BlockWordAddResponse>> addBlockWord(@InterfaceC64986Pew("word") String str, @InterfaceC64986Pew("sec_anchor_id") String str2, @InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/del_sensitive_word/")
    AbstractC73672Svk<C28467BFf<Object>> deleteBlockWord(@InterfaceC64986Pew("word_id") int i, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/get_sensitive_word/")
    AbstractC73672Svk<BaseResponse<BlockWordGetResponse, BlockWordGetExtra>> getBlockWord(@InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/recommend_sensitive_word/")
    AbstractC73672Svk<C28467BFf<RecommendSensitiveWordResp.ResponseData>> recommendBlockWord(@InterfaceC64986Pew("content") String str, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("action") int i);
}

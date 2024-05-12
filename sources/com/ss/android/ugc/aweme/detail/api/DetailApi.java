package com.ss.android.ugc.aweme.detail.api;

import X.E8L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.JBR;
import X.OSZ;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class DetailApi {
    public static final String LIZ;
    public static final IDetailApi LIZIZ;

    /* loaded from: classes10.dex */
    public interface IDetailApi {
        @E8L("/aweme/v1/aweme/detail/")
        InterfaceC37276Ek4<String> queryAweme(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("origin_type") String str2, @InterfaceC64986Pew("request_source") int i, @InterfaceC64986Pew("notice_source") int i2, @InterfaceC64986Pew("translator_id") String str3, @InterfaceC64986Pew("share_scene") int i3, @InterfaceC64986Pew("preload_type") int i4, @InterfaceC64986Pew("is_topview") int i5, @InterfaceC64986Pew("friend_relation_status") int i6);

        @E8M("/tiktok/v1/ad/experience/ad/history/detail/")
        @InterfaceC195757mF
        InterfaceC37276Ek4<String> queryAwemeFromInbox(@InterfaceC64985Pev("aweme_id") String str, @InterfaceC64985Pev("msg_extra") String str2);

        @E8M("/aweme/v1/multi/aweme/detail/")
        @InterfaceC195757mF
        InterfaceC37276Ek4<BatchDetailList> queryBatchAweme(@InterfaceC64985Pev("aweme_ids") String str, @InterfaceC64985Pev("origin_type") String str2, @InterfaceC64985Pev("push_params") String str3, @InterfaceC64985Pev("request_source") int i, @InterfaceC64986Pew("share_url") String str4, @InterfaceC64986Pew("share_link_mode") int i2, @InterfaceC64986Pew("share_scene") int i3);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        String str = EFJ.LIZJ;
        LIZ = JBR.LJFF(LIZ2, str, "/aweme/v1/aweme/detail/", LIZ2);
        LIZIZ = (IDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(IDetailApi.class);
    }

    public static Aweme LIZIZ(String str, String str2) {
        return LIZ(0, 0, str, str2);
    }

    public static Aweme LIZ(int i, int i2, String str, String str2) {
        boolean equals = "message".equals(str2);
        FeedInsertRelationManager feedInsertRelationManager = FeedInsertRelationManager.INSTANCE;
        int consume = feedInsertRelationManager.consume(str);
        String str3 = LIZIZ.queryAweme(str, str2, equals ? 1 : 0, 0, null, 0, i, i2, consume).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str3);
        Api.LIZIZ(str3, LIZ, jSONObject);
        Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), jSONObject.optString("aweme_detail"), Aweme.class);
        feedInsertRelationManager.appendMobParam(aweme, consume);
        return aweme;
    }

    public static OSZ LIZJ(int i, String str, String str2, String str3) {
        boolean equals = "message".equals(str2);
        FeedInsertRelationManager feedInsertRelationManager = FeedInsertRelationManager.INSTANCE;
        int consume = feedInsertRelationManager.consume(str);
        String str4 = LIZIZ.queryAweme(str, str2, equals ? 1 : 0, i, str3, 1, 0, 0, consume).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str4);
        Api.LIZIZ(str4, LIZ, jSONObject);
        int optInt = jSONObject.optInt("filter_reason", -1);
        Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), jSONObject.optString("aweme_detail"), Aweme.class);
        if (aweme != null) {
            feedInsertRelationManager.appendMobParam(aweme, consume);
        }
        return new OSZ(Integer.valueOf(optInt), aweme);
    }

    public static BatchDetailList LIZLLL(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        String str5 = str3;
        int i4 = i;
        if (i4 < 0) {
            i4 = 0;
        }
        if ("chat".equals(str5)) {
            str5 = "";
            i4 = 3;
        }
        IDetailApi iDetailApi = LIZIZ;
        if (iDetailApi != null) {
            return iDetailApi.queryBatchAweme(str, str5, str2, i4, str4, i2, i3).execute().LIZIZ;
        }
        throw new Exception("S_API Null Pointer");
    }
}

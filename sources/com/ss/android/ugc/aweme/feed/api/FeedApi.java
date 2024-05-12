package com.ss.android.ugc.aweme.feed.api;

import X.C35401Duv;
import X.C36922EeM;
import X.C38942FQc;
import X.C3A5;
import X.C46104I7o;
import X.C55667Lt1;
import X.C55671Lt5;
import X.C55687LtL;
import X.C65087PgZ;
import X.C65113Pgz;
import X.C76L;
import X.E4Q;
import X.E6L;
import X.EF7;
import X.EFJ;
import X.F1V;
import X.InterfaceC195737mD;
import X.InterfaceC64989Pez;
import X.InterfaceC65002PfC;
import X.RKZ;
import X.X1D;
import Y.IDhS102S0100000_9;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.ss.android.ugc.aweme.net.interceptor.AwemeSplashParamsCronetInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.CdnScoreInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.EnsureMainActivityCronetInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.EnsureTTTokenCronetInterceptor;
import java.util.ArrayList;
import java.util.List;
import yq4.a;

/* loaded from: classes10.dex */
public final class FeedApi {
    public static volatile int LIZ;
    public static volatile C55687LtL LIZIZ;
    public static volatile C55687LtL LIZJ;
    public static final Object LIZLLL;

    /* loaded from: classes10.dex */
    public interface RetrofitApi {
        @E6L(2)
        @E4Q("/aweme/v1/follow/feed/")
        C76L<FeedItemList> fetchFollowFeed(@InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i2, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("gaid") String str3, @InterfaceC64989Pez("aweme_ids") String str4, @InterfaceC64989Pez("push_params") String str5, @InterfaceC64989Pez("ad_user_agent") String str6, @InterfaceC64989Pez("filter_warn") int i3, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("address_book_access") Integer num3, @InterfaceC64989Pez("top_view_cid") String str7, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str8, @InterfaceC64989Pez("interest_list") String str9, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("sound_output_device") Integer num4, @InterfaceC64989Pez("cmpl_enc") String str10, @InterfaceC64989Pez("user_avatar_shrink") String str11);

        @E6L(3)
        @E4Q("/aweme/v1/follow/feed/")
        C76L<FeedItemList> fetchFollowFeedImmediate(@InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i2, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("gaid") String str3, @InterfaceC64989Pez("aweme_ids") String str4, @InterfaceC64989Pez("push_params") String str5, @InterfaceC64989Pez("ad_user_agent") String str6, @InterfaceC64989Pez("filter_warn") int i3, @InterfaceC64989Pez("bid_ad_params") String str7, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("address_book_access") Integer num3, @InterfaceC64989Pez("top_view_cid") String str8, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str9, @InterfaceC64989Pez("interest_list") String str10, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("sound_output_device") Integer num4, @InterfaceC64989Pez("cmpl_enc") String str11, @InterfaceC64989Pez("user_avatar_shrink") String str12);

        @E4Q("/aweme/v2/feed/")
        C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchInteractBackupFeed(@InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("pull_type") int i2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("group_id") String str, @InterfaceC64989Pez("user_action") String str2, @InterfaceC64989Pez("cmpl_enc") String str3);

        @E4Q("/aweme/v1/nearby/feed/")
        C76L<FeedItemList> fetchNearbyFeed(@InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("poi_class_code") int i2, @InterfaceC64989Pez("filter_warn") int i3, @InterfaceC64989Pez("user_avatar_shrink") String str2, @InterfaceC64989Pez("video_cover_shrink") String str3);

        @E6L(2)
        @E4Q("/aweme/v1/feed/")
        C76L<FeedItemList> fetchRecommendFeed(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("type") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i4, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("gaid") String str3, @InterfaceC64989Pez("aweme_ids") String str4, @InterfaceC64989Pez("push_params") String str5, @InterfaceC64989Pez("ad_user_agent") String str6, @InterfaceC64989Pez("filter_warn") int i5, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("address_book_access") Integer num3, @InterfaceC64989Pez("top_view_cid") String str7, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str8, @InterfaceC64989Pez("interest_list") String str9, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("cached_item_num") Integer num4, @InterfaceC64989Pez("real_time_actions") String str10, @InterfaceC64989Pez("sound_output_device") Integer num5, @InterfaceC64989Pez("cmpl_enc") String str11, @InterfaceC64989Pez("user_avatar_shrink") String str12, @InterfaceC64989Pez("personalization_setting") int i6, @InterfaceC64989Pez("is_pad") int i7, @InterfaceC64989Pez("is_landscape") int i8, @InterfaceC64989Pez("is_pad_autoscroll_on") int i9);

        @E6L(3)
        @E4Q("/aweme/v1/feed/")
        C76L<FeedItemList> fetchRecommendFeedImmediate(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("type") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i4, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("gaid") String str3, @InterfaceC64989Pez("aweme_ids") String str4, @InterfaceC64989Pez("push_params") String str5, @InterfaceC64989Pez("ad_user_agent") String str6, @InterfaceC64989Pez("filter_warn") int i5, @InterfaceC64989Pez("bid_ad_params") String str7, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("address_book_access") Integer num3, @InterfaceC64989Pez("top_view_cid") String str8, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str9, @InterfaceC64989Pez("preload_aweme_ids") String str10, @InterfaceC64989Pez("interest_list") String str11, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("cached_item_num") Integer num4, @InterfaceC64989Pez("real_time_actions") String str12, @InterfaceC64989Pez("sound_output_device") Integer num5, @InterfaceC64989Pez("cmpl_enc") String str13, @InterfaceC64989Pez("user_avatar_shrink") String str14, @InterfaceC64989Pez("is_pad") int i6, @InterfaceC64989Pez("is_landscape") int i7, @InterfaceC64989Pez("is_pad_autoscroll_on") int i8);

        @E6L(2)
        @E4Q("/aweme/v2/feed/")
        C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("type") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i4, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("aweme_ids") String str3, @InterfaceC64989Pez("push_params") String str4, @InterfaceC64989Pez("filter_warn") int i5, @InterfaceC64989Pez("top_view_cid") String str5, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str6, @InterfaceC64989Pez("interest_list") String str7, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("cached_item_num") Integer num2, @InterfaceC64989Pez("real_time_actions") String str8, @InterfaceC64989Pez("cmpl_enc") String str9, @InterfaceC64989Pez("user_avatar_shrink") String str10, @InterfaceC64989Pez("is_audio_mode") String str11, @InterfaceC64989Pez("personalization_setting") int i6, @InterfaceC64989Pez("is_non_personalized") int i7, @InterfaceC64989Pez("session_info") String str12, @InterfaceC64989Pez("camera_status") int i8, @InterfaceC64989Pez("client_cache_request_count") int i9, @InterfaceC64989Pez("bot_mocked_gids") String str13, @InterfaceC64989Pez("disable_quality_protection") Integer num3, @InterfaceC64989Pez("debug_regions") String str14, @InterfaceC64989Pez("client_ai_download_json_str") String str15, @InterfaceC64989Pez("recent_items_from_client") String str16, @InterfaceC64989Pez("last_ad_timestamp") long j3, @InterfaceC64989Pez("batch_number") long j4, @InterfaceC64989Pez("is_pad") int i10, @InterfaceC64989Pez("is_landscape") int i11, @InterfaceC64989Pez("is_pad_autoscroll_on") int i12, @InterfaceC64989Pez("topview_preload_ad_ids") String str17, @InterfaceC64989Pez("mock_info") String str18, @InterfaceC64989Pez("is_new_user_see_first") int i13, @InterfaceC64989Pez("batch_num") int i14, @InterfaceC64989Pez("batch_num_all") int i15, @InterfaceC64989Pez("play_num") int i16, @InterfaceC64989Pez("play_num_all") int i17, @InterfaceC64989Pez("last_show_lives") String str19, @InterfaceC64989Pez("last_play_lives") String str20, @InterfaceC64989Pez("real_time_client_info") String str21, @InterfaceC64989Pez("inserted_items") String str22, @InterfaceC64989Pez("card_insert") String str23, @InterfaceC64989Pez("feed_source") int i18, @InterfaceC64989Pez("user_prompt") String str24, @InterfaceC64989Pez("app_version") String str25, @InterfaceC64989Pez("insert_relations") String str26, @InterfaceC64989Pez("search_recommend_info") String str27, @InterfaceC64989Pez("search_recommend_timestamp") Long l2, @InterfaceC64989Pez("effect_sdk_version") String str28, @InterfaceC64989Pez("current_instruction_ids") String str29, @InterfaceC64989Pez("survey_params") String str30);

        @E6L(2)
        @E4Q("/aweme/v2/feed/")
        C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("type") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("feed_style") Integer num, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("pull_type") int i4, @InterfaceC64989Pez("req_from") String str2, @InterfaceC64989Pez("gaid") String str3, @InterfaceC64989Pez("aweme_ids") String str4, @InterfaceC64989Pez("push_params") String str5, @InterfaceC64989Pez("ad_user_agent") String str6, @InterfaceC64989Pez("filter_warn") int i5, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("address_book_access") Integer num3, @InterfaceC64989Pez("top_view_cid") String str7, @InterfaceC64989Pez("top_view_aid") Long l, @InterfaceC64989Pez("local_cache") String str8, @InterfaceC64989Pez("interest_list") String str9, @InterfaceC195737mD Object obj, @InterfaceC64989Pez("cached_item_num") Integer num4, @InterfaceC64989Pez("real_time_actions") String str10, @InterfaceC64989Pez("sound_output_device") Integer num5, @InterfaceC64989Pez("cmpl_enc") String str11, @InterfaceC64989Pez("user_avatar_shrink") String str12, @InterfaceC64989Pez("is_audio_mode") String str13, @InterfaceC64989Pez("personalization_setting") int i6, @InterfaceC64989Pez("is_non_personalized") int i7, @InterfaceC64989Pez("session_info") String str14, @InterfaceC64989Pez("camera_status") int i8, @InterfaceC64989Pez("client_cache_request_count") int i9, @InterfaceC195737mD Object obj2, @InterfaceC65002PfC("Cookie") String str15, @InterfaceC64989Pez("bot_mocked_gids") String str16, @InterfaceC64989Pez("disable_quality_protection") Integer num6, @InterfaceC64989Pez("debug_regions") String str17, @InterfaceC64989Pez("client_ai_download_json_str") String str18, @InterfaceC64989Pez("recent_items_from_client") String str19, @InterfaceC64989Pez("last_ad_timestamp") long j3, @InterfaceC64989Pez("batch_number") long j4, @InterfaceC64989Pez("is_pad") int i10, @InterfaceC64989Pez("is_landscape") int i11, @InterfaceC64989Pez("is_pad_autoscroll_on") int i12, @InterfaceC64989Pez("topview_preload_ad_ids") String str20, @InterfaceC64989Pez("mock_info") String str21, @InterfaceC64989Pez("is_new_user_see_first") int i13, @InterfaceC64989Pez("batch_num") int i14, @InterfaceC64989Pez("batch_num_all") int i15, @InterfaceC64989Pez("play_num") int i16, @InterfaceC64989Pez("play_num_all") int i17, @InterfaceC64989Pez("last_show_lives") String str22, @InterfaceC64989Pez("last_play_lives") String str23, @InterfaceC64989Pez("real_time_client_info") String str24, @InterfaceC64989Pez("inserted_items") String str25, @InterfaceC64989Pez("card_insert") String str26, @InterfaceC64989Pez("feed_source") int i18, @InterfaceC64989Pez("user_prompt") String str27, @InterfaceC64989Pez("app_version") String str28, @InterfaceC64989Pez("insert_relations") String str29, @InterfaceC64989Pez("search_recommend_info") String str30, @InterfaceC64989Pez("search_recommend_timestamp") Long l2, @InterfaceC64989Pez("effect_sdk_version") String str31, @InterfaceC64989Pez("current_instruction_ids") String str32, @InterfaceC64989Pez("survey_params") String str33);

        @E4Q("/aweme/v1/roaming/feed/")
        C76L<FeedItemList> fetchRoamingFeed(@InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("roaming_code") String str);

        @E4Q("/aweme/v1/fresh/feed/")
        C76L<FeedTimeLineItemList> fetchTimelineFeed(@InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("max_time") long j, @InterfaceC64989Pez("min_time") long j2, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("aweme_ids") String str2, @InterfaceC64989Pez("push_params") String str3, @InterfaceC64989Pez("filter_warn") int i3);
    }

    public static C55687LtL LIZJ() {
        if (LIZIZ == null) {
            synchronized (LIZLLL) {
                if (LIZIZ == null) {
                    List LIZ2 = F1V.LIZ();
                    if (((Boolean) C35401Duv.LIZIZ.getValue()).booleanValue()) {
                        ArrayList arrayList = (ArrayList) LIZ2;
                        arrayList.add(new EnsureMainActivityCronetInterceptor());
                        arrayList.add(new AwemeSplashParamsCronetInterceptor());
                        arrayList.add(new EnsureTTTokenCronetInterceptor());
                    }
                    ((ArrayList) LIZ2).add(new CdnScoreInterceptor());
                    C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL(EFJ.LIZJ);
                    c65087PgZ.LIZJ(LIZ2);
                    c65087PgZ.LJIIIIZZ.LIZ(new C65113Pgz());
                    c65087PgZ.LJI = new C55667Lt1();
                    LIZIZ = new C55687LtL((RetrofitApi) c65087PgZ.LJFF().LIZ.LIZ(RetrofitApi.class));
                }
            }
        }
        return LIZIZ;
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pb_convert_flag");
        LIZ2.append(EF7.LJI());
        X1D.LIZIZ(LIZ2);
        LIZ = 0;
        LIZLLL = new Object();
    }

    public static C55687LtL LIZLLL(boolean z) {
        if (z) {
            if (LIZJ == null) {
                synchronized (LIZLLL) {
                    if (LIZJ == null) {
                        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ);
                        LIZ2.LIZJ(F1V.LIZ());
                        LIZ2.LIZIZ = true;
                        LIZJ = new C55687LtL((RetrofitApi) LIZ2.LJFF().LIZ.LIZ(RetrofitApi.class));
                    }
                }
            }
            return LIZJ;
        }
        return LIZJ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(84:1|(1:3)(1:313)|4|(1:6)(1:312)|7|(1:9)|10|(1:12)(1:311)|13|(1:15)(1:310)|16|(1:18)|19|(2:307|(1:309))|23|(5:26|(2:34|(3:36|37|(5:42|(3:44|(2:46|47)(1:49)|48)|50|51|(4:57|(1:59)(1:84)|60|(4:64|(2:66|(1:68)(5:69|(4:72|(3:74|75|76)(1:78)|77|70)|79|80|(1:82)))(1:83)|29|(1:31))))))|28|29|(0))|87|(1:89)(1:305)|90|(1:304)|93|(1:95)(1:(1:299)(2:300|(1:302)(1:303)))|96|(1:297)(2:99|(58:293|(1:295)(1:296)|102|(1:292)(1:105)|(1:291)(1:108)|109|(1:111)|112|(1:114)(1:290)|115|(2:117|(4:119|(4:122|(1:128)(3:124|125|126)|127|120)|129|130))|131|(1:133)(1:289)|134|(1:288)(1:138)|139|(48:263|264|(4:266|(3:280|281|(2:283|269))|268|269)(1:286)|270|(1:272)(1:279)|273|(1:275)(1:278)|276|142|143|144|145|(2:256|(32:260|148|(1:150)(1:255)|(1:152)|153|(1:155)(1:254)|156|(1:158)|159|(1:253)(1:163)|164|(1:252)(1:168)|169|(1:171)|(1:173)(4:244|245|246|(1:248))|174|(1:243)(1:186)|187|(1:189)(1:242)|190|(1:192)(1:241)|193|(1:195)(1:240)|196|(1:198)(1:239)|199|(1:201)(1:238)|202|(3:206|(2:209|207)|210)|(5:217|(3:219|(2:225|226)|227)|231|232|(1:234))|235|236))|147|148|(0)(0)|(0)|153|(0)(0)|156|(0)|159|(1:161)|253|164|(1:166)|252|169|(0)|(0)(0)|174|(1:176)|243|187|(0)(0)|190|(0)(0)|193|(0)(0)|196|(0)(0)|199|(0)(0)|202|(4:204|206|(1:207)|210)|(7:213|215|217|(0)|231|232|(0))|235|236)|141|142|143|144|145|(0)|147|148|(0)(0)|(0)|153|(0)(0)|156|(0)|159|(0)|253|164|(0)|252|169|(0)|(0)(0)|174|(0)|243|187|(0)(0)|190|(0)(0)|193|(0)(0)|196|(0)(0)|199|(0)(0)|202|(0)|(0)|235|236))|101|102|(0)|292|(0)|291|109|(0)|112|(0)(0)|115|(0)|131|(0)(0)|134|(1:136)|288|139|(0)|141|142|143|144|145|(0)|147|148|(0)(0)|(0)|153|(0)(0)|156|(0)|159|(0)|253|164|(0)|252|169|(0)|(0)(0)|174|(0)|243|187|(0)(0)|190|(0)(0)|193|(0)(0)|196|(0)(0)|199|(0)(0)|202|(0)|(0)|235|236) */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0496, code lost:
    
        com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("feed_survey_frequency", "parse survey params error");
        r7 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0633 A[LOOP:3: B:207:0x062d->B:209:0x0633, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x067b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJ(X.C55671Lt5 r90, boolean r91) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedApi.LJ(X.Lt5, boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static FeedItemList LIZIZ(int i, String str, String str2) {
        try {
            boolean z = false;
            C55671Lt5 c55671Lt5 = new C55671Lt5(0, 0L, -1L, Integer.valueOf(i), 0, "", 9, "", "", Boolean.FALSE, false);
            if (!C38942FQc.LIZ && ((Boolean) C38942FQc.LIZIZ.getValue()).booleanValue()) {
                z = true;
            }
            ComposePbAndJson<RKZ, FeedItemList> composePbAndJson = LIZLLL(z).fetchInteractBackupFeed(0, 9, i, str, str2, a.LJIIZILJ().LIZJ()).get();
            if (composePbAndJson == null) {
                return null;
            }
            FeedItemList LIZJ2 = composePbAndJson.LIZJ(new IDhS102S0100000_9(c55671Lt5, 0));
            if (LIZJ2 != null) {
                C3A5.LIZ.LJFF(LIZJ2.getRequestId(), LIZJ2.logPb);
            }
            return LIZJ2;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            throw e;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:29|30|(1:32)(1:178)|33|(2:35|36)(1:177)|37|(1:176)(1:41)|42|(1:175)(6:46|47|48|(3:50|51|(1:53))|168|(1:172))|55|(5:63|(2:66|64)|67|(1:69)(1:(2:72|73)(1:(1:75)(1:76)))|70)|(4:(3:164|165|(1:167))|90|91|92)(6:(1:80)|87|(4:156|157|158|159)|90|91|92)|81|(1:86)|87|(0)|156|157|158|159|90|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030d, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fa, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0219, code lost:
    
        if (r8.isEmpty() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0315, code lost:
    
        if (r5 == null) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LIZ(int r40, long r41, long r43, int r45, java.lang.Integer r46, java.lang.String r47, int r48, int r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, X.InterfaceC55676LtA r53, android.os.Bundle r54, java.lang.Boolean r55, int r56, java.lang.String r57) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedApi.LIZ(int, long, long, int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, X.LtA, android.os.Bundle, java.lang.Boolean, int, java.lang.String):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}

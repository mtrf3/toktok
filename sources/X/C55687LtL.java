package X;

import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import yq4.a;

/* renamed from: X.LtL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55687LtL implements FeedApi.RetrofitApi {
    public final FeedApi.RetrofitApi LIZ;

    public static void LIZ() {
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_compose_params", false);
            C56662Kg.LIZ().LIZIZ(System.currentTimeMillis(), "feed_api_to_net_api", false);
        }
    }

    public static void LIZIZ() {
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_net_api_to_feed_api", false);
            C56662Kg.LIZ().LIZJ("feed_api_to_ui_response", false);
        }
    }

    public C55687LtL(FeedApi.RetrofitApi retrofitApi) {
        if (retrofitApi != null) {
            this.LIZ = retrofitApi;
            return;
        }
        throw new IllegalArgumentException("retrofitApi should not be null");
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchRoamingFeed(int i, String str) {
        return this.LIZ.fetchRoamingFeed(i, str);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchInteractBackupFeed(int i, int i2, int i3, String str, String str2, String str3) {
        return this.LIZ.fetchInteractBackupFeed(i, i2, i3, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedTimeLineItemList> fetchTimelineFeed(int i, long j, long j2, int i2, String str, String str2, String str3, int i3) {
        return this.LIZ.fetchTimelineFeed(i, j, j2, i2, str, str2, str3, i3);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchNearbyFeed(long j, long j2, int i, Integer num, String str, int i2, int i3, String str2, String str3) {
        return this.LIZ.fetchNearbyFeed(j, j2, i, num, str, i2, i3, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchFollowFeed(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, String str10, String str11) {
        LIZ();
        C76L<FeedItemList> fetchFollowFeed = this.LIZ.fetchFollowFeed(j, j2, i, num, str, d, i2, str2, str3, str4, str5, str6, i3, num2, num3, str7, l, str8, str9, obj, num4, str10, str11);
        LIZIZ();
        return fetchFollowFeed;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchFollowFeedImmediate(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, Integer num2, Integer num3, String str8, Long l, String str9, String str10, Object obj, Integer num4, String str11, String str12) {
        LIZ();
        C76L<FeedItemList> fetchFollowFeedImmediate = this.LIZ.fetchFollowFeedImmediate(j, j2, i, num, str, d, i2, str2, str3, str4, str5, str6, i3, str7, num2, num3, str8, l, str9, str10, obj, num4, str11, str12);
        LIZIZ();
        return fetchFollowFeedImmediate;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchRecommendFeed(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, String str10, Integer num5, String str11, String str12, int i6, int i7, int i8, int i9) {
        LIZ();
        C76L<FeedItemList> fetchRecommendFeed = this.LIZ.fetchRecommendFeed(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, num2, num3, str7, l, str8, str9, obj, num4, str10, num5, str11, str12, i6, i7, i8, i9);
        LIZIZ();
        return fetchRecommendFeed;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<FeedItemList> fetchRecommendFeedImmediate(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, String str7, Integer num2, Integer num3, String str8, Long l, String str9, String str10, String str11, Object obj, Integer num4, String str12, Integer num5, String str13, String str14, int i6, int i7, int i8) {
        LIZ();
        C76L<FeedItemList> fetchRecommendFeedImmediate = this.LIZ.fetchRecommendFeedImmediate(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, str7, num2, num3, str8, l, str9, str10, str11, obj, num4, str12, num5, str13, str14, i6, i7, i8);
        LIZIZ();
        return fetchRecommendFeedImmediate;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, int i5, String str5, Long l, String str6, String str7, Object obj, Integer num2, String str8, String str9, String str10, String str11, int i6, int i7, String str12, int i8, int i9, String str13, Integer num3, String str14, String str15, String str16, long j3, long j4, int i10, int i11, int i12, String str17, String str18, int i13, int i14, int i15, int i16, int i17, String str19, String str20, String str21, String str22, String str23, int i18, String str24, String str25, String str26, String str27, Long l2, String str28, String str29, String str30) {
        LIZ();
        C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2 = this.LIZ.fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, i5, str5, l, str6, str7, obj, num2, str8, str9, str10, str11, i6, i7, str12, i8, i9, str13, num3, str14, str15, str16, j3, j4, i10, i11, i12, str17, str18, i13, i14, i15, i16, i17, str19, str20, str21, str22, str23, i18, str24, str25, str26, str27, l2, str28, str29, str30);
        LIZIZ();
        return fetchRecommendFeedV2;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, String str10, Integer num5, String str11, String str12, String str13, int i6, int i7, String str14, int i8, int i9, Object obj2, String str15, String str16, Integer num6, String str17, String str18, String str19, long j3, long j4, int i10, int i11, int i12, String str20, String str21, int i13, int i14, int i15, int i16, int i17, String str22, String str23, String str24, String str25, String str26, int i18, String str27, String str28, String str29, String str30, Long l2, String str31, String str32, String str33) {
        C76L<ComposePbAndJson<RKZ, FeedItemList>> fetchRecommendFeedV2;
        LIZ();
        if (!a.LJIJI().LIZ()) {
            fetchRecommendFeedV2 = fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str4, str5, i5, str7, l, str8, str9, obj, num4, str10, str11, str12, str13, i6, i7, str14, i8, i9, str16, num6, str17, str18, str19, j3, j4, i10, i11, i12, str20, str21, i13, i14, i15, i16, i17, str22, str23, str24, str25, str26, i18, str27, str28, str29, str30, l2, str31, str32, str33);
        } else {
            fetchRecommendFeedV2 = this.LIZ.fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, num2, num3, str7, l, str8, str9, obj, num4, str10, num5, str11, str12, str13, i6, i7, str14, i8, i9, obj2, str15, str16, num6, str17, str18, str19, j3, j4, i10, i11, i12, str20, str21, i13, i14, i15, i16, i17, str22, str23, str24, str25, str26, i18, str27, str28, str29, str30, l2, str31, str32, str33);
        }
        LIZIZ();
        return fetchRecommendFeedV2;
    }
}

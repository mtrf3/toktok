package com.twitter.sdk.android.core.services;

import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64988Pey;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;
import java.util.List;

/* loaded from: classes12.dex */
public interface StatusesService {
    @InterfaceC195787mI
    @E4T("/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> destroy(@InterfaceC64988Pey("id") Long l, @InterfaceC64987Pex("trim_user") Boolean bool);

    @E4Q("/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> homeTimeline(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("since_id") Long l, @InterfaceC64989Pez("max_id") Long l2, @InterfaceC64989Pez("trim_user") Boolean bool, @InterfaceC64989Pez("exclude_replies") Boolean bool2, @InterfaceC64989Pez("contributor_details") Boolean bool3, @InterfaceC64989Pez("include_entities") Boolean bool4);

    @E4Q("/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> lookup(@InterfaceC64989Pez("id") String str, @InterfaceC64989Pez("include_entities") Boolean bool, @InterfaceC64989Pez("trim_user") Boolean bool2, @InterfaceC64989Pez("map") Boolean bool3);

    @E4Q("/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> mentionsTimeline(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("since_id") Long l, @InterfaceC64989Pez("max_id") Long l2, @InterfaceC64989Pez("trim_user") Boolean bool, @InterfaceC64989Pez("contributor_details") Boolean bool2, @InterfaceC64989Pez("include_entities") Boolean bool3);

    @InterfaceC195787mI
    @E4T("/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> retweet(@InterfaceC64988Pey("id") Long l, @InterfaceC64987Pex("trim_user") Boolean bool);

    @E4Q("/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> retweetsOfMe(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("since_id") Long l, @InterfaceC64989Pez("max_id") Long l2, @InterfaceC64989Pez("trim_user") Boolean bool, @InterfaceC64989Pez("include_entities") Boolean bool2, @InterfaceC64989Pez("include_user_entities") Boolean bool3);

    @E4Q("/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> show(@InterfaceC64989Pez("id") Long l, @InterfaceC64989Pez("trim_user") Boolean bool, @InterfaceC64989Pez("include_my_retweet") Boolean bool2, @InterfaceC64989Pez("include_entities") Boolean bool3);

    @InterfaceC195787mI
    @E4T("/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> unretweet(@InterfaceC64988Pey("id") Long l, @InterfaceC64987Pex("trim_user") Boolean bool);

    @InterfaceC195787mI
    @E4T("/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> update(@InterfaceC64987Pex("status") String str, @InterfaceC64987Pex("in_reply_to_status_id") Long l, @InterfaceC64987Pex("possibly_sensitive") Boolean bool, @InterfaceC64987Pex("lat") Double d, @InterfaceC64987Pex("long") Double d2, @InterfaceC64987Pex("place_id") String str2, @InterfaceC64987Pex("display_coordinates") Boolean bool2, @InterfaceC64987Pex("trim_user") Boolean bool3, @InterfaceC64987Pex("media_ids") String str3);

    @E4Q("/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> userTimeline(@InterfaceC64989Pez("user_id") Long l, @InterfaceC64989Pez("screen_name") String str, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("since_id") Long l2, @InterfaceC64989Pez("max_id") Long l3, @InterfaceC64989Pez("trim_user") Boolean bool, @InterfaceC64989Pez("exclude_replies") Boolean bool2, @InterfaceC64989Pez("contributor_details") Boolean bool3, @InterfaceC64989Pez("include_rts") Boolean bool4);
}

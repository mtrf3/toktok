package com.twitter.sdk.android.core.services;

import X.C65295Pjv;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;

/* loaded from: classes12.dex */
public interface SearchService {
    @E4Q("/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> tweets(@InterfaceC64989Pez("q") String str, @InterfaceC64989Pez(encoded = true, value = "geocode") C65295Pjv c65295Pjv, @InterfaceC64989Pez("lang") String str2, @InterfaceC64989Pez("locale") String str3, @InterfaceC64989Pez("result_type") String str4, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("until") String str5, @InterfaceC64989Pez("since_id") Long l, @InterfaceC64989Pez("max_id") Long l2, @InterfaceC64989Pez("include_entities") Boolean bool);
}

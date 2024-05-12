package com.twitter.sdk.android.core.services;

import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;

/* loaded from: classes12.dex */
public interface CollectionService {
    @E4Q("/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> collection(@InterfaceC64989Pez("id") String str, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("max_position") Long l, @InterfaceC64989Pez("min_position") Long l2);
}

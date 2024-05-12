package com.twitter.sdk.android.core.services;

import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;
import java.util.List;

/* loaded from: classes12.dex */
public interface FavoriteService {
    @InterfaceC195787mI
    @E4T("/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> create(@InterfaceC64987Pex("id") Long l, @InterfaceC64987Pex("include_entities") Boolean bool);

    @InterfaceC195787mI
    @E4T("/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<Object> destroy(@InterfaceC64987Pex("id") Long l, @InterfaceC64987Pex("include_entities") Boolean bool);

    @E4Q("/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> list(@InterfaceC64989Pez("user_id") Long l, @InterfaceC64989Pez("screen_name") String str, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("since_id") String str2, @InterfaceC64989Pez("max_id") String str3, @InterfaceC64989Pez("include_entities") Boolean bool);
}

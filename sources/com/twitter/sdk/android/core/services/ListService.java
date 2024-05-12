package com.twitter.sdk.android.core.services;

import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;
import java.util.List;

/* loaded from: classes12.dex */
public interface ListService {
    @E4Q("/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    InterfaceC65079PgR<List<Object>> statuses(@InterfaceC64989Pez("list_id") Long l, @InterfaceC64989Pez("slug") String str, @InterfaceC64989Pez("owner_screen_name") String str2, @InterfaceC64989Pez("owner_id") Long l2, @InterfaceC64989Pez("since_id") Long l3, @InterfaceC64989Pez("max_id") Long l4, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("include_entities") Boolean bool, @InterfaceC64989Pez("include_rts") Boolean bool2);
}

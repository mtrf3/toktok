package com.ss.android.ugc.aweme.tag.api;

import X.AbstractC73672Svk;
import X.C7DJ;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;

/* loaded from: classes5.dex */
public interface VideoTagApi {
    public static final C7DJ LIZ = C7DJ.LIZ;

    @E4Q("/tiktok/interaction/mention/general/aweme/check/v1")
    AbstractC73672Svk<MentionCheckResponse> mentionAwemeCheck(@InterfaceC64989Pez("aweme_id") long j);

    @E4Q("/tiktok/interaction/mention/general/check/v1")
    AbstractC73672Svk<MentionCheckResponse> mentionCheck(@InterfaceC64989Pez("uids") String str, @InterfaceC64989Pez("mention_type") String str2, @InterfaceC64989Pez("is_check_aweme") boolean z, @InterfaceC64989Pez("aweme_id") long j);

    @E4Q("/tiktok/interaction/mention/recent/contact/query/v1")
    InterfaceC37276Ek4<MentionRecentContactResponse> mentionRecentContactQuery(@InterfaceC64989Pez("mention_type") int i, @InterfaceC64989Pez("aweme_id") long j, @InterfaceC64989Pez("is_check_aweme") boolean z);

    @InterfaceC195787mI
    @E4T("/tiktok/interaction/mention/tag/update/v1")
    AbstractC73672Svk<TagUpdateResponse> tagUpdate(@InterfaceC64987Pex("add_uids") String str, @InterfaceC64987Pex("remove_uids") String str2, @InterfaceC64987Pex("aweme_id") long j);
}

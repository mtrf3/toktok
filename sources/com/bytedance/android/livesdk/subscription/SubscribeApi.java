package com.bytedance.android.livesdk.subscription;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import emotes.model.SubEmoteDetailResult;

/* loaded from: classes6.dex */
public interface SubscribeApi {
    @E8L("/webcast/sub/privilege/get_sub_emote_detail/")
    AbstractC73672Svk<C28467BFf<SubEmoteDetailResult>> getEmotesDetail(@InterfaceC64986Pew("for_anchor") boolean z, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("display_type") int i);
}

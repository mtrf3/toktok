package com.ss.android.ugc.aweme.comment.api;

import X.AbstractC73638SvC;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.comment.event.PinResult;

/* loaded from: classes4.dex */
public interface CommentPinAPI {
    @InterfaceC195787mI
    @E4T("/tiktok/comment/pin/v1")
    AbstractC73638SvC<PinResult> pinComment(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("comment_id") String str2, @InterfaceC64987Pex("pinned_at") long j, @InterfaceC64987Pex("op") int i, @InterfaceC64987Pex("pin_anyway") boolean z);
}

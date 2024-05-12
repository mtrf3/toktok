package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.AbstractC73638SvC;
import X.C25909AEv;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes4.dex */
public interface CommentBatchManagementApi {
    public static final C25909AEv LIZ = C25909AEv.LIZ;

    @InterfaceC195787mI
    @E4T("/tiktok/comment/batch_delete/v1")
    AbstractC73638SvC<CommentBatchDeleteResponse> commentBatchDelete(@InterfaceC64987Pex("cids") String str, @InterfaceC64987Pex("item_id") String str2);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/user/batch/block/")
    AbstractC73638SvC<UserBatchBlockResponse> userBatchBlock(@InterfaceC64987Pex("to_user_id_list") String str);
}

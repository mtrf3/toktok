package com.ss.android.ugc.aweme.comment.record;

import X.HPW;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentStickerRecordServiceImpl implements ICommentStickerRecordService {
    @Override // com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService
    public final void LIZ(Context activity, CommentVideoModel commentVideoModel) {
        o.LJIIIZ(activity, "activity");
        HPW.LIZ(activity, commentVideoModel);
    }
}

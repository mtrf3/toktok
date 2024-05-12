package com.ss.android.ugc.aweme.comment.service;

import X.C1799274i;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCommentHelperServiceImpl implements NoticeCommentHelperService {
    public static NoticeCommentHelperService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(NoticeCommentHelperService.class, false);
        if (LIZ != null) {
            return (NoticeCommentHelperService) LIZ;
        }
        if (C58096Mr6.LLJZIJLIL == null) {
            synchronized (NoticeCommentHelperService.class) {
                if (C58096Mr6.LLJZIJLIL == null) {
                    C58096Mr6.LLJZIJLIL = new NoticeCommentHelperServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService
    public final String LIZ(Comment comment) {
        o.LJIIIZ(comment, "comment");
        return C1799274i.LIZIZ(comment, false);
    }
}

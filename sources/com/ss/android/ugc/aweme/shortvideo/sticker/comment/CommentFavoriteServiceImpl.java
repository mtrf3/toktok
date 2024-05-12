package com.ss.android.ugc.aweme.shortvideo.sticker.comment;

import X.C58096Mr6;
import X.ORZ;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentFavoriteServiceImpl implements ICommentFavoriteService, WeakHandler.IHandler {
    public final int LJLIL = 64;
    public final Map<String, Integer> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static ICommentFavoriteService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommentFavoriteService.class, false);
        if (LIZ != null) {
            return (ICommentFavoriteService) LIZ;
        }
        if (C58096Mr6.c7 == null) {
            synchronized (ICommentFavoriteService.class) {
                if (C58096Mr6.c7 == null) {
                    C58096Mr6.c7 = new CommentFavoriteServiceImpl();
                }
            }
        }
        return C58096Mr6.c7;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final int LIZIZ(String commentId) {
        boolean z;
        Integer num;
        o.LJIIIZ(commentId, "commentId");
        if (commentId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = -1;
        if (z) {
            return -1;
        }
        synchronized (this.LJLILLLLZI) {
            if (this.LJLILLLLZI.containsKey(commentId) && (num = (Integer) ((LinkedHashMap) this.LJLILLLLZI).get(commentId)) != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final void LIZ(int i, String commentId) {
        o.LJIIIZ(commentId, "commentId");
        if (commentId.length() == 0) {
            return;
        }
        synchronized (this.LJLILLLLZI) {
            if (this.LJLILLLLZI.size() >= this.LJLIL) {
                ((LinkedHashMap) this.LJLILLLLZI).entrySet().remove((Map.Entry) ORZ.LJLLILLLL(((LinkedHashMap) this.LJLILLLLZI).entrySet()));
            }
            this.LJLILLLLZI.put(commentId, Integer.valueOf(i));
        }
    }
}

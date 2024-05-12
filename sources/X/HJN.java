package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.panel.model.CommentStickerForPanel;
import com.ss.android.ugc.aweme.panel.model.UserForPanel;
import com.ss.android.ugc.aweme.panel.net.CommentStickerPanelRequestApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJN {
    public static CommentStickerPanelRequestApi LIZ;
    public static final List<CommentVideoModel> LIZIZ;
    public static final List<CommentVideoModel> LIZJ;
    public static boolean LIZLLL;
    public static final C29901Fi<Boolean> LJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        LIZJ = arrayList2;
        LJ = new C29901Fi<>();
        new C40871j1(arrayList);
        new C40871j1(arrayList2);
        LIZ = new CommentStickerPanelRequestApi();
    }

    public static CommentVideoModel LIZ(CommentStickerForPanel comment) {
        String str;
        UrlModel urlModel;
        o.LJIIIZ(comment, "comment");
        UserForPanel userForPanel = comment.user;
        String str2 = null;
        if (userForPanel != null) {
            str2 = userForPanel.commentUserId;
            str = userForPanel.userName;
            urlModel = userForPanel.avatarThumb;
        } else {
            str = null;
            urlModel = null;
        }
        return new CommentVideoModel(str2, str, urlModel, comment.text, comment.cid, comment.awemeId, comment.awemeUserId, comment.replyId, comment.replyToReplyId, 0, null, 0, 0, null, null, null, 65024, null);
    }

    public static boolean LIZIZ(int i) {
        if (((Number) ListProtector.get(LIZ.LIZIZ, i)).intValue() == 0) {
            return true;
        }
        return false;
    }
}

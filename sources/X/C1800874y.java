package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* renamed from: X.74y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1800874y {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C1800974z.LJLIL);

    public static LruCache LIZIZ() {
        return (LruCache) LIZ.getValue();
    }

    public static CommentItemList LIZ(C176556wN c176556wN) {
        AnonymousClass750 anonymousClass750 = (AnonymousClass750) LIZIZ().get(c176556wN);
        if (anonymousClass750 == null) {
            return null;
        }
        if (System.currentTimeMillis() - anonymousClass750.LIZIZ < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return anonymousClass750.LIZ;
        }
        LIZIZ().remove(c176556wN);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("find the local cache, but it is expired. aid: ");
        LIZ2.append(c176556wN.LJLIL);
        LIZ2.append(", cid: ");
        LIZ2.append(c176556wN.LJLJJI);
        C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ2));
        return null;
    }
}

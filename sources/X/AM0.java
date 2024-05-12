package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AM0 {
    public static boolean LIZ;

    public static final boolean LIZ(Context context, Aweme aweme, int i, InterfaceC59418NTq callback) {
        long parseLong;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(callback, "callback");
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (!C63081OpJ.LLIIIILZ(aweme)) {
            return false;
        }
        if (LIZ) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        if (TextUtils.isEmpty(author.getUid())) {
            parseLong = 0;
        } else {
            String uid = author.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            parseLong = CastLongProtector.parseLong(uid);
        }
        if (C63081OpJ.LLIIIJ(aweme)) {
            LIZ = true;
            FeedLiveRoomApi.LIZ.queryTopViewLiveRoomInfo(parseLong, author.getSecUid()).enqueue(new C59417NTp(LJII, aweme, context, i, author, callback));
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive()) {
            return false;
        }
        C59406NTe.LJIIIZ(context, aweme, i, null);
        return true;
    }
}

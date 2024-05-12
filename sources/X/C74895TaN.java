package X;

import android.graphics.Paint;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TaN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74895TaN {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(User user) {
        Room room;
        Boolean bool;
        if (user == null || (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) == null) {
            return -2;
        }
        User owner = room.getOwner();
        Boolean bool2 = null;
        if (owner != null) {
            bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            return -1;
        }
        SubscribeInfo subscribeInfo = user.getSubscribeInfo();
        if (subscribeInfo != null) {
            bool2 = Boolean.valueOf(subscribeInfo.isSubscribedToCurrentAnchor());
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null && followInfo.getFollowStatus() == 2) {
                int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(224.0f);
                Paint paint = new Paint();
                paint.setTextSize(C15380j0.LIZ(13.0f));
                if (paint.measureText("" + C15380j0.LJIILJJIL(R.string.l_c) + " · " + C15380j0.LJIILJJIL(R.string.oia)) > LJIIL) {
                    return 2;
                }
            }
            return 1;
        }
        return 0;
    }
}

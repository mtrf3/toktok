package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.LinkUserState;

/* renamed from: X.Tp9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75811Tp9 {
    public static UserState LIZ(LinkUserState linkUserState) {
        o.LJIIIZ(linkUserState, "<this>");
        return new UserState(linkUserState.user, linkUserState.linkmicId, linkUserState.pos, linkUserState.linkedTimeNano, linkUserState.onlineUserState, linkUserState.audioMuted, linkUserState.videoMuted, linkUserState.rtcConnection, linkUserState.networkState, 0, 512, null);
    }
}

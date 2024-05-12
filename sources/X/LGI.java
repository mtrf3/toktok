package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.FriendTopTabProtocol;

/* loaded from: classes10.dex */
public final class LGI extends AbstractC53764L8e {
    @Override // X.AbstractC53764L8e
    public final BottomTabProtocol LIZ() {
        return LHM.LIZIZ.LIZ().getFriendsTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        return new FriendTopTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        return EnumC53808L9w.FRIENDS;
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xue, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86344Xue implements InterfaceC32188CkC {
    public final /* synthetic */ LiveDualFeedCell LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        String str;
        String str2;
        List<FeedRoomTag> subTags;
        FeedRoomTag feedRoomTag;
        InterfaceC86348Xui interfaceC86348Xui = this.LJLIL.LJLILLLLZI;
        if (interfaceC86348Xui != null) {
            interfaceC86348Xui.LJJLJ();
        }
        C17N.LJJIIJZLJL(this.LJLIL._$_findCachedViewById(R.id.ej9));
        this.LJLIL.M(true);
        LiveDualFeedCell liveDualFeedCell = this.LJLIL;
        C59992Xb item = liveDualFeedCell.getItem();
        if (item != null && (aweme = item.LJLIL) != null && (newLiveRoomData = aweme.getNewLiveRoomData()) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", "homepage_live");
            c188727au.LJIIIZ("action_type", "click");
            User user = newLiveRoomData.owner;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("anchor_id", str);
            c188727au.LJ(newLiveRoomData.id, "room_id");
            c188727au.LJIIIZ("enter_method", "live_cell");
            c188727au.LIZLLL(C54740Le4.LIZ(newLiveRoomData), "follow_status");
            c188727au.LIZLLL(liveDualFeedCell.getLayoutPosition(), "room_position");
            FeedRoomTagList feedRoomTagList = newLiveRoomData.feedRoomTagList;
            if (feedRoomTagList == null || (subTags = feedRoomTagList.getSubTags()) == null || (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(subTags)) == null || (str2 = feedRoomTag.getContent()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("label", str2);
            FMX.LJIIL("livesdk_livetab_cover_auto_play", c188727au.LIZ);
        }
    }

    public C86344Xue(LiveDualFeedCell liveDualFeedCell) {
        this.LJLIL = liveDualFeedCell;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        o.LJIIIZ(s, "s");
        LiveDualFeedCell liveDualFeedCell = this.LJLIL;
        liveDualFeedCell.LJLJI = true;
        InterfaceC86348Xui interfaceC86348Xui = liveDualFeedCell.LJLILLLLZI;
        if (interfaceC86348Xui != null) {
            interfaceC86348Xui.LIZ();
        }
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
        LiveDualFeedCell liveDualFeedCell = this.LJLIL;
        liveDualFeedCell.LJLJI = true;
        InterfaceC86348Xui interfaceC86348Xui = liveDualFeedCell.LJLILLLLZI;
        if (interfaceC86348Xui != null) {
            interfaceC86348Xui.LIZ();
        }
    }
}

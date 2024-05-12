package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDislikeVersion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cal, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31603Cal implements InterfaceC31607Cap {
    public final /* synthetic */ LongPressWidget LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Room LIZJ;
    public final /* synthetic */ int LIZLLL;

    public C31603Cal(LongPressWidget longPressWidget, String str, Room room, int i) {
        this.LIZ = longPressWidget;
        this.LIZIZ = str;
        this.LIZJ = room;
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC31607Cap
    public final void LIZ(int i) {
        Aweme aweme;
        String str;
        C31605Can c31605Can = this.LIZ.LJLJLJ;
        int value = LiveDislikeVersion.INSTANCE.getValue();
        C86343Xud LJLZ = c31605Can.LIZ.LJLZ();
        String str2 = null;
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (value == 3) {
            C30868C9o.LIZJ(R.string.mg9);
        } else {
            C30868C9o.LIZJ(R.string.o0w);
        }
        C86343Xud LJLZ2 = c31605Can.LIZ.LJLZ();
        if (LJLZ2 != null) {
            str = LJLZ2.LIZLLL;
        } else {
            str = null;
        }
        C2U8.LIZ(new C55045Liz(aweme, str));
        BZI LIZ = C28787BRn.LIZ("dislike_sec_submit");
        LIZ.LJIJJ(String.valueOf(i), "reason_id");
        LIZ.LJIJJ(this.LIZIZ, "enter_from_merge");
        LIZ.LJIJJ("live_cell", "enter_method");
        LIZ.LJIJJ("click", "action_type");
        LIZ.LJIJJ(String.valueOf(this.LIZJ.getId()), "room_id");
        LIZ.LJIJJ(this.LIZJ.getRequestId(), "request_id");
        User owner = this.LIZJ.getOwner();
        if (owner != null) {
            str2 = C278817o.LIZIZ(owner);
        }
        LIZ.LJIJJ(str2, "anchor_id");
        LIZ.LJJIIJZLJL();
        if (this.LIZLLL != 2 && C31205CMn.LIZ() != null) {
            C30033BqX.LLF(this.LIZJ, this.LIZIZ, "live_cell", "fyp");
        }
    }
}

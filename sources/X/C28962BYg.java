package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BYg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28962BYg implements InterfaceC31355CSh {
    @Override // X.InterfaceC31355CSh
    public final void LIZJ() {
    }

    @Override // X.InterfaceC31355CSh
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC31355CSh
    public final boolean LJIIIZ() {
        return ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).LR();
    }

    @Override // X.InterfaceC31355CSh
    public final boolean LIZ(Room room) {
        o.LJIIIZ(room, "room");
        return ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).FJ(room);
    }

    @Override // X.InterfaceC31355CSh
    public final void LIZIZ(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        C47071t1 c47071t1 = new C47071t1(publicScreenContext.LIZ);
        c47071t1.LJIILLIIL(R.string.o5o);
        c47071t1.LJFF(R.string.o5m);
        c47071t1.LJIIJJI(R.string.o5n);
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-7199619419911970097")).LIZ) {
            LIZ.show();
        }
        DataChannel dataChannel = publicScreenContext.LJIIIIZZ;
        if (dataChannel != null) {
            LJFF(dataChannel, "pin@star");
        }
    }

    public static void LJFF(DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_pin_cover");
        LIZ.LJIILLIIL(dataChannel);
        if (o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            LIZ.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
        }
        LIZ.LJIJJ(str, "order");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC31355CSh
    public final void LJ(DataChannel dataChannel, CS6 cs6, CS6 cs62) {
        User user;
        User user2;
        if ((cs6 != null && (user2 = cs6.LIZIZ) != null && user2.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) || (cs62 != null && (user = cs62.LIZIZ) != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) {
            LJFF(dataChannel, "star@pin");
        }
    }
}

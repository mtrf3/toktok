package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.C0q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30636C0q implements InterfaceC30642C0w {
    public long LIZ;
    public final /* synthetic */ InterfaceC30642C0w LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C04120Ee LIZLLL;

    @Override // X.InterfaceC30642C0w
    public final void F1() {
        this.LIZIZ.F1();
    }

    @Override // X.InterfaceC30642C0w
    public final String LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZIZ() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC30642C0w
    public final View LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
        this.LIZ = SystemClock.elapsedRealtime();
        C04130Ef.LIZIZ(C30627C0h.LJLILLLLZI.get(this.LIZJ), this.LIZLLL, "short_touch");
    }

    @Override // X.InterfaceC30642C0w
    public final String LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC30642C0w
    public final void LLLLZLL() {
        String str;
        Long l;
        PollEndContent pollEndContent;
        User user;
        Room room;
        PollEndContent pollEndContent2;
        this.LIZIZ.LLLLZLL();
        C04120Ee c04120Ee = this.LIZLLL;
        EnumC04110Ed enumC04110Ed = c04120Ee.LJIIIIZZ;
        if (enumC04110Ed == EnumC04110Ed.CANCEL) {
            PollMessage pollMessage = c04120Ee.LJI;
            if (pollMessage != null && (pollEndContent2 = pollMessage.endContent) != null && pollEndContent2.endType == 0) {
                str = "poll_timeout";
            } else {
                DataChannel dataChannel = C30627C0h.LJLILLLLZI.get(this.LIZJ);
                Long l2 = null;
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                PollMessage pollMessage2 = this.LIZLLL.LJI;
                if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && (user = pollEndContent.operator) != null) {
                    l2 = Long.valueOf(user.getId());
                }
                if (o.LJ(l, l2)) {
                    str = "anchor_close";
                } else {
                    str = "moderator_close";
                }
            }
        } else {
            int i = C30640C0u.LIZ[enumC04110Ed.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "others";
                } else {
                    str = "leave_room";
                }
            } else {
                str = "close_take";
            }
        }
        C04130Ef.LIZJ(C30627C0h.LJLILLLLZI.get(this.LIZJ), this.LIZLLL, SystemClock.elapsedRealtime() - this.LIZ, str, "short_touch");
    }

    public C30636C0q(InterfaceC30642C0w interfaceC30642C0w, long j, C04120Ee c04120Ee) {
        this.LIZIZ = interfaceC30642C0w;
        this.LIZJ = j;
        this.LIZLLL = c04120Ee;
    }
}

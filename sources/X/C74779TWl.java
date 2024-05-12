package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TWl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74779TWl {
    public final LinkPlayerInfo LIZ;
    public int LIZIZ = -1;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 598));
    public EnumC74781TWn LIZLLL;
    public final C73849Syb<Boolean> LJ;
    public final C73849Syb<Long> LJFF;
    public final C73849Syb<Boolean> LJI;
    public int LJII;

    public final User LIZ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-user>(...)");
        return (User) value;
    }

    public final boolean LIZIZ() {
        if (LIZ().getId() == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    public C74779TWl(LinkPlayerInfo linkPlayerInfo) {
        EnumC74781TWn enumC74781TWn;
        this.LIZ = linkPlayerInfo;
        this.LIZLLL = EnumC74781TWn.STATE_IDLE;
        Boolean bool = Boolean.FALSE;
        this.LJ = C73849Syb.LJJZZI(bool);
        this.LJFF = C73849Syb.LJJZZI(Long.valueOf(linkPlayerInfo.mFanTicket));
        this.LJI = C73849Syb.LJJZZI(bool);
        this.LJII = -1;
        if (LIZIZ()) {
            enumC74781TWn = EnumC74781TWn.STATE_PREPARING;
        } else {
            enumC74781TWn = EnumC74781TWn.STATE_LINKED;
        }
        this.LIZLLL = enumC74781TWn;
    }
}

package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.TqJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75883TqJ {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final ConcurrentHashSet<Long> LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public EnumC75674Tmw LJIILL;
    public boolean LJIILLIIL;
    public C75768ToS LJIIZILJ;
    public boolean LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public Integer LJJ;
    public EnumC75909Tqj LJJI;
    public boolean LJJIFFI;
    public String LJJII;
    public Object LJJIII;

    public final void LIZ() {
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ.clear();
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
    }

    public final boolean LIZJ() {
        if (this.LIZ == C44432HcC.LJI()) {
            return true;
        }
        return false;
    }

    public final boolean LJ() {
        if (this.LJJI.isInviting() || this.LJJI.isApplying() || this.LJJI.isInvitingMe() || this.LJJI.isApplyingMe()) {
            return true;
        }
        return false;
    }

    public final boolean LJFF() {
        if (this.LIZLLL == C44432HcC.LJI()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCoHostUser(uid=");
        sb.append(this.LIZ);
        sb.append(", roomId=");
        sb.append(this.LIZIZ);
        sb.append(", channelId=");
        sb.append(this.LIZJ);
        sb.append(", rivalUserId=");
        sb.append(this.LIZLLL);
        sb.append(", sdkRivalUserId=");
        sb.append(this.LJ);
        sb.append(", state=");
        sb.append(this.LJJI);
        sb.append(", playType=");
        sb.append(this.LJIILJJIL);
        sb.append(", linkRemainingTime=");
        sb.append(this.LJI);
        sb.append(", linkMicId='");
        sb.append(this.LJII);
        sb.append("', isGroupMerging=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isGroupMergingByMe=");
        sb.append(this.LJIIIZ);
        sb.append(", groupMergingUidsByMe=");
        sb.append(this.LJIIJ);
        sb.append(", groupOwnerUid=");
        sb.append(this.LJIIJJI);
        sb.append(", groupOwnerRoomId=");
        sb.append(this.LJIIL);
        sb.append(", groupOwnerChannelId=");
        sb.append(this.LJIILIIL);
        sb.append(", userInfo=");
        sb.append(this.LJIIZILJ);
        sb.append(", isBestTeammate=");
        sb.append(this.LJIJ);
        sb.append(", isInvitedBySelf=");
        sb.append(this.LJJIFFI);
        sb.append(", createSourceTag=");
        return C07670Rv.LIZIZ(sb, this.LJJII, ')');
    }

    public /* synthetic */ C75883TqJ(long j) {
        this(j, 0L);
    }

    public final void LIZIZ(String str) {
        Integer num;
        StringBuilder LIZIZ = C25620zW.LIZIZ("clearIM, source=", str, ", uid=");
        LIZIZ.append(this.LIZ);
        LIZIZ.append(", rivalUserId=");
        LIZIZ.append(this.LIZLLL);
        LIZIZ.append(", joinMessage=");
        Object obj = this.LJJIII;
        if (obj != null) {
            num = Integer.valueOf(obj.hashCode());
        } else {
            num = null;
        }
        LIZIZ.append(num);
        C0NB.LJIIIZ("MultiCoHostUser", X1D.LIZIZ(LIZIZ));
        this.LJJIII = null;
    }

    public final boolean LIZLLL(Long l) {
        long j = this.LIZ;
        if (l == null || l.longValue() != j) {
            return false;
        }
        return true;
    }

    public final void LJI(EnumC75909Tqj enumC75909Tqj) {
        o.LJIIIZ(enumC75909Tqj, "<set-?>");
        this.LJJI = enumC75909Tqj;
    }

    public C75883TqJ(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LJII = "";
        this.LJIIJ = new ConcurrentHashSet<>();
        this.LJIILL = EnumC75674Tmw.SUPPORT_MULTI;
        this.LJIILLIIL = true;
        this.LJIJI = -1L;
        this.LJIJJLI = "";
        this.LJJI = EnumC75909Tqj.IDLE;
        this.LJJII = "sdk";
    }
}

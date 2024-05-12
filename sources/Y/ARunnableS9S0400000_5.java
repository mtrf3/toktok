package Y;

import X.B83;
import X.C15380j0;
import X.C29374Bfu;
import X.C29852Bnc;
import X.C29948BpA;
import X.C72242sW;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class ARunnableS9S0400000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        long j;
        long j2;
        long j3;
        User owner;
        LiveMode streamType;
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = (C72242sW) this.l0;
        if ((currentTimeMillis - c72242sW.element) / 1000 < 1) {
            return;
        }
        c72242sW.element = System.currentTimeMillis();
        ((C29948BpA) this.l1).LJLIL.LLFF(String.valueOf((Long) this.l2));
        Room room = (Room) this.l3;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Room room2 = (Room) this.l3;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        Room room3 = (Room) this.l3;
        if (room3 != null) {
            j2 = room3.getId();
        } else {
            j2 = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqy);
        if (LJIILJJIL != null) {
            str2 = LJIILJJIL;
        }
        Long l = (Long) this.l2;
        if (l != null) {
            j3 = l.longValue();
        } else {
            j3 = 0;
        }
        C29852Bnc.LIZ(str, j, j2, currentUserId, j3, "all", "finished_goal", str2);
    }

    public final void LIZ$1() {
        String str;
        long j;
        long j2;
        long j3;
        User owner;
        LiveMode streamType;
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = (C72242sW) this.l0;
        if ((currentTimeMillis - c72242sW.element) / 1000 < 1) {
            return;
        }
        c72242sW.element = System.currentTimeMillis();
        ((C29948BpA) this.l1).LJII((Long) this.l2);
        Room room = (Room) this.l3;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Room room2 = (Room) this.l3;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        Room room3 = (Room) this.l3;
        if (room3 != null) {
            j2 = room3.getId();
        } else {
            j2 = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqs);
        if (LJIILJJIL != null) {
            str2 = LJIILJJIL;
        }
        Long l = (Long) this.l2;
        if (l != null) {
            j3 = l.longValue();
        } else {
            j3 = 0;
        }
        C29852Bnc.LIZ(str, j, j2, currentUserId, j3, "anchor", "ask_top_users", str2);
    }

    public static final void run$0(ARunnableS9S0400000_5 aRunnableS9S0400000_5) {
        boolean LIZ;
        try {
            aRunnableS9S0400000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0400000_5 aRunnableS9S0400000_5) {
        boolean LIZ;
        try {
            aRunnableS9S0400000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0400000_5(C72242sW c72242sW, C29948BpA c29948BpA, Long l, Room room, int i) {
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = c29948BpA;
        this.l2 = l;
        this.l3 = room;
    }
}

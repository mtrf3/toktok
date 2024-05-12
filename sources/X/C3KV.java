package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AqS3S0011000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3KV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KV {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C3KY.INSTANCE);
    public volatile boolean LIZIZ;
    public XKQ LIZJ;
    public volatile C3KX LIZLLL;

    public static Keva LIZ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "curUserId");
        if (curUserId.length() == 0 || o.LJ(curUserId, CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dm_unread_count_");
        LIZ.append(curUserId);
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    public static C3KX LIZJ() {
        boolean z;
        Keva LIZ;
        if ((C82133Kf.LIZ() & 16) != 0 || (C82133Kf.LIZ() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (LIZ = LIZ()) == null) {
            return null;
        }
        C3KX c3kx = new C3KX(LIZ.getInt("unreadCount", -1), LIZ.getBoolean("needUnreadDot", false), LIZ.getInt("unreadDot", -1));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tryLoadCache: info=");
        LIZ2.append(c3kx);
        C34B.LJI("DMInboxUnreadHelper", X1D.LIZIZ(LIZ2));
        if (c3kx.LJLIL < 0) {
            return null;
        }
        return c3kx;
    }

    public static void LIZIZ(C3KV c3kv, C3KX c3kx, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c3kv.getClass();
        C54362LVe.LJIJJLI(99, c3kx.LJLIL);
        C2U8.LIZ(new C54251LQx(99, c3kx.LJLIL));
        if (c3kx.LJLILLLLZI) {
            C54362LVe.LJIJJLI(101, c3kx.LJLJI);
            C2U8.LIZ(new C54251LQx(101, c3kx.LJLJI));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("postUnreadCount, info=");
        LIZ.append(c3kx);
        LIZ.append(", isDataReady=");
        LIZ.append(z);
        LIZ.append(", isFromCache=");
        LIZ.append(z2);
        C34B.LJI("DMInboxUnreadHelper", X1D.LIZIZ(LIZ));
        C3K5 c3k5 = C3K5.LJLIL;
        int i2 = c3kx.LJLIL;
        if (c3kx.LJLJI > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        synchronized (c3k5) {
            if (i2 > 0 || z3 || z4) {
                z5 = true;
            }
            C3K5.LIZJ("post_dm_unread", new C65232hD(z5, i2, z3));
            if (z5) {
                C3K5.LIZJ("post_valid_dm_unread", new AqS3S0011000_1(i2, z3, 1));
            }
        }
        c3kv.LIZLLL = c3kx;
    }
}

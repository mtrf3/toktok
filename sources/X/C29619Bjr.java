package X;

import Y.AfS0S1100200_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Bjr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29619Bjr {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(User user) {
        if (user != null) {
            if (C74947TbD.LJIILLIIL(user)) {
                return "anchor";
            }
            if (TV3.LJIIIIZZ(user)) {
                return "guest";
            }
            TV3.LJI(user);
        }
        return "audience";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    public static boolean LIZJ(User user) {
        boolean z = 1;
        if (user == null) {
            return false;
        }
        try {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            z = user.getId();
            if (currentUserId != z) {
                return user.isFollowing();
            }
            return true;
        } catch (Exception unused) {
            return z;
        }
    }

    public static void LIZ(User user, long j, C73318Sq2 compositeDisposable, String str, long j2) {
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                Long valueOf = Long.valueOf(room.getId());
                if (valueOf != null && valueOf.longValue() != 0) {
                    InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                    C29364Bfk c29364Bfk = new C29364Bfk();
                    c29364Bfk.LIZIZ(j);
                    c29364Bfk.LJ(valueOf.longValue());
                    compositeDisposable.LIZ(((C29374Bfu) LIZIZ).LJIIIIZZ(c29364Bfk.LIZJ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1100200_5(user, j, str, j2, 1), C29620Bjs.LJLIL));
                }
            }
        } catch (Exception unused) {
        }
    }
}

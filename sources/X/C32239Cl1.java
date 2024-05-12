package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Cl1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32239Cl1 implements InterfaceC32258ClK {
    public final Context LIZ;

    @Override // X.InterfaceC32258ClK
    public final boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (C31120CJg.LIZJ(LJ, room) == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC32258ClK
    public final C32240Cl2 getRoomInfo() {
        long j;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        C32240Cl2 c32240Cl2 = new C32240Cl2();
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        c32240Cl2.LIZIZ = j;
        if (room != null) {
            j2 = room.getOwnerUserId();
        }
        c32240Cl2.LIZJ = j2;
        return c32240Cl2;
    }

    @Override // X.InterfaceC32258ClK
    public final String LIZ() {
        String LIZ = C30443Bx9.LIZ();
        o.LJIIIIZZ(LIZ, "getSdkVersion()");
        return LIZ;
    }

    @Override // X.InterfaceC32258ClK
    public final long getUserId() {
        return C025908h.LIZ();
    }

    @Override // X.InterfaceC32258ClK
    public final Context context() {
        return this.LIZ;
    }

    public C32239Cl1(Context context) {
        this.LIZ = context;
    }
}

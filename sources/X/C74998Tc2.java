package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tc2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74998Tc2 {
    public static final /* synthetic */ int LIZ = 0;

    public static TQ8 LIZ() {
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (obj instanceof TQ8) {
            return (TQ8) obj;
        }
        return null;
    }

    public static EnumC75006TcA LIZIZ() {
        AbstractC74727TUl LIZ2;
        List LJJI;
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (C74947TbD.LJIILLIIL(LJ)) {
            return EnumC75006TcA.ANCHOR;
        }
        TQ8 LIZ3 = LIZ();
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null && (LJJI = LIZ2.LJJI()) != null) {
            Iterator it = LJJI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                User user = ((LinkListUser) next).user;
                if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    if (next != null) {
                        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
                        if (!C74947TbD.LJIILLIIL(LJ2)) {
                            return EnumC75006TcA.GUEST;
                        }
                    }
                }
            }
        }
        return EnumC75006TcA.AUDIENCE;
    }

    public static long LIZJ(String linkMicId) {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ2;
        List LJJI;
        User user;
        AbstractC74727TUl LIZ3;
        List LJJI2;
        User user2;
        o.LJIIIZ(linkMicId, "linkMicId");
        int i = C75008TcC.LIZ[LIZIZ().ordinal()];
        Object obj = null;
        if (i != 1) {
            if (i == 2 || i == 3) {
                TQ8 LIZ4 = LIZ();
                if (LIZ4 != null && (LIZ3 = LIZ4.LIZ()) != null && (LJJI2 = LIZ3.LJJI()) != null) {
                    Iterator it = LJJI2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((LinkListUser) next).linkMicId, linkMicId)) {
                            obj = next;
                            break;
                        }
                    }
                    LinkListUser linkListUser = (LinkListUser) obj;
                    if (linkListUser != null && (user2 = linkListUser.user) != null) {
                        return user2.getId();
                    }
                }
                C74995Tbz.LJII.getClass();
                return C74995Tbz.LJIIJ;
            }
            throw new C162476Zf();
        }
        Object obj2 = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((obj2 instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj2) != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ2.LJJI()) != null) {
            Iterator it2 = LJJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (o.LJ(((LinkPlayerInfo) next2).mInteractIdStr, linkMicId)) {
                    obj = next2;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                return user.getId();
            }
        }
        C74995Tbz.LJII.getClass();
        return C74995Tbz.LJIIJ;
    }
}

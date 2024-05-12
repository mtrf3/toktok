package X;

import Y.IDComparatorS41S0000000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TqG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75880TqG {
    public Room LIZ;
    public final ConcurrentHashMap<Long, C75883TqJ> LIZIZ = new ConcurrentHashMap<>();
    public final List<LinkUser> LIZJ = new ArrayList();
    public final ConcurrentHashMap<Long, C75883TqJ> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, C75883TqJ> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashSet<InterfaceC75923Tqx> LJFF = new ConcurrentHashSet<>();

    public final long LIZIZ() {
        Room room = this.LIZ;
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    public final List<C75883TqJ> LIZJ() {
        Room room = this.LIZ;
        if (room == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        long ownerUserId = room.getOwnerUserId();
        C75883TqJ c75883TqJ = this.LIZIZ.get(Long.valueOf(ownerUserId));
        if (c75883TqJ != null) {
            arrayList.add(c75883TqJ);
        }
        Collection<C75883TqJ> values = this.LIZIZ.values();
        o.LJIIIIZZ(values, "userMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (C75883TqJ c75883TqJ2 : values) {
            C75883TqJ c75883TqJ3 = c75883TqJ2;
            if (!c75883TqJ3.LIZLLL(Long.valueOf(ownerUserId)) && c75883TqJ3.LJJI == EnumC75909Tqj.LINKED) {
                arrayList2.add(c75883TqJ2);
            }
        }
        arrayList.addAll(ORZ.LLILII(new IDComparatorS41S0000000_13(9), arrayList2));
        return arrayList;
    }

    public final C75883TqJ LIZ(long j) {
        C75768ToS c75768ToS;
        User owner;
        C75883TqJ LIZLLL = LIZLLL(j);
        if (LIZLLL == null) {
            LIZLLL = new C75883TqJ(j);
            if (C44432HcC.LJI() == j) {
                Room room = this.LIZ;
                if (room != null && (owner = room.getOwner()) != null) {
                    c75768ToS = C44432HcC.LJIILL(owner);
                } else {
                    c75768ToS = null;
                }
                LIZLLL.LJIIZILJ = c75768ToS;
            }
        }
        this.LIZIZ.put(Long.valueOf(j), LIZLLL);
        return LIZLLL;
    }

    public final C75883TqJ LIZLLL(long j) {
        return this.LIZIZ.get(Long.valueOf(j));
    }

    public final void LJFF(long j) {
        C44878HjO.LIZJ("removeUser, uid = ", j, "MultiHostCrossUserManager");
        C75883TqJ c75883TqJ = this.LIZIZ.get(Long.valueOf(j));
        if (c75883TqJ != null) {
            c75883TqJ.LJI(EnumC75909Tqj.IDLE);
        }
        this.LIZIZ.remove(Long.valueOf(j));
        Iterator<InterfaceC75923Tqx> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(j);
        }
    }

    public final void LJ(long j, String str) {
        Long l;
        int size = this.LIZLLL.size();
        C75883TqJ remove = this.LIZLLL.remove(Long.valueOf(j));
        int size2 = this.LIZLLL.size();
        if (remove != null) {
            remove.LJJII = "sdk";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeLocalInvitingUser, uid = ");
        if (remove != null) {
            l = Long.valueOf(remove.LIZ);
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(", beforeSize=");
        LIZ.append(size);
        LIZ.append(", afterSize=");
        b1.LJ(LIZ, size2, LIZ, "MultiHostCrossUserManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0362, code lost:
    
        if (r2 == null) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.InterfaceC75441TjB r19, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r20, X.EnumC75909Tqj r21, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r22, boolean r23, boolean r24, java.util.HashSet r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75880TqG.LJI(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser, X.Tqj, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent, boolean, boolean, java.util.HashSet, java.lang.String, boolean):void");
    }
}

package X;

import Y.IDbS398S0100000_1;
import Y.IDcS133S0200000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4W7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W7 {
    public static int LJIIIIZZ = 10;
    public final java.util.Map<String, C63120Opw> LIZ;
    public C4W9 LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public volatile long LJFF;
    public final EnumC97443s4 LJI;
    public final boolean LJII;

    public C4W7() {
        this(EnumC97443s4.ALL, false);
    }

    public final void LIZLLL() {
        C63322OtC.LJFF("StrangerListModel loadMoreFromLocal");
        if (this.LIZ.isEmpty()) {
            C63322OtC.LJFF("StrangerListModel loadMoreFromLocal un refreshed");
            this.LIZJ = false;
            return;
        }
        C63120Opw c63120Opw = (C63120Opw) ListProtector.get(new ArrayList(this.LIZ.values()), r1.size() - 1);
        if (c63120Opw == null) {
            C63322OtC.LIZLLL("StrangerListModel loadMoreFromLocal lastConversation null");
        } else {
            RunnableC63345OtZ.LJ(new IDcS133S0200000_1(this, c63120Opw, 2), new IDbS398S0100000_1(this, 8), false);
        }
    }

    public static Integer LIZJ() {
        if (C63308Osy.LJI().LIZLLL().LJLLJ && C63308Osy.LJI().LIZLLL().LJLJJL) {
            return -1;
        }
        return Integer.valueOf(LJIIIIZZ);
    }

    public final List<C63120Opw> LIZIZ() {
        return C63133Oq9.LJIILIIL(LIZJ().intValue(), -1L, this.LJI);
    }

    public final void LIZ(List<C63120Opw> list) {
        if (list != null && !list.isEmpty()) {
            for (C63120Opw c63120Opw : list) {
                if (c63120Opw != null) {
                    this.LIZ.put(c63120Opw.getConversationId(), c63120Opw);
                }
            }
        }
    }

    public C4W7(EnumC97443s4 enumC97443s4, boolean z) {
        this.LIZ = Collections.synchronizedMap(new LinkedHashMap());
        this.LJI = enumC97443s4;
        this.LJII = z;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TqL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75885TqL implements InterfaceC76688U7w {
    public static final C75885TqL LIZ = new C75885TqL();
    public static java.util.Map<String, ? extends Object> LIZIZ;
    public static java.util.Map<String, ? extends Object> LIZJ;

    public static EnumC75614Tly LJJIII(int i) {
        for (EnumC75614Tly enumC75614Tly : EnumC75614Tly.values()) {
            if (enumC75614Tly.getType() == i) {
                return enumC75614Tly;
            }
        }
        return null;
    }

    @Override // X.InterfaceC76688U7w
    public final void LIZJ(C75951TrP param) {
        long j;
        Long l;
        o.LJIIIZ(param, "param");
        java.util.Map<String, ? extends Object> map = LIZJ;
        Object obj = null;
        if (map != null) {
            obj = map.get("show_timestamp");
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        new C75878TqE().LJIJ(param.LJLILLLLZI, j);
    }

    @Override // X.InterfaceC76688U7w
    public final void LIZLLL(C75919Tqt param) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIJIIJIL(param.LJLILLLLZI, param.LJLJJI);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJFF(C75951TrP param) {
        Object obj;
        long j;
        boolean z;
        Boolean bool;
        Long l;
        o.LJIIIZ(param, "param");
        java.util.Map<String, ? extends Object> map = LIZJ;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        java.util.Map<String, ? extends Object> map2 = LIZJ;
        if (map2 != null) {
            obj2 = map2.get("is_turn_off");
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        new C75878TqE().LJJIZ(param.LJLILLLLZI, j, param.LJLJJL.replyStatus, z);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIIIZZ(Throwable th) {
        C75878TqE c75878TqE = new C75878TqE();
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIIJJI();
        c75878TqE.LJIILLIIL("leave_failed");
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIIZ(C76689U7x param) {
        o.LJIIIZ(param, "param");
        long j = param.LIZIZ;
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJII(j, C75545Tkr.LIZIZ(LJJIII));
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIJJI(C75952TrQ param) {
        long j;
        Long l;
        o.LJIIIZ(param, "param");
        java.util.Map<String, ? extends Object> map = LIZIZ;
        Object obj = null;
        if (map != null) {
            obj = map.get("show_timestamp");
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        new C75878TqE().LJIJJLI(param.LJLILLLLZI, j);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIL(C75918Tqs param) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIIZ(param.LJLILLLLZI, param.LJLJJI);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIILIIL(C75952TrQ param) {
        Object obj;
        long j;
        boolean z;
        Boolean bool;
        Long l;
        o.LJIIIZ(param, "param");
        java.util.Map<String, ? extends Object> map = LIZIZ;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        java.util.Map<String, ? extends Object> map2 = LIZIZ;
        if (map2 != null) {
            obj2 = map2.get("is_turn_off");
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        new C75878TqE().LJJJJ(param.LJLILLLLZI, j, param.LJLJJL.replyStatus, z);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIILLIIL(C76684U7s param) {
        o.LJIIIZ(param, "param");
        C75878TqE c75878TqE = new C75878TqE();
        String str = param.LJFF;
        if (str == null) {
            str = "";
        }
        c75878TqE.LJJJLL(str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJJIFFI(C76690U7y param) {
        o.LJIIIZ(param, "param");
        long j = param.LIZIZ;
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJJJLL(j, C75545Tkr.LIZIZ(LJJIII));
    }

    @Override // X.InterfaceC76688U7w
    public final void LIZ(C75951TrP param, Throwable th) {
        o.LJIIIZ(param, "param");
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(param.LJLILLLLZI), true);
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIIJJI();
        c75878TqE.LJIILLIIL("accept_apply_failed");
    }

    @Override // X.InterfaceC76688U7w
    public final void LIZIZ(C75951TrP param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJIJI(param.LJLILLLLZI, str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJ(C75951TrP param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJJ(param.LJLJJL.replyStatus, param.LJLILLLLZI, str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJI(C75919Tqt param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIJIL(param.LJLILLLLZI, str, param.LJLJJI);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJII(C75918Tqs param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIIZI(param.LJLILLLLZI, str, param.LJLJJI);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIJ(C75952TrQ param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJJJI(param.LJLJJL.replyStatus, param.LJLILLLLZI, 0L, str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIILJJIL(C75952TrQ param, String str) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJIL(param.LJLILLLLZI, str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIILL(C76689U7x param, String str) {
        o.LJIIIZ(param, "param");
        long j = param.LIZIZ;
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJIII(j, C75545Tkr.LIZIZ(LJJIII), str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIIZILJ(C75918Tqs param, Throwable th) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIIJ(param.LJLILLLLZI, param.LJLJJI, th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIJ(C75919Tqt param, Throwable th) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIJ(param.LJLILLLLZI, param.LJLJJI, th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIJI(C75952TrQ param, Throwable th) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJJI(param.LJLJJL.replyStatus, param.LJLILLLLZI, 0L, th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIJJ(C76690U7y param, Throwable th) {
        o.LJIIIZ(param, "param");
        long j = param.LIZIZ;
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJJJJL(j, C75545Tkr.LIZIZ(LJJIII), th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIJJLI(C76689U7x param, Throwable th) {
        o.LJIIIZ(param, "param");
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJ(param.LIZIZ, C75545Tkr.LIZIZ(LJJIII), th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJIL(C76690U7y param, String str) {
        o.LJIIIZ(param, "param");
        long j = param.LIZIZ;
        EnumC75614Tly LJJIII = LJJIII(param.LJFF.sourceType);
        if (LJJIII == null) {
            LJJIII = EnumC75614Tly.NONE;
        }
        new C75878TqE().LJJJJZI(j, C75545Tkr.LIZIZ(LJJIII), str);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJJ(C75952TrQ param, Throwable th) {
        o.LJIIIZ(param, "param");
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(param.LJLILLLLZI), true);
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIIJJI();
        c75878TqE.LJIILLIIL("accept_invite_failed");
    }

    @Override // X.InterfaceC76688U7w
    public final void LJJI(C75951TrP param, Throwable th) {
        o.LJIIIZ(param, "param");
        new C75878TqE().LJJIJLIJ(param.LJLJJL.replyStatus, param.LJLILLLLZI, th);
    }

    @Override // X.InterfaceC76688U7w
    public final void LJJII(C76684U7s param, String str) {
        o.LJIIIZ(param, "param");
        C75878TqE c75878TqE = new C75878TqE();
        String str2 = param.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        c75878TqE.LJJJLZIJ(str2, str);
    }
}

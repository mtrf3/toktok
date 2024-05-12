package X;

import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vap, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80019Vap extends AbstractC80014Vak implements InterfaceC80059VbT, InterfaceC80037Vb7, InterfaceC81172VtQ {
    public final AqS164S0100000_14 LJLILLLLZI = new AqS164S0100000_14(this, 516);
    public final InterfaceC80020Vaq LJLJI;

    @Override // X.InterfaceC80059VbT
    public final boolean LIZIZ(C48651J7n c48651J7n) {
        return false;
    }

    @Override // X.InterfaceC80037Vb7
    public final InterfaceC79968Va0 LIZJ(InterfaceC79968Va0 interfaceC79968Va0) {
        return interfaceC79968Va0;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJII(C48651J7n c48651J7n) {
        return false;
    }

    @Override // X.InterfaceC80037Vb7
    public final EnumC79963VZv LJIIIIZZ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        return playMode;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final C73363Sql LJIJI(C73363Sql c73363Sql) {
        return c73363Sql;
    }

    @Override // X.InterfaceC81172VtQ
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC81172VtQ
    public final void onAppBackground() {
        V1L v1l;
        InterfaceC80022Vas interfaceC80022Vas;
        EnumC79954VZm LJ;
        C80024Vau c80024Vau;
        InterfaceC80022Vas interfaceC80022Vas2;
        InterfaceC80025Vav interfaceC80025Vav;
        C80024Vau c80024Vau2 = this.LJLIL;
        if (c80024Vau2 != null && (interfaceC80025Vav = c80024Vau2.LJLJJLL) != null) {
            v1l = interfaceC80025Vav.LIZ();
        } else {
            v1l = null;
        }
        if (!LJIJJLI(v1l)) {
            C80024Vau c80024Vau3 = this.LJLIL;
            if (c80024Vau3 != null && (interfaceC80022Vas = c80024Vau3.LJLJJL) != null && (LJ = interfaceC80022Vas.LJ()) != null && LJ.isPlayingState()) {
                if (LJIL(this) && (c80024Vau = this.LJLIL) != null && (interfaceC80022Vas2 = c80024Vau.LJLJJL) != null) {
                    interfaceC80022Vas2.LJIIIZ(null);
                    return;
                }
                return;
            }
            LJIL(this);
        }
    }

    @Override // X.InterfaceC80013Vaj
    public final void onDetach() {
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null) {
            c80024Vau.LJLJI.LJIILLIIL(this);
            c80024Vau.LJLJJI.LJIILL(this);
        }
        InterfaceC80020Vaq interfaceC80020Vaq = this.LJLJI;
        if (interfaceC80020Vaq != null) {
            interfaceC80020Vaq.removeAppVisibilityChangeListener(this);
        }
    }

    public C80019Vap(InterfaceC80020Vaq interfaceC80020Vaq) {
        this.LJLJI = interfaceC80020Vaq;
    }

    public static boolean LJIJJLI(V1L v1l) {
        Boolean mCanBackgroundPlay;
        if (!(v1l instanceof XAudioSrc)) {
            v1l = null;
        }
        XAudioSrc xAudioSrc = (XAudioSrc) v1l;
        if (xAudioSrc != null && (mCanBackgroundPlay = xAudioSrc.getMCanBackgroundPlay()) != null) {
            return mCanBackgroundPlay.booleanValue();
        }
        return true;
    }

    public static boolean LJIL(C80019Vap c80019Vap) {
        V1L v1l;
        InterfaceC80025Vav interfaceC80025Vav;
        InterfaceC80025Vav interfaceC80025Vav2;
        AqS164S0100000_14 aqS164S0100000_14 = c80019Vap.LJLILLLLZI;
        C80024Vau c80024Vau = c80019Vap.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav2 = c80024Vau.LJLJJLL) != null) {
            v1l = interfaceC80025Vav2.LIZ();
        } else {
            v1l = null;
        }
        V1L LJIJJ = c80019Vap.LJIJJ(v1l, false);
        if (LJIJJ == null) {
            aqS164S0100000_14.invoke();
            return false;
        }
        C80024Vau c80024Vau2 = c80019Vap.LJLIL;
        if (c80024Vau2 != null && (interfaceC80025Vav = c80024Vau2.LJLJJLL) != null) {
            interfaceC80025Vav.LJIIJ(LJIJJ, null);
        }
        return true;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJI(C48651J7n c48651J7n) {
        return LJIIIZ(null);
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIIIZ(C48651J7n c48651J7n) {
        V1L v1l;
        InterfaceC80025Vav interfaceC80025Vav;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav = c80024Vau.LJLJJLL) != null) {
            v1l = interfaceC80025Vav.LIZ();
        } else {
            v1l = null;
        }
        InterfaceC80020Vaq interfaceC80020Vaq = this.LJLJI;
        if (interfaceC80020Vaq == null || !interfaceC80020Vaq.isAppBackground() || !(!LJIJJLI(v1l))) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("This song ");
        LIZ.append(v1l);
        LIZ.append(" not support playing background.");
        X1D.LIZIZ(LIZ);
        return true;
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80013Vaj
    public final void LJIILL(C80024Vau c80024Vau) {
        this.LJLIL = c80024Vau;
        c80024Vau.LJLJI.LJIL(this);
        c80024Vau.LJLJJI.LJIIJJI(this);
        InterfaceC80020Vaq interfaceC80020Vaq = this.LJLJI;
        if (interfaceC80020Vaq != null) {
            interfaceC80020Vaq.addAppVisibilityChangeListener(this);
        }
    }

    @Override // X.InterfaceC80037Vb7
    public final V1L LJ(V1L v1l, C48651J7n c48651J7n) {
        String str;
        InterfaceC80020Vaq interfaceC80020Vaq = this.LJLJI;
        if (interfaceC80020Vaq != null && interfaceC80020Vaq.isAppBackground() && (!LJIJJLI(v1l))) {
            if (c48651J7n != null) {
                str = c48651J7n.LIZ;
            } else {
                str = null;
            }
            return LJIJJ(v1l, o.LJ(str, "operation_from_media_session_skip_to_prev"));
        }
        return v1l;
    }

    public final V1L LJIJJ(V1L v1l, boolean z) {
        InterfaceC80025Vav interfaceC80025Vav;
        InterfaceC79968Va0 LJIJJLI;
        String str;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav = c80024Vau.LJLJJLL) != null && (LJIJJLI = interfaceC80025Vav.LJIJJLI()) != null) {
            List<V1L> LIZIZ = LJIJJLI.LIZIZ();
            Iterator<V1L> it = LIZIZ.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    String id = it.next().getId();
                    if (v1l != null) {
                        str = v1l.getId();
                    } else {
                        str = null;
                    }
                    if (o.LJ(id, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (z) {
                C40511Fv9 LJIILLIIL = C78842Uww.LJIILLIIL(i - 1, 0);
                int i2 = LJIILLIIL.LJLIL;
                int i3 = LJIILLIIL.LJLILLLLZI;
                int i4 = LJIILLIIL.LJLJI;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        V1L v1l2 = (V1L) ORZ.LJLLLLLL(i2, LIZIZ);
                        if (LJIJJLI(v1l2)) {
                            return v1l2;
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                C40511Fv9 LJIILLIIL2 = C78842Uww.LJIILLIIL(LIZIZ.size() - 1, i + 1);
                int i5 = LJIILLIIL2.LJLIL;
                int i6 = LJIILLIIL2.LJLILLLLZI;
                int i7 = LJIILLIIL2.LJLJI;
                if (i7 < 0 ? i5 >= i6 : i5 <= i6) {
                    while (true) {
                        V1L v1l3 = (V1L) ORZ.LJLLLLLL(i5, LIZIZ);
                        if (LJIJJLI(v1l3)) {
                            return v1l3;
                        }
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    }
                }
            } else {
                C40517FvF LJJ = C78842Uww.LJJ(i + 1, LIZIZ.size());
                int i8 = LJJ.LJLIL;
                int i9 = LJJ.LJLILLLLZI;
                if (i8 <= i9) {
                    while (true) {
                        V1L v1l4 = (V1L) ORZ.LJLLLLLL(i8, LIZIZ);
                        if (LJIJJLI(v1l4)) {
                            return v1l4;
                        }
                        if (i8 == i9) {
                            break;
                        }
                        i8++;
                    }
                }
                C40517FvF LJJ2 = C78842Uww.LJJ(0, i);
                int i10 = LJJ2.LJLIL;
                int i11 = LJJ2.LJLILLLLZI;
                if (i10 <= i11) {
                    while (true) {
                        V1L v1l5 = (V1L) ORZ.LJLLLLLL(i10, LIZIZ);
                        if (LJIJJLI(v1l5)) {
                            return v1l5;
                        }
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return null;
    }
}

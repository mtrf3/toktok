package X;

import Y.ARunnableS3S0001000_8;
import Y.ARunnableS44S0100000_8;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQT extends C0A6 implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLIIIL = 0;
    public final RecyclerView LJLIL;
    public final View LJLILLLLZI;
    public final InterfaceC65784Pro<Integer> LJLJI;
    public AbstractC65781Prl LJLJJL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public JQX LLFII;
    public Integer LLFZ;
    public Integer LLI;
    public long LLIFFJFJJ;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 549));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C48972JJw.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C49132JQa.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(JQZ.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C2VD.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C49144JQm.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C49138JQg.LJLIL);
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 550));
    public final C62822Ol8 LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 551));
    public int LLIIII = 1;
    public final C62822Ol8 LLIIIILZ = C221108m2.LIZIZ(C49136JQe.LJLIL);
    public final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(C49135JQd.LJLIL);

    public final void LJIIZILJ() {
        if (!this.LLFF || this.LJZL) {
            return;
        }
        if (LJJIJ().LJII()) {
            LJJIJ().LIZ();
        } else {
            LJJIJ().LJ(this.LJLILLLLZI);
        }
        LJIILLIIL(this.LLIIII);
    }

    public final JQU LJIJJLI() {
        return (JQU) this.LJLLL.getValue();
    }

    public final java.util.Map<C35492DwO, Float> LJIL() {
        return (java.util.Map) this.LJLJLJ.getValue();
    }

    public final ConcurrentHashMap<Integer, JQX> LJJ() {
        return (ConcurrentHashMap) this.LJLJJLL.getValue();
    }

    public final java.util.Map<C35492DwO, Float> LJJI() {
        return (java.util.Map) this.LJLJL.getValue();
    }

    public final boolean LJJIIJ() {
        return ((Boolean) this.LLII.getValue()).booleanValue();
    }

    public final JQX[] LJJIIZ() {
        return (JQX[]) this.LLIIIJ.getValue();
    }

    public final JQX[] LJJIIZI() {
        return (JQX[]) this.LLIIIILZ.getValue();
    }

    public final JQY<Float> LJJIJ() {
        return (JQY) this.LJLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:
    
        if (r0.LLJJJ() == r8.LJLJI.invoke().intValue()) goto L50;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Pro, X.Prl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQT.LJJJJ():void");
    }

    public final void LJIJ() {
        int length = LJJIIZI().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LJJIIZI()[i2] = null;
            i++;
            i2++;
        }
        int length2 = LJJIIZ().length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            LJJIIZ()[i4] = null;
            i3++;
            i4++;
        }
        C49133JQb.LIZ("searchAutoPlay", "cleared");
    }

    public final JQX LJIJJ() {
        JQX jqx;
        Collection<JQX> values = LJJ().values();
        o.LJIIIIZZ(values, "holderMap.values");
        Iterator<JQX> it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                jqx = it.next();
                JQX jqx2 = jqx;
                if (jqx2.LLLLIIL().LLJJJ() == this.LJLJI.invoke().intValue() && C49152JQu.LIZIZ(Integer.valueOf(jqx2.LLLLIIL().LIZ())) && jqx2.LLLLIIL().LIZLLL()) {
                    break;
                }
            } else {
                jqx = null;
                break;
            }
        }
        return jqx;
    }

    public final float LJJII() {
        return LJJIJ().LJIIIZ().floatValue();
    }

    public final JQX LJJIII() {
        JQX jqx;
        InterfaceC49137JQf priority;
        InterfaceC49137JQf priority2;
        Collection<JQX> values = LJJ().values();
        o.LJIIIIZZ(values, "holderMap.values");
        Iterator<JQX> it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                jqx = it.next();
                JQX jqx2 = jqx;
                if (jqx2.LLLLIIL().LLJJJ() >= 0 && C49152JQu.LIZIZ(Integer.valueOf(jqx2.LLLLIIL().LIZ())) && (priority = jqx2.getPriority()) != null && priority.C() && jqx2.LLLLIIL().LIZLLL() && (priority2 = jqx2.getPriority()) != null && priority2.LJJJJ() >= 0.5d) {
                    break;
                }
            } else {
                jqx = null;
                break;
            }
        }
        return jqx;
    }

    public final boolean LJJIJIIJIL() {
        JQX[] LJJIIZI = LJJIIZI();
        int length = LJJIIZI.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (!o.LJ(LJJIIZI[i], LJJIIZ()[i2])) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    public final void LJJJJI() {
        JIB jib;
        View LJJIJIL;
        JGI LJJJLL;
        JGI LJJJLL2;
        JGI LJJJLL3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stopping, curPlayingHolder = ");
        LIZ.append(C78926UyI.LJIILIIL(this.LLFII));
        LIZ.append(", ");
        X1D.LIZIZ(LIZ);
        if (LJIJJLI().LIZIZ) {
            JQU LJIJJLI = LJIJJLI();
            LJIJJLI.LIZJ = true;
            LJIJJLI.LIZIZ = false;
            LJIJJLI.removeMessages(1);
        }
        JQX LJIJI = LJIJI(0);
        if (J21.LIZ() && (LJJJLL3 = C78926UyI.LJJJLL(LJIJI)) != null) {
            LJJJLL3.LJIIZILJ();
        }
        JQX LJIJI2 = LJIJI(1);
        if (J21.LIZ() && (LJJJLL2 = C78926UyI.LJJJLL(LJIJI2)) != null) {
            LJJJLL2.LJIIZILJ();
        }
        JQX jqx = this.LLFII;
        if (J21.LIZ() && (LJJJLL = C78926UyI.LJJJLL(jqx)) != null) {
            LJJJLL.LJIIZILJ();
        }
        InterfaceC48907JHj LIZLLL = JLU.LIZLLL();
        if (LIZLLL != null && (LJJIJIL = LIZLLL.LJJIJIL()) != null) {
            jib = C1DF.LJIIJ(LJJIJIL);
        } else {
            jib = null;
        }
        if (o.LJ(C1DF.LJIIJ(this.LJLIL), jib) && LIZLLL != null) {
            LIZLLL.LLLLLJLJLL();
        }
    }

    public final void LJIILLIIL(int i) {
        int i2;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("speed is ");
        LIZ.append(Math.abs(i));
        LIZ.append(" and direction");
        LIZ.append(i2);
        LIZ.append(' ');
        X1D.LIZIZ(LIZ);
        if (C49146JQo.LIZ()) {
            LJJIJIIJI(i2, i);
        } else {
            Integer num = this.LLFZ;
            if (num == null) {
                this.LLFZ = Integer.valueOf(i2);
                LJJI().clear();
                LJIL().clear();
            } else if (num.intValue() != i2) {
                this.LLFZ = Integer.valueOf(i2);
                LJJI().clear();
                LJIL().clear();
            }
            if (Math.abs(i) > 30) {
                z = true;
            } else {
                z = false;
            }
            float f9 = this.LJLLILLLL;
            float floatValue = LJJIJ().LJIIJJI().floatValue() + f9;
            float LJJII = LJJII() + f9;
            StringBuilder LJ = C7MY.LJ("processScroll: ", i, ", totalHolders: ");
            LJ.append(LJJ().size());
            X1D.LIZIZ(LJ);
            for (JQX jqx : LJJ().values()) {
                int LJIILIIL = C78926UyI.LJIILIIL(jqx);
                if (LJIILIIL >= 0 && jqx.LLLLIIL().LIZLLL()) {
                    jqx.LLLLIIL().LJIIIIZZ().getLocationOnScreen((int[]) this.LJLLJ.getValue());
                    float f10 = ((int[]) this.LJLLJ.getValue())[1];
                    float f11 = this.LJLLI + f10;
                    int LJLLI = jqx.LLLLIIL().LJLLI();
                    if (C49152JQu.LIZIZ(Integer.valueOf(jqx.LLLLIIL().LIZ())) && i != 0) {
                        if (LJJII() >= f10 && LJJII() <= jqx.LLLLIIL().LJIIIIZZ().getHeight() + f10) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("HIT SINGLE LINE CARD, holder #");
                            LIZ2.append(C78926UyI.LJIILIIL(jqx));
                            X1D.LIZIZ(LIZ2);
                            LJJIZ(jqx, z, false);
                        }
                    } else if (LJLLI == 0) {
                        if (i2 == 1) {
                            Float f12 = LJJI().get(new C35492DwO(jqx, Integer.valueOf(LJIILIIL)));
                            if (f12 != null) {
                                f7 = f12.floatValue();
                            } else {
                                f7 = f10;
                            }
                            if (f7 > f10) {
                                f8 = f10;
                            } else {
                                f8 = f7;
                            }
                            if (f7 < f10) {
                                f7 = f10;
                            }
                            if (f8 <= LJJII && LJJII <= f7) {
                                UC7.LIZLLL("HIT LEFT DOWN   #", LJIILIIL);
                                if (LJJIZ(jqx, z, false)) {
                                    LJJJ(C78926UyI.LJIJ(jqx) + 1);
                                }
                            }
                        } else if (i2 == -1) {
                            Float f13 = LJJI().get(new C35492DwO(jqx, Integer.valueOf(LJIILIIL)));
                            if (f13 != null) {
                                f5 = f13.floatValue();
                            } else {
                                f5 = f10;
                            }
                            if (f5 > f10) {
                                f6 = f10;
                            } else {
                                f6 = f5;
                            }
                            if (f5 < f10) {
                                f5 = f10;
                            }
                            if (f6 <= floatValue && floatValue <= f5) {
                                UC7.LIZLLL("HIT LEFT UP     #", LJIILIIL);
                                if (LJJIZ(jqx, z, false)) {
                                    LJJJ(C78926UyI.LJIJ(jqx) - 1);
                                }
                            }
                        } else {
                            throw new IllegalStateException(C0NY.LIZIZ("Unsupported column index ", LJLLI, " found"));
                        }
                    } else {
                        if (LJLLI == 1) {
                            if (i2 == 1) {
                                Float f14 = LJJI().get(new C35492DwO(jqx, Integer.valueOf(LJIILIIL)));
                                if (f14 != null) {
                                    f3 = f14.floatValue();
                                } else {
                                    f3 = f10;
                                }
                                if (f3 > f10) {
                                    f4 = f10;
                                } else {
                                    f4 = f3;
                                }
                                if (f3 < f10) {
                                    f3 = f10;
                                }
                                if (f4 <= floatValue && floatValue <= f3) {
                                    UC7.LIZLLL("HIT RIGHT DOWN  #", LJIILIIL);
                                    if (LJJIZ(jqx, z, false)) {
                                        LJJJ(C78926UyI.LJIJ(jqx) + 1);
                                    }
                                }
                            }
                        } else if (LJLLI != 1) {
                            throw new IllegalStateException(C0NY.LIZIZ("Unsupported column index ", LJLLI, " found"));
                        }
                        if (i2 == -1) {
                            Float f15 = LJIL().get(new C35492DwO(jqx, Integer.valueOf(LJIILIIL)));
                            if (f15 != null) {
                                f = f15.floatValue();
                            } else {
                                f = f11;
                            }
                            if (f > f11) {
                                f2 = f11;
                            } else {
                                f2 = f;
                            }
                            if (f < f11) {
                                f = f11;
                            }
                            if (f2 <= LJJII && LJJII <= f) {
                                UC7.LIZLLL("HIT RIGHT UP    #", LJIILIIL);
                                if (LJJIZ(jqx, z, false)) {
                                    LJJJ(C78926UyI.LJIJ(jqx) - 1);
                                }
                            }
                        } else {
                            throw new IllegalStateException(C0NY.LIZIZ("Unsupported column index ", LJLLI, " found"));
                        }
                    }
                    LJJI().put(new C35492DwO(jqx, Integer.valueOf(C78926UyI.LJIILIIL(jqx))), Float.valueOf(f10));
                    LJIL().put(new C35492DwO(jqx, Integer.valueOf(C78926UyI.LJIILIIL(jqx))), Float.valueOf(f11));
                }
            }
        }
        this.LLIIII = i2;
    }

    public final JQX LJIJI(int i) {
        JQX jqx;
        Collection<JQX> values = LJJ().values();
        o.LJIIIIZZ(values, "holderMap.values");
        Iterator<JQX> it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                jqx = it.next();
                JQX jqx2 = jqx;
                if (C78926UyI.LJIJ(jqx2) == i && jqx2.LLLLIIL().LIZLLL()) {
                    break;
                }
            } else {
                jqx = null;
                break;
            }
        }
        return jqx;
    }

    public final void LJJIJLIJ(JQX jqx) {
        if (jqx == null || !jqx.LLZL()) {
            return;
        }
        ConcurrentHashMap<Integer, JQX> LJJ = LJJ();
        Integer valueOf = Integer.valueOf(jqx.hashCode());
        if (LJJ.get(valueOf) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHolderCreated: ");
            LIZ.append(jqx);
            LIZ.append(", total: ");
            LIZ.append(LJJ().size() + 1);
            C49133JQb.LIZ("TLVideoPlayController", X1D.LIZIZ(LIZ));
            JP7 LLLLIIL = jqx.LLLLIIL();
            if (C49152JQu.LIZIZ(Integer.valueOf(LLLLIIL.LIZ())) && LLLLIIL.LLJJJ() != -1) {
                this.LJZ = true;
            }
            LJJ.putIfAbsent(valueOf, jqx);
        }
        if (this.LJLLI <= 0 && jqx.LLLLIIL().LIZ() == 1) {
            View LJIIIIZZ = jqx.LLLLIIL().LJIIIIZZ();
            if (LJIIIIZZ.getHeight() <= 0) {
                JVD.LIZIZ(LJIIIIZZ, new AqS155S0200000_8(this, LJIIIIZZ, 32));
            } else {
                this.LJLLI = LJIIIIZZ.getHeight();
            }
        }
    }

    public final void LJJJ(int i) {
        JQX LJIJI;
        InterfaceC48907JHj playerView;
        JGI LJJJLL;
        if (i < 0 || (LJIJI = LJIJI(i)) == null || (playerView = LJIJI.getPlayerView()) == null || !(playerView instanceof C48887JGp) || (LJJJLL = C78926UyI.LJJJLL(LJIJI)) == null || !LJJJLL.getSurfaceHolder().d4()) {
            return;
        }
        C62822Ol8 c62822Ol8 = C34253DcP.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
            C46728IVo.LJIIL(819200, LJJJLL.getMAweme());
        }
        if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            LJJJLL.LJIJ();
        }
    }

    public final void LJJJI(boolean z) {
        C49133JQb.LIZ("TLVideoPlayController", Q7L.LIZJ("setFragmentVisible: ", z));
        this.LLF = z;
    }

    public final void LJJJIL(boolean z) {
        C49133JQb.LIZ("TLVideoPlayController", Q7L.LIZJ("Refreshing: ", z));
        this.LLFFF = z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        C49133JQb.LIZ("TLVideoPlayController", "RecyclerView attached");
        LJJJJ();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        LJJJJI();
        this.LLFII = null;
        this.LLI = null;
        this.LJLZ = false;
        this.LJLLLLLL = false;
        this.LJLLILLLL = 0;
        this.LJLLI = 0;
        JQU LJIJJLI = LJIJJLI();
        LJIJJLI.LIZLLL = false;
        LJIJJLI.LIZJ = false;
        LJIJJLI.LIZIZ = false;
        LJIJJLI.removeCallbacksAndMessages(null);
        this.LJLIL.LJJLL(this);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "player_search_auto_release", false) == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("releaseMedia holderMap size:");
            LIZ.append(LJJ().size());
            X1D.LIZIZ(LIZ);
            Iterator<Map.Entry<Integer, JQX>> it = LJJ().entrySet().iterator();
            while (it.hasNext()) {
                JGI LJJJLL = C78926UyI.LJJJLL(it.next().getValue());
                if (LJJJLL != null) {
                    LJJJLL.g9();
                }
            }
        }
        LJJ().clear();
        LJJI().clear();
        LJIL().clear();
        ((java.util.Map) this.LJLJLLL.getValue()).clear();
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        Map.Entry<Integer, JQX> entry;
        JQX jqx;
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("processScrollState: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        this.LJLLLL = i;
        if (i == 0) {
            if (C78855Ux9.LJII(this.LJLIL)) {
                this.LJLLLLLL = false;
                this.LLI = null;
                if (this.LJLZ) {
                    JQX LJIJJ = LJIJJ();
                    if (LJIJJ != null) {
                        LJJIZ(LJIJJ, false, true);
                        return;
                    }
                    return;
                }
                JQX LJIJI = LJIJI(0);
                if (LJIJI == null) {
                    return;
                }
                LJJIJIL(LJIJI, null, null);
                return;
            }
            if (C49146JQo.LIZ()) {
                LJJIJIIJI(this.LLIIII, 0);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SCROLL_STATE_IDLE, playing pending: ");
            LIZ2.append(this.LLI);
            X1D.LIZIZ(LIZ2);
            Integer num = this.LLI;
            if (num == null) {
                return;
            }
            int intValue = num.intValue();
            java.util.Set<Map.Entry<Integer, JQX>> entrySet = LJJ().entrySet();
            o.LJIIIIZZ(entrySet, "holderMap.entries");
            Iterator<Map.Entry<Integer, JQX>> it = entrySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    entry = it.next();
                    if (intValue == C78926UyI.LJIILIIL(entry.getValue())) {
                        break;
                    }
                } else {
                    entry = null;
                    break;
                }
            }
            Map.Entry<Integer, JQX> entry2 = entry;
            if (entry2 != null) {
                jqx = entry2.getValue();
            } else {
                jqx = null;
            }
            LJJIJIL(jqx, null, null);
            this.LLI = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.JQX LJJIIJZLJL(X.JQX[] r5, X.JQX[] r6) {
        /*
            r4 = this;
            boolean r0 = r4.LJJIJIIJIL()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L20
            r1 = r5[r2]
        La:
            if (r1 == 0) goto L1f
        Lc:
            boolean r0 = r1.LLIIII()
            if (r0 != 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "get from when not triggered "
            r1[r3] = r0
            java.lang.String r0 = "searchAutoPlay"
            X.C49133JQb.LIZ(r0, r1)
            r1 = r6[r2]
        L1f:
            return r1
        L20:
            r1 = r5[r3]
            if (r1 != 0) goto Lc
            r1 = r6[r2]
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQT.LJJIIJZLJL(X.JQX[], X.JQX[]):X.JQX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQT.LJJIJIIJI(int, int):void");
    }

    public final void LJJIJL(C80217Ve1 c80217Ve1, boolean z) {
        String str;
        Integer num;
        this.LJLZ = z;
        this.LL = false;
        this.LJLLLLLL = false;
        this.LLFII = null;
        if (c80217Ve1 != null) {
            c80217Ve1.LIZ(new C49134JQc(this));
        }
        this.LJLIL.LJJLL(this);
        this.LJLIL.LJIIJJI(this);
        if (LJJIJ().LJII()) {
            LJJIJ().LIZ();
        } else {
            LJJIJ().LJ(this.LJLILLLLZI);
        }
        this.LJLIL.removeOnAttachStateChangeListener(this);
        this.LJLIL.addOnAttachStateChangeListener(this);
        LJJJJI();
        for (Map.Entry<Integer, JQX> entry : LJJ().entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Clearing play status for aweme: ");
            Aweme currentAweme = entry.getValue().LLLLIIL().getCurrentAweme();
            if (currentAweme != null) {
                str = currentAweme.getDesc();
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            JGI LJJJLL = C78926UyI.LJJJLL(entry.getValue());
            if (LJJJLL != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Player(");
                InterfaceC46330IGg mPlayer = LJJJLL.getMPlayer();
                if (mPlayer != null) {
                    num = Integer.valueOf(mPlayer.hashCode());
                } else {
                    num = null;
                }
                LIZ2.append(num);
                LIZ2.append(") Resetting play status: ");
                LIZ2.append(LJJJLL.getMPlayer());
                X1D.LIZIZ(LIZ2);
                InterfaceC46330IGg mPlayer2 = LJJJLL.getMPlayer();
                if (mPlayer2 != null) {
                    mPlayer2.LJJIIZ();
                }
            }
        }
        JQU LJIJJLI = LJIJJLI();
        LJIJJLI.LIZLLL = false;
        LJIJJLI.LIZJ = false;
        LJIJJLI.LIZIZ = false;
        LJIJJLI.removeCallbacksAndMessages(null);
        LJIJJLI().postDelayed(new ARunnableS44S0100000_8(this, 107), 1000L);
        this.LLFF = true;
    }

    public final void LJJIL(int i, String str) {
        C49133JQb.LIZIZ("TLVideoPlayController", i0.LJFF("onScrolledTo finding aid: ", str));
        C49133JQb.LIZ("Tvideo", str, Boolean.valueOf(LJJIIJ()));
        if (str == null || str.length() == 0) {
            return;
        }
        if (LJJIIJ()) {
            this.LJZI = true;
            JQU LJIJJLI = LJIJJLI();
            LJIJJLI.removeMessages(2);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            obtain.arg1 = i;
            LJIJJLI.sendMessageDelayed(obtain, 500L);
            return;
        }
        LJIJJLI().postDelayed(new ARunnableS3S0001000_8(i, 1), 500L);
    }

    public JQT(RecyclerView recyclerView, C81335Vw3 c81335Vw3, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = c81335Vw3;
        this.LJLJI = interfaceC65784Pro;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        if (r0.isPlaying() == true) goto L59;
     */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQT.LJIILL(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void LJJIJIL(JQX jqx, Integer num, QZV qzv) {
        boolean z;
        String str;
        JQX jqx2;
        boolean z2;
        boolean z3;
        JGI LJJJLL;
        if (jqx == null) {
            return;
        }
        JP7 LLLLIIL = jqx.LLLLIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadAndPlay #");
        LIZ.append(C78926UyI.LJIILIIL(jqx));
        LIZ.append(", viewType: ");
        LIZ.append(LLLLIIL.LIZ());
        LIZ.append(", paused: ");
        LIZ.append(this.LLD);
        LIZ.append(", showingCs: ");
        LIZ.append(LLLLIIL.LLLLILI());
        LIZ.append(", attached: ");
        LIZ.append(LLLLIIL.LIZLLL());
        X1D.LIZIZ(LIZ);
        if (this.LLD || !LLLLIIL.LIZLLL() || LLLLIIL.LLFZ()) {
            return;
        }
        if (LLLLIIL.LIZ() == 1) {
            if (LLLLIIL.LLLLILI()) {
                return;
            }
            JLU.LJI(jqx);
            JLU.LIZJ(jqx);
            if (!J21.LIZ()) {
                return;
            }
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (this.LLD || !this.LLF) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("loadAndPlayVideo abort, paused: ");
                LIZ2.append(this.LLD);
                LIZ2.append(", fragmentVisible: ");
                LIZ2.append(!this.LLF);
                X1D.LIZIZ(LIZ2);
                return;
            }
            InterfaceC48907JHj playerView = jqx.getPlayerView();
            if (playerView == null || !(playerView instanceof C48887JGp)) {
                return;
            }
            C48887JGp c48887JGp = (C48887JGp) playerView;
            JGI LJJJLL2 = C78926UyI.LJJJLL(jqx);
            if (LJJJLL2 == null) {
                return;
            }
            if (!LJJJLL2.getSurfaceHolder().d4()) {
                C79062V1e.LJI("Holder (", jqx.hashCode(), ") surface not ready");
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Playing pos #");
            LIZ3.append(C78926UyI.LJIILIIL(jqx));
            LIZ3.append(", AID (");
            Aweme currentAweme = jqx.LLLLIIL().getCurrentAweme();
            Integer num2 = null;
            if (currentAweme != null) {
                str = currentAweme.getAid();
            } else {
                str = null;
            }
            LIZ3.append(str);
            LIZ3.append(')');
            X1D.LIZIZ(LIZ3);
            if (c48887JGp instanceof JHC) {
                ((JHC) c48887JGp).setPhotoPlayerCompleteListener(new C48986JKk(valueOf, LJJJLL2, qzv));
            } else {
                c48887JGp.setVideoPlayerStatusListener(new JHG(valueOf, LJJJLL2, qzv));
            }
            if (!LJIJJLI().LIZIZ && (jqx2 = this.LLFII) != null) {
                int LJIILIIL = C78926UyI.LJIILIIL(jqx2);
                int LJIILIIL2 = C78926UyI.LJIILIIL(jqx);
                StringBuilder LJ = C7MY.LJ("Before play video new#", LJIILIIL2, " (playing:");
                JGI LJJJLL3 = C78926UyI.LJJJLL(jqx);
                if (LJJJLL3 != null && LJJJLL3.isPlaying()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1FL.LJFF(LJ, z2, "), prev#", LJIILIIL, " (playing:");
                JGI LJJJLL4 = C78926UyI.LJJJLL(jqx2);
                if (LJJJLL4 != null && LJJJLL4.isPlaying()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                LJ.append(z3);
                LJ.append(')');
                X1D.LIZIZ(LJ);
                if (LJIILIIL != LJIILIIL2 && (LJJJLL = C78926UyI.LJJJLL(jqx2)) != null && LJJJLL.isPlaying()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Before play video, stopping #");
                    JQX jqx3 = this.LLFII;
                    if (jqx3 != null) {
                        num2 = Integer.valueOf(C78926UyI.LJIILIIL(jqx3));
                    }
                    LIZ4.append(num2);
                    X1D.LIZIZ(LIZ4);
                    JGI LJJJLL5 = C78926UyI.LJJJLL(jqx2);
                    if (LJJJLL5 != null) {
                        LJJJLL5.LJIIZILJ();
                    }
                }
            }
            LJJJLL2.LLLJIL();
            this.LLFII = jqx;
            return;
        }
        if (!C49152JQu.LIZIZ(Integer.valueOf(LLLLIIL.LIZ())) || jqx.isPlaying()) {
            return;
        }
        JLU.LJI(jqx.getPlayerView());
        JLU.LIZJ(jqx);
        jqx.LLLJIL();
        this.LLFII = jqx;
    }

    public final boolean LJJIZ(JQX jqx, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (LJIJJLI().LIZIZ) {
            JQU LJIJJLI = LJIJJLI();
            LJIJJLI.LIZJ = true;
            LJIJJLI.LIZIZ = false;
            LJIJJLI.removeMessages(1);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LJLLLL == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j = this.LLIFFJFJJ;
        if (j != 0 && elapsedRealtime - j <= 500 && !z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4 || z) {
            this.LLI = Integer.valueOf(C78926UyI.LJIILIIL(jqx));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Pending holder stored #");
            LIZ.append(C78926UyI.LJIILIIL(jqx));
            X1D.LIZIZ(LIZ);
            return false;
        }
        C78926UyI.LJIILIIL(jqx);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("New holder hit #");
        LIZ2.append(C78926UyI.LJIILIIL(jqx));
        X1D.LIZIZ(LIZ2);
        this.LLI = null;
        this.LLIFFJFJJ = elapsedRealtime;
        LJJIJIL(jqx, null, null);
        return true;
    }
}

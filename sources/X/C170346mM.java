package X;

import Y.AObserverS70S0100000_2;
import Y.IDrS42S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170346mM extends AbstractC170376mP implements InterfaceC84510XEs {
    public final WM7 LJLJL;
    public final ViewGroup LJLJLJ;
    public final C84507XEp LJLJLLL;
    public final int LJLL;
    public List<Effect> LJLLI;
    public final C164926dc LJLLILLLL;
    public final InterfaceC165006dk LJLLJ;
    public final RecyclerView.RecycledViewPool LJLLL;
    public final InterfaceC153045zY LJLLLL;
    public RecyclerView LJLLLLLL;
    public C170396mR LJLZ;
    public InterfaceC82683Wch LJZ;
    public final C62822Ol8 LJZI;
    public final List<EffectModel> LJZL;
    public final ArrayList<EffectPointModel> LL;
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public int LLFFF;
    public Boolean LLFII;
    public C170516md LLFZ;
    public C171296nt LLI;
    public InterfaceC65784Pro<C76800UCe> LLIFFJFJJ;
    public final C5H3 LLII;
    public final C68332mD LLIIII;
    public final String LLIIIILZ;

    @Override // X.AbstractC170376mP
    public final void LIZ() {
        InterfaceC165006dk interfaceC165006dk;
        EffectModel effectModel = (EffectModel) ORZ.LJLLLLLL(0, this.LJZL);
        if (effectModel != null && effectModel.isEnabled && (interfaceC165006dk = this.LJLLJ) != null) {
            interfaceC165006dk.LJIIZILJ(effectModel, this.LJLL, true);
        }
    }

    @Override // X.AbstractC170376mP
    public final void LJFF() {
        if (!((ArrayList) this.LJZL).isEmpty()) {
            return;
        }
        LJIILLIIL();
    }

    @Override // X.AbstractC170376mP
    public final View LJI() {
        boolean z;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJLJ.getContext()), R.layout.ark, this.LJLJLJ, false);
        o.LJIIIIZZ(LLLLIILL, "from(container.context)\n…e_item, container, false)");
        this.LJLJI = LLLLIILL;
        View findViewById = LJ().findViewById(R.id.isv);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.recyerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLLLLLL = recyclerView;
        recyclerView.LJIIJJI(new IDrS42S0100000_2(this, 4));
        o.LJIIIIZZ(LJ().findViewById(R.id.hfk), "view.findViewById(R.id.page_loading_status)");
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJLLILLLL.LJIILL, 1, false);
        RecyclerView recyclerView2 = this.LJLLLLLL;
        if (recyclerView2 != null) {
            recyclerView2.setItemViewCacheSize(this.LJLLILLLL.LJIILL);
            wrapGridLayoutManager.LLFZ = true;
            RecyclerView.RecycledViewPool recycledViewPool = this.LJLLL;
            if (recycledViewPool != null) {
                RecyclerView recyclerView3 = this.LJLLLLLL;
                if (recyclerView3 != null) {
                    recyclerView3.setRecycledViewPool(recycledViewPool);
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            RecyclerView recyclerView4 = this.LJLLLLLL;
            if (recyclerView4 != null) {
                recyclerView4.setLayoutManager(wrapGridLayoutManager);
                int LJ = C143205jg.LJ();
                C164926dc c164926dc = this.LJLLILLLL;
                int i = (LJ - ((c164926dc.LJJIFFI + c164926dc.LJJI) * c164926dc.LJIILL)) / 2;
                RecyclerView recyclerView5 = this.LJLLLLLL;
                if (recyclerView5 != null) {
                    C26338AVi.LJIIIZ(recyclerView5, Integer.valueOf(i), 0, Integer.valueOf(i), 0, 16);
                    RecyclerView recyclerView6 = this.LJLLLLLL;
                    if (recyclerView6 != null) {
                        recyclerView6.setItemAnimator(null);
                        RecyclerView recyclerView7 = this.LJLLLLLL;
                        if (recyclerView7 != null) {
                            recyclerView7.LJIIJ(new C170446mW(this.LJLJL, recyclerView7, this.LJLLILLLL.LJJIIJ));
                            if (C164996dj.LIZJ(this.LJLIL)) {
                                this.LJLJJI = true;
                            }
                            this.LLFZ = new C170516md();
                            Activity requireActivity = this.LJLJL.requireActivity();
                            o.LJIIIIZZ(requireActivity, "scene.requireActivity()");
                            this.LLI = new C171296nt(requireActivity);
                            if (this.LJLLILLLL.LIZJ) {
                                if ((!C164996dj.LIZLLL(this.LJLIL) || this.LJLLILLLL.LJJIIJ) && !this.LJLJJI) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            C164926dc c164926dc2 = this.LJLLILLLL;
                            C170396mR c170396mR = new C170396mR(z, c164926dc2.LJJIIJ, this.LJLLJ, c164926dc2, this.LJLJLLL);
                            this.LJLZ = c170396mR;
                            c170396mR.LJLJL = new InterfaceC170486ma() { // from class: X.6mN
                                @Override // X.InterfaceC170486ma
                                public final boolean LIZIZ() {
                                    C170346mM c170346mM = C170346mM.this;
                                    if (!c170346mM.LJLLILLLL.LIZIZ) {
                                        return true;
                                    }
                                    C170056lt value = c170346mM.LJIIJJI().lv0().getValue();
                                    if (value != null && !value.LJLJI) {
                                        return true;
                                    }
                                    return false;
                                }

                                @Override // X.InterfaceC170486ma
                                public final boolean LIZJ() {
                                    C170346mM c170346mM = C170346mM.this;
                                    if (c170346mM.LJLJJLL && !o.LJ(c170346mM.LLFII, Boolean.FALSE)) {
                                        return true;
                                    }
                                    return false;
                                }

                                @Override // X.InterfaceC170486ma
                                public final String LIZLLL() {
                                    return C170346mM.this.LJIIJJI().iv0().getValue();
                                }

                                @Override // X.InterfaceC170486ma
                                public final int LIZ(int i2) {
                                    return i2 - C170346mM.this.LIZJ().LJLZ();
                                }

                                @Override // X.InterfaceC170486ma
                                public final void LJ(int i2) {
                                    if (!C165016dl.LIZ().getBoolean("has_long_pressed", false)) {
                                        C170346mM.this.LJIILL(Integer.valueOf(i2), true);
                                    }
                                }

                                @Override // X.InterfaceC170486ma
                                public final boolean LJFF(int i2, int i3, EffectModel effectModel) {
                                    boolean z2;
                                    Boolean bool;
                                    InterfaceC165006dk interfaceC165006dk;
                                    boolean z3;
                                    Effect effect = (Effect) ListProtector.get(C170346mM.this.LJLLI, i3);
                                    if (effectModel.isGoToCapCutEffect && 5 == i2) {
                                        g0.LJJIL(C170346mM.this.LJIIJJI().gv0(), effectModel);
                                        return false;
                                    }
                                    InterfaceC165006dk interfaceC165006dk2 = C170346mM.this.LJLLJ;
                                    if (interfaceC165006dk2 != null && !interfaceC165006dk2.LJIIL(i2, effectModel)) {
                                        return false;
                                    }
                                    if (5 == i2 || i2 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        C170346mM c170346mM = C170346mM.this;
                                        c170346mM.LLF = true;
                                        c170346mM.LLFFF = i3;
                                        if (C164996dj.LIZ(c170346mM.LJLIL)) {
                                            C170346mM c170346mM2 = C170346mM.this;
                                            if (c170346mM2.LJLLILLLL.LJIIL) {
                                                C171296nt c171296nt = c170346mM2.LLI;
                                                if (c171296nt != null) {
                                                    c171296nt.LIZ(i3);
                                                } else {
                                                    o.LJIJI("motionEffectControl");
                                                    throw null;
                                                }
                                            }
                                        }
                                        C170346mM.this.LJLJLLL.getClass();
                                        if (!C84507XEp.LJ(effect)) {
                                            C170346mM c170346mM3 = C170346mM.this;
                                            AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(c170346mM3, effect, 93);
                                            c170346mM3.getClass();
                                            C74216TAu c74216TAu = C74216TAu.LIZIZ;
                                            if (c74216TAu.LIZIZ() && !c74216TAu.LJIIIZ()) {
                                                c170346mM3.LLIFFJFJJ = aqS149S0200000_2;
                                                ((TK6) c170346mM3.LLII.getValue()).LIZ();
                                                C78596Usy.LJJJLIIL(c170346mM3.LJ().getContext(), true);
                                            } else {
                                                aqS149S0200000_2.invoke();
                                            }
                                            C170516md c170516md = C170346mM.this.LLFZ;
                                            if (c170516md != null) {
                                                c170516md.LIZ = i2;
                                                c170516md.LIZIZ = i3;
                                                c170516md.LIZJ = effectModel;
                                                InterfaceC165006dk interfaceC165006dk3 = C170346mM.this.LJLLJ;
                                                if (interfaceC165006dk3 != null) {
                                                    String str = effectModel.key;
                                                    o.LJIIIIZZ(str, "model.key");
                                                    interfaceC165006dk3.LJIIJJI(str);
                                                }
                                                z3 = true;
                                            } else {
                                                o.LJIJI("touchStateHolder");
                                                throw null;
                                            }
                                        } else {
                                            C170396mR c170396mR2 = C170346mM.this.LJLZ;
                                            if (c170396mR2 != null) {
                                                c170396mR2.LJLLLLLL(i3, 16);
                                                z3 = false;
                                            } else {
                                                o.LJIJI("adapter");
                                                throw null;
                                            }
                                        }
                                        C170346mM c170346mM4 = C170346mM.this;
                                        c170346mM4.getClass();
                                        if (C60903NvH.LJIIJJI().LJIJI().LIZIZ() >= 0) {
                                            ArrayList arrayList = new ArrayList();
                                            int min = Math.min(c170346mM4.LJLLI.size(), c170346mM4.LJLLILLLL.LJIL + i3 + 1);
                                            for (int i4 = i3 + 1; i4 < min; i4++) {
                                                C84507XEp c84507XEp = c170346mM4.LJLJLLL;
                                                Effect effect2 = (Effect) ListProtector.get(c170346mM4.LJLLI, i4);
                                                c84507XEp.getClass();
                                                if (!C84507XEp.LJ(effect2)) {
                                                    arrayList.add(Integer.valueOf(i4));
                                                }
                                            }
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                c170346mM4.LJLJLLL.LIZIZ((Effect) ListProtector.get(c170346mM4.LJLLI, ((Number) it.next()).intValue()));
                                            }
                                        }
                                        if (z3) {
                                            return true;
                                        }
                                    }
                                    String str2 = "";
                                    if (5 == i2 || (C164996dj.LIZLLL(C170346mM.this.LJLIL) && !C170346mM.this.LJLLILLLL.LJJIIJ)) {
                                        C170346mM c170346mM5 = C170346mM.this;
                                        if (c170346mM5.LJLLILLLL.LIZIZ) {
                                            InterfaceC165006dk interfaceC165006dk4 = c170346mM5.LJLLJ;
                                            if (interfaceC165006dk4 != null) {
                                                interfaceC165006dk4.LJIIZILJ(effectModel, i3, false);
                                            }
                                            ArrayList<EffectPointModel> J7 = C170346mM.this.LJIIJJI().hv0().J7();
                                            if (!J7.isEmpty()) {
                                                Object obj = ListProtector.get(J7, J7.size() - 1);
                                                o.LJIIIIZZ(obj, "stack[stack.size - 1]");
                                                EffectPointModel effectPointModel = (EffectPointModel) obj;
                                                C170346mM.this.LL.add(effectPointModel);
                                                if (effectPointModel.getDuration() < 100) {
                                                    C170346mM.this.LJIILIIL();
                                                }
                                            } else {
                                                C0JU.LIZLLL("add effect fail");
                                            }
                                            C170346mM c170346mM6 = C170346mM.this;
                                            InterfaceC165006dk interfaceC165006dk5 = c170346mM6.LJLLJ;
                                            if (interfaceC165006dk5 != null) {
                                                interfaceC165006dk5.LJIIJ(c170346mM6.LJLIL, c170346mM6.LL);
                                            }
                                        } else if (c170346mM5.LLD == i3 && (interfaceC165006dk = c170346mM5.LJLLJ) != null && interfaceC165006dk.LJIILIIL(effectModel)) {
                                            C170346mM c170346mM7 = C170346mM.this;
                                            c170346mM7.LLD = -1;
                                            c170346mM7.LJIIJJI().iv0().setValue("");
                                            C170346mM.this.LJLLJ.LJIIIIZZ();
                                            C170396mR c170396mR3 = C170346mM.this.LJLZ;
                                            if (c170396mR3 != null) {
                                                c170396mR3.notifyItemChanged(i3);
                                            } else {
                                                o.LJIJI("adapter");
                                                throw null;
                                            }
                                        } else {
                                            InterfaceC165006dk interfaceC165006dk6 = C170346mM.this.LJLLJ;
                                            if (interfaceC165006dk6 != null) {
                                                bool = Boolean.valueOf(interfaceC165006dk6.LJIIZILJ(effectModel, i3, false));
                                            } else {
                                                bool = null;
                                            }
                                            if (o.LJ(bool, Boolean.TRUE)) {
                                                C170346mM c170346mM8 = C170346mM.this;
                                                int i5 = c170346mM8.LLD;
                                                c170346mM8.LLD = i3;
                                                c170346mM8.LJIIJJI().iv0().setValue(effectModel.key);
                                                C170396mR c170396mR4 = C170346mM.this.LJLZ;
                                                if (c170396mR4 != null) {
                                                    c170396mR4.notifyItemChanged(i5);
                                                    C170396mR c170396mR5 = C170346mM.this.LJLZ;
                                                    if (c170396mR5 != null) {
                                                        c170396mR5.notifyItemChanged(i3);
                                                    } else {
                                                        o.LJIJI("adapter");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("adapter");
                                                    throw null;
                                                }
                                            }
                                        }
                                        C170346mM.this.LJLJLLL.getClass();
                                        InterfaceC84498XEg LIZ = C170256mD.LIZ();
                                        if (LIZ != null) {
                                            LIZ.LJJJI(effect);
                                        }
                                    } else if (i2 == 0) {
                                        if (TextUtils.isEmpty(effectModel.resDir)) {
                                            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append("applyFilter_resdir_null:");
                                            String str3 = effectModel.key;
                                            if (str3 != null) {
                                                str2 = str3;
                                            }
                                            LIZ2.append(str2);
                                            LJJIIZI.LJIIZILJ(X1D.LIZIZ(LIZ2));
                                        }
                                        C170346mM.this.LJIIIZ(Integer.valueOf(i2), effectModel);
                                        C170346mM.this.LJLJLLL.getClass();
                                        InterfaceC84498XEg LIZ3 = C170256mD.LIZ();
                                        if (LIZ3 != null) {
                                            LIZ3.LJJJI(effect);
                                        }
                                    } else if (1 == i2) {
                                        C170346mM c170346mM9 = C170346mM.this;
                                        if (c170346mM9.LLF) {
                                            c170346mM9.LLF = false;
                                            InterfaceC165006dk interfaceC165006dk7 = c170346mM9.LJLLJ;
                                            if (interfaceC165006dk7 != null && interfaceC165006dk7.LIZLLL(effect, new AqS152S0100000_2(c170346mM9, 883))) {
                                                return true;
                                            }
                                            if (C164996dj.LIZ(C170346mM.this.LJLIL)) {
                                                C170346mM c170346mM10 = C170346mM.this;
                                                if (c170346mM10.LJLLILLLL.LJIIL) {
                                                    C171296nt c171296nt2 = c170346mM10.LLI;
                                                    if (c171296nt2 != null) {
                                                        c171296nt2.LIZIZ(i3);
                                                    } else {
                                                        o.LJIJI("motionEffectControl");
                                                        throw null;
                                                    }
                                                }
                                            }
                                            C170346mM.this.LJLJLLL.getClass();
                                            if (C84507XEp.LJ(effect)) {
                                                InterfaceC165006dk interfaceC165006dk8 = C170346mM.this.LJLLJ;
                                                if (interfaceC165006dk8 != null) {
                                                    interfaceC165006dk8.LJIILL(effectModel);
                                                }
                                                C170346mM c170346mM11 = C170346mM.this;
                                                InterfaceC165006dk interfaceC165006dk9 = c170346mM11.LJLLJ;
                                                if (interfaceC165006dk9 != null) {
                                                    interfaceC165006dk9.LJIIJ(c170346mM11.LJLIL, c170346mM11.LL);
                                                }
                                            }
                                        }
                                    }
                                    C170516md c170516md2 = C170346mM.this.LLFZ;
                                    if (c170516md2 != null) {
                                        c170516md2.LIZ = i2;
                                        c170516md2.LIZIZ = i3;
                                        c170516md2.LIZJ = effectModel;
                                        return true;
                                    }
                                    o.LJIJI("touchStateHolder");
                                    throw null;
                                }
                            };
                            this.LJLJJL = new C170366mO(this, c170396mR);
                            if (this.LJLJJLL) {
                                LJFF();
                            }
                            this.LJLJLLL.LJ.add(this);
                            C164926dc c164926dc3 = this.LJLLILLLL;
                            if (c164926dc3.LIZ == null && c164926dc3.LIZIZ) {
                                LJIIJJI().hv0().LJI().observe(this.LJLJL, new AObserverS70S0100000_2(this, 282));
                                LJIIJJI().lv0().observe(this.LJLJL, new AObserverS70S0100000_2(this, 283));
                                LJIIJJI().mv0().observe(this.LJLJL, new AObserverS70S0100000_2(this, 284));
                            }
                            View LJ2 = LJ();
                            this.LJLJLJ.addView(LJ2);
                            this.LJLJI = LJ2;
                            return LJ2;
                        }
                        o.LJIJI("recyclerView");
                        throw null;
                    }
                    o.LJIJI("recyclerView");
                    throw null;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final EditEffectVideoModel LJIIJJI() {
        return (EditEffectVideoModel) this.LJZI.getValue();
    }

    public final void LJIIL() {
        C164926dc c164926dc = this.LJLLILLLL;
        int i = 0;
        if (c164926dc.LIZ == null && c164926dc.LIZIZ) {
            this.LL.clear();
            ArrayList<EffectPointModel> arrayList = this.LL;
            ArrayList<EffectPointModel> J7 = LJIIJJI().hv0().J7();
            ArrayList arrayList2 = new ArrayList();
            Iterator<EffectPointModel> it = J7.iterator();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                EffectPointModel effectPointModel = next;
                List<EffectModel> list = this.LJZL;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<EffectModel> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (o.LJ(it2.next().key, effectPointModel.getKey())) {
                            arrayList2.add(next);
                            break;
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            return;
        }
        Iterator it3 = ((ArrayList) this.LJZL).iterator();
        while (true) {
            if (it3.hasNext()) {
                if (o.LJ(((EffectModel) it3.next()).key, LJIIJJI().iv0().getValue())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LLD;
        if (i2 == i) {
            return;
        }
        this.LLD = i;
        C170396mR c170396mR = this.LJLZ;
        if (c170396mR != null) {
            c170396mR.notifyItemChanged(i2);
            C170396mR c170396mR2 = this.LJLZ;
            if (c170396mR2 != null) {
                c170396mR2.notifyItemChanged(this.LLD);
                return;
            } else {
                o.LJIJI("adapter");
                throw null;
            }
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final String LJIILIIL() {
        if (!this.LL.isEmpty()) {
            EffectPointModel effectPointModel = (EffectPointModel) ORZ.LLFF(this.LL);
            LJIIJJI().hv0().LJI().setValue(C5RT.LIZLLL(effectPointModel.getIndex(), effectPointModel.getUiStartPoint(), effectPointModel.getUuid()));
            return effectPointModel.getKey();
        }
        return null;
    }

    public final void LJIILJJIL() {
        RecyclerView recyclerView = this.LJLLLLLL;
        if (recyclerView != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(this.LLD, 0);
            return;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r1.booleanValue() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r9.LJLLILLLL.LJ != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170346mM.LJIILLIIL():void");
    }

    @Override // X.AbstractC170376mP
    public final C164926dc LIZIZ() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC170376mP
    public final String LIZLLL() {
        return this.LLIIIILZ;
    }

    @Override // X.AbstractC170376mP
    public final void LJIIIIZZ(boolean z) {
        super.LJIIIIZZ(z);
        LJIIJ(z);
    }

    public final void LJIIJ(boolean z) {
        LinearLayoutManager linearLayoutManager;
        int LLILL;
        int LLILLJJLI;
        C72790ShW c72790ShW;
        if (o.LJ(this.LLFII, Boolean.valueOf(z)) || this.LJLLLLLL == null) {
            return;
        }
        this.LLFII = Boolean.valueOf(z);
        RecyclerView recyclerView = this.LJLLLLLL;
        if (recyclerView != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (LLILL = linearLayoutManager.LLILL()) > (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
                return;
            }
            while (true) {
                RecyclerView recyclerView2 = this.LJLLLLLL;
                if (recyclerView2 != null) {
                    RecyclerView.ViewHolder LJJIZ = recyclerView2.LJJIZ(LLILL);
                    if ((LJJIZ instanceof C170406mS) && (c72790ShW = ((C170406mS) LJJIZ).LJLJLLL) != null) {
                        c72790ShW.LIZ(z);
                    }
                    if (LLILL != LLILLJJLI) {
                        LLILL++;
                    } else {
                        return;
                    }
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
        } else {
            o.LJIJI("recyclerView");
            throw null;
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void LLJJLIIIJLLLLLLLZ(Effect rawEffect) {
        o.LJIIIZ(rawEffect, "rawEffect");
        int indexOf = this.LJLLI.indexOf(rawEffect);
        if (indexOf >= 0) {
            C170396mR c170396mR = this.LJLZ;
            if (c170396mR != null) {
                c170396mR.LJLLLLLL(indexOf, 8);
            } else {
                o.LJIJI("adapter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void P3(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = this.LJLLI.indexOf(effect)) >= 0) {
            C170396mR c170396mR = this.LJLZ;
            if (c170396mR != null) {
                c170396mR.LJLLLLLL(indexOf, 32);
            } else {
                o.LJIJI("adapter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void pl(Effect rawEffect) {
        InterfaceC165006dk interfaceC165006dk;
        EffectModel effectModel;
        o.LJIIIZ(rawEffect, "rawEffect");
        int indexOf = this.LJLLI.indexOf(rawEffect);
        if (indexOf >= 0) {
            C170396mR c170396mR = this.LJLZ;
            if (c170396mR != null) {
                c170396mR.LJLLLLLL(indexOf, 16);
                C170516md c170516md = this.LLFZ;
                if (c170516md != null) {
                    if (indexOf == c170516md.LIZIZ && c170516md.LIZ == 0 && !((java.util.Set) this.LLIIII.getValue()).contains(rawEffect)) {
                        C170516md c170516md2 = this.LLFZ;
                        if (c170516md2 != null) {
                            Integer valueOf = Integer.valueOf(c170516md2.LIZ);
                            C170516md c170516md3 = this.LLFZ;
                            if (c170516md3 != null) {
                                LJIIIZ(valueOf, c170516md3.LIZJ);
                                ((java.util.Set) this.LLIIII.getValue()).add(rawEffect);
                            } else {
                                o.LJIJI("touchStateHolder");
                                throw null;
                            }
                        } else {
                            o.LJIJI("touchStateHolder");
                            throw null;
                        }
                    }
                    if (!this.LJLLILLLL.LIZJ && (interfaceC165006dk = this.LJLLJ) != null && interfaceC165006dk.LJI(rawEffect.getEffectId()) && (effectModel = (EffectModel) ORZ.LJLLLLLL(indexOf, this.LJZL)) != null && o.LJ(rawEffect.getEffectId(), effectModel.key)) {
                        C170396mR c170396mR2 = this.LJLZ;
                        if (c170396mR2 != null) {
                            InterfaceC170486ma interfaceC170486ma = c170396mR2.LJLJL;
                            if (interfaceC170486ma != null) {
                                interfaceC170486ma.LJFF(5, indexOf, effectModel);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("adapter");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("touchStateHolder");
                throw null;
            }
            o.LJIJI("adapter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel == null) {
                return;
            }
            InterfaceC165006dk interfaceC165006dk = this.LJLLJ;
            if (interfaceC165006dk != null) {
                interfaceC165006dk.LJIILLIIL(effectModel);
            }
            ArrayList<EffectPointModel> J7 = LJIIJJI().hv0().J7();
            if (!J7.isEmpty()) {
                this.LL.add(ListProtector.get(J7, J7.size() - 1));
            } else {
                C0JU.LIZLLL("add effect failed");
            }
        }
    }

    public final void LJIILL(Integer num, boolean z) {
        View view;
        if (!z) {
            this.LLFFF = 0;
        }
        if (num != null) {
            num.intValue();
            this.LLFFF = num.intValue();
        }
        int size = ((ArrayList) this.LJZL).size();
        int i = this.LLFFF;
        if (i >= 0 && i < size) {
            RecyclerView recyclerView = this.LJLLLLLL;
            C170406mS c170406mS = null;
            if (recyclerView != null) {
                RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(i);
                if (LJJIZ instanceof C170406mS) {
                    c170406mS = (C170406mS) LJJIZ;
                }
                InterfaceC82683Wch interfaceC82683Wch = this.LJZ;
                if (interfaceC82683Wch != null) {
                    interfaceC82683Wch.dismiss();
                }
                if (c170406mS != null && (view = c170406mS.LJLIL) != null) {
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "it.context");
                    C139825eE c139825eE = new C139825eE(context);
                    c139825eE.LIZ.LIZIZ = view;
                    c139825eE.LJI(WHL.TOP);
                    c139825eE.LJIIL(this.LLIIIILZ);
                    InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
                    this.LJZ = LIZJ;
                    LIZJ.show();
                    if (!z) {
                        C165016dl.LIZ().storeBoolean("long_press_guide_shown", true);
                    }
                }
                this.LLFFF = -1;
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170346mM(WM7 scene, ViewGroup container, C84507XEp downloadController, int i, String categoryKey, List<Effect> list, C164926dc config, InterfaceC165006dk interfaceC165006dk, RecyclerView.RecycledViewPool recycledViewPool, InterfaceC153045zY interfaceC153045zY) {
        super(scene, categoryKey, config);
        int i2;
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(downloadController, "downloadController");
        o.LJIIIZ(categoryKey, "categoryKey");
        o.LJIIIZ(config, "config");
        this.LJLJL = scene;
        this.LJLJLJ = container;
        this.LJLJLLL = downloadController;
        this.LJLL = i;
        this.LJLLI = list;
        this.LJLLILLLL = config;
        this.LJLLJ = interfaceC165006dk;
        this.LJLLL = recycledViewPool;
        this.LJLLLL = interfaceC153045zY;
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 880));
        this.LJZL = new ArrayList();
        this.LL = new ArrayList<>();
        this.LLD = -1;
        this.LLFF = true;
        this.LLII = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2(this, 879));
        this.LLIIII = new C68332mD(new LinkedHashSet());
        if (C164996dj.LIZLLL(categoryKey)) {
            i2 = R.string.fyf;
        } else if (C164996dj.LIZ(categoryKey)) {
            i2 = R.string.i81;
        } else {
            i2 = R.string.fra;
        }
        String string = scene.getString(i2);
        o.LJIIIIZZ(string, "scene.getString(\n       …ct_hint1\n        },\n    )");
        this.LLIIIILZ = string;
    }
}

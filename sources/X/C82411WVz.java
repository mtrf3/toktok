package X;

import Y.AfS20S0210000_14;
import Y.IDCListenerS258S0100000_12;
import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WVz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82411WVz implements WW6 {
    public final /* synthetic */ C82410WVy LIZ;

    @Override // X.WW6
    public final void LIZ() {
        Object obj;
        Object obj2 = this.LIZ.LJLLL().LLIIL;
        if (obj2 instanceof InterfaceC47392Iiq) {
            ShortVideoContext shortVideoContext = this.LIZ.getShortVideoContext();
            Effect effect = ((InterfaceC47392Iiq) obj2).LIZ();
            o.LJIIIZ(shortVideoContext, "shortVideoContext");
            o.LJIIIZ(effect, "effect");
            HashMap LJIJJLI = C78880UxY.LJIJJLI(shortVideoContext, new OSZ[0]);
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("resource_id", effect.getResourceId());
            oszArr[1] = new OSZ("prop_author_id", effect.getDesignerId());
            String str = "1";
            if (effect.getSource() == 1) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[2] = new OSZ("is_original_prop", obj);
            if (!ORY.LJJIJIIJIL(Integer.valueOf(effect.getSource()), new Integer[]{101, 102})) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[3] = new OSZ("is_mobile_effect", str);
            oszArr[4] = new OSZ("effect_source", String.valueOf(effect.getSource()));
            LJIJJLI.putAll(C113554cx.LJJL(oszArr));
            C78880UxY.LJJLIIIJL("same_prop_click", LJIJJLI);
        }
    }

    @Override // X.WW6
    public final void LIZIZ() {
        this.LIZ.LJLZ().LIZJ();
        this.LIZ.LJLLL().LLJJIII(TEN.LOADING);
    }

    @Override // X.WW6
    public final WW8 LIZLLL() {
        return new WW8(C78688UuS.LJIJJ(this.LIZ), new WW3(this.LIZ));
    }

    @Override // X.WW6
    public final void LJI() {
        TEZ LLLLL;
        SIZ.LIZ = 15;
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (LLLLL = LLF.LLLLL()) != null) {
            LLLLL.LJJIJIIJI(System.currentTimeMillis());
        }
        this.LIZ.LJLLL().LLJJL();
        I0N LLF2 = this.LIZ.LLF();
        if (LLF2 != null) {
            LLF2.W90(true, "click_search_icon");
        }
        C82130WLe.LIZ(this.LIZ, false, false, false, null, false, 62);
        this.LIZ.LLF = true;
    }

    @Override // X.WW6
    public final boolean LJIIJ() {
        LiveEvent<Boolean> sF;
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (sF = LLF.sF()) != null) {
            return o.LJ(sF.LIZJ(), Boolean.TRUE);
        }
        return false;
    }

    @Override // X.WW6
    public final void LIZJ() {
        if (C53558L0g.LIZIZ().supportPrefetchEffects) {
            WWJ LJLZ = this.LIZ.LJLZ();
            LJLZ.getClass();
            C82891Wg3.LIZLLL().d("Effect, CQ pausePreloadEffects begin....");
            Iterator it = ((ArrayList) LJLZ.LJIJ).iterator();
            while (it.hasNext()) {
                Effect effect = (Effect) it.next();
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Effect, CQ pausePreloadEffects : ");
                LIZ.append(effect);
                LIZLLL.d(X1D.LIZIZ(LIZ));
                TEZ tez = LJLZ.LJ;
                if (tez != null) {
                    tez.LIZIZ(effect);
                }
            }
            ((ArrayList) LJLZ.LJIJ).clear();
        }
    }

    @Override // X.WW6
    public final void LJII() {
        if (C53558L0g.LIZIZ().supportPrefetchEffects) {
            WWJ LJLZ = this.LIZ.LJLZ();
            LJLZ.getClass();
            C82891Wg3.LIZLLL().d("Effect, CQ preloadEffects begin....");
            int LJZ = ORZ.LJZ(LJLZ.LJIIZILJ, LJLZ.LJIILLIIL);
            int i = LJZ + 3;
            for (int i2 = LJZ - 2; i2 < i; i2++) {
                if (i2 != LJZ) {
                    AbstractC77369UYb abstractC77369UYb = (AbstractC77369UYb) ORZ.LJLLLLLL(i2, LJLZ.LJIILLIIL);
                    if (abstractC77369UYb instanceof C77379UYl) {
                        C77379UYl c77379UYl = (C77379UYl) abstractC77369UYb;
                        if (!((ArrayList) LJLZ.LJIJI).contains(c77379UYl.LIZ)) {
                            LJLZ.LJIIIIZZ(c77379UYl.LIZ);
                            ((ArrayList) LJLZ.LJIJ).add(c77379UYl.LIZ);
                            C5NP LIZLLL = C82891Wg3.LIZLLL();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Effect, CQ preloadEffects now : ");
                            LIZ.append(c77379UYl.LIZ);
                            LIZLLL.d(X1D.LIZIZ(LIZ));
                        } else {
                            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Effect, CQ preloadEffects already success : ");
                            LIZ2.append(c77379UYl.LIZ);
                            LIZLLL2.d(X1D.LIZIZ(LIZ2));
                        }
                    }
                    if (abstractC77369UYb instanceof C77376UYi) {
                        C77376UYi c77376UYi = (C77376UYi) abstractC77369UYb;
                        if (!((ArrayList) LJLZ.LJIJI).contains(c77376UYi.LIZ)) {
                            LJLZ.LJIIIIZZ(c77376UYi.LIZ);
                            ((ArrayList) LJLZ.LJIJ).add(c77376UYi.LIZ);
                            C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("Effect, CQ preloadEffects now : ");
                            LIZ3.append(c77376UYi.LIZ);
                            LIZLLL3.d(X1D.LIZIZ(LIZ3));
                        } else {
                            C5NP LIZLLL4 = C82891Wg3.LIZLLL();
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Effect, CQ preloadEffects already success : ");
                            LIZ4.append(c77376UYi.LIZ);
                            LIZLLL4.d(X1D.LIZIZ(LIZ4));
                        }
                    }
                }
            }
        }
    }

    @Override // X.WW6
    public final void LJIIIIZZ() {
        TEZ LLLLL;
        if (C53558L0g.LIZIZ().supportHoldEffectOnExit) {
            I0N LLF = this.LIZ.LLF();
            if (LLF == null || (LLLLL = LLF.LLLLL()) == null || LLLLL.LLJJIJIIJIL() == null) {
                I0N LLF2 = this.LIZ.LLF();
                if (LLF2 != null) {
                    C82398WVm.LJI(LLF2, null);
                }
                C82130WLe.LIZ(this.LIZ, false, true, false, "click_icon", false, 44);
            } else {
                C82130WLe.LIZ(this.LIZ, false, false, false, "click_icon", false, 44);
            }
        } else {
            I0N LLF3 = this.LIZ.LLF();
            if (LLF3 != null) {
                C82398WVm.LJI(LLF3, null);
            }
            C82130WLe.LIZ(this.LIZ, false, true, false, "click_icon", false, 44);
        }
        if (o.LJ(this.LIZ.getPlanCUIApiComponent().g2().LIZJ(), Boolean.TRUE)) {
            this.LIZ.getPlanCUIApiComponent().MF(false);
        }
    }

    public C82411WVz(C82410WVy c82410WVy) {
        this.LIZ = c82410WVy;
    }

    @Override // X.WW6
    public final void LJIIJJI(RecyclerView recyclerView) {
        TEZ LLLLL;
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (LLLLL = LLF.LLLLL()) != null) {
            C82410WVy c82410WVy = this.LIZ;
            TJV LIZ = LLLLL.LJJJJLL().LIZ();
            C74310TEk.LIZIZ(LIZ, false, 15).observe(c82410WVy, new C74302TEc(LIZ, LLLLL, recyclerView, c82410WVy));
        }
        if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                SIZ.LIZ = Math.min(linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLIL(), 3);
                return;
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new IDCListenerS258S0100000_12(recyclerView, 3));
    }

    @Override // X.WW6
    public final boolean LJIIL(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return this.LIZ.LLILZIL(effect);
    }

    @Override // X.WW6
    public final boolean LJIILIIL(Effect effect) {
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        InterfaceC74443TJn LJIJ;
        o.LJIIIZ(effect, "effect");
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (LLLLL = LLF.LLLLL()) != null && (LJJJJLL = LLLLL.LJJJJLL()) != null && (LJIJ = LJJJJLL.LJIJ()) != null && LJIJ.LJJJLL(effect.getEffectId())) {
            return true;
        }
        return false;
    }

    @Override // X.WW6
    public final void LJIIIZ(long j, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        InterfaceC74343TFr LJLJJL = this.LIZ.LJLJJL();
        if (LJLJJL != null) {
            LJLJJL.LJIIIIZZ(currentTimeMillis, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WW6
    public final void LJIILJJIL(int i, AbstractC77369UYb slipEffect) {
        String str;
        String valueOf;
        int i2 = i;
        o.LJIIIZ(slipEffect, "slipEffect");
        if (this.LIZ.LL.contains(slipEffect)) {
            return;
        }
        this.LIZ.LL.add(slipEffect);
        if (slipEffect instanceof InterfaceC47392Iiq) {
            Bundle bundle = new Bundle();
            InterfaceC47392Iiq interfaceC47392Iiq = (InterfaceC47392Iiq) slipEffect;
            bundle.putString("tab_name", interfaceC47392Iiq.getTabName());
            boolean z = slipEffect instanceof C77379UYl;
            if (z) {
                str = "prop_carousel_Favorites";
            } else {
                str = "prop_carousel_Trending";
            }
            bundle.putString("prop_selected_from", str);
            if (z) {
                valueOf = String.valueOf(-i2);
            } else {
                valueOf = String.valueOf(i2);
            }
            bundle.putString("prop_position", valueOf);
            if (z) {
                i2 = -i2;
            }
            InterfaceC74343TFr LJLJJL = this.LIZ.LJLJJL();
            if (LJLJJL != null) {
                LJLJJL.LIZIZ(interfaceC47392Iiq.LIZ(), interfaceC47392Iiq.getTabName(), "slide_bar", i2, "slide_bar", bundle);
            }
        }
    }

    @Override // X.WW6
    public final void LJ(Activity activity, Effect effect, String tab) {
        boolean z;
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        InterfaceC74443TJn LJIJ;
        C73641SvF LJIIIIZZ;
        TEZ LLLLL2;
        InterfaceC74393THp LJJJJLL2;
        InterfaceC74443TJn LJIJ2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(tab, "tab");
        if (!this.LIZ.LJLIIL().isLogin()) {
            THX LJLIIL = this.LIZ.LJLIIL();
            this.LIZ.LJLIIL().LIZJ();
            LJLIIL.LIZIZ(activity, "favorite_sticker", 242, null, new AqS164S0100000_14(this.LIZ, 229));
            return;
        }
        if (this.LIZ.LLILZIL(effect)) {
            return;
        }
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (LLLLL2 = LLF.LLLLL()) != null && (LJJJJLL2 = LLLLL2.LJJJJLL()) != null && (LJIJ2 = LJJJJLL2.LJIJ()) != null && LJIJ2.LJJJLL(effect.getEffectId())) {
            z = true;
        } else {
            z = false;
            InterfaceC74343TFr LJLJJL = this.LIZ.LJLJJL();
            if (LJLJJL != null) {
                LJLJJL.LIZLLL(effect, false, "slide_bar", new OSZ<>("tab_name", tab), new OSZ<>("tab_type", "slide_bar"));
            }
        }
        I0N LLF2 = this.LIZ.LLF();
        if (LLF2 == null || (LLLLL = LLF2.LLLLL()) == null || (LJJJJLL = LLLLL.LJJJJLL()) == null || (LJIJ = LJJJJLL.LJIJ()) == null || (LJIIIIZZ = LJIJ.LJIIIIZZ(EnumC74442TJm.BOTTOM_GALLERY, effect, z)) == null) {
            return;
        }
        LJIIIIZZ.LJJII(new AfS20S0210000_14(this.LIZ, z, effect, 1), C81665W3h.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4, r7) != false) goto L27;
     */
    @Override // X.WW6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.AbstractC77369UYb r18, com.ss.android.ugc.effectmanager.effect.model.Effect r19, X.InterfaceC74398THu r20, X.WWK r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82411WVz.LJFF(X.UYb, com.ss.android.ugc.effectmanager.effect.model.Effect, X.THu, X.WWK):void");
    }
}

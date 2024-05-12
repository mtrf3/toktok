package com.ss.android.ugc.aweme.sticker.presenter;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C29S;
import X.C40627Fx1;
import X.C44428Hc8;
import X.C45108Hn6;
import X.C5NP;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74287TDn;
import X.C74303TEd;
import X.C74385THh;
import X.C74389THl;
import X.C74391THn;
import X.C74396THs;
import X.C74397THt;
import X.C78999UzT;
import X.C82891Wg3;
import X.C84132X0e;
import X.I29;
import X.InterfaceC48038ItG;
import X.InterfaceC74301TEb;
import X.InterfaceC74393THp;
import X.InterfaceC74398THu;
import X.InterfaceC74399THv;
import X.InterfaceC74400THw;
import X.InterfaceC74401THx;
import X.InterfaceC74528TMu;
import X.ORZ;
import X.OSZ;
import X.T16;
import X.TEZ;
import X.TI3;
import X.TID;
import X.TNY;
import X.WW5;
import X.X1D;
import Y.ACallableS1S1000000_2;
import Y.ACallableS84S0200000_7;
import Y.ARunnableS23S0300000_12;
import Y.AfS51S0300000_12;
import Y.AfS61S0200000_12;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class DefaultStickerDataManager implements GenericLifecycleObserver, TEZ {
    public boolean LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final InterfaceC74393THp LJLJI;
    public TI3 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public Effect LJLJLLL;
    public long LJLL;
    public boolean LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final OSZ<String, String> LJLLL;
    public final long LJLLLL;
    public final long LJLLLLLL;
    public int LJLZ;
    public final Map<String, List<Integer>> LJZ;
    public int LJZI;
    public long LJZL;
    public long LL;
    public long LLD;
    public boolean LLF;
    public final C74385THh LLFF;
    public final InterfaceC74301TEb LLFFF;
    public final InterfaceC74399THv LLFII;
    public final TNY LLFZ;
    public final LifecycleOwner LLI;

    @Override // X.InterfaceC74300TEa
    public final void LIZLLL(Effect effect) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.TEZ
    public final void LJIIJ() {
    }

    @Override // X.TEZ
    public final void LJJIFFI() {
    }

    @Override // X.TEZ
    public final void LJJJJ() {
        this.LJLIL = true;
    }

    @Override // X.TEZ
    public final void LJJJJJ() {
    }

    @Override // X.TEZ
    public final void LJJJJZ() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TEZ
    public final Effect LJJIIZI() {
        return (Effect) this.LLFFF.LJIILL().getValue();
    }

    @Override // X.TEZ
    public final Effect LLJJIJIIJIL() {
        return this.LLFFF.LJIIIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LLF) {
            return;
        }
        this.LLF = true;
        this.LJLJI.invalidate();
        this.LJLILLLLZI.LIZLLL();
    }

    @Override // X.TEZ
    public final boolean LJIILL() {
        return LJJIL().LJLLLL;
    }

    @Override // X.TEZ
    public final long LJFF() {
        return this.LJLLLL;
    }

    @Override // X.TEZ
    public final int LJI() {
        return this.LJZI;
    }

    @Override // X.TEZ
    public final boolean LJII() {
        return this.LJLIL;
    }

    @Override // X.TEZ
    public final InterfaceC74301TEb LJIIIIZZ() {
        return this.LLFFF;
    }

    @Override // X.TEZ
    public final OSZ<String, String> LJIIIZ() {
        return this.LJLLL;
    }

    @Override // X.TEZ
    public final String LJIIJJI() {
        return this.LJLJL;
    }

    @Override // X.TEZ
    public final boolean LJIILIIL() {
        return this.LJLJJLL;
    }

    @Override // X.TEZ
    public final Effect LJIILJJIL() {
        return this.LJLJLLL;
    }

    @Override // X.TEZ
    public final int LJIILLIIL() {
        return this.LJLZ;
    }

    @Override // X.TEZ
    public final String LJIJ() {
        return this.LJLLJ;
    }

    @Override // X.TEZ
    public final long LJIJI() {
        return this.LJLLLLLL;
    }

    @Override // X.TEZ
    public final int LJIJJLI() {
        return this.LJLJLJ;
    }

    @Override // X.TEZ
    public final String LJIL() {
        return this.LJLLILLLL;
    }

    @Override // X.TEZ
    public final TNY LJJ() {
        return this.LLFZ;
    }

    @Override // X.TEZ
    public final long LJJI() {
        return this.LL;
    }

    @Override // X.TEZ
    public final boolean LJJII() {
        return this.LJLJJL;
    }

    @Override // X.TEZ
    public final Map<String, List<Integer>> LJJIIJZLJL() {
        return this.LJZ;
    }

    @Override // X.TEZ
    public final long LJJIJIIJIL() {
        return this.LJLL;
    }

    public C74385THh LJJIL() {
        return this.LLFF;
    }

    @Override // X.TEZ
    public final TI3 LJJIZ() {
        return this.LJLJJI;
    }

    @Override // X.TEZ
    public final long LJJJIL() {
        return this.LLD;
    }

    @Override // X.TEZ
    public final long LJJJJJL() {
        return this.LJZL;
    }

    @Override // X.TEZ
    public final boolean LJJJJLI() {
        return this.LJLLI;
    }

    @Override // X.TEZ
    public final InterfaceC74393THp LJJJJLL() {
        return this.LJLJI;
    }

    @Override // X.TEZ
    public final void release() {
        onDestroy();
    }

    @Override // X.TEZ
    public final void LIZIZ(Effect effect) {
        if (effect != null) {
            this.LJLJI.LJIJI().LIZIZ(effect);
        }
    }

    @Override // X.TEZ
    public final void LJIIL(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.TEZ
    public final void LJIIZILJ(Effect effect) {
        this.LJLJLLL = effect;
    }

    @Override // X.TEZ
    public final void LJIJJ(boolean z) {
        this.LJLLI = z;
    }

    @Override // X.TEZ
    public final void LJJIII(boolean z) {
        this.LJLJJL = z;
    }

    @Override // X.TEZ
    public final void LJJIIZ(int i) {
        this.LJLJLJ = i;
    }

    @Override // X.TEZ
    public final void LJJIJ(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    @Override // X.TEZ
    public final void LJJIJIIJI(long j) {
        this.LJZL = j;
    }

    @Override // X.TEZ
    public final void LJJIJIL(long j) {
        this.LLD = j;
    }

    @Override // X.TEZ
    public final void LJJIJL(int i) {
        this.LJZI = i;
    }

    @Override // X.TEZ
    public final void LJJIJLIJ(int i) {
        this.LJLZ = i;
    }

    public void LJJJ(C74389THl c74389THl) {
        this.LJLJI.LJIIIIZZ().LIZIZ(c74389THl);
    }

    @Override // X.TEZ
    public final void LJJJI(long j) {
        this.LL = j;
    }

    @Override // X.TEZ
    public final void LJJJJIZL(C84132X0e c84132X0e) {
        this.LJLJJI = c84132X0e;
    }

    @Override // X.TEZ
    public final void LJJJJL(long j) {
        this.LJLL = j;
    }

    @Override // X.InterfaceC74286TDm
    public final void LJJIIJ(C74397THt c74397THt, InterfaceC74398THu interfaceC74398THu) {
        C73318Sq2 c73318Sq2;
        String str;
        Effect effect = c74397THt.LJLIL;
        InterfaceC74528TMu download = this.LJLJI.LJIJJLI();
        boolean LIZ = this.LJLJI.LJ().LIZ(effect);
        if (interfaceC74398THu != null) {
            if (!LJJIL().LJLZ || !LIZ || (str = LJJIL().LJLLLLLL) == null || str.length() == 0 || !C74287TDn.LIZ(download, effect, LIZ) || !C45108Hn6.LIZ(effect) || !(interfaceC74398THu instanceof InterfaceC74400THw)) {
                LJJIL().LJLLILLLL.invoke(effect);
                C74396THs c74396THs = new C74396THs(LIZ ? 1 : 0, interfaceC74398THu, this.LLFII, LJJIL().LJLLJ);
                C74391THn c74391THn = new C74391THn(LIZ, download, c74397THt.LJLJI);
                c74391THn.LIZJ = LJJIL().LJLLI;
                o.LJIIIZ(effect, "effect");
                if (c74391THn.LIZJ) {
                    ARunnableS23S0300000_12 aRunnableS23S0300000_12 = new ARunnableS23S0300000_12(c74391THn, effect, c74396THs, 2);
                    String str2 = (String) ORZ.LJLLLL(effect.getHintIcon().getUrlList());
                    C5NP LIZLLL = C82891Wg3.LIZLLL();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[DownloadStickerAndHintIconCombiner:download] hintIconUrl: ");
                    LIZ2.append(str2);
                    LIZLLL.d(X1D.LIZIZ(LIZ2));
                    if (str2 == null || ujb.o.LJJJJJL(str2)) {
                        c74391THn.LIZIZ = true;
                        aRunnableS23S0300000_12.run();
                        return;
                    } else {
                        C78999UzT.LJFF(AbstractC73672Svk.LJJIIJZLJL(new ACallableS1S1000000_2(str2, 2)).LJJJJ(C40627Fx1.LJLJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0200000_12(c74391THn, aRunnableS23S0300000_12, 11)), c74391THn.LIZLLL);
                        c73318Sq2 = c74391THn.LIZLLL;
                    }
                } else {
                    C78999UzT.LJFF(AbstractC73672Svk.LJJIIJZLJL(new ACallableS84S0200000_7(c74391THn, effect, 13)).LJJJJ(new InterfaceC48038ItG<Throwable, Boolean>() { // from class: X.3gz
                        @Override // X.InterfaceC48038ItG
                        public final Boolean apply(Throwable it) {
                            o.LJIIIZ(it, "it");
                            return Boolean.TRUE;
                        }
                    }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS51S0300000_12(c74391THn, effect, c74396THs, 2)), c74391THn.LIZLLL);
                    c73318Sq2 = c74391THn.LIZLLL;
                }
                if (c73318Sq2 == null) {
                    return;
                }
                C78999UzT.LJFF(c73318Sq2, this.LJLILLLLZI);
                return;
            }
            ((InterfaceC74400THw) interfaceC74398THu).LJJLIIIJILLIZJL(effect);
            InterfaceC74399THv interfaceC74399THv = this.LLFII;
            if (interfaceC74399THv != null) {
                interfaceC74399THv.LJIIIZ(effect, LIZ ? 1 : 0, C44428Hc8.LIZ().LIZIZ(TimeUnit.MILLISECONDS));
                return;
            }
            return;
        }
        if (LJJIL().LJLZ && LIZ && C74287TDn.LIZ(download, effect, LIZ) && C45108Hn6.LIZ(effect)) {
            return;
        }
        boolean z = c74397THt.LJLILLLLZI;
        TID tid = c74397THt.LJLJI;
        o.LJIIIZ(download, "$this$download");
        o.LJIIIZ(effect, "effect");
        download.LIZIZ(new C74397THt(effect, z, tid), false);
    }

    @Override // X.TEZ
    public final void LJJJJI(Effect effect, AqS96S0300000_7 aqS96S0300000_7) {
        this.LJLJI.LJIJI().fetchEffect(effect, new C74303TEd(aqS96S0300000_7));
    }

    @Override // X.TEZ
    public final void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.LJLJI.LJIJI().fetchEffect(effect, iFetchEffectListener);
        }
    }

    @Override // X.TEZ
    public final void LIZ(List<String> effectIds, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(effectIds, "effectIds");
        this.LJLJI.LJIJI().LIZ(effectIds, map, iFetchEffectListByIdsListener);
    }

    @Override // X.TEZ
    public final void LJ(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
        this.LJLJI.LJIJI().LIZJ(list, true, map, iFetchEffectListListener);
    }

    @Override // X.TEZ
    public final void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.LJLJI.LJIJI().LIZLLL(effect, z, z2, z3, (WW5) iFetchEffectListener);
        }
    }

    public DefaultStickerDataManager(C29S activity, C74385THh configure, InterfaceC74401THx stickerRepositoryFactory, I29 stickerState, InterfaceC74399THv interfaceC74399THv, TNY tny, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(stickerRepositoryFactory, "stickerRepositoryFactory");
        o.LJIIIZ(stickerState, "stickerState");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LLFF = configure;
        this.LLFFF = stickerState;
        this.LLFII = interfaceC74399THv;
        this.LLFZ = tny;
        this.LLI = lifecycleOwner;
        this.LJLILLLLZI = new C73318Sq2();
        this.LJLJI = stickerRepositoryFactory.create();
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJJL = true;
        this.LJLJL = "";
        this.LJLJLJ = -1;
        this.LJLL = -1L;
        this.LJLLI = true;
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLL = new OSZ<>("", "");
        this.LJLLLL = -1L;
        this.LJLLLLLL = -1L;
        this.LJZ = new LinkedHashMap();
        C221108m2.LIZIZ(new AqS162S0100000_12(this, 1082));
    }
}

package com.ss.android.ugc.aweme.main.assems.tabs;

import X.AbstractC53892LDc;
import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C141335gf;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C2NH;
import X.C36922EeM;
import X.C37183EiZ;
import X.C37195Eil;
import X.C3C5;
import X.C47261Igj;
import X.C51645KOr;
import X.C53160Ktg;
import X.C53771L8l;
import X.C54032LIm;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56662Kg;
import X.C62814Ol0;
import X.C62822Ol8;
import X.InterfaceC54080LKi;
import X.InterfaceC55235Lm3;
import X.L80;
import X.L82;
import X.L8J;
import X.L8Y;
import X.L9M;
import X.LDW;
import X.LDX;
import X.LDY;
import X.LEA;
import X.LKR;
import X.LLQ;
import X.LNZ;
import X.ORZ;
import X.OSZ;
import Y.ACallableS58S0300000_9;
import Y.ARunnableS44S0100000_8;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TabAbilityAssem extends BaseMainContainerAssem implements HomeTabAbility, LEA, LDX {
    public static final Object LJLLLLLL = new Object();
    public static final Object LJLZ = new Object();
    public final CopyOnWriteArrayList<TopTabNode> LJLIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC54080LKi> LJLILLLLZI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<TopTabProtocol> LJLJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<BottomTabProtocol> LJLJJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<L9M> LJLJJL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<L9M> LJLJJLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LDW> LJLJL = new CopyOnWriteArrayList<>();
    public FutureTask<OSZ<List<TopTabNode>, List<TopTabProtocol>>> LJLJLJ;
    public FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public ActivityC45651qj LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(TabAbilityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        C2NH.LIZ.post(new ARunnableS44S0100000_8(this, 199));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public final void A3() {
        OSZ<List<TopTabNode>, List<TopTabProtocol>> LIZJ;
        FutureTask<OSZ<List<TopTabNode>, List<TopTabProtocol>>> futureTask;
        if (((Number) C37195Eil.LIZ.getValue()).intValue() == 2) {
            C3();
            return;
        }
        synchronized (LJLLLLLL) {
            if (this.LJLLILLLL) {
                return;
            }
            Boolean bool = null;
            try {
                futureTask = this.LJLJLJ;
            } catch (Throwable unused) {
                L82.LIZLLL = false;
                try {
                    FutureTask<OSZ<List<TopTabNode>, List<TopTabProtocol>>> futureTask2 = this.LJLJLJ;
                    if (futureTask2 != null) {
                        bool = Boolean.valueOf(futureTask2.cancel(true));
                    }
                    C3C5.m7constructorimpl(bool);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                L8J H3 = H3();
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    LIZJ = H3.LIZJ(LIZ, C55096Ljo.LJIIZILJ(this), 2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (futureTask != null) {
                LIZJ = futureTask.get(500L, TimeUnit.MILLISECONDS);
                if (LIZJ != null) {
                    K3(LIZJ.getFirst(), LIZJ.getSecond());
                }
            }
            this.LJLLILLLL = true;
        }
    }

    public final void C3() {
        OSZ<List<TopTabNode>, List<TopTabProtocol>> LIZJ;
        Boolean bool;
        synchronized (LJLLLLLL) {
            if (this.LJLLILLLL) {
                return;
            }
            FutureTask<OSZ<List<TopTabNode>, List<TopTabProtocol>>> futureTask = this.LJLJLJ;
            if (futureTask != null && futureTask.isDone()) {
                C36922EeM.LJ("get top tabs from preload");
                LIZJ = futureTask.get();
            } else {
                L82.LIZLLL = false;
                C36922EeM.LJ("top tabs preload is not ready, cancel and rerun it");
                try {
                    FutureTask<OSZ<List<TopTabNode>, List<TopTabProtocol>>> futureTask2 = this.LJLJLJ;
                    if (futureTask2 != null) {
                        bool = Boolean.valueOf(futureTask2.cancel(true));
                    } else {
                        bool = null;
                    }
                    C3C5.m7constructorimpl(bool);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                ActivityC45651qj activityC45651qj = this.LJLLL;
                L8J H3 = H3();
                if (activityC45651qj != null) {
                    LIZJ = H3.LIZJ(activityC45651qj, C55230Lly.LIZLLL(activityC45651qj, null), 2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (LIZJ != null) {
                K3(LIZJ.getFirst(), LIZJ.getSecond());
            }
            this.LJLLILLLL = true;
        }
    }

    public final Hox E3() {
        return (Hox) this.LJLLLL.getValue();
    }

    public final List<LDW> F3() {
        return (List) this.LJLLI.getValue();
    }

    public final L8J H3() {
        return (L8J) this.LJLL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void IH() {
        if (L82.LIZIZ) {
            return;
        }
        C37183EiZ.LIZ().execute(L80.LJLIL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean jc() {
        if (Y20("SHOP_MALL") != null) {
            return true;
        }
        return false;
    }

    public final void v3() {
        OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>> LIZIZ;
        FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> futureTask;
        if (((Number) C37195Eil.LIZ.getValue()).intValue() == 2) {
            x3();
            return;
        }
        synchronized (LJLZ) {
            if (this.LJLLJ) {
                return;
            }
            Boolean bool = null;
            try {
                futureTask = this.LJLJLLL;
            } catch (Throwable unused) {
                L82.LIZLLL = false;
                try {
                    FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> futureTask2 = this.LJLJLLL;
                    if (futureTask2 != null) {
                        bool = Boolean.valueOf(futureTask2.cancel(true));
                    }
                    C3C5.m7constructorimpl(bool);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                L8J H3 = H3();
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    LIZIZ = H3.LIZIZ(LIZ, C55096Ljo.LJIIZILJ(this), 2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (futureTask != null) {
                LIZIZ = futureTask.get(500L, TimeUnit.MILLISECONDS);
                if (LIZIZ != null) {
                    I3(LIZIZ.getFirst(), LIZIZ.getSecond());
                }
            }
            this.LJLLJ = true;
        }
    }

    public final void x3() {
        boolean z;
        OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>> LIZIZ;
        Boolean bool;
        synchronized (LJLZ) {
            if (this.LJLLJ) {
                return;
            }
            FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> futureTask = this.LJLJLLL;
            if (futureTask == null || !futureTask.isDone()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C36922EeM.LJ("get bottom tabs from preload");
                FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> futureTask2 = this.LJLJLLL;
                if (futureTask2 != null) {
                    LIZIZ = futureTask2.get();
                }
                this.LJLLJ = true;
            }
            L82.LIZLLL = false;
            C36922EeM.LJ("bottom tabs preload is not ready, cancel and rerun it");
            try {
                FutureTask<OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>>> futureTask3 = this.LJLJLLL;
                if (futureTask3 != null) {
                    bool = Boolean.valueOf(futureTask3.cancel(true));
                } else {
                    bool = null;
                }
                C3C5.m7constructorimpl(bool);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            ActivityC45651qj activityC45651qj = this.LJLLL;
            L8J H3 = H3();
            if (activityC45651qj != null) {
                LIZIZ = H3.LIZIZ(activityC45651qj, C55230Lly.LIZLLL(activityC45651qj, null), 2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (LIZIZ != null) {
                I3(LIZIZ.getFirst(), LIZIZ.getSecond());
            }
            this.LJLLJ = true;
        }
    }

    public TabAbilityAssem() {
        new CopyOnWriteArrayList();
        this.LJLL = C221108m2.LIZIZ(L8Y.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(C53771L8l.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 93));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<TopTabProtocol> L2() {
        A3();
        return this.LJLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<String> P80() {
        return H3().LIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Fragment QU() {
        Hox E3 = E3();
        return E3.Ja(E3.ov0("page_feed"));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final String QW() {
        return E3().ov0("HOME");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void XZ() {
        L8J H3 = H3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            OSZ<List<TopTabNode>, List<TopTabProtocol>> LIZJ = H3.LIZJ(LIZ, C55096Ljo.LJIIZILJ(this), 3);
            if (LIZJ != null) {
                K3(LIZJ.getFirst(), LIZJ.getSecond());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean Xf() {
        String str;
        A3();
        InterfaceC54080LKi interfaceC54080LKi = (InterfaceC54080LKi) ORZ.LLFII(this.LJLIL);
        if (interfaceC54080LKi == null || (str = interfaceC54080LKi.tag()) == null) {
            str = "";
        }
        String QW = QW();
        if (o.LJ(QW, "")) {
            return false;
        }
        return o.LJ(str, QW);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<BottomTabProtocol> ed() {
        v3();
        return this.LJLJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<InterfaceC54080LKi> fd() {
        v3();
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void iy() {
        L8J H3 = H3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>> LIZIZ = H3.LIZIZ(LIZ, C55096Ljo.LJIIZILJ(this), 3);
            if (LIZIZ != null) {
                I3(LIZIZ.getFirst(), LIZIZ.getSecond());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        AccountService.LJIJ().LJIILLIIL(this);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<InterfaceC54080LKi> p5() {
        A3();
        return this.LJLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final int xb0() {
        Hox E3 = E3();
        return E3.qv0(E3.ov0("page_feed"));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void HI(L9M listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL.addIfAbsent(listener);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Fragment Ja(String str) {
        return E3().Ja("For You");
    }

    @Override // X.LDX
    public final void LLLLZ(ActivityC45651qj activity) {
        TopTabProtocol LJIJ;
        o.LJIIIZ(activity, "activity");
        this.LJLLL = activity;
        InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(activity, null);
        C55096Ljo.LJIIJJI(LIZLLL, this, HomeTabAbility.class, null);
        if (!C53160Ktg.LIZ() && (LJIJ = C51645KOr.LIZIZ.LJIJ()) != null) {
            C62814Ol0.LJJIIJZLJL(LIZLLL, TopTabProtocol.class, C47261Igj.LJJIJIL(LJIJ));
        }
        this.LJLJLJ = new FutureTask<>(new ACallableS58S0300000_9(this, activity, LIZLLL, 0));
        this.LJLJLLL = new FutureTask<>(new ACallableS58S0300000_9(this, activity, LIZLLL, 1));
        C37183EiZ.LIZ().execute(this.LJLJLJ);
        C37183EiZ.LIZ().execute(this.LJLJLLL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final LLQ OH(ActivityC45651qj activityC45651qj) {
        return LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Pn(L9M listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL.remove(listener);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Q6(LDY observer) {
        LDW ldw;
        o.LJIIIZ(observer, "observer");
        Iterator<LDW> it = F3().iterator();
        while (true) {
            if (it.hasNext()) {
                ldw = it.next();
                if (o.LJ(ldw.LJLIL, observer)) {
                    break;
                }
            } else {
                ldw = null;
                break;
            }
        }
        LDW ldw2 = ldw;
        if (ldw2 != null) {
            AbstractC53895LDf rv0 = E3().rv0("page_feed");
            o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
            ((AbstractC53892LDc) rv0).LJIL(ldw2);
            F3().remove(ldw2);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final InterfaceC54080LKi Y20(String str) {
        InterfaceC54080LKi interfaceC54080LKi;
        A3();
        Iterator<InterfaceC54080LKi> it = this.LJLILLLLZI.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC54080LKi = it.next();
                if (TextUtils.equals(str, interfaceC54080LKi.tag())) {
                    break;
                }
            } else {
                interfaceC54080LKi = null;
                break;
            }
        }
        return interfaceC54080LKi;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void a2(LDY observer) {
        LDW ldw;
        o.LJIIIZ(observer, "observer");
        Iterator<LDW> it = F3().iterator();
        while (true) {
            if (it.hasNext()) {
                ldw = it.next();
                if (o.LJ(ldw.LJLIL, observer)) {
                    break;
                }
            } else {
                ldw = null;
                break;
            }
        }
        LDW ldw2 = ldw;
        if (ldw2 != null) {
            AbstractC53895LDf rv0 = E3().rv0("HOME");
            o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
            ((AbstractC53892LDc) rv0).LJIL(ldw2);
            F3().remove(ldw2);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void b3(LDY observer) {
        o.LJIIIZ(observer, "observer");
        AbstractC53895LDf rv0 = E3().rv0("page_feed");
        o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
        LDW ldw = new LDW(observer);
        F3().add(ldw);
        ((AbstractC53892LDc) rv0).LJIIZILJ(ldw);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void ev(L9M listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.addIfAbsent(listener);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void fJ(C54032LIm c54032LIm) {
        Hox E3 = E3();
        LDW ldw = new LDW(c54032LIm);
        this.LJLJL.add(ldw);
        E3.getClass();
        E3.LJLJLJ.addIfAbsent(ldw);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean is(String str) {
        A3();
        Iterator<TopTabNode> it = this.LJLIL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TopTabNode next = it.next();
            if (TextUtils.equals(str, next.tag())) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void na(LDY observer) {
        AbstractC53892LDc abstractC53892LDc;
        o.LJIIIZ(observer, "observer");
        AbstractC53895LDf rv0 = E3().rv0("HOME");
        if ((rv0 instanceof AbstractC53892LDc) && (abstractC53892LDc = (AbstractC53892LDc) rv0) != null) {
            LDW ldw = new LDW(observer);
            F3().add(ldw);
            abstractC53892LDc.LJIIZILJ(ldw);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void yL(L9M listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.remove(listener);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean zW(String tag) {
        o.LJIIIZ(tag, "tag");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        return LKR.LIZIZ(LIZ, tag);
    }

    public final void I3(List<? extends InterfaceC54080LKi> list, List<? extends BottomTabProtocol> list2) {
        if (!o.LJ(this.LJLILLLLZI, list)) {
            ArrayList arrayList = new ArrayList(this.LJLILLLLZI);
            this.LJLILLLLZI.clear();
            this.LJLILLLLZI.addAll(list);
            this.LJLJJI.clear();
            this.LJLJJI.addAll(list2);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = new ArrayList(this.LJLILLLLZI);
                Iterator<L9M> it = this.LJLJJLL.iterator();
                while (it.hasNext()) {
                    it.next().G(arrayList2, arrayList3);
                }
            }
        }
    }

    public final void K3(List<TopTabNode> list, List<? extends TopTabProtocol> list2) {
        if (!o.LJ(this.LJLIL, list)) {
            ArrayList arrayList = new ArrayList(this.LJLIL);
            this.LJLIL.clear();
            this.LJLIL.addAll(list);
            this.LJLJI.clear();
            this.LJLJI.addAll(list2);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = new ArrayList(this.LJLIL);
                Iterator<L9M> it = this.LJLJJL.iterator();
                while (it.hasNext()) {
                    it.next().G(arrayList2, arrayList3);
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void lZ(Bundle bundle, String str) {
        E3().Cv0(bundle, str);
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        XZ();
    }
}

package com.ss.android.ugc.feed.platform.cell.interact;

import X.AnonymousClass838;
import X.C162476Zf;
import X.C16880lQ;
import X.C202457x3;
import X.C210888Pk;
import X.C211628Sg;
import X.C211638Sh;
import X.C211668Sk;
import X.C211748Ss;
import X.C211758St;
import X.C212428Vi;
import X.C214348b8;
import X.C217628gQ;
import X.C221108m2;
import X.C222588oQ;
import X.C243099gP;
import X.C243109gQ;
import X.C2K0;
import X.C2L4;
import X.C35168DrA;
import X.C37179EiV;
import X.C51029K0z;
import X.C55096Ljo;
import X.C56742Ko;
import X.C5H3;
import X.C60392Yp;
import X.C62623Ohv;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C73098SmU;
import X.C74221TAz;
import X.C76800UCe;
import X.C76965UIn;
import X.C78540Us4;
import X.C78923UyF;
import X.C78996UzQ;
import X.C7MY;
import X.C8MM;
import X.C8MQ;
import X.C8T1;
import X.C8T4;
import X.C8T5;
import X.C8W0;
import X.C9K4;
import X.EF7;
import X.EnumC210578Of;
import X.InterfaceC55102Lju;
import X.InterfaceC88471Ynr;
import X.OSZ;
import X.WM7;
import X.X1D;
import Y.ARunnableS0S1210000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS7S0400000_3;
import Y.IDAListenerS1S0110000_3;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractAreaComponent extends BaseContainer implements InteractAreaCommonAbility, InterfaceC55102Lju, C2L4 {
    public IViewPagerComponentAbility LLFFF;
    public View LLFII;
    public C211628Sg LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C62623Ohv LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final EnumC210578Of LLIIIJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1712106744) {
            return null;
        }
        return this;
    }

    public InteractAreaComponent() {
        new LinkedHashMap();
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C211748Ss.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C211758St.INSTANCE);
        this.LLII = C62623Ohv.LIZIZ;
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1247));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1246));
        this.LLIIIJ = EnumC210578Of.INTERACT_AREA_COMPONENT;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C8T1 c8t1 = (C8T1) this.LLIIIILZ.getValue();
        if (c8t1 != null) {
            c8t1.release();
        }
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CellInteractAreaScope.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility
    public final boolean vp() {
        C211628Sg c211628Sg = this.LLFZ;
        if (c211628Sg == null || c211628Sg.LJ != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).E1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJJJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIILZL() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent.LLIILZL():void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLIIIJ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility
    public final void Qb0(ComponentPriorityProtocol protocol) {
        o.LJIIIZ(protocol, "protocol");
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C211628Sg c211628Sg = this.LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LJIJJ(protocol);
                return;
            }
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS22S0200000_3(this, protocol, 26));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_commodity_card", new AqS169S0100000_3(this, 553));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        int i;
        o.LJIIIZ(item, "item");
        if (C202457x3.LIZ) {
            String LIZJ = C74221TAz.LIZJ(item, "item.aweme.aid");
            C243099gP LIZJ2 = C243109gQ.LIZJ(LIZJ, "avatar");
            if (LIZJ2 != null) {
                LIZJ2.LIZ("InteractAreaComponent.onBind");
            }
            C243099gP LIZJ3 = C243109gQ.LIZJ(LIZJ, "digg");
            if (LIZJ3 != null) {
                LIZJ3.LIZ("InteractAreaComponent.onBind");
            }
        }
        if (!C62623Ohv.LIZIZ.LJ()) {
            C217628gQ.LIZIZ.LJII(this, a1().LIZ, item.getAweme());
        }
        View findViewById = getContainerView().findViewById(R.id.adq);
        o.LJIIIIZZ(findViewById, "this");
        this.LLFII = findViewById;
        o.LJIIIIZZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), "item.aweme");
        if (!AnonymousClass838.LIZ(r1, rp0())) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        C8T1 c8t1 = (C8T1) this.LLIIIILZ.getValue();
        if (c8t1 != null) {
            c8t1.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        boolean z;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        Fragment fragment;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
        ViewGroup viewGroup = null;
        if (this.LLFFF == null) {
            C222588oQ c222588oQ = a1().LIZLLL;
            if (c222588oQ != null && (fragment = c222588oQ.LIZJ) != null) {
                iViewPagerComponentAbility = C78540Us4.LJIIIZ(fragment);
            } else {
                iViewPagerComponentAbility = null;
            }
            this.LLFFF = iViewPagerComponentAbility;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility2 = this.LLFFF;
        if (iViewPagerComponentAbility2 != null) {
            z = iViewPagerComponentAbility2.w80(i);
        } else {
            z = false;
        }
        C211628Sg c211628Sg = this.LLFZ;
        if (c211628Sg != null) {
            c211628Sg.LJI = aweme;
            if (!z) {
                ((ArrayList) c211628Sg.LJIILJJIL).clear();
            }
            if (C211628Sg.LJIILJJIL(c211628Sg.LJIIJJI(), c211628Sg.LJI())) {
                c211628Sg.LJIILLIIL();
            }
        }
        C8T1 c8t1 = (C8T1) this.LLIIIILZ.getValue();
        if (c8t1 != null) {
            c8t1.LIZ();
        }
        if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            C62623Ohv c62623Ohv = this.LLII;
            ViewParent parent = getContainerView().getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            c62623Ohv.LIZ.LIZ(viewGroup, aweme2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void b4(int i, Aweme aweme) {
        String str;
        String str2;
        super.b4(i, aweme);
        String str3 = null;
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c56742Ko.LIZ(str, "aid");
            c56742Ko.LIZ(String.valueOf(i), "pos");
            C222588oQ c222588oQ = a1().LIZLLL;
            if (c222588oQ != null) {
                str2 = c222588oQ.LJIIIZ;
            } else {
                str2 = null;
            }
            c56742Ko.LIZ(str2, WM7.SCENE_SERVICE);
            c56742Ko.LIZ("InteractAreaComponentbindElement", "source");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(aweme), null, 28);
            return;
        }
        StringBuilder LJ = C7MY.LJ("InteractAreaComponent elementBind>>> position:", i, ", aid:");
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        LJ.append(str3);
        C60392Yp.LIZIZ("LFeedView", X1D.LIZIZ(LJ));
    }

    public final void n4(long j, boolean z) {
        OSZ osz;
        if (j > 200) {
            if (z) {
                osz = new OSZ(Float.valueOf(0.0f), Float.valueOf(1.0f));
            } else {
                osz = new OSZ(Float.valueOf(1.0f), Float.valueOf(0.0f));
            }
            AlphaAnimation LIZIZ = C62850Ola.LIZIZ(((Number) osz.getFirst()).floatValue(), ((Number) osz.getSecond()).floatValue(), 200L);
            if (z) {
                LIZIZ.setStartOffset(j - 200);
            } else {
                LIZIZ.setFillAfter(true);
            }
            View view = this.LLFII;
            if (view != null) {
                view.startAnimation(LIZIZ);
            } else {
                o.LJIJI("infoAreaContainer");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
        C211628Sg c211628Sg = this.LLFZ;
        if (c211628Sg != null) {
            c211628Sg.LJ = 0;
            Iterator<C211638Sh<ComponentPriorityProtocol>> it3 = c211628Sg.LJII().iterator();
            while (it3.hasNext()) {
                c211628Sg.LJIJI(it3.next().LJLIL);
            }
            c211628Sg.LJII().clear();
            Iterator<ComponentPriorityProtocol> it4 = c211628Sg.LJIIIIZZ().iterator();
            while (it4.hasNext()) {
                c211628Sg.LJIJI(it4.next());
            }
            c211628Sg.LJIIIIZZ().clear();
            c211628Sg.LJI().clear();
            c211628Sg.LJIIJJI().clear();
            ((ArrayList) c211628Sg.LJIILJJIL).clear();
            C78923UyF.LJIJ(c211628Sg.LJIIJ(), null);
            c211628Sg.LJIIIZ().clear();
            C78923UyF.LJIJ((MutableLiveData) c211628Sg.LJIILLIIL.getValue(), null);
            c211628Sg.LJIIL().clear();
            ((ArrayList) C210888Pk.LIZ).clear();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility
    public final void D3(C8T5 category, boolean z, C211668Sk c211668Sk) {
        View v;
        float f;
        IMFToolBarAbility iMFToolBarAbility;
        o.LJIIIZ(category, "category");
        int i = C8T4.LIZ[category.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    v = getContainerView().findViewById(R.id.epy);
                } else {
                    throw new C162476Zf();
                }
            } else {
                v = getContainerView().findViewById(R.id.adr);
            }
        } else {
            v = getContainerView();
        }
        if (!z && category == C8T5.ALL && (iMFToolBarAbility = (IMFToolBarAbility) this.LLIIII.getValue()) != null) {
            iMFToolBarAbility.iG();
        }
        o.LJIIIIZZ(v, "v");
        int i2 = 0;
        if (c211668Sk == null) {
            if (!z) {
                i2 = 8;
            }
            v.setVisibility(i2);
            return;
        }
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, "alpha", fArr);
        ofFloat.setDuration(c211668Sk.LIZ);
        ofFloat.setInterpolator(c211668Sk.LIZIZ);
        Animator.AnimatorListener animatorListener = c211668Sk.LIZJ;
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.addListener(new IDAListenerS1S0110000_3(v, z, 4));
        ofFloat.start();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility
    public final void U00(ComponentPriorityProtocol protocol, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr, Boolean bool) {
        o.LJIIIZ(protocol, "protocol");
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C211628Sg c211628Sg = this.LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LJIJ(protocol, new AqS185S0100000_3((InterfaceC88471Ynr) interfaceC88471Ynr, (InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe>) 125), bool);
                return;
            }
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS7S0400000_3(this, protocol, bool, interfaceC88471Ynr, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility
    public final void zn(String str, ComponentPriorityProtocol componentPriorityProtocol, boolean z) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C211628Sg c211628Sg = this.LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LIZJ(str, componentPriorityProtocol, z);
                return;
            }
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS0S1210000_3(this, str, componentPriorityProtocol, z, 0));
    }
}

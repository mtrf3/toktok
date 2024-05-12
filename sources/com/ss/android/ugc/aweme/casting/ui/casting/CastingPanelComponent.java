package com.ss.android.ugc.aweme.casting.ui.casting;

import X.AbstractC55082Lja;
import X.C1DH;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2MJ;
import X.C34L;
import X.C34M;
import X.C34U;
import X.C34V;
import X.C34W;
import X.C34X;
import X.C36636EZk;
import X.C48841JEv;
import X.C51781KTx;
import X.C55096Ljo;
import X.C56509MFt;
import X.C5H3;
import X.C62822Ol8;
import X.C70922qO;
import X.C71042qa;
import X.C71052qb;
import X.C71082qe;
import X.C71122qi;
import X.C779434c;
import X.C78688UuS;
import X.DialogC111044Xk;
import X.EnumC221088m0;
import X.GHC;
import X.InterfaceC36571c5;
import X.InterfaceC55102Lju;
import X.InterfaceC70422pa;
import X.JAK;
import X.KU4;
import X.ORZ;
import X.X1D;
import X.XKX;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS2S1100000_1;
import android.database.DataSetObserver;
import android.view.KeyEvent;
import androidx.lifecycle.MutableLiveData;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CastingPanelComponent extends BasePanelComponent implements C34M, ICastingAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLLL = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C34V.LJLIL);
    public final long LJLILLLLZI = 5000;
    public final List<Aweme> LJLJI = new ArrayList();
    public final List<Aweme> LJLJJI = new ArrayList();
    public int LJLJJL = -1;
    public final C5H3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public DialogC111044Xk LJLJLLL;
    public boolean LJLL;
    public final C34U LJLLI;
    public C34W LJLLILLLL;
    public final CastingPanelComponent$isReadyToCast$1 LJLLJ;

    @Override // X.C34M
    public final void o5() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 621572173) {
            return null;
        }
        return this;
    }

    @Override // X.C34M
    public final void q5(boolean z) {
    }

    @Override // X.C34M
    public final void s5() {
    }

    public final void A3() {
        AbstractC55082Lja abstractFeedAdapter;
        List<Aweme> LJJIL;
        Integer num;
        int i;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && c71082qe.LIZIZ.LJIIIZ()) {
            int i2 = 0;
            if (C3()) {
                C34L c34l = c71082qe.LIZJ;
                String LIZLLL = C56509MFt.LIZLLL(getPanelContext());
                c34l.getClass();
                c34l.LIZJ = LIZLLL;
                IFeedPanelPlatformAbility v3 = v3();
                if (v3 != null) {
                    i = v3.getCurrentIndex();
                } else {
                    i = 0;
                }
                if (((ArrayList) this.LJLJI).size() > i && i >= 0) {
                    C34L.LIZJ(c71082qe.LIZJ, !C78688UuS.LJJJJJ((Aweme) ListProtector.get(this.LJLJI, i)), false, 6);
                    return;
                }
                return;
            }
            C70922qO.LIZ("CastingPanelComponent", "handleResume replay");
            IFeedPanelPlatformAbility v32 = v3();
            if (v32 == null || (abstractFeedAdapter = v32.getAbstractFeedAdapter()) == null || (LJJIL = abstractFeedAdapter.LJJIL()) == null) {
                return;
            }
            Integer num2 = null;
            if (!(!LJJIL.isEmpty())) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleResume replay list size: ");
            LIZ.append(LJJIL.size());
            LIZ.append(", index: ");
            IFeedPanelPlatformAbility v33 = v3();
            if (v33 != null) {
                num = Integer.valueOf(v33.getCurIndex());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", ");
            IFeedPanelPlatformAbility v34 = v3();
            if (v34 != null) {
                num2 = Integer.valueOf(v34.getCurrentIndex());
            }
            LIZ.append(num2);
            C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
            C34L c34l2 = c71082qe.LIZJ;
            String LIZLLL2 = C56509MFt.LIZLLL(getPanelContext());
            c34l2.getClass();
            c34l2.LIZJ = LIZLLL2;
            IFeedPanelPlatformAbility v35 = v3();
            if (v35 != null) {
                i2 = v35.getCurrentIndex();
            }
            c71082qe.LIZJ.LJIIIIZZ(((Aweme) ListProtector.get(LJJIL, i2)).getAid());
            H3(i2, LJJIL);
        }
    }

    public final boolean C3() {
        String str;
        C34L c34l;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c34l = c71082qe.LIZJ) != null) {
            str = c34l.LIZJ;
        } else {
            str = null;
        }
        if (o.LJ(str, "")) {
            return true;
        }
        return o.LJ(str, C56509MFt.LIZLLL(getPanelContext()));
    }

    public final void F3() {
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJJI).clear();
        this.LJLJJL = -1;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void La0() {
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        C70922qO.LIZ("CastingPanelComponent", "onOverlayDismiss");
        if (E3()) {
            C34L c34l = c71082qe.LIZJ;
            C34L.LIZJ(c34l, c34l.LJFF, false, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void a10() {
        C70922qO.LIZ("CastingPanelComponent", "onOverlayShow");
        x3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.34W, android.database.DataSetObserver] */
    public final void init() {
        MutableLiveData<ServiceInfo> mutableLiveData;
        AbstractC55082Lja abstractFeedAdapter;
        C779434c c779434c;
        MutableLiveData<ServiceInfo> mutableLiveData2;
        C71082qe c71082qe = C71042qa.LIZIZ;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new C2MJ() { // from class: X.34S
                @Override // X.C2MJ
                public final void J8(int i) {
                }

                @Override // X.C2MJ
                public final void e(int i, boolean z) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.C2MJ
                public final void Ye(C2MA selectedHolder) {
                    o.LJIIIZ(selectedHolder, "selectedHolder");
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageSelected(int i) {
                    String str;
                    C34L c34l;
                    C71082qe c71082qe2;
                    C71052qb c71052qb;
                    C34L c34l2;
                    int i2;
                    C34L c34l3;
                    C71082qe c71082qe3 = C71042qa.LIZIZ;
                    if (((ArrayList) CastingPanelComponent.this.LJLJI).size() > i) {
                        Aweme aweme = (Aweme) ListProtector.get(CastingPanelComponent.this.LJLJI, i);
                        String aid = aweme.getAid();
                        String str2 = null;
                        if (c71082qe3 != null && (c34l3 = c71082qe3.LIZJ) != null) {
                            str = c34l3.LIZ;
                        } else {
                            str = null;
                        }
                        if (!o.LJ(aid, str) || ((i2 = CastingPanelComponent.this.LJLJJL) != -1 && i2 != i)) {
                            CastingPanelComponent.this.LJLJJL = i;
                            boolean z = true;
                            if (C78688UuS.LJJJJJ(aweme)) {
                                String aid2 = aweme.getAid();
                                if (c71082qe3 != null && (c34l2 = c71082qe3.LIZJ) != null) {
                                    str2 = c34l2.LIZ;
                                }
                                if (!o.LJ(aid2, str2)) {
                                    if (c71082qe3 != null) {
                                        if (c71082qe3.LIZJ != null) {
                                            String aid3 = aweme.getAid();
                                            o.LJIIIIZZ(aid3, "currentAweme.aid");
                                            if (C34L.LIZLLL() && (c71082qe2 = C71042qa.LIZIZ) != null && (c71052qb = c71082qe2.LIZ) != null) {
                                                c71052qb.LJIIJ(aid3);
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    CastingPanelComponent.this.LJLJJL = -1;
                                    if (c71082qe3 == null) {
                                        return;
                                    }
                                }
                                C34L c34l4 = c71082qe3.LIZJ;
                                if (c34l4 != null) {
                                    if (i != ((ArrayList) CastingPanelComponent.this.LJLJI).size() - 1) {
                                        z = c71082qe3.LIZJ.LJFF;
                                    }
                                    C34L.LIZJ(c34l4, z, false, 6);
                                    return;
                                }
                                return;
                            }
                            if (c71082qe3 == null || (c34l = c71082qe3.LIZJ) == null) {
                                return;
                            }
                            C34L.LIZJ(c34l, true, false, 6);
                        }
                    }
                }
            });
        }
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && (mutableLiveData2 = c779434c.LJIIIIZZ) != null) {
            mutableLiveData2.observe(this, new AObserverS69S0100000_1(this, 15));
        }
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && (abstractFeedAdapter = v3.getAbstractFeedAdapter()) != 0) {
            ?? r0 = new DataSetObserver() { // from class: X.34W
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    CastingPanelComponent.this.LJLLJ.refresh();
                }
            };
            abstractFeedAdapter.LJIJ(r0);
            this.LJLLILLLL = r0;
        }
        this.LJLLJ.observe(this, new AObserverS69S0100000_1(this, 16));
        if (c71082qe != null) {
            C779434c c779434c2 = c71082qe.LIZIZ;
            if (c779434c2 != null && (mutableLiveData = c779434c2.LJIIIZ) != null) {
                mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 17));
            }
            C34L c34l = c71082qe.LIZJ;
            if (c34l != null) {
                c34l.LIZ(this);
            }
        }
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLJJLL.getValue();
    }

    public final void x3() {
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && E3()) {
            C70922qO.LIZ("CastingPanelComponent", "handlePause");
            C34L.LIZJ(c71082qe.LIZJ, true, false, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.34U] */
    public CastingPanelComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 45), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 0));
        }
        this.LJLJJLL = c62822Ol8;
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 46));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 44));
        this.LJLLI = new GHC() { // from class: X.34U
            @Override // X.GHC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C71082qe c71082qe;
                C71052qb c71052qb;
                C71082qe c71082qe2;
                C71052qb c71052qb2;
                C71082qe c71082qe3 = C71042qa.LIZIZ;
                if (c71082qe3 == null) {
                    return false;
                }
                if ((i != 25 && i != 24) || !CastingPanelComponent.this.E3() || c71082qe3.LIZIZ.LJIIJ()) {
                    return false;
                }
                if (i != 24) {
                    c71082qe3.LIZJ.getClass();
                    if (C34L.LIZLLL() && (c71082qe2 = C71042qa.LIZIZ) != null && (c71052qb2 = c71082qe2.LIZ) != null) {
                        c71052qb2.LJIILL();
                    }
                } else {
                    c71082qe3.LIZJ.getClass();
                    if (C34L.LIZLLL() && (c71082qe = C71042qa.LIZIZ) != null && (c71052qb = c71082qe.LIZ) != null) {
                        c71052qb.LIZ();
                    }
                }
                return true;
            }
        };
        this.LJLLJ = new CastingPanelComponent$isReadyToCast$1(this);
    }

    public final boolean E3() {
        C71082qe c71082qe;
        C779434c c779434c;
        if (!C3() || (c71082qe = C71042qa.LIZIZ) == null || (c779434c = c71082qe.LIZIZ) == null || !c779434c.LJIIIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (C212428Vi.LIZ(this) instanceof C34X) {
            InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
            o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((C34X) LIZ).registerActivityOnKeyDownListener(this.LJLLI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        AbstractC55082Lja abstractFeedAdapter;
        C34W c34w;
        super.onDestroy();
        C48841JEv.LIZJ((InterfaceC70422pa) this.LJLIL.getValue(), null);
        if (C212428Vi.LIZ(this) instanceof C34X) {
            InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
            o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((C34X) LIZ).unRegisterActivityOnKeyDownListener(this.LJLLI);
        }
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && (abstractFeedAdapter = v3.getAbstractFeedAdapter()) != null && (c34w = this.LJLLILLLL) != null) {
            abstractFeedAdapter.LJJII(c34w);
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (C71042qa.LIZIZ == null) {
            XKX.LIZLLL((InterfaceC70422pa) this.LJLIL.getValue(), C36636EZk.LIZ, null, new C71122qi(this, null), 2);
        } else {
            init();
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPause panel scene: ");
        LIZ.append(getPanelContext().LIZ);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        x3();
    }

    @Override // X.C8W0
    public final void onResume() {
        boolean z;
        super.onResume();
        String str = null;
        MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainPageBusinessAbility.class, null);
        if (mainPageBusinessAbility != null) {
            str = mainPageBusinessAbility.getEventType();
            z = mainPageBusinessAbility.WH();
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResume panel scene: ");
        LIZ.append(getPanelContext().LIZ);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onResume check handleResume currentMainFeed: ");
        LIZ2.append(z);
        LIZ2.append(", mainPageTopEventType: ");
        LIZ2.append(str);
        LIZ2.append(", panel eventType: ");
        LIZ2.append(C56509MFt.LIZLLL(getPanelContext()));
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ2));
        if (mainPageBusinessAbility == null || (z && o.LJ(str, C56509MFt.LIZLLL(getPanelContext())))) {
            A3();
        }
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void EX(List<Aweme> list) {
        C71052qb c71052qb;
        o.LJIIIZ(list, "list");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMoreResult: ");
        LIZ.append(list.size());
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        if (E3() && list.size() > ((ArrayList) this.LJLJI).size()) {
            Set LJZI = ORZ.LJZI(this.LJLJI, list);
            if (!LJZI.isEmpty()) {
                int indexOf = list.indexOf(ORZ.LJLLILLLL(LJZI));
                int indexOf2 = list.indexOf(ORZ.LLF(LJZI));
                List<Aweme> subList = list.subList(0, indexOf);
                List<Aweme> subList2 = list.subList(indexOf2, list.size());
                if (!subList.isEmpty()) {
                    C34L c34l = c71082qe.LIZJ;
                    c34l.getClass();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("addToPlaylistStart size: ");
                    LIZ2.append(subList.size());
                    C70922qO.LIZ("CastingPlayManager", X1D.LIZIZ(LIZ2));
                    if (C34L.LIZLLL()) {
                        C71082qe c71082qe2 = C71042qa.LIZIZ;
                        if (c71082qe2 != null && (c71052qb = c71082qe2.LIZ) != null) {
                            List<Aweme> currentPlayingList = c34l.LJIIJ;
                            o.LJIIIIZZ(currentPlayingList, "currentPlayingList");
                            String aid = ((Aweme) ORZ.LJLLJ(currentPlayingList)).getAid();
                            o.LJIIIIZZ(aid, "currentPlayingList.first().aid");
                            c71052qb.LIZIZ(aid, subList);
                        }
                        c34l.LJIIJ.addAll(0, subList);
                    }
                }
                if (!subList2.isEmpty()) {
                    c71082qe.LIZJ.LIZIZ(subList2);
                }
                C34L c34l2 = c71082qe.LIZJ;
                C34L.LIZJ(c34l2, c34l2.LJFF, false, 6);
            }
            ((ArrayList) this.LJLJI).clear();
            ((ArrayList) this.LJLJI).addAll(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void Ff0(Aweme aweme) {
        C71082qe c71082qe;
        C71052qb c71052qb;
        C71082qe c71082qe2;
        C71052qb c71052qb2;
        C71082qe c71082qe3 = C71042qa.LIZIZ;
        if (c71082qe3 != null && E3()) {
            if (c71082qe3.LIZJ.LJFF()) {
                c71082qe3.LIZJ.getClass();
                if (C34L.LIZLLL() && (c71082qe2 = C71042qa.LIZIZ) != null && (c71052qb2 = c71082qe2.LIZ) != null) {
                    c71052qb2.LJIIIIZZ();
                    return;
                }
                return;
            }
            c71082qe3.LIZJ.getClass();
            if (!C34L.LIZLLL() || (c71082qe = C71042qa.LIZIZ) == null || (c71052qb = c71082qe.LIZ) == null) {
                return;
            }
            c71052qb.LJIIJJI();
        }
    }

    @Override // X.C34M
    public final void LJIL(String aid) {
        o.LJIIIZ(aid, "aid");
        C1DH.LJJIJIIJI(new ARunnableS2S1100000_1(this, aid, 2));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPagePause(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPagePause panel scene: ");
        LIZ.append(getPanelContext().LIZ);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        super.onPagePause(i);
        x3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPageResume(int i) {
        super.onPageResume(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageResume panel scene: ");
        LIZ.append(getPanelContext().LIZ);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        A3();
    }

    @Override // X.C34M
    public final void v5(Aweme aweme) {
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        C70922qO.LIZ("CastingPanelComponent", "onInitPlay");
        DialogC111044Xk dialogC111044Xk = this.LJLJLLL;
        if (dialogC111044Xk != null && dialogC111044Xk.isShowing()) {
            C70922qO.LIZ("CastingPanelComponent", "dismiss loading");
            DialogC111044Xk dialogC111044Xk2 = this.LJLJLLL;
            if (dialogC111044Xk2 != null) {
                dialogC111044Xk2.dismiss();
            }
        }
        if (!((ArrayList) this.LJLJI).isEmpty()) {
            if (!C3()) {
                F3();
            } else {
                C34L c34l = c71082qe.LIZJ;
                C34L.LIZJ(c34l, c34l.LJFF, true, 4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void ER(int i, List list) {
        boolean z;
        o.LJIIIZ(list, "list");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshResult: ");
        LIZ.append(list.size());
        LIZ.append(", ");
        LIZ.append(i);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        if (i >= 0 && i < list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (c71082qe.LIZIZ.LJIIIZ() && (true ^ list.isEmpty()) && z) {
            C34L c34l = c71082qe.LIZJ;
            String LIZLLL = C56509MFt.LIZLLL(getPanelContext());
            c34l.getClass();
            c34l.LIZJ = LIZLLL;
            c71082qe.LIZJ.LJIIIIZZ(((Aweme) ListProtector.get(list, i)).getAid());
            H3(i, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H3(int r5, java.util.List r6) {
        /*
            r4 = this;
            X.2qe r2 = X.C71042qa.LIZIZ
            if (r2 != 0) goto L5
            return
        L5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r6.size()
            java.util.List r0 = r6.subList(r5, r0)
            r1.addAll(r0)
            r4.F3()
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r6)
            r3 = 0
            if (r5 <= 0) goto L34
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r4.LJLJJI
            java.util.List r0 = r6.subList(r3, r5)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
        L34:
            X.34L r2 = r2.LIZJ
            r2.getClass()
            X.2qe r1 = X.C71042qa.LIZIZ
            if (r1 != 0) goto L3e
        L3d:
            return
        L3e:
            boolean r0 = X.C34L.LIZLLL()
            if (r0 == 0) goto L3d
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L5c
        L5a:
            java.lang.String r0 = ""
        L5c:
            r2.LJI = r0
            r2.LJII = r3
            java.util.List r0 = X.ORZ.LLJILJILJ(r6)
            r2.LJIIJ = r0
            X.2qb r1 = r1.LIZ
            r1.getClass()
            X.34Z r0 = r1.LJII
            if (r0 != 0) goto L76
            X.34Z r0 = new X.34Z
            r0.<init>()
            r1.LJII = r0
        L76:
            X.34Z r2 = r1.LJII
            if (r2 == 0) goto L3d
            boolean r0 = r2.LJLLILLLL
            if (r0 == 0) goto L88
            java.lang.String r1 = r2.LJLJJI
            java.lang.String r0 = "cancel"
            X.C70922qO.LIZ(r1, r0)
            r2.LIZJ()
        L88:
            monitor-enter(r2)
            X.OSZ r0 = X.C34Z.LIZLLL(r5, r6)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto La6
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> Laf
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Throwable -> Laf
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Laf
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Laf
            r2.LJFF(r0, r1)     // Catch: java.lang.Throwable -> Laf
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto Lad
        La6:
            java.lang.String r1 = r2.LJLJJI     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "distilled playlist has no castable items. Returning"
            X.C70922qO.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Laf
        Lad:
            monitor-exit(r2)
            goto L3d
        Laf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent.H3(int, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingAbility
    public final void Bf0(int i, int i2, String str) {
        Object obj;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTrackingProgress: ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(str);
        C70922qO.LIZ("CastingPanelComponent", X1D.LIZIZ(LIZ));
        if (!E3()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            Aweme aweme = (Aweme) obj;
            if (str != null && o.LJ(aweme.getAid(), str)) {
                break;
            }
        }
        Aweme aweme2 = (Aweme) obj;
        if (aweme2 != null && aweme2.getVideo() != null) {
            c71082qe.LIZJ.LJII((i / i2) * aweme2.getVideo().getDuration());
        }
    }
}

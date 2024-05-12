package X;

import Y.AObserverS77S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import com.ss.android.ugc.aweme.relation.monitor.RecUserBehaviorMonImpl;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Mlj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57763Mlj extends FrameLayout implements InterfaceC54852Lfs {
    public static final /* synthetic */ int LJLJLLL = 0;
    public InterfaceC57760Mlg LJLIL;
    public final Handler LJLILLLLZI;
    public Fragment LJLJI;
    public C57767Mln LJLJJI;
    public FriendsEmptyPageRootVM LJLJJL;
    public AbstractC58014Mpm LJLJJLL;
    public Animator LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ;

    public final View LIZJ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static boolean LJ() {
        LIJ lij;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            return false;
        }
        InterfaceC36571c5 Ja = com.bytedance.hox.Hox.LJLLI.LIZ(LIZLLL).Ja("FRIENDS_FEED");
        if (!(Ja instanceof LIJ) || (lij = (LIJ) Ja) == null) {
            return false;
        }
        return lij.hasMore();
    }

    @Override // X.InterfaceC54852Lfs
    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unbind, mode:");
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = this.LJLJJL;
        if (friendsEmptyPageRootVM != null) {
            LIZ.append(friendsEmptyPageRootVM.LJLJI);
            X1D.LIZIZ(LIZ);
            FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LJLJJL;
            if (friendsEmptyPageRootVM2 != null) {
                if (friendsEmptyPageRootVM2.LJLJI == EnumC54550Lb0.LAST_ITEM) {
                    InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
                    if (interfaceC57760Mlg != null) {
                        interfaceC57760Mlg.k0();
                    }
                    FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LJLJJL;
                    if (friendsEmptyPageRootVM3 != null) {
                        FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM3.LJLILLLLZI;
                        if (friendsEmptyPageMainSectionVM != null) {
                            friendsEmptyPageMainSectionVM.LJLJL.postValue(new C54490La2(false, null));
                            return;
                        }
                        return;
                    }
                    o.LJIJI("emptyPageRootVM");
                    throw null;
                }
                return;
            }
            o.LJIJI("emptyPageRootVM");
            throw null;
        }
        o.LJIJI("emptyPageRootVM");
        throw null;
    }

    @Override // X.InterfaceC54852Lfs
    public final void onBind() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBind, mode:");
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = this.LJLJJL;
        if (friendsEmptyPageRootVM != null) {
            LIZ.append(friendsEmptyPageRootVM.LJLJI);
            X1D.LIZIZ(LIZ);
            FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LJLJJL;
            if (friendsEmptyPageRootVM2 != null) {
                if (friendsEmptyPageRootVM2.LJLJI == EnumC54550Lb0.LAST_ITEM) {
                    InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
                    if (interfaceC57760Mlg != null) {
                        interfaceC57760Mlg.xk0("FRIENDS_FEED");
                    }
                    InterfaceC57760Mlg interfaceC57760Mlg2 = this.LJLIL;
                    if (interfaceC57760Mlg2 != null) {
                        FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LJLJJL;
                        if (friendsEmptyPageRootVM3 != null) {
                            interfaceC57760Mlg2.d80(String.valueOf(friendsEmptyPageRootVM3.LJLJI.getValue()));
                        } else {
                            o.LJIJI("emptyPageRootVM");
                            throw null;
                        }
                    }
                    FriendsEmptyPageRootVM friendsEmptyPageRootVM4 = this.LJLJJL;
                    if (friendsEmptyPageRootVM4 != null) {
                        C54503LaF c54503LaF = new C54503LaF(friendsEmptyPageRootVM4.LJLJI);
                        friendsEmptyPageRootVM4.gv0();
                        FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM4.LJLILLLLZI;
                        if (friendsEmptyPageMainSectionVM != null) {
                            friendsEmptyPageMainSectionVM.LJLJL.postValue(new C54490La2(true, c54503LaF));
                        }
                        C54024LIe.LIZLLL(0, LJ());
                        return;
                    }
                    o.LJIJI("emptyPageRootVM");
                    throw null;
                }
                return;
            }
            o.LJIJI("emptyPageRootVM");
            throw null;
        }
        o.LJIJI("emptyPageRootVM");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57763Mlj(Context context) {
        super(context, null, 0);
        View LIZJ;
        this.LJLJLJ = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
        LFQ.LIZIZ(new LIM(this));
        C54502LaE.LIZ("friends_tab_empty");
        C16880lQ.LLLZIIL(R.layout.ayq, C16880lQ.LLZIL(context), this);
        if (C61447O9r.LJIIIZ && (LIZJ = LIZJ(R.id.cvk)) != null) {
            AAI.LIZIZ(AAI.LIZ(47), LIZJ);
        }
        float LJJJJLI = C63081OpJ.LJJJJLI(context);
        View LIZJ2 = LIZJ(R.id.cvk);
        if (LIZJ2 != null) {
            AAI.LIZLLL(AAI.LIZ(56) + ((int) ((LJJJJLI / EF7.LIZIZ().getResources().getDisplayMetrics().density) + 0.5f)), LIZJ2);
        }
    }

    private final void setBottomMargin(AbstractC225698tR abstractC225698tR) {
        int i;
        if (o.LJ(abstractC225698tR, C225688tQ.LIZ)) {
            i = C7MY.LIZIZ(58);
        } else if (o.LJ(abstractC225698tR, C225708tS.LIZ)) {
            i = 0;
        } else {
            throw new C162476Zf();
        }
        View LIZJ = LIZJ(R.id.cvk);
        if (LIZJ != null) {
            AAI.LIZIZ(i, LIZJ);
        }
    }

    public final void LIZLLL(AbstractC225698tR abstractC225698tR) {
        C57117MbJ c57117MbJ = (C57117MbJ) LIZJ(R.id.cvk);
        if (c57117MbJ != null && c57117MbJ.LLLFF == EnumC54550Lb0.EMPTY_STATE) {
            setBottomMargin(abstractC225698tR);
        }
    }

    public final void setPageLoading(boolean z) {
        Animator animator = this.LJLJL;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            View loading_view = LIZJ(R.id.g94);
            o.LJIIIIZZ(loading_view, "loading_view");
            if (loading_view.getVisibility() == 0) {
                return;
            }
            ((C223338pd) LIZJ(R.id.g94)).LIZIZ();
            C223338pd loading_view2 = (C223338pd) LIZJ(R.id.g94);
            o.LJIIIIZZ(loading_view2, "loading_view");
            loading_view2.setVisibility(0);
            return;
        }
        View loading_view3 = LIZJ(R.id.g94);
        o.LJIIIIZZ(loading_view3, "loading_view");
        if (loading_view3.getVisibility() != 0) {
            return;
        }
        ((C223338pd) LIZJ(R.id.g94)).LIZJ();
        C223338pd loading_view4 = (C223338pd) LIZJ(R.id.g94);
        o.LJIIIIZZ(loading_view4, "loading_view");
        loading_view4.setVisibility(8);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 22));
        ofFloat.addListener(new IDAListenerS77S0100000_9(this, 11));
        ofFloat.start();
        this.LJLJL = ofFloat;
    }

    @Override // X.InterfaceC54852Lfs
    public final void LIZ(Fragment fragment, EnumC54550Lb0 mode) {
        Object LIZJ;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(mode, "mode");
        IRecUserMonManager LJ = C57738MlK.LIZIZ.LJ();
        Lifecycle lifecycle = fragment.getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        RecUserBehaviorMonImpl Pz = LJ.Pz(lifecycle, new C57819Mmd("homepage_friends", null, null, null, false, null, 8190), -1);
        this.LJLIL = Pz;
        EnumC54550Lb0 enumC54550Lb0 = EnumC54550Lb0.EMPTY_STATE;
        if (mode == enumC54550Lb0) {
            if (Pz != null) {
                Pz.xk0("FRIENDS_FEED");
            }
            InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
            if (interfaceC57760Mlg != null) {
                interfaceC57760Mlg.d80(String.valueOf(mode.getValue()));
            }
        }
        this.LJLJI = fragment;
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = (FriendsEmptyPageRootVM) ViewModelProviders.of(fragment).get(FriendsEmptyPageRootVM.class);
        this.LJLJJL = friendsEmptyPageRootVM;
        if (friendsEmptyPageRootVM != null) {
            friendsEmptyPageRootVM.LJLJI = mode;
            if (mode == enumC54550Lb0) {
                View LIZJ2 = LIZJ(R.id.cvk);
                if (LIZJ2 != null) {
                    AAI.LIZLLL(AAI.LIZ(88), LIZJ2);
                }
                setBottomMargin(LLR.LIZJ.LIZ);
                C54024LIe.LIZLLL(1, LJ());
            }
            C57117MbJ c57117MbJ = (C57117MbJ) LIZJ(R.id.cvk);
            if (c57117MbJ != null) {
                c57117MbJ.setMode(mode);
            }
            FriendsEmptyPageRootVM friendsEmptyPageRootVM2 = this.LJLJJL;
            if (friendsEmptyPageRootVM2 != null) {
                this.LJLJJI = new C57767Mln(friendsEmptyPageRootVM2.LJLJI);
                SYL powerList = (SYL) LIZJ(R.id.cvk);
                if (powerList != null) {
                    C57767Mln c57767Mln = this.LJLJJI;
                    if (c57767Mln != null) {
                        powerList.LLLF.LLD(c57767Mln);
                    } else {
                        o.LJIJI("friendsEmptyPageMainChunk");
                        throw null;
                    }
                }
                if (this.LJLJJL != null) {
                    Fragment fragment2 = this.LJLJI;
                    if (fragment2 != null) {
                        C57858MnG c57858MnG = new C57858MnG(null, fragment2, 1);
                        c57858MnG.LIZJ(C25777A9t.LJLIL);
                        c57858MnG.LIZ(C57874MnW.LJLIL);
                        c57858MnG.LIZLLL(new AqS170S0100000_4(fragment2, 1050));
                        c57858MnG.LIZIZ(C57843Mn1.LJLIL);
                        IRelationUserCardInternalService.LIZ.getClass();
                        IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
                        C57867MnP c57867MnP = c57858MnG.LIZLLL;
                        if (c57867MnP.LIZLLL == -1) {
                            int i = c57858MnG.LJFF.LIZJ - 10;
                            if (i < 5) {
                                i = 5;
                            }
                            c57867MnP.LIZLLL = i;
                        }
                        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
                        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
                            C57866MnO c57866MnO = c57858MnG.LJFF;
                            if (c57866MnO.LJIILJJIL == null) {
                                c57866MnO.LJIILJJIL = Boolean.TRUE;
                            }
                        }
                        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
                        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
                        if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
                            LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
                        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
                            LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
                        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
                            LIZJ = LIZ.LIZ(c57859MnH);
                        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
                            LIZJ = LIZ.LIZJ(c57859MnH);
                        } else {
                            "type is error!".toString();
                            throw new IllegalStateException("type is error!");
                        }
                        if (LIZJ != null) {
                            AbstractC58014Mpm abstractC58014Mpm = (AbstractC58014Mpm) LIZJ;
                            ((C57934MoU) abstractC58014Mpm).LJIILL(null);
                            o.LJIIIIZZ(powerList, "powerList");
                            C57934MoU c57934MoU = (C57934MoU) abstractC58014Mpm;
                            c57934MoU.LJLJJLL.LJIJJLI(powerList);
                            powerList.LLLF.LLD(abstractC58014Mpm);
                            powerList.setItemAnimator(c57934MoU.getItemAnimator());
                            c57934MoU.W7(new C57156Mbw(this));
                            InterfaceC57760Mlg interfaceC57760Mlg2 = this.LJLIL;
                            if (interfaceC57760Mlg2 != null) {
                                c57934MoU.W7(interfaceC57760Mlg2);
                            }
                            c57934MoU.LJLJLJ(false);
                            this.LJLJJLL = abstractC58014Mpm;
                            C26338AVi.LJIIIZ(powerList, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(114))), 23);
                            powerList.setClipToPadding(false);
                            FriendsEmptyPageRootVM friendsEmptyPageRootVM3 = this.LJLJJL;
                            if (friendsEmptyPageRootVM3 != null) {
                                MutableLiveData mutableLiveData = friendsEmptyPageRootVM3.LJLJJLL;
                                Fragment fragment3 = this.LJLJI;
                                if (fragment3 != null) {
                                    mutableLiveData.observe(fragment3, new AObserverS77S0100000_9(this, 66));
                                    return;
                                } else {
                                    o.LJIJI("fragment");
                                    throw null;
                                }
                            }
                            o.LJIJI("emptyPageRootVM");
                            throw null;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
                    }
                    o.LJIJI("fragment");
                    throw null;
                }
                o.LJIJI("emptyPageRootVM");
                throw null;
            }
            o.LJIJI("emptyPageRootVM");
            throw null;
        }
        o.LJIJI("emptyPageRootVM");
        throw null;
    }
}

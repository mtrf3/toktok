package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder;

import X.AJ9;
import X.AVS;
import X.AbstractC82843My;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.AnonymousClass304;
import X.C025908h;
import X.C09G;
import X.C1040846q;
import X.C1041346v;
import X.C107724Kq;
import X.C113554cx;
import X.C119354mJ;
import X.C16880lQ;
import X.C17N;
import X.C1DG;
import X.C2068389v;
import X.C221108m2;
import X.C226668v0;
import X.C32151Nz;
import X.C32O;
import X.C34B;
import X.C39R;
import X.C3E6;
import X.C3L2;
import X.C3L3;
import X.C3L4;
import X.C3L5;
import X.C3LK;
import X.C3ML;
import X.C3MY;
import X.C3Q9;
import X.C3TD;
import X.C3TE;
import X.C3TI;
import X.C3TV;
import X.C3TW;
import X.C3U2;
import X.C3U3;
import X.C3U6;
import X.C3X3;
import X.C43659HBn;
import X.C43J;
import X.C47959Irz;
import X.C48841JEv;
import X.C4WC;
import X.C53691L5j;
import X.C55888Lwa;
import X.C57396Mfo;
import X.C57434MgQ;
import X.C5H3;
import X.C62822Ol8;
import X.C75382xa;
import X.C75522xo;
import X.C75782yE;
import X.C76662ze;
import X.C772831o;
import X.C784135x;
import X.C78613UtF;
import X.C78939UyV;
import X.C78949Uyf;
import X.C78966Uyw;
import X.C78996UzQ;
import X.C79045V0n;
import X.C80533Eb;
import X.C81273Gx;
import X.C82223Ko;
import X.C82473Ln;
import X.C82483Lo;
import X.C82493Lp;
import X.C84673Tz;
import X.C85323Wm;
import X.C85353Wp;
import X.C87687YbD;
import X.C89263es;
import X.C96533qb;
import X.C96573qf;
import X.C96593qh;
import X.C96603qi;
import X.C96673qp;
import X.C96683qq;
import X.C96803r2;
import X.C96813r3;
import X.C96913rD;
import X.C97343ru;
import X.C98693u5;
import X.C99033ud;
import X.EnumC112364b2;
import X.EnumC112694bZ;
import X.EnumC221088m0;
import X.EnumC53695L5n;
import X.EnumC62195Ob1;
import X.EnumC96103pu;
import X.EnumC96553qd;
import X.InterfaceC100393wp;
import X.InterfaceC1040946r;
import X.InterfaceC57447Mgd;
import X.InterfaceC83713Qh;
import X.InterfaceC96843r6;
import X.InterfaceC98683u4;
import X.MMN;
import X.O6R;
import X.OSZ;
import X.QD3;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XKX;
import Y.ACListenerS11S1300000_1;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDCListenerS108S0200000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class SessionListViewHolder extends C96803r2 implements GenericLifecycleObserver, C3X3, MMN, Observer, DefaultLifecycleObserver, InterfaceC98683u4 {
    public final InterfaceC83713Qh LJLIL;
    public final C53691L5j LJLILLLLZI;
    public final SmartAvatarImageView LJLJI;
    public FrameLayout LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final AppCompatTextView LJLJL;
    public final AVS LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final TuxIconView LJLL;
    public final TuxIconView LJLLI;
    public final ViewGroup LJLLILLLL;
    public final ViewGroup LJLLJ;
    public final View LJLLL;
    public final AVS LJLLLL;
    public final ViewGroup LJLLLLLL;
    public C119354mJ LJLZ;
    public final RelationButton LJZ;
    public final TuxTextView LJZI;
    public final ImageView LJZL;
    public final TuxIconView LL;
    public final TuxIconView LLD;
    public int LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public String LLFII;
    public C3L4 LLFZ;
    public final C5H3 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public ActivityC45651qj LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public C96533qb LLIIIL;
    public InterfaceC96843r6 LLIIIZ;
    public int LLIIJI;
    public boolean LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C107724Kq LLIILZL;
    public final C62822Ol8 LLIIZ;
    public CharSequence LLIL;
    public CharSequence LLILII;
    public boolean LLILIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    private final InterfaceC1040946r Y() {
        return (InterfaceC1040946r) this.LLIIZ.getValue();
    }

    public final boolean L() {
        RelationButton relationButton = this.LJZ;
        if (relationButton != null && relationButton.getVisibility() == 0) {
            return true;
        }
        TuxTextView tuxTextView = this.LJZI;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            return true;
        }
        AVS avs = this.LJLJLJ;
        if (avs != null && avs.getVisibility() == 0) {
            return true;
        }
        if (!V()) {
            TuxIconView tuxIconView = this.LJLLI;
            if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                return true;
            }
            TuxIconView tuxIconView2 = this.LJLL;
            if (tuxIconView2 != null && tuxIconView2.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC98683u4
    public final void LJIL() {
        AppCompatTextView appCompatTextView;
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZIZ() && ((String) this.LLIL).length() > 0) {
            this.LLIL = "";
            TuxTextView tuxTextView = this.LJLJJLL;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LLILII);
            }
            if (V() && (appCompatTextView = this.LJLJL) != null) {
                C17N.LJJLIIIJJI(appCompatTextView);
            }
            C3L4 c3l4 = this.LLFZ;
            if (c3l4 != null) {
                l0(c3l4);
            }
        }
    }

    @Override // X.InterfaceC98683u4
    public final boolean LJLIIIL() {
        if (this.LLIL.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC98683u4
    public final void LLFII() {
        CharSequence charSequence;
        String LJFF;
        AppCompatTextView appCompatTextView;
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZIZ() && ((String) this.LLIL).length() == 0) {
            Context context = this.itemView.getContext();
            String str = null;
            if (context != null) {
                str = context.getString(R.string.ev6);
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            this.LLIL = str;
            TuxTextView tuxTextView = this.LJLJJLL;
            if (tuxTextView == null || (charSequence = tuxTextView.getText()) == null) {
                charSequence = "";
            }
            this.LLILII = charSequence;
            TuxTextView tuxTextView2 = this.LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.LLIL);
            }
            if (V() && (appCompatTextView = this.LJLJL) != null && appCompatTextView.getVisibility() != 4) {
                appCompatTextView.setVisibility(4);
            }
            C3L4 c3l4 = this.LLFZ;
            if (c3l4 != null) {
                l0(c3l4);
            }
            C3L4 c3l42 = this.LLFZ;
            if (c3l42 != null && (LJFF = c3l42.LJFF()) != null) {
                str2 = LJFF;
            }
            C32O.LIZ(2, str2);
        }
    }

    public final boolean V() {
        return ((Boolean) this.LLIFFJFJJ.getValue()).booleanValue();
    }

    public final int X() {
        return ((Number) this.LLFF.getValue()).intValue();
    }

    public final InterfaceC100393wp a0() {
        return (InterfaceC100393wp) this.LLIIL.getValue();
    }

    public final InboxSocPubStatusViewModelImpl c0() {
        return (InboxSocPubStatusViewModelImpl) this.LLIIIJ.getValue();
    }

    public final ActivityC45651qj getActivity() {
        ActivityC45651qj activityC45651qj = this.LLIIIILZ;
        if (activityC45651qj == null) {
            ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
            this.LLIIIILZ = LJ;
            return LJ;
        }
        return activityC45651qj;
    }

    @Override // X.InterfaceC98683u4
    public final String getSessionId() {
        C3L4 c3l4 = this.LLFZ;
        if (c3l4 != null) {
            return c3l4.LJFF();
        }
        return null;
    }

    public final void h0() {
        if (this.LJLJI == null) {
            return;
        }
        W5F LJ = W5U.LJ(R.raw.icon_color_default_avatar);
        LJ.LJJIIJ = this.LJLJI;
        C16880lQ.LLJJJ(LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() {
        /*
            r9 = this;
            X.3L4 r4 = r9.LLFZ
            if (r4 == 0) goto L84
            X.3Ma r0 = r4.LJLJJLL
            java.lang.String r0 = r0.LJLIL
            int r0 = r0.length()
            r7 = 0
            if (r0 <= 0) goto Ldd
            r8 = 1
        L10:
            int r1 = r4.LJLJLLL
            r0 = 15
            if (r1 != r0) goto Lda
            r6 = 1
        L17:
            int r0 = r4.LJIIIIZZ()
            r3 = 2
            if (r0 != r3) goto Ld7
            r5 = 1
        L1f:
            boolean r0 = r4 instanceof X.C3L3
            r1 = 0
            if (r0 == 0) goto L2d
            r0 = r4
            X.3L3 r0 = (X.C3L3) r0
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r0.LJIJI()
        L2d:
            boolean r0 = p0(r1, r4)
            X.34K r2 = new X.34K
            r2.<init>()
            if (r5 != 0) goto L3a
            if (r0 == 0) goto Lb4
        L3a:
            r0 = 0
        L3b:
            r2.element = r0
            X.3Ko r1 = X.C99033ud.Companion
            java.lang.String r0 = r9.getSessionId()
            r1.getClass()
            boolean r0 = X.C82223Ko.LIZ(r0)
            if (r0 == 0) goto L5b
            X.3To r0 = X.C96963rI.LIZLLL()
            r0.getClass()
            boolean r0 = X.C84563To.LIZIZ()
            if (r0 != 0) goto L5b
            r2.element = r7
        L5b:
            androidx.appcompat.widget.AppCompatTextView r6 = r9.LJLJL
            if (r6 == 0) goto L84
            boolean r0 = r2.element
            if (r0 == 0) goto Lb1
            r0 = 0
        L64:
            r6.setVisibility(r0)
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L84
            boolean r0 = r9.V()
            if (r0 == 0) goto L85
            android.view.View r0 = r9.itemView
            android.content.Context r2 = r0.getContext()
            long r0 = r4.LJI()
            java.lang.String r0 = X.C57105Mb7.LIZLLL(r0, r2)
        L81:
            r6.setText(r0)
        L84:
            return
        L85:
            X.T5R r5 = new X.T5R
            long r1 = r4.LJI()
            r0 = 6
            java.lang.String r0 = X.C86036Xpg.LJ(r1, r7, r0)
            r5.<init>(r0)
            X.3qb r0 = r9.LLIIIL
            if (r0 == 0) goto Lae
            int r0 = r0.LJIIJJI
        L9a:
            r5.LIZ(r0)
            long r1 = r4.LJI()
            java.lang.String r0 = r4.LJFF()
            boolean r0 = X.C82223Ko.LIZ(r0)
            java.lang.String r0 = X.C86036Xpg.LJ(r1, r0, r3)
            goto L81
        Lae:
            r0 = 61
            goto L9a
        Lb1:
            r0 = 8
            goto L64
        Lb4:
            if (r6 == 0) goto Lcc
            java.lang.String r1 = r9.LLFII
            if (r1 == 0) goto L3a
            com.bytedance.keva.Keva r0 = X.C89263es.LIZ()
            boolean r0 = X.C89263es.LIZJ(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            goto L3b
        Lcc:
            if (r8 == 0) goto Ld4
            boolean r0 = r9.V()
            if (r0 != 0) goto L3a
        Ld4:
            r0 = 1
            goto L3b
        Ld7:
            r5 = 0
            goto L1f
        Lda:
            r6 = 0
            goto L17
        Ldd:
            r8 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder.m0():void");
    }

    public final void n0() {
        RelationButton relationButton = this.LJZ;
        if (relationButton != null) {
            relationButton.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJZI;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public final void N() {
        TuxTextView tuxTextView;
        boolean z;
        C3L3 c3l3;
        IMUser LJIJI;
        String uid;
        InboxSocPubStatusViewModelImpl c0;
        Set<String> set;
        C53691L5j c53691L5j;
        EnumC53695L5n mode;
        Map<String, EnumC53695L5n> map;
        Set<String> set2;
        ActivityC45651qj activity;
        SessionListReadStatusViewModel sessionListReadStatusViewModel;
        Lifecycle lifecycle;
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        ActivityC45651qj activity2 = getActivity();
        if (activity2 != null && (lifecycle = activity2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C3L4 c3l4 = this.LLFZ;
        if (c3l4 == null) {
            return;
        }
        int LJIIIIZZ = c3l4.LJIIIIZZ();
        EnumC53695L5n enumC53695L5n = null;
        if (LJIIIIZZ != 0) {
            if (LJIIIIZZ != 1) {
                if (LJIIIIZZ != 2) {
                    if (LJIIIIZZ == 20) {
                        C3TV.LJFF(C3TV.LIZ, c3l4);
                    }
                } else {
                    C3TV c3tv = C3TV.LIZ;
                    C85323Wm onEventV3 = C772831o.LIZ();
                    c3tv.getClass();
                    o.LJIIIZ(onEventV3, "onEventV3");
                    Map<String, Set<C3TW>> map2 = C3TV.LIZIZ;
                    Set<C3TW> set3 = (Set) ((LinkedHashMap) map2).get(c3l4.LJFF());
                    if (set3 == null) {
                        set3 = new LinkedHashSet<>();
                        String LJFF = c3l4.LJFF();
                        o.LJIIIIZZ(LJFF, "baseSession.sessionID");
                        map2.put(LJFF, set3);
                    }
                    if (c3l4 instanceof C3L2) {
                        C3TW c3tw = C3TW.CHAT_SHOW;
                        if (!set3.contains(c3tw)) {
                            set3.add(c3tw);
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75522xo(onEventV3, null), 3);
                        }
                    }
                }
            } else {
                C3TV c3tv2 = C3TV.LIZ;
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C4WC c4wc = C4WC.LIZIZ;
                C85323Wm onEventV32 = C772831o.LIZ();
                c3tv2.getClass();
                o.LJIIIZ(onEventV32, "onEventV3");
                if ((c3l4 instanceof C3LK) && c3l4.LJFF() != null) {
                    Set<String> set4 = C3TV.LIZJ;
                    if (!set4.contains(c3l4.LJFF())) {
                        String LJFF2 = c3l4.LJFF();
                        o.LJIIIIZZ(LJFF2, "baseSession.sessionID");
                        set4.add(LJFF2);
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C784135x(c3l4, c4wc, onEventV32, null), 3);
                    }
                }
            }
        } else {
            C3TV c3tv3 = C3TV.LIZ;
            RelationButton relationButton = this.LJZ;
            if ((relationButton == null || relationButton.getVisibility() != 0) && (tuxTextView = this.LJZI) != null && tuxTextView.getVisibility() == 0) {
            }
            TuxIconView tuxIconView = this.LLD;
            if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            C3TV.LJI(c3tv3, c3l4, z, this.LLF);
            C78949Uyf.LJJJI(c3l4, this.LLIILZL);
        }
        if (C43J.LIZLLL() && (activity = getActivity()) != null && (sessionListReadStatusViewModel = (SessionListReadStatusViewModel) this.LLI.getValue()) != null) {
            sessionListReadStatusViewModel.gv0().observe(activity, this, false);
        }
        if ((c3l4 instanceof C3L3) && (c3l3 = (C3L3) c3l4) != null && (LJIJI = c3l3.LJIJI()) != null && (uid = LJIJI.getUid()) != null && (c0 = c0()) != null && (set = c0.LJLJJL) != null && !set.contains(uid)) {
            C53691L5j c53691L5j2 = this.LJLILLLLZI;
            if (c53691L5j2 != null) {
                enumC53695L5n = c53691L5j2.getMode();
            }
            if (enumC53695L5n != EnumC53695L5n.NONE && (c53691L5j = this.LJLILLLLZI) != null && (mode = c53691L5j.getMode()) != null) {
                InterfaceC100393wp a0 = a0();
                if (a0 != null) {
                    a0.LJFF(mode);
                }
                InboxSocPubStatusViewModelImpl c02 = c0();
                if (c02 != null && (set2 = c02.LJLJJL) != null) {
                    set2.add(uid);
                }
                InboxSocPubStatusViewModelImpl c03 = c0();
                if (c03 != null && (map = c03.LJLJJI) != null) {
                    map.put(uid, mode);
                }
            }
        }
    }

    public final void U() {
        Lifecycle lifecycle;
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
        SessionListReadStatusViewModel sessionListReadStatusViewModel = (SessionListReadStatusViewModel) this.LLI.getValue();
        if (sessionListReadStatusViewModel != null) {
            sessionListReadStatusViewModel.gv0().removeObserver(this);
        }
        ActivityC45651qj activity = getActivity();
        if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        InterfaceC1040946r Y2 = Y();
        if (Y2 != null) {
            Y2.LIZIZ();
        }
    }

    @Override // X.MMN
    public final void onAttach() {
        N();
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZIZ()) {
            C98693u5.LIZ(this);
        }
        this.LLILIL = true;
    }

    @Override // X.MMN
    public final void onDetach() {
        U();
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZIZ()) {
            CopyOnWriteArrayList<InterfaceC98683u4> copyOnWriteArrayList = C98693u5.LJ;
            if (copyOnWriteArrayList.contains(this)) {
                copyOnWriteArrayList.remove(this);
            }
        }
        this.LLILIL = false;
    }

    private final void Q(boolean z) {
        View findViewById;
        ConstraintLayout constraintLayout;
        View view = this.itemView;
        if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJI(R.id.fgj, 6);
            anonymousClass064.LJIIIIZZ(R.id.fgj, 3, R.id.jqa, 3);
            anonymousClass064.LJIIIIZZ(R.id.fgj, 4, R.id.jqa, 4);
            if (z) {
                anonymousClass064.LJIIIIZZ(R.id.la4, 7, R.id.n3m, 6);
                anonymousClass064.LJIIIIZZ(R.id.btt, 7, R.id.n3m, 6);
            } else {
                anonymousClass064.LJI(R.id.la4, 7);
                anonymousClass064.LJIIIIZZ(R.id.la4, 7, R.id.fgj, 6);
            }
            anonymousClass064.LIZIZ(constraintLayout);
        }
        View view2 = this.itemView;
        if ((view2 instanceof LinearLayout) && view2 != null && (findViewById = view2.findViewById(R.id.l8e)) != null) {
            C97343ru.LIZJ(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))), null, 13);
        }
    }

    @Override // X.C3X3
    public final void LLL(C96533qb c96533qb) {
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        if (this.LLIIIL == c96533qb) {
            return;
        }
        this.LLIIIL = c96533qb;
        if (c96533qb.LIZIZ != -1) {
            SmartAvatarImageView smartAvatarImageView = this.LJLJI;
            o.LJI(smartAvatarImageView);
            ViewGroup.LayoutParams layoutParams = smartAvatarImageView.getLayoutParams();
            int i = c96533qb.LIZIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            int LIZJ = C47959Irz.LIZJ(8, i);
            C53691L5j c53691L5j = this.LJLILLLLZI;
            if (c53691L5j != null) {
                g0.LJJIJIIJI(LIZJ, LIZJ, c53691L5j);
            }
        }
        int i2 = c96533qb.LJ;
        if (i2 != -1 && (tuxTextView4 = this.LJLJJL) != null) {
            tuxTextView4.setTuxFont(i2);
        }
        int i3 = c96533qb.LJFF;
        if (i3 != -1 && (tuxTextView3 = this.LJLJJL) != null) {
            tuxTextView3.LJJJ(i3);
        }
        int i4 = c96533qb.LJI;
        if (i4 != -1 && (tuxTextView2 = this.LJLJJLL) != null) {
            tuxTextView2.setTuxFont(i4);
        }
        int i5 = c96533qb.LJIIIIZZ;
        if (i5 != -1 && (tuxTextView = this.LJLJJLL) != null) {
            tuxTextView.setTextColor(i5);
        }
        if (c96533qb.LJIIJ != -1 && (viewGroup = this.LJLLLLLL) != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup viewGroup2 = this.LJLLLLLL;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (viewGroup2 != null) {
                layoutParams2 = viewGroup2.getLayoutParams();
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = c96533qb.LJIIJ;
            }
        }
        if (c96533qb.LJIIJJI != -1 && (this.LJLJL instanceof TuxTextView) && !((Boolean) this.LLII.getValue()).booleanValue()) {
            AppCompatTextView appCompatTextView = this.LJLJL;
            o.LJII(appCompatTextView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TuxTextView) appCompatTextView).setTuxFont(c96533qb.LJIIJJI);
        }
    }

    public final void i0(ConcurrentHashMap<String, EnumC96553qd> concurrentHashMap) {
        C3L5 c3l5;
        C3L4 c3l4 = this.LLFZ;
        if ((c3l4 instanceof C3L5) && (c3l5 = (C3L5) c3l4) != null && concurrentHashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, EnumC96553qd> entry : concurrentHashMap.entrySet()) {
                if (o.LJ(c3l5.LJFF(), entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                if (entry2.getValue() == EnumC96553qd.SEEN) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onSessionReadStatusChanged -> name: ");
                    LIZ.append(c3l5.LJ());
                    LIZ.append("status: ");
                    LIZ.append(entry2.getValue());
                    C34B.LIZIZ("MessageStatus-setMsgStatus", X1D.LIZIZ(LIZ));
                    c3l5.LLII = (EnumC96553qd) entry2.getValue();
                    l0(c3l5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(X.C3L4 r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder.l0(X.3L4):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r0 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(X.C3L4 r7) {
        /*
            r6 = this;
            X.3Ma r0 = r7.LJLJJLL
            java.lang.String r0 = r0.LJLIL
            int r0 = r0.length()
            if (r0 <= 0) goto L8a
            X.3Ma r0 = r7.LJLJJLL
            java.lang.String r0 = r0.LJLIL
        Le:
            X.4i4 r5 = new X.4i4
            r5.<init>()
            r5.LIZIZ(r0)
            java.lang.CharSequence r0 = r6.LLIL
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L88
            r0 = 1
        L21:
            r3 = 0
            r4 = 15
            if (r0 == 0) goto L5d
            com.bytedance.tux.input.TuxTextView r1 = r6.LJLJJLL
            if (r1 != 0) goto L57
        L2a:
            X.4i3 r0 = r5.LIZ
            r6.LLILII = r0
        L2e:
            boolean r0 = r7.LJZI
            if (r0 == 0) goto L37
            com.bytedance.tux.input.TuxTextView r0 = r6.LJLJJLL
            X.C118824lS.LIZJ(r0, r3)
        L37:
            int r0 = r7.LJLJLLL
            if (r0 == r4) goto L97
            com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r0 = r6.LJZ
            if (r0 == 0) goto L4c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L4c
        L45:
            boolean r0 = p0(r3, r7)
            if (r0 == 0) goto L94
            return
        L4c:
            com.bytedance.tux.input.TuxTextView r0 = r6.LJZI
            if (r0 == 0) goto L97
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L97
            goto L45
        L57:
            java.lang.CharSequence r0 = r6.LLIL
            r1.setText(r0)
            goto L2a
        L5d:
            com.bytedance.tux.input.TuxTextView r2 = r6.LJLJJLL
            if (r2 != 0) goto L62
            goto L2e
        L62:
            boolean r0 = p0(r3, r7)
            if (r0 == 0) goto L85
            int r0 = r7.LJLJLLL
            if (r0 == r4) goto L7b
            android.content.Context r1 = X.C97343ru.LIZ
            r0 = 2131828107(0x7f111d8b, float:1.9289146E38)
            java.lang.String r0 = r1.getString(r0)
        L75:
            if (r0 == 0) goto L85
        L77:
            r2.setText(r0)
            goto L2e
        L7b:
            android.content.Context r1 = X.C97343ru.LIZ
            r0 = 2131828108(0x7f111d8c, float:1.9289148E38)
            java.lang.String r0 = r1.getString(r0)
            goto L75
        L85:
            X.4i3 r0 = r5.LIZ
            goto L77
        L88:
            r0 = 0
            goto L21
        L8a:
            java.lang.CharSequence r0 = r7.LIZLLL()
            if (r0 != 0) goto Le
            java.lang.String r0 = ""
            goto Le
        L94:
            r6.n0()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder.o0(X.3L4):void");
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        i0((ConcurrentHashMap) obj);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        this.LLIIJLIL = false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        C3L4 c3l4 = this.LLFZ;
        if (c3l4 != null && c3l4.LJIIIIZZ() == 0 && TextUtils.equals(this.LLFII, event.LJLIL)) {
            n0();
            m0();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZLLL(this, owner);
        this.LLIIJLIL = true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate(C39R event) {
        IMUser LJIIJ;
        String LJFF;
        String LJFF2;
        o.LJIIIZ(event, "event");
        if (!TextUtils.equals(this.LLFII, event.LJLIL) || (LJIIJ = C80533Eb.LJIIJ(event.LJLIL, event.LJLILLLLZI)) == null) {
            return;
        }
        C3L4 c3l4 = this.LLFZ;
        if (c3l4 instanceof C3L2) {
            o.LJII(c3l4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.data.session.MessageRequestInboxSession");
            o0(c3l4);
            return;
        }
        if (!C84673Tz.LIZ()) {
            UrlModel avatarThumb = LJIIJ.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                h0();
            } else {
                W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
                int X2 = X();
                int X3 = X();
                LJII.LJII = X2;
                LJII.LJIIIIZZ = X3;
                LJII.LJJIIJ = this.LJLJI;
                LJII.LJJIII = EnumC62195Ob1.SMALL;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_default_avatar;
                LJII.LJIILLIIL = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v);
                C43659HBn.LJIIZILJ(LJII, "SessionListViewHolder:onUserUpdate", LJIIJ.getUid(), 0, null, 28);
            }
        }
        C3L4 c3l42 = this.LLFZ;
        if (c3l42 != null && (LJFF2 = c3l42.LJFF()) != null) {
            x0(LJIIJ, LJFF2);
        }
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setText(LJIIJ.getDisplayName());
        }
        AJ9.LJ(this.itemView.getContext(), LJIIJ.getCustomVerify(), LJIIJ.getEnterpriseVerifyReason(), this.LJLJJL);
        C3L4 c3l43 = this.LLFZ;
        if (c3l43 != null) {
            z0(c3l43);
            T(c3l43, LJIIJ.isBlock());
            w0(LJIIJ, c3l43);
            if (LJIIJ.getFollowStatus() != 2 && (LJFF = c3l43.LJFF()) != null) {
                C76662ze.LJLIL.getClass();
                C76662ze.LJFF(LJFF, null);
            }
            M(c3l43, LJIIJ.isBlock());
        }
    }

    public final void t0(C3L4 c3l4) {
        TuxTextView tuxTextView;
        C3L3 c3l3;
        String l;
        RelationButton relationButton = this.LJZ;
        if (((relationButton == null || relationButton.getVisibility() != 0) && ((tuxTextView = this.LJZI) == null || tuxTextView.getVisibility() != 0)) || !(c3l4 instanceof C3L3) || (c3l3 = (C3L3) c3l4) == null) {
            return;
        }
        IMUser LJIJI = c3l3.LJIJI();
        if (LJIJI == null || (l = LJIJI.getUid()) == null) {
            Long valueOf = Long.valueOf(C81273Gx.LIZLLL(c3l3.LJFF()));
            if (valueOf.longValue() != -1) {
                l = valueOf.toString();
            } else {
                return;
            }
        }
        C3TD.LIZ().getClass();
        C3U2.LIZLLL(LJIJI, l);
    }

    public final void v0(C3L4 c3l4) {
        C3L4 c3l42;
        String str;
        TuxIconView tuxIconView;
        if (C96573qf.LIZIZ() != 0 && C96573qf.LIZIZ() != 7) {
            TuxIconView tuxIconView2 = this.LLD;
            if (tuxIconView2 != null) {
                C78996UzQ.LJJ(tuxIconView2);
            }
            if (c3l4 instanceof C3L3) {
                c3l42 = c3l4;
            } else {
                c3l42 = null;
            }
            if (this.itemView.findViewById(R.id.ffy) == null || (c3l42 instanceof C3L2) || (c3l42 instanceof C3LK)) {
                return;
            }
            C82223Ko c82223Ko = C99033ud.Companion;
            if (c3l42 != null) {
                str = c3l42.LJFF();
            } else {
                str = null;
            }
            c82223Ko.getClass();
            if (C82223Ko.LIZ(str) || c3l42 == null || L()) {
                return;
            }
            if ((C96573qf.LIZIZ() == 1 || C96573qf.LIZIZ() == 5) && (tuxIconView = this.LLD) != null) {
                C17N.LJJLIIIJJI(tuxIconView);
            }
            if (!C96573qf.LIZJ()) {
                return;
            }
            C75382xa.LJI(c3l4.LJFF(), null, new AqS164S0200000_1(this, c3l4, 4));
        }
    }

    public final void z0(C3L4 c3l4) {
        int i;
        C3MY c3my;
        if (c3l4 instanceof C3L2) {
            AVS avs = this.LJLJLJ;
            if (avs != null) {
                C78996UzQ.LJJ(avs);
                return;
            }
            return;
        }
        AVS avs2 = this.LJLLLL;
        if (avs2 != null) {
            C78996UzQ.LJJ(avs2);
        }
        if (p0(null, c3l4)) {
            AVS avs3 = this.LJLJLJ;
            if (avs3 != null) {
                C78996UzQ.LJJ(avs3);
                return;
            }
            return;
        }
        AbstractC82843My LJFF = C82473Ln.LJFF(c3l4);
        AVS avs4 = this.LJLJLJ;
        int i2 = 8;
        if (avs4 != null) {
            if (LJFF != null) {
                i = 0;
            } else {
                i = 8;
            }
            avs4.setVisibility(i);
        }
        if (LJFF != null) {
            AVS avs5 = this.LJLJLJ;
            if (avs5 != null) {
                if (LJFF instanceof C82493Lp) {
                    avs5.setVariant(1);
                    avs5.setCount(((C82493Lp) LJFF).getNum());
                    C97343ru.LIZIZ(avs5, C96593qh.LJLIL);
                }
                if (LJFF instanceof C82483Lo) {
                    avs5.setVariant(0);
                    C97343ru.LIZIZ(avs5, C96603qi.LJLIL);
                }
                Integer LJI = C79045V0n.LJI(LJFF.getBackground(), C97343ru.LIZ);
                if (LJI != null) {
                    avs5.setBadgeBackgroundColor(LJI.intValue());
                }
            }
            n0();
        }
        l0(c3l4);
        if ((c3l4 instanceof C3MY) && (c3my = (C3MY) c3l4) != null) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                if (c3my.LLIIIZ) {
                    i2 = 0;
                }
                tuxIconView.setVisibility(i2);
            }
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                if (c3my.LJIIJ() && c3my.LL) {
                    tuxIconView2.setTintColorRes(R.attr.gp);
                } else {
                    tuxIconView2.setTintColorRes(R.attr.eb);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListViewHolder(View itemView, InterfaceC83713Qh actionCallback) {
        super(itemView);
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        ViewGroup viewGroup;
        AppCompatTextView appCompatTextView;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(actionCallback, "actionCallback");
        this.LJLIL = actionCallback;
        this.LLFF = C221108m2.LIZIZ(C96673qp.LJLIL);
        this.LLFFF = C221108m2.LIZIZ(C96813r3.LJLIL);
        this.LLI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS151S0100000_1(this, 589));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 584));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 588));
        this.LLII = LIZIZ;
        this.LLIIII = C221108m2.LIZIZ(C96683qq.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 591));
        this.LLIIJI = -1;
        this.LLIIJLIL = true;
        this.LLIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 590));
        this.LLIILII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 585));
        C107724Kq c107724Kq = new C107724Kq(getActivity());
        c107724Kq.LIZIZ = EnumC112364b2.CHAT_CELL;
        c107724Kq.LIZLLL = "notification_page";
        c107724Kq.LJ = "chat_room";
        this.LLIILZL = c107724Kq;
        this.LLIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 586));
        this.LLIL = "";
        this.LLILII = "";
        this.LJLILLLLZI = (C53691L5j) itemView.findViewById(R.id.dff);
        this.LJLJI = (SmartAvatarImageView) itemView.findViewById(R.id.ac_);
        this.LJLLL = itemView.findViewById(R.id.ba5);
        this.LJLLLL = (AVS) itemView.findViewById(R.id.mh_);
        this.LJLJJL = (TuxTextView) itemView.findViewById(R.id.mzt);
        this.LJLJJLL = (TuxTextView) itemView.findViewById(R.id.fft);
        this.LJLJLJ = (AVS) itemView.findViewById(R.id.mpq);
        if (V()) {
            tuxIconView = (TuxIconView) itemView.findViewById(R.id.gv0);
        } else {
            tuxIconView = (TuxIconView) itemView.findViewById(R.id.guz);
        }
        this.LJLL = tuxIconView;
        if (V()) {
            tuxIconView2 = (TuxIconView) itemView.findViewById(R.id.ami);
        } else {
            tuxIconView2 = (TuxIconView) itemView.findViewById(R.id.amh);
        }
        this.LJLLI = tuxIconView2;
        this.LJLJLLL = (TuxIconView) itemView.findViewById(R.id.f_v);
        ViewGroup viewGroup2 = (ViewGroup) itemView.findViewById(R.id.fgj);
        if (V()) {
            Q(true);
        }
        this.LJLLILLLL = viewGroup2;
        TuxIconView tuxIconView3 = null;
        if (V()) {
            viewGroup = (ViewGroup) itemView.findViewById(R.id.fgh);
        } else {
            viewGroup = null;
        }
        this.LJLLJ = viewGroup;
        this.LJLLLLLL = (ViewGroup) itemView.findViewById(R.id.btt);
        this.LJLZ = (C119354mJ) itemView.findViewById(R.id.pq);
        this.LJZ = (RelationButton) itemView.findViewById(R.id.iuh);
        this.LJZI = (TuxTextView) itemView.findViewById(R.id.jb1);
        this.LJZL = (ImageView) itemView.findViewById(R.id.l1u);
        if (((Boolean) LIZIZ.getValue()).booleanValue() || V()) {
            tuxIconView3 = (TuxIconView) itemView.findViewById(R.id.b3a);
        } else if (C96573qf.LJ()) {
            tuxIconView3 = (TuxIconView) itemView.findViewById(R.id.b3_);
        }
        this.LLD = tuxIconView3;
        if (V()) {
            Q(true);
            appCompatTextView = (AppCompatTextView) itemView.findViewById(R.id.ffy);
        } else if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            Q(false);
            View findViewById = itemView.findViewById(R.id.ffx);
            ((TuxTextView) findViewById).setTuxFont(61);
            appCompatTextView = (AppCompatTextView) findViewById;
        } else {
            appCompatTextView = (AppCompatTextView) itemView.findViewById(R.id.ffv);
        }
        this.LJLJL = appCompatTextView;
        this.LL = (TuxIconView) itemView.findViewById(R.id.mu5);
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(itemView, new ARunnableS37S0100000_1(itemView, 39));
        f0(itemView, actionCallback);
    }

    public static boolean p0(IMUser iMUser, C3L4 c3l4) {
        boolean z;
        boolean z2;
        if (iMUser != null) {
            z = iMUser.isBlock();
        } else {
            z = false;
        }
        if (c3l4.LJIIJ() && c3l4.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = c3l4.LLI;
        if (!AnonymousClass304.LIZIZ() || c3l4.LJLLI == 0 || z || z2 || z3) {
            return false;
        }
        return true;
    }

    public static void x0(IMUser iMUser, String str) {
        if (iMUser != null) {
            String secUid = iMUser.getSecUid();
            if (secUid == null || secUid.length() == 0) {
                C3E6.LIZ(str);
            }
        }
    }

    public final void M(C3L4 c3l4, boolean z) {
        ConstraintLayout constraintLayout;
        TuxTextView tuxTextView;
        View view = this.itemView;
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            TuxTextView tuxTextView2 = this.LJZI;
            if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0) {
                LIZ.LJIIIZ(R.id.la4, 7, R.id.jb1, 6, ((Number) this.LLIIII.getValue()).intValue());
                LIZ.LJIIIZ(R.id.btt, 7, R.id.jb1, 6, ((Number) this.LLIIII.getValue()).intValue());
            } else if (C3TE.LIZIZ()) {
                LIZ.LJIIIIZZ(R.id.la4, 7, R.id.n3m, 6);
                LIZ.LJIIIIZZ(R.id.btt, 7, R.id.n3m, 6);
            } else if (C96573qf.LIZLLL()) {
                TuxIconView tuxIconView = this.LLD;
                if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                    LIZ.LJIIIIZZ(R.id.la4, 7, R.id.b3a, 6);
                    LIZ.LJIIIIZZ(R.id.btt, 7, R.id.b3a, 6);
                } else {
                    LIZ.LJIIIIZZ(R.id.la4, 7, R.id.fgj, 6);
                    LIZ.LJIIIIZZ(R.id.btt, 7, R.id.fgj, 6);
                }
            } else {
                LIZ.LJIIIIZZ(R.id.la4, 7, R.id.ffv, 6);
                LIZ.LJIIIIZZ(R.id.btt, 7, R.id.fgj, 6);
            }
            LIZ.LIZIZ(constraintLayout);
        }
        if (!C3TE.LIZIZ()) {
            return;
        }
        if (c3l4.LL || C82473Ln.LJFF(c3l4) == null || (((tuxTextView = this.LJZI) != null && tuxTextView.getVisibility() == 0) || z)) {
            TuxTextView tuxTextView3 = this.LJLJJL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(41);
            }
            TuxTextView tuxTextView4 = this.LJLJJLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(51);
                tuxTextView4.setTextColorRes(R.attr.dt);
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.LJLJJL;
        if (tuxTextView5 != null) {
            tuxTextView5.setTuxFont(42);
        }
        TuxTextView tuxTextView6 = this.LJLJJLL;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setTuxFont(52);
        tuxTextView6.setTextColorRes(R.attr.go);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0202, code lost:
    
        if (r3 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0361, code lost:
    
        if (r3 == null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(X.C3L4 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder.P(X.3L4, int):void");
    }

    public final void T(C3L4 c3l4, boolean z) {
        boolean z2;
        int i;
        int i2;
        AVS avs;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        EnumC96103pu enumC96103pu;
        if (c3l4.LJIIJ() && c3l4.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        TuxIconView tuxIconView3 = this.LJLLI;
        if (tuxIconView3 != null) {
            if (z) {
                String LJFF = c3l4.LJFF();
                if (LJFF != null) {
                    C76662ze c76662ze = C76662ze.LJLIL;
                    AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 587);
                    c76662ze.getClass();
                    C76662ze.LJFF(LJFF, aqS151S0100000_1);
                }
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView3.setVisibility(i);
        }
        if (C55888Lwa.LIZIZ.LJJI(true)) {
            if (z2 && (c3l4 instanceof C3L5) && ((enumC96103pu = ((C3L5) c3l4).LLIIII) == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY || enumC96103pu == null)) {
                TuxIconView tuxIconView4 = this.LJLL;
                if (tuxIconView4 != null) {
                    tuxIconView4.setVisibility(0);
                }
            } else {
                TuxIconView tuxIconView5 = this.LJLL;
                if (tuxIconView5 != null) {
                    tuxIconView5.setVisibility(8);
                }
            }
        } else {
            TuxIconView tuxIconView6 = this.LJLL;
            if (tuxIconView6 != null) {
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tuxIconView6.setVisibility(i2);
            }
        }
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup == null) {
            return;
        }
        if (V()) {
            if (z) {
                TuxIconView tuxIconView7 = this.LJLL;
                if (tuxIconView7 != null) {
                    C78996UzQ.LJJ(tuxIconView7);
                }
                v0(c3l4);
                ViewGroup viewGroup2 = this.LJLLJ;
                if (viewGroup2 != null) {
                    C17N.LJJLIIIJJI(viewGroup2);
                    return;
                }
                return;
            }
            v0(c3l4);
            TuxIconView tuxIconView8 = this.LJLL;
            if ((tuxIconView8 != null && tuxIconView8.getVisibility() == 0) || ((tuxIconView2 = this.LJLLI) != null && tuxIconView2.getVisibility() == 0)) {
                ViewGroup viewGroup3 = this.LJLLJ;
                if (viewGroup3 != null) {
                    C17N.LJJLIIIJJI(viewGroup3);
                    return;
                }
                return;
            }
            ViewGroup viewGroup4 = this.LJLLJ;
            if (viewGroup4 == null) {
                return;
            }
            C78996UzQ.LJJ(viewGroup4);
            return;
        }
        if (z) {
            TuxIconView tuxIconView9 = this.LJLL;
            if (tuxIconView9 != null) {
                C78996UzQ.LJJ(tuxIconView9);
            }
            TuxIconView tuxIconView10 = this.LLD;
            if (tuxIconView10 != null) {
                C78996UzQ.LJJ(tuxIconView10);
            }
            C17N.LJJLIIIJJI(viewGroup);
            return;
        }
        v0(c3l4);
        TuxIconView tuxIconView11 = this.LJLL;
        if ((tuxIconView11 != null && tuxIconView11.getVisibility() == 0) || (((avs = this.LJLJLJ) != null && avs.getVisibility() == 0) || (C96573qf.LJ() && (tuxIconView = this.LLD) != null && tuxIconView.getVisibility() == 0))) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    @Override // X.MMN
    public final void bind(Object obj, int i) {
        C3L4 c3l4;
        Object obj2 = ((C3ML) obj).LJLJJL;
        if ((obj2 instanceof C3L4) && (c3l4 = (C3L4) obj2) != null) {
            P(c3l4, i);
        }
    }

    public final void f0(View view, InterfaceC83713Qh interfaceC83713Qh) {
        InterfaceC57447Mgd listener;
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(interfaceC83713Qh, this, 11), view);
        view.setOnLongClickListener(new IDCListenerS108S0200000_1(this, interfaceC83713Qh, 0));
        RelationButton relationButton = this.LJZ;
        if (relationButton != null && (listener = relationButton.getListener()) != null) {
            listener.setFollowClickInterceptor(new C3TI(this, null));
        }
        SmartAvatarImageView smartAvatarImageView = this.LJLJI;
        if (smartAvatarImageView != null) {
            C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS36S0200000_1(interfaceC83713Qh, this, 12));
        }
        TuxIconView tuxIconView = this.LLD;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 92));
        }
    }

    public final void g0(String str, UrlModel urlModel) {
        if ((C1041346v.LIZIZ() & 1) != 0 && Y() != null) {
            InterfaceC1040946r Y2 = Y();
            if (Y2 != null) {
                C1040846q.LIZIZ(Y2, str, urlModel, X(), 8);
                return;
            }
            return;
        }
        if (C84673Tz.LIZ()) {
            C85353Wp.LIZ(this.LJLJI, X(), urlModel, str);
            return;
        }
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            h0();
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = this.LJLJI;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_default_avatar;
        LJII.LJIILLIIL = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v);
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        int X2 = X();
        int X3 = X();
        LJII.LJII = X2;
        LJII.LJIIIIZZ = X3;
        C43659HBn.LJIIZILJ(LJII, "SessionListViewHolder", str, 0, null, 28);
    }

    public final void s0(IMUser iMUser, C3L4 c3l4) {
        String l;
        String str;
        String str2;
        if (iMUser == null || (l = iMUser.getUid()) == null) {
            Long valueOf = Long.valueOf(C81273Gx.LIZLLL(c3l4.LJFF()));
            if (valueOf.longValue() != -1) {
                l = valueOf.toString();
            } else {
                return;
            }
        }
        TuxTextView tuxTextView = this.LJZI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText("👋");
            IMSayhiAnalyticsImpl iMSayhiAnalyticsImpl = IMSayhiAnalyticsImpl.LIZ;
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("enter_from", "notification_page");
            oszArr[1] = new OSZ("enter_method", "button");
            if (iMUser == null || (str = Integer.valueOf(iMUser.getFollowStatus()).toString()) == null) {
                str = "";
            }
            oszArr[2] = new OSZ("relation_tag", str);
            if (c3l4.LJLLI != 0) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[3] = new OSZ("is_recommended_chat", str2);
            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            iMSayhiAnalyticsImpl.LIZ(l, LJJLIIIIJ, C57434MgQ.LIZIZ(context), false);
        }
        TuxTextView tuxTextView2 = this.LJZI;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS11S1300000_1(c3l4, iMUser, l, this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.3qr] */
    public final void w0(final IMUser iMUser, final C3L4 c3l4) {
        String l;
        n0();
        if (p0(iMUser, c3l4)) {
            s0(iMUser, c3l4);
            return;
        }
        if (c3l4.LLF == null && c3l4.LJLLILLLL <= 0 && !c3l4.LJLLJ) {
            if ((!c3l4.LJIIJ() || !c3l4.LL) && !c3l4.LLI) {
                if (iMUser != null && iMUser.isBlock()) {
                    return;
                }
                if (((Boolean) C96913rD.LIZ.getValue()).booleanValue()) {
                    C3U2 LIZ = C3TD.LIZ();
                    ?? r6 = new Object() { // from class: X.3qr
                        public final void LIZ(String uid) {
                            o.LJIIIZ(uid, "uid");
                            SessionListViewHolder.this.s0(iMUser, c3l4);
                        }
                    };
                    LIZ.getClass();
                    if (iMUser == null || (l = iMUser.getUid()) == null) {
                        Long valueOf = Long.valueOf(C81273Gx.LIZLLL(c3l4.LJFF()));
                        if (valueOf.longValue() == -1) {
                            return;
                        } else {
                            l = valueOf.toString();
                        }
                    }
                    if (!C3U2.LIZIZ(iMUser, c3l4)) {
                        return;
                    }
                    r6.LIZ(l);
                    return;
                }
                if (iMUser == null || !C3U6.LIZ || this.LJZ == null || C78966Uyw.LJJIJ().LIZIZ() || iMUser.getFollowStatus() != 2) {
                    return;
                }
                String uid = iMUser.getUid();
                o.LJIIIIZZ(uid, "imUser.uid");
                if (C89263es.LIZLLL(C89263es.LIZ(), uid, true)) {
                    return;
                }
                RelationButton relationButton = this.LJZ;
                if (relationButton != null) {
                    relationButton.setVisibility(0);
                }
                User user = IMUser.toUser(iMUser);
                o.LJIIIIZZ(user, "toUser(imUser)");
                RelationButton relationButton2 = this.LJZ;
                if (relationButton2 != null) {
                    C226668v0 c226668v0 = new C226668v0();
                    c226668v0.LIZ = user;
                    c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
                    relationButton2.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                }
                RelationButton relationButton3 = this.LJZ;
                if (relationButton3 == null) {
                    return;
                }
                relationButton3.setTracker(new AqS151S0100000_1(this, 787));
            }
        }
    }
}

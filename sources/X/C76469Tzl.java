package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS6S0300000_13;
import Y.IDCListenerS287S0100000_13;
import Y.IDDListenerS152S0100000_13;
import Y.IDcS172S0100000_13;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkAnchorPocChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortAniEndEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchResumeEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchRtcOpenMessageEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchAudienceScoreClickEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchMeanwhileSceneInviteEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOncemoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignSingleResultSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS3S0410000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76469Tzl extends AbstractC76181Tv7 implements InterfaceC76311TxD {
    public LinkDialog LLIIII;
    public LinkDialog LLIIIILZ;
    public LiveDialog LLIIIJ;
    public C29701Eo LLIIIL;
    public C29701Eo LLIIIZ;
    public C76805UCj LLIIJI;
    public C80955Vpv LLIIJLIL;
    public FrameLayout LLIIL;
    public C29916Boe LLIILII;
    public DialogC76479Tzv LLIILZL;
    public boolean LLIL;
    public boolean LLILII;
    public Runnable LLILL;
    public final C76278Twg LLII = new C76278Twg();
    public final HandlerC28345BAn LLIIZ = new HandlerC28345BAn(C16880lQ.LLJJJJ(), this);
    public final C73318Sq2 LLILIL = new C73318Sq2();

    public static void LJLI(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7763610618774951434")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "MultiMatchWidgetImpl";
    }

    @Override // X.AbstractC76473Tzp
    public final boolean LJJJJLL() {
        return false;
    }

    public final void LJLIIIL() {
        C76244Tw8 LJII;
        C76261TwP.LIZ = false;
        LJJLIIJ().setVisibility(0);
        LiveMatchReDesignAnchorSetting liveMatchReDesignAnchorSetting = LiveMatchReDesignAnchorSetting.INSTANCE;
        if (liveMatchReDesignAnchorSetting.isEnabled()) {
            LJJLIIJ().setMaxWidth(C15380j0.LJIIL() - LJJIIZ().LJI());
            LJJLIIJ().LJJLL(R.style.a36);
        } else {
            LJJLIIJ().LJJLL(R.style.a35);
        }
        if (liveMatchReDesignAnchorSetting.isEnabled()) {
            LJJLIIJ().setClickable(true);
        } else {
            LJJLIIJ().setEnabled(true);
        }
        List<TeamUsersInfo> list = null;
        C75622Tm6.LJIJI(EnumC76429Tz7.REMATCH_BUTTON, true, null);
        C75832TpU c75832TpU = C75832TpU.LIZ;
        C76278Twg c76278Twg = this.LLII;
        if (c76278Twg != null && (LJII = c76278Twg.LJII()) != null) {
            list = LJII.LJIILL;
        }
        c75832TpU.LJJIZ(1, true, list);
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZI() {
        this.LLII.LIZLLL();
        this.LLILIL.LIZLLL();
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.jv0(this);
        }
        LJJIII();
        C0NB.LIZIZ("pk_interrupt", "widget destroy ");
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJZ() {
        List<C75883TqJ> list;
        C76278Twg c76278Twg = this.LLII;
        c76278Twg.getClass();
        C75832TpU c75832TpU = C75832TpU.LIZ;
        EnumC76319TxL enumC76319TxL = EnumC76319TxL.PK_ICON;
        c75832TpU.LJJIIZ(enumC76319TxL.getValue(), true, true);
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        IMultiHostService iMultiHostService = c76278Twg.LJI;
        if (iMultiHostService != null) {
            list = iMultiHostService.LJIL();
        } else {
            list = null;
        }
        if (list != null && list.size() == 3 && LJ == EnumC76178Tv4.NORMAL) {
            B5G.LIZIZ().LJJJJL = enumC76319TxL.getValue();
            B5G.LIZIZ().LJJJ = new C75648TmW("pk_icon");
            B5G.LIZIZ().LJJLJ = "pk_icon";
            InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD != null) {
                interfaceC76311TxD.LJLLILLLL(new AqS179S0100000_13(c76278Twg, 347));
            }
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.INVITEONE);
            return;
        }
        if (LJ == EnumC76178Tv4.NORMAL) {
            c76278Twg.LJJII(enumC76319TxL);
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.INVITE);
            return;
        }
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
        if (LJ2 == enumC76178Tv4) {
            InterfaceC76311TxD interfaceC76311TxD2 = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD2 != null) {
                interfaceC76311TxD2.LJLJLJ(true, enumC76319TxL, EnumC75644TmS.WITHDRAW, EnumC76248TwC.CLICKCOUTDOWN);
            }
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.INVITING);
            return;
        }
        if (LJ == enumC76178Tv4) {
            InterfaceC76311TxD interfaceC76311TxD3 = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD3 != null) {
                interfaceC76311TxD3.LJLJLJ(false, enumC76319TxL, EnumC75644TmS.WITHDRAW, EnumC76248TwC.CLICKCOUTDOWN);
            }
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.INVITING);
            return;
        }
        EnumC76178Tv4 enumC76178Tv42 = EnumC76178Tv4.ACCEPTED;
        if (LJ2 == enumC76178Tv42) {
            InterfaceC76311TxD interfaceC76311TxD4 = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD4 != null) {
                interfaceC76311TxD4.LJLLJ("click", true, false);
            }
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            c76271TwZ.LJJIJIIJIL(EnumC76186TvC.HADREPLY);
            c76271TwZ.LJJJLL(true);
            return;
        }
        if (LJ == enumC76178Tv42) {
            InterfaceC76311TxD interfaceC76311TxD5 = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD5 != null) {
                interfaceC76311TxD5.LJLLJ("click", false, false);
            }
            C76271TwZ c76271TwZ2 = C76271TwZ.LIZ;
            c76271TwZ2.LJJIJIIJIL(EnumC76186TvC.HADREPLY);
            c76271TwZ2.LJJJLL(false);
            return;
        }
        if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.FINISH) < 0) {
            c76278Twg.LJJIIJZLJL(0);
        } else {
            if (EnumC76178Tv4.PUNISH.compareTo(LJ) > 0 || LJ.compareTo(EnumC76178Tv4.DRAW) >= 0) {
                return;
            }
            c76278Twg.LJJIIJZLJL(1);
            C76271TwZ.LIZ.LJJIJIIJIL(EnumC76186TvC.DISCONNECT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLILLLLZI() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76469Tzl.LJLILLLLZI():void");
    }

    public final void LJLJI() {
        C29701Eo c29701Eo;
        List<TeamUsersInfo> list;
        C0NB.LJIIIZ("MultiMatchView", "showBattleStartAnimation method");
        LinkDialog linkDialog = this.LLIIII;
        if (linkDialog != null && linkDialog.isVisible()) {
            C75852Tpo.LIZIZ();
            LinkDialog linkDialog2 = this.LLIIII;
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
            LinkDialog linkDialog3 = this.LLIIIILZ;
            if (linkDialog3 != null) {
                linkDialog3.setOnDismissListener(DialogInterfaceOnDismissListenerC76492U0i.LJLIL);
            }
            LinkDialog linkDialog4 = this.LLIIIILZ;
            if (linkDialog4 != null) {
                linkDialog4.dismiss();
            }
        }
        C29701Eo c29701Eo2 = this.LLIIIZ;
        if ((c29701Eo2 != null && c29701Eo2.isAnimating()) || this.LLILII) {
            return;
        }
        this.LLILII = true;
        if (LJJJ().getVisibility() != 0) {
            C75832TpU c75832TpU = C75832TpU.LIZ;
            C76244Tw8 LJII = this.LLII.LJII();
            if (LJII != null) {
                list = LJII.LJIILL;
            } else {
                list = null;
            }
            c75832TpU.LJJII(list, true, true);
        }
        LJJJ().setVisibility(0);
        LJJJ().post(new ARunnableS49S0100000_13(this, 203));
        C34K c34k = new C34K();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && (c29701Eo = this.LLIIIZ) != null) {
            c29701Eo.useHardwareAcceleration(true);
        }
        C29701Eo c29701Eo3 = this.LLIIIZ;
        if (c29701Eo3 != null) {
            c29701Eo3.setFrame(0);
        }
        C29701Eo c29701Eo4 = this.LLIIIZ;
        if (c29701Eo4 != null) {
            C29306Beo.LJJLJLI(c29701Eo4);
        }
        C29701Eo c29701Eo5 = this.LLIIIZ;
        if (c29701Eo5 == null) {
            return;
        }
        c29701Eo5.addAnimatorListener(new IDAListenerS6S0300000_13(c29701Eo5, this, c34k, 2));
        C76732zl c76732zl = new C76732zl();
        C29701Eo c29701Eo6 = this.LLIIIZ;
        if (c29701Eo6 != null) {
            if (i >= 26) {
                c29701Eo6.useHardwareAcceleration(true);
            } else {
                c29701Eo6.useHardwareAcceleration(false);
            }
        }
        C15490jB.LJIIIZ(this.LLIIIZ, "tiktok_live_match_redesign_resource", "ttlive_match_start_ani_multi.zip", "images", true, new C76483Tzz(c76732zl), new AqS144S0200000_13(this, c76732zl, 73));
    }

    @Override // X.InterfaceC76311TxD
    public final int LJLJJL() {
        int i;
        FrameLayout frameLayout = this.LJLLLL;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            int i2 = 0;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            FrameLayout frameLayout2 = this.LJLLLL;
            if (frameLayout2 != null) {
                i2 = frameLayout2.getHeight() / 2;
            }
            return i + i2;
        }
        return -1;
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLL() {
        ConstraintLayout constraintLayout;
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        ViewParent parent = LJJJ().getParent();
        if (!(parent instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) parent) == null) {
            return;
        }
        anonymousClass064.LJII(constraintLayout);
        anonymousClass064.LJI(R.id.fh4, 3);
        anonymousClass064.LJI(R.id.fh4, 4);
        anonymousClass064.LJIIIIZZ(R.id.fh4, 3, R.id.fj9, 4);
        anonymousClass064.LIZIZ(constraintLayout);
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJIII() {
        LiveDialog liveDialog;
        super.LJJIII();
        LinkDialog linkDialog = this.LLIIII;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LLIIII;
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
            LinkDialog linkDialog3 = this.LLIIIILZ;
            if (linkDialog3 != null) {
                linkDialog3.setOnDismissListener(DialogInterfaceOnDismissListenerC76489U0f.LJLIL);
            }
            LinkDialog linkDialog4 = this.LLIIIILZ;
            if (linkDialog4 != null) {
                linkDialog4.dismiss();
            }
            LJLIIL("other", this.LLIIII);
        }
        LiveDialog liveDialog2 = this.LLIIIJ;
        if (liveDialog2 != null && liveDialog2.isShowing() && (liveDialog = this.LLIIIJ) != null) {
            liveDialog.dismiss();
        }
    }

    @Override // X.AbstractC76181Tv7, X.AbstractC76473Tzp
    public final void LJJJJL() {
        super.LJJJJL();
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            this.LLIIIL = (C29701Eo) widget.findViewById(R.id.gp8);
            this.LLIIIZ = (C29701Eo) widget.findViewById(R.id.gfn);
            this.LLIIJLIL = (C80955Vpv) widget.findViewById(R.id.dbd);
            C16880lQ.LJJIII(LJJLIIJ(), new ACListenerS33S0100000_13(this, 177));
            if (C76128TuG.LIZIZ(LJJIIZI(), false, 6)) {
                C80955Vpv c80955Vpv = this.LLIIJLIL;
                if (c80955Vpv != null) {
                    c80955Vpv.setVisibility(8);
                }
                this.LLIIJI = null;
                this.LLIIL = (FrameLayout) widget.findViewById(R.id.flr);
            } else {
                C80955Vpv c80955Vpv2 = this.LLIIJLIL;
                if (c80955Vpv2 != null) {
                    c80955Vpv2.setVisibility(0);
                }
                C76805UCj c76805UCj = (C76805UCj) widget.findViewById(R.id.fke);
                this.LLIIJI = c76805UCj;
                if (c76805UCj != null) {
                    c76805UCj.LJFF(LJJIIZI());
                }
                this.LLIIL = (FrameLayout) widget.findViewById(R.id.fh1);
            }
            C29916Boe c29916Boe = (C29916Boe) widget.findViewById(R.id.ais);
            this.LLIILII = c29916Boe;
            if (c29916Boe != null) {
                c29916Boe.LIZ();
            }
            this.LLILII = false;
        }
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLJJI() {
        boolean z;
        View view;
        U8H LJJZZI;
        InterfaceC55235Lm3 LJFF;
        IInteractTitleAbility iInteractTitleAbility;
        C76414Tys c76414Tys;
        Animator animator;
        LiveDialog liveDialog;
        EnumC76391TyV enumC76391TyV;
        super.LJJIII();
        LinkDialog linkDialog = this.LLIIII;
        if (linkDialog != null && linkDialog.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinkDialog linkDialog2 = this.LLIIII;
            if (linkDialog2 != null) {
                enumC76391TyV = linkDialog2.g6();
            } else {
                enumC76391TyV = null;
            }
            if (enumC76391TyV != EnumC76391TyV.MULTI_MATCH_BE_INVITED) {
                LinkDialog linkDialog3 = this.LLIIII;
                if (linkDialog3 != null) {
                    linkDialog3.dismiss();
                }
                LinkDialog linkDialog4 = this.LLIIIILZ;
                if (linkDialog4 != null) {
                    linkDialog4.setOnDismissListener(DialogInterfaceOnDismissListenerC76490U0g.LJLIL);
                }
                LinkDialog linkDialog5 = this.LLIIIILZ;
                if (linkDialog5 != null) {
                    linkDialog5.dismiss();
                }
            }
        }
        LiveDialog liveDialog2 = this.LLIIIJ;
        if (liveDialog2 != null && liveDialog2.isShowing() && (liveDialog = this.LLIIIJ) != null) {
            liveDialog.dismiss();
        }
        LJJLI(true);
        LJJLIIIJLLLLLLLZ();
        Animator animator2 = C76480Tzw.LIZ;
        if (animator2 != null && animator2.isRunning() && (animator = C76480Tzw.LIZ) != null) {
            animator.end();
        }
        LJJJJJL();
        Runnable runnable = this.LLILL;
        if (runnable != null) {
            this.LLIIZ.removeCallbacks(runnable);
        }
        LJJIJ().getView().setVisibility(8);
        C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
        if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
            c76414Tys.LJIILJJIL();
        }
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            view = widget.getView();
        } else {
            view = null;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (LJIIIZ != null && (LJFF = C55230Lly.LJFF(LJIIIZ, null)) != null && (iInteractTitleAbility = (IInteractTitleAbility) C55096Ljo.LIZ(LJFF, IInteractTitleAbility.class, null)) != null) {
            iInteractTitleAbility.b6();
        }
        C29701Eo c29701Eo = this.LLIIIL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        LJJIJIIJI().setVisibility(8);
        LJJIJIIJIL().setVisibility(8);
        LJJIJL().setVisibility(8);
        LJJIJIL().setVisibility(8);
        LJJIJLIJ().setVisibility(8);
        LJJJ().setVisibility(8);
        LJJIL().setVisibility(8);
        LJJLIIJ().setVisibility(8);
        LJJIIZ().getView().setVisibility(8);
        LJJIIZ().LIZIZ();
        LJJI(4, false);
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJLLLLLLLZ(0.0f, 0);
        }
        this.LLIL = false;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.qv0(MatchGiftEvent.class, new U0H(U0G.MATCH, U05.END, 4));
        }
        DialogC76479Tzv dialogC76479Tzv = this.LLIILZL;
        if (dialogC76479Tzv != null && dialogC76479Tzv.isShowing()) {
            dialogC76479Tzv.dismiss();
        }
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLLI() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        Room LJJJJI;
        int i;
        User owner;
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            WIDGET widget = this.LJLIL;
            if (widget != 0 && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null && ((LJJJJI = LJJJJI()) == null || (owner = LJJJJI.getOwner()) == null || owner.getId() != c75883TqJ.LIZ)) {
                View findViewById = LJLZ.findViewById(R.id.bd5);
                o.LJIIIIZZ(findViewById, "window.findViewById(R.id.cl_info_container)");
                View findViewById2 = LJLZ.findViewById(R.id.lzn);
                o.LJIIIIZZ(findViewById2, "window.findViewById(R.id.tv_anchor_display_id)");
                View findViewById3 = LJLZ.findViewById(R.id.air);
                o.LJIIIIZZ(findViewById3, "window.findViewById(R.id…_teammate_container_view)");
                C76217Tvh c76217Tvh = (C76217Tvh) findViewById3;
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = 0;
                }
                int width = findViewById.getWidth();
                if (c76217Tvh.getVisibility() == 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("eraseBestTeammateIcon widthState = ");
                    LIZ.append(LJLZ.getWidthState());
                    C0NB.LIZIZ("MultiMatchView", X1D.LIZIZ(LIZ));
                    if (LJLZ.getWidthState()) {
                        if (c75883TqJ.LJIJ) {
                            c76217Tvh.LIZIZ(14.0f);
                        } else {
                            C29306Beo.LJI(c76217Tvh);
                            c76217Tvh.LIZ();
                            C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), findViewById2);
                            C78866UxK.LJJLJ(width - C15380j0.LIZ(16.0f), findViewById);
                            LJLZ.LJLJJI = false;
                        }
                    } else if (c75883TqJ.LJIJ) {
                        c76217Tvh.LIZIZ(14.0f);
                        LJLZ.LLILII = true;
                    } else {
                        C29306Beo.LJI(c76217Tvh);
                        c76217Tvh.LIZ();
                        C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), findViewById2);
                        LJLZ.LLILII = false;
                    }
                } else if (c75883TqJ.LJIJ && c76217Tvh.getVisibility() != 0) {
                    if (C15380j0.LIZ(16.0f) + width < ((int) (LJLZ.getWidth() * 0.43f))) {
                        LJLZ.LJLJJI = true;
                        C78866UxK.LJJLJ(C15380j0.LIZ(16.0f) + width, findViewById);
                    }
                    C29306Beo.LJJJLIIL(C15380j0.LIZ(16.0f) + i, findViewById2);
                    c76217Tvh.LIZ();
                    C29306Beo.LJJLJLI(c76217Tvh);
                    c76217Tvh.LIZIZ(14.0f);
                    LJLZ.LLILII = true;
                }
            }
        }
    }

    @Override // X.InterfaceC76363Ty3
    public final MatchBaseWidget LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLJL() {
        LJJL();
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZ(MultiMatchAnchorWidget widget) {
        o.LJIIIZ(widget, "widget");
        super.LJJJJZ(widget);
        C76278Twg c76278Twg = this.LLII;
        c76278Twg.getClass();
        c76278Twg.LIZ(this);
        DataChannel LJI = c76278Twg.LJI();
        if (LJI != null) {
            LJI.mv0(BattleStateChannel.class, c76278Twg, new AqS179S0100000_13(c76278Twg, 343));
            LJI.mv0(BattleReMatchStateChannel.class, c76278Twg, new AqS179S0100000_13(c76278Twg, 344));
            LJI.mv0(MatchRtcOpenMessageEvent.class, c76278Twg, new AqS179S0100000_13(c76278Twg, 345));
        }
        C76096Ttk c76096Ttk = new C76096Ttk(c76278Twg);
        c76278Twg.LJIIIIZZ = c76096Ttk;
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null) {
            LJJIJL.LJJJIL(c76096Ttk);
        }
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 540));
            LJJIIZI.mv0(BattleReMatchStateChannel.class, this, new AqS179S0100000_13(this, 541));
            LJJIIZI.mv0(MultiMatchAudienceScoreClickEvent.class, this, new AqS179S0100000_13(this, 543));
            LJJIIZI.mv0(MultiMatchMeanwhileSceneInviteEvent.class, this, new AqS179S0100000_13(this, 544));
            LJJIIZI.lv0(this.LJLIL, BattleBonusTaskStateChannel.class, new AqS179S0100000_13(this, 545));
            LJJIIZI.lv0(this.LJLIL, MatchResumeEvent.class, new AqS179S0100000_13(this, 546));
            LJJIIZI.lv0(this.LJLIL, BattleReMatchEvent.class, new AqS179S0100000_13(this, 547));
        }
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJLIIL(boolean z) {
        List<TeamUsersInfo> list;
        int i;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        C76244Tw8 LJII = this.LLII.LJII();
        if (LJII != null) {
            list = LJII.LJIILL;
        } else {
            list = null;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c75832TpU.LJJIFFI(list, i, true, true);
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJLL(int i) {
        String value;
        List<C75883TqJ> list;
        EnumC76319TxL enumC76319TxL;
        String str;
        C76278Twg c76278Twg = this.LLII;
        c76278Twg.getClass();
        if (i == 5) {
            value = EnumC76319TxL.MULTI_PK_GUIDE.getValue();
        } else {
            value = EnumC76319TxL.PK_GUIDE.getValue();
        }
        B5G.LIZIZ().LJJJJL = value;
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        IMultiHostService iMultiHostService = c76278Twg.LJI;
        if (iMultiHostService != null) {
            list = iMultiHostService.LJIL();
        } else {
            list = null;
        }
        if (list != null && list.size() == 3 && LJ == EnumC76178Tv4.NORMAL) {
            LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
            String str2 = "multi_pk_guide";
            if (i == 5) {
                str = "multi_pk_guide";
            } else {
                str = "pk_guide";
            }
            LIZIZ.LJJJ = new C75648TmW(str);
            LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
            if (i != 5) {
                str2 = "pk_guide";
            }
            LIZIZ2.LJJLJ = str2;
            InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) c76278Twg.LIZLLL;
            if (interfaceC76311TxD != null) {
                interfaceC76311TxD.LJLLILLLL(new AqS179S0100000_13(c76278Twg, 346));
            }
            C75832TpU.LIZ.LJJIIZ(value, true, true);
            return;
        }
        if (LJ == EnumC76178Tv4.INVITED) {
            C30868C9o.LIZJ(R.string.mpa);
            C75832TpU.LIZ.LJJIIZ(value, true, false);
        } else {
            if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
                C30868C9o.LIZJ(R.string.mj7);
                C75832TpU.LIZ.LJJIIZ(value, true, false);
                return;
            }
            C75832TpU.LIZ.LJJIIZ(value, true, true);
            if (i == 5) {
                enumC76319TxL = EnumC76319TxL.MULTI_PK_GUIDE;
            } else {
                enumC76319TxL = EnumC76319TxL.PK_GUIDE;
            }
            c76278Twg.LJJII(enumC76319TxL);
        }
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJZZI(LinkMicBattleMessage message) {
        o.LJIIIZ(message, "message");
        this.LLII.LJJIII(message);
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJZZIII(C30049Bqn event) {
        o.LJIIIZ(event, "event");
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        EnumC76319TxL enumC76319TxL = EnumC76319TxL.PK_REMATCH;
        LIZIZ.LJJJJL = enumC76319TxL.getValue();
        LJLJLJ(true, enumC76319TxL, EnumC75644TmS.INVITE, EnumC76248TwC.CLICKREMATCH);
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLJLLL(AqS100S0101000_13 aqS100S0101000_13) {
        LiveDialog LIZ;
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            if (C76265TwT.LIZ.LJ() == EnumC76178Tv4.PUNISH) {
                C47071t1 c47071t1 = new C47071t1(widget.context);
                c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.myk);
                c47071t1.LJII(C15380j0.LJIILJJIL(R.string.myl));
                c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.myj), new IDcS172S0100000_13(aqS100S0101000_13, 30));
                c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.my9), C76508U0y.LJLIL);
                c47071t1.LJIJ = new IDCListenerS287S0100000_13(aqS100S0101000_13, 1);
                LIZ = c47071t1.LIZ();
                LJLI(LIZ);
            } else {
                C47071t1 c47071t12 = new C47071t1(widget.context);
                c47071t12.LIZJ = C15380j0.LJIILJJIL(R.string.myk);
                c47071t12.LJII(C15380j0.LJIILJJIL(R.string.myi));
                c47071t12.LJIILIIL(C15380j0.LJIILJJIL(R.string.myj), new IDcS172S0100000_13(aqS100S0101000_13, 31));
                c47071t12.LJIIJ(C15380j0.LJIILJJIL(R.string.my9), C78404Ups.LJLJL);
                c47071t12.LJIJ = new IDCListenerS287S0100000_13(aqS100S0101000_13, 2);
                LIZ = c47071t12.LIZ();
                LJLI(LIZ);
            }
            this.LLIIIJ = LIZ;
        }
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLLILLLL(InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns) {
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            C75842Tpe.LIZ(LJJIIZI(), C51029K0z.LJJIIJ(widget, interfaceC88472Yns, true), "LinkDialog");
        }
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLLL(boolean z) {
        LJJJJJL();
        Runnable runnable = this.LLILL;
        if (runnable != null) {
            this.LLIIZ.removeCallbacks(runnable);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isStartAnimating = ");
        FT5.LJ(LIZ, this.LLILII, LIZ, "MultiMatchView");
        this.LLILII = false;
        C0RN.LIZLLL("needChangePoc = ", z, "MultiMatchView");
        if (!z) {
            C0NB.LJIIIZ("MultiMatchView", "showStartAnimation");
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                DataChannel LJJIIZI = LJJIIZI();
                if (LJJIIZI != null) {
                    LJJIIZI.pv0(MatchCutShortAniEndEvent.class);
                }
                LJLJI();
                return;
            }
            LJLILLLLZI();
            return;
        }
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 == null) {
            return;
        }
        LJJIIZI2.mv0(LinkAnchorPocChangedEvent.class, this, new AqS179S0100000_13(this, 536));
    }

    @Override // X.InterfaceC76311TxD
    public final EnumC76391TyV LJLLLL(int i) {
        LiveDialog liveDialog;
        EnumC76391TyV enumC76391TyV;
        LiveDialog liveDialog2;
        LinkDialog linkDialog;
        if (i != 1) {
            LinkDialog linkDialog2 = this.LLIIII;
            if (linkDialog2 != null && linkDialog2.isVisible() && (linkDialog = this.LLIIII) != null) {
                linkDialog.dismiss();
            }
            LinkDialog linkDialog3 = this.LLIIIILZ;
            if (linkDialog3 != null) {
                linkDialog3.setOnDismissListener(U0V.LJLIL);
            }
            LinkDialog linkDialog4 = this.LLIIIILZ;
            if (linkDialog4 != null) {
                linkDialog4.dismiss();
            }
            LiveDialog liveDialog3 = this.LLIIIJ;
            if (liveDialog3 != null && liveDialog3.isShowing() && (liveDialog2 = this.LLIIIJ) != null) {
                liveDialog2.dismiss();
            }
            if (i != 2) {
                if (i != 3) {
                    LJLIIL("other", this.LLIIII);
                } else {
                    LJLIIL("time_out", this.LLIIII);
                }
            } else {
                LJLIIL("cancelled", this.LLIIII);
            }
        } else {
            LinkDialog linkDialog5 = this.LLIIII;
            if (linkDialog5 != null && linkDialog5.isVisible()) {
                LinkDialog linkDialog6 = this.LLIIII;
                if (linkDialog6 != null) {
                    enumC76391TyV = linkDialog6.g6();
                } else {
                    enumC76391TyV = null;
                }
                if (enumC76391TyV != EnumC76391TyV.MULTI_MATCH_INVITE) {
                    LinkDialog linkDialog7 = this.LLIIII;
                    if (linkDialog7 != null) {
                        linkDialog7.dismiss();
                    }
                    LJLIIL("reject_by_other", this.LLIIII);
                }
            }
            LinkDialog linkDialog8 = this.LLIIIILZ;
            if (linkDialog8 != null) {
                linkDialog8.setOnDismissListener(U0W.LJLIL);
            }
            LinkDialog linkDialog9 = this.LLIIIILZ;
            if (linkDialog9 != null) {
                linkDialog9.dismiss();
            }
            LiveDialog liveDialog4 = this.LLIIIJ;
            if (liveDialog4 != null && liveDialog4.isShowing() && (liveDialog = this.LLIIIJ) != null) {
                liveDialog.dismiss();
            }
        }
        super.LJJIII();
        LinkDialog linkDialog10 = this.LLIIII;
        if (linkDialog10 == null) {
            return null;
        }
        return linkDialog10.g6();
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLLLLLL(AqS163S0100000_13 aqS163S0100000_13) {
        FragmentManager fragmentManager;
        LJJIII();
        MultiMatchAnchorWidget multiMatchAnchorWidget = (MultiMatchAnchorWidget) this.LJLIL;
        if (multiMatchAnchorWidget != null) {
            LinkDialog linkDialog = new LinkDialog(multiMatchAnchorWidget);
            linkDialog.Al(EnumC76391TyV.MULTI_MATCH_MATE_QUIT_REQUEST, new C76255TwJ(multiMatchAnchorWidget));
            linkDialog.setOnDismissListener(new IDDListenerS152S0100000_13(aqS163S0100000_13, 19));
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
            } else {
                fragmentManager = null;
            }
            linkDialog.show(fragmentManager, "LinkDialog");
            this.LLIIII = linkDialog;
        }
    }

    @Override // X.InterfaceC76363Ty3
    public final boolean LJIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, EnumC76319TxL source) {
        Context context;
        Context context2;
        o.LJIIIZ(source, "source");
        WIDGET widget = this.LJLIL;
        DialogC76479Tzv dialogC76479Tzv = null;
        if (widget != 0) {
            context = widget.context;
        } else {
            context = null;
        }
        if (context == null) {
            return false;
        }
        if (widget != 0 && (context2 = widget.context) != null) {
            dialogC76479Tzv = new DialogC76479Tzv(context2);
        }
        this.LLIILZL = dialogC76479Tzv;
        if (dialogC76479Tzv == null) {
            return true;
        }
        dialogC76479Tzv.LJLJI = source;
        dialogC76479Tzv.LJLILLLLZI = interfaceC65784Pro;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/match/ui/dialog/LinkPkGuideDialog", "show", dialogC76479Tzv, new Object[0], "void", new C65300Pk0(false, "()V", "-7763610618774951434")).LIZ) {
            return true;
        }
        dialogC76479Tzv.show();
        return true;
    }

    @Override // X.AbstractC76181Tv7
    public final void LJL(long j, String linkMicId) {
        List<C75883TqJ> list;
        o.LJIIIZ(linkMicId, "linkMicId");
        C76278Twg c76278Twg = this.LLII;
        c76278Twg.getClass();
        C76244Tw8 LJII = c76278Twg.LJII();
        long j2 = 0;
        if (LJII != null && (list = LJII.LIZJ) != null) {
            for (C75883TqJ c75883TqJ : list) {
                if (o.LJ(c75883TqJ.LJII, linkMicId)) {
                    j2 = c75883TqJ.LIZ;
                }
            }
        }
        if (j == 1 && ((IInteractService) CN1.LIZ(IInteractService.class)).Qe0() && c76278Twg.LJIL(212, j2, j)) {
            C76271TwZ.LIZ.LJJLIIIJLLLLLLLZ(j, j2, true);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeft leaveReason = ");
        LIZ.append(j);
        C0NB.LIZIZ("pk_interrupt", X1D.LIZIZ(LIZ));
    }

    public final void LJLIIL(String str, InterfaceC75854Tpq interfaceC75854Tpq) {
        Object obj;
        EnumC76391TyV g6;
        Long l;
        MutableLiveData<Long> mutableLiveData;
        Long l2;
        MutableLiveData<Long> mutableLiveData2;
        Long l3;
        MutableLiveData<Long> mutableLiveData3;
        Long l4 = null;
        if (interfaceC75854Tpq != null && (g6 = interfaceC75854Tpq.g6()) != null) {
            boolean z = true;
            if (C76392TyW.LIZ[g6.ordinal()] == 1) {
                C76280Twi c76280Twi = C76265TwT.LIZIZ;
                if (c76280Twi.LJ() != EnumC76178Tv4.ACCEPTED && c76280Twi.LJ() != EnumC76178Tv4.RECEIVED) {
                    z = false;
                }
                C76271TwZ.LIZ.LJJJJZI(str, z);
                int hashCode = str.hashCode();
                if (hashCode != -2077031716) {
                    if (hashCode != -1541508664) {
                        if (hashCode != 476588369 || !str.equals("cancelled")) {
                            return;
                        }
                        C76244Tw8 LJII = this.LLII.LJII();
                        if (LJII != null && (mutableLiveData3 = LJII.LIZ) != null) {
                            l3 = mutableLiveData3.getValue();
                        } else {
                            l3 = null;
                        }
                        String valueOf = String.valueOf(l3);
                        if (this.LLII.LJII() != null) {
                            l4 = Long.valueOf(C76244Tw8.LIZ());
                        }
                        C75642TmQ.LJJIIZI(valueOf, String.valueOf(l4), true, false, false, false, false);
                        return;
                    }
                    if (!str.equals("reject_by_other")) {
                        return;
                    }
                    C76244Tw8 LJII2 = this.LLII.LJII();
                    if (LJII2 != null && (mutableLiveData2 = LJII2.LIZ) != null) {
                        l2 = mutableLiveData2.getValue();
                    } else {
                        l2 = null;
                    }
                    String valueOf2 = String.valueOf(l2);
                    if (this.LLII.LJII() != null) {
                        l4 = Long.valueOf(C76244Tw8.LIZ());
                    }
                    C75642TmQ.LJJIIZI(valueOf2, String.valueOf(l4), false, false, false, true, false);
                    return;
                }
                if (!str.equals("time_out")) {
                    return;
                }
                C76244Tw8 LJII3 = this.LLII.LJII();
                if (LJII3 != null && (mutableLiveData = LJII3.LIZ) != null) {
                    l = mutableLiveData.getValue();
                } else {
                    l = null;
                }
                String valueOf3 = String.valueOf(l);
                if (this.LLII.LJII() != null) {
                    l4 = Long.valueOf(C76244Tw8.LIZ());
                }
                C75642TmQ.LJJIIZI(valueOf3, String.valueOf(l4), false, true, false, false, false);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("link dialog dismiss ");
        if (interfaceC75854Tpq == null || (obj = interfaceC75854Tpq.g6()) == null) {
            obj = "unknown";
        }
        LIZ.append(obj);
        C0NB.LJIIIZ("MultiMatchView", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLJJLL(BattleTeamResult battleTeamResult, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            Integer valueOf = Integer.valueOf(battleTeamResult.result);
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), true, true, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), true, true, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), false, true, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 210);
                    this.LLILL = aRunnableS49S0100000_13;
                    this.LLIIZ.postDelayed(aRunnableS49S0100000_13, 4000L);
                    ((C76284Twm) interfaceC65784Pro).invoke();
                    return;
                }
                if (valueOf.intValue() == 1) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), false, true, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), true, true, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), false, true, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 211);
                    this.LLILL = aRunnableS49S0100000_132;
                    this.LLIIZ.postDelayed(aRunnableS49S0100000_132, 4000L);
                    ((C76284Twm) interfaceC65784Pro).invoke();
                    return;
                }
            }
            LJJIZ().clearAnimation();
            LJJIZ().setVisibility(0);
            if (Build.VERSION.SDK_INT >= 26) {
                LJJIZ().useHardwareAcceleration(true);
            }
            Object parent = LJJIZ().getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            float LJIJ = (C15380j0.LJIJ(((View) parent).getWidth()) / 2.0f) - 120.0f;
            ViewGroup.LayoutParams layoutParams = LJJIZ().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C15380j0.LIZ(375.0f);
            marginLayoutParams.height = C15380j0.LIZ(220.0f);
            marginLayoutParams.bottomMargin = C15380j0.LIZ(LJIJ);
            LJJIZ().setLayoutParams(marginLayoutParams);
            if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
                AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(this, (C76284Twm) interfaceC65784Pro, 69);
                C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, null, null, 64);
                this.LLIIZ.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_13, 189), 4000L);
                return;
            }
            C76261TwP.LIZ = false;
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.rv0(BattleDrawTimeLeftChannel.class, 0L);
            }
            C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, new C1A8(), null, 64);
            C76284Twm c76284Twm = (C76284Twm) interfaceC65784Pro;
            AqS160S0200000_13 aqS160S0200000_132 = new AqS160S0200000_13(this, c76284Twm, 70);
            LJJLIL().setOnRematchClickListener(new ACListenerS47S0200000_13(this, c76284Twm, 44));
            this.LLIIZ.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_132, 189), 4000L);
            return;
        }
        int i = battleTeamResult.result;
        if (i == 0) {
            LJJLIIIJL(new AqS163S0100000_13(this, 478), true);
            LJJLIIIJJIZ(new AqS163S0100000_13(this, 479), false);
            ((C76284Twm) interfaceC65784Pro).invoke();
            return;
        }
        if (i == 1) {
            LJJLIIIJJIZ(new AqS163S0100000_13(this, 480), true);
            LJJLIIIJL(new AqS163S0100000_13(this, 481), false);
            ((C76284Twm) interfaceC65784Pro).invoke();
            return;
        }
        LJJIJIIJI().setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = LJJIJIIJI().getLayoutParams();
        layoutParams2.width = C15380j0.LJIIL();
        layoutParams2.height = (int) (C15380j0.LJIIL() * 0.54933333f);
        LJJIJIIJI().setLayoutParams(layoutParams2);
        if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
            AqS160S0200000_13 aqS160S0200000_133 = new AqS160S0200000_13(this, (C76284Twm) interfaceC65784Pro, 67);
            C15490jB.LJ(LJJIJIIJI(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_4"), "live_battle_draw_animation_2.webp");
            this.LLIIZ.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_133, 189), 2600L);
            return;
        }
        C76261TwP.LIZ = false;
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            LJJIIZI2.rv0(BattleDrawTimeLeftChannel.class, 0L);
        }
        C15540jG c15540jG = new C15540jG();
        c15540jG.LIZ = LJJIJIIJI();
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_4");
        c15540jG.LIZJ = "live_battle_draw_animation_2.webp";
        c15540jG.LJFF = true;
        c15540jG.LJIIJ = true;
        c15540jG.LJI = 1;
        c15540jG.LJ = new U09();
        C15490jB.LJI(c15540jG);
        C76284Twm c76284Twm2 = (C76284Twm) interfaceC65784Pro;
        AqS160S0200000_13 aqS160S0200000_134 = new AqS160S0200000_13(this, c76284Twm2, 68);
        LJJLIL().setOnRematchClickListener(new ACListenerS47S0200000_13(this, c76284Twm2, 43));
        this.LLIIZ.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_134, 189), 2400L);
    }

    public static final void LJLIL(Bitmap bitmap, C04750Gp c04750Gp, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 5;
        }
        if (c04750Gp != null && bitmap != null) {
            Bitmap roundedBitmap = C44999HlL.LIZ(bitmap);
            o.LJIIIIZZ(roundedBitmap, "roundedBitmap");
            c04750Gp.LJI = C78847Ux1.LJJL(c04750Gp.LIZ - i2, c04750Gp.LIZIZ - i2, roundedBitmap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r0 = r6.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r0 = r0.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r0 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r11 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r11.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r9 = r11.next();
        r0 = r9.LIZ;
        r2 = r10.getUserId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r0 != r2.longValue()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r1 = r6.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r1.qv0(com.bytedance.android.live.liveinteract.multimatch.event.LinkedUserLeftEvent.class, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r8 = r10;
     */
    @Override // X.AbstractC76181Tv7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ(java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r14, java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r15, com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r16) {
        /*
            r13 = this;
            X.Twg r6 = r13.LLII
            r6.getClass()
            r3 = 0
            r5 = 1
            r4 = 0
            if (r15 == 0) goto L81
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r12 = r15.iterator()
            r8 = r4
        L11:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r10 = r12.next()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r10 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r10
            java.util.Iterator r7 = r14.iterator()
        L21:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r7.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r1 = r0.getUserId()
            java.lang.Long r0 = r10.getUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L21
            if (r2 != 0) goto L11
        L3e:
            X.Tw8 r0 = r6.LJII()
            if (r0 == 0) goto L7f
            androidx.lifecycle.MutableLiveData<java.util.List<X.TqJ>> r0 = r0.LIZIZ
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L7f
            java.util.Iterator r11 = r0.iterator()
        L54:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r9 = r11.next()
            r0 = r9
            X.TqJ r0 = (X.C75883TqJ) r0
            long r0 = r0.LIZ
            java.lang.Long r2 = r10.getUserId()
            if (r2 != 0) goto L6a
            goto L54
        L6a:
            long r7 = r2.longValue()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L54
            if (r9 == 0) goto L7f
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LJI()
            if (r1 == 0) goto L7f
            java.lang.Class<com.bytedance.android.live.liveinteract.multimatch.event.LinkedUserLeftEvent> r0 = com.bytedance.android.live.liveinteract.multimatch.event.LinkedUserLeftEvent.class
            r1.qv0(r0, r9)
        L7f:
            r8 = r10
            goto L11
        L81:
            r8 = r4
        L82:
            int r0 = r14.size()
            r2 = 4
            if (r0 != r2) goto Ld2
        L89:
            P extends X.Ty3 r0 = r6.LIZLLL
            X.TxD r0 = (X.InterfaceC76311TxD) r0
            if (r0 == 0) goto L92
            r0.LJLLLL(r3)
        L92:
            X.Tw8 r0 = r6.LJII()
            if (r0 == 0) goto La5
            androidx.lifecycle.MutableLiveData<java.util.List<X.TqJ>> r1 = r0.LIZIZ
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = r6.LJI
            if (r0 == 0) goto Ld0
            java.util.List r0 = r0.LJIILJJIL()
        La2:
            r1.setValue(r0)
        La5:
            int r0 = r14.size()
            if (r0 != r2) goto Lcd
            java.util.Iterator r3 = r14.iterator()
        Laf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r1 = r0.getUserId()
            java.lang.Long r0 = r6.LJIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Laf
            if (r2 == 0) goto Lcd
            r6.LJJIJIL(r5)
        Lcd:
            r6.LJIJ = r4
            return
        Ld0:
            r0 = r4
            goto La2
        Ld2:
            if (r8 == 0) goto Le4
            java.lang.Long r0 = r8.getUserId()
            if (r0 == 0) goto Le4
            long r0 = r0.longValue()
        Lde:
            r7 = r16
            r6.LJJJJJ(r0, r7)
            goto L89
        Le4:
            r0 = 0
            goto Lde
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76469Tzl.LJJLJ(java.util.List, java.util.List, com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage):void");
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJLJLI(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        long j;
        C76278Twg c76278Twg = this.LLII;
        c76278Twg.getClass();
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = LIZIZ.getCurrentUserId();
        } else {
            j = 0;
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0() && c76278Twg.LJIL(103, j, i)) {
            C76271TwZ.LIZ.LJJLIIIJLJLI(i, true, i2, abnormalDisconnectReason);
        }
        C012403c.LJ("link_mic_finish finishReason = ", i, "pk_interrupt");
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLLJ(String str, boolean z, boolean z2) {
        C76280Twi c76280Twi;
        if (this.LJLIL == 0) {
            return;
        }
        LinkDialog linkDialog = this.LLIIII;
        if (linkDialog != null && linkDialog.isVisible()) {
            C75852Tpo.LIZIZ();
            LinkDialog linkDialog2 = this.LLIIII;
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        DialogC76479Tzv dialogC76479Tzv = this.LLIILZL;
        if (dialogC76479Tzv != null && dialogC76479Tzv.isShowing()) {
            dialogC76479Tzv.dismiss();
        }
        FragmentManager fragmentManager = null;
        this.LLIILZL = null;
        LinkDialog linkDialog3 = this.LLIIIILZ;
        if (linkDialog3 != null) {
            linkDialog3.setOnDismissListener(DialogInterfaceOnDismissListenerC76500U0q.LJLIL);
        }
        LinkDialog linkDialog4 = this.LLIIIILZ;
        if (linkDialog4 != null) {
            linkDialog4.dismiss();
        }
        LJJIII();
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76280Twi.getClass();
        MultiMatchAnchorWidget multiMatchAnchorWidget = (MultiMatchAnchorWidget) this.LJLIL;
        if (multiMatchAnchorWidget != null) {
            LinkDialog linkDialog5 = new LinkDialog(multiMatchAnchorWidget);
            linkDialog5.Al(EnumC76391TyV.MULTI_MATCH_BE_INVITED, new C76223Tvn(multiMatchAnchorWidget, z2, z ? 1 : 0, str));
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
            }
            linkDialog5.show(fragmentManager, "LinkDialog");
            this.LLIIII = linkDialog5;
        }
    }

    @Override // X.InterfaceC76311TxD
    public final void LJLJLJ(boolean z, EnumC76319TxL requestFrom, EnumC75644TmS showReason, EnumC76248TwC showReasonForRd) {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        LinkDialog linkDialog2;
        o.LJIIIZ(requestFrom, "requestFrom");
        o.LJIIIZ(showReason, "showReason");
        o.LJIIIZ(showReasonForRd, "showReasonForRd");
        if (this.LJLIL == 0) {
            return;
        }
        LinkDialog linkDialog3 = this.LLIIII;
        if (linkDialog3 != null && linkDialog3.g6() == EnumC76391TyV.MULTI_MATCH_INVITE && (linkDialog2 = this.LLIIII) != null && linkDialog2.isVisible()) {
            return;
        }
        LinkDialog linkDialog4 = this.LLIIII;
        if (linkDialog4 != null && linkDialog4.isVisible() && (linkDialog = this.LLIIII) != null) {
            linkDialog.dismiss();
        }
        if (z) {
            C76265TwT.LIZIZ.LJJJI = requestFrom;
        } else {
            C76265TwT.LIZ.LJJJI = requestFrom;
        }
        LinkDialog linkDialog5 = this.LLIIIILZ;
        if (linkDialog5 != null) {
            linkDialog5.setOnDismissListener(DialogInterfaceOnDismissListenerC76399Tyd.LJLIL);
        }
        LinkDialog linkDialog6 = this.LLIIIILZ;
        if (linkDialog6 != null) {
            linkDialog6.dismiss();
        }
        MultiMatchAnchorWidget multiMatchAnchorWidget = (MultiMatchAnchorWidget) this.LJLIL;
        if (multiMatchAnchorWidget != null && LJJIIZI() != null) {
            AqS3S0410000_13 aqS3S0410000_13 = new AqS3S0410000_13(this, z, requestFrom, showReason, showReasonForRd, 2);
            LinkDialog linkDialog7 = new LinkDialog(multiMatchAnchorWidget);
            linkDialog7.Al(EnumC76391TyV.MULTI_MATCH_INVITE, new C76236Tw0(multiMatchAnchorWidget, requestFrom, z, showReason, showReasonForRd, aqS3S0410000_13));
            this.LLIIII = linkDialog7;
            linkDialog7.setOnDismissListener(new DialogInterfaceOnDismissListenerC76394TyY(z));
            LinkDialog linkDialog8 = this.LLIIII;
            if (linkDialog8 != null) {
                DataChannel LJJIIZI = LJJIIZI();
                if (LJJIIZI != null) {
                    fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
                } else {
                    fragmentManager = null;
                }
                linkDialog8.show(fragmentManager, "LinkDialog");
            }
        }
    }
}

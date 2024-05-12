package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ACallableS90S0200000_13;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS49S0100000_13;
import Y.AfS29S0110000_13;
import Y.IDAListenerS43S0200000_13;
import Y.IDAListenerS6S0300000_13;
import Y.IDCListenerS164S0100000_13;
import Y.IDCListenerS209S0100000_13;
import Y.IDCListenerS53S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.event.CoHostApplyDialogShowEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortAniEndEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftEvent;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMatchItemGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXCreateEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXReuseEvent;
import com.bytedance.android.live.liveinteract.matchx.models.Combo;
import com.bytedance.android.live.liveinteract.matchx.models.EndAnimData;
import com.bytedance.android.live.liveinteract.matchx.models.EndAnimDetail;
import com.bytedance.android.live.liveinteract.matchx.models.MatchEndAnimDataFEMessageModel;
import com.bytedance.android.live.liveinteract.matchx.widget.MatchXWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.event.EndAnimStartEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchResumeEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.TwoMatchStartByOpenRequest;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOncemoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignSingleResultSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchXSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.livesetting.linkmic.match.TwoMatchProgressOptionalSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.j;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS16S1201000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS24S0310000_13;
import kotlin.jvm.internal.AqS68S0110000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76470Tzm extends AbstractC76181Tv7 implements InterfaceC76313TxF {
    public C47061t0 LLII;
    public C76805UCj LLIIII;
    public C80955Vpv LLIIIILZ;
    public U52 LLIIIJ;
    public U52 LLIIIL;
    public View LLIIIZ;
    public FrameLayout LLIIJI;
    public FrameLayout LLIIJLIL;
    public ARunnableS49S0100000_13 LLIIL;
    public LinkDialog LLIILZL;
    public LinkDialog LLIIZ;
    public Bitmap LLIL;
    public Bitmap LLILII;
    public Drawable LLILIL;
    public Drawable LLILL;
    public InteractDisconnectDialog LLILLIZIL;
    public DialogC77438UaI LLILLJJLI;
    public DialogC76479Tzv LLILLL;
    public Runnable LLILZLL;
    public final C76279Twh LLIILII = new C76279Twh();
    public final HandlerC28345BAn LLILZ = new HandlerC28345BAn(C16880lQ.LLJJJJ(), this);
    public final C73318Sq2 LLILZIL = new C73318Sq2();

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "TwoMatchWidgetImpl";
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIJ() {
        Long l;
        MutableLiveData<Long> mutableLiveData;
        try {
            C76244Tw8 LJII = this.LLIILII.LJII();
            Long l2 = null;
            if (LJII != null && (mutableLiveData = LJII.LIZ) != null) {
                l = mutableLiveData.getValue();
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            if (this.LLIILII.LJII() != null) {
                l2 = Long.valueOf(C76244Tw8.LIZ());
            }
            C75642TmQ.LJJIIZI(valueOf, String.valueOf(l2), true, false, false, false, false);
            LinkDialog linkDialog = this.LLIILZL;
            if (linkDialog != null) {
                linkDialog.dismiss();
            }
            LinkDialog linkDialog2 = this.LLIIZ;
            if (linkDialog2 != null) {
                linkDialog2.setOnDismissListener(DialogInterfaceOnDismissListenerC76496U0m.LJLIL);
            }
            LinkDialog linkDialog3 = this.LLIIZ;
            if (linkDialog3 != null) {
                linkDialog3.dismiss();
            }
        } catch (Exception e) {
            C0NB.LJII(e);
        }
    }

    @Override // X.AbstractC76473Tzp
    public final boolean LJJJJLL() {
        return true;
    }

    public final void LJLI() {
        C76261TwP.LIZ = false;
        LJJLIIJ().setVisibility(0);
        if (C76265TwT.LIZ.LJJJJLI) {
            LJJLIIJ().LJJLL(R.style.a2t);
        } else if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            LJJLIIJ().setMaxWidth(C15380j0.LJIIL() - LJJIIZ().LJI());
            LJJLIIJ().LJJLL(R.style.a36);
        } else {
            LJJLIIJ().LJJLL(R.style.a35);
        }
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            LJJLIIJ().setClickable(true);
        } else {
            LJJLIIJ().setEnabled(true);
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.REMATCH_BUTTON, true, null);
        C75832TpU.LIZ.LJJIZ(1, false, null);
    }

    @Override // X.InterfaceC76313TxF
    public final void LJI() {
        DialogC77438UaI dialogC77438UaI = this.LLILLJJLI;
        if (dialogC77438UaI != null && dialogC77438UaI.isShowing()) {
            dialogC77438UaI.dismiss();
        }
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJZ() {
        C76279Twh c76279Twh = this.LLIILII;
        c76279Twh.getClass();
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBattleClick, state = ");
        LIZ.append(LJ);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        C75832TpU c75832TpU = C75832TpU.LIZ;
        EnumC76319TxL enumC76319TxL = EnumC76319TxL.PK_ICON;
        c75832TpU.LJJIIZ(enumC76319TxL.getValue(), false, true);
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
        if (LJ2 == enumC76178Tv4) {
            if (TwoMatchProgressOptionalSetting.INSTANCE.getValue()) {
                InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) c76279Twh.LIZLLL;
                if (interfaceC76313TxF != null) {
                    interfaceC76313TxF.LJIIIIZZ(new AqS163S0100000_13(c76279Twh, 276), new AqS163S0100000_13(c76279Twh, 277), true);
                    return;
                }
                return;
            }
            c76279Twh.LJIJJLI(true);
            return;
        }
        EnumC76178Tv4 enumC76178Tv42 = EnumC76178Tv4.RECEIVED;
        if (LJ2 == enumC76178Tv42) {
            C30868C9o.LIZJ(R.string.mp_);
            return;
        }
        if (LJ == EnumC76178Tv4.NORMAL) {
            c76279Twh.LJIL(enumC76319TxL);
            return;
        }
        if (LJ == enumC76178Tv4) {
            if (TwoMatchProgressOptionalSetting.INSTANCE.getValue()) {
                InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) c76279Twh.LIZLLL;
                if (interfaceC76313TxF2 == null) {
                    return;
                }
                interfaceC76313TxF2.LJIIIIZZ(new AqS163S0100000_13(c76279Twh, 278), new AqS163S0100000_13(c76279Twh, 279), false);
                return;
            }
            c76279Twh.LJIJJLI(false);
            return;
        }
        if (LJ == enumC76178Tv42) {
            C30868C9o.LIZJ(R.string.mp_);
            return;
        }
        if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.FINISH) < 0) {
            InterfaceC76313TxF interfaceC76313TxF3 = (InterfaceC76313TxF) c76279Twh.LIZLLL;
            if (interfaceC76313TxF3 != null) {
                interfaceC76313TxF3.LJIILL(new AqS163S0100000_13(c76279Twh, 281));
            }
            c75832TpU.LJJIJIL(0, false, null);
            return;
        }
        if (EnumC76178Tv4.PUNISH.compareTo(LJ) > 0 || LJ.compareTo(EnumC76178Tv4.DRAW) >= 0) {
            return;
        }
        c76279Twh.LJJIJIIJIL(101, true, null);
    }

    public final void LJLIIL() {
        InteractDisconnectDialog interactDisconnectDialog = this.LLILLIZIL;
        if (interactDisconnectDialog != null && interactDisconnectDialog.isShowing()) {
            interactDisconnectDialog.dismiss();
        }
        this.LLILLIZIL = null;
    }

    @Override // X.InterfaceC76313TxF
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
                i2 = frameLayout2.getHeight();
            }
            return (i2 - C15380j0.LIZ(38.0f)) + i;
        }
        return -1;
    }

    public final void LJLZ() {
        C76414Tys c76414Tys;
        U46 u46 = this.LJZL;
        if (u46 != null && u46.getVisibility() == 0) {
            U46 u462 = this.LJZL;
            if (u462 != null) {
                u462.LJIIJ();
            }
            C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
            if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
                c76414Tys.LJI();
            }
            LJJIJL().setTranslationY(0.0f);
            LJJIJIIJIL().setTranslationY(0.0f);
            U52 u52 = this.LLIIIJ;
            if (u52 != null) {
                u52.setTranslationY(0.0f);
                U52 u522 = this.LLIIIL;
                if (u522 != null) {
                    u522.setTranslationY(0.0f);
                    C29306Beo.LJI(this.LJZL);
                    LJJLIIJ().LJJLL(R.style.a35);
                    return;
                }
                o.LJIJI("rightAnimationStreaks");
                throw null;
            }
            o.LJIJI("leftAnimationStreaks");
            throw null;
        }
    }

    public final void LJZI() {
        String str;
        int i;
        ViewOnClickListenerC76430Tz8 LJLZ;
        Room LJJJJI;
        User owner;
        C29306Beo.LJJLJLI(this.LJZL);
        Context context = null;
        View view = null;
        for (C75883TqJ c75883TqJ : C8E.LIZLLL().LJIL()) {
            WIDGET widget = this.LJLIL;
            if (widget != 0 && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null && ((LJJJJI = LJJJJI()) == null || (owner = LJJJJI.getOwner()) == null || owner.getId() != c75883TqJ.LIZ)) {
                view = LJLZ.findViewById(R.id.dc6);
            }
        }
        DataChannel LJJIIZI = LJJIIZI();
        WIDGET widget2 = this.LJLIL;
        if (widget2 != 0) {
            context = widget2.getContext();
        }
        C75838Tpa c75838Tpa = new C75838Tpa(LJJIIZI, context, view);
        U46 u46 = this.LJZL;
        if (u46 != null) {
            u46.setVictoryLapActivityListener(c75838Tpa);
        }
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = C76265TwT.LIZ.LJJJLIIL;
        if (battleTruthOrDareTriggerGuideV2 == null || (str = battleTruthOrDareTriggerGuideV2.anchorContentKey) == null) {
            str = "";
        }
        if (battleTruthOrDareTriggerGuideV2 != null) {
            i = battleTruthOrDareTriggerGuideV2.guideDurationSecond;
        } else {
            i = 5;
        }
        U46 u462 = this.LJZL;
        if (u462 != null) {
            u462.LJII(i, str);
        }
    }

    @Override // X.InterfaceC76313TxF
    public final long LIZ() {
        return B5G.LIZIZ().LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r0 = r0.nickName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r1 = X.C05170If.LIZIZ(r1, r5);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "username");
        X.C30868C9o.LJI(ujb.s.LJLIL(r3, 0, r2, r1).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r0 != null) goto L26;
     */
    @Override // X.InterfaceC76313TxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r7 = this;
            r7.LJLZ()
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r7.LJJIIZI()
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent> r1 = com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent.class
            X.Bod r0 = new X.Bod
            r0.<init>(r4)
            r2.rv0(r1, r0)
        L14:
            X.Twi r6 = X.C76265TwT.LIZ
            com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice r0 = r6.LJJJLZIJ
            java.lang.String r5 = ""
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.closeContentKey
            if (r1 != 0) goto L21
        L20:
            r1 = r5
        L21:
            X.Y7x r0 = X.C86881Y7x.LIZIZ()
            java.lang.String r3 = r0.LIZ(r1)
            if (r3 != 0) goto L2c
            r3 = r5
        L2c:
            boolean r0 = ujb.o.LJJJJJL(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
            java.lang.String r1 = "}"
            r0 = 6
            int r0 = ujb.s.LJJLIIIJL(r3, r1, r4, r4, r0)
            int r2 = r0 + 1
            int r0 = r3.length()
            if (r2 >= r0) goto L6e
            if (r2 <= 0) goto L6e
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r0 = r6.LJFF()
            if (r0 == 0) goto L71
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r0.user
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.displayId
            if (r1 != 0) goto L56
        L53:
            r1 = r5
            if (r0 == 0) goto L5a
        L56:
            java.lang.String r0 = r0.nickName
            if (r0 != 0) goto L6f
        L5a:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r5)
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.CharSequence r0 = ujb.s.LJLIL(r3, r4, r2, r1)
            java.lang.String r0 = r0.toString()
            X.C30868C9o.LJI(r0)
        L6e:
            return
        L6f:
            r5 = r0
            goto L5a
        L71:
            r0 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76470Tzm.LJ():void");
    }

    @Override // X.InterfaceC76313TxF
    public final long LJFF() {
        Object obj;
        User owner;
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (true) {
            if (LIZLLL.hasNext()) {
                obj = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                Room LJJJJI = LJJJJI();
                if (LJJJJI == null || (owner = LJJJJI.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            return c75883TqJ2.LIZ;
        }
        return 0L;
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIILIIL() {
        C76474Tzq c76474Tzq;
        C76414Tys c76414Tys;
        Long l;
        User owner;
        BattleComboInfo battleComboInfo;
        ViewOnClickListenerC76430Tz8 LJLZ;
        DataChannel LJJIIZI;
        LJJIII();
        if (LJJIJ().getView() != null) {
            LJJIJ().getView().setVisibility(0);
            LJJIJ().LIZJ();
            LJJI(2, true);
        }
        if (LiveMatchXSetting.INSTANCE.isEnable() && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.qv0(MatchXReuseEvent.class, L65.END_ANIMATION);
        }
        LJLZ();
        LJLIIIL();
        if (!C8E.LIZLLL().LJJIJ()) {
            C76280Twi c76280Twi = C76265TwT.LIZ;
            BattleUserInfo LIZLLL = c76280Twi.LIZLLL();
            BattleUserInfo LJFF = c76280Twi.LJFF();
            WIDGET widget = this.LJLIL;
            if (widget != 0 && (c76474Tzq = (C76474Tzq) widget.findViewById(R.id.fkb)) != null) {
                c76474Tzq.LJFF(LIZLLL, LJFF);
                c76474Tzq.LJI(new AqS160S0200000_13(c76474Tzq, this, 76), new AqS160S0200000_13(c76474Tzq, this, 77));
            }
        }
        C0NB.LIZIZ("TwoMatchView", "pk combo showWinningStreakTips");
        WIDGET widget2 = this.LJLIL;
        if (widget2 != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator LIZLLL2 = C08880Wm.LIZLLL();
            while (LIZLLL2.hasNext()) {
                C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL2.next();
                java.util.Map<Long, BattleComboInfo> map = C76265TwT.LIZ.LJIJJLI;
                if (map != null) {
                    battleComboInfo = map.get(Long.valueOf(c75883TqJ.LIZ));
                } else {
                    battleComboInfo = null;
                }
                WIDGET widget3 = this.LJLIL;
                if (widget3 != 0 && (LJLZ = widget3.LJLZ(c75883TqJ.LIZ)) != null) {
                    LJLZ.LJLL(battleComboInfo, new AqS144S0200000_13(this, battleComboInfo, 75));
                    arrayList.add(LJLZ);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("showWinningStreakTips uid=");
                    LIZ.append(c75883TqJ.LIZ);
                    LIZ.append(" window miss");
                    C0NB.LJ("TwoMatchView", X1D.LIZIZ(LIZ));
                }
            }
            java.util.Map<Long, BattleComboInfo> map2 = C76265TwT.LIZ.LJIJJLI;
            if (map2 != null) {
                Room LJJJJI = LJJJJI();
                if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null) {
                    l = Long.valueOf(owner.getId());
                } else {
                    l = null;
                }
                if (map2.get(l) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) widget2.findViewById(R.id.fxp);
                    C47121t6 winningStreakTv = (C47121t6) widget2.findViewById(R.id.fxq);
                    o.LJIIIIZZ(winningStreakTv, "winningStreakTv");
                    LJJII(winningStreakTv);
                    constraintLayout.setVisibility(0);
                    VA9 va9 = (VA9) widget2.findViewById(R.id.fxo);
                    ((V92) va9.getHierarchy()).LJIILJJIL(InterfaceC78716Uuu.LJJJLZIJ);
                    C15490jB.LJ(va9, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_match_winning_streak_tip_bg.png");
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setDuration(320L);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 1.0f);
                    ofFloat2.setDuration(1480L);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat3.setDuration(320L);
                    animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
                    animatorSet.addListener(new IDAListenerS6S0300000_13(arrayList, constraintLayout, this, 3));
                    animatorSet.start();
                }
            }
            C0NB.LIZIZ("TwoMatchView", "curAnchorCombo pk combo empty or battleTaskEnterRoomPrompt null");
        }
        LJZ();
        C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
        if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
            c76414Tys.setVisibility(0);
        }
        LJJIJIIJIL().setVisibility(8);
        LJJIJL().setVisibility(8);
        LJJIJIL().setVisibility(8);
        LJJIJLIJ().setVisibility(8);
        FrameLayout frameLayout = this.LLIIJLIL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.LLIIJLIL;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        if (LJJIL().getVisibility() != 0) {
            C75832TpU.LIZ.LJJII(null, true, false);
        }
        LJJIL().setVisibility(0);
        LJJLIIJ().setVisibility(8);
        LJJIIZ().getView().setVisibility(0);
        LJJIIZ().start();
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            LJJIIZI2.qv0(MatchGiftEvent.class, new U0H(U0G.MATCH, U05.START, 4));
        }
        LJJIL().post(new ARunnableS49S0100000_13(this, 206));
        LJJLIIIJ();
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIIZILJ() {
        BattleComboInfo battleComboInfo;
        BattleComboInfo battleComboInfo2;
        ViewOnClickListenerC76430Tz8 LJLZ;
        C76414Tys c76414Tys;
        BattleComboInfo battleComboInfo3;
        ViewOnClickListenerC76430Tz8 LJLZ2;
        DataChannel LJJIIZI;
        Long l;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l2;
        BattleBaseUserInfo battleBaseUserInfo2;
        LJJIII();
        C76280Twi c76280Twi = C76265TwT.LIZ;
        BattleUserInfo LIZLLL = c76280Twi.LIZLLL();
        BattleUserInfo LJFF = c76280Twi.LJFF();
        java.util.Map<Long, BattleComboInfo> map = c76280Twi.LJIJJLI;
        if (map != null) {
            if (LIZLLL != null && (battleBaseUserInfo2 = LIZLLL.user) != null) {
                l2 = battleBaseUserInfo2.userId;
            } else {
                l2 = null;
            }
            battleComboInfo = map.get(l2);
        } else {
            battleComboInfo = null;
        }
        java.util.Map<Long, BattleComboInfo> map2 = c76280Twi.LJIJJLI;
        if (map2 != null) {
            if (LJFF != null && (battleBaseUserInfo = LJFF.user) != null) {
                l = battleBaseUserInfo.userId;
            } else {
                l = null;
            }
            battleComboInfo2 = map2.get(l);
        } else {
            battleComboInfo2 = null;
        }
        LJLIL(battleComboInfo, false);
        LJLIL(battleComboInfo2, true);
        if (LJJIJ().getView() != null) {
            LJJIJ().getView().setVisibility(0);
            LJJIJ().LIZJ();
            LJJI(2, true);
        }
        if (LiveMatchXSetting.INSTANCE.isEnable() && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.qv0(MatchXReuseEvent.class, L65.END_ANIMATION);
        }
        LJLZ();
        LJLIIIL();
        C0NB.LIZIZ("TwoMatchView", "pk combo set");
        if (this.LJLIL != 0) {
            Iterator LIZLLL2 = C08880Wm.LIZLLL();
            while (LIZLLL2.hasNext()) {
                C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL2.next();
                java.util.Map<Long, BattleComboInfo> map3 = C76265TwT.LIZ.LJIJJLI;
                if (map3 != null) {
                    battleComboInfo3 = map3.get(Long.valueOf(c75883TqJ.LIZ));
                } else {
                    battleComboInfo3 = null;
                }
                WIDGET widget = this.LJLIL;
                if (widget != 0 && (LJLZ2 = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                    LJLZ2.LJLJJLL(battleComboInfo3, new AqS144S0200000_13(this, battleComboInfo3, 74));
                }
            }
        }
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            LJJIIZI2.pv0(MatchCutShortAniEndEvent.class);
        }
        C76280Twi c76280Twi2 = C76265TwT.LIZ;
        BattleUserInfo LIZLLL3 = c76280Twi2.LIZLLL();
        BattleUserInfo LJFF2 = c76280Twi2.LJFF();
        LJJJJIZL().clearAnimation();
        if (Build.VERSION.SDK_INT >= 26) {
            LJJJJIZL().useHardwareAcceleration(true);
        }
        LJJJJIZL().setFrame(0);
        LJJJJIZL().removeAllAnimatorListeners();
        C29701Eo LJJJJIZL = LJJJJIZL();
        LJJJJIZL.addAnimatorListener(new IDAListenerS43S0200000_13(LJJJJIZL, this, 13));
        C15490jB.LJIIIZ(LJJJJIZL(), "tiktok_live_match_redesign_resource", "ttlive_match_start_ani_two.zip", "images", true, new U06(this), new AqS117S0300000_13(this, LIZLLL3, LJFF2, 16));
        LJZ();
        C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
        if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
            c76414Tys.setVisibility(0);
        }
        LJJJJJL();
        Runnable runnable = this.LLILZLL;
        if (runnable != null) {
            this.LLILZ.removeCallbacks(runnable);
        }
        LJJIJIIJIL().setVisibility(8);
        LJJIJL().setVisibility(8);
        LJJIJIL().setVisibility(8);
        LJJIJLIJ().setVisibility(8);
        FrameLayout frameLayout = this.LLIIJLIL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.LLIIJLIL;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        if (LJJJ().getVisibility() != 0) {
            C75832TpU.LIZ.LJJII(null, true, false);
        }
        Iterator LIZLLL4 = C08880Wm.LIZLLL();
        while (LIZLLL4.hasNext()) {
            C75883TqJ c75883TqJ2 = (C75883TqJ) LIZLLL4.next();
            WIDGET widget2 = this.LJLIL;
            if (widget2 != 0 && (LJLZ = widget2.LJLZ(c75883TqJ2.LIZ)) != null) {
                View findViewById = LJLZ.findViewById(R.id.dc6);
                o.LJIIIIZZ(findViewById, "window.findViewById(R.id.fl_anchor_info)");
                View findViewById2 = LJLZ.findViewById(R.id.f7k);
                o.LJIIIIZZ(findViewById2, "window.findViewById(R.id.iv_mute_status_new)");
                findViewById.setAlpha(0.0f);
                findViewById2.setAlpha(0.0f);
            }
        }
        LJJJ().setVisibility(0);
        LJJJ().setAlpha(0.0f);
        LJJLIIJ().setVisibility(8);
        LJJIIZ().getView().setVisibility(0);
        LJJIIZ().start();
        LJJIIZ().LIZLLL(LJJIIZI(), false, false);
        DataChannel LJJIIZI3 = LJJIIZI();
        if (LJJIIZI3 != null) {
            LJJIIZI3.qv0(MatchGiftEvent.class, new U0H(U0G.MATCH, U05.START, 4));
        }
        LJJJ().post(new ARunnableS49S0100000_13(this, 207));
        LJJLIIIJ();
    }

    @Override // X.InterfaceC76313TxF
    public final long LJIL() {
        Object obj;
        User owner;
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (true) {
            if (LIZLLL.hasNext()) {
                obj = LIZLLL.next();
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                Room LJJJJI = LJJJJI();
                if (LJJJJI == null || (owner = LJJJJI.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
        if (c75883TqJ2 != null) {
            return c75883TqJ2.LIZIZ;
        }
        return 0L;
    }

    @Override // X.AbstractC76181Tv7, X.AbstractC76473Tzp
    public final void LJJJJL() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        WIDGET widget;
        Context context;
        super.LJJJJL();
        WIDGET widget2 = this.LJLIL;
        View view = null;
        if (widget2 != 0) {
            View findViewById = widget2.findViewById(R.id.hqk);
            o.LJIIIIZZ(findViewById, "it.findViewById(R.id.pk_anim_bg)");
            this.LLIIIZ = findViewById;
            View findViewById2 = widget2.findViewById(R.id.ezx);
            o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.iv_center_battle_start_2)");
            this.LLII = (C47061t0) findViewById2;
            this.LLIIIILZ = (C80955Vpv) widget2.findViewById(R.id.dbd);
            if (!C76128TuG.LIZIZ(LJJIIZI(), false, 6)) {
                C80955Vpv c80955Vpv = this.LLIIIILZ;
                if (c80955Vpv != null) {
                    c80955Vpv.setVisibility(0);
                }
                C76805UCj c76805UCj = (C76805UCj) widget2.findViewById(R.id.fke);
                this.LLIIII = c76805UCj;
                if (c76805UCj != null) {
                    c76805UCj.LJFF(LJJIIZI());
                }
            } else {
                C80955Vpv c80955Vpv2 = this.LLIIIILZ;
                if (c80955Vpv2 != null) {
                    c80955Vpv2.setVisibility(8);
                }
                this.LLIIII = null;
            }
            View findViewById3 = widget2.findViewById(R.id.nj6);
            o.LJIIIIZZ(findViewById3, "it.findViewById(R.id.win…t_below_result_animation)");
            this.LLIIIJ = (U52) findViewById3;
            View findViewById4 = widget2.findViewById(R.id.nj7);
            o.LJIIIIZZ(findViewById4, "it.findViewById(R.id.win…t_below_result_animation)");
            this.LLIIIL = (U52) findViewById4;
            if (C76128TuG.LIZIZ(LJJIIZI(), false, 6)) {
                this.LLIIJI = (FrameLayout) widget2.findViewById(R.id.flr);
            } else {
                this.LLIIJI = (FrameLayout) widget2.findViewById(R.id.fh1);
            }
            this.LLIIJLIL = (FrameLayout) widget2.findViewById(R.id.fjl);
            C16880lQ.LJJIII(LJJLIIJ(), new ACListenerS33S0100000_13(this, 178));
            LiveMatchXSetting liveMatchXSetting = LiveMatchXSetting.INSTANCE;
            if (liveMatchXSetting.isEnable()) {
                widget2.enableSubWidgetManager();
                RecyclableWidgetManager recyclableWidgetManager = widget2.subWidgetManager;
                if (recyclableWidgetManager != null) {
                    recyclableWidgetManager.load(R.id.gf5, MatchXWidget.class, false);
                }
                String lynxUrl = liveMatchXSetting.getLynxUrl();
                DataChannel LJJIIZI = LJJIIZI();
                if (LJJIIZI != null) {
                    LJJIIZI.qv0(MatchXCreateEvent.class, new OSZ(lynxUrl, L65.END_ANIMATION));
                }
            }
            WIDGET widget3 = this.LJLIL;
            if (widget3 != 0 && widget3.context != null && LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && (widget = this.LJLIL) != 0 && (context = widget.context) != null) {
                this.LLILIL = C04270Et.LIZIZ(context, R.drawable.d8a);
                this.LLILL = C04270Et.LIZIZ(context, R.drawable.d89);
            }
        }
        List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
        if (LJIL == null || LJIL.size() < 2) {
            return;
        }
        long j = ((C75883TqJ) ListProtector.get(LJIL, 1)).LIZ;
        WIDGET widget4 = this.LJLIL;
        if (widget4 != 0 && (LJLZ = widget4.LJLZ(j)) != null) {
            view = LJLZ.findViewById(R.id.bcl);
        }
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 == null) {
            return;
        }
        LJJIIZI2.qv0(MatchGiftEvent.class, new U0H(U0G.CONTAINER, U05.NORMAL, (WeakReference<View>) new WeakReference(view)));
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZI() {
        boolean z;
        DataChannel LJJIIZI;
        U8H LJJZZI;
        LJJJJ().LIZIZ();
        this.LLILZIL.LIZLLL();
        C0NB.LIZIZ("TwoMatchView", "onDestroy");
        LJJIJ();
        if (LJJIJ().getView() != null) {
            LJJIJ().onDestroy();
        }
        DialogC76479Tzv dialogC76479Tzv = this.LLILLL;
        if (dialogC76479Tzv != null && dialogC76479Tzv.isShowing()) {
            dialogC76479Tzv.dismiss();
        }
        this.LLILLL = null;
        LJLIIL();
        DialogC77438UaI dialogC77438UaI = this.LLILLJJLI;
        if (dialogC77438UaI != null && dialogC77438UaI.isShowing()) {
            dialogC77438UaI.dismiss();
        }
        LJJIIJZLJL();
        LJJIIJ();
        LinkDialog linkDialog = this.LLIILZL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        LinkDialog linkDialog2 = this.LLIIZ;
        if (linkDialog2 != null) {
            linkDialog2.setOnDismissListener(DialogInterfaceOnDismissListenerC76495U0l.LJLIL);
        }
        LinkDialog linkDialog3 = this.LLIIZ;
        if (linkDialog3 != null) {
            linkDialog3.dismiss();
        }
        C0NB.LIZIZ("pk_interrupt", "widget destroy ");
        Room LJJJJI = LJJJJI();
        if (LJJJJI != null && B5G.LIZIZ().LJJIZ == LJJJJI.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        LJLILLLLZI(104, !z, C76504U0u.LJLIL);
        LJJLI(true);
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
            LJJZZI.LJJZ(0L);
        }
        this.LLIILII.LIZLLL();
        LJJJJ().LIZIZ();
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            LJJIIZI2.jv0(this);
        }
        Object obj = this.LJLIL;
        if (obj != null && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.jv0(obj);
        }
        this.LLILZ.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2 == X.EnumC76391TyV.TYPE_PK_BE_INVITED) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL() {
        /*
            r3 = this;
            r3.LJLIIL()
            r3.LJJIIJZLJL()
            r3.LJJIIJ()
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r3.LLIILZL
            r2 = 0
            if (r0 == 0) goto L3a
            X.TyV r1 = r0.g6()
        L12:
            X.TyV r0 = X.EnumC76391TyV.TYPE_PK_INVITE
            if (r1 == r0) goto L22
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r3.LLIILZL
            if (r0 == 0) goto L1e
            X.TyV r2 = r0.g6()
        L1e:
            X.TyV r0 = X.EnumC76391TyV.TYPE_PK_BE_INVITED
            if (r2 != r0) goto L29
        L22:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r3.LLIILZL
            if (r0 == 0) goto L29
            r0.dismiss()
        L29:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r1 = r3.LLIIZ
            if (r1 == 0) goto L32
            X.U0j r0 = X.DialogInterfaceOnDismissListenerC76493U0j.LJLIL
            r1.setOnDismissListener(r0)
        L32:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r3.LLIIZ
            if (r0 == 0) goto L39
            r0.dismiss()
        L39:
            return
        L3a:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76470Tzm.LJLIIIL():void");
    }

    @Override // X.InterfaceC76313TxF
    public final void LJLJJI() {
        View view;
        ViewOnClickListenerC76430Tz8 LJLZ;
        InterfaceC55235Lm3 LJFF;
        IInteractTitleAbility iInteractTitleAbility;
        C76414Tys c76414Tys;
        DataChannel LJJIIZI;
        LJJIII();
        LJJLI(true);
        LJJLIIIJLLLLLLLZ();
        if (LiveMatchXSetting.INSTANCE.isEnable() && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.qv0(MatchXReuseEvent.class, L65.END_ANIMATION);
        }
        LJJJJJL();
        Runnable runnable = this.LLILZLL;
        if (runnable != null) {
            this.LLILZ.removeCallbacks(runnable);
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
        C47061t0 c47061t0 = this.LLII;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
            LJJIJIIJI().setVisibility(8);
            LJJIZ().setVisibility(8);
            LJJIJIIJIL().setVisibility(8);
            LJJIJL().setVisibility(8);
            LJJIJIL().setVisibility(8);
            LJJIJLIJ().setVisibility(8);
            LJJIL().setVisibility(8);
            LJJJ().setVisibility(8);
            LJJLIIJ().setVisibility(8);
            LJJIIZ().getView().setVisibility(8);
            LJJIIZ().LIZIZ();
            FrameLayout frameLayout = this.LLIIJLIL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.LLIIJLIL;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            if (C76265TwT.LIZ.LJJJJLI) {
                ARunnableS49S0100000_13 aRunnableS49S0100000_13 = this.LLIIL;
                if (aRunnableS49S0100000_13 != null) {
                    this.LLILZ.removeCallbacks(aRunnableS49S0100000_13);
                }
                LJLZ();
            }
            Iterator LIZLLL = C08880Wm.LIZLLL();
            while (LIZLLL.hasNext()) {
                C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
                WIDGET widget2 = this.LJLIL;
                if (widget2 != 0 && (LJLZ = widget2.LJLZ(c75883TqJ.LIZ)) != null) {
                    LJLZ.LJJLL();
                }
            }
            LJJI(2, false);
            DialogC76479Tzv dialogC76479Tzv = this.LLILLL;
            if (dialogC76479Tzv != null && dialogC76479Tzv.isShowing()) {
                dialogC76479Tzv.dismiss();
            }
            DataChannel LJJIIZI2 = LJJIIZI();
            if (LJJIIZI2 != null) {
                LJJIIZI2.qv0(MatchGiftEvent.class, new U0H(U0G.MATCH, U05.END, 4));
            }
            DialogC77438UaI dialogC77438UaI = this.LLILLJJLI;
            if (dialogC77438UaI != null && dialogC77438UaI.isShowing()) {
                dialogC77438UaI.dismiss();
            }
            LJLIIL();
            LJJIIJZLJL();
            LJJIIJ();
            return;
        }
        o.LJIJI("ivCenterAnimation");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public final void LJZ() {
        int i;
        Context context;
        Integer num;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null && (num = (Integer) LJJIIZI.kv0(C75575TlL.class)) != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C68322mC c68322mC = new C68322mC();
        ?? notShowAgain = InterfaceC30442Bx8.LLIILZL.LIZJ();
        c68322mC.element = notShowAgain;
        if (i == 2) {
            o.LJIIIIZZ(notShowAgain, "notShowAgain");
            if (((Boolean) notShowAgain).booleanValue()) {
                this.LLIILII.LJIIZILJ();
                C0NB.LJIIIZ("TwoMatchView", "will show gift guide , not show again");
                return;
            }
            WIDGET widget = this.LJLIL;
            if (widget != 0) {
                context = widget.context;
            } else {
                context = null;
            }
            C77437UaH c77437UaH = new C77437UaH(context);
            c77437UaH.LJJII = false;
            c77437UaH.LJI(R.string.moa);
            c77437UaH.LJ(R.string.moe, new IDCListenerS53S0200000_13(c68322mC, this, 5), false);
            c77437UaH.LIZJ(R.string.mod, new IDCListenerS164S0100000_13(c68322mC, 11), false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.cvo);
            c77437UaH.LJIJ = imageView;
            c77437UaH.LJJI = 46;
            c77437UaH.LJJIFFI = 48;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cxj, C16880lQ.LLZIL(context), null);
            View findViewById = LLLZIIL.findViewById(R.id.b_d);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.check_box)");
            CompoundButton compoundButton = (CompoundButton) findViewById;
            View findViewById2 = LLLZIIL.findViewById(R.id.m2v);
            o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_content)");
            ((TextView) findViewById2).setText(R.string.mob);
            compoundButton.setText(R.string.moc);
            compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(c68322mC, 9));
            c77437UaH.LJIJI = LLLZIIL;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            this.LLILLJJLI = LIZ;
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6244975011521867267")).LIZ) {
                return;
            }
            LIZ.show();
        }
    }

    @Override // X.InterfaceC76363Ty3
    public final MatchBaseWidget LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC76313TxF
    public final void LIZJ(boolean z) {
        ViewStub viewStub;
        View inflate;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJJJJLI && !c76280Twi.LJJJJZ && c76280Twi.LJIIIIZZ()) {
            if (this.LJZL == null) {
                WIDGET widget = this.LJLIL;
                U46 u46 = null;
                if (widget != 0 && (viewStub = (ViewStub) widget.findViewById(R.id.fno)) != null && (inflate = viewStub.inflate()) != null) {
                    u46 = (U46) inflate.findViewById(R.id.fnm);
                }
                this.LJZL = u46;
            }
            if (z) {
                c76280Twi.LJJJJZ = true;
                C0NB.LJIIIZ("TwoMatchView", " trigger animator normal play ");
                LJZI();
                return;
            }
            c76280Twi.LJJJJZ = true;
            C0NB.LJIIIZ("TwoMatchView", " trigger animator delay play ");
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = this.LLIIL;
            if (aRunnableS49S0100000_13 != null) {
                this.LLILZ.removeCallbacks(aRunnableS49S0100000_13);
            }
            ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 208);
            this.LLIIL = aRunnableS49S0100000_132;
            this.LLILZ.postDelayed(aRunnableS49S0100000_132, 2000L);
        }
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIIJ(LinkMicBattleMessage message) {
        o.LJIIIZ(message, "message");
        C30868C9o.LIZJ(R.string.moj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r1 == r0) goto L16;
     */
    @Override // X.InterfaceC76313TxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r7) {
        /*
            r6 = this;
            WIDGET extends com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r6.LJLIL
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            if (r7 != r0) goto L7b
            X.Twi r0 = X.C76265TwT.LIZIZ
            long r3 = r0.LIZIZ()
        Le:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r6.LLIILZL
            r2 = 0
            if (r0 == 0) goto L2e
            X.TyV r1 = X.EnumC76391TyV.TYPE_PK_BE_INVITED
            X.TyV r0 = r0.g6()
            if (r1 == r0) goto L27
            X.TyV r1 = X.EnumC76391TyV.TYPE_PK_INVITE
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r6.LLIILZL
            if (r0 == 0) goto L79
            X.TyV r0 = r0.g6()
        L25:
            if (r1 != r0) goto L2e
        L27:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r6.LLIILZL
            if (r0 == 0) goto L2e
            r0.dismiss()
        L2e:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r1 = r6.LLIIZ
            if (r1 == 0) goto L37
            X.U0k r0 = X.DialogInterfaceOnDismissListenerC76494U0k.LJLIL
            r1.setOnDismissListener(r0)
        L37:
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r0 = r6.LLIIZ
            if (r0 == 0) goto L3e
            r0.dismiss()
        L3e:
            X.Tzv r1 = r6.LLILLL
            if (r1 == 0) goto L4b
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L4b
            r1.dismiss()
        L4b:
            r6.LLILLL = r2
            WIDGET extends com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r5 = r6.LJLIL
            if (r5 == 0) goto L78
            com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog r2 = new com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog
            r2.<init>(r5)
            X.TyV r1 = X.EnumC76391TyV.TYPE_PK_BE_INVITED
            X.Ttf r0 = new X.Ttf
            r0.<init>()
            r0.LIZIZ = r7
            r0.LIZJ = r3
            r2.Al(r1, r0)
            r6.LLIILZL = r2
            android.content.Context r1 = r5.context
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "LinkDialog"
            r2.show(r1, r0)
        L78:
            return
        L79:
            r0 = r2
            goto L25
        L7b:
            X.Twi r0 = X.C76265TwT.LIZ
            long r3 = r0.LIZIZ()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76470Tzm.LJIIJJI(int):void");
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIILL(AqS163S0100000_13 aqS163S0100000_13) {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
        this.LLILLIZIL = interactDisconnectDialog2;
        interactDisconnectDialog2.LJLIL = C15380j0.LJIILJJIL(R.string.mis);
        interactDisconnectDialog2.LJLILLLLZI = C15380j0.LJIILJJIL(R.string.mit);
        interactDisconnectDialog2.LJLJI = 3;
        interactDisconnectDialog2.LJLJJL = C15380j0.LJIILJJIL(R.string.mhf);
        interactDisconnectDialog2.LJLJJI = C15380j0.LJIILJJIL(R.string.miu);
        interactDisconnectDialog2.LJLJLJ = aqS163S0100000_13;
        interactDisconnectDialog2.LJLJJLL = false;
        U10 onCLick = U10.LJLIL;
        o.LJIIIZ(onCLick, "onCLick");
        interactDisconnectDialog2.LJLJLLL = onCLick;
        interactDisconnectDialog2.onCancelListener = DialogInterfaceOnCancelListenerC76503U0t.LJLIL;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI == null || (fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class)) == null || (interactDisconnectDialog = this.LLILLIZIL) == null) {
            return;
        }
        interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZ(MultiMatchAnchorWidget widget) {
        DataChannel LJJIIZI;
        o.LJIIIZ(widget, "widget");
        super.LJJJJZ(widget);
        this.LLIILII.LIZ(this);
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner != null && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 551));
            LJJIIZI.mv0(BattleReMatchStateChannel.class, lifecycleOwner, new AqS179S0100000_13(this, 553));
            LJJIIZI.lv0(lifecycleOwner, BattleBonusTaskStateChannel.class, new AqS179S0100000_13(this, 554));
            LJJIIZI.lv0(lifecycleOwner, CoHostApplyDialogShowEvent.class, new AqS179S0100000_13(this, 555));
            LJJIIZI.lv0(lifecycleOwner, BattleShowMatchItemGuideEvent.class, new AqS179S0100000_13(this, 556));
            LJJIIZI.lv0(lifecycleOwner, TwoMatchStartByOpenRequest.class, new AqS179S0100000_13(this, 557));
            LJJIIZI.lv0(lifecycleOwner, MatchResumeEvent.class, new AqS179S0100000_13(this, 535));
            LJJIIZI.lv0(lifecycleOwner, BattleReMatchEvent.class, new AqS179S0100000_13(this, 539));
        }
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJLIIL(boolean z) {
        int i;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c75832TpU.LJJIFFI(null, i, true, false);
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJLL(int i) {
        EnumC76319TxL enumC76319TxL;
        C76279Twh c76279Twh = this.LLIILII;
        c76279Twh.getClass();
        if (i == 5) {
            enumC76319TxL = EnumC76319TxL.MULTI_PK_GUIDE;
        } else {
            enumC76319TxL = EnumC76319TxL.PK_GUIDE;
        }
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
        if (LJ2 == enumC76178Tv4) {
            C30868C9o.LIZJ(R.string.mpa);
            C75832TpU.LIZ.LJJIIZ(enumC76319TxL.getValue(), false, false);
            return;
        }
        if (LJ == enumC76178Tv4) {
            C30868C9o.LIZJ(R.string.mpa);
            C75832TpU.LIZ.LJJIIZ(enumC76319TxL.getValue(), false, false);
        } else if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
            C30868C9o.LIZJ(R.string.mj7);
            C75832TpU.LIZ.LJJIIZ(enumC76319TxL.getValue(), false, false);
        } else {
            C75832TpU.LIZ.LJJIIZ(enumC76319TxL.getValue(), false, true);
            c76279Twh.LJIL(enumC76319TxL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Integer, O] */
    @Override // X.AbstractC76181Tv7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZI(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r20) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76470Tzm.LJJZZI(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJZZIII(C30049Bqn event) {
        o.LJIIIZ(event, "event");
        if (LJJLIIJ().getVisibility() == 0 && LJJLIIJ().isEnabled()) {
            LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
            EnumC76319TxL enumC76319TxL = EnumC76319TxL.PK_REMATCH;
            LIZIZ.LJJJJL = enumC76319TxL.getValue();
            this.LLIILII.LJJIIJ(enumC76319TxL, null, true);
            C76272Twa.LJJJJLI();
        }
    }

    public final void LJZL(boolean z) {
        ViewOnClickListenerC76430Tz8 LJLZ;
        java.util.Map<Long, BattleComboInfo> map;
        BattleComboInfo battleComboInfo;
        User owner;
        User owner2;
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            WIDGET widget = this.LJLIL;
            if (widget != 0 && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null && (map = C76265TwT.LIZ.LJIJJLI) != null && (battleComboInfo = map.get(Long.valueOf(c75883TqJ.LIZ))) != null) {
                if (z) {
                    Room LJJJJI = LJJJJI();
                    if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null && owner.getId() == c75883TqJ.LIZ) {
                        LJLZ.LJLJLLL(battleComboInfo, true);
                    } else {
                        LJLZ.LL(false, false, null);
                    }
                } else {
                    Room LJJJJI2 = LJJJJI();
                    if (LJJJJI2 != null && (owner2 = LJJJJI2.getOwner()) != null && owner2.getId() == c75883TqJ.LIZ) {
                        LJLZ.LL(false, true, null);
                    } else {
                        LJLZ.LJLJLLL(battleComboInfo, false);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC76313TxF
    public final void LIZIZ(BattleResult battleResult, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AnimatorSet animatorSet;
        C76414Tys c76414Tys;
        Integer num;
        ViewOnClickListenerC76430Tz8 LJLZ;
        C76280Twi c76280Twi;
        java.util.Map<Long, BattleComboInfo> map;
        BattleComboInfo battleComboInfo;
        User owner;
        ViewOnClickListenerC76430Tz8 LJLZ2;
        C76280Twi c76280Twi2;
        java.util.Map<Long, BattleComboInfo> map2;
        BattleComboInfo battleComboInfo2;
        User owner2;
        Integer num2;
        float f;
        long j;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        float f2;
        long j3;
        boolean z5;
        boolean z6;
        long j4;
        boolean z7;
        boolean z8;
        float f3;
        ViewOnClickListenerC76430Tz8 LJLZ3;
        java.util.Map<Long, BattleComboInfo> map3;
        BattleComboInfo battleComboInfo3;
        User owner3;
        Integer num3;
        int i = 2;
        if ((battleResult == null || battleResult.result != 2) && C76265TwT.LIZ.LJJJJLI) {
            U46 u46 = this.LJZL;
            if (u46 != null) {
                C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
                if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
                    animatorSet = c76414Tys.LIZJ();
                } else {
                    animatorSet = null;
                }
                u46.LJFF(animatorSet);
            }
            U46 u462 = this.LJZL;
            if (u462 != null) {
                if (battleResult != null) {
                    i = battleResult.result;
                }
                u462.LJIIIIZZ(i);
            }
        }
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            if (battleResult != null) {
                num3 = Integer.valueOf(battleResult.result);
            } else {
                num3 = null;
            }
            if (num3 != null) {
                if (num3.intValue() == 0) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), true, false, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), true, false, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), false, false, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 199);
                    this.LLILZLL = aRunnableS49S0100000_13;
                    this.LLILZ.postDelayed(aRunnableS49S0100000_13, 4000L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                    return;
                }
                if (num3.intValue() == 1) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), false, false, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), true, false, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), false, false, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 200);
                    this.LLILZLL = aRunnableS49S0100000_132;
                    this.LLILZ.postDelayed(aRunnableS49S0100000_132, 4000L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                    return;
                }
            }
            LJJIZ().clearAnimation();
            LJJIZ().setVisibility(0);
            LJJIZ().useHardwareAcceleration(true);
            ViewGroup.LayoutParams layoutParams = LJJIZ().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C15380j0.LIZ(375.0f);
            marginLayoutParams.height = C15380j0.LIZ(220.0f);
            marginLayoutParams.bottomMargin = C15380j0.LIZ(38.0f);
            LJJIZ().setLayoutParams(marginLayoutParams);
            if (C76265TwT.LIZ.LJJJJLI) {
                LJLZ();
            }
            if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
                AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 71);
                C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, null, null, 64);
                this.LLILZ.postDelayed(new ARunnableS41S0100000_5(aqS160S0200000_13, 303), 4000L);
                return;
            }
            C76261TwP.LIZ = false;
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.rv0(BattleDrawTimeLeftChannel.class, 0L);
            }
            C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, new j(), null, 64);
            AqS16S1201000_13 aqS16S1201000_13 = (AqS16S1201000_13) interfaceC65784Pro;
            AqS160S0200000_13 aqS160S0200000_132 = new AqS160S0200000_13(this, aqS16S1201000_13, 72);
            LJJLIL().setOnRematchClickListener(new ACListenerS47S0200000_13(this, aqS16S1201000_13, 45));
            this.LLILZ.postDelayed(new ARunnableS41S0100000_5(aqS160S0200000_132, 303), 4000L);
            return;
        }
        LiveMatchXSetting liveMatchXSetting = LiveMatchXSetting.INSTANCE;
        if (liveMatchXSetting.isEnable() && liveMatchXSetting.getSparkLoadSuccess()) {
            Iterator LIZLLL = C08880Wm.LIZLLL();
            int i2 = 0;
            ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8 = null;
            BattleComboInfo battleComboInfo4 = null;
            BattleComboInfo battleComboInfo5 = null;
            ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz82 = null;
            BattleComboInfo battleComboInfo6 = null;
            BattleComboInfo battleComboInfo7 = null;
            while (LIZLLL.hasNext()) {
                Object next = LIZLLL.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C75883TqJ c75883TqJ = (C75883TqJ) next;
                    WIDGET widget = this.LJLIL;
                    if (widget != 0 && (LJLZ3 = widget.LJLZ(c75883TqJ.LIZ)) != null && (map3 = C76265TwT.LIZ.LJIJJLI) != null && (battleComboInfo3 = map3.get(Long.valueOf(c75883TqJ.LIZ))) != null && LJLZ3.getWinStreakInfo() != null) {
                        Room LJJJJI = LJJJJI();
                        if (LJJJJI != null && (owner3 = LJJJJI.getOwner()) != null && owner3.getId() == c75883TqJ.LIZ) {
                            battleComboInfo5 = LJLZ3.getWinStreakInfo();
                            viewOnClickListenerC76430Tz82 = LJLZ3;
                            battleComboInfo4 = battleComboInfo3;
                        } else {
                            battleComboInfo7 = LJLZ3.getWinStreakInfo();
                            viewOnClickListenerC76430Tz8 = LJLZ3;
                            battleComboInfo6 = battleComboInfo3;
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (battleResult != null) {
                num2 = Integer.valueOf(battleResult.result);
            } else {
                num2 = null;
            }
            if (num2 != null) {
                if (num2.intValue() == 0) {
                    ArrayList arrayList = new ArrayList();
                    if (battleComboInfo4 != null && battleComboInfo4.comboStatus != 0) {
                        if (battleComboInfo5 != null) {
                            j4 = battleComboInfo5.comboCount;
                        } else {
                            j4 = 0;
                        }
                        Long valueOf = Long.valueOf(j4);
                        Long valueOf2 = Long.valueOf(battleComboInfo4.comboCount);
                        if (battleComboInfo4.comboStatus == 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        arrayList.add(new Combo(valueOf, valueOf2, z7, 0));
                        if (viewOnClickListenerC76430Tz82 != null) {
                            if (battleComboInfo4.comboStatus == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            viewOnClickListenerC76430Tz82.LJZL(battleComboInfo4, z8);
                        }
                    }
                    if (battleComboInfo6 != null && battleComboInfo6.comboStatus != 0) {
                        if (battleComboInfo7 != null) {
                            j3 = battleComboInfo7.comboCount;
                        } else {
                            j3 = 0;
                        }
                        Long valueOf3 = Long.valueOf(j3);
                        Long valueOf4 = Long.valueOf(battleComboInfo6.comboCount);
                        if (battleComboInfo6.comboStatus == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        arrayList.add(new Combo(valueOf3, valueOf4, z5, 1));
                        if (viewOnClickListenerC76430Tz8 != null) {
                            if (battleComboInfo6.comboStatus == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            viewOnClickListenerC76430Tz8.LJZL(battleComboInfo6, z6);
                        }
                    }
                    C76280Twi c76280Twi3 = C76265TwT.LIZ;
                    if (c76280Twi3.LJJJJLI) {
                        f2 = 10.0f;
                    } else {
                        f2 = 15.0f;
                    }
                    MatchEndAnimDataFEMessageModel matchEndAnimDataFEMessageModel = new MatchEndAnimDataFEMessageModel(new EndAnimData(new EndAnimDetail(C15380j0.LIZ(f2), "win", arrayList, c76280Twi3.LJJJJLI), "match_end_animation"), "custom", null, null, 12, null);
                    DataChannel LJJIIZI2 = LJJIIZI();
                    if (LJJIIZI2 != null) {
                        LJJIIZI2.qv0(EndAnimStartEvent.class, matchEndAnimDataFEMessageModel);
                    }
                    this.LLILZ.postDelayed(new ARunnableS49S0100000_13(this, 204), 3800L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                    return;
                }
                if (num2.intValue() == 1) {
                    ArrayList arrayList2 = new ArrayList();
                    if (battleComboInfo4 != null && battleComboInfo4.comboStatus != 0) {
                        if (battleComboInfo5 != null) {
                            j2 = battleComboInfo5.comboCount;
                        } else {
                            j2 = 0;
                        }
                        Long valueOf5 = Long.valueOf(j2);
                        Long valueOf6 = Long.valueOf(battleComboInfo4.comboCount);
                        if (battleComboInfo4.comboStatus == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList2.add(new Combo(valueOf5, valueOf6, z3, 0));
                        if (viewOnClickListenerC76430Tz82 != null) {
                            if (battleComboInfo4.comboStatus == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            viewOnClickListenerC76430Tz82.LJZL(battleComboInfo4, z4);
                        }
                    }
                    if (battleComboInfo6 != null && battleComboInfo6.comboStatus != 0) {
                        if (battleComboInfo7 != null) {
                            j = battleComboInfo7.comboCount;
                        } else {
                            j = 0;
                        }
                        Long valueOf7 = Long.valueOf(j);
                        Long valueOf8 = Long.valueOf(battleComboInfo6.comboCount);
                        if (battleComboInfo6.comboStatus == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList2.add(new Combo(valueOf7, valueOf8, z, 1));
                        if (viewOnClickListenerC76430Tz8 != null) {
                            if (battleComboInfo6.comboStatus == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            viewOnClickListenerC76430Tz8.LJZL(battleComboInfo6, z2);
                        }
                    }
                    C76280Twi c76280Twi4 = C76265TwT.LIZ;
                    if (c76280Twi4.LJJJJLI) {
                        f = 10.0f;
                    } else {
                        f = 15.0f;
                    }
                    MatchEndAnimDataFEMessageModel matchEndAnimDataFEMessageModel2 = new MatchEndAnimDataFEMessageModel(new EndAnimData(new EndAnimDetail(C15380j0.LIZ(f), "lose", arrayList2, c76280Twi4.LJJJJLI), "match_end_animation"), "custom", null, null, 12, null);
                    DataChannel LJJIIZI3 = LJJIIZI();
                    if (LJJIIZI3 != null) {
                        LJJIIZI3.qv0(EndAnimStartEvent.class, matchEndAnimDataFEMessageModel2);
                    }
                    this.LLILZ.postDelayed(new ARunnableS49S0100000_13(this, 205), 3800L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                    return;
                }
            }
            C76280Twi c76280Twi5 = C76265TwT.LIZ;
            if (c76280Twi5.LJJJJLI) {
                f3 = 10.0f;
            } else {
                f3 = 15.0f;
            }
            MatchEndAnimDataFEMessageModel matchEndAnimDataFEMessageModel3 = new MatchEndAnimDataFEMessageModel(new EndAnimData(new EndAnimDetail(C15380j0.LIZ(f3), "draw", null, c76280Twi5.LJJJJLI, 4, null), "match_end_animation"), "custom", null, null, 12, null);
            DataChannel LJJIIZI4 = LJJIIZI();
            if (LJJIIZI4 != null) {
                LJJIIZI4.qv0(EndAnimStartEvent.class, matchEndAnimDataFEMessageModel3);
            }
            if (c76280Twi5.LJJJJLI) {
                LJLZ();
            }
            if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
                this.LLILZ.postDelayed(new ARunnableS46S0100000_10(interfaceC65784Pro, 191), 2600L);
                return;
            }
            C76261TwP.LIZ = false;
            DataChannel LJJIIZI5 = LJJIIZI();
            if (LJJIIZI5 != null) {
                LJJIIZI5.rv0(BattleDrawTimeLeftChannel.class, 0L);
            }
            C75622Tm6.LJIJI(EnumC76429Tz7.RESULT_ANIMATION, true, null);
            AqS16S1201000_13 aqS16S1201000_132 = (AqS16S1201000_13) interfaceC65784Pro;
            AqS160S0200000_13 aqS160S0200000_133 = new AqS160S0200000_13(this, aqS16S1201000_132, 75);
            LJJLIL().setOnRematchClickListener(new ACListenerS47S0200000_13(this, aqS16S1201000_132, 46));
            this.LLILZ.postDelayed(new ARunnableS41S0100000_5(aqS160S0200000_133, 303), 2400L);
            return;
        }
        if (battleResult != null) {
            num = Integer.valueOf(battleResult.result);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                LJJLIIIJL(new AqS163S0100000_13(this, 486), true);
                LJJLIIIJJIZ(new AqS163S0100000_13(this, 487), false);
                for (C75883TqJ c75883TqJ2 : C8E.LIZLLL().LJIL()) {
                    WIDGET widget2 = this.LJLIL;
                    if (widget2 != 0 && (LJLZ2 = widget2.LJLZ(c75883TqJ2.LIZ)) != null && (map2 = (c76280Twi2 = C76265TwT.LIZ).LJIJJLI) != null && (battleComboInfo2 = map2.get(Long.valueOf(c75883TqJ2.LIZ))) != null && LJLZ2.getWinStreakInfo() != null) {
                        Room LJJJJI2 = LJJJJI();
                        if (LJJJJI2 != null && (owner2 = LJJJJI2.getOwner()) != null && owner2.getId() == c75883TqJ2.LIZ) {
                            U52 u52 = this.LLIIIJ;
                            if (u52 != null) {
                                u52.LIZIZ(LJLZ2.getWinStreakInfo(), battleComboInfo2);
                                LJLZ2.LJZL(battleComboInfo2, true);
                            } else {
                                o.LJIJI("leftAnimationStreaks");
                                throw null;
                            }
                        } else if (c76280Twi2.LJJJJLI) {
                            if (battleComboInfo2.comboStatus == 0) {
                                U52 u522 = this.LLIIIL;
                                if (u522 != null) {
                                    C29306Beo.LJI(u522);
                                } else {
                                    o.LJIJI("rightAnimationStreaks");
                                    throw null;
                                }
                            } else {
                                C47061t0 LJJIJL = LJJIJL();
                                LJJIJL.setTranslationY(LJJIJL.getTranslationY() - C15380j0.LIZ(26.0f));
                                C47061t0 LJJIJIIJIL = LJJIJIIJIL();
                                LJJIJIIJIL.setTranslationY(LJJIJIIJIL.getTranslationY() - C15380j0.LIZ(26.0f));
                                U52 u523 = this.LLIIIJ;
                                if (u523 != null) {
                                    u523.setTranslationY(u523.getTranslationY() - C15380j0.LIZ(26.0f));
                                    U52 u524 = this.LLIIIL;
                                    if (u524 != null) {
                                        u524.setTranslationY(u524.getTranslationY() - C15380j0.LIZ(26.0f));
                                        U52 u525 = this.LLIIIL;
                                        if (u525 != null) {
                                            u525.LIZIZ(LJLZ2.getWinStreakInfo(), battleComboInfo2);
                                            LJLZ2.LJZL(battleComboInfo2, false);
                                        } else {
                                            o.LJIJI("rightAnimationStreaks");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("rightAnimationStreaks");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("leftAnimationStreaks");
                                    throw null;
                                }
                            }
                        } else {
                            U52 u526 = this.LLIIIL;
                            if (u526 != null) {
                                u526.LIZIZ(LJLZ2.getWinStreakInfo(), battleComboInfo2);
                                LJLZ2.LJZL(battleComboInfo2, false);
                            } else {
                                o.LJIJI("rightAnimationStreaks");
                                throw null;
                            }
                        }
                    }
                }
                ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                return;
            }
            if (num.intValue() == 1) {
                LJJLIIIJJIZ(new AqS163S0100000_13(this, 488), true);
                LJJLIIIJL(new AqS163S0100000_13(this, 489), false);
                C0NB.LIZIZ("TwoMatchView", "showLossStreaks");
                for (C75883TqJ c75883TqJ3 : C8E.LIZLLL().LJIL()) {
                    WIDGET widget3 = this.LJLIL;
                    if (widget3 != 0 && (LJLZ = widget3.LJLZ(c75883TqJ3.LIZ)) != null && (map = (c76280Twi = C76265TwT.LIZ).LJIJJLI) != null && (battleComboInfo = map.get(Long.valueOf(c75883TqJ3.LIZ))) != null && LJLZ.getWinStreakInfo() != null) {
                        Room LJJJJI3 = LJJJJI();
                        if (LJJJJI3 != null && (owner = LJJJJI3.getOwner()) != null && owner.getId() == c75883TqJ3.LIZ) {
                            if (c76280Twi.LJJJJLI) {
                                if (battleComboInfo.comboStatus == 0) {
                                    U52 u527 = this.LLIIIL;
                                    if (u527 != null) {
                                        C29306Beo.LJI(u527);
                                    } else {
                                        o.LJIJI("rightAnimationStreaks");
                                        throw null;
                                    }
                                } else {
                                    C47061t0 LJJIJL2 = LJJIJL();
                                    LJJIJL2.setTranslationY(LJJIJL2.getTranslationY() - C15380j0.LIZ(26.0f));
                                    C47061t0 LJJIJIIJIL2 = LJJIJIIJIL();
                                    LJJIJIIJIL2.setTranslationY(LJJIJIIJIL2.getTranslationY() - C15380j0.LIZ(26.0f));
                                    U52 u528 = this.LLIIIJ;
                                    if (u528 != null) {
                                        u528.setTranslationY(u528.getTranslationY() - C15380j0.LIZ(26.0f));
                                        U52 u529 = this.LLIIIL;
                                        if (u529 != null) {
                                            u529.setTranslationY(u529.getTranslationY() - C15380j0.LIZ(26.0f));
                                            U52 u5210 = this.LLIIIJ;
                                            if (u5210 != null) {
                                                u5210.LIZIZ(LJLZ.getWinStreakInfo(), battleComboInfo);
                                                LJLZ.LJZL(battleComboInfo, false);
                                            } else {
                                                o.LJIJI("leftAnimationStreaks");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("rightAnimationStreaks");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("leftAnimationStreaks");
                                        throw null;
                                    }
                                }
                            } else {
                                U52 u5211 = this.LLIIIJ;
                                if (u5211 != null) {
                                    u5211.LIZIZ(LJLZ.getWinStreakInfo(), battleComboInfo);
                                    LJLZ.LJZL(battleComboInfo, false);
                                } else {
                                    o.LJIJI("leftAnimationStreaks");
                                    throw null;
                                }
                            }
                        } else {
                            U52 u5212 = this.LLIIIL;
                            if (u5212 != null) {
                                u5212.LIZIZ(LJLZ.getWinStreakInfo(), battleComboInfo);
                                LJLZ.LJZL(battleComboInfo, true);
                            } else {
                                o.LJIJI("rightAnimationStreaks");
                                throw null;
                            }
                        }
                    }
                }
                ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                return;
            }
        }
        LJJIJIIJI().setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = LJJIJIIJI().getLayoutParams();
        layoutParams2.width = C15380j0.LJIIL();
        layoutParams2.height = (int) (C15380j0.LJIIL() * 0.54933333f);
        LJJIJIIJI().setLayoutParams(layoutParams2);
        if (C76265TwT.LIZ.LJJJJLI) {
            LJLZ();
        }
        if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
            AqS160S0200000_13 aqS160S0200000_134 = new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 74);
            C15490jB.LJ(LJJIJIIJI(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_4"), "live_battle_draw_animation_2.webp");
            this.LLILZ.postDelayed(new ARunnableS41S0100000_5(aqS160S0200000_134, 303), 2600L);
            return;
        }
        C76261TwP.LIZ = false;
        DataChannel LJJIIZI6 = LJJIIZI();
        if (LJJIIZI6 != null) {
            LJJIIZI6.rv0(BattleDrawTimeLeftChannel.class, 0L);
        }
        C15540jG c15540jG = new C15540jG();
        c15540jG.LIZ = LJJIJIIJI();
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_4");
        c15540jG.LIZJ = "live_battle_draw_animation_2.webp";
        c15540jG.LJFF = true;
        c15540jG.LJIIJ = true;
        c15540jG.LJI = 1;
        c15540jG.LJ = new U0A();
        C15490jB.LJI(c15540jG);
        AqS16S1201000_13 aqS16S1201000_133 = (AqS16S1201000_13) interfaceC65784Pro;
        AqS160S0200000_13 aqS160S0200000_135 = new AqS160S0200000_13(this, aqS16S1201000_133, 73);
        LJJLIL().setOnRematchClickListener(new ACListenerS47S0200000_13(this, aqS16S1201000_133, 47));
        this.LLILZ.postDelayed(new ARunnableS41S0100000_5(aqS160S0200000_135, 303), 2400L);
    }

    @Override // X.InterfaceC76313TxF
    public final void LJII(Throwable th, boolean z) {
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 4004049) {
            if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
                C30868C9o.LIZJ(R.string.sqr);
                this.LLIILII.LJJIL("cancel_battle_info", z);
                return;
            } else {
                C76279Twh.LJJII(this.LLIILII, 108, true, false, null, 24);
                return;
            }
        }
        C30868C9o.LIZJ(R.string.sqr);
    }

    @Override // X.InterfaceC76363Ty3
    public final boolean LJIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, EnumC76319TxL source) {
        Context context;
        Context context2;
        o.LJIIIZ(source, "source");
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            context = widget.context;
        } else {
            context = null;
        }
        if (context == null || widget == 0 || (context2 = widget.context) == null) {
            return false;
        }
        DialogC76479Tzv dialogC76479Tzv = new DialogC76479Tzv(context2);
        this.LLILLL = dialogC76479Tzv;
        dialogC76479Tzv.LJLJI = source;
        dialogC76479Tzv.LJLILLLLZI = interfaceC65784Pro;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/match/ui/dialog/LinkPkGuideDialog", "show", dialogC76479Tzv, new Object[0], "void", new C65300Pk0(false, "()V", "6244975011521867267")).LIZ) {
            return true;
        }
        dialogC76479Tzv.show();
        return true;
    }

    @Override // X.InterfaceC76313TxF
    public final boolean LJIILJJIL(AqS68S0110000_13 aqS68S0110000_13, boolean z) {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog = new InteractDisconnectDialog();
        this.LLILLIZIL = interactDisconnectDialog;
        interactDisconnectDialog.LJLIL = C15380j0.LJIILJJIL(R.string.mf4);
        interactDisconnectDialog.LJLILLLLZI = C15380j0.LJIILJJIL(R.string.mf5);
        interactDisconnectDialog.LJLJI = 3;
        interactDisconnectDialog.LJLJJL = C15380j0.LJIILJJIL(R.string.mhf);
        interactDisconnectDialog.LJLJJI = C15380j0.LJIILJJIL(R.string.mf6);
        interactDisconnectDialog.LJLJLJ = new AqS163S0100000_13(aqS68S0110000_13, 490);
        interactDisconnectDialog.LJLJJLL = z;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI == null || (fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class)) == null) {
            return false;
        }
        InteractDisconnectDialog interactDisconnectDialog2 = this.LLILLIZIL;
        if (interactDisconnectDialog2 != null) {
            interactDisconnectDialog2.show(fragmentManager, "InteractDisconnectDialog");
            return true;
        }
        return true;
    }

    @Override // X.AbstractC76181Tv7
    public final void LJL(long j, String linkMicId) {
        List<C75883TqJ> list;
        o.LJIIIZ(linkMicId, "linkMicId");
        C76279Twh c76279Twh = this.LLIILII;
        c76279Twh.getClass();
        if (j == 1 && ((IInteractService) CN1.LIZ(IInteractService.class)).Qe0() && c76279Twh.LJJIII(212, j)) {
            C76244Tw8 LJII = c76279Twh.LJII();
            long j2 = 0;
            if (LJII != null && (list = LJII.LIZJ) != null) {
                for (C75883TqJ c75883TqJ : list) {
                    if (o.LJ(c75883TqJ.LJII, linkMicId)) {
                        j2 = c75883TqJ.LIZ;
                    }
                }
            }
            C76271TwZ.LIZ.LJJLIIIJLLLLLLLZ(j, j2, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("user left leave Reason = ");
        LIZ.append(j);
        C0NB.LIZIZ("pk_interrupt", X1D.LIZIZ(LIZ));
    }

    public final void LJLIL(BattleComboInfo battleComboInfo, boolean z) {
        Context context;
        View LLLZIIL;
        Drawable LIZIZ;
        String valueOf;
        int i;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        WIDGET widget = this.LJLIL;
        if (widget == 0 || widget.context == null) {
            return;
        }
        if (battleComboInfo == null || Long.valueOf(battleComboInfo.comboCount) == null || battleComboInfo.comboCount == 0) {
            if (z) {
                this.LLIL = null;
                return;
            } else {
                this.LLILII = null;
                return;
            }
        }
        WIDGET widget2 = this.LJLIL;
        if (widget2 == 0 || (context = widget2.context) == null || (LLLZIIL = C16880lQ.LLLZIIL(R.layout.dea, C16880lQ.LLZIL(context), null)) == null || LLLZIIL.getContext() == null) {
            return;
        }
        if (this.LLILIL == null) {
            this.LLILIL = C04270Et.LIZIZ(context, R.drawable.d8a);
        }
        if (this.LLILL == null) {
            this.LLILL = C04270Et.LIZIZ(context, R.drawable.d89);
        }
        if (LLLZIIL == null) {
            return;
        }
        if (z) {
            LIZIZ = C04270Et.LIZIZ(LLLZIIL.getContext(), R.drawable.d8m);
        } else {
            LIZIZ = C04270Et.LIZIZ(LLLZIIL.getContext(), R.drawable.d8n);
        }
        LLLZIIL.setBackground(LIZIZ);
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.nj_);
        if (textView != null) {
            long j = battleComboInfo.comboCount;
            if (j > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(Long.valueOf(j));
            }
            textView.setText(valueOf);
        }
        if (LLLZIIL == null) {
            return;
        }
        View findViewById = LLLZIIL.findViewById(R.id.njg);
        if (findViewById != null && (drawable2 = this.LLILIL) != null) {
            findViewById.setBackground(drawable2);
        }
        View findViewById2 = LLLZIIL.findViewById(R.id.njh);
        if (findViewById2 != null && (drawable = this.LLILL) != null) {
            findViewById2.setBackground(drawable);
        }
        LLLZIIL.measure(View.MeasureSpec.makeMeasureSpec(C15380j0.LIZ(84.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(C15380j0.LIZ(27.0f), 1073741824));
        if (LLLZIIL == null) {
            return;
        }
        LLLZIIL.layout(0, 0, LLLZIIL.getMeasuredWidth(), LLLZIIL.getMeasuredHeight());
        Integer valueOf2 = Integer.valueOf(LLLZIIL.getWidth());
        Integer valueOf3 = Integer.valueOf(LLLZIIL.getHeight());
        if (valueOf2 == null || valueOf2.intValue() <= 0 || valueOf3 == null || valueOf3.intValue() <= 0) {
            return;
        }
        if (valueOf2 != null) {
            i = valueOf2.intValue();
        } else {
            i = 0;
        }
        if (valueOf3 != null) {
            i2 = valueOf3.intValue();
        } else {
            i2 = 0;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return;
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        if (LLLZIIL != null) {
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(LLLZIIL, canvas);
        }
        if (z) {
            this.LLIL = createBitmap;
        } else {
            this.LLILII = createBitmap;
        }
    }

    @Override // X.InterfaceC76313TxF
    public final void LJIIIIZZ(InterfaceC65784Pro invite, InterfaceC65784Pro cancel, boolean z) {
        FragmentManager fragmentManager;
        o.LJIIIZ(invite, "invite");
        o.LJIIIZ(cancel, "cancel");
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            AqS24S0310000_13 aqS24S0310000_13 = new AqS24S0310000_13(this, (C76470Tzm) z, (boolean) invite, (InterfaceC65784Pro<C76800UCe>) cancel, (InterfaceC65784Pro<C76800UCe>) 1);
            LinkDialog linkDialog = new LinkDialog(widget);
            EnumC76391TyV enumC76391TyV = EnumC76391TyV.TYPE_PK_INVITE;
            C76497U0n c76497U0n = new C76497U0n();
            c76497U0n.LIZIZ = z;
            c76497U0n.LIZJ = invite;
            c76497U0n.LIZLLL = cancel;
            c76497U0n.LJ = aqS24S0310000_13;
            linkDialog.Al(enumC76391TyV, c76497U0n);
            this.LLIILZL = linkDialog;
            linkDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC76395TyZ(z));
            LinkDialog linkDialog2 = this.LLIILZL;
            if (linkDialog2 != null) {
                DataChannel LJJIIZI = LJJIIZI();
                if (LJJIIZI != null) {
                    fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
                } else {
                    fragmentManager = null;
                }
                linkDialog2.show(fragmentManager, "LinkDialog");
            }
        }
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJLJ(List<LinkUser> list, List<LinkUser> list2, CustomLinkMessage customLinkMessage) {
        if (list.size() == 2) {
            return;
        }
        this.LLIILII.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHostsListChanged ");
        LIZ.append(list.size());
        LIZ.append(" linked");
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        if (list.size() <= 1) {
            LJLILLLLZI(109, true, C76509U0z.LJLIL);
        }
    }

    @Override // X.AbstractC76181Tv7
    public final void LJJLJLI(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        C76279Twh c76279Twh = this.LLIILII;
        c76279Twh.getClass();
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0() && c76279Twh.LJJIII(103, i)) {
            C76271TwZ.LIZ.LJJLIIIJLJLI(i, false, i2, abnormalDisconnectReason);
        }
        C012403c.LJ("link_mic_finish finishReason = ", i, "pk_interrupt");
    }

    public final void LJLILLLLZI(int i, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
        if (LJ == enumC76178Tv4) {
            this.LLIILII.LJIJ(new AqS163S0100000_13(interfaceC65784Pro, 482), false);
            return;
        }
        if (LJ2 == enumC76178Tv4) {
            this.LLIILII.LJIJ(new AqS163S0100000_13(interfaceC65784Pro, 483), true);
            return;
        }
        if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.FINISH) < 0) {
            C76279Twh.LJJII(this.LLIILII, i, true, z, new AqS163S0100000_13(interfaceC65784Pro, 484), 16);
            return;
        }
        if (EnumC76178Tv4.PUNISH.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.DRAW) < 0) {
            this.LLIILII.LJJIJIIJIL(i, true, new AqS163S0100000_13(interfaceC65784Pro, 485));
        } else {
            if (interfaceC65784Pro == null) {
                return;
            }
            interfaceC65784Pro.invoke();
        }
    }

    public final void LJLJI(BattleUserInfo battleUserInfo, java.util.Map<String, C04750Gp> map, boolean z) {
        ImageModel imageModel;
        if (battleUserInfo != null) {
            try {
                BattleBaseUserInfo battleBaseUserInfo = battleUserInfo.user;
                if (battleBaseUserInfo != null) {
                    imageModel = battleBaseUserInfo.avatarThumb;
                    this.LLILZIL.LIZ(AbstractC73672Svk.LJJIIJZLJL(new ACallableS90S0200000_13((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class), imageModel, 2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS29S0110000_13(map, z, 6), U0D.LJLIL));
                }
            } catch (Exception unused) {
                return;
            }
        }
        imageModel = null;
        this.LLILZIL.LIZ(AbstractC73672Svk.LJJIIJZLJL(new ACallableS90S0200000_13((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class), imageModel, 2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS29S0110000_13(map, z, 6), U0D.LJLIL));
    }
}

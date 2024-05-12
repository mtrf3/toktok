package X;

import Y.ACallableS90S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS29S0110000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSyncEnterRoomChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMatchItemGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXCreateEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXReuseEvent;
import com.bytedance.android.live.liveinteract.matchx.widget.MatchXWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.ISpeedChallengeAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchColorEggsUiOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchMoveToEndWhenUserListChangeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchXSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TruthOrDareForAudienceAbTestSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTruthOrDare;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76471Tzn extends AbstractC76182Tv8 implements InterfaceC76343Txj {
    public C47061t0 LLIFFJFJJ;
    public C76805UCj LLII;
    public U52 LLIIII;
    public U52 LLIIIILZ;
    public View LLIIIJ;
    public FrameLayout LLIIIL;
    public SpannableStringBuilder LLIIIZ;
    public ARunnableS49S0100000_13 LLIIJLIL;
    public Bitmap LLIIL;
    public Bitmap LLIILII;
    public Drawable LLIILZL;
    public Drawable LLIIZ;
    public Runnable LLILII;
    public C80955Vpv LLILIL;
    public final C76287Twp LLIIJI = new C76287Twp();
    public final C73318Sq2 LLIL = new C73318Sq2();

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "TwoMatchAudienceWidgetViewImpl";
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIILLIIL() {
    }

    @Override // X.AbstractC76473Tzp
    public final boolean LJJJJLL() {
        return true;
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZI() {
        LJJLI(true);
        this.LLIIJI.LJ();
        this.LLIL.LIZLLL();
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.jv0(this);
        }
        C76457TzZ.LIZJ();
    }

    @Override // X.InterfaceC76358Txy
    public final void LJLJL() {
    }

    @Override // X.InterfaceC76358Txy
    public final MultiMatchAudienceWidget LIZLLL() {
        return (MultiMatchAudienceWidget) this.LJLIL;
    }

    @Override // X.InterfaceC76343Txj
    public final void LJIJI() {
        BattleComboInfo battleComboInfo;
        ViewOnClickListenerC76430Tz8 LJLZ;
        if (this.LJLIL != 0) {
            Iterator LIZLLL = C08880Wm.LIZLLL();
            while (LIZLLL.hasNext()) {
                C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
                java.util.Map<Long, BattleComboInfo> map = C76265TwT.LIZ.LJIJJLI;
                if (map != null) {
                    battleComboInfo = map.get(Long.valueOf(c75883TqJ.LIZ));
                } else {
                    battleComboInfo = null;
                }
                WIDGET widget = this.LJLIL;
                if (widget != 0 && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                    LJLZ.LJLJJLL(battleComboInfo, new AqS144S0200000_13(this, battleComboInfo, 79));
                }
            }
        }
    }

    public final void LJJZ() {
        ViewStub viewStub;
        View inflate;
        if (this.LJZL == null) {
            WIDGET widget = this.LJLIL;
            U46 u46 = null;
            if (widget != 0 && (viewStub = (ViewStub) widget.findViewById(R.id.fno)) != null && (inflate = viewStub.inflate()) != null) {
                u46 = (U46) inflate.findViewById(R.id.fnm);
            }
            this.LJZL = u46;
        }
    }

    public final void LJJZZIII() {
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
            U52 u52 = this.LLIIII;
            if (u52 != null) {
                u52.setTranslationY(0.0f);
                U52 u522 = this.LLIIIILZ;
                if (u522 != null) {
                    u522.setTranslationY(0.0f);
                    C29306Beo.LJI(this.LJZL);
                    return;
                } else {
                    o.LJIJI("rightAnimationStreaks");
                    throw null;
                }
            }
            o.LJIJI("leftAnimationStreaks");
            throw null;
        }
    }

    public final void LJL() {
        U46 u46;
        C0NB.LJIIIZ("TwoMatchAudienceWidgetV", "showActivityPlayTips, info = method_into");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJJJJL && (u46 = this.LJZL) != null) {
            u46.LIZLLL();
        }
        c76280Twi.LJJJJL = false;
    }

    public final void LJLI() {
        boolean z;
        String str;
        int i;
        ViewOnClickListenerC76430Tz8 LJLZ;
        Room LJJJJI;
        User owner;
        if (C76265TwT.LIZ.LJJ > 8) {
            z = true;
        } else {
            z = false;
        }
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
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJJJJJL) {
            if (z) {
                U46 u462 = this.LJZL;
                if (u462 != null) {
                    C29306Beo.LJJLJLI(u462.LIZ(R.id.ga8));
                    ((C29701Eo) u462.LIZ(R.id.ga8)).setFrame(0);
                    if (u462.LLFZ && !u462.LLFII) {
                        u462.LJIIL();
                    }
                    C15490jB.LJIIJ((C29701Eo) u462.LIZ(R.id.ga8), CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_demand_1"), u462.LJZL, true);
                    C75838Tpa c75838Tpa2 = u462.LLF;
                    if (c75838Tpa2 != null) {
                        c75838Tpa2.LIZ("animation");
                    }
                    u462.post(new ARunnableS49S0100000_13(u462, 105));
                }
                c76280Twi.LJJJJJL = false;
                return;
            }
            return;
        }
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = c76280Twi.LJJJLIIL;
        if (battleTruthOrDareTriggerGuideV2 == null || (str = battleTruthOrDareTriggerGuideV2.audienceContentKey) == null) {
            str = "";
        }
        if (battleTruthOrDareTriggerGuideV2 != null) {
            i = battleTruthOrDareTriggerGuideV2.guideDurationSecond;
        } else {
            i = 5;
        }
        U46 u463 = this.LJZL;
        if (u463 == null) {
            return;
        }
        u463.LJII(i, str);
    }

    @Override // X.InterfaceC76343Txj
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

    @Override // X.InterfaceC76343Txj
    public final void LJ() {
        LJJZZIII();
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.rv0(BattleVictoryLapActivityEvent.class, new C29915Bod(0));
        }
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJL() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        WIDGET widget;
        Context context;
        super.LJJJJL();
        WIDGET widget2 = this.LJLIL;
        View view = null;
        if (widget2 != 0) {
            View findViewById = widget2.findViewById(R.id.hqk);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.pk_anim_bg)");
            this.LLIIIJ = findViewById;
            View findViewById2 = widget2.findViewById(R.id.ezx);
            o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_center_battle_start_2)");
            this.LLIFFJFJJ = (C47061t0) findViewById2;
            this.LLILIL = (C80955Vpv) widget2.findViewById(R.id.dbd);
            if (!C76128TuG.LIZIZ(widget2.dataChannel, false, 6)) {
                this.LLII = (C76805UCj) widget2.findViewById(R.id.fke);
                C80955Vpv c80955Vpv = this.LLILIL;
                if (c80955Vpv != null) {
                    c80955Vpv.setVisibility(0);
                }
                C76805UCj c76805UCj = (C76805UCj) widget2.findViewById(R.id.fke);
                this.LLII = c76805UCj;
                if (c76805UCj != null) {
                    c76805UCj.LJFF(LJJIIZI());
                }
                C76805UCj c76805UCj2 = this.LLII;
                if (c76805UCj2 != null) {
                    c76805UCj2.setMulti(false);
                }
            } else {
                C80955Vpv c80955Vpv2 = this.LLILIL;
                if (c80955Vpv2 != null) {
                    c80955Vpv2.setVisibility(8);
                }
                this.LLII = null;
            }
            C76265TwT.LJIILIIL = false;
            C76265TwT.LJIIIIZZ(EnumC76330TxW.MATCH_TYPE_1V1);
            this.LLIIIL = (FrameLayout) widget2.findViewById(R.id.fjl);
            View findViewById3 = widget2.findViewById(R.id.nj6);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.win_st…t_below_result_animation)");
            this.LLIIII = (U52) findViewById3;
            View findViewById4 = widget2.findViewById(R.id.nj7);
            o.LJIIIIZZ(findViewById4, "findViewById(R.id.win_st…t_below_result_animation)");
            this.LLIIIILZ = (U52) findViewById4;
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
            if (widget3 != 0 && widget3.context != null && LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled() && (widget = this.LJLIL) != 0 && (context = widget.context) != null) {
                this.LLIILZL = C04270Et.LIZIZ(context, R.drawable.d8a);
                this.LLIIZ = C04270Et.LIZIZ(context, R.drawable.d89);
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

    public final void LJLIIL() {
        C47061t0 LJJIJL = LJJIJL();
        LJJIJL.setTranslationY(LJJIJL.getTranslationY() - C15380j0.LIZ(26.0f));
        C47061t0 LJJIJIIJIL = LJJIJIIJIL();
        LJJIJIIJIL.setTranslationY(LJJIJIIJIL.getTranslationY() - C15380j0.LIZ(26.0f));
        U52 u52 = this.LLIIII;
        if (u52 != null) {
            u52.setTranslationY(u52.getTranslationY() - C15380j0.LIZ(26.0f));
            U52 u522 = this.LLIIIILZ;
            if (u522 != null) {
                u522.setTranslationY(u522.getTranslationY() - C15380j0.LIZ(26.0f));
                return;
            } else {
                o.LJIJI("rightAnimationStreaks");
                throw null;
            }
        }
        o.LJIJI("leftAnimationStreaks");
        throw null;
    }

    @Override // X.InterfaceC76358Txy
    public final void LJLJJI() {
        View view;
        ViewOnClickListenerC76430Tz8 LJLZ;
        InterfaceC55235Lm3 LJFF;
        IInteractTitleAbility iInteractTitleAbility;
        C76414Tys c76414Tys;
        DataChannel LJJIIZI;
        LJJIII();
        LJJLI(true);
        if (LiveMatchXSetting.INSTANCE.isEnable() && (LJJIIZI = LJJIIZI()) != null) {
            LJJIIZI.qv0(MatchXReuseEvent.class, L65.END_ANIMATION);
        }
        if (C76265TwT.LIZ.LJJJJLI) {
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = this.LLIIJLIL;
            if (aRunnableS49S0100000_13 != null) {
                this.LLI.removeCallbacks(aRunnableS49S0100000_13);
            }
            LJJZZIII();
        }
        LJJLIIIJLLLLLLLZ();
        LJJJJJL();
        Runnable runnable = this.LLILII;
        if (runnable != null) {
            this.LLI.removeCallbacks(runnable);
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
        C47061t0 c47061t0 = this.LLIFFJFJJ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
            LJJIJIIJI().setVisibility(8);
            LJJIJIIJIL().setVisibility(8);
            LJJIJL().setVisibility(8);
            LJJIJIL().setVisibility(8);
            LJJIJLIJ().setVisibility(8);
            LJJIL().setVisibility(8);
            LJJJ().setVisibility(8);
            LJJIIZ().getView().setVisibility(8);
            LJJIIZ().LIZIZ();
            FrameLayout frameLayout = this.LLIIIL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.LLIIIL;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
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
            DataChannel LJJIIZI2 = LJJIIZI();
            if (LJJIIZI2 != null) {
                LJJIIZI2.qv0(MatchGiftEvent.class, new U0H(U0G.MATCH, U05.END, 4));
            }
            LJJIIJZLJL();
            LJJIIJ();
            return;
        }
        o.LJIJI("ivCenterAnimation");
        throw null;
    }

    @Override // X.InterfaceC76343Txj
    public final void LIZJ(boolean z) {
        C76414Tys c76414Tys;
        ViewOnClickListenerC76430Tz8 LJLZ;
        Room LJJJJI;
        User owner;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isActivityTriggered = ");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        LIZ.append(c76280Twi.LJJJJZ);
        C0NB.LJIIIZ("TwoMatchAudienceWidgetV", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isInVictoryLapActivity = ");
        FT5.LJ(LIZ2, c76280Twi.LJJJJLI, LIZ2, "TwoMatchAudienceWidgetV");
        if (c76280Twi.LJJJJL && !c76280Twi.LJJJJZ && c76280Twi.LJJJJLI) {
            LJJZ();
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
            C29306Beo.LJJLJLI(this.LJZL);
            U46 u462 = this.LJZL;
            if (u462 != null) {
                u462.LJIILIIL();
            }
            C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
            if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null) {
                c76414Tys.LIZLLL();
            }
            C0NB.LJIIIZ("TwoMatchAudienceWidgetV", " audience enter in punish status ");
            C76265TwT.LIZ.LJJJJZ = true;
            return;
        }
        if (c76280Twi.LJJJJLI && !c76280Twi.LJJJJZ && c76280Twi.LJIIIIZZ()) {
            LJJZ();
            if (z) {
                c76280Twi.LJJJJZ = true;
                C0NB.LJIIIZ("TwoMatchAudienceWidgetV", " trigger animator normal play ");
                LJLI();
                return;
            }
            c76280Twi.LJJJJZ = true;
            C0NB.LJIIIZ("TwoMatchAudienceWidgetV", " trigger animator delay play ");
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = this.LLIIJLIL;
            if (aRunnableS49S0100000_13 != null) {
                this.LLI.removeCallbacks(aRunnableS49S0100000_13);
            }
            ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 223);
            this.LLIIJLIL = aRunnableS49S0100000_132;
            this.LLI.postDelayed(aRunnableS49S0100000_132, 2000L);
        }
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIIIZ(BattleTask battleTask) {
        Fragment LJIIIZ;
        ISpeedChallengeAbility iSpeedChallengeAbility;
        if (!LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
            C76805UCj c76805UCj = this.LLII;
            if (c76805UCj != null) {
                c76805UCj.LJ(battleTask);
                return;
            }
            return;
        }
        WIDGET widget = this.LJLIL;
        if (widget == 0) {
            return;
        }
        InterfaceC31781Cdd interfaceC31781Cdd = widget.widgetCallback;
        if (((interfaceC31781Cdd == null || (LJIIIZ = interfaceC31781Cdd.getFragment()) == null) && (LJIIIZ = C79234V7u.LJIIIZ(widget.getView())) == null) || (iSpeedChallengeAbility = (ISpeedChallengeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), ISpeedChallengeAbility.class, null)) == null) {
            return;
        }
        iSpeedChallengeAbility.ry(battleTask);
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIJJ(BattleTask battleTask) {
        BattleBonusStatus battleBonusStatus;
        BattlePrompt battlePrompt;
        if (battleTask != null && (battleBonusStatus = battleTask.battleBonusStatus) != null && (battlePrompt = battleBonusStatus.enterRoomPrompt) != null && !TextUtils.isEmpty(battlePrompt.promptKey)) {
            this.LLIIIZ = C76799UCd.LIZIZ(battlePrompt);
        }
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIJJLI(BattleInfoResponse battleInfoResponse) {
        boolean z;
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd;
        Fragment LJIIIZ;
        Fragment LJIIIZ2;
        IMatchItemAbility iMatchItemAbility;
        InterfaceC31781Cdd interfaceC31781Cdd2;
        InterfaceC31781Cdd interfaceC31781Cdd3;
        Fragment fragment2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchItem enter room -->>>>");
        WIDGET widget = this.LJLIL;
        if (widget == 0 || (interfaceC31781Cdd3 = widget.widgetCallback) == null || (fragment2 = interfaceC31781Cdd3.getFragment()) == null || C55096Ljo.LIZ(C55230Lly.LIZJ(fragment2, null), IMatchItemAbility.class, null) == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" findFragment(getWidget()?.containerView) == null =");
        WIDGET widget2 = this.LJLIL;
        if (widget2 != 0 && (interfaceC31781Cdd2 = widget2.widgetCallback) != null) {
            fragment = interfaceC31781Cdd2.getFragment();
        } else {
            fragment = null;
        }
        LIZ.append(fragment);
        C0NB.LJ("MatchItemEnter", X1D.LIZIZ(LIZ));
        WIDGET widget3 = this.LJLIL;
        if (widget3 == 0 || ((((interfaceC31781Cdd = widget3.widgetCallback) == null || (LJIIIZ = interfaceC31781Cdd.getFragment()) == null) && (LJIIIZ = C79234V7u.LJIIIZ(widget3.getView())) == null) || C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), IMatchItemAbility.class, null) == null)) {
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.qv0(BattleItemSyncEnterRoomChannel.class, battleInfoResponse);
                return;
            }
            return;
        }
        WIDGET widget4 = this.LJLIL;
        if (widget4 == 0) {
            return;
        }
        InterfaceC31781Cdd interfaceC31781Cdd4 = widget4.widgetCallback;
        if (((interfaceC31781Cdd4 == null || (LJIIIZ2 = interfaceC31781Cdd4.getFragment()) == null) && (LJIIIZ2 = C79234V7u.LJIIIZ(widget4.getView())) == null) || (iMatchItemAbility = (IMatchItemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ2, null), IMatchItemAbility.class, null)) == null) {
            return;
        }
        iMatchItemAbility.Ym0(battleInfoResponse);
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZ(MultiMatchAudienceWidget widget) {
        o.LJIIIZ(widget, "widget");
        super.LJJJJZ(widget);
        C76265TwT.LJII(0, "create");
        this.LLIIJI.LIZ(this);
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 565));
            LJJIIZI.lv0(this.LJLIL, BattleShowMatchItemGuideEvent.class, new AqS179S0100000_13(this, 566));
        }
        if (LiveMatchColorEggsUiOpt.INSTANCE.getValue()) {
            C56K c56k = new C56K();
            DataChannel LJJIIZI2 = LJJIIZI();
            if (LJJIIZI2 != null) {
                LJJIIZI2.mv0(GiftDialogHeightEvent.class, this, new AqS144S0200000_13(this, c56k, 80));
            }
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
        c75832TpU.LJJIFFI(null, i, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    @Override // X.AbstractC76182Tv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76471Tzn.LJJLIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76182Tv8
    public final void LJJLJLI(C28272B7s c28272B7s) {
        SeiAppData LJIIJ;
        long j;
        C76287Twp c76287Twp = this.LLIIJI;
        if (c28272B7s == null) {
            c76287Twp.getClass();
            return;
        }
        if (c76287Twp.LIZLLL || c76287Twp.LJI || 0 != c76287Twp.LJIILJJIL || (LJIIJ = C75806Tp4.LJIIJ(c28272B7s)) == null || LJIIJ.battleId <= 0) {
            return;
        }
        if (LJIIJ != null) {
            j = LJIIJ.battleId;
        } else {
            j = 0;
        }
        if (c76287Twp.LJIILJJIL != j && j != 0) {
            if (LJIIJ != null) {
                C75622Tm6.LJIILJJIL(LJIIJ);
            }
            C76272Twa.LIZ.LJJ(j, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
        }
        c76287Twp.LJIILJJIL = j;
    }

    public final void LJLIIIL(boolean z) {
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

    /* JADX WARN: Code restructure failed: missing block: B:136:0x06b3, code lost:
    
        if (r6 != null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x07a1, code lost:
    
        if (r6 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0795, code lost:
    
        if (r7 != null) goto L367;
     */
    @Override // X.InterfaceC76343Txj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.model.message.battle.BattleResult r20, X.InterfaceC65784Pro<X.C76800UCe> r21) {
        /*
            Method dump skipped, instructions count: 1967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76471Tzn.LIZIZ(com.bytedance.android.livesdk.model.message.battle.BattleResult, X.Pro):void");
    }

    @Override // X.AbstractC76182Tv8
    public final boolean LJJLIIJ(BattleInfoResponse battleInfoResponse, int i) {
        Integer num;
        List<TeamUsersInfo> list;
        boolean z;
        BattleUserInfo battleUserInfo;
        Boolean bool;
        P p;
        Object obj;
        long j;
        User owner;
        User owner2;
        List list2;
        BattleTruthOrDare battleTruthOrDare;
        String str;
        C76287Twp c76287Twp = this.LLIIJI;
        c76287Twp.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkBattleInfo, info = ");
        LIZ.append(battleInfoResponse);
        C0NB.LJIIIZ("TwoMatchAudienceViewPre", X1D.LIZIZ(LIZ));
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIILIIL(battleInfoResponse.setting);
        c76280Twi.LJJIJIIJIL = battleInfoResponse.mBattleDisplayConfig;
        java.util.Map<Long, BattleResult> map = battleInfoResponse.resultMap;
        long LJII = AbstractC76285Twn.LJII();
        boolean z2 = false;
        BattleUserInfo battleUserInfo2 = null;
        r7 = null;
        Long l = null;
        if (battleInfoResponse.battleTruthOrDare != null && TruthOrDareForAudienceAbTestSetting.INSTANCE.getValue() == 1 && (battleTruthOrDare = battleInfoResponse.battleTruthOrDare) != null && battleTruthOrDare.triggered) {
            C0NB.LJIIIZ("TwoMatchAudienceViewPre", "handleBattleTruthOrDare");
            BattleTruthOrDare battleTruthOrDare2 = battleInfoResponse.battleTruthOrDare;
            if (battleTruthOrDare2 != null) {
                str = battleTruthOrDare2.anchorRegion;
            } else {
                str = null;
            }
            c76280Twi.LJJJJZI = str;
            c76280Twi.LJJJJLI = true;
            c76280Twi.LJJJJLL = true;
            c76280Twi.LJJJLL = battleTruthOrDare2;
            InterfaceC76343Txj interfaceC76343Txj = (InterfaceC76343Txj) c76287Twp.LJII;
            if (interfaceC76343Txj != null) {
                interfaceC76343Txj.LIZJ(false);
            }
            C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "truth_or_dare_enter_match_victory_lap"));
        }
        B5G.LIZIZ().LIZIZ(battleInfoResponse.userInfoMap);
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            num = Integer.valueOf(battleSetting.status);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 1) {
            int i2 = 2;
            if (num != null) {
                if (num.intValue() == 3) {
                    C75832TpU c75832TpU = C75832TpU.LIZ;
                    C76244Tw8 LJIIIZ = c76287Twp.LJIIIZ();
                    if (LJIIIZ != null) {
                        list2 = LJIIIZ.LJIILL;
                    } else {
                        list2 = null;
                    }
                    c75832TpU.LJIL(list2, false, true);
                    long value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue() + LJII;
                    if (value > 0) {
                        BattleSetting battleSetting2 = battleInfoResponse.setting;
                        if (battleSetting2 != null && battleSetting2.inviteType == 1) {
                            z2 = true;
                        }
                        C75622Tm6.LJIIL("room_enter", true, z2);
                        C75832TpU.LJIIJ = C30725C4b.LIZ();
                        c76280Twi.LJJIJIIJI = value;
                        java.util.Map<Long, BattleUserArmies> map2 = battleInfoResponse.armies;
                        if (map2 != null) {
                            C76287Twp.LJJ(c76287Twp, map2);
                        }
                        java.util.Map<Long, BattleComboInfo> map3 = battleInfoResponse.battleCombos;
                        BattleSetting battleSetting3 = battleInfoResponse.setting;
                        if (battleSetting3 != null) {
                            i2 = battleSetting3.status;
                        }
                        c76287Twp.LJIJI("battle_info", map, map3, i2);
                    }
                } else if (num.intValue() == 2) {
                    c76287Twp.LJIIJ("battle_info", true);
                }
            }
            C76265TwT.LJII(0, "check_info");
        } else {
            C75832TpU c75832TpU2 = C75832TpU.LIZ;
            C76244Tw8 LJIIIZ2 = c76287Twp.LJIIIZ();
            if (LJIIIZ2 != null) {
                list = LJIIIZ2.LJIILL;
            } else {
                list = null;
            }
            c75832TpU2.LJIL(list, false, true);
            if (LJII <= 0) {
                return false;
            }
            BattleSetting battleSetting4 = battleInfoResponse.setting;
            if (battleSetting4 != null && battleSetting4.inviteType == 1) {
                z = true;
            } else {
                z = false;
            }
            C75622Tm6.LJIIL("room_enter", false, z);
            java.util.Map<Long, BattleUserInfo> map4 = battleInfoResponse.userInfoMap;
            if (map4 != null) {
                Room room = c76287Twp.LJIIIIZZ;
                if (room != null && (owner2 = room.getOwner()) != null) {
                    l = Long.valueOf(owner2.getId());
                }
                battleUserInfo2 = map4.get(l);
            }
            c76280Twi.LJJIJLIJ = battleUserInfo2;
            if (map4 != null) {
                Iterator LIZLLL = C08880Wm.LIZLLL();
                while (true) {
                    if (LIZLLL.hasNext()) {
                        obj = LIZLLL.next();
                        C75883TqJ c75883TqJ = (C75883TqJ) obj;
                        Room room2 = c76287Twp.LJIIIIZZ;
                        if (room2 == null || (owner = room2.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C75883TqJ c75883TqJ2 = (C75883TqJ) obj;
                if (c75883TqJ2 != null) {
                    j = c75883TqJ2.LIZ;
                } else {
                    j = 0;
                }
                battleUserInfo = map4.get(Long.valueOf(j));
            } else {
                battleUserInfo = null;
            }
            c76280Twi.LJJIL = battleUserInfo;
            java.util.Map<Long, Boolean> map5 = battleInfoResponse.supportedActions;
            if (map5 != null) {
                bool = map5.get(1L);
            } else {
                bool = null;
            }
            C76280Twi c76280Twi2 = C76265TwT.LIZ;
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            c76280Twi2.LJJIIJ = z2;
            C75194TfC.LJIILLIIL("match_health_bar");
            P p2 = c76287Twp.LJII;
            if (p2 != 0) {
                p2.LJIJJ(battleInfoResponse.battleTask);
            }
            c76287Twp.LJIJJLI(LJII, C77119UOl.LJIIJ(i), battleInfoResponse.battleCombos);
            BattleTask battleTask = battleInfoResponse.battleTask;
            if (battleTask != null && (p = c76287Twp.LJII) != 0) {
                p.LJIIIZ(battleTask);
            }
            java.util.Map<Long, BattleUserArmies> map6 = battleInfoResponse.armies;
            if (map6 != null) {
                C76287Twp.LJJ(c76287Twp, map6);
            }
            P p3 = c76287Twp.LJII;
            if (p3 != 0) {
                p3.LJIJJLI(battleInfoResponse);
            }
        }
        C76280Twi c76280Twi3 = C76265TwT.LIZ;
        if (c76280Twi3.LJIIIIZZ()) {
            c76280Twi3.LJIILJJIL(EnumC76320TxM.MATCH_BATTLE_INFO);
        }
        return true;
    }

    @Override // X.AbstractC76182Tv8
    public final void LJJLJ(List list, List list2) {
        int i;
        int size = list.size();
        if (list2 != null) {
            i = ((ArrayList) list2).size();
        } else {
            i = 0;
        }
        if (size < i && LiveMatchMoveToEndWhenUserListChangeSetting.INSTANCE.getValue()) {
            this.LLIIJI.LJIIJ("link_list_change", false);
        }
    }

    public final void LJJLL(BattleComboInfo battleComboInfo, boolean z) {
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
                this.LLIIL = null;
                return;
            } else {
                this.LLIILII = null;
                return;
            }
        }
        WIDGET widget2 = this.LJLIL;
        if (widget2 == 0 || (context = widget2.context) == null || (LLLZIIL = C16880lQ.LLLZIIL(R.layout.dea, C16880lQ.LLZIL(context), null)) == null || LLLZIIL.getContext() == null) {
            return;
        }
        if (this.LLIILZL == null) {
            this.LLIILZL = C04270Et.LIZIZ(context, R.drawable.d8a);
        }
        if (this.LLIIZ == null) {
            this.LLIIZ = C04270Et.LIZIZ(context, R.drawable.d89);
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
        if (findViewById != null && (drawable2 = this.LLIILZL) != null) {
            findViewById.setBackground(drawable2);
        }
        View findViewById2 = LLLZIIL.findViewById(R.id.njh);
        if (findViewById2 != null && (drawable = this.LLIIZ) != null) {
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
            this.LLIIL = createBitmap;
        } else {
            this.LLIILII = createBitmap;
        }
    }

    public final void LJJZZI(BattleUserInfo battleUserInfo, java.util.Map<String, C04750Gp> map, boolean z) {
        ImageModel imageModel;
        if (battleUserInfo != null) {
            try {
                BattleBaseUserInfo battleBaseUserInfo = battleUserInfo.user;
                if (battleBaseUserInfo != null) {
                    imageModel = battleBaseUserInfo.avatarThumb;
                    this.LLIL.LIZ(AbstractC73672Svk.LJJIIJZLJL(new ACallableS90S0200000_13((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class), imageModel, 3)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS29S0110000_13(map, z, 7), U0E.LJLIL));
                }
            } catch (Exception unused) {
                return;
            }
        }
        imageModel = null;
        this.LLIL.LIZ(AbstractC73672Svk.LJJIIJZLJL(new ACallableS90S0200000_13((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class), imageModel, 3)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS29S0110000_13(map, z, 7), U0E.LJLIL));
    }
}

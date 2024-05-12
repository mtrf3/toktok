package X;

import Y.ARunnableS46S0100000_10;
import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSyncEnterRoomChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchAudienceScoreClickEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.ISpeedChallengeAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOncemoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.AudienceTeamMatchEnableBattleEggSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchColorEggsUiOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchMoveToEndWhenUserListChangeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignSingleResultSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS16S1201000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76472Tzo extends AbstractC76182Tv8 implements InterfaceC76360Ty0 {
    public C29701Eo LLII;
    public C29701Eo LLIIII;
    public C76805UCj LLIIIILZ;
    public SpannableStringBuilder LLIIIJ;
    public C29916Boe LLIIIL;
    public Runnable LLIIJI;
    public C80955Vpv LLIIJLIL;
    public final C76286Two LLIFFJFJJ = new C76286Two();
    public final C73318Sq2 LLIIIZ = new C73318Sq2();

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "MultiMatchAudienceWidgetViewImpl";
    }

    @Override // X.AbstractC76473Tzp
    public final boolean LJJJJLL() {
        return false;
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJJZI() {
        LJJLI(true);
        this.LLIFFJFJJ.LJ();
        this.LLIIIZ.LIZLLL();
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.jv0(this);
        }
        C76457TzZ.LIZJ();
    }

    @Override // X.InterfaceC76358Txy
    public final MultiMatchAudienceWidget LIZLLL() {
        return (MultiMatchAudienceWidget) this.LJLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    @Override // X.InterfaceC76358Txy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76472Tzo.LJIILLIIL():void");
    }

    public final void LJJZ() {
        Long l;
        User owner;
        BestTeammateRelation bestTeammateRelation;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJFF != null && (!r0.isEmpty())) {
            List<BestTeammateRelation> list = c76280Twi.LJFF;
            if (list != null && list.size() == 1) {
                List<BestTeammateRelation> list2 = c76280Twi.LJFF;
                Long l2 = null;
                if (list2 != null && (bestTeammateRelation = (BestTeammateRelation) ListProtector.get(list2, 0)) != null) {
                    l = Long.valueOf(bestTeammateRelation.bestTeammateId);
                } else {
                    l = null;
                }
                Room LJJJJI = LJJJJI();
                if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null) {
                    l2 = Long.valueOf(owner.getId());
                }
                if (o.LJ(l, l2)) {
                    return;
                }
            }
            C29916Boe c29916Boe = this.LLIIIL;
            if (c29916Boe != null) {
                c29916Boe.setAlpha(0.0f);
            }
            C29306Beo.LJJLJLI(this.LLIIIL);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLIIIL, (Property<C29916Boe, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(260L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LLIIIL, (Property<C29916Boe, Float>) View.ALPHA, 1.0f, 1.0f);
            ofFloat2.setDuration(1480L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LLIIIL, (Property<C29916Boe, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat3.setDuration(320L);
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
            animatorSet.addListener(new IDAListenerS80S0100000_13(this, 22));
            animatorSet.start();
            return;
        }
        C29306Beo.LJI(this.LLIIIL);
    }

    @Override // X.InterfaceC76360Ty0
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

    @Override // X.AbstractC76473Tzp
    public final void LJJJJL() {
        super.LJJJJL();
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            this.LLII = (C29701Eo) widget.findViewById(R.id.gp8);
            this.LLIIII = (C29701Eo) widget.findViewById(R.id.gfn);
            this.LLIIJLIL = (C80955Vpv) widget.findViewById(R.id.dbd);
            if (AudienceTeamMatchEnableBattleEggSetting.INSTANCE.getValue() && !LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
                C80955Vpv c80955Vpv = this.LLIIJLIL;
                if (c80955Vpv != null) {
                    c80955Vpv.setVisibility(0);
                }
                C76805UCj c76805UCj = (C76805UCj) widget.findViewById(R.id.fke);
                this.LLIIIILZ = c76805UCj;
                if (c76805UCj != null) {
                    c76805UCj.LJFF(LJJIIZI());
                }
                C76805UCj c76805UCj2 = this.LLIIIILZ;
                if (c76805UCj2 != null) {
                    c76805UCj2.setMulti(true);
                }
            } else {
                C80955Vpv c80955Vpv2 = this.LLIIJLIL;
                if (c80955Vpv2 != null) {
                    c80955Vpv2.setVisibility(8);
                }
                this.LLIIIILZ = null;
            }
            C76265TwT.LJIILIIL = true;
            C76265TwT.LJIIIIZZ(EnumC76330TxW.MATCH_TYPE_2V2);
            C29916Boe c29916Boe = (C29916Boe) widget.findViewById(R.id.ais);
            this.LLIIIL = c29916Boe;
            if (c29916Boe != null) {
                c29916Boe.LIZ();
            }
        }
        if (LiveMatchColorEggsUiOpt.INSTANCE.getValue()) {
            C56K c56k = new C56K();
            DataChannel LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.mv0(GiftDialogHeightEvent.class, this, new AqS144S0200000_13(this, c56k, 78));
            }
        }
    }

    @Override // X.InterfaceC76358Txy
    public final void LJLJJI() {
        View view;
        InterfaceC55235Lm3 LJFF;
        IInteractTitleAbility iInteractTitleAbility;
        C76414Tys c76414Tys;
        Animator animator;
        LJJIII();
        LJJLI(true);
        LJJLIIIJLLLLLLLZ();
        Animator animator2 = C76480Tzw.LIZ;
        if (animator2 != null && animator2.isRunning() && (animator = C76480Tzw.LIZ) != null) {
            animator.end();
        }
        LJJJJJL();
        Runnable runnable = this.LLIIJI;
        if (runnable != null) {
            this.LLI.removeCallbacks(runnable);
        }
        LJJJ().setVisibility(8);
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
        C29701Eo c29701Eo = this.LLII;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        LJJIJIIJI().setVisibility(8);
        LJJIJIIJIL().setVisibility(8);
        LJJIJL().setVisibility(8);
        LJJIJIL().setVisibility(8);
        LJJIJLIJ().setVisibility(8);
        LJJIL().setVisibility(8);
        LJJIIZ().getView().setVisibility(8);
        LJJIIZ().LIZIZ();
        LJJI(4, false);
    }

    @Override // X.InterfaceC76358Txy
    public final void LJLJL() {
        LJJL();
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIIIZ(BattleTask battleTask) {
        Fragment LJIIIZ;
        ISpeedChallengeAbility iSpeedChallengeAbility;
        if (AudienceTeamMatchEnableBattleEggSetting.INSTANCE.getValue()) {
            if (!LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
                C76805UCj c76805UCj = this.LLIIIILZ;
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
    }

    @Override // X.InterfaceC76358Txy
    public final void LJIJJ(BattleTask battleTask) {
        BattleBonusStatus battleBonusStatus;
        BattlePrompt battlePrompt;
        if (AudienceTeamMatchEnableBattleEggSetting.INSTANCE.getValue() && battleTask != null && (battleBonusStatus = battleTask.battleBonusStatus) != null && (battlePrompt = battleBonusStatus.enterRoomPrompt) != null && !TextUtils.isEmpty(battlePrompt.promptKey)) {
            this.LLIIIJ = C76799UCd.LIZIZ(battlePrompt);
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
        LIZ.append("MatchItem enter room teamMatch-->>>>");
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
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 567));
            LJJIIZI.mv0(MultiMatchAudienceScoreClickEvent.class, this, new AqS179S0100000_13(this, 568));
        }
        this.LLIFFJFJJ.LIZ(this);
    }

    @Override // X.AbstractC76473Tzp
    public final void LJJJLIIL(boolean z) {
        List<TeamUsersInfo> list;
        int i;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        C76244Tw8 LJIIIZ = this.LLIFFJFJJ.LJIIIZ();
        if (LJIIIZ != null) {
            list = LJIIIZ.LJIILL;
        } else {
            list = null;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c75832TpU.LJJIFFI(list, i, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f6  */
    @Override // X.AbstractC76182Tv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r19) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76472Tzo.LJJLIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
    }

    @Override // X.AbstractC76182Tv8
    public final void LJJLJLI(C28272B7s c28272B7s) {
        boolean z;
        C76286Two c76286Two = this.LLIFFJFJJ;
        c76286Two.getClass();
        if (c28272B7s == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seiBattleId = ");
        C31811Ce7.LJ(LIZ, c76286Two.LJIILJJIL, LIZ, "onReceiveSeiBattleInfo ");
        String str = c76286Two.LJIILJJIL;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !o.LJ(CardStruct.IStatusCode.DEFAULT, c76286Two.LJIILJJIL)) {
            return;
        }
        SeiAppData LJIIJ = C75806Tp4.LJIIJ(c28272B7s);
        long j = 0;
        if (LJIIJ == null || LJIIJ.battleId <= 0) {
            return;
        }
        if (LJIIJ != null) {
            j = LJIIJ.battleId;
        }
        String valueOf = String.valueOf(j);
        if (!TextUtils.equals(valueOf, c76286Two.LJIILJJIL) && !o.LJ(c76286Two.LJIILJJIL, CardStruct.IStatusCode.DEFAULT)) {
            C76271TwZ.LIZ.LJJLI();
        }
        if (!o.LJ(c76286Two.LJIILJJIL, valueOf) && !o.LJ(valueOf, CardStruct.IStatusCode.DEFAULT)) {
            if (LJIIJ != null) {
                C75622Tm6.LJIILJJIL(LJIIJ);
            }
            C76271TwZ.LIZ.LJJLIIIIJ(CastLongProtector.parseLong(valueOf), C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
        }
        if (c76286Two.LIZLLL || c76286Two.LJI) {
            return;
        }
        c76286Two.LJIILJJIL = valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x013b, code lost:
    
        if (r12.longValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0167, code lost:
    
        if (r12.longValue() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x015d, code lost:
    
        if (r12 != null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    @Override // X.AbstractC76182Tv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r22, int r23) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76472Tzo.LJJLIIJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse, int):boolean");
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
            this.LLIFFJFJJ.LJIIJ("link_list_change", false);
        }
    }

    @Override // X.InterfaceC76360Ty0
    public final void LJLJJLL(BattleTeamResult battleTeamResult, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Integer valueOf;
        Integer num = null;
        if (LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
            if (battleTeamResult != null) {
                num = Integer.valueOf(battleTeamResult.result);
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), true, true, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), true, true, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), false, true, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 233);
                    this.LLIIJI = aRunnableS49S0100000_13;
                    this.LLI.postDelayed(aRunnableS49S0100000_13, 4000L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                    return;
                }
                if (num.intValue() == 1) {
                    if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJIZ(), false, true, 8);
                    } else {
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJIL(), true, true, 8);
                        AbstractC76473Tzp.LJJLIIIJLJLI(this, LJJJI(), false, true, 8);
                    }
                    ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 234);
                    this.LLIIJI = aRunnableS49S0100000_132;
                    this.LLI.postDelayed(aRunnableS49S0100000_132, 4000L);
                    ((AqS16S1201000_13) interfaceC65784Pro).invoke();
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
            float LJIJ = (C15380j0.LJIJ(((View) parent).getWidth()) / 2.0f) - 125.0f;
            ViewGroup.LayoutParams layoutParams = LJJIZ().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C15380j0.LIZ(375.0f);
            marginLayoutParams.height = C15380j0.LIZ(220.0f);
            marginLayoutParams.bottomMargin = C15380j0.LIZ(LJIJ);
            LJJIZ().setLayoutParams(marginLayoutParams);
            if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
                AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 87);
                C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, null, null, 64);
                this.LLI.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_13, 194), 4000L);
                return;
            } else {
                DataChannel LJJIIZI = LJJIIZI();
                if (LJJIIZI != null) {
                    LJJIIZI.rv0(BattleDrawTimeLeftChannel.class, 0L);
                }
                C15490jB.LJIIL(LJJIZ(), "tiktok_live_match_redesign_resource", "ttlive_match_result_draw.zip", "images", true, new C1JI(), null, 64);
                this.LLI.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 88), 194), 4000L);
                return;
            }
        }
        if (battleTeamResult != null && (valueOf = Integer.valueOf(battleTeamResult.result)) != null) {
            if (valueOf.intValue() == 0) {
                LJJLIIIJL(new AqS163S0100000_13(this, 530), true);
                LJJLIIIJJIZ(new AqS163S0100000_13(this, 531), false);
                ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                return;
            } else if (valueOf.intValue() == 1) {
                LJJLIIIJJIZ(new AqS163S0100000_13(this, 532), true);
                LJJLIIIJL(new AqS163S0100000_13(this, 533), false);
                ((AqS16S1201000_13) interfaceC65784Pro).invoke();
                return;
            }
        }
        LJJIJIIJI().setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = LJJIJIIJI().getLayoutParams();
        layoutParams2.width = C15380j0.LJIIL();
        layoutParams2.height = (int) (C15380j0.LJIIL() * 0.54933333f);
        LJJIJIIJI().setLayoutParams(layoutParams2);
        if (!LiveBattleDrawOncemoreSetting.INSTANCE.getValue()) {
            AqS160S0200000_13 aqS160S0200000_132 = new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 83);
            C15490jB.LJ(LJJIJIIJI(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_4"), "live_battle_draw_animation_2.webp");
            this.LLI.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) aqS160S0200000_132, 194), 2600L);
            return;
        }
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
        c15540jG.LJ = new U0B();
        C15490jB.LJI(c15540jG);
        this.LLI.postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS160S0200000_13(this, (AqS16S1201000_13) interfaceC65784Pro, 84), 194), 2600L);
    }

    public static final void LJJLL(Bitmap bitmap, C04750Gp c04750Gp, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (c04750Gp != null && bitmap != null) {
            Bitmap roundedBitmap = C44999HlL.LIZ(bitmap);
            o.LJIIIIZZ(roundedBitmap, "roundedBitmap");
            c04750Gp.LJI = C78847Ux1.LJJL(c04750Gp.LIZ - i2, c04750Gp.LIZIZ - i2, roundedBitmap);
        }
    }
}

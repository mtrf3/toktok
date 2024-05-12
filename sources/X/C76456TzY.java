package X;

import Y.AObserverS81S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalStrikeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCriticalDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSmokeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.o;

/* renamed from: X.TzY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76456TzY {
    public DataChannel LIZIZ;
    public C29701Eo LIZJ;
    public C29701Eo LIZLLL;
    public BattleItem4FEModel LJ;
    public BattleItem4FEModel LJFF;
    public boolean LJIIIZ;
    public final MatchFeedItemViewModel LIZ = new MatchFeedItemViewModel();
    public final AObserverS81S0100000_13 LJI = new AObserverS81S0100000_13(this, 65);
    public final ARunnableS49S0100000_13 LJII = new ARunnableS49S0100000_13(this, 173);
    public final ARunnableS49S0100000_13 LJIIIIZZ = new ARunnableS49S0100000_13(this, 174);
    public final ConcurrentLinkedDeque<ItemInfo4FE> LJIIJ = new ConcurrentLinkedDeque<>();
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public long LJIILIIL = -1;
    public long LJIILJJIL = -1;

    public final void LIZJ() {
        Object obj;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            C0NB.LJ("MatchFeedItemDelegate", "battle state not start");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waiting List size End  = ");
        LIZ.append(this.LJIIJ.isEmpty());
        C0NB.LIZIZ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ));
        this.LJIIIZ = false;
        if (!this.LJIIJ.isEmpty()) {
            LJII("Animation end");
        }
    }

    public final void LJFF() {
        C0NB.LJ("MatchFeedItemDelegate", "onDestory");
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        this.LIZIZ = null;
        C15610jN.LIZLLL(this.LJIIIIZZ);
        C15610jN.LIZLLL(this.LJII);
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        C29701Eo c29701Eo = this.LIZLLL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        C29701Eo c29701Eo2 = this.LIZLLL;
        if (c29701Eo2 != null) {
            c29701Eo2.setAlpha(0.0f);
        }
        this.LJ = null;
        this.LJFF = null;
        this.LJIIIZ = false;
        this.LJIIJ.clear();
        this.LIZ.LJLJJI.removeObserver(this.LJI);
        MatchFeedItemViewModel matchFeedItemViewModel = this.LIZ;
        matchFeedItemViewModel.getClass();
        matchFeedItemViewModel.LJLJJL = EnumC76178Tv4.END;
        matchFeedItemViewModel.al0(1, true);
        matchFeedItemViewModel.al0(2, true);
        matchFeedItemViewModel.al0(1, false);
        matchFeedItemViewModel.al0(2, false);
        matchFeedItemViewModel.LJLJJL = EnumC76178Tv4.NORMAL;
        DataChannel dataChannel2 = matchFeedItemViewModel.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.jv0(matchFeedItemViewModel);
        }
        matchFeedItemViewModel.LJLILLLLZI = null;
        matchFeedItemViewModel.LJLJJLL = null;
        LJI();
    }

    public final void LJI() {
        C29701Eo c29701Eo;
        MatchFeedItemViewModel matchFeedItemViewModel = this.LIZ;
        matchFeedItemViewModel.getClass();
        matchFeedItemViewModel.LJLJJL = EnumC76178Tv4.END;
        matchFeedItemViewModel.al0(1, true);
        matchFeedItemViewModel.al0(2, true);
        matchFeedItemViewModel.al0(1, false);
        matchFeedItemViewModel.al0(2, false);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(BattleCriticalStrikeCardEffectChannel.class, EnumC76461Tzd.NORMAL);
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.rv0(BattleSmokeCardEffectChannel.class, EnumC76461Tzd.NORMAL);
        }
        C15610jN.LIZLLL(this.LJIIIIZZ);
        C15610jN.LIZLLL(this.LJII);
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        C29701Eo c29701Eo2 = this.LIZLLL;
        if (c29701Eo2 != null) {
            c29701Eo2.setVisibility(8);
        }
        C29701Eo c29701Eo3 = this.LIZLLL;
        if (c29701Eo3 != null) {
            c29701Eo3.setAlpha(0.0f);
        }
        this.LJ = null;
        this.LJFF = null;
        this.LJIIIZ = false;
        C29701Eo c29701Eo4 = this.LIZJ;
        if (c29701Eo4 != null && c29701Eo4.isAnimating() && (c29701Eo = this.LIZJ) != null) {
            c29701Eo.setVisibility(8);
        }
        this.LJIIJ.clear();
    }

    public final void LIZLLL(boolean z) {
        Object obj;
        Object obj2;
        C29701Eo c29701Eo;
        float f;
        if (this.LIZLLL == null) {
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        Float f2 = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleSmokeDebuffChannel.class);
        } else {
            obj = null;
        }
        if (obj == EnumC76461Tzd.EFFECTING) {
            return;
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            obj2 = dataChannel2.kv0(BattleStateChannel.class);
        } else {
            obj2 = null;
        }
        if (obj2 != EnumC76178Tv4.START) {
            C29701Eo c29701Eo2 = this.LIZLLL;
            if (c29701Eo2 == null) {
                return;
            }
            c29701Eo2.setVisibility(8);
            return;
        }
        float f3 = 0.0f;
        if (!z) {
            C29701Eo c29701Eo3 = this.LIZLLL;
            if (c29701Eo3 != null) {
                f2 = Float.valueOf(c29701Eo3.getAlpha());
            }
            if (o.LIZJ(f2, 0.0f)) {
                return;
            }
        } else if (z && (c29701Eo = this.LIZLLL) != null && c29701Eo.getAlpha() >= 0.5f) {
            return;
        }
        if (z) {
            C29701Eo c29701Eo4 = this.LIZLLL;
            if (c29701Eo4 != null) {
                c29701Eo4.setVisibility(0);
            }
            C29701Eo c29701Eo5 = this.LIZLLL;
            if (c29701Eo5 != null) {
                c29701Eo5.setAlpha(0.0f);
            }
            C15490jB.LJIIL(this.LIZLLL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_interaction_demand_2"), "match_blood_smoke_anim.zip", "images", true, null, null, 96);
            C0NB.LIZIZ("MatchItemAssem", "Self_Smoke_show_start");
            C29701Eo c29701Eo6 = this.LIZLLL;
            if (c29701Eo6 != null) {
                c29701Eo6.setRepeatCount(-1);
            }
        }
        C29701Eo c29701Eo7 = this.LIZLLL;
        if (c29701Eo7 != null) {
            f = c29701Eo7.getAlpha();
        } else {
            f = 0.0f;
        }
        if (z) {
            f3 = 0.5f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("self smoke effect---->>>>startAlpha = ");
        LIZ.append(f);
        LIZ.append(" end =");
        LIZ.append(f3);
        C0NB.LJIIIZ("MatchItemHealthbar", X1D.LIZIZ(LIZ));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZLLL, (Property<C29701Eo, Float>) View.ALPHA, f, f3);
        ofFloat.setDuration(530L);
        ofFloat.start();
    }

    public final void LJ(boolean z) {
        Object obj;
        float f;
        long j;
        Float f2;
        C29701Eo c29701Eo = this.LIZLLL;
        if (c29701Eo == null) {
            return;
        }
        float f3 = 1.0f;
        if (z && o.LIZJ(Float.valueOf(c29701Eo.getAlpha()), 1.0f)) {
            return;
        }
        Object obj2 = null;
        if (!z) {
            C29701Eo c29701Eo2 = this.LIZLLL;
            if (c29701Eo2 != null) {
                f2 = Float.valueOf(c29701Eo2.getAlpha());
            } else {
                f2 = null;
            }
            if (o.LIZJ(f2, 0.0f)) {
                return;
            }
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            C29701Eo c29701Eo3 = this.LIZLLL;
            if (c29701Eo3 == null) {
                return;
            }
            c29701Eo3.setVisibility(8);
            return;
        }
        if (z) {
            C29701Eo c29701Eo4 = this.LIZLLL;
            if (c29701Eo4 != null) {
                c29701Eo4.setVisibility(0);
            }
            C29701Eo c29701Eo5 = this.LIZLLL;
            if (c29701Eo5 != null) {
                c29701Eo5.setAlpha(0.0f);
            }
            C15490jB.LJIIL(this.LIZLLL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_interaction_demand_2"), "match_blood_smoke_anim.zip", "images", true, null, null, 96);
            C29701Eo c29701Eo6 = this.LIZLLL;
            if (c29701Eo6 != null) {
                c29701Eo6.setRepeatCount(-1);
            }
            C0NB.LJIIIZ("MatchItemHealthbar", "init smoke lottie");
        }
        C29701Eo c29701Eo7 = this.LIZLLL;
        if (c29701Eo7 != null) {
            f = c29701Eo7.getAlpha();
        } else {
            f = 0.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            obj2 = dataChannel2.kv0(BattleSmokeCardEffectChannel.class);
        }
        if (obj2 == EnumC76461Tzd.EFFECTING) {
            j = 260;
            if (!z) {
                f3 = 0.5f;
            }
        } else {
            j = 530;
        }
        C0NB.LJIIIZ("MatchItemHealthbar", "show Appear Animation---");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZLLL, (Property<C29701Eo, Float>) View.ALPHA, f, f3);
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    public final void LJII(String str) {
        Object obj;
        StringBuilder LIZIZ = C25620zW.LIZIZ("Call fissssssss source = ", str, " & selfUseAnimating = ");
        LIZIZ.append(this.LJIIIZ);
        LIZIZ.append(" & waitingAnimatingList.isEmpty() = ");
        LIZIZ.append(this.LJIIJ.isEmpty());
        C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZIZ));
        if (this.LJIIIZ || this.LJIIJ.isEmpty()) {
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            C0NB.LJ("MatchFeedItemDelegate", "showSelfUseCardFirstStepAnim, return by BattleStateChannel invalidate");
            return;
        }
        ItemInfo4FE poll = this.LJIIJ.poll();
        if (poll == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waiting List size  111111 = ");
        LIZ.append(this.LJIIJ.isEmpty());
        LIZ.append(" & iteminFoType = ");
        LIZ.append(poll);
        C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ));
        this.LJIIIZ = true;
        C0NB.LJIIIZ("MatchFeedItemDelegate", "show Self Use Card Animation first step load finish success");
        int i = poll.itemType;
        if (i == 1) {
            C15610jN.LIZJ(this.LJII, 3100L);
        } else {
            if (i != 2) {
                return;
            }
            C15610jN.LIZJ(this.LJIIIIZZ, 3300L);
        }
    }

    public final void LIZ(int i, BattleItem4FEModel battleItem4FEModel) {
        Long l;
        List<ItemInfo4FE> list;
        long j;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BattleTimeLeftChannel.class)) != null) {
            long longValue = l.longValue();
            if (longValue < 1) {
                C0NB.LJ("MatchFeedItemDelegate", "PK left time too late");
                return;
            }
            List<ItemInfo4FE> list2 = battleItem4FEModel.itemList;
            if (list2 != null && !list2.isEmpty() && (list = battleItem4FEModel.itemList) != null) {
                Integer valueOf = Integer.valueOf(list.size());
                if (valueOf != null) {
                    ItemInfo4FE itemInfo4FE = (ItemInfo4FE) ListProtector.get(list, valueOf.intValue() - 1);
                    if (itemInfo4FE != null) {
                        long j2 = itemInfo4FE.effectStartTimeSec;
                        if (itemInfo4FE != null) {
                            j = itemInfo4FE.effectLastDuration;
                        } else {
                            j = 30;
                        }
                        long j3 = j2 + j;
                        if (j3 <= 30 || C30725C4b.LIZIZ() / 1000 > j3) {
                            return;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            this.LJIILIIL = longValue - (j3 - (C30725C4b.LIZIZ() / 1000));
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("calculateBuffCountDownSceond ---->>>smokeBuffEndInPKTime = ");
                            LIZ.append(this.LJIILIIL);
                            C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ));
                            if (this.LJIILIIL >= 0) {
                                return;
                            }
                            this.LJIILIIL = 0L;
                            return;
                        }
                        this.LJIILJJIL = longValue - (j3 - (C30725C4b.LIZIZ() / 1000));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("calculateBuffCountDownSceond ---->>>criticalBuffEndInPKTime = ");
                        LIZ2.append(this.LJIILJJIL);
                        C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ2));
                        if (this.LJIILJJIL >= 0) {
                            return;
                        }
                        this.LJIILJJIL = 0L;
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void LIZIZ(int i, long j, ItemInfo4FE itemInfo4FE) {
        Long l;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BattleTimeLeftChannel.class)) != null) {
            long longValue = l.longValue();
            if (longValue < 1) {
                C0NB.LJ("MatchFeedItemDelegate", "PK left time too late");
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                long j2 = this.LJIIJJI;
                if (j2 < 0) {
                    this.LJIIJJI = longValue - j;
                } else {
                    this.LJIIJJI = j2 - j;
                }
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(BattleItemSmokeDebuffTimeLeft.class, new C76433TzB(j, itemInfo4FE, true));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("calculateBuffCountDownSceond ---->>>smokeDebuffEndInPKTime = ");
                LIZ.append(this.LJIIJJI);
                LIZ.append(" countDownSecond = ");
                LIZ.append(j);
                C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ));
                return;
            }
            long j3 = this.LJIIL;
            if (j3 < 0) {
                this.LJIIL = longValue - j;
            } else {
                this.LJIIL = j3 - j;
            }
            DataChannel dataChannel3 = this.LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.rv0(BattleItemCriticalDebuffTimeLeft.class, new C76433TzB(j, itemInfo4FE, true));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calculateBuffCountDownSceond ---->>>criticalDebuffEndInPKTime = ");
            LIZ2.append(this.LJIIL);
            LIZ2.append(" countDownSecond = ");
            LIZ2.append(j);
            C0NB.LJ("MatchFeedItemDelegate", X1D.LIZIZ(LIZ2));
        }
    }
}

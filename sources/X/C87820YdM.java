package X;

import android.animation.ValueAnimator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0200000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YdM, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87820YdM {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIIL;
    public DataChannel LIZ;
    public final C87818YdK LIZIZ;
    public final C31651CbX LIZJ;
    public final C31651CbX LIZLLL;
    public final C31651CbX LJ;
    public final C31651CbX LJFF;
    public final C31651CbX LJI;
    public final C31651CbX LJII;
    public final C31651CbX LJIIIIZZ;
    public final C31651CbX LJIIIZ;
    public final C31651CbX LJIIJ;
    public final C31651CbX LJIIJJI;

    static {
        TBT tbt = new TBT(C87820YdM.class, "defaultProcessor", "getDefaultProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/DefaultProcessor;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C87820YdM.class, "sweepProcessor", "getSweepProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/SweepProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "scrollStrongProcessor", "getScrollStrongProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/ScrollStrongProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "scrollWeakProcessor", "getScrollWeakProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/ScrollWeakProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "alphaProcessor", "getAlphaProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/AlphaProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "riseAndFallProcessor", "getRiseAndFallProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/RiseAndFallProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "startPeriodProcessor", "getStartPeriodProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/StartPeriodProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "loopProcessor", "getLoopProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/LoopProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "countDownProcessor", "getCountDownProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/CountDownProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "highlightProcessor", "getHighlightProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/HighlightProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C87820YdM.class, "marqueeProcessor", "getMarqueeProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/MarqueeProcessor;", 0, c65351Pkp)};
    }

    public final C87794Ycw LIZ() {
        return (C87794Ycw) this.LIZJ.LIZ(this, LJIIL[0]);
    }

    public final C87806Yd8 LIZIZ() {
        return (C87806Yd8) this.LJIIIIZZ.LIZ(this, LJIIL[7]);
    }

    public final C87793Ycv LIZJ() {
        return (C87793Ycv) this.LJIIJJI.LIZ(this, LJIIL[10]);
    }

    public final C87819YdL LIZLLL() {
        return (C87819YdL) this.LJI.LIZ(this, LJIIL[5]);
    }

    public final void LJFF(C31526CYw c31526CYw) {
        C31522CYs.LIZ = "rank_update";
        C31522CYs.LJIIIZ(c31526CYw, this.LIZ, "room_topleft");
    }

    public final void LJI(C31521CYr c31521CYr, C31521CYr next) {
        RankAnimationInfo rankAnimationInfo;
        o.LJIIIZ(next, "next");
        if (c31521CYr == null) {
            LIZ().LIZLLL(next);
            return;
        }
        if (this.LIZIZ.LJIILJJIL != null) {
            RankAnimationInfo rankAnimationInfo2 = next.LJFF;
            if (rankAnimationInfo2 != null && rankAnimationInfo2.type == EnumC31519CYp.LOOP.getType()) {
                return;
            }
            RankAnimationInfo rankAnimationInfo3 = next.LJFF;
            if (rankAnimationInfo3 != null && rankAnimationInfo3.type == EnumC31519CYp.LOOP_FOR_OFF_RANK.getType()) {
                return;
            }
        }
        if (LIZJ().LJIILL != 0) {
            RankAnimationInfo rankAnimationInfo4 = next.LJFF;
            if ((rankAnimationInfo4 != null && rankAnimationInfo4.type == EnumC31519CYp.ENTER_RANK.getType()) || ((rankAnimationInfo = next.LJFF) != null && rankAnimationInfo.type == EnumC31519CYp.LEAVE_RANK.getType())) {
                C87793Ycv LIZJ = this.LIZIZ.LIZ.LIZJ();
                LIZJ.LJIIZILJ = true;
                ValueAnimator valueAnimator = LIZJ.LJIILLIIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                LIZJ().LJIILJJIL = null;
                LJII(c31521CYr, next);
                return;
            }
            LIZJ().LJIILJJIL = new RunnableC87795Ycx(this, c31521CYr, next);
            return;
        }
        LJII(c31521CYr, next);
    }

    public final void LJII(C31521CYr c31521CYr, C31521CYr c31521CYr2) {
        EnumC31514CYk enumC31514CYk = c31521CYr.LIZ.LIZ;
        EnumC31514CYk enumC31514CYk2 = EnumC31514CYk.GIFT_RANK;
        Integer num = null;
        if (enumC31514CYk == enumC31514CYk2 && c31521CYr2.LIZ.LIZ == enumC31514CYk2) {
            AbstractC87817YdJ abstractC87817YdJ = this.LIZIZ.LJIILJJIL;
            if (abstractC87817YdJ != null) {
                abstractC87817YdJ.LIZLLL(c31521CYr2);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            RankAnimationInfo rankAnimationInfo = c31521CYr2.LJFF;
            if (rankAnimationInfo != null) {
                num = Integer.valueOf(rankAnimationInfo.type);
            }
            int type = EnumC31519CYp.ENTER_RANK.getType();
            if (num == null || num.intValue() != type) {
                int type2 = EnumC31519CYp.LEAVE_RANK.getType();
                if (num == null || num.intValue() != type2) {
                    int type3 = EnumC31519CYp.RISE.getType();
                    if (num == null || num.intValue() != type3) {
                        int type4 = EnumC31519CYp.FALL.getType();
                        if (num == null || num.intValue() != type4) {
                            int type5 = EnumC31519CYp.AFTER_SETTLE.getType();
                            if (num == null || num.intValue() != type5) {
                                int type6 = EnumC31519CYp.BEFORE_SETTLE.getType();
                                if (num == null || num.intValue() != type6) {
                                    int type7 = EnumC31519CYp.BEFORE_SETTLE_SIMPLE.getType();
                                    if (num == null || num.intValue() != type7) {
                                        int type8 = EnumC31519CYp.LOOP.getType();
                                        if (num == null || num.intValue() != type8) {
                                            int type9 = EnumC31519CYp.LOOP_FOR_OFF_RANK.getType();
                                            if (num == null || num.intValue() != type9) {
                                                if (!o.LJ(c31521CYr.LIZ.LIZIZ, c31521CYr2.LIZ.LIZIZ)) {
                                                    ((AbstractC87817YdJ) this.LJFF.LIZ(this, LJIIL[4])).LIZLLL(c31521CYr2);
                                                    return;
                                                } else {
                                                    LIZ().LIZLLL(c31521CYr2);
                                                    return;
                                                }
                                            }
                                        }
                                        LIZIZ().LJIILJJIL = !o.LJ(c31521CYr.LIZ.LIZLLL, c31521CYr2.LIZ.LIZLLL);
                                        LIZIZ().LIZLLL(c31521CYr2);
                                        return;
                                    }
                                    ((AbstractC87817YdJ) this.LJIIJ.LIZ(this, LJIIL[9])).LIZLLL(c31521CYr2);
                                    return;
                                }
                                ((AbstractC87817YdJ) this.LJIIIZ.LIZ(this, LJIIL[8])).LIZLLL(c31521CYr2);
                                return;
                            }
                            ((AbstractC87817YdJ) this.LJII.LIZ(this, LJIIL[6])).LIZLLL(c31521CYr2);
                            return;
                        }
                        LIZLLL().LIZLLL(c31521CYr2);
                        LJ(String.valueOf(c31521CYr.LIZJ), String.valueOf(c31521CYr2.LIZJ), "drop", c31521CYr2.LIZ);
                        return;
                    }
                    LIZLLL().LIZLLL(c31521CYr2);
                    LJ(String.valueOf(c31521CYr.LIZJ), String.valueOf(c31521CYr2.LIZJ), "rise", c31521CYr2.LIZ);
                    return;
                }
                if (o.LJ(c31521CYr.LIZ.LIZIZ, c31521CYr2.LIZ.LIZIZ)) {
                    LJ(String.valueOf(c31521CYr.LIZJ), "-", "rank_out", c31521CYr2.LIZ);
                } else {
                    LJ(String.valueOf(c31521CYr.LIZJ), "-", "shift_rank_out", c31521CYr2.LIZ);
                }
                if (!o.LJ(c31521CYr.LIZ.LIZLLL, c31521CYr2.LIZ.LIZLLL)) {
                    ((AbstractC87817YdJ) this.LJ.LIZ(this, LJIIL[3])).LIZLLL(c31521CYr2);
                } else {
                    ((AbstractC87817YdJ) this.LJFF.LIZ(this, LJIIL[4])).LIZLLL(c31521CYr2);
                }
                LJFF(c31521CYr2.LIZ);
                return;
            }
            C2313596d.LIZ.put(c31521CYr2.LIZ.LIZIZ.type, true);
            ((AbstractC87817YdJ) this.LIZLLL.LIZ(this, LJIIL[1])).LIZLLL(c31521CYr2);
            if (c31521CYr.LIZJ > 0 && !o.LJ(c31521CYr.LIZ.LIZIZ, c31521CYr2.LIZ.LIZIZ)) {
                BZI LIZ = C28787BRn.LIZ("livesdk_rank_shift");
                LIZ.LJIILLIIL(this.LIZ);
                LIZ.LJIJJ(c31521CYr.LIZ.LIZIZ.rankName, "from_rank_type");
                LIZ.LJIJJ(c31521CYr2.LIZ.LIZIZ.rankName, "to_rank_type");
                LIZ.LJIJJ(Long.valueOf(c31521CYr.LIZJ), "rank_from");
                C30869C9p.LIZ(c31521CYr2.LIZJ, LIZ, "rank_to");
            } else {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_get_on_rank");
                LIZ2.LJIILLIIL(this.LIZ);
                LIZ2.LJIJJ(Long.valueOf(c31521CYr2.LIZJ), "current_rank");
                LIZ2.LJIJJ(c31521CYr2.LIZ.LIZIZ.rankName, "rank_type");
                LIZ2.LJJIIJZLJL();
            }
            LJFF(c31521CYr2.LIZ);
            return;
        }
        if (enumC31514CYk == c31521CYr2.LIZ.LIZ) {
            AbstractC87817YdJ abstractC87817YdJ2 = this.LIZIZ.LJIILJJIL;
            if (abstractC87817YdJ2 != null) {
                abstractC87817YdJ2.LIZLLL(c31521CYr2);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            RankAnimationInfo rankAnimationInfo2 = c31521CYr2.LJFF;
            if (rankAnimationInfo2 != null) {
                num = Integer.valueOf(rankAnimationInfo2.type);
            }
            int type10 = EnumC31519CYp.ENTER_RANK.getType();
            if (num == null || num.intValue() != type10) {
                int type11 = EnumC31519CYp.RISE.getType();
                if (num == null || num.intValue() != type11) {
                    int type12 = EnumC31519CYp.FALL.getType();
                    if (num == null || num.intValue() != type12) {
                        int type13 = EnumC31519CYp.LEAVE_RANK.getType();
                        if (num == null || num.intValue() != type13) {
                            int type14 = EnumC31519CYp.LOOP.getType();
                            if (num == null || num.intValue() != type14) {
                                int type15 = EnumC31519CYp.LOOP_FOR_OFF_RANK.getType();
                                if (num == null || num.intValue() != type15) {
                                    LIZ().LIZLLL(c31521CYr2);
                                    return;
                                }
                            }
                            LIZIZ().LJIILJJIL = !o.LJ(c31521CYr.LIZ.LIZLLL, c31521CYr2.LIZ.LIZLLL);
                            LIZIZ().LIZLLL(c31521CYr2);
                            return;
                        }
                        ((AbstractC87817YdJ) this.LJFF.LIZ(this, LJIIL[4])).LIZLLL(c31521CYr2);
                        C31526CYw c31526CYw = c31521CYr2.LIZ;
                        if (c31526CYw.LIZ != EnumC31514CYk.GAME_RANK) {
                            return;
                        }
                        LJFF(c31526CYw);
                        if (o.LJ(c31521CYr.LIZ.LIZIZ, c31521CYr2.LIZ.LIZIZ)) {
                            LJ(String.valueOf(c31521CYr.LIZJ), "-", "rank_out", c31521CYr2.LIZ);
                            return;
                        } else {
                            LJ(String.valueOf(c31521CYr.LIZJ), "-", "shift_rank_out", c31521CYr2.LIZ);
                            return;
                        }
                    }
                    LIZLLL().LIZLLL(c31521CYr2);
                    if (c31521CYr2.LIZ.LIZ != EnumC31514CYk.GAME_RANK) {
                        return;
                    }
                    LJ(String.valueOf(c31521CYr.LIZJ), String.valueOf(c31521CYr2.LIZJ), "drop", c31521CYr2.LIZ);
                    return;
                }
                LIZLLL().LIZLLL(c31521CYr2);
                if (c31521CYr2.LIZ.LIZ != EnumC31514CYk.GAME_RANK) {
                    return;
                }
                LJ(String.valueOf(c31521CYr.LIZJ), String.valueOf(c31521CYr2.LIZJ), "rise", c31521CYr2.LIZ);
                return;
            }
            C2313596d.LIZ.put(c31521CYr2.LIZ.LIZIZ.type, true);
            ((AbstractC87817YdJ) this.LIZLLL.LIZ(this, LJIIL[1])).LIZLLL(c31521CYr2);
            C31526CYw c31526CYw2 = c31521CYr2.LIZ;
            if (c31526CYw2.LIZ != EnumC31514CYk.GAME_RANK) {
                return;
            }
            LJFF(c31526CYw2);
            BZI LIZ3 = C28787BRn.LIZ("livesdk_get_on_rank");
            LIZ3.LJIILLIIL(this.LIZ);
            LIZ3.LJIJJ(Long.valueOf(c31521CYr2.LIZJ), "current_rank");
            V0N.LJJIIZ(LIZ3, c31521CYr2.LIZ);
            LIZ3.LJJIIJZLJL();
            return;
        }
        AbstractC87817YdJ abstractC87817YdJ3 = this.LIZIZ.LJIILJJIL;
        if (abstractC87817YdJ3 != null) {
            abstractC87817YdJ3.LIZLLL(c31521CYr2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZ().LIZLLL(c31521CYr2);
    }

    public final void LJ(String str, String str2, String str3, C31526CYw c31526CYw) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_rank_change", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_rank_change");
        LIZ.LJIILLIIL(this.LIZ);
        LIZ.LJIJJ(str, "rank_from");
        LIZ.LJIJJ(str2, "rank_to");
        LIZ.LJIJJ(str3, "change_type");
        V0N.LJJIIZ(LIZ, c31526CYw);
        LIZ.LJJIIJZLJL();
    }

    public C87820YdM(CardView cardView, DataChannel dataChannel, InterfaceC87839Ydf iAnimationFinishListener, boolean z, boolean z2) {
        o.LJIIIZ(iAnimationFinishListener, "iAnimationFinishListener");
        this.LIZ = dataChannel;
        this.LIZIZ = new C87818YdK(this, iAnimationFinishListener, z);
        this.LIZJ = new C31651CbX(new AqS163S0200000_16(cardView, this, 15));
        this.LIZLLL = new C31651CbX(new AqS163S0200000_16(cardView, this, 23));
        new C31651CbX(new AqS163S0200000_16(cardView, this, 20));
        this.LJ = new C31651CbX(new AqS163S0200000_16(cardView, this, 21));
        this.LJFF = new C31651CbX(new AqS163S0200000_16(cardView, this, 13));
        this.LJI = new C31651CbX(new AqS163S0200000_16(cardView, this, 19));
        this.LJII = new C31651CbX(new AqS163S0200000_16(cardView, this, 22));
        this.LJIIIIZZ = new C31651CbX(new AqS163S0200000_16(cardView, this, 17));
        this.LJIIIZ = new C31651CbX(new AqS163S0200000_16(cardView, this, 14));
        this.LJIIJ = new C31651CbX(new AqS163S0200000_16(cardView, this, 16));
        this.LJIIJJI = new C31651CbX(new AqS163S0200000_16(cardView, this, 18));
    }
}

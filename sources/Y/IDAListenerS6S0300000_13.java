package Y;

import X.AnonymousClass064;
import X.C0NB;
import X.C15620jO;
import X.C29306Beo;
import X.C29701Eo;
import X.C29916Boe;
import X.C34K;
import X.C47061t0;
import X.C74776TWi;
import X.C75622Tm6;
import X.C76265TwT;
import X.C76280Twi;
import X.C76469Tzl;
import X.C76470Tzm;
import X.C76471Tzn;
import X.C76472Tzo;
import X.CL6;
import X.EnumC30204BtI;
import X.EnumC76429Tz7;
import X.InterfaceC78716Uuu;
import X.TSQ;
import X.TSR;
import X.TV2;
import X.ViewOnClickListenerC76430Tz8;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDAListenerS6S0300000_13 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                onAnimationCancel$6(this, animator);
                return;
            case 7:
                onAnimationCancel$7(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animation");
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                onAnimationStart$6(this, animator);
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS6S0300000_13.l0).setAlpha(1.0f);
        EnumC30204BtI enumC30204BtI = (EnumC30204BtI) iDAListenerS6S0300000_13.l1;
        if (enumC30204BtI == EnumC30204BtI.MULTIGUEST) {
            C74776TWi.LJIIIIZZ(((TSQ) iDAListenerS6S0300000_13.l2).LIZ);
        } else {
            enumC30204BtI.show(((TSQ) iDAListenerS6S0300000_13.l2).LIZ);
        }
    }

    public static final void onAnimationCancel$2(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C76469Tzl) iDAListenerS6S0300000_13.l0).LJJJLZIJ(true);
    }

    public static final void onAnimationCancel$6(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C76472Tzo) iDAListenerS6S0300000_13.l1).LJJJLZIJ(true);
    }

    public static final void onAnimationCancel$7(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS6S0300000_13.l0).setAlpha(1.0f);
        EnumC30204BtI enumC30204BtI = (EnumC30204BtI) iDAListenerS6S0300000_13.l1;
        if (enumC30204BtI == EnumC30204BtI.MULTIGUEST) {
            DataChannel dataChannel = ((TSR) iDAListenerS6S0300000_13.l2).LIZ;
            MultiLiveAnchorPanelSettings LJI = TV2.LJI();
            if (LJI != null && LJI.allowViewerReq == 4 && TV2.LJIIJJI()) {
                TV2.LJIIIIZZ(dataChannel);
                return;
            } else {
                TV2.LIZLLL(dataChannel);
                return;
            }
        }
        enumC30204BtI.show(((TSR) iDAListenerS6S0300000_13.l2).LIZ);
    }

    public static final void onAnimationEnd$1(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((C34K) iDAListenerS6S0300000_13.l2).element) {
            C76469Tzl c76469Tzl = (C76469Tzl) iDAListenerS6S0300000_13.l1;
            c76469Tzl.LLIIZ.post(new ARunnableS49S0100000_13(c76469Tzl, 194));
            ((C34K) iDAListenerS6S0300000_13.l2).element = true;
        }
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(8);
        ((C76469Tzl) iDAListenerS6S0300000_13.l1).LJJJZ();
        CL6.LIZIZ("match_in_progress");
        ((C76469Tzl) iDAListenerS6S0300000_13.l1).LLILII = false;
    }

    public static final void onAnimationEnd$2(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((C34K) iDAListenerS6S0300000_13.l2).element) {
            C76469Tzl c76469Tzl = (C76469Tzl) iDAListenerS6S0300000_13.l0;
            c76469Tzl.LLIIZ.post(new ARunnableS49S0100000_13(c76469Tzl, 195));
            ((C34K) iDAListenerS6S0300000_13.l2).element = true;
        }
        ((C76469Tzl) iDAListenerS6S0300000_13.l0).LJJJLZIJ(true);
        ((C29701Eo) iDAListenerS6S0300000_13.l1).setVisibility(8);
        ((C76469Tzl) iDAListenerS6S0300000_13.l0).LJJJZ();
        CL6.LIZIZ("match_in_progress");
        ((C76469Tzl) iDAListenerS6S0300000_13.l0).LLILII = false;
    }

    public static final void onAnimationEnd$3(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ConstraintLayout) iDAListenerS6S0300000_13.l1).setVisibility(8);
        Iterator it = ((List) iDAListenerS6S0300000_13.l0).iterator();
        while (it.hasNext()) {
            ((ViewOnClickListenerC76430Tz8) it.next()).LJLIL();
        }
        ((C76470Tzm) iDAListenerS6S0300000_13.l2).getClass();
    }

    public static final void onAnimationEnd$4(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((C34K) iDAListenerS6S0300000_13.l2).element) {
            C76472Tzo c76472Tzo = (C76472Tzo) iDAListenerS6S0300000_13.l1;
            c76472Tzo.LLI.post(new ARunnableS49S0100000_13(c76472Tzo, 229));
            ((C34K) iDAListenerS6S0300000_13.l2).element = true;
        }
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(8);
        ((C76472Tzo) iDAListenerS6S0300000_13.l1).LJJJZ();
        CL6.LIZIZ("match_in_progress");
    }

    public static final void onAnimationEnd$5(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ConstraintLayout) iDAListenerS6S0300000_13.l1).setVisibility(8);
        Iterator it = ((List) iDAListenerS6S0300000_13.l0).iterator();
        while (it.hasNext()) {
            ((ViewOnClickListenerC76430Tz8) it.next()).LJLIL();
        }
        ((C76471Tzn) iDAListenerS6S0300000_13.l2).LLIIIZ = null;
    }

    public static final void onAnimationEnd$6(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((C34K) iDAListenerS6S0300000_13.l2).element) {
            C76472Tzo c76472Tzo = (C76472Tzo) iDAListenerS6S0300000_13.l1;
            c76472Tzo.LLI.post(new ARunnableS49S0100000_13(c76472Tzo, 236));
            ((C34K) iDAListenerS6S0300000_13.l2).element = true;
        }
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(8);
        ((C76472Tzo) iDAListenerS6S0300000_13.l1).LJJJLZIJ(true);
        ((C76472Tzo) iDAListenerS6S0300000_13.l1).LJJJZ();
        CL6.LIZIZ("match_in_progress");
    }

    public static final void onAnimationStart$0(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        EnumC30204BtI enumC30204BtI = (EnumC30204BtI) iDAListenerS6S0300000_13.l1;
        if (enumC30204BtI == EnumC30204BtI.MULTIGUEST) {
            C74776TWi.LJIIIIZZ(((TSQ) iDAListenerS6S0300000_13.l2).LIZ);
        } else {
            enumC30204BtI.show(((TSQ) iDAListenerS6S0300000_13.l2).LIZ);
        }
        ((View) iDAListenerS6S0300000_13.l0).setAlpha(0.0f);
    }

    public static final void onAnimationStart$1(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        Long l;
        User owner;
        BestTeammateRelation bestTeammateRelation;
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(0);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIIIZ) {
            C76469Tzl c76469Tzl = (C76469Tzl) iDAListenerS6S0300000_13.l1;
            c76469Tzl.getClass();
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
                    Room LJJJJI = c76469Tzl.LJJJJI();
                    if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null) {
                        l2 = Long.valueOf(owner.getId());
                    }
                    if (o.LJ(l, l2)) {
                        return;
                    }
                }
                C29916Boe c29916Boe = c76469Tzl.LLIILII;
                if (c29916Boe != null) {
                    c29916Boe.setAlpha(0.0f);
                }
                C29306Beo.LJJLJLI(c76469Tzl.LLIILII);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c76469Tzl.LLIILII, (Property<C29916Boe, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setStartDelay(200L);
                ofFloat.setDuration(260L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c76469Tzl.LLIILII, (Property<C29916Boe, Float>) View.ALPHA, 1.0f, 1.0f);
                ofFloat2.setDuration(1480L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c76469Tzl.LLIILII, (Property<C29916Boe, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat3.setDuration(320L);
                animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
                animatorSet.addListener(new IDAListenerS80S0100000_13(c76469Tzl, 21));
                animatorSet.start();
                return;
            }
            C29306Beo.LJI(c76469Tzl.LLIILII);
        }
    }

    public static final void onAnimationStart$2(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C76469Tzl) iDAListenerS6S0300000_13.l0).LJJJLL();
        ((C29701Eo) iDAListenerS6S0300000_13.l1).setVisibility(0);
    }

    public static final void onAnimationStart$3(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Iterator it = ((List) iDAListenerS6S0300000_13.l0).iterator();
        while (it.hasNext()) {
            ((ViewOnClickListenerC76430Tz8) it.next()).LJLILLLLZI();
        }
    }

    public static final void onAnimationStart$4(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(0);
        C76472Tzo c76472Tzo = (C76472Tzo) iDAListenerS6S0300000_13.l1;
        if (c76472Tzo.LLIIIJ == null) {
            C0NB.LIZIZ("MultiMatchAudienceWidge", " battleTaskEnterRoomPrompt null");
        } else {
            WIDGET widget = c76472Tzo.LJLIL;
            if (widget != 0) {
                ConstraintLayout constraintLayout = (ConstraintLayout) widget.findViewById(R.id.fxp);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) widget.findViewById(R.id.gf7);
                anonymousClass064.LJII(constraintLayout2);
                anonymousClass064.LJI(R.id.fxp, 4);
                anonymousClass064.LJIIIZ(R.id.fxp, 4, R.id.gp8, 4, 0);
                anonymousClass064.LIZIZ(constraintLayout2);
                ((TextView) widget.findViewById(R.id.fxq)).setText(c76472Tzo.LLIIIJ);
                constraintLayout.setVisibility(0);
                C47061t0 c47061t0 = (C47061t0) widget.findViewById(R.id.fxo);
                c47061t0.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJJLZIJ);
                C15620jO.LIZ(c47061t0, R.drawable.cay);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration(320L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 1.0f);
                ofFloat2.setDuration(1480L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat3.setDuration(320L);
                animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
                animatorSet.addListener(new IDAListenerS43S0200000_13(constraintLayout, c76472Tzo, 15));
                animatorSet.start();
            }
        }
        if (!C76265TwT.LIZ.LJIIIZ) {
            C76472Tzo c76472Tzo2 = (C76472Tzo) iDAListenerS6S0300000_13.l1;
            if (c76472Tzo2.LLIIIJ == null) {
                c76472Tzo2.LJJZ();
            }
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, true, null);
    }

    public static final void onAnimationStart$5(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Iterator it = ((List) iDAListenerS6S0300000_13.l0).iterator();
        while (it.hasNext()) {
            ((ViewOnClickListenerC76430Tz8) it.next()).LJLILLLLZI();
        }
    }

    public static final void onAnimationStart$6(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) iDAListenerS6S0300000_13.l0).setVisibility(0);
        ((C76472Tzo) iDAListenerS6S0300000_13.l1).LJJJLL();
        if (!C76265TwT.LIZ.LJIIIZ) {
            C76472Tzo c76472Tzo = (C76472Tzo) iDAListenerS6S0300000_13.l1;
            if (c76472Tzo.LLIIIJ == null) {
                c76472Tzo.LJJZ();
            }
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, true, null);
    }

    public static final void onAnimationStart$7(IDAListenerS6S0300000_13 iDAListenerS6S0300000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        EnumC30204BtI enumC30204BtI = (EnumC30204BtI) iDAListenerS6S0300000_13.l1;
        if (enumC30204BtI == EnumC30204BtI.MULTIGUEST) {
            DataChannel dataChannel = ((TSR) iDAListenerS6S0300000_13.l2).LIZ;
            MultiLiveAnchorPanelSettings LJI = TV2.LJI();
            if (LJI != null && LJI.allowViewerReq == 4 && TV2.LJIIJJI()) {
                TV2.LJIIIIZZ(dataChannel);
            } else {
                TV2.LIZLLL(dataChannel);
            }
        } else {
            enumC30204BtI.show(((TSR) iDAListenerS6S0300000_13.l2).LIZ);
        }
        ((View) iDAListenerS6S0300000_13.l0).setAlpha(0.0f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDAListenerS6S0300000_13(X.C29701Eo r2, X.C76469Tzl r3, X.C34K r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDAListenerS6S0300000_13.<init>(X.1Eo, X.Tzl, X.34K, int):void");
    }

    public IDAListenerS6S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

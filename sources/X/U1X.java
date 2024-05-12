package X;

import Y.ACListenerS33S0100000_13;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS94S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1X extends FrameLayout {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Boolean LJLJJL;
    public DataChannel LJLJJLL;
    public AnimatorSet LJLJL;
    public AnimatorSet LJLJLJ;
    public final U1Y LJLJLLL;
    public final FrameLayout LJLL;
    public final View LJLLI;
    public final HorizontalScrollView LJLLILLLL;
    public final LinearLayout LJLLJ;
    public final U1Y LJLLL;
    public final LinearLayout LJLLLL;
    public final LinearLayout LJLLLLLL;
    public final ConstraintLayout LJLZ;
    public final FrameLayout LJZ;
    public final C47121t6 LJZI;
    public final C47061t0 LJZL;
    public final C47061t0 LL;
    public final C47061t0 LLD;
    public final C47061t0 LLF;
    public final C47061t0 LLFF;
    public final C47061t0 LLFFF;
    public ValueAnimator LLFII;
    public ARunnableS17S0101000_13 LLFZ;
    public ARunnableS49S0100000_13 LLI;
    public ARunnableS32S0200000_13 LLIFFJFJJ;
    public ARunnableS49S0100000_13 LLII;
    public final C31597Caf LLIIII;
    public final TBF LLIIIILZ;
    public final List<U1Y> LLIIIJ;
    public final List<U1Y> LLIIIL;

    public final void LIZIZ() {
        this.LJLJJL = null;
        for (U1Y u1y : this.LLIIIJ) {
            if (u1y != null) {
                u1y.setDefaultSeat(true);
            }
        }
        for (U1Y u1y2 : this.LLIIIL) {
            if (u1y2 != null) {
                u1y2.setDefaultSeat(false);
            }
        }
    }

    public final void LIZ() {
        AnimatorSet animatorSet = this.LJLJL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJLJL;
        if (animatorSet2 != null) {
            C16880lQ.LJLJJL(animatorSet2);
        }
        this.LJLJL = null;
        AnimatorSet animatorSet3 = this.LJLJLJ;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LJLJLJ;
        if (animatorSet4 != null) {
            C16880lQ.LJLJJL(animatorSet4);
        }
        this.LJLJLJ = null;
        removeCallbacks(this.LLI);
        this.LLI = null;
        removeCallbacks(this.LLIFFJFJJ);
        this.LLIFFJFJJ = null;
        removeCallbacks(this.LLFZ);
        this.LLFZ = null;
        removeCallbacks(this.LLII);
        this.LLII = null;
    }

    public final int getMvpWidth() {
        Integer num;
        int i;
        LinearLayout linearLayout = this.LJLLLL;
        Integer num2 = null;
        if (linearLayout != null) {
            num = Integer.valueOf(linearLayout.getMeasuredWidth());
        } else {
            num = null;
        }
        LinearLayout linearLayout2 = this.LJLLLLLL;
        if (linearLayout2 != null) {
            num2 = Integer.valueOf(linearLayout2.getMeasuredWidth());
        }
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return (i + i2) - C15380j0.LIZ(8.0f);
    }

    public final void setClickCallback(InterfaceC88472Yns<? super Boolean, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C75622Tm6.LJIJI(EnumC76429Tz7.CONTRIBUTE_ENTRANCE, true, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U1X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIIIJ = new ArrayList();
        this.LLIIIL = new ArrayList();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dby, this, true);
        this.LJLL = (FrameLayout) findViewById(R.id.gv9);
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.df9);
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        U1Y u1y = (U1Y) findViewById(R.id.fpd);
        this.LJLJLLL = u1y;
        View findViewById = findViewById(R.id.fpe);
        View findViewById2 = findViewById(R.id.fpf);
        U1Y u1y2 = (U1Y) findViewById(R.id.j33);
        this.LJLLL = u1y2;
        View findViewById3 = findViewById(R.id.j34);
        View findViewById4 = findViewById(R.id.j35);
        this.LLIIIJ = C47261Igj.LJJIJIL(u1y, findViewById, findViewById2);
        this.LLIIIL = C47261Igj.LJJIJIL(u1y2, findViewById3, findViewById4);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fj6);
        this.LJLLLL = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.fl6);
        this.LJLLLLLL = linearLayout2;
        this.LJLZ = (ConstraintLayout) findViewById(R.id.gv_);
        this.LJZ = (FrameLayout) findViewById(R.id.gv7);
        this.LJZI = (C47121t6) findViewById(R.id.mbu);
        this.LLF = (C47061t0) findViewById(R.id.exz);
        this.LLFF = (C47061t0) findViewById(R.id.ey1);
        this.LLFFF = (C47061t0) findViewById(R.id.ey3);
        this.LJZL = (C47061t0) findViewById(R.id.exy);
        this.LL = (C47061t0) findViewById(R.id.ey0);
        this.LLD = (C47061t0) findViewById(R.id.ey2);
        this.LJLLI = findViewById(R.id.bsa);
        this.LJLLILLLL = (HorizontalScrollView) findViewById(R.id.jcn);
        this.LJLLJ = (LinearLayout) findViewById(R.id.g4n);
        this.LLIIII = (C31597Caf) findViewById(R.id.gva);
        this.LLIIIILZ = (TBF) findViewById(R.id.myx);
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS33S0100000_13(this, 114));
        }
        if (linearLayout2 != null) {
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS33S0100000_13(this, 115));
        }
    }

    public static final ValueAnimator LIZLLL(C47061t0 c47061t0, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        ofInt.addUpdateListener(new AUListenerS94S0100000_5(c47061t0, 23));
        ofInt.setDuration(1170L);
        ofInt.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ofInt.addListener(new LSZ(c47061t0));
        return ofInt;
    }

    public final void LJ(List list, boolean z) {
        List<U1Y> list2;
        U1Y u1y;
        int i;
        BattleUserArmy battleUserArmy;
        List LLILLL;
        ArrayList arrayList = new ArrayList();
        if (list != null && (LLILLL = ORZ.LLILLL(list, 3)) != null) {
            arrayList.addAll(LLILLL);
        }
        if (arrayList.size() < 3) {
            int size = 3 - arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z) {
                    battleUserArmy = BattleUserArmy.LJLIL;
                } else {
                    battleUserArmy = BattleUserArmy.LJLILLLLZI;
                }
                arrayList.add(battleUserArmy);
            }
        }
        if (z) {
            list2 = this.LLIIIJ;
        } else {
            list2 = this.LLIIIL;
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                BattleUserArmy army = (BattleUserArmy) next;
                if (list2 != null && (u1y = (U1Y) ListProtector.get(list2, i3)) != null) {
                    o.LJIIIZ(army, "army");
                    if (u1y.LJLJJL) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                i = R.drawable.d55;
                            } else {
                                i = R.drawable.d56;
                            }
                        } else {
                            i = R.drawable.d54;
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            i = R.drawable.d1x;
                        } else {
                            i = R.drawable.d1y;
                        }
                    } else {
                        i = R.drawable.d1w;
                    }
                    boolean LJ = o.LJ(army, BattleUserArmy.LJLIL);
                    int i5 = R.drawable.da_;
                    if (LJ) {
                        u1y.LJLIL = true;
                        C31597Caf c31597Caf = u1y.LJLILLLLZI;
                        if (c31597Caf != null) {
                            c31597Caf.setVisibility(0);
                        }
                        u1y.LJLJJLL = null;
                        C31597Caf c31597Caf2 = u1y.LJLILLLLZI;
                        if (c31597Caf2 != null) {
                            if (!u1y.LJLJJL) {
                                i5 = R.drawable.da9;
                            }
                            c31597Caf2.setImageResource(i5);
                        }
                        TBF tbf = u1y.LJLJJI;
                        if (tbf != null) {
                            tbf.setVisibility(8);
                        }
                        C47061t0 c47061t0 = u1y.LJLJI;
                        if (c47061t0 != null) {
                            c47061t0.setVisibility(8);
                        }
                        C47061t0 c47061t02 = u1y.LJLJL;
                        if (c47061t02 != null) {
                            c47061t02.setAlpha(0.0f);
                        }
                    } else if (o.LJ(army, BattleUserArmy.LJLILLLLZI)) {
                        u1y.LJLIL = true;
                        C31597Caf c31597Caf3 = u1y.LJLILLLLZI;
                        if (c31597Caf3 != null) {
                            c31597Caf3.setVisibility(0);
                        }
                        u1y.LJLJJLL = null;
                        C31597Caf c31597Caf4 = u1y.LJLILLLLZI;
                        if (c31597Caf4 != null) {
                            if (!u1y.LJLJJL) {
                                i5 = R.drawable.da9;
                            }
                            c31597Caf4.setImageResource(i5);
                        }
                        TBF tbf2 = u1y.LJLJJI;
                        if (tbf2 != null) {
                            tbf2.setVisibility(8);
                        }
                        C47061t0 c47061t03 = u1y.LJLJI;
                        if (c47061t03 != null) {
                            c47061t03.setVisibility(8);
                        }
                        C47061t0 c47061t04 = u1y.LJLJL;
                        if (c47061t04 != null) {
                            c47061t04.setAlpha(0.0f);
                        }
                    } else {
                        BattleUserArmy battleUserArmy2 = u1y.LJLJJLL;
                        if (battleUserArmy2 == null) {
                            u1y.LJLJJLL = army;
                        } else if (battleUserArmy2.userId == army.userId) {
                        }
                        u1y.LJLJJLL = army;
                        u1y.LJLIL = false;
                        C31597Caf c31597Caf5 = u1y.LJLILLLLZI;
                        if (c31597Caf5 != null) {
                            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(army.avatarThumb);
                            LJIIIZ.LJIIIIZZ = R.drawable.cuk;
                            int width = c31597Caf5.getWidth();
                            int height = c31597Caf5.getHeight();
                            LJIIIZ.LJ = width;
                            LJIIIZ.LJFF = height;
                            LJIIIZ.LJIIL = Boolean.TRUE;
                            LJIIIZ.LJIIJJI(c31597Caf5);
                        }
                        C31597Caf c31597Caf6 = u1y.LJLILLLLZI;
                        if (c31597Caf6 != null) {
                            c31597Caf6.post(new ARunnableS17S0101000_13(i, u1y, 8));
                        }
                    }
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static final AnimatorSet LIZJ(float f, float f2, U1Y u1y, U1Y u1y2, float f3, float f4) {
        u1y2.setPivotX(f);
        u1y2.setPivotY(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1y, (Property<U1Y, Float>) View.SCALE_X, f3, f4);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u1y, (Property<U1Y, Float>) View.SCALE_Y, f3, f4);
        ofFloat.setDuration(500L);
        ofFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }
}

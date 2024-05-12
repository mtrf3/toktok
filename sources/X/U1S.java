package X;

import Y.ACListenerS33S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1S extends FrameLayout {
    public static final BattleUserArmy LJLLLL = new BattleUserArmy();
    public final float LJLIL;
    public final float LJLILLLLZI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJI;
    public final ArrayList<Integer> LJLJJI;
    public Boolean LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public AnimatorSet LJLJLJ;
    public U1T LJLJLLL;
    public final List<U1T> LJLL;
    public final List<U1T> LJLLI;
    public final BattleUserArmy[] LJLLILLLL;
    public final BattleUserArmy[] LJLLJ;
    public final java.util.Map<Integer, View> LJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
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

    public final C47061t0 getMMvpImageView() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mMvpImageView>(...)");
        return (C47061t0) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C75622Tm6.LJIJ(EnumC76429Tz7.CONTRIBUTE_ENTRANCE);
    }

    public final void setClickCallback(InterfaceC88472Yns<? super Boolean, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJI = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = C15380j0.LIZ(6.0f) * (-1.0f);
        this.LJLILLLLZI = C15380j0.LIZ(6.0f) * 1.0f;
        this.LJLJJI = C47261Igj.LJII(Integer.valueOf(R.drawable.d9l), Integer.valueOf(R.drawable.d9m), Integer.valueOf(R.drawable.d9n));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 288));
        this.LJLL = new ArrayList();
        this.LJLLI = new ArrayList();
        BattleUserArmy battleUserArmy = LJLLLL;
        this.LJLLILLLL = new BattleUserArmy[]{BattleUserArmy.LJLIL, battleUserArmy, battleUserArmy};
        this.LJLLJ = new BattleUserArmy[]{BattleUserArmy.LJLILLLLZI, battleUserArmy, battleUserArmy};
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dc4, this, true);
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.df9);
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.fj6), new ACListenerS33S0100000_13(this, 109));
        C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.fl6), new ACListenerS33S0100000_13(this, 110));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void LIZLLL(List list, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        int i3;
        List<U1T> list2;
        boolean z2;
        boolean z3;
        List<String> list3;
        BattleUserArmy battleUserArmy;
        Object obj;
        if (z) {
            objArr = this.LJLLILLLL;
        } else {
            objArr = this.LJLLJ;
        }
        ?? r9 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        int i4 = 3;
        if (i > 3) {
            i2 = 3;
        } else {
            i2 = i;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (list == null || (obj = ListProtector.get(list, i5)) == null) {
                obj = LJLLLL;
            }
            objArr[i5] = obj;
        }
        if (i < 3) {
            if (z) {
                battleUserArmy = BattleUserArmy.LJLIL;
            } else {
                battleUserArmy = BattleUserArmy.LJLILLLLZI;
            }
            objArr[i] = battleUserArmy;
            for (int i6 = i + 1; i6 < 3; i6++) {
                objArr[i6] = LJLLLL;
            }
        }
        ?? r12 = 1;
        int i7 = i + 1;
        if (i7 <= 3) {
            i4 = i7;
        }
        if (z) {
            i3 = R.id.fj6;
        } else {
            i3 = R.id.fl6;
        }
        ViewGroup viewGroup = (ViewGroup) LIZ(i3);
        if (z) {
            list2 = this.LJLL;
        } else {
            list2 = this.LJLLI;
        }
        int length = objArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            BattleUserArmy army = objArr[i8];
            int i10 = i9 + 1;
            U1T u1t = (U1T) ORZ.LJLLLLLL(i9, list2);
            if (u1t == null) {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dc5, viewGroup, r9);
                o.LJIIIIZZ(LLLLIILL, "from(context).inflate(\n …p_unit, container, false)");
                u1t = new U1T(LLLLIILL);
                list2.add(u1t);
                viewGroup.addView(LLLLIILL, (int) r9);
            }
            if (z) {
                u1t.LIZ.setTranslationX(this.LJLIL * ((i4 - i9) - r12));
            } else {
                u1t.LIZ.setTranslationX(this.LJLILLLLZI * ((i4 - i9) - r12));
            }
            if (o.LJ(this.LJLJJL, Boolean.valueOf(z)) && i9 == 0 && this.LJLJJLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj2 = ListProtector.get(this.LJLJJI, i9);
            o.LJIIIIZZ(obj2, "viewUserStrokeResIds[index]");
            int intValue = ((Number) obj2).intValue();
            o.LJIIIZ(army, "army");
            View view = u1t.LIZ;
            BattleUserArmy battleUserArmy2 = LJLLLL;
            int i11 = r9;
            if (army == battleUserArmy2) {
                i11 = 8;
            }
            view.setVisibility(i11);
            if (o.LJ(army, BattleUserArmy.LJLIL)) {
                u1t.LIZIZ = r12;
                C15650jR.LIZ().LJFF(R.drawable.d9j).LJIIJJI(u1t.LIZJ);
            } else if (o.LJ(army, BattleUserArmy.LJLILLLLZI)) {
                u1t.LIZIZ = r12;
                C15650jR.LIZ().LJFF(R.drawable.d9k).LJIIJJI(u1t.LIZJ);
            } else if (o.LJ(army, battleUserArmy2)) {
                u1t.LIZIZ = r12;
            } else {
                z3 = false;
                u1t.LIZIZ = false;
                if (!RankOptimizeSetting.INSTANCE.getValue() || u1t.LJFF != army.userId) {
                    BQO LIZ = C15650jR.LIZ();
                    ImageModel imageModel = army.avatarThumb;
                    if (imageModel != null) {
                        list3 = imageModel.getUrls();
                    } else {
                        list3 = null;
                    }
                    C78720Uuy LIZ2 = LIZ.LIZ(list3);
                    LIZ2.LJIIIIZZ = R.drawable.cuk;
                    LIZ2.LJIIL = Boolean.TRUE;
                    LIZ2.LJIIJJI(u1t.LIZJ);
                }
                u1t.LJFF = army.userId;
                if (RankOptimizeSetting.INSTANCE.getValue() || u1t.LJI != intValue) {
                    u1t.LIZLLL.setImageResource(intValue);
                }
                u1t.LJI = intValue;
                u1t.LIZ(z2);
                i8++;
                i9 = i10;
                r12 = 1;
                r9 = z3;
            }
            z3 = false;
            if (RankOptimizeSetting.INSTANCE.getValue()) {
            }
            u1t.LIZLLL.setImageResource(intValue);
            u1t.LJI = intValue;
            u1t.LIZ(z2);
            i8++;
            i9 = i10;
            r12 = 1;
            r9 = z3;
        }
    }

    public static final AnimatorSet LIZIZ(U1S u1s, float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(u1s.getMMvpImageView(), (Property<C47061t0, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(u1s.getMMvpImageView(), (Property<C47061t0, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public static final AnimatorSet LIZJ(U1S u1s, float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(u1s.getMMvpImageView(), (Property<C47061t0, Float>) View.TRANSLATION_X, 0.0f, f), ObjectAnimator.ofFloat(u1s.getMMvpImageView(), (Property<C47061t0, Float>) View.TRANSLATION_Y, 0.0f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }
}

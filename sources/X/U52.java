package X;

import Y.IDAListenerS43S0200000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U52 extends LinearLayout {
    public BattleComboInfo LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;

    private final void setCountTv(BattleComboInfo battleComboInfo) {
        long j = battleComboInfo.comboCount;
        if (j > 99) {
            this.LJLILLLLZI.setText("99+");
        } else {
            this.LJLILLLLZI.setText(String.valueOf(j));
        }
    }

    public final void LIZJ(BattleComboInfo battleComboInfo) {
        boolean z;
        C0NB.LIZIZ("MatchWinningStreaksIcon", "update count");
        BattleComboInfo battleComboInfo2 = this.LJLIL;
        if (battleComboInfo2 != null) {
            long j = battleComboInfo2.comboCount;
            if (j <= 99) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI.setText(String.valueOf(j));
            LIZ(battleComboInfo2, battleComboInfo);
        } else {
            z = false;
        }
        this.LJLIL = battleComboInfo;
        setCountTv(battleComboInfo);
        if (!z) {
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJI.setVisibility(8);
            return;
        }
        if (battleComboInfo.comboStatus == 1) {
            TextView countTvTemp = this.LJLJI;
            o.LJIIIIZZ(countTvTemp, "countTvTemp");
            TextView countTV = this.LJLILLLLZI;
            o.LJIIIIZZ(countTV, "countTV");
            U59.LIZIZ(countTvTemp, countTV, U54.LJLIL);
            return;
        }
        TextView countTvTemp2 = this.LJLJI;
        o.LJIIIIZZ(countTvTemp2, "countTvTemp");
        TextView countTV2 = this.LJLILLLLZI;
        o.LJIIIIZZ(countTV2, "countTV");
        U59.LIZ(countTvTemp2, countTV2, U55.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U52(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.deb, C16880lQ.LLZIL(context), this);
        this.LJLILLLLZI = (TextView) findViewById(R.id.nj9);
        this.LJLJI = (TextView) findViewById(R.id.njc);
        this.LJLJJI = (TextView) findViewById(R.id.nja);
        setOrientation(0);
        setGravity(17);
    }

    public final void LIZ(BattleComboInfo battleComboInfo, BattleComboInfo battleComboInfo2) {
        String str;
        long j = battleComboInfo.comboCount;
        long j2 = battleComboInfo2.comboCount;
        if (j <= j2) {
            j = j2;
        }
        TextView textView = this.LJLJJI;
        if (j > 99) {
            str = "99+";
        } else if (j > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    public final void LIZIZ(BattleComboInfo battleComboInfo, BattleComboInfo battleComboInfo2) {
        if (battleComboInfo != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set data ");
            LIZ.append(battleComboInfo.comboStatus);
            C0NB.LIZIZ("MatchWinningStreaksIcon", X1D.LIZIZ(LIZ));
            if (battleComboInfo2.comboStatus == 0) {
                setVisibility(8);
                return;
            }
            setAlpha(1.0f);
            this.LJLIL = battleComboInfo;
            setCountTv(battleComboInfo);
            LIZ(battleComboInfo, new BattleComboInfo(0L, 0L, 0L, null, 0, null, 63, null));
            long j = battleComboInfo2.comboStatus;
            if (j == 1) {
                setBackgroundResource(R.drawable.dcu);
            } else if (j == 2) {
                setBackgroundResource(R.drawable.dct);
            }
            AqS102S0300000_13 aqS102S0300000_13 = new AqS102S0300000_13(battleComboInfo, battleComboInfo2, this, 2);
            U56 u56 = U56.LJLIL;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new IDAListenerS80S0100000_13(this, 14));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<U52, Float>) View.SCALE_X, 0.0f, 1.2f, 1.0f);
            ofFloat.setDuration(480L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<U52, Float>) View.SCALE_Y, 0.0f, 1.2f, 1.0f);
            ofFloat2.setDuration(480L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 100.0f);
            ofFloat3.setDuration(2920L);
            ofFloat3.addListener(new IDAListenerS43S0200000_13(aqS102S0300000_13, u56, 6));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<U52, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat4.setDuration(400L);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.play(ofFloat).before(ofFloat3);
            animatorSet.play(ofFloat3).before(ofFloat4);
            animatorSet.start();
            return;
        }
        setVisibility(8);
    }
}

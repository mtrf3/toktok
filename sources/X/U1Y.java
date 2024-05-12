package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* loaded from: classes14.dex */
public final class U1Y extends FrameLayout {
    public boolean LJLIL;
    public final C31597Caf LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final TBF LJLJJI;
    public boolean LJLJJL;
    public BattleUserArmy LJLJJLL;
    public final C47061t0 LJLJL;

    public final void getRingColor() {
        if (this.LJLJJL) {
            TBF tbf = this.LJLJJI;
            if (tbf != null) {
                tbf.setGradientColors(new int[]{C15380j0.LIZIZ(R.color.a6_), C15380j0.LIZIZ(R.color.a69)});
                return;
            }
            return;
        }
        C0NB.LJIIIZ("redesign", "setblue");
        TBF tbf2 = this.LJLJJI;
        if (tbf2 == null) {
            return;
        }
        tbf2.setGradientColors(new int[]{C15380j0.LIZIZ(R.color.a_r), C15380j0.LIZIZ(R.color.a_q)});
    }

    public final BattleUserArmy getUserInfo() {
        return this.LJLJJLL;
    }

    public final void setDefaultSeat(boolean z) {
        int i;
        this.LJLIL = true;
        this.LJLJJL = z;
        C31597Caf c31597Caf = this.LJLILLLLZI;
        if (c31597Caf != null) {
            if (z) {
                i = R.drawable.da_;
            } else {
                i = R.drawable.da9;
            }
            c31597Caf.setImageResource(i);
        }
        C31597Caf c31597Caf2 = this.LJLILLLLZI;
        if (c31597Caf2 != null) {
            c31597Caf2.setVisibility(0);
        }
        C47061t0 c47061t0 = this.LJLJI;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
        }
        TBF tbf = this.LJLJJI;
        if (tbf != null) {
            tbf.setVisibility(8);
        }
        C47061t0 c47061t02 = this.LJLJL;
        if (c47061t02 != null) {
            c47061t02.setVisibility(0);
        }
        C47061t0 c47061t03 = this.LJLJL;
        if (c47061t03 != null) {
            c47061t03.setAlpha(0.0f);
        }
        this.LJLJJLL = null;
    }

    public final void setEmpty(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZJ(R.layout.de9, this, true);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.de9, this, true);
        }
        this.LJLILLLLZI = (C31597Caf) findViewById(R.id.gvc);
        this.LJLJI = (C47061t0) findViewById(R.id.gvb);
        this.LJLJJI = (TBF) findViewById(R.id.n0v);
        this.LJLJL = (C47061t0) findViewById(R.id.gv8);
    }
}

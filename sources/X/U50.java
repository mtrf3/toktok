package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U50 extends LinearLayout {
    public InterfaceC88472Yns<? super String, C76800UCe> LJLIL;
    public BattleComboInfo LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final View LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;

    public final BattleComboInfo getInfo() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnClicked() {
        return this.LJLIL;
    }

    private final void setCountTv(BattleComboInfo battleComboInfo) {
        long j = battleComboInfo.comboCount;
        if (j > 99) {
            this.LJLJJL.setText("99+");
        } else {
            this.LJLJJL.setText(String.valueOf(j));
        }
    }

    public final boolean LIZ(BattleComboInfo battleComboInfo) {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        if (battleComboInfo != null) {
            C0NB.LIZIZ("MatchWinningStreaksIconNew", "setComboInfoOnly");
            this.LJLILLLLZI = battleComboInfo;
            if (battleComboInfo.comboType == U53.ACTIVITY.getType()) {
                this.LJLJI.setVisibility(0);
                C15640jQ.LJI(this.LJLJI, battleComboInfo.comboIconUrl);
                this.LJLJJI.setVisibility(8);
            } else {
                this.LJLJI.setVisibility(8);
                this.LJLJJI.setVisibility(0);
            }
            setCountTv(battleComboInfo);
            LIZIZ(battleComboInfo, new BattleComboInfo(0L, 0L, 0L, null, 0, null, 63, null));
            setVisibility(8);
            return true;
        }
        return false;
    }

    public final void LIZJ(BattleComboInfo battleComboInfo) {
        BattleComboInfo battleComboInfo2;
        boolean z;
        Long l;
        C0NB.LIZIZ("MatchWinningStreaksIconNew", "update count");
        if (battleComboInfo == null || (battleComboInfo2 = this.LJLILLLLZI) == null) {
            C0NB.LIZIZ("MatchWinningStreaksIconNew", "info is empty");
            return;
        }
        if (battleComboInfo.comboCount == battleComboInfo2.comboCount) {
            C0NB.LIZIZ("MatchWinningStreaksIconNew", "same count info");
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        o.LJI(battleComboInfo2);
        if (battleComboInfo2.comboCount <= 99) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = this.LJLJJLL;
        BattleComboInfo battleComboInfo3 = this.LJLILLLLZI;
        if (battleComboInfo3 != null) {
            l = Long.valueOf(battleComboInfo3.comboCount);
        } else {
            l = null;
        }
        textView.setText(String.valueOf(l));
        BattleComboInfo battleComboInfo4 = this.LJLILLLLZI;
        o.LJI(battleComboInfo4);
        LIZIZ(battleComboInfo, battleComboInfo4);
        this.LJLILLLLZI = battleComboInfo;
        setCountTv(battleComboInfo);
        if (!z) {
            this.LJLJJL.setVisibility(0);
            this.LJLJJLL.setVisibility(8);
            return;
        }
        TextView countTvTemp = this.LJLJJLL;
        o.LJIIIIZZ(countTvTemp, "countTvTemp");
        TextView countTV = this.LJLJJL;
        o.LJIIIIZZ(countTV, "countTV");
        U59.LIZIZ(countTvTemp, countTV, new AqS163S0100000_13(this, 286));
    }

    public final void setOnClicked(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LJLILLLLZI == null) {
            return;
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U50(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.de_, C16880lQ.LLZIL(context), this);
        this.LJLJI = (C47061t0) findViewById(R.id.nje);
        this.LJLJJI = findViewById(R.id.naj);
        this.LJLJJL = (TextView) findViewById(R.id.nj_);
        this.LJLJJLL = (TextView) findViewById(R.id.njd);
        this.LJLJL = (TextView) findViewById(R.id.njb);
        setOrientation(0);
        setBackgroundResource(R.drawable.d8d);
    }

    public final void LIZIZ(BattleComboInfo battleComboInfo, BattleComboInfo battleComboInfo2) {
        String str;
        long j = battleComboInfo.comboCount;
        long j2 = battleComboInfo2.comboCount;
        if (j <= j2) {
            j = j2;
        }
        TextView textView = this.LJLJL;
        if (j > 99) {
            str = "99+";
        } else if (j > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }
}

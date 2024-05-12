package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.Vih, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80507Vih implements InterfaceC74061T4v, InterfaceC80524Viy, InterfaceC80527Vj1, InterfaceC80525Viz, InterfaceC80523Vix {
    public static final String[] LJLJJLL = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] LJLJL = {"00", "2", "4", "6", "8", "10", "12", "14", "16", LowAgeAnchorLimitSetting.DEFAULT, "20", "22"};
    public static final String[] LJLJLJ = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final C80509Vij LJLIL;
    public final TimeModel LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;

    public final int LIZIZ() {
        if (this.LJLILLLLZI.LJLIL == 1) {
            return 15;
        }
        return 30;
    }

    public final void LIZLLL() {
        int i;
        C80509Vij c80509Vij = this.LJLIL;
        TimeModel timeModel = this.LJLILLLLZI;
        int i2 = timeModel.LJLJJL;
        int LIZIZ = timeModel.LIZIZ();
        int i3 = this.LJLILLLLZI.LJLJI;
        c80509Vij.getClass();
        if (i2 == 1) {
            i = R.id.gfv;
        } else {
            i = R.id.gfu;
        }
        c80509Vij.LJLJJL.LIZIZ(i);
        Locale locale = c80509Vij.getResources().getConfiguration().locale;
        String LLLZI = C16880lQ.LLLZI(locale, "%02d", new Object[]{Integer.valueOf(i3)});
        String LLLZI2 = C16880lQ.LLLZI(locale, "%02d", new Object[]{Integer.valueOf(LIZIZ)});
        c80509Vij.LJLIL.setText(LLLZI);
        c80509Vij.LJLILLLLZI.setText(LLLZI2);
    }

    @Override // X.InterfaceC80523Vix
    public final void hide() {
        this.LJLIL.setVisibility(8);
    }

    @Override // X.InterfaceC80523Vix
    public final void invalidate() {
        this.LJLJJI = LIZIZ() * this.LJLILLLLZI.LIZIZ();
        TimeModel timeModel = this.LJLILLLLZI;
        this.LJLJI = timeModel.LJLJI * 6;
        LIZJ(timeModel.LJLJJI, false);
        LIZLLL();
    }

    @Override // X.InterfaceC80523Vix
    public final void show() {
        this.LJLIL.setVisibility(0);
    }

    @Override // X.InterfaceC80524Viy
    public final void LIZ(int i) {
        LIZJ(i, true);
    }

    public C80507Vih(C80509Vij c80509Vij, TimeModel timeModel) {
        this.LJLIL = c80509Vij;
        this.LJLILLLLZI = timeModel;
        if (timeModel.LJLIL == 0) {
            c80509Vij.LJLJJL.setVisibility(0);
        }
        ((ArrayList) c80509Vij.LJLJI.LJLJL).add(this);
        c80509Vij.setOnSelectionChangeListener(this);
        c80509Vij.setOnPeriodChangeListener(this);
        c80509Vij.setOnActionUpListener(this);
        LJ("%d", LJLJJLL);
        LJ("%d", LJLJL);
        LJ("%02d", LJLJLJ);
        invalidate();
    }

    public final void LIZJ(int i, boolean z) {
        boolean z2;
        String[] strArr;
        int i2;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLIL.setAnimateOnTouchUp(z2);
        TimeModel timeModel = this.LJLILLLLZI;
        timeModel.LJLJJI = i;
        C80509Vij c80509Vij = this.LJLIL;
        if (z2) {
            strArr = LJLJLJ;
            i2 = R.string.i0e;
        } else {
            if (timeModel.LJLIL == 1) {
                strArr = LJLJL;
            } else {
                strArr = LJLJJLL;
            }
            i2 = R.string.i0c;
        }
        c80509Vij.LJLJJI.LJJZ(i2, strArr);
        C80509Vij c80509Vij2 = this.LJLIL;
        if (z2) {
            f = this.LJLJI;
        } else {
            f = this.LJLJJI;
        }
        c80509Vij2.LJLJI.LIZIZ(f, z);
        this.LJLIL.setActiveSelection(i);
        this.LJLIL.setMinuteHourDelegate(new A9S(this.LJLIL.getContext(), R.string.i0b));
        this.LJLIL.setHourClickDelegate(new A9S(this.LJLIL.getContext(), R.string.i0d));
    }

    public final void LJ(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.LIZ(this.LJLIL.getResources(), strArr[i], str);
        }
    }

    @Override // X.InterfaceC74061T4v
    public final void LJJIJIIJIL(float f, boolean z) {
        if (this.LJLJJL) {
            return;
        }
        TimeModel timeModel = this.LJLILLLLZI;
        int i = timeModel.LJLILLLLZI;
        int i2 = timeModel.LJLJI;
        int round = Math.round(f);
        TimeModel timeModel2 = this.LJLILLLLZI;
        if (timeModel2.LJLJJI == 12) {
            timeModel2.LJLJI = ((round + 3) / 6) % 60;
            this.LJLJI = (float) Math.floor(r0 * 6);
        } else {
            this.LJLILLLLZI.LIZLLL((round + (LIZIZ() / 2)) / LIZIZ());
            this.LJLJJI = LIZIZ() * this.LJLILLLLZI.LIZIZ();
        }
        if (!z) {
            LIZLLL();
            TimeModel timeModel3 = this.LJLILLLLZI;
            if (timeModel3.LJLJI != i2 || timeModel3.LJLILLLLZI != i) {
                this.LJLIL.performHapticFeedback(4);
            }
        }
    }
}

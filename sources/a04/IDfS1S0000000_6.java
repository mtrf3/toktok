package a04;

import X.QXX;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public class IDfS1S0000000_6 extends QXX {
    public final int $t;

    public static final void LJZ$0(IDfS1S0000000_6 iDfS1S0000000_6, String str) {
    }

    public static final int LLJ$0(IDfS1S0000000_6 iDfS1S0000000_6, int i) {
        return i == 4 ? R.drawable.c6o : R.drawable.c6m;
    }

    public static final void LLJJJIL$0(IDfS1S0000000_6 iDfS1S0000000_6, String str) {
    }

    public static final void LLLLLZ$0(IDfS1S0000000_6 iDfS1S0000000_6, String str) {
    }

    @Override // X.QXX
    public final void LJZ(String str) {
        switch (this.$t) {
            case 0:
                LJZ$0(this, str);
                return;
            default:
                super.LJZ(str);
                return;
        }
    }

    @Override // X.QXX
    public final void LJZL(String str) {
        switch (this.$t) {
            case 0:
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("[BDASplash]", str);
                return;
            default:
                super.LJZL(str);
                return;
        }
    }

    @Override // X.QXX
    public final int LLJ(int i) {
        switch (this.$t) {
            case 1:
                return LLJ$0(this, i);
            default:
                return super.LLJ(i);
        }
    }

    @Override // X.QXX
    public final void LLJJJIL(String str) {
        switch (this.$t) {
            case 0:
                LLJJJIL$0(this, str);
                return;
            default:
                super.LLJJJIL(str);
                return;
        }
    }

    @Override // X.QXX
    public final void LLLLLZ(String str) {
        switch (this.$t) {
            case 0:
                LLLLLZ$0(this, str);
                return;
            default:
                super.LLLLLZ(str);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDfS1S0000000_6(int i) {
        super((Object) null);
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                return;
            default:
                return;
        }
    }
}

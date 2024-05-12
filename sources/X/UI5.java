package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public enum UI5 {
    NORMAL_UNSUBMIT_MUST(R.string.nuz, R.string.m4_, R.string.m5p),
    NORMAL_RESUBMIT_MUST(R.string.nuz, R.string.m4_, R.string.m57),
    NORMAL_REVIEWING(R.string.m5g, R.string.kqv, R.string.lsn),
    NORMAL_REJECT(R.string.m4f, R.string.kqv, R.string.lsn),
    WHITELIST_UNSUBMIT_NOTICE(R.string.m5q, R.string.m4w, R.string.m5p),
    WHITELIST_RESUBMIT_NOTICE(R.string.m5a, R.string.m4w, R.string.m57),
    WHITELIST_UNSUBMIT_MUST(R.string.m5q, R.string.m4_, R.string.m5p),
    WHITELIST_RESUBMIT_MUST(R.string.m5a, R.string.m4_, R.string.m57),
    WHITELIST_REVIEWING(R.string.m5g, R.string.kqv, R.string.lsn),
    WHITELIST_REJECT(R.string.m4f, R.string.kqv, R.string.lsn);

    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public static UI5 valueOf(String str) {
        return (UI5) V0N.LJJJ(UI5.class, str);
    }

    public final int getNegativeResId() {
        return this.LJLILLLLZI;
    }

    public final int getPositiveResId() {
        return this.LJLJI;
    }

    public final int getTitleResId() {
        return this.LJLIL;
    }

    UI5(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}

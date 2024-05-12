package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public enum ILF {
    PLAY_IN_ORDER(R.string.buz, R.raw.icon_list_arrow_down, ILC.PLAY_IN_ORDER),
    REPEAT(R.string.bv0, R.raw.icon_repeat_1, ILC.REPEAT);

    public final int LJLIL;
    public final int LJLILLLLZI;
    public final ILC LJLJI;

    public static ILF valueOf(String str) {
        return (ILF) V0N.LJJJ(ILF.class, str);
    }

    public final int getIcon() {
        return this.LJLILLLLZI;
    }

    public final ILC getPlayOrder() {
        return this.LJLJI;
    }

    public final int getTitle() {
        return this.LJLIL;
    }

    ILF(int i, int i2, ILC ilc) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = ilc;
    }
}

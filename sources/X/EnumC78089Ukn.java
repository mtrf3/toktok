package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ukn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC78089Ukn {
    ONE_HOST_MEDIUM_V3(R.layout.dkb, R.dimen.ai3, 8),
    MULTI_HOST_MEDIUM(R.layout.d66, R.dimen.ai0, 4),
    MULTI_HOST_SMALL(R.layout.d67, R.dimen.ai1, 4),
    EXTENDED(R.layout.d39, R.dimen.ahz, 16);

    public static final C78105Ul3 Companion = new C78105Ul3();
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public static EnumC78089Ukn valueOf(String str) {
        return (EnumC78089Ukn) V0N.LJJJ(EnumC78089Ukn.class, str);
    }

    public final int getDefaultHeightDimen() {
        return this.LJLILLLLZI;
    }

    public final int getGapDp() {
        return this.LJLJI;
    }

    public final int getLayoutId() {
        return this.LJLIL;
    }

    EnumC78089Ukn(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}

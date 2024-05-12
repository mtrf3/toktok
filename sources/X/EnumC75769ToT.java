package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.ToT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75769ToT {
    INVITE_APPLY("switch_invite_to_apply", R.string.kkq, R.string.kkp, R.string.kkn),
    INVITE_PAIR("switch_invite_to_random", R.string.kkm, R.string.kkl, R.string.kkk),
    APPLY_INVITE("switch_apply_to_invite", R.string.kkb, R.string.kka, R.string.kk_),
    APPLY_PAIR("switch_apply_to_random", R.string.kke, R.string.kkd, R.string.kkc),
    INVITE_TOPIC_PAIR("switch_invite_to_topic", R.string.onq, R.string.onp, R.string.ono);

    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    public static EnumC75769ToT valueOf(String str) {
        return (EnumC75769ToT) V0N.LJJJ(EnumC75769ToT.class, str);
    }

    public final int getButtonResId() {
        return this.LJLJJI;
    }

    public final int getContentResId() {
        return this.LJLJI;
    }

    public final String getLabel() {
        return this.LJLIL;
    }

    public final int getTitleResId() {
        return this.LJLILLLLZI;
    }

    EnumC75769ToT(String str, int i, int i2, int i3) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
    }
}

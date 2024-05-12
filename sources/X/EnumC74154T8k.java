package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.T8k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC74154T8k {
    UNKNOWN_REMIND_TYPE(-1),
    REMIND_SELF_SEE(R.string.f0e),
    REMIND_FRIEND_SEE(R.string.f0d),
    REMIND_ANYONE_SEE(R.string.f0c),
    REMIND_DUET_NOT_ALLOWED(R.string.f0q),
    REMIND_SOUND_NOT_READY(R.string.cgp);

    public static final C74153T8j Companion = new C74153T8j();
    public final int LJLIL;

    public static EnumC74154T8k valueOf(String str) {
        return (EnumC74154T8k) V0N.LJJJ(EnumC74154T8k.class, str);
    }

    public final int getTextId() {
        return this.LJLIL;
    }

    EnumC74154T8k(int i) {
        this.LJLIL = i;
    }
}

package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.T9d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC74173T9d {
    TIMEOUT(R.string.bte),
    NOT_AVAILABLE(R.string.btd),
    FAKE(R.string.bte),
    AIRPLANE_MODE(R.string.btf);

    public final int LJLIL;

    public static EnumC74173T9d valueOf(String str) {
        return (EnumC74173T9d) V0N.LJJJ(EnumC74173T9d.class, str);
    }

    public final int getErrMsgId() {
        return this.LJLIL;
    }

    EnumC74173T9d(int i) {
        this.LJLIL = i;
    }
}

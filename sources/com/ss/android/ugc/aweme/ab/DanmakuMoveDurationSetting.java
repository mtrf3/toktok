package com.ss.android.ugc.aweme.ab;

import X.C216538ef;
import X.C221108m2;
import X.C5H3;

/* loaded from: classes4.dex */
public final class DanmakuMoveDurationSetting {
    public static final DanmakuMoveDurationSetting INSTANCE = new DanmakuMoveDurationSetting();
    public static final long DEFAULT = 6000;
    public static final C5H3 duration$delegate = C221108m2.LIZIZ(C216538ef.LJLIL);

    public final long getDuration() {
        return ((Number) duration$delegate.getValue()).longValue();
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}

package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C221108m2;
import X.C58522Mxy;
import X.C5H3;
import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("lazy_load_block_list")
/* loaded from: classes11.dex */
public final class LazyLoadBlockList {
    public static final LazyLoadBlockList INSTANCE = new LazyLoadBlockList();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C58522Mxy.LJLIL);

    private final String[] getCurrentValue() {
        return (String[]) currentValue$delegate.getValue();
    }

    public final boolean enable(String str) {
        String[] currentValue = getCurrentValue();
        if (currentValue != null && currentValue.length != 0 && ORY.LJJIJIIJIL(str, getCurrentValue())) {
            return false;
        }
        return true;
    }
}

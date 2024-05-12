package com.bytedance.android.live_settings;

import X.AbstractC65781Prl;
import X.C47261Igj;
import X.InterfaceC65784Pro;
import java.util.List;

/* loaded from: classes6.dex */
public final class SettingsManager$mCacheValueTypes$2 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final SettingsManager$mCacheValueTypes$2 INSTANCE = new SettingsManager$mCacheValueTypes$2();

    public SettingsManager$mCacheValueTypes$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        return C47261Igj.LJJIJIIJI("int", "long", "boolean", "double", "float", "java.lang.String");
    }
}

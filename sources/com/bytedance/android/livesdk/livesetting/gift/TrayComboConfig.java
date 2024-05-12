package com.bytedance.android.livesdk.livesetting.gift;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class TrayComboConfig {
    public static final transient TrayComboConfig LIZ = new TrayComboConfig();

    @InterfaceC65349Pkn("animation_duration")
    public List<Integer> _animationDuration;

    @InterfaceC65349Pkn("combo_type")
    public String _comboType;

    @InterfaceC65349Pkn("dynamic_jump_interval")
    public List<Integer> _jumpInterval;

    public TrayComboConfig() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this._animationDuration = c61878OQg;
        this._comboType = "";
        this._jumpInterval = c61878OQg;
    }
}

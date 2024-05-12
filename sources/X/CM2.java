package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes6.dex */
public interface CM2 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "effect_disabled_toast_text", required = false)
    String getEffectDisabledToastText();

    @ED6(option = {0, 1, 2, 3})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "live_goal_background_position", required = true)
    Number getLiveGoalBackgroundPosition();

    @InterfaceC36563EWp(isGetter = true, keyPath = "is_effect_disabled", required = true)
    Boolean isEffectDisabled();

    @InterfaceC36563EWp(isGetter = false, keyPath = "is_effect_disabled", required = true)
    void setEffectDisabled(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "effect_disabled_toast_text", required = false)
    void setEffectDisabledToastText(String str);

    @ED6(option = {0, 1, 2, 3})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "live_goal_background_position", required = true)
    void setLiveGoalBackgroundPosition(Number number);
}

package X;

import android.os.Bundle;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.0LK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LK {
    public static LiveSmallItemBeautyFragment LIZ(String panelName, String panelKey, InterfaceC31981Ni interfaceC31981Ni, String effectPanelNameEnum) {
        o.LJIIIZ(panelName, "panelName");
        o.LJIIIZ(panelKey, "panelKey");
        o.LJIIIZ(effectPanelNameEnum, "effectPanelNameEnum");
        LiveSmallItemBeautyFragment liveSmallItemBeautyFragment = new LiveSmallItemBeautyFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("live_effect_panel_name", panelName, "live_effect_panel_key", panelKey);
        LIZJ.putString("live_effect_panel_name_enum", effectPanelNameEnum);
        liveSmallItemBeautyFragment.setArguments(LIZJ);
        liveSmallItemBeautyFragment.LJLJJL = interfaceC31981Ni;
        return liveSmallItemBeautyFragment;
    }
}

package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final /* synthetic */ class CAD extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public CAD(Object obj) {
        super(1, obj, TopRightBannerWidget.class, "onMicRoomHostToChange", "onMicRoomHostToChange(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        TopRightBannerWidget topRightBannerWidget = (TopRightBannerWidget) this.receiver;
        if (booleanValue) {
            C30884CAe c30884CAe = topRightBannerWidget.LJLIL;
            if (c30884CAe != null) {
                c30884CAe.S2(new JSONObject(), "H5_micRoomStateChanged");
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = topRightBannerWidget.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "H5_micRoomStateChanged", new JSONObject());
            }
        } else {
            topRightBannerWidget.getClass();
        }
        return C76800UCe.LIZ;
    }
}

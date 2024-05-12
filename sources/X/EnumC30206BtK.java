package X;

import android.view.ViewGroup;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BtK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30206BtK {
    LEFT,
    RIGHT,
    POPUP,
    POPUP_BASIC,
    POPUP_SETTING;

    public static EnumC30206BtK valueOf(String str) {
        return (EnumC30206BtK) V0N.LJJJ(EnumC30206BtK.class, str);
    }

    public static InterfaceC30205BtJ LIZJ(DataChannel dataChannel) {
        return ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
    }

    public final C76800UCe release(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIIIZZ(this, dataChannel);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final void addButtonToConfigList(DataChannel dataChannel, EnumC30204BtI toolbarButton) {
        o.LJIIIZ(toolbarButton, "toolbarButton");
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LIZIZ(dataChannel, toolbarButton, this);
        }
    }

    public final void removeButtonFromConfigList(DataChannel dataChannel, EnumC30204BtI toolbarButton) {
        o.LJIIIZ(toolbarButton, "toolbarButton");
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIILIIL(dataChannel, toolbarButton, this);
        }
    }

    public final C76800UCe createHolder(DataChannel dataChannel, ViewGroup container, List<? extends EnumC30204BtI> toolbarList, EnumC30226Bte style) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(toolbarList, "toolbarList");
        o.LJIIIZ(style, "style");
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJI(dataChannel, container, toolbarList, style, this);
            return C76800UCe.LIZ;
        }
        return null;
    }
}

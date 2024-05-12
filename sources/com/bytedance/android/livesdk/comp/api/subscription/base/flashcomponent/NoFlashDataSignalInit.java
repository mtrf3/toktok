package com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent;

import X.C199097rd;
import X.C63016OoG;
import X.C72818Shy;
import X.InterfaceC78280Uns;
import X.ORZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NoFlashDataSignalInit extends FlashDataProvider {
    public static final /* synthetic */ int LJLJJL = 0;

    @Override // com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent.FlashDataProvider, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        NoFlashDataSignalInit noFlashDataSignalInit = new NoFlashDataSignalInit();
        FlashDataProvider.LJLJJI.add(noFlashDataSignalInit.LJLIL);
        C72818Shy.LIZLLL("fetch_flash_component_data", noFlashDataSignalInit);
    }

    public NoFlashDataSignalInit() {
        super(C63016OoG.LJLIL);
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent.FlashDataProvider, X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        if (o.LJ(c199097rd.LJLIL, "fetch_flash_component_data")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str2 = "";
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "flash_component_id", "");
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, FlashDataProvider.LJLJJI)) {
                if (str != null) {
                    str2 = str;
                }
                this.LJLIL = str2;
                LIZ("no_observer", 1, new JSONObject());
            }
        }
    }
}

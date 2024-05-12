package com.bytedance.android.live.broadcast.shortcutpanel;

import X.C76800UCe;
import X.EnumC06880Ou;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import Y.IDRunnableS85S0100000;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BaseSubShortCutPanelWidget extends LiveWidget {
    public final InterfaceC88472Yns<EnumC06880Ou, Boolean> LJLIL;
    public final InterfaceC88472Yns<EnumC06880Ou, Boolean> LJLILLLLZI;
    public String LJLJI;

    public abstract EnumC06880Ou LJLZ();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!isShowing() && this.LJLIL.invoke(LJLZ()).booleanValue()) {
            show();
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            View view = getView();
            if (view != null) {
                view.post(new IDRunnableS85S0100000(this, 57));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseSubShortCutPanelWidget(InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canShowMethod, InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canHideMethod) {
        o.LJIIIZ(canShowMethod, "canShowMethod");
        o.LJIIIZ(canHideMethod, "canHideMethod");
        this.LJLIL = canShowMethod;
        this.LJLILLLLZI = canHideMethod;
        this.LJLJI = "";
    }

    public final void LJZ(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (isShowing() && this.LJLILLLLZI.invoke(LJLZ()).booleanValue()) {
            this.LJLJI = str;
            hide();
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(ShortCutPanelShowChannel.class, 0);
            }
        }
    }
}

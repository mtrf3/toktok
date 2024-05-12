package com.bytedance.android.live.toolbar;

import X.C30242Btu;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import X.InterfaceC06390Mx;
import X.InterfaceC30205BtJ;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface IToolbarService extends InterfaceC06390Mx {
    void Cm(Context context);

    Class EA(EnumC30206BtK enumC30206BtK, DataChannel dataChannel);

    void Gv(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    void N0(DataChannel dataChannel);

    C30242Btu T00(DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> Uu0();

    void d9();

    void kb();

    InterfaceC30205BtJ pk(DataChannel dataChannel);

    void vh(Context context, int i, EnumC30226Bte enumC30226Bte);

    Class<? extends LiveRecyclableWidget> zN(boolean z);
}

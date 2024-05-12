package com.bytedance.android.livesdk.comp.api.debug;

import X.C31200CMi;
import X.C38113ExZ;
import X.C76800UCe;
import X.EnumC30213BtR;
import X.InterfaceC06390Mx;
import X.InterfaceC31194CMc;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pitaya.api.IPitayaCore;
import com.google.android.play.core.appupdate.h;
import debugtool.DebugToolsHelper;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public interface IDebugService extends InterfaceC06390Mx {
    Object D90(IPitayaCore iPitayaCore, Method method, Object[] objArr);

    void E3();

    DebugToolsHelper IC(Context context, DataChannel dataChannel, EnumC30213BtR enumC30213BtR);

    h ce0();

    void jg0(C38113ExZ c38113ExZ);

    void onDestroy();

    boolean tL();

    void tl(C31200CMi c31200CMi);

    void vl0(InterfaceC31194CMc interfaceC31194CMc, Context context, DataChannel dataChannel);

    InterfaceC65784Pro<C76800UCe> x3();

    void x50(DataChannel dataChannel);
}

package com.bytedance.android.live.shorttouch.service;

import X.AbstractC77108UOa;
import X.C31220CNc;
import X.InterfaceC06390Mx;
import X.InterfaceC30642C0w;
import X.UOS;
import X.UOT;
import X.UOY;
import Y.ACListenerS23S0100100_5;
import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface IShortTouchService extends InterfaceC06390Mx {
    void B10(InterfaceC30642C0w interfaceC30642C0w, UOY uoy);

    Animator Es0(View view);

    C31220CNc FX(Context context, Uri uri, String str, boolean z);

    String HK(Context context, Uri uri, String str, boolean z, Uri uri2, Boolean bool);

    String PE();

    Class<? extends LiveRecyclableWidget> Sm0();

    Class<? extends LiveRecyclableWidget> UA();

    void Ug0(DataChannel dataChannel);

    AbstractC77108UOa a40(Context context, long j, UOT uot, ACListenerS23S0100100_5 aCListenerS23S0100100_5);

    void mu0();

    void n50(UOS uos, String str, InterfaceC30642C0w interfaceC30642C0w, UOY uoy);

    void sX(UOS uos, String str);

    Class<? extends LiveRecyclableWidget> tB();

    void vn0(Context context, UOS uos, String str, Uri uri, String str2, boolean z, Uri uri2, Boolean bool);

    InterfaceC30642C0w vr(UOS uos, String str);

    Class<? extends LiveRecyclableWidget> yS();
}

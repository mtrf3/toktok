package com.bytedance.ies.sdk.widgets;

import X.InterfaceC30319Bv9;
import X.InterfaceC31787Cdj;

/* loaded from: classes6.dex */
public interface RecyclableWidgetEventListener extends InterfaceC31787Cdj {
    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPostCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    void onPostInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    void onPostLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    void onPostUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPreCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    void onPreInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    void onPreLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    void onPreUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onShow(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC31787Cdj
    /* bridge */ /* synthetic */ void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget, boolean z);
}

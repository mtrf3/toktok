package X;

import android.content.Context;

/* renamed from: X.Mgd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC57447Mgd {
    Context getCtx();

    InterfaceC88472Yns<EnumC57435MgR, C76800UCe> getDataChangeListener();

    InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> getFollowClickInterceptor();

    InterfaceC88471Ynr<EnumC57435MgR, EnumC57435MgR, C76800UCe> getFollowClickListener();

    InterfaceC88471Ynr<EnumC57435MgR, Boolean, C76800UCe> getRequestListener();

    InterfaceC65784Pro<C57430MgM> getTracker();

    void setDataChangeListener(InterfaceC88472Yns<? super EnumC57435MgR, C76800UCe> interfaceC88472Yns);

    void setFollowClickInterceptor(InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> interfaceC88472Yns);

    void setFollowClickListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super EnumC57435MgR, C76800UCe> interfaceC88471Ynr);

    void setRequestListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super Boolean, C76800UCe> interfaceC88471Ynr);

    void setTracker(InterfaceC65784Pro<C57430MgM> interfaceC65784Pro);
}

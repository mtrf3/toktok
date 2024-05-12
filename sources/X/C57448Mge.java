package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Mge, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57448Mge implements InterfaceC57447Mgd {
    public final Context LJLIL;
    public InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> LJLILLLLZI;
    public InterfaceC88471Ynr<? super EnumC57435MgR, ? super EnumC57435MgR, C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super EnumC57435MgR, C76800UCe> LJLJJI;
    public InterfaceC88471Ynr<? super EnumC57435MgR, ? super Boolean, C76800UCe> LJLJJL;
    public InterfaceC65784Pro<C57430MgM> LJLJJLL;

    @Override // X.InterfaceC57447Mgd
    public final Context getCtx() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57447Mgd
    public final InterfaceC88472Yns<EnumC57435MgR, C76800UCe> getDataChangeListener() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC57447Mgd
    public final InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> getFollowClickInterceptor() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC57447Mgd
    public final InterfaceC88471Ynr<EnumC57435MgR, EnumC57435MgR, C76800UCe> getFollowClickListener() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC57447Mgd
    public final InterfaceC88471Ynr<EnumC57435MgR, Boolean, C76800UCe> getRequestListener() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC57447Mgd
    public final InterfaceC65784Pro<C57430MgM> getTracker() {
        return this.LJLJJLL;
    }

    public C57448Mge(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        this.LJLIL = ctx;
    }

    @Override // X.InterfaceC57447Mgd
    public final void setDataChangeListener(InterfaceC88472Yns<? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    @Override // X.InterfaceC57447Mgd
    public final void setFollowClickInterceptor(InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLILLLLZI = interceptor;
    }

    @Override // X.InterfaceC57447Mgd
    public final void setFollowClickListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJI = listener;
    }

    @Override // X.InterfaceC57447Mgd
    public final void setRequestListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL = listener;
    }

    @Override // X.InterfaceC57447Mgd
    public final void setTracker(InterfaceC65784Pro<C57430MgM> tracker) {
        o.LJIIIZ(tracker, "tracker");
        this.LJLJJLL = tracker;
    }
}

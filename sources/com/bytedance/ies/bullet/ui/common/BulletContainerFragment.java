package com.bytedance.ies.bullet.ui.common;

import X.AbstractC59475NVv;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C39973FmT;
import X.C39976FmW;
import X.C60193Njp;
import X.C60213Nk9;
import X.C62822Ol8;
import X.EnumC39958FmE;
import X.F22;
import X.F26;
import X.F3T;
import X.InterfaceC39974FmU;
import X.InterfaceC40516FvE;
import X.InterfaceC59504NWy;
import X.InterfaceC60057Nhd;
import X.InterfaceC60172NjU;
import X.InterfaceC60179Njb;
import X.InterfaceC60187Njj;
import X.OHQ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.ui.common.view.AbsFragment;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BulletContainerFragment extends AbsFragment implements InterfaceC60057Nhd, InterfaceC60172NjU, InterfaceC39974FmU {
    public InterfaceC60187Njj LJLJI;
    public InterfaceC60179Njb LJLJJI;
    public InterfaceC59504NWy LJLJJL;
    public View LJLJJLL;
    public C60193Njp LJLJL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 38));

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // X.InterfaceC37788EsK
    public final void release() {
        C60193Njp c60193Njp = this.LJLJL;
        if (c60193Njp != null) {
            c60193Njp.release();
        }
    }

    public final InterfaceC60179Njb vl() {
        if (this.LJLJJI == null) {
            C39973FmT.LIZIZ(this, "fragment init rootContainer failed!!!", null, null, 6);
        }
        return this.LJLJJI;
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LIZJ(mo49getActivity);
        }
        release();
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onPause();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LIZIZ(mo49getActivity);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LIZLLL(mo49getActivity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onStart();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LJII(mo49getActivity);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onStop();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LJ(mo49getActivity);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(Uri uri) {
        o.LJIIJ(uri, "uri");
        C39973FmT.LIZIZ(this, "fragment onLoadStart", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLLLL(uri);
        }
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        C60193Njp c60193Njp = this.LJLJL;
        if (c60193Njp != null) {
            return c60193Njp.a0(sessionId);
        }
        o.LJIJI("bulletContainerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onActivityCreated(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LJFF(mo49getActivity, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        InterfaceC60187Njj interfaceC60187Njj;
        super.onConfigurationChanged(configuration);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.onConfigurationChanged(mo49getActivity, configuration);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC60057Nhd
    public void onEvent(F22 event) {
        o.LJIIJ(event, "event");
        C60193Njp c60193Njp = this.LJLJL;
        if (c60193Njp != null) {
            c60193Njp.onEvent(event);
        } else {
            o.LJIJI("bulletContainerView");
            throw null;
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(Uri uri, Throwable e) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(e, "e");
        C39973FmT.LIZIZ(this, "fragment onLoadFail", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLL(uri, e);
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, Uri uri, InterfaceC40516FvE instance) {
        o.LJIIJ(view, "view");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        C39973FmT.LIZIZ(this, "fragment onLoadUriSuccess", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLLII(view, uri, instance);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, Uri uri, AbstractC59475NVv param) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(param, "param");
        C39973FmT.LIZIZ(this, "fragment onLoadParamsSuccess", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.gk(instance, uri, param);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC60187Njj interfaceC60187Njj;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LJIIJ(mo49getActivity, i, i2, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.1qj r6 = r7.mo49getActivity()
            r4 = 0
            r3 = 0
            if (r6 == 0) goto L54
            X.Njj r0 = r7.LJLJI
            if (r0 != 0) goto L18
            com.bytedance.ies.bullet.ui.common.BulletActivityWrapper r0 = new com.bytedance.ies.bullet.ui.common.BulletActivityWrapper
            r0.<init>(r6)
            r7.LJLJI = r0
        L18:
            X.Njb r5 = r7.LJLJJI
            if (r5 == 0) goto L54
            android.view.ViewGroup r2 = r5.J0(r6)
            X.Njp r1 = new X.Njp
            r0 = 6
            r1.<init>(r6, r3, r0, r4)
            r7.LJLJL = r1
            android.view.ViewGroup r1 = r5.Ic()
            X.Njp r0 = r7.LJLJL
            java.lang.String r4 = "bulletContainerView"
            if (r0 == 0) goto La1
            r1.addView(r0)
            X.Njj r1 = r7.LJLJI
            if (r1 == 0) goto L40
            X.Njc r0 = r5.Ug()
            r1.LIZ(r0)
        L40:
            android.view.View r1 = r7.LJLJJLL
            if (r1 == 0) goto L4b
            X.Njp r0 = r7.LJLJL
            if (r0 == 0) goto L9d
            r0.setLoadingViewInternal$bullet_ui_common_release(r1)
        L4b:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L52
        L4f:
            if (r2 == 0) goto L8e
            goto L73
        L52:
            r2 = r3
            goto L4f
        L54:
            r0 = 2131559105(0x7f0d02c1, float:1.8743545E38)
            android.view.View r2 = X.C16880lQ.LLLLIILL(r8, r0, r9, r4)
            r0 = 2131363803(0x7f0a07db, float:1.8347425E38)
            android.view.View r1 = r2.findViewById(r0)
            X.Njp r1 = (X.C60193Njp) r1
            java.lang.String r0 = "bullet_container_view"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            r7.LJLJL = r1
            android.view.View r0 = r7.LJLJJLL
            if (r0 == 0) goto L4b
            r1.setLoadingViewInternal$bullet_ui_common_release(r0)
            goto L4b
        L73:
            androidx.lifecycle.LifecycleOwner r0 = r7.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L94
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> L94
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r7)     // Catch: java.lang.Throwable -> L94
            X.C10A.LIZIZ(r2, r7)     // Catch: java.lang.Throwable -> L94
            X.1qj r1 = r7.mo49getActivity()     // Catch: java.lang.Throwable -> L94
            boolean r0 = r1 instanceof X.C29S     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L8b
            r3 = r1
            X.29S r3 = (X.C29S) r3     // Catch: java.lang.Throwable -> L94
        L8b:
            X.C90903hW.LIZ(r3)     // Catch: java.lang.Throwable -> L94
        L8e:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L94
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L94
            goto L9c
        L94:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L9c:
            return r2
        L9d:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        La1:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.ui.common.BulletContainerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        InterfaceC60187Njj interfaceC60187Njj;
        o.LJIIJ(strArr, OHQ.LIZIZ);
        o.LJIIJ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (interfaceC60187Njj = this.LJLJI) != null) {
            interfaceC60187Njj.LJI(mo49getActivity, i, strArr, grantResults);
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    @Override // X.InterfaceC60057Nhd
    public final void t(Uri uri, Bundle bundle, InterfaceC60172NjU interfaceC60172NjU) {
        InterfaceC60187Njj interfaceC60187Njj;
        o.LJIIJ(uri, "uri");
        InterfaceC59504NWy interfaceC59504NWy = this.LJLJJL;
        if (interfaceC59504NWy != null && (interfaceC60187Njj = this.LJLJI) != null) {
            C60193Njp c60193Njp = this.LJLJL;
            if (c60193Njp != null) {
                InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
                if (interfaceC60179Njb != null) {
                    F3T providerFactory = c60193Njp.getProviderFactory();
                    providerFactory.getClass();
                    providerFactory.LJ(InterfaceC60179Njb.class, new F26(interfaceC60179Njb));
                }
                c60193Njp.LIZLLL(interfaceC59504NWy);
                c60193Njp.setActivityWrapper(interfaceC60187Njj);
                InterfaceC60179Njb interfaceC60179Njb2 = this.LJLJJI;
                if (interfaceC60179Njb2 != null) {
                    Context context = c60193Njp.getContext();
                    o.LJFF(context, "context");
                    interfaceC60179Njb2.M3(context);
                }
                c60193Njp.LJII(uri, bundle, null, interfaceC60172NjU);
                return;
            }
            o.LJIJI("bulletContainerView");
            throw null;
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIJ(viewComponents, "viewComponents");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        C39973FmT.LIZIZ(this, "fragment onLoadKitInstanceSuccess", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLJJI;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLIIL(viewComponents, uri, instance, z);
        }
    }

    @Override // X.InterfaceC60057Nhd
    public final void n8(View loadingView, int i, int i2, int i3, int i4, int i5) {
        o.LJIIJ(loadingView, "loadingView");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        loadingView.setLayoutParams(layoutParams);
        this.LJLJJLL = loadingView;
    }
}

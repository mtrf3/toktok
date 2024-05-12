package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.IDqS185S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Njp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60193Njp extends FrameLayout implements InterfaceC60057Nhd, InterfaceC60172NjU, InterfaceC39974FmU {
    public final C60194Njq LJLIL;
    public InterfaceC60172NjU LJLILLLLZI;
    public InterfaceC40516FvE LJLJI;
    public List<? extends C60213Nk9<? extends View>> LJLJJI;
    public boolean LJLJJL;
    public View LJLJJLL;
    public PthreadTimer LJLJL;
    public C60209Nk5 LJLJLJ;
    public long LJLJLLL;
    public View LJLL;
    public android.net.Uri LJLLI;
    public C59472NVs LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public C63081OpJ LJZ;
    public InterfaceC39975FmV LJZI;
    public final AtomicInteger LJZL;
    public long LL;
    public final C62822Ol8 LLD;
    public HashMap LLF;

    public C60193Njp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public View LIZ(int i) {
        if (this.LLF == null) {
            this.LLF = new HashMap();
        }
        View view = (View) this.LLF.get(Integer.valueOf(R.id.b0v));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.b0v);
        this.LLF.put(Integer.valueOf(R.id.b0v), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC39974FmU
    public C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LLD.getValue();
    }

    public void release() {
        C39973FmT.LIZIZ(this, "view release", null, null, 6);
        this.LJLIL.release();
        getProviderFactory().LIZJ(AbstractC60208Nk4.class);
        getProviderFactory().LJI(InterfaceC60187Njj.class);
        getProviderFactory().LJI(InterfaceC60259Nkt.class);
        getProviderFactory().LJI(AbstractC60208Nk4.class);
        KeyEvent.Callback callback = this.LJLJJLL;
        if (callback instanceof InterfaceC37788EsK) {
            if (callback != null) {
                ((InterfaceC37788EsK) callback).release();
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.model.IReleasable");
            }
        }
        KeyEvent.Callback callback2 = this.LJLL;
        if (callback2 instanceof InterfaceC37788EsK) {
            if (callback2 != null) {
                ((InterfaceC37788EsK) callback2).release();
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.model.IReleasable");
            }
        }
        this.LJLILLLLZI = null;
        this.LJLZ = true;
    }

    public final void LJIIL() {
        String str;
        if (this.LJLZ) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LL;
        int i = this.LJZL.get();
        if (i == EnumC60200Njw.SUCCESS.ordinal()) {
            str = "success";
        } else if (i == EnumC60200Njw.FAIL.ordinal()) {
            str = "failure";
        } else {
            str = "cancel";
        }
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) getProviderFactory().LIZJ(InterfaceC60276NlA.class);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_container_exit", null, null, 254);
            c60547NpX.LIZJ = (AbstractC60548NpY) getProviderFactory().LIZJ(AbstractC60548NpY.class);
            c60547NpX.LJI = C65232Piu.LIZJ("status", str);
            c60547NpX.LJII = Q7K.LIZLLL("stay_duration", currentTimeMillis);
            interfaceC60276NlA.LJ(c60547NpX);
        }
    }

    public F3T getProviderFactory() {
        F3T f3t = this.LJLIL.LJLJI;
        f3t.getClass();
        f3t.LJ(C60193Njp.class, new F26(this));
        return f3t;
    }

    public String getReactId() {
        F21 LLLLLLJ;
        String str;
        InterfaceC40516FvE interfaceC40516FvE = this.LJLJI;
        if (interfaceC40516FvE != null && (LLLLLLJ = interfaceC40516FvE.LLLLLLJ()) != null && (str = LLLLLLJ.LJLIL) != null) {
            return str;
        }
        return "";
    }

    public final void LJIIIZ() {
        android.net.Uri uri;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reLoadUri ");
        LIZ.append(this.LJLLI);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        if (this.LJZL.get() != EnumC60200Njw.LOADING.ordinal() && (uri = this.LJLLI) != null) {
            InterfaceC60172NjU interfaceC60172NjU = this.LJLILLLLZI;
            if (interfaceC60172NjU != null) {
                interfaceC60172NjU.LLLLL(uri);
            }
            List<? extends C60213Nk9<? extends View>> list = this.LJLJJI;
            if (list != null) {
                LJIIJ(new AqS176S0100000_10(this, 23), list);
            }
            LJIIIIZZ(this, uri);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIL();
        if (this.LJLLLLLL) {
            release();
        }
    }

    public void LIZLLL(InterfaceC59504NWy coreProvider) {
        o.LJIIJ(coreProvider, "coreProvider");
        this.LJLZ = false;
        this.LJLIL.LIZ(coreProvider);
        F3T LLIIIILZ = coreProvider.LIZ().LLIIIILZ();
        C60218NkE c60218NkE = (C60218NkE) LLIIIILZ.LIZJ(C60218NkE.class);
        if (c60218NkE != null) {
            this.LJZ = c60218NkE.LIZIZ;
            this.LJLLL = c60218NkE.LIZ;
        }
        InterfaceC39975FmV interfaceC39975FmV = (InterfaceC39975FmV) LLIIIILZ.LIZJ(InterfaceC39975FmV.class);
        if (interfaceC39975FmV != null) {
            this.LJZI = interfaceC39975FmV;
        }
    }

    public final void LJFF(InterfaceC59504NWy coreProvider) {
        o.LJIIJ(coreProvider, "coreProvider");
        LIZLLL(coreProvider);
    }

    public final void LJI(Bundle bundle) {
        String LJ;
        if (bundle == null || (LJ = bundle.getString("__x_session_id")) == null || LJ.length() == 0) {
            LJ = C77119UOl.LJ();
        }
        this.LJLLLL = LJ;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        C39973FmT.LIZIZ(this, "view onLoadStart", null, null, 6);
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        boolean z = true;
        long j = 0;
        if (queryParameter != null) {
            try {
                android.net.Uri parse = UriProtector.parse(queryParameter);
                if (parse != null) {
                    z = parse.getBooleanQueryParameter("show_loading", true);
                    String queryParameter2 = UriProtector.getQueryParameter(parse, "loading_duration");
                    if (queryParameter2 != null) {
                        j = CastLongProtector.parseLong(queryParameter2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.LJLLJ = false;
        LJ(j, z);
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        return this.LJLIL.a0(sessionId);
    }

    @Override // X.InterfaceC60057Nhd
    public void onEvent(F22 event) {
        o.LJIIJ(event, "event");
        InterfaceC40516FvE interfaceC40516FvE = this.LJLJI;
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.onEvent(event);
        }
    }

    public void setActivityWrapper(InterfaceC60187Njj activityWrapper) {
        o.LJIIJ(activityWrapper, "activityWrapper");
        getProviderFactory().LIZLLL(InterfaceC60187Njj.class, activityWrapper);
    }

    public final void setAutoReleasableWhenDetached(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setLoadingDelay(long j) {
        if (j >= 0) {
            this.LJLJLLL = j;
        }
    }

    public final void setLoadingViewInternal$bullet_ui_common_release(View loadingView) {
        o.LJIIJ(loadingView, "loadingView");
        View view = this.LJLJJLL;
        if (view != null) {
            C16880lQ.LL(this, view);
        }
        loadingView.setVisibility(0);
        addView(loadingView);
        this.LJLJJLL = loadingView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(C60193Njp c60193Njp, final android.net.Uri uri) {
        String str;
        InterfaceC60311Nlj<String, Object> LJII;
        String str2 = c60193Njp.LJLLLL;
        if (str2 != null && (LJII = C60373Nmj.LIZIZ().LJII(str2)) != null) {
            str = LJII.getString("__x_monitor_router_open_start_time");
        } else {
            str = null;
        }
        c60193Njp.LL = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            try {
                Long valueOf = Long.valueOf(CastLongProtector.parseLong(str));
                if (valueOf != null) {
                    c60193Njp.LL = valueOf.longValue();
                }
            } catch (Throwable unused) {
            }
        }
        o.LJIIJ(uri, "uri");
        C60204Nk0<C5RL> c60204Nk0 = C60206Nk2.LIZ;
        final long currentTimeMillis = System.currentTimeMillis();
        Object obj = new Object(uri, currentTimeMillis) { // from class: X.5RL
            public long LIZ;
            public Comparable LIZIZ;

            public final String toString() {
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(this.LIZ));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZIZ);
                LIZ.append(" [");
                LIZ.append(format);
                LIZ.append(']');
                return X1D.LIZIZ(LIZ);
            }

            {
                o.LJIIJ(uri, "uri");
                this.LIZIZ = uri;
                this.LIZ = currentTimeMillis;
            }
        };
        if (c60204Nk0.LIZ.size() >= 10) {
            c60204Nk0.LIZ.pop();
        }
        c60204Nk0.LIZ.add(obj);
        F3T f3t = new F3T();
        C60203Njz c60203Njz = new C60203Njz();
        c60203Njz.LIZ = c60193Njp.LJLLLL;
        c60203Njz.LIZIZ = Long.valueOf(c60193Njp.LL);
        f3t.LJ(C60203Njz.class, new F25(c60203Njz));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadUri: ");
        LIZ.append(uri);
        C39973FmT.LIZIZ(c60193Njp, X1D.LIZIZ(LIZ), null, null, 6);
        c60193Njp.LJZL.getAndSet(EnumC60200Njw.LOADING.ordinal());
        c60193Njp.LJLIL.LIZJ(uri, f3t, new AqS176S0100000_10(c60193Njp, 21), new AqS176S0100000_10(c60193Njp, 22), new IDqS185S0200000_10(uri, c60193Njp, 0), new AqS141S0200000_10(uri, c60193Njp, 5));
    }

    public static void LJIIJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60213Nk9 c60213Nk9 = (C60213Nk9) it.next();
            if (c60213Nk9 != null) {
                Object delegate = interfaceC88472Yns.invoke(c60213Nk9);
                o.LJIIJ(delegate, "delegate");
                c60213Nk9.LIZ.add(delegate);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.kit.ViewComponent<android.view.View>");
            }
        }
    }

    public final void LJ(long j, boolean z) {
        if (this.LJLJL == null && z && !this.LJLJJL) {
            this.LJLJL = new PthreadTimer("BulletContainerView");
            C60209Nk5 c60209Nk5 = this.LJLJLJ;
            if (c60209Nk5 != null) {
                c60209Nk5.cancel();
            }
            C60209Nk5 c60209Nk52 = new C60209Nk5(this, j);
            this.LJLJLJ = c60209Nk52;
            PthreadTimer pthreadTimer = this.LJLJL;
            if (pthreadTimer != null) {
                pthreadTimer.schedule(c60209Nk52, this.LJLJLLL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.Throwable r11, boolean r12) {
        /*
            r10 = this;
            X.F3T r1 = r10.getProviderFactory()
            java.lang.Class<X.Njz> r0 = X.C60203Njz.class
            java.lang.Object r0 = r1.LIZJ(r0)
            X.Njz r0 = (X.C60203Njz) r0
            r9 = 1
            r8 = 0
            if (r0 == 0) goto La9
            X.NkL r0 = r0.LIZJ
            if (r0 == 0) goto La6
            r0 = 1
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto La9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La9
            r6 = 1
        L22:
            X.F3T r1 = r10.getProviderFactory()
            java.lang.Class<X.Njz> r0 = X.C60203Njz.class
            java.lang.Object r0 = r1.LIZJ(r0)
            X.Njz r0 = (X.C60203Njz) r0
            if (r0 == 0) goto La4
            X.NkL r0 = r0.LIZJ
            if (r0 == 0) goto La4
            java.lang.String r3 = r0.LIZIZ
        L36:
            if (r12 == 0) goto La1
            java.lang.String r7 = "success"
        L3a:
            X.F3T r1 = r10.getProviderFactory()
            java.lang.Class<X.Njz> r0 = X.C60203Njz.class
            java.lang.Object r0 = r1.LIZJ(r0)
            X.Njz r0 = (X.C60203Njz) r0
            if (r0 == 0) goto L98
            java.lang.String r2 = r0.LJII
            if (r2 == 0) goto L98
        L4c:
            X.F3T r1 = r10.getProviderFactory()
            java.lang.Class<X.NlA> r0 = X.InterfaceC60276NlA.class
            java.lang.Object r5 = r1.LIZJ(r0)
            X.NlA r5 = (X.InterfaceC60276NlA) r5
            if (r5 == 0) goto L95
            X.NpX r4 = new X.NpX
            java.lang.String r1 = "bdx_monitor_container_load_url"
            r0 = 254(0xfe, float:3.56E-43)
            r4.<init>(r1, r8, r8, r0)
            X.F3T r1 = r10.getProviderFactory()
            java.lang.Class<X.NpY> r0 = X.AbstractC60548NpY.class
            java.lang.Object r0 = r1.LIZJ(r0)
            X.NpY r0 = (X.AbstractC60548NpY) r0
            r4.LIZJ = r0
            java.lang.String r1 = "status"
            java.lang.String r0 = "fail_reason"
            org.json.JSONObject r2 = X.C47135Ieh.LJ(r1, r7, r0, r2)
            java.lang.String r0 = "fallback"
            r2.put(r0, r6)
            android.view.View r0 = r10.LJLL
            if (r0 == 0) goto L96
        L82:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "has_error_view"
            r2.put(r0, r1)
            java.lang.String r0 = "fallback_reason"
            r2.put(r0, r3)
            r4.LJI = r2
            r5.LJ(r4)
        L95:
            return
        L96:
            r9 = 0
            goto L82
        L98:
            if (r11 == 0) goto L9f
            java.lang.String r2 = r11.getMessage()
            goto L4c
        L9f:
            r2 = r8
            goto L4c
        La1:
            java.lang.String r7 = "failure"
            goto L3a
        La4:
            r3 = r8
            goto L36
        La6:
            r0 = 0
            goto L15
        La9:
            r6 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60193Njp.LJIIJJI(java.lang.Throwable, boolean):void");
    }

    public final void LJIILIIL(View errorView, FrameLayout.LayoutParams layoutParams) {
        o.LJIIJ(errorView, "errorView");
        View view = this.LJLL;
        if (view != null) {
            C16880lQ.LL(this, view);
        }
        errorView.setLayoutParams(layoutParams);
        errorView.setVisibility(8);
        addView(errorView);
        this.LJLL = errorView;
    }

    public final void LJIILL(View loadingView, FrameLayout.LayoutParams layoutParams) {
        o.LJIIJ(loadingView, "loadingView");
        View view = this.LJLJJLL;
        if (view != null) {
            C16880lQ.LL(this, view);
        }
        loadingView.setLayoutParams(layoutParams);
        loadingView.setVisibility(8);
        addView(loadingView);
        this.LJLJJLL = loadingView;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        C59297NOz c59297NOz;
        Boolean value;
        o.LJIIJ(uri, "uri");
        o.LJIIJ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("view onLoadFail e: ");
        LIZ.append(e.getMessage());
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        this.LJZL.getAndSet(EnumC60200Njw.FAIL.ordinal());
        this.LJLLJ = true;
        C60209Nk5 c60209Nk5 = this.LJLJLJ;
        if (c60209Nk5 != null) {
            c60209Nk5.cancel();
        }
        PthreadTimer pthreadTimer = this.LJLJL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        KeyEvent.Callback callback = this.LJLJJLL;
        if (!(callback instanceof InterfaceC60207Nk3)) {
            callback = null;
        }
        InterfaceC60207Nk3 interfaceC60207Nk3 = (InterfaceC60207Nk3) callback;
        if (interfaceC60207Nk3 != null) {
            interfaceC60207Nk3.hide();
        }
        C59472NVs c59472NVs = this.LJLLILLLL;
        if (c59472NVs != null && (c59297NOz = c59472NVs.LJIIZILJ) != null && (value = c59297NOz.getValue()) != null && value.booleanValue()) {
            value.booleanValue();
            View view = this.LJLL;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        LJIIJJI(e, false);
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60193Njp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIJ(context, "context");
        this.LJLIL = new C60194Njq(context);
        this.LJLJLLL = 500L;
        this.LJLLL = "default_bid";
        try {
            C3C5.m7constructorimpl(C16880lQ.LLLZIIL(R.layout.um, C16880lQ.LLZIL(context), this));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        this.LJZL = new AtomicInteger(EnumC60200Njw.INIT.ordinal());
        this.LL = System.currentTimeMillis();
        this.LLD = C221108m2.LIZIZ(new AqS160S0100000_10(this, 39));
    }

    public final void LIZJ(android.net.Uri uri, Bundle bundle, InterfaceC60172NjU interfaceC60172NjU) {
        LLLLL(uri);
        this.LJLLI = uri;
        this.LJLILLLLZI = interfaceC60172NjU;
        if (interfaceC60172NjU != null) {
            interfaceC60172NjU.LLLLL(uri);
        }
        F3T providerFactory = getProviderFactory();
        C60173NjV c60173NjV = new C60173NjV(this, bundle);
        providerFactory.getClass();
        providerFactory.LJ(InterfaceC60259Nkt.class, new F25(c60173NjV));
        InterfaceC60260Nku interfaceC60260Nku = (InterfaceC60260Nku) C60373Nmj.LIZIZ().LIZJ(InterfaceC60260Nku.class, this.LJLLL);
        if (interfaceC60260Nku != null) {
            interfaceC60260Nku.LJIJJLI(uri);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIJ(view, "view");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("view onLoadUriSuccess kit: ");
        LIZ.append(instance.LLLIZZ());
        LIZ.append(" uri=");
        LIZ.append(uri);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        this.LJZL.getAndSet(EnumC60200Njw.SUCCESS.ordinal());
        this.LJLLJ = true;
        C60209Nk5 c60209Nk5 = this.LJLJLJ;
        if (c60209Nk5 != null) {
            c60209Nk5.cancel();
        }
        PthreadTimer pthreadTimer = this.LJLJL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        KeyEvent.Callback callback = this.LJLJJLL;
        if (!(callback instanceof InterfaceC60207Nk3)) {
            callback = null;
        }
        InterfaceC60207Nk3 interfaceC60207Nk3 = (InterfaceC60207Nk3) callback;
        if (interfaceC60207Nk3 != null) {
            interfaceC60207Nk3.hide();
        }
        View view2 = this.LJLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        LJIIJJI(null, true);
    }

    public void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        C59478NVy c59478NVy;
        C59439NUl c59439NUl;
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(param, "param");
        C39973FmT.LIZIZ(this, "view onLoadParamsSuccess", null, null, 6);
        if (!(param instanceof C59472NVs)) {
            param = null;
        }
        C59472NVs c59472NVs = (C59472NVs) param;
        if (c59472NVs != null) {
            C59473NVt.LIZJ(c59472NVs);
            C59473NVt.LIZIZ(c59472NVs);
            this.LJLLILLLL = c59472NVs;
            if (o.LJ(c59472NVs.LJIILLIIL.getValue(), Boolean.TRUE)) {
                this.LJLLJ = false;
                Boolean value = c59472NVs.LJIILLIIL.getValue();
                if (value != null) {
                    LJ(0L, value.booleanValue());
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                View view = this.LJLJJLL;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            C59472NVs c59472NVs2 = this.LJLLILLLL;
            if (c59472NVs2 != null && (c59478NVy = c59472NVs2.LJIILIIL) != null && (c59439NUl = (C59439NUl) c59478NVy.getValue()) != null && c59439NUl.LJLIL != -2) {
                setBackgroundColor(c59439NUl.LJLIL);
            }
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    public void t(android.net.Uri uri, Bundle bundle, InterfaceC60172NjU interfaceC60172NjU) {
        o.LJIIJ(uri, "uri");
        LJI(bundle);
        LIZJ(uri, bundle, interfaceC60172NjU);
        LJIIIIZZ(this, uri);
    }

    public /* synthetic */ C60193Njp(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void LJII(android.net.Uri uri, Bundle bundle, F3T f3t, InterfaceC60172NjU interfaceC60172NjU) {
        o.LJIIJ(uri, "uri");
        LJI(bundle);
        LIZJ(uri, bundle, interfaceC60172NjU);
        if (f3t != null) {
            getProviderFactory().LIZIZ(f3t);
        }
        LJIIIIZZ(this, uri);
    }

    public void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIJ(viewComponents, "viewComponents");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("view onLoadKitInstanceSuccess kit: ");
        LIZ.append(instance.LLLIZZ());
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        this.LJLJI = instance;
        this.LJLJJI = viewComponents;
        LJIIJ(new AqS141S0200000_10(this, instance, 4), viewComponents);
    }

    public void n8(View loadingView, int i, int i2, int i3, int i4, int i5) {
        o.LJIIJ(loadingView, "loadingView");
        View view = this.LJLJJLL;
        if (view != null) {
            C16880lQ.LL(this, view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        loadingView.setLayoutParams(layoutParams);
        loadingView.setVisibility(8);
        addView(loadingView);
        this.LJLJJLL = loadingView;
    }
}

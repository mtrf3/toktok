package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NjZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC60177NjZ extends AbstractActivityC60886Nv0 implements InterfaceC60172NjU, InterfaceC60285NlJ, InterfaceC59865NeX, InterfaceC39974FmU, InterfaceC60381Nmr {
    public F3T LJLJLLL;
    public android.net.Uri LJLL;
    public Bundle LJLLI;
    public String LJLLILLLL;
    public C60193Njp LJLLJ;
    public ViewGroup LJLLL;
    public View LJLLLL;
    public InterfaceC59899Nf5 LJLLLLLL;
    public InterfaceC60179Njb LJLZ;
    public Boolean LJZI;
    public boolean LJZL;
    public ImmersionBar LLFF;
    public HashMap LLFII;
    public final C60185Njh LJLJLJ = new C60185Njh(this);
    public C59472NVs LJZ = new C59472NVs();
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 40));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS160S0100000_10(this, 41));
    public final C60186Nji LLF = new C60186Nji();
    public int LLFFF = 1;

    @Override // X.InterfaceC60285NlJ
    public final void LJJIIJZLJL() {
    }

    @Override // X.InterfaceC60285NlJ
    public final void LJZ() {
    }

    public InterfaceC59899Nf5 LLII() {
        return null;
    }

    public View LLIIIILZ() {
        return null;
    }

    public void LLIIIJ(ViewGroup viewGroup, android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
    }

    public CharSequence LLIIIZ() {
        return "";
    }

    public View _$_findCachedViewById(int i) {
        if (this.LLFII == null) {
            this.LLFII = new HashMap();
        }
        View view = (View) this.LLFII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LLFII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC60381Nmr
    public final String getBid() {
        String str;
        C60218NkE c60218NkE = (C60218NkE) ((BulletContainerActivity) this).LLIIII.LIZ().LLIIIILZ().LIZJ(C60218NkE.class);
        if (c60218NkE != null && (str = c60218NkE.LIZ) != null) {
            return str;
        }
        return "default_bid";
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LL.getValue();
    }

    public final C60193Njp LLFII() {
        C60193Njp c60193Njp = this.LJLLJ;
        if (c60193Njp != null) {
            return c60193Njp;
        }
        o.LJIJI("bulletContainerView");
        throw null;
    }

    @Override // X.InterfaceC60381Nmr
    public final String getChannel() {
        InterfaceC60311Nlj<String, Object> LIZIZ;
        String string;
        String str = this.LJLLILLLL;
        if (str != null && (LIZIZ = C60373Nmj.LIZIZ().LIZIZ(str)) != null && (string = LIZIZ.getString("__x_param_channel")) != null) {
            return string;
        }
        return "";
    }

    @Override // X.InterfaceC60381Nmr
    public final android.net.Uri getSchema() {
        android.net.Uri uri = this.LJLL;
        if (uri == null) {
            return null;
        }
        return uri;
    }

    @Override // X.InterfaceC60381Nmr
    public final String k3() {
        InterfaceC60311Nlj<String, Object> LIZIZ;
        String string;
        String str = this.LJLLILLLL;
        if (str != null && (LIZIZ = C60373Nmj.LIZIZ().LIZIZ(str)) != null && (string = LIZIZ.getString("__x_param_bundle")) != null) {
            return string;
        }
        return "";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (o.LJ(this.LJZ.LJJIII.getValue(), Boolean.TRUE)) {
            onEvent(new C60182Nje(this));
        } else if (!this.LJLJLJ.LJIIL(this)) {
            super.onBackPressed();
        }
    }

    @Override // X.AbstractActivityC60886Nv0
    public void setStatusBarColor() {
        ImmersionBar immersionBar = this.LLFF;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        this.LLFF = null;
    }

    @Override // X.InterfaceC60381Nmr
    public final String zk() {
        C60193Njp c60193Njp = this.LJLLJ;
        if (c60193Njp != null) {
            return c60193Njp.getReactId();
        }
        o.LJIJI("bulletContainerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0251, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r11.LJZ.LJFF.getValue(), java.lang.Boolean.TRUE) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0241, code lost:
    
        if (r0.size() > 0) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLFZ() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractActivityC60177NjZ.LLFZ():void");
    }

    @Override // X.InterfaceC59865NeX
    public final void LLLLLIL() {
        int requestedOrientation = getRequestedOrientation();
        int i = this.LLFFF;
        if (requestedOrientation != i) {
            setRequestedOrientation(i);
        }
        getWindow().clearFlags(1024);
        LLFZ();
        Window window = getWindow();
        o.LJFF(window, "this.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.b0y);
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(viewGroup2, viewGroup);
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        EnumC60066Nhm enumC60066Nhm = (EnumC60066Nhm) this.LJZ.LJIILL.getValue();
        if (enumC60066Nhm == null) {
            return;
        }
        int i = C60065Nhl.LIZIZ[enumC60066Nhm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            super.overridePendingTransition(0, R.anim.ay);
            return;
        }
        super.overridePendingTransition(0, R.anim.aw);
    }

    @Override // X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        Object LIZ;
        EnumC46537IOf enumC46537IOf;
        InterfaceC60184Njg interfaceC60184Njg;
        super.onDestroy();
        C60380Nmq c60380Nmq = (C60380Nmq) C60380Nmq.LIZJ.getValue();
        c60380Nmq.getClass();
        try {
            LIZ = Boolean.valueOf(((ArrayList) c60380Nmq.LIZ).remove(this));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remove item failed: ");
            LIZ2.append(this);
            X1D.LIZIZ(LIZ2);
        }
        ImmersionBar immersionBar = this.LLFF;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        C60186Nji c60186Nji = this.LLF;
        c60186Nji.getClass();
        ViewTreeObserverOnGlobalLayoutListenerC60181Njd viewTreeObserverOnGlobalLayoutListenerC60181Njd = c60186Nji.LIZIZ;
        if (viewTreeObserverOnGlobalLayoutListenerC60181Njd != null) {
            Window window = getWindow();
            o.LJFF(window, "hostActivity.window");
            View decorView = window.getDecorView();
            o.LJFF(decorView, "hostActivity.window.decorView");
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC60181Njd);
        }
        this.LJLJLJ.LIZJ(this);
        if (this.LJLLJ != null) {
            if (this.LJZL && (interfaceC60184Njg = (InterfaceC60184Njg) this.LLD.getValue()) != null) {
                android.net.Uri uri = this.LJLL;
                if (uri != null) {
                    C60193Njp c60193Njp = this.LJLLJ;
                    if (c60193Njp != null) {
                        enumC46537IOf = interfaceC60184Njg.LJIL(uri, c60193Njp);
                    } else {
                        o.LJIJI("bulletContainerView");
                        throw null;
                    }
                } else {
                    o.LJIJI("uri");
                    throw null;
                }
            } else {
                enumC46537IOf = null;
            }
            if (enumC46537IOf != EnumC46537IOf.SUCCESS) {
                C60193Njp c60193Njp2 = this.LJLLJ;
                if (c60193Njp2 != null) {
                    c60193Njp2.LJIIL();
                    C60193Njp c60193Njp3 = this.LJLLJ;
                    if (c60193Njp3 != null) {
                        c60193Njp3.release();
                        return;
                    } else {
                        o.LJIJI("bulletContainerView");
                        throw null;
                    }
                }
                o.LJIJI("bulletContainerView");
                throw null;
            }
        }
    }

    @Override // X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        super.onPause();
        this.LJLJLJ.LIZIZ(this);
    }

    @Override // X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        this.LJLJLJ.LIZLLL(this);
        LLFZ();
    }

    @Override // X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        super.onStart();
        this.LJLJLJ.LJII(this);
    }

    @Override // X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        super.onStop();
        this.LJLJLJ.LJ(this);
    }

    @Override // X.InterfaceC60381Nmr
    public final void close() {
        finish();
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        InterfaceC60179Njb interfaceC60179Njb = this.LJLZ;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLLLL(uri);
        }
    }

    @Override // X.InterfaceC59865NeX
    public void enterFullScreen(View view) {
        o.LJIIJ(view, "view");
        this.LLFFF = getRequestedOrientation();
        setRequestedOrientation(11);
        C60592NqG.LIZIZ(this);
        Window window = getWindow();
        o.LJFF(window, "this.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.b0y);
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(this);
                viewGroup2.setId(R.id.b0y);
                viewGroup.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup2.setVisibility(0);
            viewGroup2.addView(view, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        o.LJIIJ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.LJLJLJ.onConfigurationChanged(this, newConfig);
    }

    @Override // X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        Object LIZ;
        String str2;
        boolean LJ;
        String str3;
        InterfaceC60179Njb interfaceC60179Njb;
        F3T LLIIIILZ;
        NX1 nx1;
        AqS176S0100000_10 LIZ2;
        InterfaceC60179Njb interfaceC60179Njb2;
        F3T LLIIIILZ2;
        NX1 nx12;
        AqS176S0100000_10 LIZ3;
        android.net.Uri data;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            this.LJLL = data;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle2 = C16880lQ.LLJJIJI(intent2);
        } else {
            bundle2 = null;
        }
        this.LJLLI = bundle2;
        if (bundle2 != null) {
            str = bundle2.getString("__x_session_id");
        } else {
            str = null;
        }
        this.LJLLILLLL = str;
        if (this.LJLL == null) {
            finish();
            return;
        }
        supportRequestWindowFeature(10);
        InterfaceC60196Njs LIZ4 = ((BulletContainerActivity) this).LLIIII.LIZ();
        if (!(LIZ4 instanceof C60219NkF)) {
            LIZ4 = null;
        }
        C60219NkF c60219NkF = (C60219NkF) LIZ4;
        if (c60219NkF != null) {
            Boolean bool = this.LJZI;
            if (bool != null) {
                LJ = bool.booleanValue();
            } else {
                Bundle bundle3 = this.LJLLI;
                if (bundle3 != null) {
                    str2 = bundle3.getString("prerender");
                } else {
                    str2 = null;
                }
                LJ = o.LJ(str2, "1");
            }
            this.LJZI = Boolean.valueOf(LJ);
            Bundle bundle4 = this.LJLLI;
            if (bundle4 != null) {
                str3 = bundle4.getString("reuse");
            } else {
                str3 = null;
            }
            this.LJZL = o.LJ(str3, "1");
            C59476NVw c59476NVw = new C59476NVw();
            android.net.Uri uri = this.LJLL;
            if (uri != null) {
                c59476NVw.LIZJ(android.net.Uri.class, uri, null);
                List list = (List) c59476NVw.LIZJ.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC60247Nkh interfaceC60247Nkh = c60219NkF.LJLL.get(it.next());
                        if (interfaceC60247Nkh == null || (LLIIIILZ2 = interfaceC60247Nkh.LLIIIILZ()) == null || (nx12 = (NX1) LLIIIILZ2.LIZJ(NX1.class)) == null || (LIZ3 = nx12.LIZ()) == null || (interfaceC60179Njb2 = (InterfaceC60179Njb) LIZ3.invoke(c60219NkF.LJLJJL)) == null) {
                            interfaceC60179Njb2 = this.LJLZ;
                        }
                        this.LJLZ = interfaceC60179Njb2;
                    }
                }
                if (this.LJLZ == null) {
                    InterfaceC60247Nkh interfaceC60247Nkh2 = c60219NkF.LJLJLLL;
                    if (interfaceC60247Nkh2 != null && (LLIIIILZ = interfaceC60247Nkh2.LLIIIILZ()) != null && (nx1 = (NX1) LLIIIILZ.LIZJ(NX1.class)) != null && (LIZ2 = nx1.LIZ()) != null) {
                        interfaceC60179Njb = (InterfaceC60179Njb) LIZ2.invoke(c60219NkF.LJLJJL);
                    } else {
                        interfaceC60179Njb = null;
                    }
                    this.LJLZ = interfaceC60179Njb;
                }
            } else {
                o.LJIJI("uri");
                throw null;
            }
        }
        InterfaceC60179Njb interfaceC60179Njb3 = this.LJLZ;
        boolean z = false;
        if (interfaceC60179Njb3 != null) {
            ViewGroup J0 = interfaceC60179Njb3.J0(this);
            setContentView(J0);
            this.LJLLJ = new C60193Njp(this, null, 6, 0);
            this.LJLLL = J0;
            ViewGroup Ic = interfaceC60179Njb3.Ic();
            C60193Njp c60193Njp = this.LJLLJ;
            if (c60193Njp != null) {
                Ic.addView(c60193Njp);
                this.LJLJLJ.LIZ(interfaceC60179Njb3.Ug());
            } else {
                o.LJIJI("bulletContainerView");
                throw null;
            }
        }
        if (this.LJLZ == null) {
            setContentView(R.layout.ul);
            C60193Njp bullet_container_view = (C60193Njp) _$_findCachedViewById(R.id.b0x);
            o.LJFF(bullet_container_view, "bullet_container_view");
            this.LJLLJ = bullet_container_view;
            ViewGroup root_layout = (ViewGroup) _$_findCachedViewById(R.id.j7n);
            o.LJFF(root_layout, "root_layout");
            this.LJLLL = root_layout;
        }
        C60193Njp c60193Njp2 = this.LJLLJ;
        if (c60193Njp2 == null) {
            C39973FmT.LIZIZ(this, "Load uri failed: bulletContainerView has not been initialized, finish bullet activity", EnumC39958FmE.E, null, 4);
            finish();
        } else {
            AqS192S0100000_10 aqS192S0100000_10 = new AqS192S0100000_10(this, 4);
            InterfaceC60184Njg interfaceC60184Njg = (InterfaceC60184Njg) this.LLD.getValue();
            if (interfaceC60184Njg != null) {
                android.net.Uri uri2 = this.LJLL;
                if (uri2 != null) {
                    Boolean bool2 = this.LJZI;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    }
                    C30897CAr LJJIIZ = interfaceC60184Njg.LJJIIZ(uri2, z, this.LJZL, c60193Njp2);
                    if (LJJIIZ != null) {
                        View view = LJJIIZ.LJLJI;
                        if (view != null) {
                            aqS192S0100000_10.invoke(view, LJJIIZ.LJLJJI);
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
                        }
                    }
                } else {
                    o.LJIJI("uri");
                    throw null;
                }
            }
            aqS192S0100000_10.invoke(c60193Njp2, EnumC53636L3g.NONE);
        }
        this.LJLJLJ.LJFF(this, bundle);
        C60380Nmq c60380Nmq = (C60380Nmq) C60380Nmq.LIZJ.getValue();
        c60380Nmq.getClass();
        try {
            LIZ = Boolean.valueOf(((ArrayList) c60380Nmq.LIZ).add(this));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("add item failed: ");
            LIZ5.append(this);
            X1D.LIZIZ(LIZ5);
        }
    }

    public final void onEvent(F22 event) {
        o.LJIIJ(event, "event");
        C60193Njp c60193Njp = this.LJLLJ;
        if (c60193Njp != null) {
            c60193Njp.onEvent(event);
        } else {
            o.LJIJI("bulletContainerView");
            throw null;
        }
    }

    @Override // X.AbstractActivityC60886Nv0, android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIJ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.LJLJLJ.LJIIIIZZ(this, savedInstanceState);
    }

    @Override // X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIJ(outState, "outState");
        super.onSaveInstanceState(outState);
        this.LJLJLJ.LJIIIZ(this, outState);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.LJLJLJ.LJIILIIL(this, z);
    }

    @Override // X.InterfaceC60172NjU
    public void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activity onLoadFail e: ");
        LIZ.append(e.getMessage());
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLZ;
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
    public void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIJ(view, "view");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        Object obj = null;
        C39973FmT.LIZIZ(this, "activity onLoadUriSuccess", null, null, 6);
        InterfaceC60179Njb interfaceC60179Njb = this.LJLZ;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLLII(view, uri, instance);
        }
        if (o.LJ(this.LJZ.LJIJ.getValue(), Boolean.TRUE)) {
            C60193Njp c60193Njp = this.LJLLJ;
            if (c60193Njp == null) {
                C39973FmT.LIZIZ(this, "show soft key board failed! bullet container view hasn't been initialized!", null, null, 6);
                return;
            }
            this.LLF.getClass();
            c60193Njp.requestFocus();
            Object LLILL = C16880lQ.LLILL(c60193Njp.getContext(), "input_method");
            if (LLILL instanceof InputMethodManager) {
                obj = LLILL;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            if (inputMethodManager != null) {
                inputMethodManager.toggleSoftInput(0, 2);
            }
        }
    }

    @Override // X.InterfaceC60172NjU
    public void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(param, "param");
        if (param instanceof C59472NVs) {
            C59472NVs c59472NVs = (C59472NVs) param;
            this.LJZ = c59472NVs;
            C59473NVt.LIZJ(c59472NVs);
            C59473NVt.LIZIZ(this.LJZ);
            Boolean value = this.LJZ.LJJIJIIJIL.getValue();
            Boolean bool = Boolean.TRUE;
            if (o.LJ(value, bool)) {
                super.overridePendingTransition(R.anim.ax, 0);
            }
            if (o.LJ(this.LJZ.LJIL.getValue(), bool)) {
                getWindow().setSoftInputMode(32);
            }
            C59439NUl c59439NUl = (C59439NUl) this.LJZ.LJIILIIL.getValue();
            if (c59439NUl != null) {
                Integer valueOf = Integer.valueOf(c59439NUl.LJLIL);
                if (valueOf.intValue() != -2) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup = this.LJLLL;
                    if (viewGroup != null) {
                        viewGroup.setBackgroundColor(intValue);
                    } else {
                        o.LJIJI("rootLayout");
                        throw null;
                    }
                }
            }
            C59439NUl c59439NUl2 = (C59439NUl) this.LJZ.LJIILJJIL.getValue();
            if (c59439NUl2 != null) {
                Integer valueOf2 = Integer.valueOf(c59439NUl2.LJLIL);
                if (valueOf2.intValue() != -2) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup2 = this.LJLLL;
                    if (viewGroup2 != null) {
                        viewGroup2.setBackgroundColor(intValue2);
                    } else {
                        o.LJIJI("rootLayout");
                        throw null;
                    }
                }
            }
            if (this.LJLZ == null) {
                if (o.LJ(this.LJZ.LJ.getValue(), bool)) {
                    View title_bar_container = _$_findCachedViewById(R.id.l_7);
                    o.LJFF(title_bar_container, "title_bar_container");
                    title_bar_container.setVisibility(8);
                } else {
                    if (this.LJLLLL == null) {
                        ViewGroup title_bar_container2 = (ViewGroup) _$_findCachedViewById(R.id.l_7);
                        o.LJFF(title_bar_container2, "title_bar_container");
                        android.net.Uri uri2 = this.LJLL;
                        if (uri2 != null) {
                            LLIIIJ(title_bar_container2, uri2);
                            this.LJLLLL = null;
                        } else {
                            o.LJIJI("uri");
                            throw null;
                        }
                    }
                    if (this.LJLLLL == null) {
                        InterfaceC59899Nf5 LLII = LLII();
                        this.LJLLLLLL = LLII;
                        if (LLII == null) {
                            L93 l93 = new L93(this);
                            C59472NVs c59472NVs2 = this.LJZ;
                            if (c59472NVs2 != null) {
                                C59439NUl c59439NUl3 = (C59439NUl) c59472NVs2.LJI.getValue();
                                if (c59439NUl3 != null && c59439NUl3.LJLIL != -2) {
                                    l93.LIZ(R.id.law).setBackgroundColor(c59439NUl3.LJLIL);
                                }
                                TextView tv_title = (TextView) l93.LIZ(R.id.mo6);
                                o.LJFF(tv_title, "tv_title");
                                String str = (String) c59472NVs2.LJIIIZ.getValue();
                                if (str == null) {
                                    str = "";
                                }
                                tv_title.setText(str);
                                C59439NUl c59439NUl4 = (C59439NUl) c59472NVs2.LJIIJ.getValue();
                                if (c59439NUl4 != null && c59439NUl4.LJLIL != -2) {
                                    ((TextView) l93.LIZ(R.id.mo6)).setTextColor(c59439NUl4.LJLIL);
                                    C116444hc c116444hc = (C116444hc) l93.LIZ(R.id.eys);
                                    Context context = l93.getContext();
                                    o.LJFF(context, "context");
                                    Resources resources = context.getResources();
                                    Context context2 = l93.getContext();
                                    o.LJFF(context2, "context");
                                    C40681ii LIZ = C40681ii.LIZ(resources, R.drawable.b52, context2.getTheme());
                                    if (LIZ != null) {
                                        LIZ.setTint(c59439NUl4.LJLIL);
                                    } else {
                                        LIZ = null;
                                    }
                                    c116444hc.setImageDrawable(LIZ);
                                }
                                if (o.LJ(c59472NVs2.LJIJJLI.getValue(), bool)) {
                                    ImageView iv_close_all = (ImageView) l93.LIZ(R.id.f0i);
                                    o.LJFF(iv_close_all, "iv_close_all");
                                    iv_close_all.setVisibility(0);
                                }
                            }
                            l93.setTitleIfMissing(LLIIIZ());
                            l93.setBackListener(new ACListenerS30S0100000_10(this, 12));
                            l93.setCloseAllListener(new ACListenerS30S0100000_10(this, 13));
                            this.LJLLLL = l93;
                            ((ViewGroup) _$_findCachedViewById(R.id.l_7)).addView(this.LJLLLL, -1, -2);
                        } else {
                            ViewGroup viewGroup3 = (ViewGroup) _$_findCachedViewById(R.id.l_7);
                            android.net.Uri uri3 = this.LJLL;
                            if (uri3 != null) {
                                viewGroup3.addView(LLII.LIZJ(this, uri3, this.LJZ), -1, -2);
                                LLII.setDefaultTitle(LLIIIZ());
                                LLII.LIZ(new ACListenerS30S0100000_10(this, 14));
                                LLII.LIZIZ(new ACListenerS30S0100000_10(this, 15));
                                F3T f3t = this.LJLJLLL;
                                if (f3t != null) {
                                    f3t.LJ(InterfaceC59899Nf5.class, new F25(this.LJLLLLLL));
                                }
                            } else {
                                o.LJIJI("uri");
                                throw null;
                            }
                        }
                    } else {
                        ViewGroup title_bar_container3 = (ViewGroup) _$_findCachedViewById(R.id.l_7);
                        o.LJFF(title_bar_container3, "title_bar_container");
                        if (title_bar_container3.getChildCount() == 0) {
                            ((ViewGroup) _$_findCachedViewById(R.id.l_7)).addView(this.LJLLLL, -1, -2);
                        }
                    }
                    View title_bar_container4 = _$_findCachedViewById(R.id.l_7);
                    o.LJFF(title_bar_container4, "title_bar_container");
                    title_bar_container4.setVisibility(0);
                }
            }
            LLFZ();
        }
        InterfaceC60179Njb interfaceC60179Njb = this.LJLZ;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.gk(instance, uri, param);
        }
    }

    @Override // X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.LJLJLJ.LJIIJ(this, i, i2, intent);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIJ(strArr, OHQ.LIZIZ);
        o.LJIIJ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        this.LJLJLJ.LJI(this, i, strArr, grantResults);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    @Override // X.InterfaceC60172NjU
    public void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        Boolean bool;
        C60218NkE c60218NkE;
        o.LJIIJ(viewComponents, "viewComponents");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        C39973FmT.LIZIZ(this, "activity onLoadKitInstanceSuccess", null, null, 6);
        if (instance.LLLIZZ() == F0S.LYNX) {
            F3T f3t = this.LJLJLLL;
            if (f3t != null && (c60218NkE = (C60218NkE) f3t.LIZJ(C60218NkE.class)) != null && c60218NkE.LIZIZ != null) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            View view = this.LJLLLL;
            if (!(view instanceof L93)) {
                view = null;
            }
            L93 l93 = (L93) view;
            if (l93 != null) {
                if (o.LJ(bool, Boolean.TRUE)) {
                    l93.setEnableReFresh(true);
                } else {
                    l93.setEnableReFresh(false);
                }
                l93.setRefreshListener(new ACListenerS30S0100000_10(this, 11));
            }
        }
        InterfaceC60179Njb interfaceC60179Njb = this.LJLZ;
        if (interfaceC60179Njb != null) {
            interfaceC60179Njb.LLIIL(viewComponents, uri, instance, z);
        }
        if (instance.LLLIZZ() == F0S.WEB) {
            boolean LJ = o.LJ(this.LJZ.LJJ.getValue(), Boolean.TRUE);
            C60186Nji c60186Nji = this.LLF;
            ViewGroup viewGroup = this.LJLLL;
            if (viewGroup != null) {
                c60186Nji.getClass();
                Window window = getWindow();
                o.LJFF(window, "hostActivity.window");
                View decorView = window.getDecorView();
                o.LJFF(decorView, "hostActivity.window.decorView");
                Rect rect = new Rect();
                if (c60186Nji.LIZIZ != null) {
                    decorView.getViewTreeObserver().removeOnGlobalLayoutListener(c60186Nji.LIZIZ);
                }
                c60186Nji.LIZIZ = new ViewTreeObserverOnGlobalLayoutListenerC60181Njd(c60186Nji, decorView, rect, LJ ? 1 : 0, viewGroup);
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(c60186Nji.LIZIZ);
                return;
            }
            o.LJIJI("rootLayout");
            throw null;
        }
    }
}
